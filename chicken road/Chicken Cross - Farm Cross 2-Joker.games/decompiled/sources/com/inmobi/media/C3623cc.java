package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.cc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3623cc extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3651dc f7045a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3623cc(C3651dc c3651dc, Continuation continuation) {
        super(2, continuation);
        this.f7045a = c3651dc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3623cc(this.f7045a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3623cc(this.f7045a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C3651dc c3651dc = this.f7045a;
        Hd hd = c3651dc.f;
        InMobiAdRequestStatus status = c3651dc.e;
        hd.getClass();
        Intrinsics.checkNotNullParameter(status, "status");
        hd.onAdLoadFailed(status);
        return Unit.INSTANCE;
    }
}
