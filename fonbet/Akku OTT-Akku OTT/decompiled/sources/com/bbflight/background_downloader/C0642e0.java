package com.bbflight.background_downloader;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@DebugMetadata(c = "com.bbflight.background_downloader.HoldingQueue$advanceQueueInFuture$1", f = "HoldingQueue.kt", i = {}, l = {211, 212}, m = "invokeSuspend", n = {}, nl = {212, 213}, s = {}, v = 2)
/* renamed from: com.bbflight.background_downloader.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0642e0 extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ C0638c0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0642e0(C0638c0 c0638c0, Continuation<? super C0642e0> continuation) {
        super(2, continuation);
        this.b = c0638c0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0642e0(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
        return ((C0642e0) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (com.bbflight.background_downloader.C0638c0.a(r2, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (kotlinx.coroutines.W.b(10000, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        C0638c0 c0638c0 = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c0638c0.d();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.a = 2;
    }
}
