package org.betup.ui.dialogs.offer.webview;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferDocumentPrefetch.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/ui/dialogs/offer/webview/OfferDocumentPrefetch;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "REMOTE_HTML_WAIT_MS", "", "CACHE_SUBDIR", "", "CACHE_MAX_BYTES", "client", "Lokhttp3/OkHttpClient;", "httpClient", "appContext", "Landroid/content/Context;", "buildClient", RemoteConfigComponent.FETCH_FILE_NAME, "url", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferDocumentPrefetch {
    private static final long CACHE_MAX_BYTES = 20971520;
    private static final String CACHE_SUBDIR = "offer_html_cache";
    public static final long REMOTE_HTML_WAIT_MS = 2200;
    private static volatile OkHttpClient client;
    public static final OfferDocumentPrefetch INSTANCE = new OfferDocumentPrefetch();
    public static final int $stable = 8;

    private OfferDocumentPrefetch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OkHttpClient httpClient(Context appContext) {
        OkHttpClient okHttpClient;
        OkHttpClient okHttpClient2 = client;
        if (okHttpClient2 != null) {
            return okHttpClient2;
        }
        synchronized (this) {
            okHttpClient = client;
            if (okHttpClient == null) {
                OfferDocumentPrefetch offerDocumentPrefetch = INSTANCE;
                Context applicationContext = appContext.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                okHttpClient = offerDocumentPrefetch.buildClient(applicationContext);
                client = okHttpClient;
            }
        }
        return okHttpClient;
    }

    private final OkHttpClient buildClient(Context appContext) {
        return new OkHttpClient.Builder().cache(new Cache(new File(appContext.getCacheDir(), CACHE_SUBDIR), CACHE_MAX_BYTES)).connectTimeout(10L, TimeUnit.SECONDS).readTimeout(10L, TimeUnit.SECONDS).followRedirects(true).build();
    }

    public final Object fetch(Context context, String str, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new OfferDocumentPrefetch$fetch$2(str, context, null), continuation);
    }
}
