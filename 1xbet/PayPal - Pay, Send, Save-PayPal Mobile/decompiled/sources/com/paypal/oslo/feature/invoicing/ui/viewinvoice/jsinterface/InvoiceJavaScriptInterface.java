package com.paypal.oslo.feature.invoicing.ui.viewinvoice.jsinterface;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/jsinterface/InvoiceJavaScriptInterface;", "", "Lkotlin/Function1;", "", "", "onOpenExternalBrowser", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "url", "openExternalBrowser", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InvoiceJavaScriptInterface {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public InvoiceJavaScriptInterface(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    @android.webkit.JavascriptInterface
    public final void openExternalBrowser(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        if (android.webkit.URLUtil.isValidUrl(url)) {
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(url);
        }
    }
}
