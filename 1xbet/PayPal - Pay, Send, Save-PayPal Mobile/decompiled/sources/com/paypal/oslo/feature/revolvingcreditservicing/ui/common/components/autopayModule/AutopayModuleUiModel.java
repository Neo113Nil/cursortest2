package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ`\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b\u0004\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b*\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b+\u0010\u0011R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010\u001bR\u0011\u00101\u001a\u00020.8G¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00105\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00109\u001a\u0002068G¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u0010=\u001a\u00020:8G¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010A\u001a\u0004\u0018\u00010>8G¢\u0006\u0006\u001a\u0004\b?\u0010@"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayModuleUiModel;", "", "", "isAutopayOn", "isPaymentDue", "isPaymentPastDue", "", "dueDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayMethod;", "autopayMethod", "customAmount", "hasNetworkIssue", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "<init>", "(ZZZLjava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayMethod;Ljava/lang/String;ZLcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V", "component1", "()Z", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayMethod;", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "copy", "(ZZZLjava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayMethod;Ljava/lang/String;ZLcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayModuleUiModel;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getDueDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/AutopayMethod;", "getAutopayMethod", "getCustomAmount", "getHasNetworkIssue", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/PaymentStatus;", "getPaymentStatus", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/PaymentStatus;", "paymentStatus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/AutopayTitleUiModel;", "getAutopayTitleUiModel", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/AutopayTitleUiModel;", "autopayTitleUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/AutopayMethodUiModel;", "getAutopayMethodUiModel", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/balancemodule/AutopayMethodUiModel;", "autopayMethodUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopaystatus/autopayRow/AutopayRowUiModel;", "getAutopayRowUiModel", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopaystatus/autopayRow/AutopayRowUiModel;", "autopayRowUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopaystatus/autopayRow/AutopayAlertContext;", "getAutopayAlertContext", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopaystatus/autopayRow/AutopayAlertContext;", "autopayAlertContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AutopayModuleUiModel {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod autopayMethod;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;
    private final java.lang.String customAmount;
    private final java.lang.String dueDate;
    private final boolean hasNetworkIssue;
    private final boolean isAutopayOn;
    private final boolean isPaymentDue;
    private final boolean isPaymentPastDue;

    public AutopayModuleUiModel(boolean z, boolean z2, boolean z3, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod autopayMethod, java.lang.String str2, boolean z4, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        this.isAutopayOn = z;
        this.isPaymentDue = z2;
        this.isPaymentPastDue = z3;
        this.dueDate = str;
        this.autopayMethod = autopayMethod;
        this.customAmount = str2;
        this.hasNetworkIssue = z4;
        this.cpi = creditProductIdentifier;
    }

    public /* synthetic */ AutopayModuleUiModel(boolean z, boolean z2, boolean z3, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod autopayMethod, java.lang.String str2, boolean z4, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, (i & 8) != 0 ? "" : str, autopayMethod, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? false : z4, creditProductIdentifier);
    }

    public final boolean isAutopayOn() {
        return this.isAutopayOn;
    }

    public final boolean isPaymentDue() {
        return this.isPaymentDue;
    }

    public final boolean isPaymentPastDue() {
        return this.isPaymentPastDue;
    }

    public final java.lang.String getDueDate() {
        return this.dueDate;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod getAutopayMethod() {
        return this.autopayMethod;
    }

    public final java.lang.String getCustomAmount() {
        return this.customAmount;
    }

    public final boolean getHasNetworkIssue() {
        return this.hasNetworkIssue;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
        return this.cpi;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus getPaymentStatus() {
        return this.isPaymentPastDue ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus.PaymentPastDue : this.isPaymentDue ? com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus.HasPaymentDue : com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus.NoPaymentDue;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayTitleUiModel getAutopayTitleUiModel() {
        int i = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel.WhenMappings.$EnumSwitchMapping$0[getPaymentStatus().ordinal()];
        if (i == 1) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayTitleUiModel.PaymentPastDue(this.cpi);
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayTitleUiModel.NoPaymentDue.INSTANCE;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayTitleUiModel.HasPaymentDue(this.dueDate);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel getAutopayMethodUiModel() {
        int i = com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel.WhenMappings.$EnumSwitchMapping$1[this.autopayMethod.ordinal()];
        if (i == 1) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel.MinimumPaymentDue(this.cpi);
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel.StatementBalance.INSTANCE;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.AutopayMethodUiModel.CustomAmount(this.customAmount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel getAutopayRowUiModel() {
        int i = 1;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_autopay_status_title, this.cpi, true);
        if (this.hasNetworkIssue) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.PartialError(null, stringResOnly, i, 0 == true ? 1 : 0);
        }
        if (this.isAutopayOn) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Enabled(getAutopayMethodUiModel(), getAutopayAlertContext(), null, stringResOnly, 4, null);
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayRowUiModel.Disabled(getAutopayAlertContext(), null, stringResOnly, 2, null);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext getAutopayAlertContext() {
        if (this.isPaymentPastDue) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopaystatus.autopayRow.AutopayAlertContext.PaymentPastDue;
        }
        return null;
    }

    public final java.lang.String toString() {
        boolean z = this.isAutopayOn;
        boolean z2 = this.isPaymentDue;
        boolean z3 = this.isPaymentPastDue;
        java.lang.String str = this.dueDate;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod autopayMethod = this.autopayMethod;
        java.lang.String str2 = this.customAmount;
        boolean z4 = this.hasNetworkIssue;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.cpi;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutopayModuleUiModel(isAutopayOn=");
        sb.append(z);
        sb.append(", isPaymentDue=");
        sb.append(z2);
        sb.append(", isPaymentPastDue=");
        sb.append(z3);
        sb.append(", dueDate=");
        sb.append(str);
        sb.append(", autopayMethod=");
        sb.append(autopayMethod);
        sb.append(", customAmount=");
        sb.append(str2);
        sb.append(", hasNetworkIssue=");
        sb.append(z4);
        sb.append(", cpi=");
        sb.append(creditProductIdentifier);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((java.lang.Boolean.hashCode(this.isAutopayOn) * 31) + java.lang.Boolean.hashCode(this.isPaymentDue)) * 31) + java.lang.Boolean.hashCode(this.isPaymentPastDue)) * 31) + this.dueDate.hashCode()) * 31) + this.autopayMethod.hashCode()) * 31) + this.customAmount.hashCode()) * 31) + java.lang.Boolean.hashCode(this.hasNetworkIssue)) * 31) + this.cpi.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel autopayModuleUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel) other;
        return this.isAutopayOn == autopayModuleUiModel.isAutopayOn && this.isPaymentDue == autopayModuleUiModel.isPaymentDue && this.isPaymentPastDue == autopayModuleUiModel.isPaymentPastDue && kotlin.jvm.internal.Intrinsics.areEqual(this.dueDate, autopayModuleUiModel.dueDate) && this.autopayMethod == autopayModuleUiModel.autopayMethod && kotlin.jvm.internal.Intrinsics.areEqual(this.customAmount, autopayModuleUiModel.customAmount) && this.hasNetworkIssue == autopayModuleUiModel.hasNetworkIssue && this.cpi == autopayModuleUiModel.cpi;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel copy(boolean isAutopayOn, boolean isPaymentDue, boolean isPaymentPastDue, java.lang.String dueDate, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod autopayMethod, java.lang.String customAmount, boolean hasNetworkIssue, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dueDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayModuleUiModel(isAutopayOn, isPaymentDue, isPaymentPastDue, dueDate, autopayMethod, customAmount, hasNetworkIssue, cpi);
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
        return this.cpi;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHasNetworkIssue() {
        return this.hasNetworkIssue;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getCustomAmount() {
        return this.customAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod getAutopayMethod() {
        return this.autopayMethod;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDueDate() {
        return this.dueDate;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPaymentPastDue() {
        return this.isPaymentPastDue;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPaymentDue() {
        return this.isPaymentDue;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus.PaymentPastDue.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus.NoPaymentDue.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod.values().length];
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod.Minimum.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod.Statement.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.AutopayMethod.CustomAmount.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsAutopayOn() {
        return this.isAutopayOn;
    }
}
