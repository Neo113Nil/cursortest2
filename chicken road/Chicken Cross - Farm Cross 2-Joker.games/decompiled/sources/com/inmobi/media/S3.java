package com.inmobi.media;

import android.os.SystemClock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class S3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6840a;
    public final /* synthetic */ C4066s3 b;
    public final /* synthetic */ Y9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3(C4066s3 c4066s3, Y9 y9, Continuation continuation) {
        super(2, continuation);
        this.b = c4066s3;
        this.c = y9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new S3(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new S3(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6840a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            X3 x3 = X3.f6941a;
            SystemClock.elapsedRealtime();
            if (this.b.e) {
                Y9 y9 = this.c;
                if (y9 != null) {
                    Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                    ((Z9) y9).c("X3", "ping in web view");
                }
                new J3(X3.l).a(this.b);
                return Unit.INSTANCE;
            }
            Y9 y92 = this.c;
            if (y92 != null) {
                Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                ((Z9) y92).c("X3", "ping in http executor");
            }
            L3 l3 = new L3();
            C4066s3 c4066s3 = this.b;
            this.f6840a = 1;
            obj = l3.a(c4066s3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        B6 b6 = (B6) obj;
        if (b6 != null) {
            X3.l.a(this.b, b6);
        } else {
            X3.l.a(this.b);
        }
        return Unit.INSTANCE;
    }
}
