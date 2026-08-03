package io.ktor.client.plugins.observer;

/* compiled from: ResponseObserver.kt */
@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\u00072&\u0010\t\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u000f\u0010\u0010RB\u0010\u0011\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u000bR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lio/ktor/client/plugins/observer/ResponseObserverConfig;", "", "<init>", "()V", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/coroutines/Continuation;", "", "Lio/ktor/client/plugins/observer/ResponseHandler;", "block", "onResponse", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "Lio/ktor/client/call/HttpClientCall;", "", "filter", "(Lkotlin/jvm/functions/Function1;)V", "responseHandler", "Lkotlin/jvm/functions/Function2;", "getResponseHandler$ktor_client_core", "()Lkotlin/jvm/functions/Function2;", "setResponseHandler$ktor_client_core", "Lkotlin/jvm/functions/Function1;", "getFilter$ktor_client_core", "()Lkotlin/jvm/functions/Function1;", "setFilter$ktor_client_core", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResponseObserverConfig {
    private kotlin.jvm.functions.Function1<? super io.ktor.client.call.HttpClientCall, java.lang.Boolean> filter;
    private kotlin.jvm.functions.Function2<? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> responseHandler = new io.ktor.client.plugins.observer.ResponseObserverConfig$responseHandler$1(null);

    public final kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getResponseHandler$ktor_client_core() {
        return this.responseHandler;
    }

    public final void setResponseHandler$ktor_client_core(kotlin.jvm.functions.Function2<? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.responseHandler = function2;
    }

    public final kotlin.jvm.functions.Function1<io.ktor.client.call.HttpClientCall, java.lang.Boolean> getFilter$ktor_client_core() {
        return this.filter;
    }

    public final void setFilter$ktor_client_core(kotlin.jvm.functions.Function1<? super io.ktor.client.call.HttpClientCall, java.lang.Boolean> function1) {
        this.filter = function1;
    }

    public final void onResponse(kotlin.jvm.functions.Function2<? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        this.responseHandler = block;
    }

    public final void filter(kotlin.jvm.functions.Function1<? super io.ktor.client.call.HttpClientCall, java.lang.Boolean> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        this.filter = block;
    }
}
