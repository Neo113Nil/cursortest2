package com.google.firebase.iid;

import android.support.annotation.GuardedBy;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
final class zzau {

    @GuardedBy("itself")
    private final zzaq zzaj;

    @GuardedBy("this")
    private int zzdf = 0;

    @GuardedBy("this")
    private final Map<Integer, TaskCompletionSource<Void>> zzdg = new ArrayMap();

    zzau(zzaq zzaqVar) {
        this.zzaj = zzaqVar;
    }

    @WorkerThread
    private static boolean zza(FirebaseInstanceId firebaseInstanceId, String str) {
        String str2;
        String str3;
        String[] split = str.split("!");
        if (split.length == 2) {
            String str4 = split[0];
            String str5 = split[1];
            char c = 65535;
            try {
                int hashCode = str4.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str4.equals("U")) {
                        c = 1;
                    }
                } else if (str4.equals("S")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        firebaseInstanceId.zzb(str5);
                        if (FirebaseInstanceId.zzi()) {
                            str2 = "FirebaseInstanceId";
                            str3 = "subscribe operation succeeded";
                            Log.d(str2, str3);
                            break;
                        }
                        break;
                    case 1:
                        firebaseInstanceId.zzc(str5);
                        if (FirebaseInstanceId.zzi()) {
                            str2 = "FirebaseInstanceId";
                            str3 = "unsubscribe operation succeeded";
                            Log.d(str2, str3);
                            break;
                        }
                        break;
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Topic sync failed: ".concat(valueOf) : new String("Topic sync failed: "));
                return false;
            }
        }
        return true;
    }

    @GuardedBy("this")
    @Nullable
    private final String zzak() {
        String zzae;
        synchronized (this.zzaj) {
            zzae = this.zzaj.zzae();
        }
        if (TextUtils.isEmpty(zzae)) {
            return null;
        }
        String[] split = zzae.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }

    private final synchronized boolean zzk(String str) {
        synchronized (this.zzaj) {
            String zzae = this.zzaj.zzae();
            String valueOf = String.valueOf(",");
            String valueOf2 = String.valueOf(str);
            if (!zzae.startsWith(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf))) {
                return false;
            }
            String valueOf3 = String.valueOf(",");
            String valueOf4 = String.valueOf(str);
            this.zzaj.zzf(zzae.substring((valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)).length()));
            return true;
        }
    }

    final synchronized Task<Void> zza(String str) {
        String zzae;
        TaskCompletionSource<Void> taskCompletionSource;
        synchronized (this.zzaj) {
            zzae = this.zzaj.zzae();
            zzaq zzaqVar = this.zzaj;
            StringBuilder sb = new StringBuilder(String.valueOf(zzae).length() + 1 + String.valueOf(str).length());
            sb.append(zzae);
            sb.append(",");
            sb.append(str);
            zzaqVar.zzf(sb.toString());
        }
        taskCompletionSource = new TaskCompletionSource<>();
        this.zzdg.put(Integer.valueOf(this.zzdf + (TextUtils.isEmpty(zzae) ? 0 : zzae.split(",").length - 1)), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @WorkerThread
    final boolean zza(FirebaseInstanceId firebaseInstanceId) {
        TaskCompletionSource<Void> remove;
        while (true) {
            synchronized (this) {
                String zzak = zzak();
                if (zzak == null) {
                    Log.d("FirebaseInstanceId", "topic sync succeeded");
                    return true;
                }
                if (!zza(firebaseInstanceId, zzak)) {
                    return false;
                }
                synchronized (this) {
                    remove = this.zzdg.remove(Integer.valueOf(this.zzdf));
                    zzk(zzak);
                    this.zzdf++;
                }
                if (remove != null) {
                    remove.setResult(null);
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    final synchronized boolean zzaj() {
        return zzak() != null;
    }
}
