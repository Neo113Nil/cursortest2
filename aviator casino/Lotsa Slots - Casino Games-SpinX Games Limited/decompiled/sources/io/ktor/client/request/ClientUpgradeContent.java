package io.ktor.client.request;

/* compiled from: ClientUpgradeContent.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/request/ClientUpgradeContent;", "Lio/ktor/http/content/OutgoingContent$NoContent;", "<init>", "()V", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "", "pipeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/Headers;", "headers", "verify", "(Lio/ktor/http/Headers;)V", "Lio/ktor/utils/io/ByteChannel;", "content$delegate", "Lkotlin/Lazy;", "getContent", "()Lio/ktor/utils/io/ByteChannel;", "content", "getOutput", "()Lio/ktor/utils/io/ByteWriteChannel;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ClientUpgradeContent extends io.ktor.http.content.OutgoingContent.NoContent {

    /* renamed from: content$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy content = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.request.ClientUpgradeContent$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            io.ktor.utils.io.ByteChannel content_delegate$lambda$0;
            content_delegate$lambda$0 = io.ktor.client.request.ClientUpgradeContent.content_delegate$lambda$0();
            return content_delegate$lambda$0;
        }
    });

    public abstract void verify(io.ktor.http.Headers headers);

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.ByteChannel content_delegate$lambda$0() {
        return new io.ktor.utils.io.ByteChannel(false, 1, null);
    }

    private final io.ktor.utils.io.ByteChannel getContent() {
        return (io.ktor.utils.io.ByteChannel) this.content.getValue();
    }

    public final io.ktor.utils.io.ByteWriteChannel getOutput() {
        return getContent();
    }

    public final java.lang.Object pipeTo(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object copyAndClose = io.ktor.utils.io.ByteReadChannelOperationsKt.copyAndClose(getContent(), byteWriteChannel, continuation);
        return copyAndClose == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? copyAndClose : kotlin.Unit.INSTANCE;
    }
}
