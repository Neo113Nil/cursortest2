package com.paypal.oslo.feature.p2p.ui.crossborder.state;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001dJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b/\u0010%J\u0010\u00100\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b1\u0010%J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u001dJ\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u001dJæ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b@\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\bA\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\bB\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\bC\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bD\u0010\u001dR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bE\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010F\u001a\u0004\b\u000b\u0010%R\u001a\u0010\f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\b\f\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bG\u0010\u001dR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010)R\u001a\u0010\u0010\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\b\u0010\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\bJ\u0010\u001dR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010K\u001a\u0004\bL\u0010-R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bM\u0010-R\u001a\u0010\u0015\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bN\u0010%R\u001a\u0010\u0016\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\b\u0016\u0010%R\u001a\u0010\u0017\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010F\u001a\u0004\b\u0017\u0010%R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010>\u001a\u0004\bO\u0010\u001dR\u001a\u0010\u0019\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010>\u001a\u0004\bP\u0010\u001dR\u0011\u0010R\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\bQ\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/crossborder/state/CrossBorderUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "sendAmount", "sendCurrencyCode", "receiveAmount", "receiveCurrencyCode", "receiveCurrencyId", "exchangeRate", "", "isLoadingReceiveAmount", "isLoadingSendAmount", "fxQuoteId", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SUPPORTED_INTENTS, "isUpdatingIntent", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "sendMoney", "receiveMoney", "useSendCurrency", "isError", "isEditMode", "editModeIntent", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;ZZZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Z", "component9", "component10", "component11", "()Ljava/util/List;", "component12", "component13", "component14", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;ZZZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/crossborder/state/CrossBorderUiState;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTransferAttemptId", "getSendAmount", "getSendCurrencyCode", "getReceiveAmount", "getReceiveCurrencyCode", "getReceiveCurrencyId", "getExchangeRate", "Z", "getFxQuoteId", "Ljava/util/List;", "getSupportedIntents", "getPendingIntent", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getSendMoney", "getReceiveMoney", "getUseSendCurrency", "getEditModeIntent", "getName", "getAreButtonsEnabled", "areButtonsEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CrossBorderUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 8;
    private final java.lang.String editModeIntent;
    private final java.lang.String exchangeRate;
    private final java.lang.String fxQuoteId;
    private final boolean isEditMode;
    private final boolean isError;
    private final boolean isLoadingReceiveAmount;
    private final boolean isLoadingSendAmount;
    private final boolean isUpdatingIntent;
    private final java.lang.String name;
    private final java.lang.String pendingIntent;
    private final java.lang.String receiveAmount;
    private final java.lang.String receiveCurrencyCode;
    private final java.lang.String receiveCurrencyId;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount receiveMoney;
    private final java.lang.String sendAmount;
    private final java.lang.String sendCurrencyCode;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount sendMoney;
    private final java.util.List<java.lang.String> supportedIntents;
    private final java.lang.String transferAttemptId;
    private final boolean useSendCurrency;

    public CrossBorderUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z, boolean z2, java.lang.String str8, java.util.List<java.lang.String> list, boolean z3, java.lang.String str9, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2, boolean z4, boolean z5, boolean z6, java.lang.String str10, java.lang.String str11) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "");
        this.transferAttemptId = str;
        this.sendAmount = str2;
        this.sendCurrencyCode = str3;
        this.receiveAmount = str4;
        this.receiveCurrencyCode = str5;
        this.receiveCurrencyId = str6;
        this.exchangeRate = str7;
        this.isLoadingReceiveAmount = z;
        this.isLoadingSendAmount = z2;
        this.fxQuoteId = str8;
        this.supportedIntents = list;
        this.isUpdatingIntent = z3;
        this.pendingIntent = str9;
        this.sendMoney = moneyAmount;
        this.receiveMoney = moneyAmount2;
        this.useSendCurrency = z4;
        this.isError = z5;
        this.isEditMode = z6;
        this.editModeIntent = str10;
        this.name = str11;
    }

    public /* synthetic */ CrossBorderUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z, boolean z2, java.lang.String str8, java.util.List list, boolean z3, java.lang.String str9, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2, boolean z4, boolean z5, boolean z6, java.lang.String str10, java.lang.String str11, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "USD" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2048) != 0 ? false : z3, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : moneyAmount, (i & 16384) != 0 ? null : moneyAmount2, (i & 32768) != 0 ? false : z4, (i & 65536) != 0 ? false : z5, (i & 131072) != 0 ? false : z6, (i & 262144) != 0 ? "" : str10, (i & 524288) != 0 ? "CrossBorderUiState" : str11);
    }

    public final java.lang.String getTransferAttemptId() {
        return this.transferAttemptId;
    }

    public final java.lang.String getSendAmount() {
        return this.sendAmount;
    }

    public final java.lang.String getSendCurrencyCode() {
        return this.sendCurrencyCode;
    }

    public final java.lang.String getReceiveAmount() {
        return this.receiveAmount;
    }

    public final java.lang.String getReceiveCurrencyCode() {
        return this.receiveCurrencyCode;
    }

    public final java.lang.String getReceiveCurrencyId() {
        return this.receiveCurrencyId;
    }

    public final java.lang.String getExchangeRate() {
        return this.exchangeRate;
    }

    public final boolean isLoadingReceiveAmount() {
        return this.isLoadingReceiveAmount;
    }

    public final boolean isLoadingSendAmount() {
        return this.isLoadingSendAmount;
    }

    public final java.lang.String getFxQuoteId() {
        return this.fxQuoteId;
    }

    public final java.util.List<java.lang.String> getSupportedIntents() {
        return this.supportedIntents;
    }

    public final boolean isUpdatingIntent() {
        return this.isUpdatingIntent;
    }

    public final java.lang.String getPendingIntent() {
        return this.pendingIntent;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getSendMoney() {
        return this.sendMoney;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getReceiveMoney() {
        return this.receiveMoney;
    }

    public final boolean getUseSendCurrency() {
        return this.useSendCurrency;
    }

    public final boolean isError() {
        return this.isError;
    }

    public final boolean isEditMode() {
        return this.isEditMode;
    }

    public final java.lang.String getEditModeIntent() {
        return this.editModeIntent;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public final java.lang.String getName() {
        return this.name;
    }

    public final boolean getAreButtonsEnabled() {
        return (this.isUpdatingIntent || this.isLoadingReceiveAmount || this.isLoadingSendAmount || !com.paypal.oslo.feature.p2p.ui.utils.AmountValidationKt.isValidPositiveAmount(this.sendAmount)) ? false : true;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.transferAttemptId;
        java.lang.String str2 = this.sendAmount;
        java.lang.String str3 = this.sendCurrencyCode;
        java.lang.String str4 = this.receiveAmount;
        java.lang.String str5 = this.receiveCurrencyCode;
        java.lang.String str6 = this.receiveCurrencyId;
        java.lang.String str7 = this.exchangeRate;
        boolean z = this.isLoadingReceiveAmount;
        boolean z2 = this.isLoadingSendAmount;
        java.lang.String str8 = this.fxQuoteId;
        java.util.List<java.lang.String> list = this.supportedIntents;
        boolean z3 = this.isUpdatingIntent;
        java.lang.String str9 = this.pendingIntent;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.sendMoney;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2 = this.receiveMoney;
        boolean z4 = this.useSendCurrency;
        boolean z5 = this.isError;
        boolean z6 = this.isEditMode;
        java.lang.String str10 = this.editModeIntent;
        java.lang.String str11 = this.name;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CrossBorderUiState(transferAttemptId=");
        sb.append(str);
        sb.append(", sendAmount=");
        sb.append(str2);
        sb.append(", sendCurrencyCode=");
        sb.append(str3);
        sb.append(", receiveAmount=");
        sb.append(str4);
        sb.append(", receiveCurrencyCode=");
        sb.append(str5);
        sb.append(", receiveCurrencyId=");
        sb.append(str6);
        sb.append(", exchangeRate=");
        sb.append(str7);
        sb.append(", isLoadingReceiveAmount=");
        sb.append(z);
        sb.append(", isLoadingSendAmount=");
        sb.append(z2);
        sb.append(", fxQuoteId=");
        sb.append(str8);
        sb.append(", supportedIntents=");
        sb.append(list);
        sb.append(", isUpdatingIntent=");
        sb.append(z3);
        sb.append(", pendingIntent=");
        sb.append(str9);
        sb.append(", sendMoney=");
        sb.append(moneyAmount);
        sb.append(", receiveMoney=");
        sb.append(moneyAmount2);
        sb.append(", useSendCurrency=");
        sb.append(z4);
        sb.append(", isError=");
        sb.append(z5);
        sb.append(", isEditMode=");
        sb.append(z6);
        sb.append(", editModeIntent=");
        sb.append(str10);
        sb.append(", name=");
        sb.append(str11);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.transferAttemptId.hashCode();
        int hashCode2 = this.sendAmount.hashCode();
        int hashCode3 = this.sendCurrencyCode.hashCode();
        int hashCode4 = this.receiveAmount.hashCode();
        int hashCode5 = this.receiveCurrencyCode.hashCode();
        int hashCode6 = this.receiveCurrencyId.hashCode();
        int hashCode7 = this.exchangeRate.hashCode();
        int hashCode8 = java.lang.Boolean.hashCode(this.isLoadingReceiveAmount);
        int hashCode9 = java.lang.Boolean.hashCode(this.isLoadingSendAmount);
        java.lang.String str = this.fxQuoteId;
        int hashCode10 = str == null ? 0 : str.hashCode();
        int hashCode11 = this.supportedIntents.hashCode();
        int hashCode12 = java.lang.Boolean.hashCode(this.isUpdatingIntent);
        java.lang.String str2 = this.pendingIntent;
        int hashCode13 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.sendMoney;
        int hashCode14 = moneyAmount == null ? 0 : moneyAmount.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2 = this.receiveMoney;
        return (((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (moneyAmount2 != null ? moneyAmount2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.useSendCurrency)) * 31) + java.lang.Boolean.hashCode(this.isError)) * 31) + java.lang.Boolean.hashCode(this.isEditMode)) * 31) + this.editModeIntent.hashCode()) * 31) + this.name.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState crossBorderUiState = (com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptId, crossBorderUiState.transferAttemptId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sendAmount, crossBorderUiState.sendAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.sendCurrencyCode, crossBorderUiState.sendCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveAmount, crossBorderUiState.receiveAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveCurrencyCode, crossBorderUiState.receiveCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveCurrencyId, crossBorderUiState.receiveCurrencyId) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, crossBorderUiState.exchangeRate) && this.isLoadingReceiveAmount == crossBorderUiState.isLoadingReceiveAmount && this.isLoadingSendAmount == crossBorderUiState.isLoadingSendAmount && kotlin.jvm.internal.Intrinsics.areEqual(this.fxQuoteId, crossBorderUiState.fxQuoteId) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedIntents, crossBorderUiState.supportedIntents) && this.isUpdatingIntent == crossBorderUiState.isUpdatingIntent && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingIntent, crossBorderUiState.pendingIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.sendMoney, crossBorderUiState.sendMoney) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveMoney, crossBorderUiState.receiveMoney) && this.useSendCurrency == crossBorderUiState.useSendCurrency && this.isError == crossBorderUiState.isError && this.isEditMode == crossBorderUiState.isEditMode && kotlin.jvm.internal.Intrinsics.areEqual(this.editModeIntent, crossBorderUiState.editModeIntent) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, crossBorderUiState.name);
    }

    public final com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState copy(java.lang.String transferAttemptId, java.lang.String sendAmount, java.lang.String sendCurrencyCode, java.lang.String receiveAmount, java.lang.String receiveCurrencyCode, java.lang.String receiveCurrencyId, java.lang.String exchangeRate, boolean isLoadingReceiveAmount, boolean isLoadingSendAmount, java.lang.String fxQuoteId, java.util.List<java.lang.String> supportedIntents, boolean isUpdatingIntent, java.lang.String pendingIntent, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount sendMoney, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount receiveMoney, boolean useSendCurrency, boolean isError, boolean isEditMode, java.lang.String editModeIntent, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendCurrencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiveAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiveCurrencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiveCurrencyId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedIntents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editModeIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState(transferAttemptId, sendAmount, sendCurrencyCode, receiveAmount, receiveCurrencyCode, receiveCurrencyId, exchangeRate, isLoadingReceiveAmount, isLoadingSendAmount, fxQuoteId, supportedIntents, isUpdatingIntent, pendingIntent, sendMoney, receiveMoney, useSendCurrency, isError, isEditMode, editModeIntent, name2);
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsLoadingSendAmount() {
        return this.isLoadingSendAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsLoadingReceiveAmount() {
        return this.isLoadingReceiveAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getExchangeRate() {
        return this.exchangeRate;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getReceiveCurrencyId() {
        return this.receiveCurrencyId;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getReceiveCurrencyCode() {
        return this.receiveCurrencyCode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getReceiveAmount() {
        return this.receiveAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSendCurrencyCode() {
        return this.sendCurrencyCode;
    }

    /* renamed from: component20, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSendAmount() {
        return this.sendAmount;
    }

    /* renamed from: component19, reason: from getter */
    public final java.lang.String getEditModeIntent() {
        return this.editModeIntent;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsEditMode() {
        return this.isEditMode;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getUseSendCurrency() {
        return this.useSendCurrency;
    }

    /* renamed from: component15, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getReceiveMoney() {
        return this.receiveMoney;
    }

    /* renamed from: component14, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getSendMoney() {
        return this.sendMoney;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getPendingIntent() {
        return this.pendingIntent;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsUpdatingIntent() {
        return this.isUpdatingIntent;
    }

    public final java.util.List<java.lang.String> component11() {
        return this.supportedIntents;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getFxQuoteId() {
        return this.fxQuoteId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTransferAttemptId() {
        return this.transferAttemptId;
    }

    public CrossBorderUiState() {
        this(null, null, null, null, null, null, null, false, false, null, null, false, null, null, null, false, false, false, null, null, 1048575, null);
    }
}
