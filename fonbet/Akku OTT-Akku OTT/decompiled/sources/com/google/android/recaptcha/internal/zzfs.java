package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.K;

/* loaded from: classes4.dex */
final class zzfs extends SuspendLambda implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzgd zzd;
    final /* synthetic */ zzft zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzgd zzgdVar, zzft zzftVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzgdVar;
        this.zze = zzftVar;
        this.zzf = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzfs(this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((K) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (r7 != r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        zzhx zzhxVar;
        Object zzg;
        zzub zzubVar;
        zzjh zzjhVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzc;
        try {
        } catch (Exception e) {
            zzft zzftVar = this.zze;
            zzgd zzgdVar = this.zzd;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
            zzh = zzftVar.zzh(e, zzgdVar, this);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.zzd.zza = new zzbn();
            zzub zzi = zzub.zzi(zzkh.zzh().zzj(this.zzf));
            zzi.zzf();
            zzhxVar = this.zze.zzc;
            zztz zza = zzhxVar.zza(zzi);
            zzjh zzb = zzjh.zzb();
            zzft zzftVar2 = this.zze;
            List zzi2 = zza.zzi();
            zzgd zzgdVar2 = this.zzd;
            this.zza = zzi;
            this.zzb = zzb;
            this.zzc = 1;
            zzg = zzftVar2.zzg(zzi2, zzgdVar2, this);
            if (zzg != coroutine_suspended) {
                zzubVar = zzi;
                zzjhVar = zzb;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        zzjhVar = (zzjh) this.zzb;
        zzubVar = (zzub) this.zza;
        ResultKt.throwOnFailure(obj);
        zzjhVar.zzf();
        Boxing.boxLong(zzjhVar.zza(TimeUnit.MICROSECONDS));
        zzubVar.zzf();
        return Unit.INSTANCE;
    }
}
