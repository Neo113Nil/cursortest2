package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00060\u0000j\u0002`\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "getHighSpeedVideoFpsRangesFor", "Lorg/slf4j/Logger;", "getHighSpeedVideoFpsRanges", "Lio/ktor/client/plugins/api/ClientPlugin;", "", "HttpRequestLifecycle", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpRequestLifecycle", "()Lio/ktor/client/plugins/api/ClientPlugin;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpRequestLifecycleKt {
    private static final org.slf4j.Logger getHighSpeedVideoFpsRangesFor = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpRequestLifecycle");
    private static final io.ktor.client.plugins.api.ClientPlugin<kotlin.Unit> HttpRequestLifecycle = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("RequestLifecycle", new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpRequestLifecycleKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return io.ktor.client.plugins.HttpRequestLifecycleKt.m23252$r8$lambda$byRJmO_07LPpHjj3G6LEVFaiU((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
        }
    });

    public static final io.ktor.client.plugins.api.ClientPlugin<kotlin.Unit> getHttpRequestLifecycle() {
        return HttpRequestLifecycle;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KiWKWciHDdVwDbvHa4FSIMe9cOY(kotlinx.coroutines.CompletableJob completableJob, java.lang.Throwable th) {
        if (th != null) {
            getHighSpeedVideoFpsRangesFor.trace("Cancelling request because engine Job failed with error: ".concat(java.lang.String.valueOf(th)));
            kotlinx.coroutines.JobKt.cancel(completableJob, "Engine failed", th);
        } else {
            getHighSpeedVideoFpsRangesFor.trace("Cancelling request because engine Job completed");
            completableJob.complete();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P3U3igRDtXG6ggFRRqgOI2A8sY4(kotlinx.coroutines.DisposableHandle disposableHandle, java.lang.Throwable th) {
        disposableHandle.dispose();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$byRJmO_07L-PpHjj3G6-LEVFaiU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23252$r8$lambda$byRJmO_07LPpHjj3G6LEVFaiU(io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientPluginBuilder, "");
        clientPluginBuilder.on(io.ktor.client.plugins.SetupRequestContext.INSTANCE, new io.ktor.client.plugins.HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(clientPluginBuilder, null));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$attachToClientEngineJob(final kotlinx.coroutines.CompletableJob completableJob, kotlinx.coroutines.Job job) {
        final kotlinx.coroutines.DisposableHandle invokeOnCompletion = job.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpRequestLifecycleKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.HttpRequestLifecycleKt.$r8$lambda$KiWKWciHDdVwDbvHa4FSIMe9cOY(kotlinx.coroutines.CompletableJob.this, (java.lang.Throwable) obj);
            }
        });
        completableJob.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpRequestLifecycleKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.HttpRequestLifecycleKt.$r8$lambda$P3U3igRDtXG6ggFRRqgOI2A8sY4(kotlinx.coroutines.DisposableHandle.this, (java.lang.Throwable) obj);
            }
        });
    }
}
