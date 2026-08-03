package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidLocalCacheDataSource.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J5\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidLocalCacheDataSource;", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "createFile", "Lcom/unity3d/ads/core/domain/CreateFile;", "getFileExtensionFromUrl", "Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "(Lcom/unity3d/ads/core/domain/CreateFile;Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;)V", "getCreateFile", "()Lcom/unity3d/ads/core/domain/CreateFile;", "getGetFileExtensionFromUrl", "()Lcom/unity3d/ads/core/domain/GetFileExtensionFromUrl;", "getFile", "Lcom/unity3d/ads/core/data/model/CacheResult;", "cachePath", "Ljava/io/File;", "fileName", "", "url", "priority", "", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidLocalCacheDataSource implements com.unity3d.ads.core.data.datasource.CacheDataSource {
    private final com.unity3d.ads.core.domain.CreateFile createFile;
    private final com.unity3d.ads.core.domain.GetFileExtensionFromUrl getFileExtensionFromUrl;

    public AndroidLocalCacheDataSource(com.unity3d.ads.core.domain.CreateFile createFile, com.unity3d.ads.core.domain.GetFileExtensionFromUrl getFileExtensionFromUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createFile, "createFile");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
    }

    public final com.unity3d.ads.core.domain.CreateFile getCreateFile() {
        return this.createFile;
    }

    public final com.unity3d.ads.core.domain.GetFileExtensionFromUrl getGetFileExtensionFromUrl() {
        return this.getFileExtensionFromUrl;
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public java.lang.Object getFile(java.io.File file, java.lang.String str, java.lang.String str2, java.lang.Integer num, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation) {
        java.io.File invoke = this.createFile.invoke(file, str);
        if (invoke.exists()) {
            java.lang.String name = invoke.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "file.name");
            java.lang.String str3 = null;
            if (!kotlin.text.StringsKt.endsWith$default(name, ".part", false, 2, (java.lang.Object) null)) {
                java.lang.String str4 = str2;
                if (str4 != null && str4.length() != 0) {
                    str3 = this.getFileExtensionFromUrl.invoke(str2);
                }
                return new com.unity3d.ads.core.data.model.CacheResult.Success(new com.unity3d.ads.core.data.model.CachedFile(str2 == null ? "" : str2, str, invoke, str3 == null ? "" : str3, invoke.length(), null, num != null ? num.intValue() : Integer.MAX_VALUE, 32, null), com.unity3d.ads.core.data.model.CacheSource.LOCAL);
            }
        }
        return new com.unity3d.ads.core.data.model.CacheResult.Failure(com.unity3d.ads.core.data.model.CacheError.FILE_NOT_FOUND, com.unity3d.ads.core.data.model.CacheSource.LOCAL, null, 4, null);
    }
}
