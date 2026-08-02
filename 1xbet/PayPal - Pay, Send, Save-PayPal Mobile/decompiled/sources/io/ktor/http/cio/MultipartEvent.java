package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003\u0082\u0001\u0003\t\n\u000b"}, d2 = {"Lio/ktor/http/cio/MultipartEvent;", "", "<init>", "()V", "", "release", "Preamble", "MultipartPart", "Epilogue", "Lio/ktor/http/cio/MultipartEvent$Epilogue;", "Lio/ktor/http/cio/MultipartEvent$MultipartPart;", "Lio/ktor/http/cio/MultipartEvent$Preamble;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class MultipartEvent {
    public abstract void release();

    private MultipartEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/http/cio/MultipartEvent$Preamble;", "Lio/ktor/http/cio/MultipartEvent;", "Lkotlinx/io/Source;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(Lkotlinx/io/Source;)V", "", "release", "()V", "Lkotlinx/io/Source;", "getBody", "()Lkotlinx/io/Source;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Preamble extends io.ktor.http.cio.MultipartEvent {
        private final kotlinx.io.Source body;

        public final kotlinx.io.Source getBody() {
            return this.body;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Preamble(kotlinx.io.Source source) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            this.body = source;
        }

        @Override // io.ktor.http.cio.MultipartEvent
        public final void release() {
            this.body.close();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lio/ktor/http/cio/MultipartEvent$MultipartPart;", "Lio/ktor/http/cio/MultipartEvent;", "Lkotlinx/coroutines/Deferred;", "Lio/ktor/http/cio/HttpHeadersMap;", "headers", "Lio/ktor/utils/io/ByteReadChannel;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(Lkotlinx/coroutines/Deferred;Lio/ktor/utils/io/ByteReadChannel;)V", "", "release", "()V", "Lkotlinx/coroutines/Deferred;", "getHeaders", "()Lkotlinx/coroutines/Deferred;", "Lio/ktor/utils/io/ByteReadChannel;", "getBody", "()Lio/ktor/utils/io/ByteReadChannel;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MultipartPart extends io.ktor.http.cio.MultipartEvent {
        private final io.ktor.utils.io.ByteReadChannel body;
        private final kotlinx.coroutines.Deferred<io.ktor.http.cio.HttpHeadersMap> headers;

        public final kotlinx.coroutines.Deferred<io.ktor.http.cio.HttpHeadersMap> getHeaders() {
            return this.headers;
        }

        public final io.ktor.utils.io.ByteReadChannel getBody() {
            return this.body;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipartPart(kotlinx.coroutines.Deferred<io.ktor.http.cio.HttpHeadersMap> deferred, io.ktor.utils.io.ByteReadChannel byteReadChannel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deferred, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
            this.headers = deferred;
            this.body = byteReadChannel;
        }

        @Override // io.ktor.http.cio.MultipartEvent
        public final void release() {
            this.headers.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.cio.MultipartEvent$MultipartPart$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return io.ktor.http.cio.MultipartEvent.MultipartPart.m23363$r8$lambda$b0pvBHVtPVqJIAoqnH5mZx6Tr8(io.ktor.http.cio.MultipartEvent.MultipartPart.this, (java.lang.Throwable) obj);
                }
            });
            io.ktor.http.cio.MultipartJvmAndPosixKt.discardBlocking(this.body);
        }

        /* renamed from: $r8$lambda$b0pvBHVtPVqJIAoqnH5mZx6Tr-8, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m23363$r8$lambda$b0pvBHVtPVqJIAoqnH5mZx6Tr8(io.ktor.http.cio.MultipartEvent.MultipartPart multipartPart, java.lang.Throwable th) {
            if (th != null) {
                multipartPart.headers.getCompleted().release();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/http/cio/MultipartEvent$Epilogue;", "Lio/ktor/http/cio/MultipartEvent;", "Lkotlinx/io/Source;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(Lkotlinx/io/Source;)V", "", "release", "()V", "Lkotlinx/io/Source;", "getBody", "()Lkotlinx/io/Source;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Epilogue extends io.ktor.http.cio.MultipartEvent {
        private final kotlinx.io.Source body;

        public final kotlinx.io.Source getBody() {
            return this.body;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Epilogue(kotlinx.io.Source source) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            this.body = source;
        }

        @Override // io.ktor.http.cio.MultipartEvent
        public final void release() {
            this.body.close();
        }
    }

    public /* synthetic */ MultipartEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
