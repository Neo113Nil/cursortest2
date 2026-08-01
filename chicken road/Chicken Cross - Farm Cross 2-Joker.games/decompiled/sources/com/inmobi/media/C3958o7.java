package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.o7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3958o7 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Yd f7281a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3958o7(Yd yd, Continuation continuation) {
        super(2, continuation);
        this.f7281a = yd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3958o7(this.f7281a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3958o7(this.f7281a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Yd yd = this.f7281a;
        Hd hd = yd.d;
        H h = yd.f7514a.b;
        hd.onAdFetchSuccessful(new AdMetaInfo(h.e, h.l));
        return Unit.INSTANCE;
    }
}
