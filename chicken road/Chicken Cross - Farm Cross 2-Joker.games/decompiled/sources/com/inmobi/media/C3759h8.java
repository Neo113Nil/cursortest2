package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.h8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3759h8 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4043r8 f7136a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3759h8(Continuation continuation, C4043r8 c4043r8) {
        super(2, continuation);
        this.f7136a = c4043r8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3759h8(continuation, this.f7136a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3759h8((Continuation) obj2, this.f7136a).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f7136a.n.pause();
        this.f7136a.x.a();
        C4182w8 c4182w8 = this.f7136a.y;
        c4182w8.b.setVolume(0.0f);
        c4182w8.d.a();
        C4043r8 c4043r8 = this.f7136a;
        c4043r8.j.set(Kh.e);
        C4043r8 c4043r82 = this.f7136a;
        c4043r82.a(new C3636cp(c4043r82.n.getCurrentPosition()));
        return Unit.INSTANCE;
    }
}
