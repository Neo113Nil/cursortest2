package io.ktor.client.request;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u000e\u001a\u00020\r8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lio/ktor/client/request/ClientUpgradeContent;", "Lio/ktor/http/content/OutgoingContent$NoContent;", "<init>", "()V", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "", "pipeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/Headers;", "headers", "verify", "(Lio/ktor/http/Headers;)V", "Lio/ktor/utils/io/ByteChannel;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "getOutput", "()Lio/ktor/utils/io/ByteWriteChannel;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ClientUpgradeContent extends io.ktor.http.content.OutgoingContent.NoContent {
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.request.ClientUpgradeContent$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return io.ktor.client.request.ClientUpgradeContent.$r8$lambda$V1_kykRHVK70sgc2C_khxQSrvQ8();
        }
    });

    public abstract void verify(io.ktor.http.Headers headers);

    public static /* synthetic */ io.ktor.utils.io.ByteChannel $r8$lambda$V1_kykRHVK70sgc2C_khxQSrvQ8() {
        return new io.ktor.utils.io.ByteChannel(false, 1, null);
    }

    public final io.ktor.utils.io.ByteWriteChannel getOutput() {
        return (io.ktor.utils.io.ByteChannel) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    public final java.lang.Object pipeTo(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object copyAndClose = io.ktor.utils.io.ByteReadChannelOperationsKt.copyAndClose((io.ktor.utils.io.ByteChannel) this.getHighResolutionOutputSizeshNQ4ISI.getValue(), byteWriteChannel, continuation);
        return copyAndClose == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? copyAndClose : kotlin.Unit.INSTANCE;
    }
}
