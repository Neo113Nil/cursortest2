package io.ktor.utils.io;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118'X¦\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "", "awaitContent", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/lang/Throwable;)V", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "()Z", "Lkotlinx/io/Source;", "getReadBuffer", "()Lkotlinx/io/Source;", "getReadBuffer$annotations", "()V", "readBuffer", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ByteReadChannel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.utils.io.ByteReadChannel.Companion INSTANCE = io.ktor.utils.io.ByteReadChannel.Companion.Camera2StreamConfigurationMap;

    java.lang.Object awaitContent(int i, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    void cancel(java.lang.Throwable cause);

    java.lang.Throwable getClosedCause();

    kotlinx.io.Source getReadBuffer();

    boolean isClosedForRead();

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getReadBuffer$annotations() {
        }

        public static /* synthetic */ java.lang.Object awaitContent$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitContent");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return byteReadChannel.awaitContent(i, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel$Companion;", "", "<init>", "()V", "Lio/ktor/utils/io/ByteReadChannel;", "Empty", "Lio/ktor/utils/io/ByteReadChannel;", "getEmpty", "()Lio/ktor/utils/io/ByteReadChannel;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Companion {
        static final /* synthetic */ io.ktor.utils.io.ByteReadChannel.Companion Camera2StreamConfigurationMap = new io.ktor.utils.io.ByteReadChannel.Companion();
        private static final io.ktor.utils.io.ByteReadChannel Empty = new io.ktor.utils.io.ByteReadChannel() { // from class: io.ktor.utils.io.ByteReadChannel$Companion$Empty$1
            private final java.lang.Throwable closedCause;
            private final kotlinx.io.Source readBuffer = new kotlinx.io.Buffer();

            public static /* synthetic */ void getReadBuffer$annotations() {
            }

            @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
            public final void cancel(java.lang.Throwable cause) {
            }

            @Override // io.ktor.utils.io.ByteReadChannel
            public final boolean isClosedForRead() {
                return true;
            }

            @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
            public final java.lang.Throwable getClosedCause() {
                return this.closedCause;
            }

            @Override // io.ktor.utils.io.ByteReadChannel
            public final kotlinx.io.Source getReadBuffer() {
                return this.readBuffer;
            }

            @Override // io.ktor.utils.io.ByteReadChannel
            public final java.lang.Object awaitContent(int i, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
            }
        };

        private Companion() {
        }

        public final io.ktor.utils.io.ByteReadChannel getEmpty() {
            return Empty;
        }
    }
}
