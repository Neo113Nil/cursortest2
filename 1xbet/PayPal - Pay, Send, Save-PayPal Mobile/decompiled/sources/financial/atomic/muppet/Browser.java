package financial.atomic.muppet;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0015\u0010\u001f\u001a\u00020\u00188CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lfinancial/atomic/muppet/Browser;", "Lfinancial/atomic/muppet/impl/Browser;", "Landroid/webkit/WebView;", "Lfinancial/atomic/muppet/inter/Browser;", "Landroid/content/Context;", "context", "Lfinancial/atomic/muppet/inter/Page$Factory;", "factory", "<init>", "(Landroid/content/Context;Lfinancial/atomic/muppet/inter/Page$Factory;)V", "Lfinancial/atomic/muppet/inter/Page;", "page", "", com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.KEEP, "", "a", "(Lfinancial/atomic/muppet/inter/Page;Z)V", "newPage", "(Lfinancial/atomic/muppet/inter/Page$Factory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAllCookies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/webkit/CookieManager;", "cookieManager", "()Landroid/webkit/CookieManager;", "Landroid/widget/FrameLayout;", "view", "()Landroid/widget/FrameLayout;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Browser extends financial.atomic.muppet.impl.Browser<android.webkit.WebView> implements financial.atomic.muppet.inter.Browser<android.webkit.WebView> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;

    public /* synthetic */ Browser(final android.content.Context context, financial.atomic.muppet.inter.Page.Factory factory, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new financial.atomic.muppet.inter.Page.Factory() { // from class: financial.atomic.muppet.Browser$$ExternalSyntheticLambda0
            @Override // financial.atomic.muppet.inter.Page.Factory
            public final financial.atomic.muppet.inter.Page create(financial.atomic.muppet.inter.Browser browser) {
                return financial.atomic.muppet.Browser.$r8$lambda$wzkWrFasJUmP4l43Iwj5VCMoBCA(context, browser);
            }
        } : factory);
    }

    public final java.lang.Object clearAllCookies(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new financial.atomic.muppet.a.d(this, null), continuation);
    }

    public final android.webkit.CookieManager cookieManager() {
        android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cookieManager, "");
        return cookieManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // financial.atomic.muppet.impl.Browser, financial.atomic.muppet.inter.Browser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object newPage(financial.atomic.muppet.inter.Page.Factory<android.webkit.WebView> factory, kotlin.coroutines.Continuation<? super financial.atomic.muppet.inter.Page<? extends android.webkit.WebView>> continuation) {
        financial.atomic.muppet.a.e eVar;
        int i;
        if (continuation instanceof financial.atomic.muppet.a.e) {
            eVar = (financial.atomic.muppet.a.e) continuation;
            int i2 = eVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.c = i2 - 2147483648;
                java.lang.Object obj = eVar.f6761a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eVar.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    eVar.c = 1;
                    obj = super.newPage(factory, eVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                financial.atomic.muppet.inter.Page page = (financial.atomic.muppet.inter.Page) obj;
                android.webkit.WebView webView = (android.webkit.WebView) page.view();
                webView.setAlpha(0.0f);
                ((android.widget.FrameLayout) this.getHighSpeedVideoFpsRangesFor.getValue()).addView(webView, new android.widget.FrameLayout.LayoutParams(-1, -1));
                return page;
            }
        }
        eVar = new financial.atomic.muppet.a.e(this, continuation);
        java.lang.Object obj2 = eVar.f6761a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eVar.c;
        if (i != 0) {
        }
        financial.atomic.muppet.inter.Page page2 = (financial.atomic.muppet.inter.Page) obj2;
        android.webkit.WebView webView2 = (android.webkit.WebView) page2.view();
        webView2.setAlpha(0.0f);
        ((android.widget.FrameLayout) this.getHighSpeedVideoFpsRangesFor.getValue()).addView(webView2, new android.widget.FrameLayout.LayoutParams(-1, -1));
        return page2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Browser(android.content.Context context, financial.atomic.muppet.inter.Page.Factory<android.webkit.WebView> factory) {
        super(factory);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        this.getHighSpeedVideoSizes = context;
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.Browser$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return financial.atomic.muppet.Browser.$r8$lambda$qalaboUoKYNvlH7hMSc_VunF_NI(financial.atomic.muppet.Browser.this);
            }
        });
        this.getHighSpeedVideoFpsRangesFor = lazy;
        ((android.widget.FrameLayout) lazy.getValue()).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener((android.widget.FrameLayout) lazy.getValue(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: financial.atomic.muppet.Browser$$ExternalSyntheticLambda2
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                return financial.atomic.muppet.Browser.m23210$r8$lambda$SsS52gsK3IkBo6sDHQ_2g3nhDc(view, windowInsetsCompat);
            }
        });
    }

    /* renamed from: $r8$lambda$SsS52gsK3IkBo6sDHQ-_2g3nhDc, reason: not valid java name */
    public static /* synthetic */ androidx.core.view.WindowInsetsCompat m23210$r8$lambda$SsS52gsK3IkBo6sDHQ_2g3nhDc(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars() | androidx.core.view.WindowInsetsCompat.Type.displayCutout());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return androidx.core.view.WindowInsetsCompat.CONSUMED;
    }

    public static /* synthetic */ android.widget.FrameLayout $r8$lambda$qalaboUoKYNvlH7hMSc_VunF_NI(financial.atomic.muppet.Browser browser) {
        return new android.widget.FrameLayout(browser.getHighSpeedVideoSizes);
    }

    public static /* synthetic */ financial.atomic.muppet.inter.Page $r8$lambda$wzkWrFasJUmP4l43Iwj5VCMoBCA(android.content.Context context, financial.atomic.muppet.inter.Browser browser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(browser, "");
        return new financial.atomic.muppet.Page(browser, new financial.atomic.muppet.a.b(context));
    }

    @Override // financial.atomic.muppet.impl.Browser
    public final void a(financial.atomic.muppet.inter.Page<? extends android.webkit.WebView> page, boolean keep) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        ((android.widget.FrameLayout) this.getHighSpeedVideoFpsRangesFor.getValue()).removeView(page.view());
        super.a(page, keep);
    }

    public final android.widget.FrameLayout view() {
        return (android.widget.FrameLayout) this.getHighSpeedVideoFpsRangesFor.getValue();
    }
}
