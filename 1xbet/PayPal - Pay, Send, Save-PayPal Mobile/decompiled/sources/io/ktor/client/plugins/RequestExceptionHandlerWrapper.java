package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BA\u00128\u0010\n\u001a4\b\u0001\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002j\u0004\b\u0001`\t¢\u0006\u0004\b\u000b\u0010\fRI\u0010\n\u001a4\b\u0001\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002j\u0004\b\u0001`\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lio/ktor/client/plugins/RequestExceptionHandlerWrapper;", "Lio/ktor/client/plugins/HandlerWrapper;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "Lio/ktor/client/request/HttpRequest;", "Lkotlin/coroutines/Continuation;", "", "", "Lio/ktor/client/plugins/CallRequestExceptionHandler;", "handler", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function3;", "getHandler", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RequestExceptionHandlerWrapper implements io.ktor.client.plugins.HandlerWrapper {
    private final kotlin.jvm.functions.Function3<java.lang.Throwable, io.ktor.client.request.HttpRequest, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> handler;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestExceptionHandlerWrapper(kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super io.ktor.client.request.HttpRequest, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        this.handler = function3;
    }

    public final kotlin.jvm.functions.Function3<java.lang.Throwable, io.ktor.client.request.HttpRequest, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHandler() {
        return this.handler;
    }
}
