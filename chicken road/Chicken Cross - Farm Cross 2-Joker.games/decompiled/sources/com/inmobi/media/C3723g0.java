package com.inmobi.media;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3723g0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3922n0 f7113a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3723g0(C3922n0 c3922n0, Continuation continuation) {
        super(2, continuation);
        this.f7113a = c3922n0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3723g0(this.f7113a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3723g0(this.f7113a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Map a2 = AbstractC4169vm.a(this.f7113a.b);
        a2.put("networkType", Y5.o());
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("AdLoadCalled", a2, EnumC3944nm.f7271a);
        return Unit.INSTANCE;
    }
}
