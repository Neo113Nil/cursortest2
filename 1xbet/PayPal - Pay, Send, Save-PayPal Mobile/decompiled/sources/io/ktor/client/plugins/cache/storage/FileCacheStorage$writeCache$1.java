package io.ktor.client.plugins.cache.storage;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 11, 12, 12, 13, 13}, l = {186, 187, 188, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 193, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 197, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 199, 201, 202, 204, 205}, m = "writeCache", n = {"channel", com.datadog.trace.api.DDSpanTypes.CACHE, "channel", com.datadog.trace.api.DDSpanTypes.CACHE, "channel", com.datadog.trace.api.DDSpanTypes.CACHE, "channel", com.datadog.trace.api.DDSpanTypes.CACHE, "channel", com.datadog.trace.api.DDSpanTypes.CACHE, "headers", "channel", com.datadog.trace.api.DDSpanTypes.CACHE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "channel", com.datadog.trace.api.DDSpanTypes.CACHE, "channel", com.datadog.trace.api.DDSpanTypes.CACHE, "channel", com.datadog.trace.api.DDSpanTypes.CACHE, "channel", com.datadog.trace.api.DDSpanTypes.CACHE, "channel", com.datadog.trace.api.DDSpanTypes.CACHE, "channel", com.datadog.trace.api.DDSpanTypes.CACHE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "channel", com.datadog.trace.api.DDSpanTypes.CACHE, "channel", com.datadog.trace.api.DDSpanTypes.CACHE}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes17.dex */
final class FileCacheStorage$writeCache$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ io.ktor.client.plugins.cache.storage.FileCacheStorage getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.cache.storage.FileCacheStorage.getHighSpeedVideoFpsRanges(this.getOutputFormats, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$writeCache$1(io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$1> continuation) {
        super(continuation);
        this.getOutputFormats = fileCacheStorage;
    }
}
