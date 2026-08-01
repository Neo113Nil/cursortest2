package io.ktor.utils.io.jvm.javaio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Reading.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel", f = "Reading.kt", i = {0}, l = {69}, m = "awaitContent", n = {"min"}, s = {"I$0"})
/* loaded from: classes7.dex */
final class RawSourceChannel$awaitContent$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RawSourceChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawSourceChannel$awaitContent$1(RawSourceChannel rawSourceChannel, Continuation<? super RawSourceChannel$awaitContent$1> continuation) {
        super(continuation);
        this.this$0 = rawSourceChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitContent(0, this);
    }
}
