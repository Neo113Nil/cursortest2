package com.amplitude.core;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.K;
import kotlinx.coroutines.S;

@DebugMetadata(c = "com.amplitude.core.Amplitude$setUserId$1", f = "Amplitude.kt", i = {}, l = {281}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class f extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, String str, Continuation<? super f> continuation) {
        super(2, continuation);
        this.b = bVar;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new f(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((f) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        b bVar = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            S<Boolean> s = bVar.m;
            this.a = 1;
            obj = s.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            com.amplitude.id.g gVar = bVar.f().a;
            com.amplitude.id.c a = gVar.a();
            String str = a.a;
            gVar.b(new com.amplitude.id.c(this.c, a.b), com.amplitude.id.i.b);
        }
        return Unit.INSTANCE;
    }
}
