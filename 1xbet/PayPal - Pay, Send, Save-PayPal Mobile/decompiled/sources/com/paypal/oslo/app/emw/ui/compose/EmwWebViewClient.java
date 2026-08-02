package com.paypal.oslo.app.emw.ui.compose;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u0004\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0004\u0010\u000eJ#\u0010\u0005\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/app/emw/ui/compose/EmwWebViewClient;", "Landroid/webkit/WebViewClient;", "Lkotlin/Function0;", "", "onPageStarted", "onPageFinished", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/webkit/WebView;", "view", "", "url", "Landroid/graphics/Bitmap;", "favicon", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmwWebViewClient extends android.webkit.WebViewClient {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;

    public EmwWebViewClient(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighSpeedVideoSizes = function02;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(android.webkit.WebView view, java.lang.String url, android.graphics.Bitmap favicon) {
        this.getHighSpeedVideoFpsRanges.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(android.webkit.WebView view, java.lang.String url) {
        this.getHighSpeedVideoSizes.invoke();
    }
}
