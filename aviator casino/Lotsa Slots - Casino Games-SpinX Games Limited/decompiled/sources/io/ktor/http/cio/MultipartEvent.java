package io.ktor.http.cio;

/* compiled from: Multipart.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/cio/MultipartEvent;", "", "<init>", "()V", "", "release", "Preamble", "MultipartPart", "Epilogue", "Lio/ktor/http/cio/MultipartEvent$Epilogue;", "Lio/ktor/http/cio/MultipartEvent$MultipartPart;", "Lio/ktor/http/cio/MultipartEvent$Preamble;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class MultipartEvent {
    public /* synthetic */ MultipartEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void release();

    private MultipartEvent() {
    }

    /* compiled from: Multipart.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/cio/MultipartEvent$Preamble;", "Lio/ktor/http/cio/MultipartEvent;", "Lkotlinx/io/Source;", "body", "<init>", "(Lkotlinx/io/Source;)V", "", "release", "()V", "Lkotlinx/io/Source;", "getBody", "()Lkotlinx/io/Source;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Preamble extends io.ktor.http.cio.MultipartEvent {
        private final kotlinx.io.Source body;

        public final kotlinx.io.Source getBody() {
            return this.body;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Preamble(kotlinx.io.Source body) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
            this.body = body;
        }

        @Override // io.ktor.http.cio.MultipartEvent
        public void release() {
            this.body.close();
        }
    }

    /* compiled from: Multipart.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/http/cio/MultipartEvent$MultipartPart;", "Lio/ktor/http/cio/MultipartEvent;", "Lkotlinx/coroutines/Deferred;", "Lio/ktor/http/cio/HttpHeadersMap;", "headers", "Lio/ktor/utils/io/ByteReadChannel;", "body", "<init>", "(Lkotlinx/coroutines/Deferred;Lio/ktor/utils/io/ByteReadChannel;)V", "", "release", "()V", "Lkotlinx/coroutines/Deferred;", "getHeaders", "()Lkotlinx/coroutines/Deferred;", "Lio/ktor/utils/io/ByteReadChannel;", "getBody", "()Lio/ktor/utils/io/ByteReadChannel;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
        public MultipartPart(kotlinx.coroutines.Deferred<io.ktor.http.cio.HttpHeadersMap> headers, io.ktor.utils.io.ByteReadChannel body) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
            this.headers = headers;
            this.body = body;
        }

        @Override // io.ktor.http.cio.MultipartEvent
        public void release() {
            this.headers.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.cio.MultipartEvent$MultipartPart$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit release$lambda$0;
                    release$lambda$0 = io.ktor.http.cio.MultipartEvent.MultipartPart.release$lambda$0(io.ktor.http.cio.MultipartEvent.MultipartPart.this, (java.lang.Throwable) obj);
                    return release$lambda$0;
                }
            });
            io.ktor.http.cio.MultipartJvmAndPosixKt.discardBlocking(this.body);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit release$lambda$0(io.ktor.http.cio.MultipartEvent.MultipartPart multipartPart, java.lang.Throwable th) {
            if (th != null) {
                multipartPart.headers.getCompleted().release();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* compiled from: Multipart.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/cio/MultipartEvent$Epilogue;", "Lio/ktor/http/cio/MultipartEvent;", "Lkotlinx/io/Source;", "body", "<init>", "(Lkotlinx/io/Source;)V", "", "release", "()V", "Lkotlinx/io/Source;", "getBody", "()Lkotlinx/io/Source;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Epilogue extends io.ktor.http.cio.MultipartEvent {
        private final kotlinx.io.Source body;

        public final kotlinx.io.Source getBody() {
            return this.body;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Epilogue(kotlinx.io.Source body) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
            this.body = body;
        }

        @Override // io.ktor.http.cio.MultipartEvent
        public void release() {
            this.body.close();
        }
    }
}
