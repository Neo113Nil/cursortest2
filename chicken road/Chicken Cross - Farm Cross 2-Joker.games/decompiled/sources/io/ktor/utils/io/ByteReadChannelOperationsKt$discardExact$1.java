package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ByteReadChannelOperations.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperationsKt", f = "ByteReadChannelOperations.kt", i = {0}, l = {385}, m = "discardExact", n = {"value"}, s = {"J$0"})
/* loaded from: classes7.dex */
final class ByteReadChannelOperationsKt$discardExact$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;

    ByteReadChannelOperationsKt$discardExact$1(Continuation<? super ByteReadChannelOperationsKt$discardExact$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperationsKt.discardExact(null, 0L, this);
    }
}
