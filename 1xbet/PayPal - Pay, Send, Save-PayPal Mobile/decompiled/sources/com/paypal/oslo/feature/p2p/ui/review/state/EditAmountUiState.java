package com.paypal.oslo.feature.p2p.ui.review.state;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013Jp\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b\b\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b1\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b4\u0010\u0013R\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b5\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/state/EditAmountUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "name", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;", "uiAmount", "", "isLoading", "", "errorResId", "hasUserSelected", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "selectedIntent", "crossBorderSendAmount", "receiveCurrencyId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;ZLjava/lang/Integer;ZLcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;", "component4", "()Z", "component5", "()Ljava/lang/Integer;", "component6", "component7", "()Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;ZLjava/lang/Integer;ZLcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/state/EditAmountUiState;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getTransferAttemptId", "Lcom/paypal/oslo/feature/p2p/ui/review/state/UiAmount;", "getUiAmount", "Z", "Ljava/lang/Integer;", "getErrorResId", "getHasUserSelected", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "getSelectedIntent", "getCrossBorderSendAmount", "getReceiveCurrencyId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EditAmountUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String crossBorderSendAmount;
    private final java.lang.Integer errorResId;
    private final boolean hasUserSelected;
    private final boolean isLoading;
    private final java.lang.String name;
    private final java.lang.String receiveCurrencyId;
    private final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent selectedIntent;
    private final java.lang.String transferAttemptId;
    private final com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount;

    public EditAmountUiState(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount, boolean z, java.lang.Integer num, boolean z2, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.name = str;
        this.transferAttemptId = str2;
        this.uiAmount = uiAmount;
        this.isLoading = z;
        this.errorResId = num;
        this.hasUserSelected = z2;
        this.selectedIntent = paymentTransferIntent;
        this.crossBorderSendAmount = str3;
        this.receiveCurrencyId = str4;
    }

    public /* synthetic */ EditAmountUiState(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount, boolean z, java.lang.Integer num, boolean z2, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "EditAmountUiState" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : uiAmount, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : num, (i & 32) == 0 ? z2 : false, (i & 64) == 0 ? paymentTransferIntent : null, (i & 128) != 0 ? "" : str3, (i & 256) == 0 ? str4 : "");
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getTransferAttemptId() {
        return this.transferAttemptId;
    }

    public final com.paypal.oslo.feature.p2p.ui.review.state.UiAmount getUiAmount() {
        return this.uiAmount;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.Integer getErrorResId() {
        return this.errorResId;
    }

    public final boolean getHasUserSelected() {
        return this.hasUserSelected;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent getSelectedIntent() {
        return this.selectedIntent;
    }

    public final java.lang.String getCrossBorderSendAmount() {
        return this.crossBorderSendAmount;
    }

    public final java.lang.String getReceiveCurrencyId() {
        return this.receiveCurrencyId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.transferAttemptId;
        com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount = this.uiAmount;
        boolean z = this.isLoading;
        java.lang.Integer num = this.errorResId;
        boolean z2 = this.hasUserSelected;
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent = this.selectedIntent;
        java.lang.String str3 = this.crossBorderSendAmount;
        java.lang.String str4 = this.receiveCurrencyId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EditAmountUiState(name=");
        sb.append(str);
        sb.append(", transferAttemptId=");
        sb.append(str2);
        sb.append(", uiAmount=");
        sb.append(uiAmount);
        sb.append(", isLoading=");
        sb.append(z);
        sb.append(", errorResId=");
        sb.append(num);
        sb.append(", hasUserSelected=");
        sb.append(z2);
        sb.append(", selectedIntent=");
        sb.append(paymentTransferIntent);
        sb.append(", crossBorderSendAmount=");
        sb.append(str3);
        sb.append(", receiveCurrencyId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.transferAttemptId.hashCode();
        com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount = this.uiAmount;
        int hashCode3 = uiAmount == null ? 0 : uiAmount.hashCode();
        int hashCode4 = java.lang.Boolean.hashCode(this.isLoading);
        java.lang.Integer num = this.errorResId;
        int hashCode5 = num == null ? 0 : num.hashCode();
        int hashCode6 = java.lang.Boolean.hashCode(this.hasUserSelected);
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent = this.selectedIntent;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (paymentTransferIntent != null ? paymentTransferIntent.hashCode() : 0)) * 31) + this.crossBorderSendAmount.hashCode()) * 31) + this.receiveCurrencyId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState editAmountUiState = (com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, editAmountUiState.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptId, editAmountUiState.transferAttemptId) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiAmount, editAmountUiState.uiAmount) && this.isLoading == editAmountUiState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.errorResId, editAmountUiState.errorResId) && this.hasUserSelected == editAmountUiState.hasUserSelected && this.selectedIntent == editAmountUiState.selectedIntent && kotlin.jvm.internal.Intrinsics.areEqual(this.crossBorderSendAmount, editAmountUiState.crossBorderSendAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveCurrencyId, editAmountUiState.receiveCurrencyId);
    }

    public final com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState copy(java.lang.String name2, java.lang.String transferAttemptId, com.paypal.oslo.feature.p2p.ui.review.state.UiAmount uiAmount, boolean isLoading, java.lang.Integer errorResId, boolean hasUserSelected, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent selectedIntent, java.lang.String crossBorderSendAmount, java.lang.String receiveCurrencyId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crossBorderSendAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiveCurrencyId, "");
        return new com.paypal.oslo.feature.p2p.ui.review.state.EditAmountUiState(name2, transferAttemptId, uiAmount, isLoading, errorResId, hasUserSelected, selectedIntent, crossBorderSendAmount, receiveCurrencyId);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getReceiveCurrencyId() {
        return this.receiveCurrencyId;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getCrossBorderSendAmount() {
        return this.crossBorderSendAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent getSelectedIntent() {
        return this.selectedIntent;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasUserSelected() {
        return this.hasUserSelected;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Integer getErrorResId() {
        return this.errorResId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.ui.review.state.UiAmount getUiAmount() {
        return this.uiAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTransferAttemptId() {
        return this.transferAttemptId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public EditAmountUiState() {
        this(null, null, null, false, null, false, null, null, null, 511, null);
    }
}
