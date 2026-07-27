package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CloseHookByteWriteChannel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.CloseHookByteWriteChannel", f = "CloseHookByteWriteChannel.kt", i = {}, l = {24, 25}, m = "flushAndClose", n = {}, s = {})
/* loaded from: classes7.dex */
final class CloseHookByteWriteChannel$flushAndClose$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CloseHookByteWriteChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloseHookByteWriteChannel$flushAndClose$1(CloseHookByteWriteChannel closeHookByteWriteChannel, Continuation<? super CloseHookByteWriteChannel$flushAndClose$1> continuation) {
        super(continuation);
        this.this$0 = closeHookByteWriteChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.flushAndClose(this);
    }
}
