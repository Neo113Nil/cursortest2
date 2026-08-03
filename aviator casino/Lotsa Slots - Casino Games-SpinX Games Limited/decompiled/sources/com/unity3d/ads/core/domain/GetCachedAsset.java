package com.unity3d.ads.core.domain;

/* compiled from: GetCachedAsset.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J\b\u0010\u000e\u001a\u00020\nH\u0003J\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0087\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/GetCachedAsset;", "", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "context", "Landroid/content/Context;", "cacheWebViewAssets", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Landroid/content/Context;Lcom/unity3d/ads/core/domain/CacheWebViewAssets;)V", "getBundledAsset", "Landroid/webkit/WebResourceResponse;", com.facebook.share.internal.ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "getCachedAsset", "getNotFoundResponse", "invoke", "webviewType", "", "tryGetWebViewAsset", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetCachedAsset {
    private final com.unity3d.ads.core.data.repository.CacheRepository cacheRepository;
    private final com.unity3d.ads.core.domain.CacheWebViewAssets cacheWebViewAssets;
    private final android.content.Context context;

    public GetCachedAsset(com.unity3d.ads.core.data.repository.CacheRepository cacheRepository, android.content.Context context, com.unity3d.ads.core.domain.CacheWebViewAssets cacheWebViewAssets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheWebViewAssets, "cacheWebViewAssets");
        this.cacheRepository = cacheRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    private final android.webkit.WebResourceResponse getNotFoundResponse() {
        return new android.webkit.WebResourceResponse("text/html", com.ironsource.B5.O, com.ironsource.InterfaceC3141l1.a.b.d, "Not Found", kotlin.collections.MapsKt.emptyMap(), new java.io.ByteArrayInputStream(new byte[0]));
    }

    public static /* synthetic */ android.webkit.WebResourceResponse invoke$default(com.unity3d.ads.core.domain.GetCachedAsset getCachedAsset, android.net.Uri uri, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    public final android.webkit.WebResourceResponse invoke(android.net.Uri uri, java.lang.String webviewType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webviewType, "webviewType");
        java.lang.String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -1921537799) {
                if (hashCode == -1920242293 && host.equals(com.unity3d.services.UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals(com.unity3d.services.UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, webviewType);
    }

    private final android.webkit.WebResourceResponse getBundledAsset(android.net.Uri uri) {
        java.lang.String substringAfter$default = kotlin.text.StringsKt.substringAfter$default(java.lang.String.valueOf(uri.getPath()), com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, (java.lang.String) null, 2, (java.lang.Object) null);
        try {
            java.io.InputStream open = this.context.getAssets().open(substringAfter$default);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "context.assets.open(fileName)");
            return new android.webkit.WebResourceResponse(com.unity3d.ads.core.extensions.StringExtensionsKt.guessMimeType(substringAfter$default), null, open);
        } catch (java.lang.Exception unused) {
            return getNotFoundResponse();
        }
    }

    private final android.webkit.WebResourceResponse getCachedAsset(android.net.Uri uri) {
        java.lang.Object runBlocking$default;
        java.lang.Object m10798constructorimpl;
        java.lang.String uri2 = uri.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.unity3d.ads.core.domain.GetCachedAsset$getCachedAsset$result$1(this, kotlin.text.StringsKt.substringAfterLast$default(uri2, com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, (java.lang.String) null, 2, (java.lang.Object) null), null), 1, null);
        com.unity3d.ads.core.data.model.CacheResult cacheResult = (com.unity3d.ads.core.data.model.CacheResult) runBlocking$default;
        if (cacheResult instanceof com.unity3d.ads.core.data.model.CacheResult.Success) {
            java.io.File file = ((com.unity3d.ads.core.data.model.CacheResult.Success) cacheResult).getCachedFile().getFile();
            if (file == null) {
                return null;
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.unity3d.ads.core.domain.GetCachedAsset getCachedAsset = this;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(new java.io.FileInputStream(file));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                m10798constructorimpl = null;
            }
            java.io.FileInputStream fileInputStream = (java.io.FileInputStream) m10798constructorimpl;
            if (fileInputStream == null) {
                return null;
            }
            java.lang.String filePath = file.getAbsolutePath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(filePath, "filePath");
            return new android.webkit.WebResourceResponse(com.unity3d.ads.core.extensions.StringExtensionsKt.guessMimeType(filePath), null, fileInputStream);
        }
        return getNotFoundResponse();
    }

    private final android.webkit.WebResourceResponse tryGetWebViewAsset(android.net.Uri uri, java.lang.String webviewType) {
        java.lang.Object m10798constructorimpl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(webviewType);
        sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        java.lang.String uri2 = uri.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        sb.append(kotlin.text.StringsKt.substringAfterLast$default(kotlin.text.StringsKt.substringBefore$default(uri2, "?", (java.lang.String) null, 2, (java.lang.Object) null), com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, (java.lang.String) null, 2, (java.lang.Object) null));
        java.lang.String sb2 = sb.toString();
        java.io.File file = this.cacheWebViewAssets.getCached().get(sb2);
        if (file == null) {
            return null;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.ads.core.domain.GetCachedAsset getCachedAsset = this;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(new java.io.FileInputStream(file));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = null;
        }
        java.io.FileInputStream fileInputStream = (java.io.FileInputStream) m10798constructorimpl;
        if (fileInputStream == null) {
            return null;
        }
        return new android.webkit.WebResourceResponse(com.unity3d.ads.core.extensions.StringExtensionsKt.guessMimeType(sb2), null, fileInputStream);
    }
}
