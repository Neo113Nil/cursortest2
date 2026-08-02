package com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001Bp\u0012!\b\u0002\u0010\u0007\u001a\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0010\u001a\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015Jy\u0010\u0018\u001a\u00020\u00002!\b\u0002\u0010\u0007\u001a\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"R0\u0010\u0007\u001a\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00060\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010\u0015R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b)\u0010\u0015R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b*\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/screen/actions/WebViewActions;", "", "Lkotlin/Function2;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewJavaScriptBridge;", "", "Lkotlin/ParameterName;", "", "onWebViewUrlChange", "Lkotlin/Function1;", "onError", "Lkotlin/Function0;", "onBackPressed", "onRypPageRendered", "onReturnToMerchantButtonClicked", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lkotlin/jvm/functions/Function2;", "component2", "()Lkotlin/jvm/functions/Function1;", "component3", "()Lkotlin/jvm/functions/Function0;", "component4", "component5", "copy", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/screen/actions/WebViewActions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "getOnWebViewUrlChange", "Lkotlin/jvm/functions/Function1;", "getOnError", "Lkotlin/jvm/functions/Function0;", "getOnBackPressed", "getOnRypPageRendered", "getOnReturnToMerchantButtonClicked"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class WebViewActions {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onBackPressed;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onError;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onReturnToMerchantButtonClicked;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onRypPageRendered;
    private final kotlin.jvm.functions.Function2<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, java.lang.String, kotlin.Unit> onWebViewUrlChange;

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewActions(kotlin.jvm.functions.Function2<? super com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, ? super java.lang.String, kotlin.Unit> function2, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        this.onWebViewUrlChange = function2;
        this.onError = function1;
        this.onBackPressed = function0;
        this.onRypPageRendered = function02;
        this.onReturnToMerchantButtonClicked = function03;
    }

    public /* synthetic */ WebViewActions(kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions.m15452$r8$lambda$pLZvq9vyK3I0Tal5uL_5E5BWjw((com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge) obj, (java.lang.String) obj2);
            }
        } : function2, (i & 2) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions.$r8$lambda$VVIXj3A_4oiTZgakdFr2UKkxas8((java.lang.String) obj);
            }
        } : function1, (i & 4) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function0, (i & 8) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function02, (i & 16) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function03);
    }

    public final kotlin.jvm.functions.Function2<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, java.lang.String, kotlin.Unit> getOnWebViewUrlChange() {
        return this.onWebViewUrlChange;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnError() {
        return this.onError;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnBackPressed() {
        return this.onBackPressed;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnRypPageRendered() {
        return this.onRypPageRendered;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnReturnToMerchantButtonClicked() {
        return this.onReturnToMerchantButtonClicked;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VVIXj3A_4oiTZgakdFr2UKkxas8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pLZvq9vyK3I0Ta-l5uL_5E5BWjw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15452$r8$lambda$pLZvq9vyK3I0Tal5uL_5E5BWjw(com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge secureWebViewJavaScriptBridge, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.String toString() {
        kotlin.jvm.functions.Function2<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, java.lang.String, kotlin.Unit> function2 = this.onWebViewUrlChange;
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.onError;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onBackPressed;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onRypPageRendered;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03 = this.onReturnToMerchantButtonClicked;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebViewActions(onWebViewUrlChange=");
        sb.append(function2);
        sb.append(", onError=");
        sb.append(function1);
        sb.append(", onBackPressed=");
        sb.append(function0);
        sb.append(", onRypPageRendered=");
        sb.append(function02);
        sb.append(", onReturnToMerchantButtonClicked=");
        sb.append(function03);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.onWebViewUrlChange.hashCode() * 31) + this.onError.hashCode()) * 31) + this.onBackPressed.hashCode()) * 31) + this.onRypPageRendered.hashCode()) * 31) + this.onReturnToMerchantButtonClicked.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions webViewActions = (com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.onWebViewUrlChange, webViewActions.onWebViewUrlChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.onError, webViewActions.onError) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBackPressed, webViewActions.onBackPressed) && kotlin.jvm.internal.Intrinsics.areEqual(this.onRypPageRendered, webViewActions.onRypPageRendered) && kotlin.jvm.internal.Intrinsics.areEqual(this.onReturnToMerchantButtonClicked, webViewActions.onReturnToMerchantButtonClicked);
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions copy(kotlin.jvm.functions.Function2<? super com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, ? super java.lang.String, kotlin.Unit> onWebViewUrlChange, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError, kotlin.jvm.functions.Function0<kotlin.Unit> onBackPressed, kotlin.jvm.functions.Function0<kotlin.Unit> onRypPageRendered, kotlin.jvm.functions.Function0<kotlin.Unit> onReturnToMerchantButtonClicked) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onWebViewUrlChange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackPressed, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onRypPageRendered, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onReturnToMerchantButtonClicked, "");
        return new com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions(onWebViewUrlChange, onError, onBackPressed, onRypPageRendered, onReturnToMerchantButtonClicked);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component5() {
        return this.onReturnToMerchantButtonClicked;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component4() {
        return this.onRypPageRendered;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
        return this.onBackPressed;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component2() {
        return this.onError;
    }

    public final kotlin.jvm.functions.Function2<com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge, java.lang.String, kotlin.Unit> component1() {
        return this.onWebViewUrlChange;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewActions webViewActions, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function2 = webViewActions.onWebViewUrlChange;
        }
        if ((i & 2) != 0) {
            function1 = webViewActions.onError;
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if ((i & 4) != 0) {
            function0 = webViewActions.onBackPressed;
        }
        kotlin.jvm.functions.Function0 function04 = function0;
        if ((i & 8) != 0) {
            function02 = webViewActions.onRypPageRendered;
        }
        kotlin.jvm.functions.Function0 function05 = function02;
        if ((i & 16) != 0) {
            function03 = webViewActions.onReturnToMerchantButtonClicked;
        }
        return webViewActions.copy(function2, function12, function04, function05, function03);
    }

    public WebViewActions() {
        this(null, null, null, null, null, 31, null);
    }
}
