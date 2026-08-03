package io.ktor.client.plugins;

/* compiled from: BodyProgress.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\b\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/content/ProgressListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "withObservableDownload", "(Lio/ktor/client/statement/HttpResponse;Lio/ktor/client/content/ProgressListener;)Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "onDownload", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/content/ProgressListener;)V", "onUpload", "Lio/ktor/util/AttributeKey;", "UploadProgressListenerAttributeKey", "Lio/ktor/util/AttributeKey;", "DownloadProgressListenerAttributeKey", "Lio/ktor/client/plugins/api/ClientPlugin;", "BodyProgress", "Lio/ktor/client/plugins/api/ClientPlugin;", "getBodyProgress", "()Lio/ktor/client/plugins/api/ClientPlugin;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BodyProgressKt {
    private static final io.ktor.client.plugins.api.ClientPlugin<kotlin.Unit> BodyProgress;
    private static final io.ktor.util.AttributeKey<io.ktor.client.content.ProgressListener> DownloadProgressListenerAttributeKey;
    private static final io.ktor.util.AttributeKey<io.ktor.client.content.ProgressListener> UploadProgressListenerAttributeKey;

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.utils.io.ByteReadChannel withObservableDownload$lambda$1(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.client.statement.HttpResponse replaceResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replaceResponse, "$this$replaceResponse");
        return byteReadChannel;
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<kotlin.Unit> getBodyProgress() {
        return BodyProgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit BodyProgress$lambda$0(io.ktor.client.plugins.api.ClientPluginBuilder createClientPlugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.on(io.ktor.client.plugins.AfterRenderHook.INSTANCE, new io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$1(null));
        createClientPlugin.on(io.ktor.client.plugins.AfterReceiveHook.INSTANCE, new io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2(null));
        return kotlin.Unit.INSTANCE;
    }

    public static final io.ktor.client.statement.HttpResponse withObservableDownload(io.ktor.client.statement.HttpResponse httpResponse, io.ktor.client.content.ProgressListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        final io.ktor.utils.io.ByteReadChannel observable = io.ktor.client.utils.ByteChannelUtilsKt.observable(httpResponse.getRawContent(), httpResponse.getCoroutineContext(), io.ktor.http.HttpMessagePropertiesKt.contentLength(httpResponse), listener);
        return io.ktor.client.call.DelegatedCallKt.replaceResponse$default(httpResponse.getCall(), null, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.BodyProgressKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                io.ktor.utils.io.ByteReadChannel withObservableDownload$lambda$1;
                withObservableDownload$lambda$1 = io.ktor.client.plugins.BodyProgressKt.withObservableDownload$lambda$1(io.ktor.utils.io.ByteReadChannel.this, (io.ktor.client.statement.HttpResponse) obj);
                return withObservableDownload$lambda$1;
            }
        }, 1, null).getResponse();
    }

    public static final void onDownload(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.client.content.ProgressListener progressListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        if (progressListener == null) {
            httpRequestBuilder.getAttributes().remove(DownloadProgressListenerAttributeKey);
        } else {
            httpRequestBuilder.getAttributes().put(DownloadProgressListenerAttributeKey, progressListener);
        }
    }

    public static final void onUpload(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.client.content.ProgressListener progressListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        if (progressListener == null) {
            httpRequestBuilder.getAttributes().remove(UploadProgressListenerAttributeKey);
        } else {
            httpRequestBuilder.getAttributes().put(UploadProgressListenerAttributeKey, progressListener);
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
        UploadProgressListenerAttributeKey = new io.ktor.util.AttributeKey<>("UploadProgressListenerAttributeKey", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.content.ProgressListener.class);
        try {
            kType2 = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.content.ProgressListener.class);
        } catch (java.lang.Throwable unused2) {
        }
        DownloadProgressListenerAttributeKey = new io.ktor.util.AttributeKey<>("DownloadProgressListenerAttributeKey", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType2));
        BodyProgress = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("BodyProgress", new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.BodyProgressKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit BodyProgress$lambda$0;
                BodyProgress$lambda$0 = io.ktor.client.plugins.BodyProgressKt.BodyProgress$lambda$0((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
                return BodyProgress$lambda$0;
            }
        });
    }
}
