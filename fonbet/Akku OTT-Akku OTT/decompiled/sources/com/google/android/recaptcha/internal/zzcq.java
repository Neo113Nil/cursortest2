package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.M;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;

/* loaded from: classes4.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j, Continuation continuation) throws V0, b, RecaptchaException {
        return zzcv.zzh(zza(application), str, j, null, null, null, continuation, 28, null);
    }

    public static final Task zzc(Application application, String str, long j) throws V0, b, RecaptchaException {
        T a;
        a = C1082i.a(zza(application).zzd().zza(), EmptyCoroutineContext.INSTANCE, M.a, new zzco(application, str, j, null));
        return zzas.zza(a);
    }

    public static final Object zzd(Application application, String str, Continuation continuation) throws b, RecaptchaException {
        Object zzh;
        zzh = zzcv.zzh(r0, str, 0L, null, zza(application).zzf, zzch.zzb, continuation, 2, null);
        return zzh;
    }

    public static final Task zze(Application application, String str) throws b, RecaptchaException {
        T a;
        a = C1082i.a(zza(application).zzd().zza(), EmptyCoroutineContext.INSTANCE, M.a, new zzcp(application, str, null));
        return zzas.zza(a);
    }
}
