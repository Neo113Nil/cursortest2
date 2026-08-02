package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zzef implements zzcn {
    private final zzdt zza;
    private zzcm zzb;
    private zzsc zzc;

    public zzef(zzdt zzdtVar) {
        zzcl zzclVar;
        this.zza = zzdtVar;
        zzclVar = zzcm.zza;
        this.zzb = zzclVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, Continuation continuation) {
        zzed zzedVar;
        Object obj;
        Object coroutine_suspended;
        int i;
        zzcj zzcjVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        double d;
        zzef zzefVar;
        zzsc zzscVar;
        String str3;
        zzef zzefVar2;
        try {
            if (continuation instanceof zzed) {
                zzedVar = (zzed) continuation;
                int i2 = zzedVar.zzd;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzedVar.zzd = i2 - Integer.MIN_VALUE;
                    zzed zzedVar2 = zzedVar;
                    obj = zzedVar2.zzb;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzedVar2.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        zzcm zzcmVar = this.zzb;
                        zzcjVar = zzcm.zzb;
                        if (!Intrinsics.areEqual(zzcmVar, zzcjVar)) {
                            throw new zzbd(zzbb.zzb, zzba.zzar, null);
                        }
                        double d2 = j;
                        zzdt zzdtVar = this.zza;
                        double d3 = 0.45d * d2;
                        zzedVar2.zze = this;
                        zzedVar2.zzf = str;
                        zzedVar2.zzg = recaptchaAction;
                        double d4 = d2 * 0.55d;
                        zzedVar2.zza = d4;
                        zzedVar2.zzd = 1;
                        obj = zzdtVar.zzl(str, (long) d3, zzedVar2);
                        if (obj != coroutine_suspended) {
                            str2 = str;
                            recaptchaAction2 = recaptchaAction;
                            d = d4;
                            zzefVar = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = zzedVar2.zzf;
                        zzefVar2 = zzedVar2.zze;
                        ResultKt.throwOnFailure(obj);
                        zzsr zzsrVar = (zzsr) obj;
                        zzefVar2.zza.zzq(str3, zzsrVar);
                        return zzsrVar.zzj();
                    }
                    double d5 = zzedVar2.zza;
                    recaptchaAction2 = zzedVar2.zzg;
                    String str4 = zzedVar2.zzf;
                    zzef zzefVar3 = zzedVar2.zze;
                    ResultKt.throwOnFailure(obj);
                    d = d5;
                    zzefVar = zzefVar3;
                    str2 = str4;
                    zzsi zzsiVar = (zzsi) obj;
                    zzdt zzdtVar2 = zzefVar.zza;
                    zzscVar = zzefVar.zzc;
                    if (zzscVar == null) {
                        zzscVar = null;
                    }
                    zzsp zzi = zzdtVar2.zzi(recaptchaAction2, zzsiVar, zzscVar);
                    zzedVar2.zze = zzefVar;
                    zzedVar2.zzf = str2;
                    zzedVar2.zzg = null;
                    zzedVar2.zzd = 2;
                    obj = zzefVar.zza.zzm(zzi, str2, (long) d, zzedVar2);
                    if (obj != coroutine_suspended) {
                        str3 = str2;
                        zzefVar2 = zzefVar;
                        zzsr zzsrVar2 = (zzsr) obj;
                        zzefVar2.zza.zzq(str3, zzsrVar2);
                        return zzsrVar2.zzj();
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            zzsi zzsiVar2 = (zzsi) obj;
            zzdt zzdtVar22 = zzefVar.zza;
            zzscVar = zzefVar.zzc;
            if (zzscVar == null) {
            }
            zzsp zzi2 = zzdtVar22.zzi(recaptchaAction2, zzsiVar2, zzscVar);
            zzedVar2.zze = zzefVar;
            zzedVar2.zzf = str2;
            zzedVar2.zzg = null;
            zzedVar2.zzd = 2;
            obj = zzefVar.zza.zzm(zzi2, str2, (long) d, zzedVar2);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzb, zzba.zzaz, e2.getMessage());
        }
        zzedVar = new zzed(this, continuation);
        zzed zzedVar22 = zzedVar;
        obj = zzedVar22.zzb;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzedVar22.zzd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r11v10, types: [com.google.android.recaptcha.internal.zzef] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(long j, Continuation continuation) {
        zzee zzeeVar;
        int i;
        zzci zzciVar;
        zzcj zzcjVar;
        zzci zzciVar2;
        zzck zzckVar;
        Object obj;
        double d;
        zzef zzefVar;
        zzcj zzcjVar2;
        try {
            if (continuation instanceof zzee) {
                zzeeVar = (zzee) continuation;
                int i2 = zzeeVar.zzd;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzeeVar.zzd = i2 - Integer.MIN_VALUE;
                    Object obj2 = zzeeVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzeeVar.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        zzcm zzcmVar = this.zzb;
                        zzcjVar = zzcm.zzb;
                        if (!Intrinsics.areEqual(zzcmVar, zzcjVar)) {
                            zzcm zzcmVar2 = this.zzb;
                            zzciVar2 = zzcm.zzd;
                            if (!Intrinsics.areEqual(zzcmVar2, zzciVar2)) {
                                zzckVar = zzcm.zzc;
                                this.zzb = zzckVar;
                                double d2 = j;
                                try {
                                    zzdt zzdtVar = this.zza;
                                    double d3 = 0.6d * d2;
                                    zzeeVar.zze = this;
                                    double d4 = d2 * 0.4d;
                                    zzeeVar.zza = d4;
                                    zzeeVar.zzd = 1;
                                    Object zzo = zzdtVar.zzo((long) d3, zzeeVar);
                                    if (zzo != coroutine_suspended) {
                                        obj = zzo;
                                        d = d4;
                                        zzefVar = this;
                                    }
                                    return coroutine_suspended;
                                } catch (zzbd e) {
                                    e = e;
                                    j = this;
                                    zzciVar = zzcm.zzd;
                                    j.zzb = zzciVar;
                                    throw e;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzef zzefVar2 = zzeeVar.zze;
                        ResultKt.throwOnFailure(obj2);
                        j = zzefVar2;
                        zzcjVar2 = zzcm.zzb;
                        j.zzb = zzcjVar2;
                        return Unit.INSTANCE;
                    }
                    double d5 = zzeeVar.zza;
                    zzef zzefVar3 = zzeeVar.zze;
                    try {
                        ResultKt.throwOnFailure(obj2);
                        obj = obj2;
                        d = d5;
                        zzefVar = zzefVar3;
                    } catch (zzbd e2) {
                        e = e2;
                        j = zzefVar3;
                        zzciVar = zzcm.zzd;
                        j.zzb = zzciVar;
                        throw e;
                    }
                    zzsc zzscVar = (zzsc) obj;
                    zzefVar.zzc = zzscVar;
                    zzeeVar.zze = zzefVar;
                    zzeeVar.zzd = 2;
                    Object zzn = zzefVar.zza.zzn(zzscVar, (long) d, zzeeVar);
                    j = zzefVar;
                }
            }
            if (i != 0) {
            }
            zzsc zzscVar2 = (zzsc) obj;
            zzefVar.zzc = zzscVar2;
            zzeeVar.zze = zzefVar;
            zzeeVar.zzd = 2;
            Object zzn2 = zzefVar.zza.zzn(zzscVar2, (long) d, zzeeVar);
            j = zzefVar;
        } catch (zzbd e3) {
            e = e3;
        }
        zzeeVar = new zzee(this, continuation);
        Object obj22 = zzeeVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzeeVar.zzd;
    }
}
