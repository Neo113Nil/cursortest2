package io.ktor.client.request.forms;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0012\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getHighResolutionOutputSizeshNQ4ISI", "[B", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FormDataContentKt {
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = io.ktor.utils.io.core.StringsKt.toByteArray$default(io.ktor.sse.ServerSentEventKt.END_OF_LINE, null, 1, null);

    public static final /* synthetic */ java.lang.Object access$copyTo(kotlinx.io.Source source, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation continuation) {
        java.lang.Object writePacket = io.ktor.utils.io.ByteWriteChannelOperationsKt.writePacket(byteWriteChannel, source, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        return writePacket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writePacket : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.String access$generateBoundary() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < 32; i++) {
            java.lang.String num = java.lang.Integer.toString(kotlin.random.Random.INSTANCE.nextInt(), kotlin.text.CharsKt.checkRadix(16));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
            sb.append(num);
        }
        return kotlin.text.StringsKt.take(sb.toString(), 70);
    }
}
