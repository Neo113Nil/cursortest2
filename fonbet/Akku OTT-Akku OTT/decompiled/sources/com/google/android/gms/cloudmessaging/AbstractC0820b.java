package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.Constants;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.cloudmessaging.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0820b extends BroadcastReceiver {

    @Nullable
    private static SoftReference zza;

    @Nullable
    private static SoftReference zzb;

    @WorkerThread
    private final int zzb(@NonNull Context context, @NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (!Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            return 500;
        }
        onNotificationDismissed(context, extras);
        return -1;
    }

    @NonNull
    public Executor getBroadcastExecutor() {
        ExecutorService executorService;
        synchronized (AbstractC0820b.class) {
            try {
                SoftReference softReference = zza;
                executorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService == null) {
                    zze.zza();
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new NamedThreadFactory("firebase-iid-executor")));
                    zza = new SoftReference(executorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    @WorkerThread
    public abstract int onMessageReceive(@NonNull Context context, @NonNull C0819a c0819a);

    @WorkerThread
    public void onNotificationDismissed(@NonNull Context context, @NonNull Bundle bundle) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull final Context context, @NonNull final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        getBroadcastExecutor().execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.p
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0820b.this.zza(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }

    public final /* synthetic */ void zza(Intent intent, final Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        Executor executor;
        int i;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                i = zzb(context, intent2);
            } else if (intent.getExtras() == null) {
                i = 500;
            } else {
                final C0819a c0819a = new C0819a(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (AbstractC0820b.class) {
                    try {
                        SoftReference softReference = zzb;
                        executor = softReference != null ? (Executor) softReference.get() : null;
                        if (executor == null) {
                            zze.zza();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            zzb = new SoftReference(executor);
                        }
                    } finally {
                    }
                }
                executor.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2;
                        Task b;
                        C0819a c0819a2 = c0819a;
                        Intent intent3 = c0819a2.a;
                        String stringExtra = intent3.getStringExtra(Constants.MessagePayloadKeys.MSGID);
                        if (stringExtra == null) {
                            stringExtra = intent3.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER);
                        }
                        if (TextUtils.isEmpty(stringExtra)) {
                            b = Tasks.forResult(null);
                        } else {
                            Bundle bundle = new Bundle();
                            Intent intent4 = c0819a2.a;
                            String stringExtra2 = intent4.getStringExtra(Constants.MessagePayloadKeys.MSGID);
                            if (stringExtra2 == null) {
                                stringExtra2 = intent4.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER);
                            }
                            bundle.putString(Constants.MessagePayloadKeys.MSGID, stringExtra2);
                            Intent intent5 = c0819a2.a;
                            Integer valueOf = intent5.hasExtra(Constants.MessagePayloadKeys.PRODUCT_ID) ? Integer.valueOf(intent5.getIntExtra(Constants.MessagePayloadKeys.PRODUCT_ID, 0)) : null;
                            if (valueOf != null) {
                                bundle.putInt(Constants.MessagePayloadKeys.PRODUCT_ID, valueOf.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            C a = C.a(context2);
                            synchronized (a) {
                                i2 = a.d;
                                a.d = i2 + 1;
                            }
                            b = a.b(new y(i2, 2, bundle));
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        b.addOnCompleteListener(m.a, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.n
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int onMessageReceive = onMessageReceive(context, c0819a);
                try {
                    countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    "Message ack failed: ".concat(e.toString());
                }
                i = onMessageReceive;
            }
            if (z && pendingResult != null) {
                pendingResult.setResultCode(i);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }
}
