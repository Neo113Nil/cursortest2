package com.inmobi.media;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class O3 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6755a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Z9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O3(String str, Z9 z9, Continuation continuation) {
        super(1, continuation);
        this.b = str;
        this.c = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new O3(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new O3(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6755a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                X3 x3 = X3.f6941a;
                if (X3.e()) {
                    int maxRetries = X3.c().getMaxRetries();
                    String str = this.b;
                    C4066s3 c4066s3 = new C4066s3(str, true, false, maxRetries + 1, 193);
                    Z9 z9 = this.c;
                    if (z9 != null) {
                        Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                        z9.a("X3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    Z9 z92 = this.c;
                    this.f6755a = 1;
                    if (x3.a(c4066s3, null, z92, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            Z9 z93 = this.c;
            if (z93 != null) {
                X3 x32 = X3.f6941a;
                Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                z93.b("X3", "SDK encountered unexpected error in pinging click; " + e.getMessage());
            }
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
        return Unit.INSTANCE;
    }
}
