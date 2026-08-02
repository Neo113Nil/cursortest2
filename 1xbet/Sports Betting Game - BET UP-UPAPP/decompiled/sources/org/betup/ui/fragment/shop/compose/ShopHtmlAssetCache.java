package org.betup.ui.fragment.shop.compose;

import android.content.Context;
import android.util.Log;
import android.webkit.WebResourceResponse;
import coil3.svg.internal.UtilsKt;
import com.google.common.net.HttpHeaders;
import com.tiktok.util.UrlConst;
import io.bidmachine.util.MimeTypes;
import io.sentry.SentryReplayEvent;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopHtmlAssetCache.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0086@¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0005J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopHtmlAssetCache;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "BETCOIN_SVG_URL", "", "TAG", "CACHE_SUBDIR", "CACHE_MAX_BYTES", "", "client", "Lokhttp3/OkHttpClient;", "collectImageUrls", "", "content", "Lorg/betup/ui/fragment/shop/compose/ShopContentUiModel;", "addItemImageUrl", "", SentryReplayEvent.JsonKeys.URLS, "", "item", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "warm", "appContext", "Landroid/content/Context;", "", "(Landroid/content/Context;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercept", "Landroid/webkit/WebResourceResponse;", "url", "prefetch", "isRemoteUrl", "", "httpClient", "buildClient", "guessMimeType", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopHtmlAssetCache {
    public static final String BETCOIN_SVG_URL = "https://qbetapp.info/uploads_api/shop/component_betcoin.svg";
    private static final long CACHE_MAX_BYTES = 50331648;
    private static final String CACHE_SUBDIR = "shop_html_assets";
    private static final String TAG = "ShopHtmlAssetCache";
    private static volatile OkHttpClient client;
    public static final ShopHtmlAssetCache INSTANCE = new ShopHtmlAssetCache();
    public static final int $stable = 8;

    private ShopHtmlAssetCache() {
    }

    public final Set<String> collectImageUrls(ShopContentUiModel content) {
        Intrinsics.checkNotNullParameter(content, "content");
        LinkedHashSet linkedSetOf = SetsKt.linkedSetOf(BETCOIN_SVG_URL);
        Iterator<T> it = content.getSections().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((ShopSectionUiModel) it.next()).getItems().iterator();
            while (it2.hasNext()) {
                INSTANCE.addItemImageUrl(linkedSetOf, (ShopItemDataModel) it2.next());
            }
        }
        ShopItemDataModel videoReward = content.getVideoReward();
        if (videoReward != null) {
            INSTANCE.addItemImageUrl(linkedSetOf, videoReward);
        }
        return linkedSetOf;
    }

    private final void addItemImageUrl(Set<String> urls, ShopItemDataModel item) {
        String obj = StringsKt.trim((CharSequence) item.getImgUrl()).toString();
        if (StringsKt.startsWith$default(obj, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(obj, UrlConst.HTTPS, false, 2, (Object) null)) {
            urls.add(obj);
        }
    }

    public final Object warm(Context context, Collection<String> collection, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new ShopHtmlAssetCache$warm$2(collection, context, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse intercept(Context appContext, String url) {
        Object m10853constructorimpl;
        Throwable m10856exceptionOrNullimpl;
        Response execute;
        String guessMimeType;
        String substringBefore$default;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(url, "url");
        if (!isRemoteUrl(url)) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            ShopHtmlAssetCache shopHtmlAssetCache = this;
            execute = httpClient(appContext).newCall(new Request.Builder().url(url).header(HttpHeaders.ACCEPT, "*/*").build()).execute();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        if (!execute.isSuccessful()) {
            execute.close();
            return null;
        }
        ResponseBody body = execute.body();
        if (body == null) {
            return null;
        }
        String header$default = Response.header$default(execute, "Content-Type", null, 2, null);
        if (header$default != null && (substringBefore$default = StringsKt.substringBefore$default(header$default, ";", (String) null, 2, (Object) null)) != null && (guessMimeType = StringsKt.trim((CharSequence) substringBefore$default).toString()) != null) {
            if (guessMimeType.length() <= 0) {
                guessMimeType = null;
            }
            if (guessMimeType != null) {
                m10853constructorimpl = Result.m10853constructorimpl(new WebResourceResponse(guessMimeType, null, body.byteStream()));
                m10856exceptionOrNullimpl = Result.m10856exceptionOrNullimpl(m10853constructorimpl);
                if (m10856exceptionOrNullimpl != null) {
                    Log.w(TAG, "Intercept failed for " + url, m10856exceptionOrNullimpl);
                }
                return (WebResourceResponse) (Result.m10859isFailureimpl(m10853constructorimpl) ? null : m10853constructorimpl);
            }
        }
        guessMimeType = guessMimeType(url);
        m10853constructorimpl = Result.m10853constructorimpl(new WebResourceResponse(guessMimeType, null, body.byteStream()));
        m10856exceptionOrNullimpl = Result.m10856exceptionOrNullimpl(m10853constructorimpl);
        if (m10856exceptionOrNullimpl != null) {
        }
        return (WebResourceResponse) (Result.m10859isFailureimpl(m10853constructorimpl) ? null : m10853constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prefetch(Context appContext, String url) {
        Response execute = httpClient(appContext).newCall(new Request.Builder().url(url).build()).execute();
        try {
            Response response = execute;
            if (!response.isSuccessful()) {
                throw new IllegalStateException(("HTTP " + response.code()).toString());
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(execute, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(execute, th);
                throw th2;
            }
        }
    }

    private final boolean isRemoteUrl(String url) {
        return StringsKt.startsWith$default(url, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(url, UrlConst.HTTPS, false, 2, (Object) null);
    }

    private final OkHttpClient httpClient(Context appContext) {
        OkHttpClient okHttpClient;
        OkHttpClient okHttpClient2 = client;
        if (okHttpClient2 != null) {
            return okHttpClient2;
        }
        synchronized (this) {
            okHttpClient = client;
            if (okHttpClient == null) {
                ShopHtmlAssetCache shopHtmlAssetCache = INSTANCE;
                Context applicationContext = appContext.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                okHttpClient = shopHtmlAssetCache.buildClient(applicationContext);
                client = okHttpClient;
            }
        }
        return okHttpClient;
    }

    private final OkHttpClient buildClient(Context appContext) {
        return new OkHttpClient.Builder().cache(new Cache(new File(appContext.getCacheDir(), CACHE_SUBDIR), CACHE_MAX_BYTES)).connectTimeout(12L, TimeUnit.SECONDS).readTimeout(12L, TimeUnit.SECONDS).followRedirects(true).build();
    }

    private final String guessMimeType(String url) {
        String lowerCase = StringsKt.substringBefore$default(url, '?', (String) null, 2, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt.endsWith$default(lowerCase, ".svg", false, 2, (Object) null)) {
            return UtilsKt.MIME_TYPE_SVG;
        }
        if (StringsKt.endsWith$default(lowerCase, ".png", false, 2, (Object) null)) {
            return "image/png";
        }
        if (StringsKt.endsWith$default(lowerCase, ".jpg", false, 2, (Object) null) || StringsKt.endsWith$default(lowerCase, ".jpeg", false, 2, (Object) null)) {
            return "image/jpeg";
        }
        return StringsKt.endsWith$default(lowerCase, ".webp", false, 2, (Object) null) ? "image/webp" : StringsKt.endsWith$default(lowerCase, ".gif", false, 2, (Object) null) ? MimeTypes.IMAGE_GIF : "image/*";
    }
}
