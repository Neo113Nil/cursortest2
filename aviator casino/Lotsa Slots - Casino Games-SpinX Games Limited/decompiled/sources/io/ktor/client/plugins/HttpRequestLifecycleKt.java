package io.ktor.client.plugins;

/* compiled from: HttpRequestLifecycle.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", "requestJob", "Lkotlinx/coroutines/Job;", "clientEngineJob", "", "attachToClientEngineJob", "(Lkotlinx/coroutines/CompletableJob;Lkotlinx/coroutines/Job;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/client/plugins/api/ClientPlugin;", "HttpRequestLifecycle", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpRequestLifecycle", "()Lio/ktor/client/plugins/api/ClientPlugin;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpRequestLifecycleKt {
    private static final org.slf4j.Logger LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpRequestLifecycle");
    private static final io.ktor.client.plugins.api.ClientPlugin<kotlin.Unit> HttpRequestLifecycle = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("RequestLifecycle", new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpRequestLifecycleKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit HttpRequestLifecycle$lambda$0;
            HttpRequestLifecycle$lambda$0 = io.ktor.client.plugins.HttpRequestLifecycleKt.HttpRequestLifecycle$lambda$0((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            return HttpRequestLifecycle$lambda$0;
        }
    });

    public static final io.ktor.client.plugins.api.ClientPlugin<kotlin.Unit> getHttpRequestLifecycle() {
        return HttpRequestLifecycle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit HttpRequestLifecycle$lambda$0(io.ktor.client.plugins.api.ClientPluginBuilder createClientPlugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.on(io.ktor.client.plugins.SetupRequestContext.INSTANCE, new io.ktor.client.plugins.HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(createClientPlugin, null));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachToClientEngineJob(final kotlinx.coroutines.CompletableJob completableJob, kotlinx.coroutines.Job job) {
        final kotlinx.coroutines.DisposableHandle invokeOnCompletion = job.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpRequestLifecycleKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit attachToClientEngineJob$lambda$1;
                attachToClientEngineJob$lambda$1 = io.ktor.client.plugins.HttpRequestLifecycleKt.attachToClientEngineJob$lambda$1(kotlinx.coroutines.CompletableJob.this, (java.lang.Throwable) obj);
                return attachToClientEngineJob$lambda$1;
            }
        });
        completableJob.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpRequestLifecycleKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit attachToClientEngineJob$lambda$2;
                attachToClientEngineJob$lambda$2 = io.ktor.client.plugins.HttpRequestLifecycleKt.attachToClientEngineJob$lambda$2(kotlinx.coroutines.DisposableHandle.this, (java.lang.Throwable) obj);
                return attachToClientEngineJob$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit attachToClientEngineJob$lambda$1(kotlinx.coroutines.CompletableJob completableJob, java.lang.Throwable th) {
        if (th != null) {
            LOGGER.trace("Cancelling request because engine Job failed with error: " + th);
            kotlinx.coroutines.JobKt.cancel(completableJob, "Engine failed", th);
        } else {
            LOGGER.trace("Cancelling request because engine Job completed");
            completableJob.complete();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit attachToClientEngineJob$lambda$2(kotlinx.coroutines.DisposableHandle disposableHandle, java.lang.Throwable th) {
        disposableHandle.dispose();
        return kotlin.Unit.INSTANCE;
    }
}
