package com.amplitude.android;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.K;
import kotlinx.coroutines.S;

@DebugMetadata(c = "com.amplitude.android.Amplitude$reset$1", f = "Amplitude.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class e extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new e(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((e) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        a aVar = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            S<Boolean> s = aVar.m;
            this.a = 1;
            if (s.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        com.amplitude.id.g gVar = aVar.f().a;
        c cVar = null;
        gVar.b(new com.amplitude.id.c(gVar.a().a, null), com.amplitude.id.i.b);
        c cVar2 = aVar.q;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("androidContextPlugin");
        } else {
            cVar = cVar2;
        }
        h hVar = aVar.a;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        cVar.i(hVar);
        return Unit.INSTANCE;
    }
}
