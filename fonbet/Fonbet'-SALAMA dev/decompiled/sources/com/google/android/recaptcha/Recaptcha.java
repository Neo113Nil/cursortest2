package com.google.android.recaptcha;

import a.AbstractC0603a;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzco;
import com.google.android.recaptcha.internal.zzcx;
import i6.InterfaceC1287d;
import j6.a;

/* loaded from: classes.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    /* renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m1getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, InterfaceC1287d interfaceC1287d, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m2getClientBWLJW6A(application, str, j, interfaceC1287d);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzco.zzh(application, str, 10000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2getClientBWLJW6A(Application application, String str, long j, InterfaceC1287d interfaceC1287d) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        int i7;
        try {
            if (interfaceC1287d instanceof Recaptcha$getClient$1) {
                recaptcha$getClient$1 = (Recaptcha$getClient$1) interfaceC1287d;
                int i8 = recaptcha$getClient$1.zzc;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    recaptcha$getClient$1.zzc = i8 - Integer.MIN_VALUE;
                    Recaptcha$getClient$1 recaptcha$getClient$12 = recaptcha$getClient$1;
                    Object obj = recaptcha$getClient$12.zza;
                    a aVar = a.f14642a;
                    i7 = recaptcha$getClient$12.zzc;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj);
                        zzco zzcoVar = zzco.zza;
                        recaptcha$getClient$12.zzc = 1;
                        obj = zzco.zzg(application, str, j, null, recaptcha$getClient$12);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0603a.p0(obj);
                    }
                    return (zzcx) obj;
                }
            }
            if (i7 != 0) {
            }
            return (zzcx) obj;
        } catch (Throwable th) {
            return AbstractC0603a.h(th);
        }
        recaptcha$getClient$1 = new Recaptcha$getClient$1(this, interfaceC1287d);
        Recaptcha$getClient$1 recaptcha$getClient$122 = recaptcha$getClient$1;
        Object obj2 = recaptcha$getClient$122.zza;
        a aVar2 = a.f14642a;
        i7 = recaptcha$getClient$122.zzc;
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j) {
        return zzco.zzh(application, str, j);
    }
}
