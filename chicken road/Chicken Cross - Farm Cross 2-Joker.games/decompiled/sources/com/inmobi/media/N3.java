package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class N3 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6733a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Y9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N3(String str, boolean z, Y9 y9, Continuation continuation) {
        super(1, continuation);
        this.b = str;
        this.c = z;
        this.d = y9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new N3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((N3) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6733a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                X3 x3 = X3.f6941a;
                Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                String str = "ping launchWithPriority " + this.b;
                X3 x32 = X3.f6941a;
                if (X3.e()) {
                    int maxRetries = X3.c().getMaxRetries();
                    String str2 = this.b;
                    C4066s3 c4066s3 = new C4066s3(str2, this.c, false, maxRetries + 1, 197);
                    Y9 y9 = this.d;
                    if (y9 != null) {
                        Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                        ((Z9) y9).a("X3", "Received click (" + str2 + ") for pinging over HTTP");
                    }
                    Y9 y92 = this.d;
                    this.f6733a = 1;
                    if (x32.a(c4066s3, null, y92, this) == coroutine_suspended) {
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
            Y9 y93 = this.d;
            if (y93 != null) {
                X3 x33 = X3.f6941a;
                Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                ((Z9) y93).b("X3", "SDK encountered unexpected error in pinging click; " + e.getMessage());
            }
        }
        return Unit.INSTANCE;
    }
}
