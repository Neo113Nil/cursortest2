package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.pb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3990pb extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4130ub f7302a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3990pb(C4130ub c4130ub, Continuation continuation) {
        super(2, continuation);
        this.f7302a = c4130ub;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3990pb(this.f7302a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3990pb(this.f7302a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Y9 y9 = this.f7302a.c;
        if (y9 != null) {
            String str = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((Z9) y9).a(str, "destroyVideoPlayer is called");
        }
        Ej ej = this.f7302a.f7412a;
        ej.c1 = null;
        C3591b9 c3591b9 = ej.a1;
        if (c3591b9 != null) {
            c3591b9.a();
        }
        return Unit.INSTANCE;
    }
}
