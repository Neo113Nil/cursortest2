package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlin/Function1;", "Lcom/izettle/android/net/HttpClient$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/izettle/android/net/HttpClient;", "httpClient", "(Lkotlin/jvm/functions/Function1;)Lcom/izettle/android/net/HttpClient;", "Lkotlin/Lazy;", "Ljava/util/concurrent/ThreadPoolExecutor;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "getHighSpeedVideoSizes"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HttpClientKt {
    private static final kotlin.Lazy<java.util.concurrent.ThreadPoolExecutor> getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.concurrent.ThreadPoolExecutor>() { // from class: com.izettle.android.net.HttpClientKt$httpClientExecutor$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final java.util.concurrent.ThreadPoolExecutor invoke() {
            return new java.util.concurrent.ThreadPoolExecutor(java.lang.Math.max(2, java.lang.Runtime.getRuntime().availableProcessors() / 2), Integer.MAX_VALUE, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue());
        }
    });

    public static final com.izettle.android.net.HttpClient httpClient(kotlin.jvm.functions.Function1<? super com.izettle.android.net.HttpClient.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.izettle.android.net.HttpClient.Builder builder = com.izettle.android.net.HttpClient.INSTANCE.builder();
        function1.invoke(builder);
        return builder.build();
    }
}
