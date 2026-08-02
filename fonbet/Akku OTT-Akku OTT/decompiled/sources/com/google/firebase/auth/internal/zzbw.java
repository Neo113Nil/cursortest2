package com.google.firebase.auth.internal;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import defpackage.g;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzbw implements Continuation<zzahs, Task<RecaptchaTasksClient>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzbx zzb;

    public zzbw(zzbx zzbxVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzbxVar);
        this.zzb = zzbxVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<RecaptchaTasksClient> then(Task<zzahs> task) throws Exception {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            C0875q.g(exception);
            String message = exception.getMessage();
            C0875q.g(message);
            return Tasks.forException(new zzbu(message));
        }
        zzahs result = task.getResult();
        String zza = result.zza();
        if (com.google.android.gms.internal.p002firebaseauthapi.zzac.zzc(zza)) {
            return Tasks.forException(new zzbu(g.a("No Recaptcha Enterprise siteKey configured for tenant/project ", this.zza)));
        }
        List<String> zza2 = com.google.android.gms.internal.p002firebaseauthapi.zzt.zza('/').zza((CharSequence) zza);
        String str = zza2.size() != 4 ? null : zza2.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(g.a("Invalid siteKey format ", zza)));
        }
        Log.isLoggable("RecaptchaHandler", 4);
        zzbx zzbxVar = this.zzb;
        Task<RecaptchaTasksClient> zza3 = zzbxVar.zzb.zza((Application) zzbxVar.zza.getApplicationContext(), str);
        zzbx.zza(this.zzb, result, zza3, this.zza);
        return zza3;
    }
}
