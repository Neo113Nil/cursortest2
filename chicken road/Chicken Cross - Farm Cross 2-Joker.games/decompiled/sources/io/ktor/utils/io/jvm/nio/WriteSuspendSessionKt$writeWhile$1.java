package io.ktor.utils.io.jvm.nio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WriteSuspendSession.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@DebugMetadata(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", i = {0, 0, 0}, l = {59}, m = "writeWhile", n = {"$this$writeWhile", "block", "done"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes7.dex */
final class WriteSuspendSessionKt$writeWhile$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    WriteSuspendSessionKt$writeWhile$1(Continuation<? super WriteSuspendSessionKt$writeWhile$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WriteSuspendSessionKt.writeWhile(null, null, this);
    }
}
