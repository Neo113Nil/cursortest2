package com.inmobi.media;

import com.inmobi.ads.rendering.InMobiAdActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes6.dex */
public final class A9 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6452a;
    public final /* synthetic */ long b;
    public final /* synthetic */ InMobiAdActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A9(long j, InMobiAdActivity inMobiAdActivity, Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = inMobiAdActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new A9(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new A9(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6452a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.b;
            this.f6452a = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Y9 y9 = this.c.h;
        if (y9 != null) {
            ((Z9) y9).b("EmbeddedBrowser", "Landing page loading timed out after " + this.b + " ms");
        }
        this.c.a("LOADER_TIMEOUT");
        return Unit.INSTANCE;
    }
}
