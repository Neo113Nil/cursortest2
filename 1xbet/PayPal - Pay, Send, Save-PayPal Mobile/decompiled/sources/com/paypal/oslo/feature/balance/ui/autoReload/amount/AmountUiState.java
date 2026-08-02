package com.paypal.oslo.feature.balance.ui.autoReload.amount;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\nHÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0096\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b5\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b6\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b7\u0010\u0019R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u001fR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010!R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b<\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b=\u0010\u0019R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b>\u0010\u0019R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\b@\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountUiState;", "", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;", "intent", "", "currencyCode", "minimumAmount", "formattedMinimum", "maximumAmount", "formattedMaximum", "", "options", "", "mayInputCustomAmount", "Lcom/paypal/pds/components/SelectionCardModel;", "optionsUi", "amount", "initialAmount", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;", "amountValidation", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()Z", "component9", "component10", "component11", "component12", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;)Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;", "getIntent", "Ljava/lang/String;", "getCurrencyCode", "getMinimumAmount", "getFormattedMinimum", "getMaximumAmount", "getFormattedMaximum", "Ljava/util/List;", "getOptions", "Z", "getMayInputCustomAmount", "getOptionsUi", "getAmount", "getInitialAmount", "Lcom/paypal/oslo/feature/balance/ui/autoReload/amount/AmountValidationType;", "getAmountValidation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AmountUiState {
    public static final int $stable = 8;
    private final java.lang.String amount;
    private final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType amountValidation;
    private final java.lang.String currencyCode;
    private final java.lang.String formattedMaximum;
    private final java.lang.String formattedMinimum;
    private final java.lang.String initialAmount;
    private final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent intent;
    private final java.lang.String maximumAmount;
    private final boolean mayInputCustomAmount;
    private final java.lang.String minimumAmount;
    private final java.util.List<java.lang.String> options;
    private final java.util.List<com.paypal.pds.components.SelectionCardModel> optionsUi;

    public AmountUiState(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent autoReloadAmountIntent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List<java.lang.String> list, boolean z, java.util.List<com.paypal.pds.components.SelectionCardModel> list2, java.lang.String str6, java.lang.String str7, com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType amountValidationType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountValidationType, "");
        this.intent = autoReloadAmountIntent;
        this.currencyCode = str;
        this.minimumAmount = str2;
        this.formattedMinimum = str3;
        this.maximumAmount = str4;
        this.formattedMaximum = str5;
        this.options = list;
        this.mayInputCustomAmount = z;
        this.optionsUi = list2;
        this.amount = str6;
        this.initialAmount = str7;
        this.amountValidation = amountValidationType;
    }

    public /* synthetic */ AmountUiState(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent autoReloadAmountIntent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list, boolean z, java.util.List list2, java.lang.String str6, java.lang.String str7, com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType amountValidationType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : autoReloadAmountIntent, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 128) != 0 ? false : z, (i & 256) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 512) != 0 ? "" : str6, (i & 1024) == 0 ? str7 : "", (i & 2048) != 0 ? com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType.Valid.INSTANCE : amountValidationType);
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent getIntent() {
        return this.intent;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getMinimumAmount() {
        return this.minimumAmount;
    }

    public final java.lang.String getFormattedMinimum() {
        return this.formattedMinimum;
    }

    public final java.lang.String getMaximumAmount() {
        return this.maximumAmount;
    }

    public final java.lang.String getFormattedMaximum() {
        return this.formattedMaximum;
    }

    public final java.util.List<java.lang.String> getOptions() {
        return this.options;
    }

    public final boolean getMayInputCustomAmount() {
        return this.mayInputCustomAmount;
    }

    public final java.util.List<com.paypal.pds.components.SelectionCardModel> getOptionsUi() {
        return this.optionsUi;
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final java.lang.String getInitialAmount() {
        return this.initialAmount;
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType getAmountValidation() {
        return this.amountValidation;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent autoReloadAmountIntent = this.intent;
        java.lang.String str = this.currencyCode;
        java.lang.String str2 = this.minimumAmount;
        java.lang.String str3 = this.formattedMinimum;
        java.lang.String str4 = this.maximumAmount;
        java.lang.String str5 = this.formattedMaximum;
        java.util.List<java.lang.String> list = this.options;
        boolean z = this.mayInputCustomAmount;
        java.util.List<com.paypal.pds.components.SelectionCardModel> list2 = this.optionsUi;
        java.lang.String str6 = this.amount;
        java.lang.String str7 = this.initialAmount;
        com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType amountValidationType = this.amountValidation;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountUiState(intent=");
        sb.append(autoReloadAmountIntent);
        sb.append(", currencyCode=");
        sb.append(str);
        sb.append(", minimumAmount=");
        sb.append(str2);
        sb.append(", formattedMinimum=");
        sb.append(str3);
        sb.append(", maximumAmount=");
        sb.append(str4);
        sb.append(", formattedMaximum=");
        sb.append(str5);
        sb.append(", options=");
        sb.append(list);
        sb.append(", mayInputCustomAmount=");
        sb.append(z);
        sb.append(", optionsUi=");
        sb.append(list2);
        sb.append(", amount=");
        sb.append(str6);
        sb.append(", initialAmount=");
        sb.append(str7);
        sb.append(", amountValidation=");
        sb.append(amountValidationType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent autoReloadAmountIntent = this.intent;
        return ((((((((((((((((((((((autoReloadAmountIntent == null ? 0 : autoReloadAmountIntent.hashCode()) * 31) + this.currencyCode.hashCode()) * 31) + this.minimumAmount.hashCode()) * 31) + this.formattedMinimum.hashCode()) * 31) + this.maximumAmount.hashCode()) * 31) + this.formattedMaximum.hashCode()) * 31) + this.options.hashCode()) * 31) + java.lang.Boolean.hashCode(this.mayInputCustomAmount)) * 31) + this.optionsUi.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.initialAmount.hashCode()) * 31) + this.amountValidation.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState)) {
            return false;
        }
        com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState amountUiState = (com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.intent, amountUiState.intent) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, amountUiState.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumAmount, amountUiState.minimumAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedMinimum, amountUiState.formattedMinimum) && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumAmount, amountUiState.maximumAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedMaximum, amountUiState.formattedMaximum) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, amountUiState.options) && this.mayInputCustomAmount == amountUiState.mayInputCustomAmount && kotlin.jvm.internal.Intrinsics.areEqual(this.optionsUi, amountUiState.optionsUi) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, amountUiState.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.initialAmount, amountUiState.initialAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountValidation, amountUiState.amountValidation);
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState copy(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent intent, java.lang.String currencyCode, java.lang.String minimumAmount, java.lang.String formattedMinimum, java.lang.String maximumAmount, java.lang.String formattedMaximum, java.util.List<java.lang.String> options, boolean mayInputCustomAmount, java.util.List<com.paypal.pds.components.SelectionCardModel> optionsUi, java.lang.String amount, java.lang.String initialAmount, com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType amountValidation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMinimum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maximumAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMaximum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionsUi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountValidation, "");
        return new com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountUiState(intent, currencyCode, minimumAmount, formattedMinimum, maximumAmount, formattedMaximum, options, mayInputCustomAmount, optionsUi, amount, initialAmount, amountValidation);
    }

    public final java.util.List<com.paypal.pds.components.SelectionCardModel> component9() {
        return this.optionsUi;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getMayInputCustomAmount() {
        return this.mayInputCustomAmount;
    }

    public final java.util.List<java.lang.String> component7() {
        return this.options;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getFormattedMaximum() {
        return this.formattedMaximum;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getMaximumAmount() {
        return this.maximumAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFormattedMinimum() {
        return this.formattedMinimum;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMinimumAmount() {
        return this.minimumAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component12, reason: from getter */
    public final com.paypal.oslo.feature.balance.ui.autoReload.amount.AmountValidationType getAmountValidation() {
        return this.amountValidation;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getInitialAmount() {
        return this.initialAmount;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent getIntent() {
        return this.intent;
    }

    public AmountUiState() {
        this(null, null, null, null, null, null, null, false, null, null, null, null, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, null);
    }
}
