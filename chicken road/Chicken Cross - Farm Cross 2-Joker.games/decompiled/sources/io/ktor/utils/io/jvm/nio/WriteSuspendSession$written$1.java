package io.ktor.utils.io.jvm.nio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WriteSuspendSession.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSession", f = "WriteSuspendSession.kt", i = {}, l = {30, 32}, m = "written", n = {}, s = {})
/* loaded from: classes7.dex */
final class WriteSuspendSession$written$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WriteSuspendSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WriteSuspendSession$written$1(WriteSuspendSession writeSuspendSession, Continuation<? super WriteSuspendSession$written$1> continuation) {
        super(continuation);
        this.this$0 = writeSuspendSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.written(0, this);
    }
}
