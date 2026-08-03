package io.ktor.utils.io;

/* compiled from: ByteReadChannelOperations.jvm.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0, 0}, l = {114}, m = "skipDelimiter", n = {"$this$skipDelimiter", "delimiter", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes6.dex */
final class ByteReadChannelOperations_jvmKt$skipDelimiter$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    int I$1;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    ByteReadChannelOperations_jvmKt$skipDelimiter$2(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperations_jvmKt$skipDelimiter$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperations_jvmKt.skipDelimiter((io.ktor.utils.io.ByteReadChannel) null, (kotlinx.io.bytestring.ByteString) null, this);
    }
}
