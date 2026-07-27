package com.chartboost.sdk.internal.clickthrough;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.impl.i7;
import com.chartboost.sdk.impl.mb;
import com.chartboost.sdk.impl.yh;
import com.chartboost.sdk.internal.interruption.InterruptionController;
import com.chartboost.sdk.tracking.f;
import com.chartboost.sdk.tracking.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0012\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u001b\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\f\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/chartboost/sdk/internal/clickthrough/EmbeddedBrowserActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", "t", "a", "(Ljava/lang/Throwable;)V", "Lcom/chartboost/sdk/impl/i7;", "Lcom/chartboost/sdk/impl/i7;", "eventTracker", "Landroid/view/View;", "b", "Lkotlin/Lazy;", "()Landroid/view/View;", "view", "Landroid/widget/FrameLayout;", "c", "()Landroid/widget/FrameLayout;", "frameLayout", "Landroid/webkit/WebView;", "d", "()Landroid/webkit/WebView;", "webView", k.M, "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EmbeddedBrowserActivity extends Activity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public i7 eventTracker;

    /* renamed from: b, reason: from kotlin metadata */
    public final Lazy view = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.internal.clickthrough.EmbeddedBrowserActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EmbeddedBrowserActivity.b(EmbeddedBrowserActivity.this);
        }
    });

    /* renamed from: c, reason: from kotlin metadata */
    public final Lazy frameLayout = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.internal.clickthrough.EmbeddedBrowserActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EmbeddedBrowserActivity.a(EmbeddedBrowserActivity.this);
        }
    });

    /* renamed from: d, reason: from kotlin metadata */
    public final Lazy webView = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.internal.clickthrough.EmbeddedBrowserActivity$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EmbeddedBrowserActivity.c(EmbeddedBrowserActivity.this);
        }
    });

    /* renamed from: com.chartboost.sdk.internal.clickthrough.EmbeddedBrowserActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final Intent a(Context context, String url) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intent putExtra = new Intent(context, (Class<?>) EmbeddedBrowserActivity.class).putExtra("KEY_INTENT_URL", url);
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            return putExtra;
        }

        public final String a(Intent intent) {
            if (intent != null) {
                return intent.getStringExtra("KEY_INTENT_URL");
            }
            return null;
        }
    }

    public final FrameLayout a() {
        return (FrameLayout) this.frameLayout.getValue();
    }

    public final View b() {
        return (View) this.view.getValue();
    }

    public final WebView c() {
        return (WebView) this.webView.getValue();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Object m8079constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            super.onCreate(savedInstanceState);
            if (Chartboost.isSdkStarted()) {
                this.eventTracker = yh.a();
            }
            InterruptionController.f5128a.b(true);
            setContentView(b());
            String a2 = INSTANCE.a(getIntent());
            if (a2 != null) {
                c().loadUrl(a2);
            } else {
                a(this, null, 1, null);
            }
            m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            a(m8082exceptionOrNullimpl);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (!isChangingConfigurations()) {
            InterruptionController.f5128a.b(false);
        }
        super.onDestroy();
    }

    public static final FrameLayout a(EmbeddedBrowserActivity embeddedBrowserActivity) {
        FrameLayout frameLayout = new FrameLayout(embeddedBrowserActivity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static final FrameLayout b(EmbeddedBrowserActivity embeddedBrowserActivity) {
        FrameLayout a2 = embeddedBrowserActivity.a();
        a2.addView(embeddedBrowserActivity.c());
        return a2;
    }

    public static final WebView c(EmbeddedBrowserActivity embeddedBrowserActivity) {
        WebView webView = new WebView(embeddedBrowserActivity);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        webView.setWebViewClient(embeddedBrowserActivity.new b());
        return webView;
    }

    public final class b extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public final List f5127a = CollectionsKt.listOf((Object[]) new Integer[]{-1, -2, -3, -6, -9, -10, -11, -12});

        public b() {
        }

        public final String a(WebResourceError webResourceError) {
            CharSequence charSequence;
            JSONObject jSONObject = new JSONObject();
            Intent intent = EmbeddedBrowserActivity.this.getIntent();
            jSONObject.put("url", intent != null ? EmbeddedBrowserActivity.INSTANCE.a(intent) : null);
            if (webResourceError == null || (charSequence = webResourceError.getDescription()) == null) {
                charSequence = "";
            }
            jSONObject.put("error", charSequence);
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        public final boolean b(WebResourceError webResourceError) {
            List list = this.f5127a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (webResourceError != null && intValue == webResourceError.getErrorCode()) {
                    return true;
                }
            }
            return false;
        }

        public final void c(WebResourceError webResourceError) {
            if (b(webResourceError)) {
                i7 i7Var = EmbeddedBrowserActivity.this.eventTracker;
                if (i7Var == null || i7Var.track((f) new com.chartboost.sdk.tracking.b(g.EnumC0233g.d, a(webResourceError), null, null, null, 28, null)) == null) {
                    mb.b("SDK is not initialized. Cannot track error: " + webResourceError, (Throwable) null, 2, (Object) null);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            mb.b("onReceivedError: " + webResourceError, (Throwable) null, 2, (Object) null);
            c(webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            mb.b("onReceivedHttpError: " + webResourceResponse, (Throwable) null, 2, (Object) null);
            b(webResourceResponse);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
        
            if (r0.track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.b(com.chartboost.sdk.tracking.g.b.d, (r14 == null || !r14.didCrash()) ? "Webview killed, likely due to low memory" : "Webview crashed " + r14, null, null, null, 28, null)) == null) goto L12;
         */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            i7 i7Var = EmbeddedBrowserActivity.this.eventTracker;
            if (i7Var != null) {
            }
            mb.b("SDK is not initialized. Cannot track render process gone event", (Throwable) null, 2, (Object) null);
            Unit unit = Unit.INSTANCE;
            Context context = webView != null ? webView.getContext() : null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                activity.finish();
            }
            return true;
        }

        public final String a(WebResourceResponse webResourceResponse) {
            JSONObject jSONObject = new JSONObject();
            Intent intent = EmbeddedBrowserActivity.this.getIntent();
            jSONObject.put("url", intent != null ? EmbeddedBrowserActivity.INSTANCE.a(intent) : null);
            jSONObject.put("error", "HTTP status code: " + (webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null));
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        public final void b(WebResourceResponse webResourceResponse) {
            i7 i7Var = EmbeddedBrowserActivity.this.eventTracker;
            if (i7Var == null || i7Var.track((f) new com.chartboost.sdk.tracking.b(g.EnumC0233g.d, a(webResourceResponse), null, null, null, 28, null)) == null) {
                mb.b("SDK is not initialized. Cannot track error: " + webResourceResponse, (Throwable) null, 2, (Object) null);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static /* synthetic */ void a(EmbeddedBrowserActivity embeddedBrowserActivity, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        embeddedBrowserActivity.a(th);
    }

    public final void a(Throwable t) {
        mb.b("Error loading URL into embedded browser", t);
        finish();
    }
}
