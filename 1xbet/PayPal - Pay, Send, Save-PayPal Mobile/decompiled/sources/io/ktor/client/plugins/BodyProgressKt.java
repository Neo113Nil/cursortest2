package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\b\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f\"\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/content/ProgressListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "withObservableDownload", "(Lio/ktor/client/statement/HttpResponse;Lio/ktor/client/content/ProgressListener;)Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "onDownload", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/content/ProgressListener;)V", "onUpload", "Lio/ktor/util/AttributeKey;", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/util/AttributeKey;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lio/ktor/client/plugins/api/ClientPlugin;", "BodyProgress", "Lio/ktor/client/plugins/api/ClientPlugin;", "getBodyProgress", "()Lio/ktor/client/plugins/api/ClientPlugin;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BodyProgressKt {
    private static final io.ktor.client.plugins.api.ClientPlugin<kotlin.Unit> BodyProgress;
    private static final io.ktor.util.AttributeKey<io.ktor.client.content.ProgressListener> getHighResolutionOutputSizeshNQ4ISI;
    private static final io.ktor.util.AttributeKey<io.ktor.client.content.ProgressListener> getHighSpeedVideoSizes;

    public static final io.ktor.client.plugins.api.ClientPlugin<kotlin.Unit> getBodyProgress() {
        return BodyProgress;
    }

    public static final io.ktor.client.statement.HttpResponse withObservableDownload(io.ktor.client.statement.HttpResponse httpResponse, io.ktor.client.content.ProgressListener progressListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressListener, "");
        final io.ktor.utils.io.ByteReadChannel observable = io.ktor.client.utils.ByteChannelUtilsKt.observable(httpResponse.getRawContent(), httpResponse.getCoroutineContext(), io.ktor.http.HttpMessagePropertiesKt.contentLength(httpResponse), progressListener);
        return io.ktor.client.call.DelegatedCallKt.replaceResponse$default(httpResponse.getCall(), null, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.BodyProgressKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.BodyProgressKt.$r8$lambda$qgf2JYWWoPwjFJoPCQI71a9hS3k(io.ktor.utils.io.ByteReadChannel.this, (io.ktor.client.statement.HttpResponse) obj);
            }
        }, 1, null).getResponse();
    }

    public static final void onDownload(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.client.content.ProgressListener progressListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        if (progressListener == null) {
            httpRequestBuilder.getAttributes().remove(getHighSpeedVideoSizes);
        } else {
            httpRequestBuilder.getAttributes().put(getHighSpeedVideoSizes, progressListener);
        }
    }

    public static final void onUpload(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.client.content.ProgressListener progressListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        if (progressListener == null) {
            httpRequestBuilder.getAttributes().remove(getHighResolutionOutputSizeshNQ4ISI);
        } else {
            httpRequestBuilder.getAttributes().put(getHighResolutionOutputSizeshNQ4ISI, progressListener);
        }
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.content.ProgressListener.class);
        kotlin.reflect.KType kType2 = null;
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.content.ProgressListener.class);
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        getHighResolutionOutputSizeshNQ4ISI = new io.ktor.util.AttributeKey<>("UploadProgressListenerAttributeKey", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.content.ProgressListener.class);
        try {
            kType2 = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.content.ProgressListener.class);
        } catch (java.lang.Throwable unused2) {
        }
        getHighSpeedVideoSizes = new io.ktor.util.AttributeKey<>("DownloadProgressListenerAttributeKey", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType2));
        BodyProgress = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("BodyProgress", new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.BodyProgressKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.BodyProgressKt.$r8$lambda$e8pXuMq_fdrM0l4z_TFdjeGYKPI((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e8pXuMq_fdrM0l4z_TFdjeGYKPI(io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientPluginBuilder, "");
        clientPluginBuilder.on(io.ktor.client.plugins.AfterRenderHook.INSTANCE, new io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$1(null));
        clientPluginBuilder.on(io.ktor.client.plugins.AfterReceiveHook.INSTANCE, new io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2(null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel $r8$lambda$qgf2JYWWoPwjFJoPCQI71a9hS3k(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.client.statement.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        return byteReadChannel;
    }
}
