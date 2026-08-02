package com.paypal.oslo.feature.balance.ui.autoReload.lowbalance;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B·\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010!J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010!J\u0010\u0010'\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0019JÀ\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b:\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010\u0019R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010!R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b@\u0010!R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\bA\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\bB\u0010\u0019R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bC\u0010!R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bD\u0010!R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010(R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\b\u0014\u0010*R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\bH\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceStateStore;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "name", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "thresholdAmount", "rechargeAmount", "currencyCode", "minimumAmount", "maximumAmount", "", "thresholdOptions", "rechargeOptions", "formattedMinimum", "formattedMaximum", "formattedThresholdOptions", "formattedRechargeOptions", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState;", "state", "", "isAutoReloadEnabled", "financialInstrumentId", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "component11", "component12", "component13", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState;", "component14", "()Z", "component15", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState;ZLjava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceStateStore;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "getThresholdAmount", "getRechargeAmount", "getCurrencyCode", "getMinimumAmount", "getMaximumAmount", "Ljava/util/List;", "getThresholdOptions", "getRechargeOptions", "getFormattedMinimum", "getFormattedMaximum", "getFormattedThresholdOptions", "getFormattedRechargeOptions", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState;", "getState", "Z", "getFinancialInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LowBalanceStateStore implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 8;
    private final java.lang.String currencyCode;
    private final java.lang.String financialInstrumentId;
    private final java.lang.String formattedMaximum;
    private final java.lang.String formattedMinimum;
    private final java.util.List<java.lang.String> formattedRechargeOptions;
    private final java.util.List<java.lang.String> formattedThresholdOptions;
    private final boolean isAutoReloadEnabled;
    private final java.lang.String maximumAmount;
    private final java.lang.String minimumAmount;
    private final java.lang.String name;
    private final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi rechargeAmount;
    private final java.util.List<java.lang.String> rechargeOptions;
    private final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState state;
    private final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi thresholdAmount;
    private final java.util.List<java.lang.String> thresholdOptions;

    public LowBalanceStateStore(java.lang.String str, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.lang.String str5, java.lang.String str6, java.util.List<java.lang.String> list3, java.util.List<java.lang.String> list4, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState lowBalanceState, boolean z, java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmountUi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmountUi2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowBalanceState, "");
        this.name = str;
        this.thresholdAmount = reloadAmountUi;
        this.rechargeAmount = reloadAmountUi2;
        this.currencyCode = str2;
        this.minimumAmount = str3;
        this.maximumAmount = str4;
        this.thresholdOptions = list;
        this.rechargeOptions = list2;
        this.formattedMinimum = str5;
        this.formattedMaximum = str6;
        this.formattedThresholdOptions = list3;
        this.formattedRechargeOptions = list4;
        this.state = lowBalanceState;
        this.isAutoReloadEnabled = z;
        this.financialInstrumentId = str7;
    }

    public /* synthetic */ LowBalanceStateStore(java.lang.String str, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, java.util.List list2, java.lang.String str5, java.lang.String str6, java.util.List list3, java.util.List list4, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState lowBalanceState, boolean z, java.lang.String str7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "LowBalanceState" : str, (i & 2) != 0 ? new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null) : reloadAmountUi, (i & 4) != 0 ? new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null) : reloadAmountUi2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 128) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 256) != 0 ? "" : str5, (i & 512) == 0 ? str6 : "", (i & 1024) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 2048) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4, (i & 4096) != 0 ? com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Initial.INSTANCE : lowBalanceState, (i & 8192) != 0 ? false : z, (i & 16384) == 0 ? str7 : null);
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public final java.lang.String getName() {
        return this.name;
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getThresholdAmount() {
        return this.thresholdAmount;
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getRechargeAmount() {
        return this.rechargeAmount;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getMinimumAmount() {
        return this.minimumAmount;
    }

    public final java.lang.String getMaximumAmount() {
        return this.maximumAmount;
    }

    public final java.util.List<java.lang.String> getThresholdOptions() {
        return this.thresholdOptions;
    }

    public final java.util.List<java.lang.String> getRechargeOptions() {
        return this.rechargeOptions;
    }

    public final java.lang.String getFormattedMinimum() {
        return this.formattedMinimum;
    }

    public final java.lang.String getFormattedMaximum() {
        return this.formattedMaximum;
    }

    public final java.util.List<java.lang.String> getFormattedThresholdOptions() {
        return this.formattedThresholdOptions;
    }

    public final java.util.List<java.lang.String> getFormattedRechargeOptions() {
        return this.formattedRechargeOptions;
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState getState() {
        return this.state;
    }

    public final boolean isAutoReloadEnabled() {
        return this.isAutoReloadEnabled;
    }

    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi = this.thresholdAmount;
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi2 = this.rechargeAmount;
        java.lang.String str2 = this.currencyCode;
        java.lang.String str3 = this.minimumAmount;
        java.lang.String str4 = this.maximumAmount;
        java.util.List<java.lang.String> list = this.thresholdOptions;
        java.util.List<java.lang.String> list2 = this.rechargeOptions;
        java.lang.String str5 = this.formattedMinimum;
        java.lang.String str6 = this.formattedMaximum;
        java.util.List<java.lang.String> list3 = this.formattedThresholdOptions;
        java.util.List<java.lang.String> list4 = this.formattedRechargeOptions;
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState lowBalanceState = this.state;
        boolean z = this.isAutoReloadEnabled;
        java.lang.String str7 = this.financialInstrumentId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LowBalanceStateStore(name=");
        sb.append(str);
        sb.append(", thresholdAmount=");
        sb.append(reloadAmountUi);
        sb.append(", rechargeAmount=");
        sb.append(reloadAmountUi2);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(", minimumAmount=");
        sb.append(str3);
        sb.append(", maximumAmount=");
        sb.append(str4);
        sb.append(", thresholdOptions=");
        sb.append(list);
        sb.append(", rechargeOptions=");
        sb.append(list2);
        sb.append(", formattedMinimum=");
        sb.append(str5);
        sb.append(", formattedMaximum=");
        sb.append(str6);
        sb.append(", formattedThresholdOptions=");
        sb.append(list3);
        sb.append(", formattedRechargeOptions=");
        sb.append(list4);
        sb.append(", state=");
        sb.append(lowBalanceState);
        sb.append(", isAutoReloadEnabled=");
        sb.append(z);
        sb.append(", financialInstrumentId=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.thresholdAmount.hashCode();
        int hashCode3 = this.rechargeAmount.hashCode();
        int hashCode4 = this.currencyCode.hashCode();
        int hashCode5 = this.minimumAmount.hashCode();
        int hashCode6 = this.maximumAmount.hashCode();
        int hashCode7 = this.thresholdOptions.hashCode();
        int hashCode8 = this.rechargeOptions.hashCode();
        int hashCode9 = this.formattedMinimum.hashCode();
        int hashCode10 = this.formattedMaximum.hashCode();
        int hashCode11 = this.formattedThresholdOptions.hashCode();
        int hashCode12 = this.formattedRechargeOptions.hashCode();
        int hashCode13 = this.state.hashCode();
        int hashCode14 = java.lang.Boolean.hashCode(this.isAutoReloadEnabled);
        java.lang.String str = this.financialInstrumentId;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore)) {
            return false;
        }
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore lowBalanceStateStore = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, lowBalanceStateStore.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdAmount, lowBalanceStateStore.thresholdAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.rechargeAmount, lowBalanceStateStore.rechargeAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, lowBalanceStateStore.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumAmount, lowBalanceStateStore.minimumAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumAmount, lowBalanceStateStore.maximumAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdOptions, lowBalanceStateStore.thresholdOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.rechargeOptions, lowBalanceStateStore.rechargeOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedMinimum, lowBalanceStateStore.formattedMinimum) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedMaximum, lowBalanceStateStore.formattedMaximum) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedThresholdOptions, lowBalanceStateStore.formattedThresholdOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedRechargeOptions, lowBalanceStateStore.formattedRechargeOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, lowBalanceStateStore.state) && this.isAutoReloadEnabled == lowBalanceStateStore.isAutoReloadEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, lowBalanceStateStore.financialInstrumentId);
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore copy(java.lang.String name2, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi thresholdAmount, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi rechargeAmount, java.lang.String currencyCode, java.lang.String minimumAmount, java.lang.String maximumAmount, java.util.List<java.lang.String> thresholdOptions, java.util.List<java.lang.String> rechargeOptions, java.lang.String formattedMinimum, java.lang.String formattedMaximum, java.util.List<java.lang.String> formattedThresholdOptions, java.util.List<java.lang.String> formattedRechargeOptions, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState state, boolean isAutoReloadEnabled, java.lang.String financialInstrumentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rechargeAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maximumAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rechargeOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMinimum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMaximum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedThresholdOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedRechargeOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore(name2, thresholdAmount, rechargeAmount, currencyCode, minimumAmount, maximumAmount, thresholdOptions, rechargeOptions, formattedMinimum, formattedMaximum, formattedThresholdOptions, formattedRechargeOptions, state, isAutoReloadEnabled, financialInstrumentId);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getFormattedMinimum() {
        return this.formattedMinimum;
    }

    public final java.util.List<java.lang.String> component8() {
        return this.rechargeOptions;
    }

    public final java.util.List<java.lang.String> component7() {
        return this.thresholdOptions;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getMaximumAmount() {
        return this.maximumAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getMinimumAmount() {
        return this.minimumAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getRechargeAmount() {
        return this.rechargeAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getThresholdAmount() {
        return this.thresholdAmount;
    }

    /* renamed from: component15, reason: from getter */
    public final java.lang.String getFinancialInstrumentId() {
        return this.financialInstrumentId;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsAutoReloadEnabled() {
        return this.isAutoReloadEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState getState() {
        return this.state;
    }

    public final java.util.List<java.lang.String> component12() {
        return this.formattedRechargeOptions;
    }

    public final java.util.List<java.lang.String> component11() {
        return this.formattedThresholdOptions;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getFormattedMaximum() {
        return this.formattedMaximum;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public LowBalanceStateStore() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 32767, null);
    }
}
