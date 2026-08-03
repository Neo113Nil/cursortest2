package io.ktor.client.plugins.observer;

/* compiled from: ResponseObserver.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a=\u0010\b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00002&\u0010\u0007\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001j\u0002`\u0006¢\u0006\u0004\b\b\u0010\t\"#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\u0012\n\u0004\b\b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e*B\u0010\u0011\"\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¨\u0006\u0012"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/coroutines/Continuation;", "", "", "Lio/ktor/client/plugins/observer/ResponseHandler;", "block", "ResponseObserver", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function2;)V", "Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/client/plugins/observer/ResponseObserverConfig;", "Lio/ktor/client/plugins/api/ClientPlugin;", "getResponseObserver", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getResponseObserver$annotations", "()V", "ResponseHandler", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResponseObserverKt {
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.observer.ResponseObserverConfig> ResponseObserver = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("ResponseObserver", io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$1.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.observer.ResponseObserverKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit ResponseObserver$lambda$0;
            ResponseObserver$lambda$0 = io.ktor.client.plugins.observer.ResponseObserverKt.ResponseObserver$lambda$0((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            return ResponseObserver$lambda$0;
        }
    });

    public static /* synthetic */ void getResponseObserver$annotations() {
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.observer.ResponseObserverConfig> getResponseObserver() {
        return ResponseObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit ResponseObserver$lambda$0(io.ktor.client.plugins.api.ClientPluginBuilder createClientPlugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        kotlin.jvm.functions.Function2<io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> responseHandler$ktor_client_core = ((io.ktor.client.plugins.observer.ResponseObserverConfig) createClientPlugin.getPluginConfig()).getResponseHandler$ktor_client_core();
        createClientPlugin.on(io.ktor.client.plugins.observer.AfterReceiveHook.INSTANCE, new io.ktor.client.plugins.observer.ResponseObserverKt$ResponseObserver$2$1(((io.ktor.client.plugins.observer.ResponseObserverConfig) createClientPlugin.getPluginConfig()).getFilter$ktor_client_core(), createClientPlugin, responseHandler$ktor_client_core, null));
        return kotlin.Unit.INSTANCE;
    }

    public static final void ResponseObserver(io.ktor.client.HttpClientConfig<?> httpClientConfig, final kotlin.jvm.functions.Function2<? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        httpClientConfig.install(ResponseObserver, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.observer.ResponseObserverKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit ResponseObserver$lambda$1;
                ResponseObserver$lambda$1 = io.ktor.client.plugins.observer.ResponseObserverKt.ResponseObserver$lambda$1(kotlin.jvm.functions.Function2.this, (io.ktor.client.plugins.observer.ResponseObserverConfig) obj);
                return ResponseObserver$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit ResponseObserver$lambda$1(kotlin.jvm.functions.Function2 function2, io.ktor.client.plugins.observer.ResponseObserverConfig install) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(install, "$this$install");
        install.setResponseHandler$ktor_client_core(function2);
        return kotlin.Unit.INSTANCE;
    }
}
