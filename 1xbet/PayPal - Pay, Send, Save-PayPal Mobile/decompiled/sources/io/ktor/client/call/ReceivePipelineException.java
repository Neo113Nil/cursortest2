package io.ktor.client.call;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lio/ktor/client/call/ReceivePipelineException;", "Ljava/lang/IllegalStateException;", "Lkotlin/Camera2StreamConfigurationMap;", "Lio/ktor/client/call/HttpClientCall;", "request", "Lio/ktor/util/reflect/TypeInfo;", "info", "", "cause", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Throwable;)V", "Lio/ktor/client/call/HttpClientCall;", "getRequest", "()Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/util/reflect/TypeInfo;", "getInfo", "()Lio/ktor/util/reflect/TypeInfo;", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReceivePipelineException extends java.lang.IllegalStateException {
    private final java.lang.Throwable cause;
    private final io.ktor.util.reflect.TypeInfo info;
    private final io.ktor.client.call.HttpClientCall request;

    public final io.ktor.client.call.HttpClientCall getRequest() {
        return this.request;
    }

    public final io.ktor.util.reflect.TypeInfo getInfo() {
        return this.info;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return this.cause;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceivePipelineException(io.ktor.client.call.HttpClientCall httpClientCall, io.ktor.util.reflect.TypeInfo typeInfo, java.lang.Throwable th) {
        super("Fail to run receive pipeline: ".concat(java.lang.String.valueOf(th)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientCall, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        this.request = httpClientCall;
        this.info = typeInfo;
        this.cause = th;
    }
}
