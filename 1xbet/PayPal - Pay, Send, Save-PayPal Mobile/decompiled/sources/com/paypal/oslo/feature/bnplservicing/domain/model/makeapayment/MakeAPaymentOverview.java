package com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004HÆ\u0003¢\u0006\u0004\b.\u0010 J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0012\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b0\u0010$J\u0010\u00101\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b1\u0010+J\u0010\u00102\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b2\u0010+JÄ\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b;\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bC\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bD\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bE\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bF\u0010$R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010)R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bJ\u0010+R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010K\u001a\u0004\bL\u0010-R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\bM\u0010 R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\bN\u0010 R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bO\u0010$R\u001a\u0010\u0019\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010I\u001a\u0004\bP\u0010+R\u001a\u0010\u001a\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010I\u001a\u0004\bQ\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentOverview;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;", "planStatus", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/PaymentOption;", "paymentOptions", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifier", "", "countryCode", "currencyCode", "productTimezone", "creditAccountId", "", "interestBearing", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "currentDueAmount", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/Autopay;", "autopay", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstruments", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/SupportedFundingInstrumentTypeForAddition;", "supportingFundingInstrumentsToAdd", "paymentAuthorizationLink", "maxRepaymentAmount", "minRepaymentAmount", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/Autopay;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "()Z", "component9", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "component10", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/Autopay;", "component11", "component12", "component13", "component14", "component15", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;Ljava/util/List;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/Autopay;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentOverview;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/PlanStatus;", "getPlanStatus", "Ljava/util/List;", "getPaymentOptions", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/lang/String;", "getCountryCode", "getCurrencyCode", "getProductTimezone", "getCreditAccountId", "Z", "getInterestBearing", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "getCurrentDueAmount", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/Autopay;", "getAutopay", "getFundingInstruments", "getSupportingFundingInstrumentsToAdd", "getPaymentAuthorizationLink", "getMaxRepaymentAmount", "getMinRepaymentAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MakeAPaymentOverview {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay autopay;
    private final java.lang.String countryCode;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier;
    private final java.lang.String currencyCode;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money currentDueAmount;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments;
    private final boolean interestBearing;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money maxRepaymentAmount;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money minRepaymentAmount;
    private final java.lang.String paymentAuthorizationLink;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption> paymentOptions;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus;
    private final java.lang.String productTimezone;
    private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> supportingFundingInstrumentsToAdd;

    /* JADX WARN: Multi-variable type inference failed */
    public MakeAPaymentOverview(com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus, java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption> list, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay autopay, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> list2, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> list3, java.lang.String str5, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money3, "");
        this.planStatus = planStatus;
        this.paymentOptions = list;
        this.creditProductIdentifier = creditProductIdentifier;
        this.countryCode = str;
        this.currencyCode = str2;
        this.productTimezone = str3;
        this.creditAccountId = str4;
        this.interestBearing = z;
        this.currentDueAmount = money;
        this.autopay = autopay;
        this.fundingInstruments = list2;
        this.supportingFundingInstrumentsToAdd = list3;
        this.paymentAuthorizationLink = str5;
        this.maxRepaymentAmount = money2;
        this.minRepaymentAmount = money3;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus getPlanStatus() {
        return this.planStatus;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption> getPaymentOptions() {
        return this.paymentOptions;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getProductTimezone() {
        return this.productTimezone;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final boolean getInterestBearing() {
        return this.interestBearing;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getCurrentDueAmount() {
        return this.currentDueAmount;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay getAutopay() {
        return this.autopay;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> getFundingInstruments() {
        return this.fundingInstruments;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> getSupportingFundingInstrumentsToAdd() {
        return this.supportingFundingInstrumentsToAdd;
    }

    public final java.lang.String getPaymentAuthorizationLink() {
        return this.paymentAuthorizationLink;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getMaxRepaymentAmount() {
        return this.maxRepaymentAmount;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getMinRepaymentAmount() {
        return this.minRepaymentAmount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus = this.planStatus;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption> list = this.paymentOptions;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
        java.lang.String str = this.countryCode;
        java.lang.String str2 = this.currencyCode;
        java.lang.String str3 = this.productTimezone;
        java.lang.String str4 = this.creditAccountId;
        boolean z = this.interestBearing;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.currentDueAmount;
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay autopay = this.autopay;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> list2 = this.fundingInstruments;
        java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> list3 = this.supportingFundingInstrumentsToAdd;
        java.lang.String str5 = this.paymentAuthorizationLink;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2 = this.maxRepaymentAmount;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money3 = this.minRepaymentAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MakeAPaymentOverview(planStatus=");
        sb.append(planStatus);
        sb.append(", paymentOptions=");
        sb.append(list);
        sb.append(", creditProductIdentifier=");
        sb.append(creditProductIdentifier);
        sb.append(", countryCode=");
        sb.append(str);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(", productTimezone=");
        sb.append(str3);
        sb.append(", creditAccountId=");
        sb.append(str4);
        sb.append(", interestBearing=");
        sb.append(z);
        sb.append(", currentDueAmount=");
        sb.append(money);
        sb.append(", autopay=");
        sb.append(autopay);
        sb.append(", fundingInstruments=");
        sb.append(list2);
        sb.append(", supportingFundingInstrumentsToAdd=");
        sb.append(list3);
        sb.append(", paymentAuthorizationLink=");
        sb.append(str5);
        sb.append(", maxRepaymentAmount=");
        sb.append(money2);
        sb.append(", minRepaymentAmount=");
        sb.append(money3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.planStatus.hashCode();
        int hashCode2 = this.paymentOptions.hashCode();
        int hashCode3 = this.creditProductIdentifier.hashCode();
        java.lang.String str = this.countryCode;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.currencyCode;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.productTimezone;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.creditAccountId;
        int hashCode7 = str4 == null ? 0 : str4.hashCode();
        int hashCode8 = java.lang.Boolean.hashCode(this.interestBearing);
        int hashCode9 = this.currentDueAmount.hashCode();
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay autopay = this.autopay;
        int hashCode10 = autopay == null ? 0 : autopay.hashCode();
        int hashCode11 = this.fundingInstruments.hashCode();
        int hashCode12 = this.supportingFundingInstrumentsToAdd.hashCode();
        java.lang.String str5 = this.paymentAuthorizationLink;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + this.maxRepaymentAmount.hashCode()) * 31) + this.minRepaymentAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview makeAPaymentOverview = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview) other;
        return this.planStatus == makeAPaymentOverview.planStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentOptions, makeAPaymentOverview.paymentOptions) && this.creditProductIdentifier == makeAPaymentOverview.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, makeAPaymentOverview.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, makeAPaymentOverview.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.productTimezone, makeAPaymentOverview.productTimezone) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, makeAPaymentOverview.creditAccountId) && this.interestBearing == makeAPaymentOverview.interestBearing && kotlin.jvm.internal.Intrinsics.areEqual(this.currentDueAmount, makeAPaymentOverview.currentDueAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.autopay, makeAPaymentOverview.autopay) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, makeAPaymentOverview.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportingFundingInstrumentsToAdd, makeAPaymentOverview.supportingFundingInstrumentsToAdd) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAuthorizationLink, makeAPaymentOverview.paymentAuthorizationLink) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxRepaymentAmount, makeAPaymentOverview.maxRepaymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.minRepaymentAmount, makeAPaymentOverview.minRepaymentAmount);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview copy(com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus, java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption> paymentOptions, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String countryCode, java.lang.String currencyCode, java.lang.String productTimezone, java.lang.String creditAccountId, boolean interestBearing, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money currentDueAmount, com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay autopay, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> supportingFundingInstrumentsToAdd, java.lang.String paymentAuthorizationLink, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money maxRepaymentAmount, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money minRepaymentAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentDueAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportingFundingInstrumentsToAdd, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxRepaymentAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minRepaymentAmount, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview(planStatus, paymentOptions, creditProductIdentifier, countryCode, currencyCode, productTimezone, creditAccountId, interestBearing, currentDueAmount, autopay, fundingInstruments, supportingFundingInstrumentsToAdd, paymentAuthorizationLink, maxRepaymentAmount, minRepaymentAmount);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getCurrentDueAmount() {
        return this.currentDueAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getInterestBearing() {
        return this.interestBearing;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getProductTimezone() {
        return this.productTimezone;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption> component2() {
        return this.paymentOptions;
    }

    /* renamed from: component15, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getMinRepaymentAmount() {
        return this.minRepaymentAmount;
    }

    /* renamed from: component14, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getMaxRepaymentAmount() {
        return this.maxRepaymentAmount;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getPaymentAuthorizationLink() {
        return this.paymentAuthorizationLink;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition> component12() {
        return this.supportingFundingInstrumentsToAdd;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> component11() {
        return this.fundingInstruments;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay getAutopay() {
        return this.autopay;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus getPlanStatus() {
        return this.planStatus;
    }
}
