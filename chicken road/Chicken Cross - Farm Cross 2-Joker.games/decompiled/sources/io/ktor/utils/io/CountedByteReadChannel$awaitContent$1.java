package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CountedByteReadChannel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.CountedByteReadChannel", f = "CountedByteReadChannel.kt", i = {}, l = {48}, m = "awaitContent", n = {}, s = {})
/* loaded from: classes7.dex */
final class CountedByteReadChannel$awaitContent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CountedByteReadChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CountedByteReadChannel$awaitContent$1(CountedByteReadChannel countedByteReadChannel, Continuation<? super CountedByteReadChannel$awaitContent$1> continuation) {
        super(continuation);
        this.this$0 = countedByteReadChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitContent(0, this);
    }
}
