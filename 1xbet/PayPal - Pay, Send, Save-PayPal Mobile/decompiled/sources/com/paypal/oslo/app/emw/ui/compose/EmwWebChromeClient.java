package com.paypal.oslo.app.emw.ui.compose;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\rJ#\u0010\u000f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/app/emw/ui/compose/EmwWebChromeClient;", "Landroid/webkit/WebChromeClient;", "Lkotlin/Function1;", "", "", "onProgressChanged", "", "onTitleReceived", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/webkit/WebView;", "view", "newProgress", "(Landroid/webkit/WebView;I)V", "title", "onReceivedTitle", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmwWebChromeClient extends android.webkit.WebChromeClient {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public EmwWebChromeClient(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoFpsRanges = function12;
    }

    public /* synthetic */ EmwWebChromeClient(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.emw.ui.compose.EmwWebChromeClient$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function12);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(android.webkit.WebView view, int newProgress) {
        this.getHighSpeedVideoFpsRangesFor.invoke(java.lang.Integer.valueOf(newProgress));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(android.webkit.WebView view, java.lang.String title) {
        this.getHighSpeedVideoFpsRanges.invoke(title);
    }
}
