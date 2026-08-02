package com.bbflight.background_downloader;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@DebugMetadata(c = "com.bbflight.background_downloader.ParallelDownloadTaskWorker$chunkStatusUpdate$2", f = "ParallelDownloadTaskWorker.kt", i = {}, l = {217}, m = "invokeSuspend", n = {}, nl = {218}, s = {}, v = 2)
/* renamed from: com.bbflight.background_downloader.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0674v0 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ParallelDownloadTaskWorker b;
    public final /* synthetic */ String c;
    public final /* synthetic */ P0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0674v0(ParallelDownloadTaskWorker parallelDownloadTaskWorker, String str, P0 p0, String str2, Continuation<? super C0674v0> continuation) {
        super(1, continuation);
        this.b = parallelDownloadTaskWorker;
        this.c = str;
        this.d = p0;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new C0674v0(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((C0674v0) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            W0 w0 = W0.f;
            this.a = 1;
            if (this.b.s(this.c, w0, this.d, this.e, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
