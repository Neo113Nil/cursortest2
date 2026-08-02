package com.google.firebase.auth.internal;

import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzbx {
    FirebaseApp zza;
    zzbs zzb;
    private final Object zzc;
    private final Map<String, Task<RecaptchaTasksClient>> zzd;

    @Nullable
    private zzahs zze;
    private FirebaseAuth zzf;

    public zzbx(FirebaseApp firebaseApp, FirebaseAuth firebaseAuth) {
        this(firebaseApp, firebaseAuth, new zzbv());
    }

    @Nullable
    private final Task<RecaptchaTasksClient> zzc(String str) {
        Task<RecaptchaTasksClient> task;
        synchronized (this.zzc) {
            task = this.zzd.get(str);
        }
        return task;
    }

    private static String zzd(@Nullable String str) {
        return com.google.android.gms.internal.p002firebaseauthapi.zzac.zzc(str) ? ProxyConfig.MATCH_ALL_SCHEMES : str;
    }

    public final Task<String> zza(@Nullable String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String zzd = zzd(str);
        Task<RecaptchaTasksClient> zzc = zzc(zzd);
        if (bool.booleanValue() || zzc == null) {
            zzc = zza(zzd, bool);
        }
        return zzc.continueWithTask(new zzbz(this, recaptchaAction));
    }

    public final boolean zzb(String str) {
        boolean z;
        synchronized (this.zzc) {
            try {
                zzahs zzahsVar = this.zze;
                z = zzahsVar != null && zzahsVar.zzc(str);
            } finally {
            }
        }
        return z;
    }

    private zzbx(FirebaseApp firebaseApp, FirebaseAuth firebaseAuth, zzbs zzbsVar) {
        this.zzc = new Object();
        this.zzd = new HashMap();
        this.zza = firebaseApp;
        this.zzf = firebaseAuth;
        this.zzb = zzbsVar;
    }

    public final Task<RecaptchaTasksClient> zza(@Nullable String str, Boolean bool) {
        Task<RecaptchaTasksClient> zzc;
        String zzd = zzd(str);
        return (bool.booleanValue() || (zzc = zzc(zzd)) == null) ? this.zzf.zza("RECAPTCHA_ENTERPRISE").continueWithTask(new zzbw(this, zzd)) : zzc;
    }

    public static /* synthetic */ void zza(zzbx zzbxVar, zzahs zzahsVar, Task task, String str) {
        synchronized (zzbxVar.zzc) {
            zzbxVar.zze = zzahsVar;
            zzbxVar.zzd.put(str, task);
        }
    }

    public final boolean zza(String str) {
        String zzb;
        C0875q.g(str);
        zzahs zzahsVar = this.zze;
        if (zzahsVar == null || (zzb = zzahsVar.zzb(str)) == null) {
            return false;
        }
        return zzb.equals("AUDIT");
    }
}
