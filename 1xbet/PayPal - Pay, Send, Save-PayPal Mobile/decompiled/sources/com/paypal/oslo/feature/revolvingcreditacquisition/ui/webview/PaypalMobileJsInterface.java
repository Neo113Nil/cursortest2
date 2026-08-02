package com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0018\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/webview/PaypalMobileJsInterface;", "", "Lkotlin/Function0;", "", "onPrintRequested", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/CreditWebViewResult;", "onWebViewEvent", "Lkotlin/Function2;", "Lkotlinx/serialization/SerializationException;", "", "onWebViewParseError", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "print", "()V", "jsonString", "revWebViewDidPerformEvent", "(Ljava/lang/String;)V", "ppcWebViewEvent", "p0", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;", "Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/Json;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaypalMobileJsInterface {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.CreditWebViewResult, kotlin.Unit> getHighSpeedVideoSizes;
    private final kotlin.jvm.functions.Function2<kotlinx.serialization.SerializationException, java.lang.String, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public PaypalMobileJsInterface(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.CreditWebViewResult, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super kotlinx.serialization.SerializationException, ? super java.lang.String, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.PaypalMobileJsInterface$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.PaypalMobileJsInterface.$r8$lambda$DFqPZ_fyj4wQhtqMCu2hGG4Gav8((kotlinx.serialization.json.JsonBuilder) obj);
            }
        }, 1, null);
    }

    @android.webkit.JavascriptInterface
    public final void print() {
        this.Camera2StreamConfigurationMap.invoke();
    }

    @android.webkit.JavascriptInterface
    public final void revWebViewDidPerformEvent(java.lang.String jsonString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
        Camera2StreamConfigurationMap(jsonString);
    }

    @android.webkit.JavascriptInterface
    public final void ppcWebViewEvent(java.lang.String jsonString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
        Camera2StreamConfigurationMap(jsonString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void Camera2StreamConfigurationMap(java.lang.String p0) {
        try {
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.CreditWebViewResult, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
            kotlinx.serialization.json.Json json = this.getHighResolutionOutputSizeshNQ4ISI;
            json.getSerializersModule();
            function1.invoke(json.decodeFromString(com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.CreditWebViewResult.INSTANCE.serializer(), p0));
        } catch (kotlinx.serialization.SerializationException e) {
            this.getHighSpeedVideoFpsRanges.invoke(e, p0);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DFqPZ_fyj4wQhtqMCu2hGG4Gav8(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        return kotlin.Unit.INSTANCE;
    }
}
