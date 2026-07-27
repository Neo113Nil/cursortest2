package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.m7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3901m7 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3929n7 f7241a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3901m7(C3929n7 c3929n7, Continuation continuation) {
        super(2, continuation);
        this.f7241a = c3929n7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3901m7(this.f7241a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3901m7(this.f7241a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C3929n7 c3929n7 = this.f7241a;
        Hd hd = c3929n7.f;
        InMobiAdRequestStatus status = c3929n7.e;
        hd.getClass();
        Intrinsics.checkNotNullParameter(status, "status");
        hd.onAdLoadFailed(status);
        return Unit.INSTANCE;
    }
}
