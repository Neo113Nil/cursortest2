package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B6\u0012-\u0010\t\u001a)\b\u0001\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002j\u0004\b\u0001`\b¢\u0006\u0004\b\n\u0010\u000bRA\u0010\t\u001a)\b\u0001\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002j\u0004\b\u0001`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/client/plugins/ExceptionHandlerWrapper;", "Lio/ktor/client/plugins/HandlerWrapper;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "Lio/ktor/client/plugins/CallExceptionHandler;", "handler", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "getHandler", "()Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExceptionHandlerWrapper implements io.ktor.client.plugins.HandlerWrapper {
    private final kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> handler;

    /* JADX WARN: Multi-variable type inference failed */
    public ExceptionHandlerWrapper(kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.handler = function2;
    }

    public final kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHandler() {
        return this.handler;
    }
}
