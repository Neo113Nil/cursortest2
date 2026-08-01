package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* renamed from: com.inmobi.media.yj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4247yj extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7506a;
    public final /* synthetic */ Ej b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4247yj(Ej ej, Continuation continuation) {
        super(2, continuation);
        this.b = ej;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4247yj(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4247yj(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Y9 y9;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7506a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f7506a = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!this.b.isAttachedToWindow() && (y9 = this.b.i) != null) {
            ((Z9) y9).a();
        }
        return Unit.INSTANCE;
    }
}
