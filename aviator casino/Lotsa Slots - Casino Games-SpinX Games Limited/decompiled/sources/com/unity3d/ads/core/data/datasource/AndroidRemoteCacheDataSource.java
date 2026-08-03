package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidRemoteCacheDataSource.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ5\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidRemoteCacheDataSource;", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "createFile", "Lcom/unity3d/ads/core/domain/CreateFile;", "getFileExtensionFromUrl", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/CreateFile;Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;Lcom/unity3d/ads/core/domain/HttpClientProvider;)V", "getFile", "Lcom/unity3d/ads/core/data/model/CacheResult;", "cachePath", "Ljava/io/File;", "fileName", "", "url", "priority", "", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidRemoteCacheDataSource implements com.unity3d.ads.core.data.datasource.CacheDataSource {
    private final com.unity3d.ads.core.domain.CreateFile createFile;
    private final com.unity3d.ads.core.domain.GetFileExtensionFromUrl getFileExtensionFromUrl;
    private final com.unity3d.ads.core.domain.HttpClientProvider httpClientProvider;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher;

    public AndroidRemoteCacheDataSource(kotlinx.coroutines.CoroutineDispatcher ioDispatcher, com.unity3d.ads.core.domain.CreateFile createFile, com.unity3d.ads.core.domain.GetFileExtensionFromUrl getFileExtensionFromUrl, com.unity3d.ads.core.domain.HttpClientProvider httpClientProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createFile, "createFile");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientProvider, "httpClientProvider");
        this.ioDispatcher = ioDispatcher;
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
        this.httpClientProvider = httpClientProvider;
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public java.lang.Object getFile(java.io.File file, java.lang.String str, java.lang.String str2, java.lang.Integer num, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.ioDispatcher, new com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource$getFile$2(str2, this, file, str, num, null), continuation);
    }
}
