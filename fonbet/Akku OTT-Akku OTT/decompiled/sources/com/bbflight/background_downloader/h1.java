package com.bbflight.background_downloader;

import androidx.work.Operation;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker$Companion$processStatusUpdate$3", f = "TaskWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes3.dex */
public final class h1 extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Operation.State.SUCCESS>, Object> {
    public final /* synthetic */ Operation a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Operation operation, Continuation<? super h1> continuation) {
        super(2, continuation);
        this.a = operation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new h1(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Operation.State.SUCCESS> continuation) {
        return ((h1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return this.a.getResult().get();
    }
}
