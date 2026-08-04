package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzco;
import com.google.android.recaptcha.internal.zzcx;
import j6.a;
import p065i6.d;

/* JADX INFO: loaded from: classes.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    /* JADX INFO: renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m1getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, d dVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m2getClientBWLJW6A(application, str, j, dVar);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzco.zzh(application, str, 10000L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: getClient-BWLJW6A, reason: not valid java name */
    public final Object m2getClientBWLJW6A(Application application, String str, long j, d dVar) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        if (dVar instanceof Recaptcha$getClient$1) {
            recaptcha$getClient$1 = (Recaptcha$getClient$1) dVar;
            int i7 = recaptcha$getClient$1.zzc;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                recaptcha$getClient$1.zzc = i7 - Integer.MIN_VALUE;
            } else {
                recaptcha$getClient$1 = new Recaptcha$getClient$1(this, dVar);
            }
        } else {
            recaptcha$getClient$1 = new Recaptcha$getClient$1(this, dVar);
        }
        Recaptcha$getClient$1 recaptcha$getClient$2 = recaptcha$getClient$1;
        Object objZzg = recaptcha$getClient$2.zza;
        a aVar = a.f14648a;
        int i8 = recaptcha$getClient$2.zzc;
        try {
            if (i8 == 0) {
                p003a.a.p0(objZzg);
                zzco zzcoVar = zzco.zza;
                recaptcha$getClient$2.zzc = 1;
                objZzg = zzco.zzg(application, str, j, null, recaptcha$getClient$2);
                if (objZzg == aVar) {
                    return aVar;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p003a.a.p0(objZzg);
            }
            return (zzcx) objZzg;
        } catch (Throwable th) {
            return p003a.a.h(th);
        }
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j) {
        return zzco.zzh(application, str, j);
    }
}
