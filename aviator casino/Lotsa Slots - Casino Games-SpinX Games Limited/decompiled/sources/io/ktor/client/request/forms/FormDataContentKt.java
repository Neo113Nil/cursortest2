package io.ktor.client.request.forms;

/* compiled from: FormDataContent.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a \u0010\b\u001a\u00020\u0007*\u00060\u0003j\u0002`\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "generateBoundary", "()Ljava/lang/String;", "Lkotlinx/io/Source;", "Lio/ktor/utils/io/core/Input;", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "", "copyTo", "(Lkotlinx/io/Source;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "RN_BYTES", "[B", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FormDataContentKt {
    private static final byte[] RN_BYTES = io.ktor.utils.io.core.StringsKt.toByteArray$default(io.ktor.sse.ServerSentEventKt.END_OF_LINE, null, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String generateBoundary() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < 32; i++) {
            java.lang.String num = java.lang.Integer.toString(kotlin.random.Random.INSTANCE.nextInt(), kotlin.text.CharsKt.checkRadix(16));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
            sb.append(num);
        }
        return kotlin.text.StringsKt.take(sb.toString(), 70);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object copyTo(kotlinx.io.Source source, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object writePacket = io.ktor.utils.io.ByteWriteChannelOperationsKt.writePacket(byteWriteChannel, source, continuation);
        return writePacket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writePacket : kotlin.Unit.INSTANCE;
    }
}
