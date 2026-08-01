package com.inmobi.media;

import android.widget.FrameLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.no, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3946no extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bo f7273a;
    public final /* synthetic */ FrameLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3946no(Bo bo, FrameLayout frameLayout, Continuation continuation) {
        super(2, continuation);
        this.f7273a = bo;
        this.b = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3946no(this.f7273a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3946no(this.f7273a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Z9 z9 = this.f7273a.e;
        if (z9 != null) {
            z9.a("VideoExperienceManager", "inflate called - adding media player to parent layout");
        }
        Jp.a(this.f7273a.j);
        this.b.addView(this.f7273a.j);
        return Unit.INSTANCE;
    }
}
