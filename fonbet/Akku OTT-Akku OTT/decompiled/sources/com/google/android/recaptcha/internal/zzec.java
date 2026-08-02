package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1117w;
import kotlinx.coroutines.C1119x;
import kotlinx.coroutines.InterfaceC1115v;

/* loaded from: classes4.dex */
public final class zzec implements zzcn {
    private final zzdt zza;
    private final zzek zzb;
    private InterfaceC1115v zzc = C1119x.a();
    private zzbd zzd;
    private zzsc zze;
    private zzcm zzf;
    private final zzbi zzg;

    public zzec(zzdt zzdtVar, zzbi zzbiVar, zzek zzekVar, zzbo zzboVar) {
        zzcl zzclVar;
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
        zzclVar = zzcm.zza;
        this.zzf = zzclVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(Function1 function1, Continuation continuation) {
        zzdv zzdvVar;
        int i;
        zzbn zzbnVar;
        if (continuation instanceof zzdv) {
            zzdvVar = (zzdv) continuation;
            int i2 = zzdvVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzdvVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzdvVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzdvVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzbn zzbnVar2 = new zzbn();
                    zzdvVar.zzd = zzbnVar2;
                    zzdvVar.zzc = 1;
                    if (function1.invoke(zzdvVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zzbnVar = zzbnVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzbnVar = zzdvVar.zzd;
                    ResultKt.throwOnFailure(obj);
                }
                zzbnVar.zzc();
                return Boxing.boxLong(zzbnVar.zza(TimeUnit.MILLISECONDS));
            }
        }
        zzdvVar = new zzdv(this, continuation);
        Object obj2 = zzdvVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzdvVar.zzc;
        if (i != 0) {
        }
        zzbnVar.zzc();
        return Boxing.boxLong(zzbnVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[Catch: Exception -> 0x0031, TRY_ENTER, TryCatch #1 {Exception -> 0x0031, blocks: (B:12:0x002d, B:13:0x0065, B:19:0x0077, B:20:0x0080), top: B:11:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(long j, Continuation continuation) {
        zzdw zzdwVar;
        Object obj;
        Object coroutine_suspended;
        int i;
        zzec zzecVar;
        zzec zzecVar2;
        zzbd zzbdVar;
        zzcm zzcmVar;
        zzci zzciVar;
        zzbd zzbdVar2;
        zzck zzckVar;
        long longValue;
        try {
            if (continuation instanceof zzdw) {
                zzdwVar = (zzdw) continuation;
                int i2 = zzdwVar.zzd;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzdwVar.zzd = i2 - Integer.MIN_VALUE;
                    obj = zzdwVar.zzb;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzdwVar.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        zzdwVar.zze = this;
                        zzdwVar.zza = j;
                        zzdwVar.zzd = 1;
                        if (zzn(j, zzdwVar) != coroutine_suspended) {
                            zzecVar = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        j = zzdwVar.zza;
                        zzecVar = zzdwVar.zze;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzdwVar.zza;
                        zzecVar2 = zzdwVar.zze;
                        try {
                            ResultKt.throwOnFailure(obj);
                            longValue = j - ((Number) obj).longValue();
                            if (longValue < 500) {
                                return Boxing.boxLong(longValue);
                            }
                            throw new zzbd(zzbb.zzc, zzba.zzar, null);
                        } catch (Exception e) {
                            e = e;
                            if (e instanceof zzbd) {
                            }
                            if (zzbdVar == null) {
                            }
                            zzcmVar = zzecVar2.zzf;
                            zzciVar = zzcm.zzd;
                            if (!Intrinsics.areEqual(zzcmVar, zzciVar)) {
                            }
                            zzbdVar2 = zzecVar2.zzd;
                            if (zzbdVar2 == null) {
                            }
                        }
                    }
                    zzdy zzdyVar = new zzdy(j, zzecVar, null);
                    zzdwVar.zze = zzecVar;
                    zzdwVar.zza = j;
                    zzdwVar.zzd = 2;
                    obj = zzecVar.zzl(zzdyVar, zzdwVar);
                    if (obj != coroutine_suspended) {
                        zzecVar2 = zzecVar;
                        longValue = j - ((Number) obj).longValue();
                        if (longValue < 500) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            zzdy zzdyVar2 = new zzdy(j, zzecVar, null);
            zzdwVar.zze = zzecVar;
            zzdwVar.zza = j;
            zzdwVar.zzd = 2;
            obj = zzecVar.zzl(zzdyVar2, zzdwVar);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Exception e2) {
            e = e2;
            zzecVar2 = zzecVar;
            zzbdVar = e instanceof zzbd ? (zzbd) e : null;
            if (zzbdVar == null) {
                zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
            }
            zzcmVar = zzecVar2.zzf;
            zzciVar = zzcm.zzd;
            if (!Intrinsics.areEqual(zzcmVar, zzciVar)) {
                zzcm zzcmVar2 = zzecVar2.zzf;
                zzckVar = zzcm.zzc;
                if (!Intrinsics.areEqual(zzcmVar2, zzckVar)) {
                    throw zzbdVar;
                }
            }
            zzbdVar2 = zzecVar2.zzd;
            if (zzbdVar2 == null) {
                throw zzbdVar2;
            }
            throw zzbdVar;
        }
        zzdwVar = new zzdw(this, continuation);
        obj = zzdwVar.zzb;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzdwVar.zzd;
        if (i != 0) {
        }
    }

    private final Object zzn(long j, Continuation continuation) {
        zzcj zzcjVar;
        zzck zzckVar;
        zzci zzciVar;
        zzck zzckVar2;
        zzcm zzcmVar = this.zzf;
        zzcjVar = zzcm.zzb;
        if (!Intrinsics.areEqual(zzcmVar, zzcjVar)) {
            zzcm zzcmVar2 = this.zzf;
            zzckVar = zzcm.zzc;
            if (!Intrinsics.areEqual(zzcmVar2, zzckVar)) {
                zzcm zzcmVar3 = this.zzf;
                zzciVar = zzcm.zzd;
                if (Intrinsics.areEqual(zzcmVar3, zzciVar) && !zzo(this.zzd)) {
                    return Unit.INSTANCE;
                }
                zzckVar2 = zzcm.zzc;
                this.zzf = zzckVar2;
                C1117w a = C1119x.a();
                this.zzc = a;
                C1082i.c(this.zzg.zza(), null, null, new zzeb(this, a, j, null), 3);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        return (Intrinsics.areEqual(zzbdVar.zzb(), zzbb.zzd) || Intrinsics.areEqual(zzbdVar.zzb(), zzbb.zze) || Intrinsics.areEqual(zzbdVar.zzb(), zzbb.zzf)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, Continuation continuation) {
        zzdu zzduVar;
        Object coroutine_suspended;
        int i;
        String str2;
        RecaptchaAction recaptchaAction2;
        Object zzm;
        zzec zzecVar;
        Object zzl;
        String str3;
        double d;
        zzec zzecVar2;
        zzsc zzscVar;
        String str4;
        zzec zzecVar3;
        try {
            if (continuation instanceof zzdu) {
                zzduVar = (zzdu) continuation;
                int i2 = zzduVar.zzd;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzduVar.zzd = i2 - Integer.MIN_VALUE;
                    zzdu zzduVar2 = zzduVar;
                    Object obj = zzduVar2.zzb;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzduVar2.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        zzduVar2.zze = this;
                        str2 = str;
                        zzduVar2.zzf = str2;
                        recaptchaAction2 = recaptchaAction;
                        zzduVar2.zzg = recaptchaAction2;
                        zzduVar2.zzd = 1;
                        zzm = zzm(j, zzduVar2);
                        if (zzm == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zzecVar = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str4 = zzduVar2.zzf;
                                zzecVar3 = zzduVar2.zze;
                                ResultKt.throwOnFailure(obj);
                                zzsr zzsrVar = (zzsr) obj;
                                zzecVar3.zza.zzq(str4, zzsrVar);
                                return zzsrVar.zzj();
                            }
                            d = zzduVar2.zza;
                            recaptchaAction2 = zzduVar2.zzg;
                            str3 = zzduVar2.zzf;
                            zzecVar2 = zzduVar2.zze;
                            ResultKt.throwOnFailure(obj);
                            zzsi zzsiVar = (zzsi) obj;
                            zzdt zzdtVar = zzecVar2.zza;
                            zzscVar = zzecVar2.zze;
                            if (zzscVar == null) {
                                zzscVar = null;
                            }
                            zzsp zzi = zzdtVar.zzi(recaptchaAction2, zzsiVar, zzscVar);
                            zzdt zzdtVar2 = zzecVar2.zza;
                            long j2 = (long) d;
                            zzduVar2.zze = zzecVar2;
                            zzduVar2.zzf = str3;
                            zzduVar2.zzg = null;
                            zzduVar2.zzd = 3;
                            String str5 = str3;
                            obj = zzdtVar2.zzm(zzi, str5, j2, zzduVar2);
                            if (obj != coroutine_suspended) {
                                str4 = str5;
                                zzecVar3 = zzecVar2;
                                zzsr zzsrVar2 = (zzsr) obj;
                                zzecVar3.zza.zzq(str4, zzsrVar2);
                                return zzsrVar2.zzj();
                            }
                            return coroutine_suspended;
                        }
                        recaptchaAction2 = zzduVar2.zzg;
                        String str6 = zzduVar2.zzf;
                        zzecVar = zzduVar2.zze;
                        ResultKt.throwOnFailure(obj);
                        zzm = obj;
                        str2 = str6;
                    }
                    double longValue = ((Number) zzm).longValue();
                    zzdt zzdtVar3 = zzecVar.zza;
                    double d2 = 0.45d * longValue;
                    zzduVar2.zze = zzecVar;
                    zzduVar2.zzf = str2;
                    zzduVar2.zzg = recaptchaAction2;
                    double d3 = longValue * 0.55d;
                    zzduVar2.zza = d3;
                    zzduVar2.zzd = 2;
                    zzl = zzdtVar3.zzl(str2, (long) d2, zzduVar2);
                    if (zzl != coroutine_suspended) {
                        zzec zzecVar4 = zzecVar;
                        str3 = str2;
                        obj = zzl;
                        d = d3;
                        zzecVar2 = zzecVar4;
                        zzsi zzsiVar2 = (zzsi) obj;
                        zzdt zzdtVar4 = zzecVar2.zza;
                        zzscVar = zzecVar2.zze;
                        if (zzscVar == null) {
                        }
                        zzsp zzi2 = zzdtVar4.zzi(recaptchaAction2, zzsiVar2, zzscVar);
                        zzdt zzdtVar22 = zzecVar2.zza;
                        long j22 = (long) d;
                        zzduVar2.zze = zzecVar2;
                        zzduVar2.zzf = str3;
                        zzduVar2.zzg = null;
                        zzduVar2.zzd = 3;
                        String str52 = str3;
                        obj = zzdtVar22.zzm(zzi2, str52, j22, zzduVar2);
                        if (obj != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (i != 0) {
            }
            double longValue2 = ((Number) zzm).longValue();
            zzdt zzdtVar32 = zzecVar.zza;
            double d22 = 0.45d * longValue2;
            zzduVar2.zze = zzecVar;
            zzduVar2.zzf = str2;
            zzduVar2.zzg = recaptchaAction2;
            double d32 = longValue2 * 0.55d;
            zzduVar2.zza = d32;
            zzduVar2.zzd = 2;
            zzl = zzdtVar32.zzl(str2, (long) d22, zzduVar2);
            if (zzl != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzb, zzba.zzay, e2.getMessage());
        }
        zzduVar = new zzdu(this, continuation);
        zzdu zzduVar22 = zzduVar;
        Object obj2 = zzduVar22.zzb;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzduVar22.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zzb(long j, Continuation continuation) {
        Object zzn = zzn(j, continuation);
        return zzn == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? zzn : Unit.INSTANCE;
    }
}
