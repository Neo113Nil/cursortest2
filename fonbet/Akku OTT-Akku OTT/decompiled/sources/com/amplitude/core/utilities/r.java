package com.amplitude.core.utilities;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.MatchResult;
import kotlinx.coroutines.K;

@DebugMetadata(c = "com.amplitude.core.utilities.FileResponseHandler$removeCallbackByInsertId$1$1", f = "FileResponseHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class r extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    public final /* synthetic */ q a;
    public final /* synthetic */ MatchResult b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, MatchResult matchResult, Continuation<? super r> continuation) {
        super(2, continuation);
        this.a = qVar;
        this.b = matchResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new r(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((r) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.a.a.j(this.b.getGroupValues().get(1));
        return Unit.INSTANCE;
    }
}
