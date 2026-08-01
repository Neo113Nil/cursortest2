package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes6.dex */
public final class A3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6446a;
    public final /* synthetic */ C4177w3 b;
    public final /* synthetic */ AdConfig.ImaiConfig c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A3(C4177w3 c4177w3, AdConfig.ImaiConfig imaiConfig, Continuation continuation) {
        super(2, continuation);
        this.b = c4177w3;
        this.c = imaiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new A3(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new A3(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6446a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4177w3 c4177w3 = this.b;
            int maxEventBatch = this.c.getMaxEventBatch();
            int pingInterval = this.c.getPingInterval();
            this.f6446a = 1;
            obj = c4177w3.a(maxEventBatch, pingInterval, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.inmobi.ads.core.Click>");
        return TypeIntrinsics.asMutableList(obj);
    }
}
