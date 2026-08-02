package io.ktor.utils.io;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0, 0}, l = {114}, m = "skipDelimiter", n = {"$this$skipDelimiter", "delimiter", "i"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes17.dex */
final class ByteReadChannelOperations_jvmKt$skipDelimiter$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return io.ktor.utils.io.ByteReadChannelOperations_jvmKt.skipDelimiter((io.ktor.utils.io.ByteReadChannel) null, (kotlinx.io.bytestring.ByteString) null, this);
    }

    ByteReadChannelOperations_jvmKt$skipDelimiter$2(kotlin.coroutines.Continuation<? super io.ktor.utils.io.ByteReadChannelOperations_jvmKt$skipDelimiter$2> continuation) {
        super(continuation);
    }
}
