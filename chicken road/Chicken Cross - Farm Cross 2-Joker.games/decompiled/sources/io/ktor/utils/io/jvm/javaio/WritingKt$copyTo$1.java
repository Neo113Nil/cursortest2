package io.ktor.utils.io.jvm.javaio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Writing.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.WritingKt", f = "Writing.kt", i = {0, 0, 0}, l = {25}, m = "copyTo", n = {"$this$copyTo", "out", "result"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes7.dex */
final class WritingKt$copyTo$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    WritingKt$copyTo$1(Continuation<? super WritingKt$copyTo$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WritingKt.copyTo(null, null, 0L, this);
    }
}
