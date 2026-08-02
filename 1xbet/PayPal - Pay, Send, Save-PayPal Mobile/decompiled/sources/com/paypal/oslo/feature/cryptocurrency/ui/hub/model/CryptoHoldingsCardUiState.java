package com.paypal.oslo.feature.cryptocurrency.ui.hub.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHoldingsCardUiState;", "", "", "totalHoldingValue", "currencyCode", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/TotalReturnUiState;", "totalReturn", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/HoldingsCardActionsUiState;", "holdingsCardActionsUiState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/TotalReturnUiState;Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/HoldingsCardActionsUiState;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/TotalReturnUiState;", "component4", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/HoldingsCardActionsUiState;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/TotalReturnUiState;Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/HoldingsCardActionsUiState;)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHoldingsCardUiState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTotalHoldingValue", "getCurrencyCode", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/TotalReturnUiState;", "getTotalReturn", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/HoldingsCardActionsUiState;", "getHoldingsCardActionsUiState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoHoldingsCardUiState {
    public static final int $stable = 0;
    private final java.lang.String currencyCode;
    private final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState holdingsCardActionsUiState;
    private final java.lang.String totalHoldingValue;
    private final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.TotalReturnUiState totalReturn;

    public CryptoHoldingsCardUiState(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.TotalReturnUiState totalReturnUiState, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState holdingsCardActionsUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.totalHoldingValue = str;
        this.currencyCode = str2;
        this.totalReturn = totalReturnUiState;
        this.holdingsCardActionsUiState = holdingsCardActionsUiState;
    }

    public /* synthetic */ CryptoHoldingsCardUiState(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.TotalReturnUiState totalReturnUiState, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState holdingsCardActionsUiState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : totalReturnUiState, (i & 8) != 0 ? null : holdingsCardActionsUiState);
    }

    public final java.lang.String getTotalHoldingValue() {
        return this.totalHoldingValue;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.TotalReturnUiState getTotalReturn() {
        return this.totalReturn;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState getHoldingsCardActionsUiState() {
        return this.holdingsCardActionsUiState;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.totalHoldingValue;
        java.lang.String str2 = this.currencyCode;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.TotalReturnUiState totalReturnUiState = this.totalReturn;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState holdingsCardActionsUiState = this.holdingsCardActionsUiState;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoHoldingsCardUiState(totalHoldingValue=");
        sb.append(str);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(", totalReturn=");
        sb.append(totalReturnUiState);
        sb.append(", holdingsCardActionsUiState=");
        sb.append(holdingsCardActionsUiState);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.totalHoldingValue.hashCode();
        int hashCode2 = this.currencyCode.hashCode();
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.TotalReturnUiState totalReturnUiState = this.totalReturn;
        int hashCode3 = totalReturnUiState == null ? 0 : totalReturnUiState.hashCode();
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState holdingsCardActionsUiState = this.holdingsCardActionsUiState;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (holdingsCardActionsUiState != null ? holdingsCardActionsUiState.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState cryptoHoldingsCardUiState = (com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.totalHoldingValue, cryptoHoldingsCardUiState.totalHoldingValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, cryptoHoldingsCardUiState.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalReturn, cryptoHoldingsCardUiState.totalReturn) && kotlin.jvm.internal.Intrinsics.areEqual(this.holdingsCardActionsUiState, cryptoHoldingsCardUiState.holdingsCardActionsUiState);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState copy(java.lang.String totalHoldingValue, java.lang.String currencyCode, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.TotalReturnUiState totalReturn, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState holdingsCardActionsUiState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalHoldingValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState(totalHoldingValue, currencyCode, totalReturn, holdingsCardActionsUiState);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState getHoldingsCardActionsUiState() {
        return this.holdingsCardActionsUiState;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.TotalReturnUiState getTotalReturn() {
        return this.totalReturn;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTotalHoldingValue() {
        return this.totalHoldingValue;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState copy$default(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState cryptoHoldingsCardUiState, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.TotalReturnUiState totalReturnUiState, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.HoldingsCardActionsUiState holdingsCardActionsUiState, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cryptoHoldingsCardUiState.totalHoldingValue;
        }
        if ((i & 2) != 0) {
            str2 = cryptoHoldingsCardUiState.currencyCode;
        }
        if ((i & 4) != 0) {
            totalReturnUiState = cryptoHoldingsCardUiState.totalReturn;
        }
        if ((i & 8) != 0) {
            holdingsCardActionsUiState = cryptoHoldingsCardUiState.holdingsCardActionsUiState;
        }
        return cryptoHoldingsCardUiState.copy(str, str2, totalReturnUiState, holdingsCardActionsUiState);
    }
}
