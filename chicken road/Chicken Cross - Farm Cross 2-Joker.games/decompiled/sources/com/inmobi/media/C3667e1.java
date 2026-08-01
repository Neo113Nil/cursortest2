package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.e1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3667e1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3724g1 f7076a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3667e1(AbstractC3724g1 abstractC3724g1, Continuation continuation) {
        super(2, continuation);
        this.f7076a = abstractC3724g1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3667e1(this.f7076a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3667e1(this.f7076a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AdSession adSession = this.f7076a.c;
        if (adSession != null) {
            adSession.finish();
        }
        this.f7076a.c = null;
        return Unit.INSTANCE;
    }
}
