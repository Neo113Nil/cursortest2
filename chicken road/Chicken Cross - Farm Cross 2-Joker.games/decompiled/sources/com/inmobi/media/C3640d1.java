package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.d1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3640d1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3724g1 f7059a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3640d1(AbstractC3724g1 abstractC3724g1, Continuation continuation) {
        super(2, continuation);
        this.f7059a = abstractC3724g1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3640d1(this.f7059a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3640d1(this.f7059a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            AdSession adSession = this.f7059a.c;
            if (adSession != null) {
                adSession.start();
            }
        } catch (Exception e) {
            AbstractC3724g1 abstractC3724g1 = this.f7059a;
            abstractC3724g1.c = null;
            Y9 y9 = abstractC3724g1.b;
            if (y9 != null) {
                ((Z9) y9).a(AbstractC3724g1.f, "AdSession start error " + e);
            }
        }
        return Unit.INSTANCE;
    }
}
