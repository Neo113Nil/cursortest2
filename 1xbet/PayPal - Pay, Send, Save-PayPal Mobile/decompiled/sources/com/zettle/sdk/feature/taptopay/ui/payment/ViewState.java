package com.zettle.sdk.feature.taptopay.ui.payment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/ViewState;", "", "Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel$Screen;", "screen", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult;", "result", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel$Screen;Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult;)V", "component1", "()Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel$Screen;", "component2", "()Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult;", "copy", "(Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel$Screen;Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult;)Lcom/zettle/sdk/feature/taptopay/ui/payment/ViewState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult;", "getResult", "Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel$Screen;", "getScreen"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ViewState {
    private final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult result;
    private final com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen;

    public ViewState(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult tapToPayPaymentResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screen, "");
        this.screen = screen;
        this.result = tapToPayPaymentResult;
    }

    public /* synthetic */ ViewState(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult tapToPayPaymentResult, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(screen, (i & 2) != 0 ? null : tapToPayPaymentResult);
    }

    public final com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen getScreen() {
        return this.screen;
    }

    public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult getResult() {
        return this.result;
    }

    public final java.lang.String toString() {
        com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen = this.screen;
        com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult tapToPayPaymentResult = this.result;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewState(screen=");
        sb.append(screen);
        sb.append(", result=");
        sb.append(tapToPayPaymentResult);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.screen.hashCode();
        com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult tapToPayPaymentResult = this.result;
        return (hashCode * 31) + (tapToPayPaymentResult == null ? 0 : tapToPayPaymentResult.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.feature.taptopay.ui.payment.ViewState)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState = (com.zettle.sdk.feature.taptopay.ui.payment.ViewState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.screen, viewState.screen) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, viewState.result);
    }

    public final com.zettle.sdk.feature.taptopay.ui.payment.ViewState copy(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screen, "");
        return new com.zettle.sdk.feature.taptopay.ui.payment.ViewState(screen, result);
    }

    /* renamed from: component2, reason: from getter */
    public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult getResult() {
        return this.result;
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen getScreen() {
        return this.screen;
    }

    public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.payment.ViewState copy$default(com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState, com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult tapToPayPaymentResult, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            screen = viewState.screen;
        }
        if ((i & 2) != 0) {
            tapToPayPaymentResult = viewState.result;
        }
        return viewState.copy(screen, tapToPayPaymentResult);
    }
}
