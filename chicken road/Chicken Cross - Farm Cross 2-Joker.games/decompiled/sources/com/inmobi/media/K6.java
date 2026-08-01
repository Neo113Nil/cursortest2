package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class K6 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6665a;
    public final /* synthetic */ M6 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K6(M6 m6, boolean z, Continuation continuation) {
        super(1, continuation);
        this.b = m6;
        this.c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new K6(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new K6(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6665a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                M6 m6 = this.b;
                boolean z = this.c;
                this.f6665a = 1;
                if (M6.a(m6, z, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception unused) {
            M6 m62 = this.b;
            String str = m62.e;
            m62.f.set(false);
        }
        return Unit.INSTANCE;
    }
}
