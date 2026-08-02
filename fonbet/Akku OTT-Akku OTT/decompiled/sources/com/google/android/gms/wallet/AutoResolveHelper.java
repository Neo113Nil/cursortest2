package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.C0860b;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class AutoResolveHelper {
    public static final int RESULT_ERROR = 1;
    private static final long zzb = TimeUnit.MINUTES.toMillis(10);

    @VisibleForTesting
    static final long zza = SystemClock.elapsedRealtime();

    private AutoResolveHelper() {
    }

    @Nullable
    public static Status getStatusFromIntent(@Nullable Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void putStatusIntoIntent(@NonNull Intent intent, @Nullable Status status) {
        if (status == null) {
            intent.removeExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
        } else {
            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", status);
        }
    }

    @MainThread
    @Deprecated
    public static <TResult extends AutoResolvableResult> void resolveTask(@NonNull Task<TResult> task, @NonNull Activity activity, int i) {
        zzc zza2 = zzc.zza(task);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i2 = zza2.zzc;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i2);
        bundle.putInt("requestCode", i);
        bundle.putLong("initializationElapsedRealtime", zza);
        zzd zzdVar = new zzd();
        zzdVar.setArguments(bundle);
        beginTransaction.add(zzdVar, "com.google.android.gms.wallet.AutoResolveHelper" + zza2.zzc).commit();
    }

    public static void zzd(@NonNull Status status, @Nullable Object obj, @NonNull TaskCompletionSource taskCompletionSource) {
        if (status.l()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(C0860b.a(status));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zze(Activity activity, int i, int i2, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i, intent, 1073741824);
        if (createPendingResult == null) {
            Log.isLoggable("AutoResolveHelper", 5);
            return;
        }
        try {
            createPendingResult.send(i2);
        } catch (PendingIntent.CanceledException unused) {
            Log.isLoggable("AutoResolveHelper", 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzf(Activity activity, int i, Task task) {
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        if (activity.isFinishing()) {
            Log.isLoggable("AutoResolveHelper", 3);
            return;
        }
        Exception exception = task.getException();
        int i2 = 1;
        Bundle bundle = null;
        if (!(exception instanceof k)) {
            Intent intent = new Intent();
            if (task.isSuccessful()) {
                ((AutoResolvableResult) task.getResult()).putIntoIntent(intent);
                i2 = -1;
            } else if (exception instanceof b) {
                b bVar = (b) exception;
                putStatusIntoIntent(intent, new Status(bVar.getStatusCode(), bVar.getMessage(), null, null));
            } else {
                Log.isLoggable("AutoResolveHelper", 6);
                putStatusIntoIntent(intent, new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!", null, null));
            }
            zze(activity, i, i2, intent);
            return;
        }
        try {
            Status status = ((k) exception).getStatus();
            if (status.c == null) {
                i2 = 0;
            }
            if (i2 == 0) {
                return;
            }
            if (PlatformVersion.isAtLeastU()) {
                pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                bundle = pendingIntentBackgroundActivityStartMode.toBundle();
            }
            PendingIntent pendingIntent = status.c;
            C0875q.g(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0, bundle);
        } catch (IntentSender.SendIntentException unused) {
            Log.isLoggable("AutoResolveHelper", 6);
        }
    }
}
