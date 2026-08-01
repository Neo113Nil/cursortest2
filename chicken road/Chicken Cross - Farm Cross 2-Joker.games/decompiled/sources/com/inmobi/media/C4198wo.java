package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.wo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4198wo extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7466a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Bo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4198wo(Bo bo, Continuation continuation) {
        super(2, continuation);
        this.c = bo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4198wo c4198wo = new C4198wo(this.c, continuation);
        c4198wo.b = obj;
        return c4198wo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4198wo c4198wo = new C4198wo(this.c, (Continuation) obj2);
        c4198wo.b = (AbstractC3691eo) obj;
        return c4198wo.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object mediaEvent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7466a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC3691eo abstractC3691eo = (AbstractC3691eo) this.b;
            MutableSharedFlow mutableSharedFlow = this.c.d;
            this.b = abstractC3691eo;
            this.f7466a = 1;
            if (mutableSharedFlow.emit(abstractC3691eo, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mediaEvent = abstractC3691eo;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediaEvent = (AbstractC3691eo) this.b;
            ResultKt.throwOnFailure(obj);
        }
        Ep ep = this.c.c.g;
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof Po) {
            Map a2 = AbstractC4169vm.a(ep.f6541a);
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("VideoLoadStarted", a2, EnumC3944nm.f7271a);
        } else if (mediaEvent instanceof So) {
            Map a3 = AbstractC4169vm.a(ep.f6541a);
            C3829jm c3829jm2 = C3829jm.f7187a;
            C3829jm.b("VideoLoadSuccess", a3, EnumC3944nm.f7271a);
        } else if (mediaEvent instanceof C4253yp) {
            boolean[] zArr = ep.b;
            if (!zArr[0]) {
                zArr[0] = true;
                Map a4 = AbstractC4169vm.a(ep.f6541a);
                C3829jm c3829jm3 = C3829jm.f7187a;
                C3829jm.b("VideoStart", a4, EnumC3944nm.f7271a);
            }
        } else if (mediaEvent instanceof Ko) {
            boolean[] zArr2 = ep.b;
            if (!zArr2[1]) {
                zArr2[1] = true;
                Map a5 = AbstractC4169vm.a(ep.f6541a);
                C3829jm c3829jm4 = C3829jm.f7187a;
                C3829jm.b("VideoFirstQuartile", a5, EnumC3944nm.f7271a);
            }
        } else if (mediaEvent instanceof C4199wp) {
            boolean[] zArr3 = ep.b;
            if (!zArr3[2]) {
                zArr3[2] = true;
                Map a6 = AbstractC4169vm.a(ep.f6541a);
                C3829jm c3829jm5 = C3829jm.f7187a;
                C3829jm.b("VideoSecondQuartile", a6, EnumC3944nm.f7271a);
            }
        } else if (mediaEvent instanceof Fp) {
            boolean[] zArr4 = ep.b;
            if (!zArr4[3]) {
                zArr4[3] = true;
                Map a7 = AbstractC4169vm.a(ep.f6541a);
                C3829jm c3829jm6 = C3829jm.f7187a;
                C3829jm.b("VideoThirdQuartile", a7, EnumC3944nm.f7271a);
            }
        } else if (mediaEvent instanceof C3607bo) {
            boolean[] zArr5 = ep.b;
            if (!zArr5[4]) {
                zArr5[4] = true;
                Map a8 = AbstractC4169vm.a(ep.f6541a);
                C3829jm c3829jm7 = C3829jm.f7187a;
                C3829jm.b("VideoComplete", a8, EnumC3944nm.f7271a);
            }
        } else if (mediaEvent instanceof C3635co) {
            ((C3635co) mediaEvent).getClass();
            Map mutableMap = MapsKt.toMutableMap(AbstractC4169vm.a(ep.f6541a));
            mutableMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 66);
            C3829jm c3829jm8 = C3829jm.f7187a;
            C3829jm.b("VideoLoadFailure", mutableMap, EnumC3944nm.f7271a);
        }
        Yn yn = this.c.c.f;
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof So) {
            yn.b.d = AbstractC4114tn.a(((So) mediaEvent).f6859a);
            yn.c.f.a(Uf.f6892a);
        } else if (mediaEvent instanceof C3635co) {
            ((C3635co) mediaEvent).getClass();
            yn.c.m.a(new Tq(MapsKt.mapOf(TuplesKt.to("[ERRORCODE]", String.valueOf(405))), null, 2));
        } else if (mediaEvent instanceof C4253yp) {
            String str = ((C4253yp) mediaEvent).b;
            if (yn.f6980a.incrementAndGet() > 1) {
                Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("trigger", str));
                C3829jm c3829jm9 = C3829jm.f7187a;
                C3829jm.b("MultipleVideoReadyFired", mutableMapOf, EnumC3944nm.f7271a);
            }
            C4241yd c4241yd = yn.c.g;
            Uf uf = Uf.f6892a;
            c4241yd.a(uf);
            yn.c.h.a(uf);
        } else if (mediaEvent instanceof C4172vp) {
            yn.c.l.a(Uf.f6892a);
        } else if (mediaEvent instanceof C3636cp) {
            yn.c.k.a(Uf.f6892a);
        } else if (mediaEvent instanceof Ko) {
            yn.c.b.a(Uf.f6892a);
        } else if (mediaEvent instanceof C4199wp) {
            yn.c.c.a(Uf.f6892a);
        } else if (mediaEvent instanceof Fp) {
            yn.c.d.a(Uf.f6892a);
        } else if (mediaEvent instanceof C3607bo) {
            yn.c.e.a(Uf.f6892a);
        } else if (mediaEvent instanceof C3891lp) {
            yn.b.e = ((C3891lp) mediaEvent).f7233a;
            yn.c.n.a(Uf.f6892a);
        } else if (mediaEvent instanceof C3866l2) {
            if (((C3866l2) mediaEvent).f7213a) {
                yn.c.i.a(Uf.f6892a);
            } else {
                yn.c.j.a(Uf.f6892a);
            }
        } else if (mediaEvent instanceof C4205x4) {
            yn.c.o.a(new Tq(null, ((C4205x4) mediaEvent).f7471a, 1));
        }
        return Unit.INSTANCE;
    }
}
