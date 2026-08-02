package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.zzap;
import com.google.firebase.iid.zzv;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends com.google.firebase.iid.zzb {
    private static final Queue<String> zzdo = new ArrayDeque(10);

    static void zzj(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next != null && next.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    static boolean zzk(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    @WorkerThread
    public void onDeletedMessages() {
    }

    @WorkerThread
    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    @WorkerThread
    public void onMessageSent(String str) {
    }

    @WorkerThread
    public void onSendError(String str, Exception exc) {
    }

    @Override // com.google.firebase.iid.zzb
    protected final Intent zzb(Intent intent) {
        return zzap.zzac().zzad();
    }

    @Override // com.google.firebase.iid.zzb
    public final boolean zzc(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!zzk(intent.getExtras())) {
            return true;
        }
        zzb.zzd(this, intent);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f3, code lost:
    
        if (r0.equals("send_event") == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157  */
    @Override // com.google.firebase.iid.zzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(Intent intent) {
        char c;
        Task<Void> zza;
        boolean z;
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        int hashCode = action.hashCode();
        if (hashCode != 75300319) {
            if (hashCode == 366519424 && action.equals("com.google.android.c2dm.intent.RECEIVE")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                String stringExtra = intent.getStringExtra("google.message_id");
                char c2 = 2;
                if (TextUtils.isEmpty(stringExtra)) {
                    zza = Tasks.forResult(null);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("google.message_id", stringExtra);
                    zza = zzv.zzc(this).zza(2, bundle);
                }
                try {
                    if (!TextUtils.isEmpty(stringExtra)) {
                        if (zzdo.contains(stringExtra)) {
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                String valueOf = String.valueOf(stringExtra);
                                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Received duplicate message: ".concat(valueOf) : new String("Received duplicate message: "));
                            }
                            z = true;
                            if (!z) {
                                String stringExtra2 = intent.getStringExtra("message_type");
                                if (stringExtra2 == null) {
                                    stringExtra2 = "gcm";
                                }
                                int hashCode2 = stringExtra2.hashCode();
                                if (hashCode2 == -2062414158) {
                                    if (stringExtra2.equals("deleted_messages")) {
                                        c2 = 1;
                                        switch (c2) {
                                        }
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                                } else if (hashCode2 == 102161) {
                                    if (stringExtra2.equals("gcm")) {
                                        c2 = 0;
                                        switch (c2) {
                                        }
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                                } else if (hashCode2 != 814694033) {
                                    if (hashCode2 == 814800675) {
                                        break;
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                        case 0:
                                            if (zzk(intent.getExtras())) {
                                                zzb.zzc(this, intent);
                                            }
                                            Bundle extras = intent.getExtras();
                                            if (extras == null) {
                                                extras = new Bundle();
                                            }
                                            extras.remove("android.support.content.wakelockid");
                                            if (zza.zzf(extras)) {
                                                if (!zza.zzd(this).zzh(extras)) {
                                                    if (zzk(extras)) {
                                                        zzb.zzf(this, intent);
                                                    }
                                                }
                                            }
                                            onMessageReceived(new RemoteMessage(extras));
                                            break;
                                        case 1:
                                            onDeletedMessages();
                                            break;
                                        case 2:
                                            onMessageSent(intent.getStringExtra("google.message_id"));
                                            break;
                                        case 3:
                                            String stringExtra3 = intent.getStringExtra("google.message_id");
                                            if (stringExtra3 == null) {
                                                stringExtra3 = intent.getStringExtra("message_id");
                                            }
                                            onSendError(stringExtra3, new SendException(intent.getStringExtra("error")));
                                            break;
                                        default:
                                            String valueOf2 = String.valueOf(stringExtra2);
                                            Log.w("FirebaseMessaging", valueOf2.length() != 0 ? "Received message with unknown type: ".concat(valueOf2) : new String("Received message with unknown type: "));
                                            break;
                                    }
                                } else {
                                    if (stringExtra2.equals("send_error")) {
                                        c2 = 3;
                                        switch (c2) {
                                        }
                                    }
                                    c2 = 65535;
                                    switch (c2) {
                                    }
                                }
                            }
                            Tasks.await(zza, 1L, TimeUnit.SECONDS);
                            break;
                        } else {
                            if (zzdo.size() >= 10) {
                                zzdo.remove();
                            }
                            zzdo.add(stringExtra);
                        }
                    }
                    Tasks.await(zza, 1L, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    String valueOf3 = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 20);
                    sb.append("Message ack failed: ");
                    sb.append(valueOf3);
                    Log.w("FirebaseMessaging", sb.toString());
                    return;
                }
                z = false;
                if (!z) {
                }
            case 1:
                if (zzk(intent.getExtras())) {
                    zzb.zze(this, intent);
                    break;
                }
                break;
            default:
                String valueOf4 = String.valueOf(intent.getAction());
                Log.d("FirebaseMessaging", valueOf4.length() != 0 ? "Unknown intent action: ".concat(valueOf4) : new String("Unknown intent action: "));
                break;
        }
    }
}
