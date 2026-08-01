package com.inmobi.media;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* renamed from: com.inmobi.media.qf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4022qf extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7327a;
    public final /* synthetic */ C4135uf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4022qf(C4135uf c4135uf, Continuation continuation) {
        super(2, continuation);
        this.b = c4135uf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4022qf(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4022qf(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7327a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Y9 l = this.b.l();
            if (l != null) {
                ((Z9) l).a("NativeRenderedState", "MRC50 Tracking Started");
            }
            Flow b = ((Fe) this.b.b.k.getValue()).f6557a.b();
            C3994pf c3994pf = new C3994pf(null);
            this.f7327a = 1;
            if (FlowKt.first(b, c3994pf, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Y9 l2 = this.b.l();
        if (l2 != null) {
            ((Z9) l2).a("NativeRenderedState", "MRC50 Event Occurred");
        }
        C4162vf c4162vf = this.b.b;
        c4162vf.b.d = true;
        Map a2 = AbstractC4169vm.a(((Dd) c4162vf.g.f.getValue()).f6512a);
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("MRCViewable50Rendered", a2, EnumC3944nm.f7271a);
        this.b.b.f.b.g.a(Uf.f6892a);
        ((Fe) this.b.b.k.getValue()).f6557a.a();
        return Unit.INSTANCE;
    }
}
