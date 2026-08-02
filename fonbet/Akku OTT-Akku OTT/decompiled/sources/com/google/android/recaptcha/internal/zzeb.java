package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC1115v;
import kotlinx.coroutines.K;

/* loaded from: classes4.dex */
final class zzeb extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ InterfaceC1115v zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, InterfaceC1115v interfaceC1115v, long j, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzecVar;
        this.zzc = interfaceC1115v;
        this.zzd = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzeb(this.zzb, this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((K) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzbd zzbdVar;
        zzeb zzebVar;
        zzci zzciVar;
        zzbd e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zza != 0) {
            try {
                ResultKt.throwOnFailure(obj);
                zzebVar = this;
            } catch (zzbd e2) {
                zzbdVar = e2;
                zzebVar = this;
                zzec zzecVar = zzebVar.zzb;
                zzciVar = zzcm.zzd;
                zzecVar.zzf = zzciVar;
                zzebVar.zzc.s(zzbdVar);
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            try {
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                zzebVar = this;
                try {
                    obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, zzebVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (zzbd e3) {
                    e = e3;
                    zzbdVar = e;
                    zzec zzecVar2 = zzebVar.zzb;
                    zzciVar = zzcm.zzd;
                    zzecVar2.zzf = zzciVar;
                    zzebVar.zzc.s(zzbdVar);
                    return Unit.INSTANCE;
                }
            } catch (zzbd e4) {
                e = e4;
                zzebVar = this;
                zzbdVar = e;
                zzec zzecVar22 = zzebVar.zzb;
                zzciVar = zzcm.zzd;
                zzecVar22.zzf = zzciVar;
                zzebVar.zzc.s(zzbdVar);
                return Unit.INSTANCE;
            }
        }
        ((Boolean) obj).getClass();
        return Unit.INSTANCE;
    }
}
