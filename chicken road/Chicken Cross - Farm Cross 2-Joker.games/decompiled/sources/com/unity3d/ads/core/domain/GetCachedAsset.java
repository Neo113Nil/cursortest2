package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.facebook.share.internal.ShareConstants;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4761z5;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.io.files.FileSystemKt;

/* compiled from: GetCachedAsset.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0003J\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0003J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0003J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/GetCachedAsset;", "", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "context", "Landroid/content/Context;", "cacheWebViewAssets", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "getAssetFileName", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "<init>", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Landroid/content/Context;Lcom/unity3d/ads/core/domain/CacheWebViewAssets;Lcom/unity3d/ads/core/domain/GetAssetFileName;)V", "getNotFoundResponse", "Landroid/webkit/WebResourceResponse;", "invoke", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "webviewType", "", "getLegacyCachedAsset", "getBundledAsset", "tryGetWebViewAsset", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCachedAsset {
    private final CacheRepository cacheRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final Context context;
    private final GetAssetFileName getAssetFileName;
    private final SessionRepository sessionRepository;

    public GetCachedAsset(CacheRepository cacheRepository, SessionRepository sessionRepository, Context context, CacheWebViewAssets cacheWebViewAssets, GetAssetFileName getAssetFileName) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheWebViewAssets, "cacheWebViewAssets");
        Intrinsics.checkNotNullParameter(getAssetFileName, "getAssetFileName");
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
        this.getAssetFileName = getAssetFileName;
    }

    private final WebResourceResponse getNotFoundResponse() {
        return new WebResourceResponse("text/html", C4761z5.O, 404, "Not Found", MapsKt.emptyMap(), new ByteArrayInputStream(new byte[0]));
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    public final WebResourceResponse invoke(Uri uri, String webviewType) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(webviewType, "webviewType");
        boolean disableCustomScheme = this.sessionRepository.getFeatureFlags().getDisableCustomScheme();
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -1921537799) {
                if (hashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return disableCustomScheme ? tryGetWebViewAsset(uri, webviewType) : getLegacyCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, webviewType);
    }

    private final WebResourceResponse getLegacyCachedAsset(Uri uri) {
        Object runBlocking$default;
        Object m8079constructorimpl;
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new GetCachedAsset$getLegacyCachedAsset$result$1(this, StringsKt.substringAfterLast$default(uri2, "/", (String) null, 2, (Object) null), null), 1, null);
        CacheResult cacheResult = (CacheResult) runBlocking$default;
        if (cacheResult instanceof CacheResult.Success) {
            File file = ((CacheResult.Success) cacheResult).getCachedFile().getFile();
            if (file == null) {
                return null;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                GetCachedAsset getCachedAsset = this;
                m8079constructorimpl = Result.m8079constructorimpl(new FileInputStream(file));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8085isFailureimpl(m8079constructorimpl)) {
                m8079constructorimpl = null;
            }
            FileInputStream fileInputStream = (FileInputStream) m8079constructorimpl;
            if (fileInputStream == null) {
                return null;
            }
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNull(absolutePath);
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(absolutePath), null, fileInputStream);
        }
        return getNotFoundResponse();
    }

    private final WebResourceResponse getBundledAsset(Uri uri) {
        String substringAfter$default = StringsKt.substringAfter$default(String.valueOf(uri.getPath()), "/", (String) null, 2, (Object) null);
        try {
            InputStream open = this.context.getAssets().open(substringAfter$default);
            Intrinsics.checkNotNullExpressionValue(open, "open(...)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(substringAfter$default), null, open);
        } catch (Exception unused) {
            return getNotFoundResponse();
        }
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String webviewType) {
        Object m8079constructorimpl;
        Object runBlocking$default;
        File file;
        Object m8079constructorimpl2;
        StringBuilder append = new StringBuilder().append(webviewType).append(FileSystemKt.UnixPathSeparator);
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        String sb = append.append(StringsKt.substringAfterLast$default(StringsKt.substringBefore$default(uri2, "?", (String) null, 2, (Object) null), "/", (String) null, 2, (Object) null)).toString();
        File file2 = this.cacheWebViewAssets.getCached().get(sb);
        if (file2 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                GetCachedAsset getCachedAsset = this;
                m8079constructorimpl = Result.m8079constructorimpl(new FileInputStream(file2));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8085isFailureimpl(m8079constructorimpl)) {
                m8079constructorimpl = null;
            }
            FileInputStream fileInputStream = (FileInputStream) m8079constructorimpl;
            if (fileInputStream == null) {
                return null;
            }
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(sb), null, fileInputStream);
        }
        String uri3 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new GetCachedAsset$tryGetWebViewAsset$result$1(this, this.getAssetFileName.invoke(uri3), null), 1, null);
        CacheResult cacheResult = (CacheResult) runBlocking$default;
        if (!(cacheResult instanceof CacheResult.Success) || (file = ((CacheResult.Success) cacheResult).getCachedFile().getFile()) == null) {
            return null;
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            GetCachedAsset getCachedAsset2 = this;
            m8079constructorimpl2 = Result.m8079constructorimpl(new FileInputStream(file));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m8079constructorimpl2 = Result.m8079constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl2)) {
            m8079constructorimpl2 = null;
        }
        FileInputStream fileInputStream2 = (FileInputStream) m8079constructorimpl2;
        if (fileInputStream2 == null) {
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNull(absolutePath);
        return new WebResourceResponse(StringExtensionsKt.guessMimeType(absolutePath), null, 200, "OK", MapsKt.mapOf(TuplesKt.to(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*")), fileInputStream2);
    }
}
