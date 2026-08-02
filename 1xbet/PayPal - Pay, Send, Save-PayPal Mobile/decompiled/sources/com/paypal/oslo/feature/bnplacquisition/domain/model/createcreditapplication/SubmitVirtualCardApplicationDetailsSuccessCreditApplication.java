package com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccessCreditApplication;", "", "", "creditAccountId", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY, "applicationStatus", "creditProductIdentifier", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "loanAmount", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/VirtualCardContent;", "virtualCard", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/VirtualCardContent;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "component6", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/VirtualCardContent;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/VirtualCardContent;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccessCreditApplication;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "getApplicationId", "getApplicationStatus", "getCreditProductIdentifier", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "getLoanAmount", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/VirtualCardContent;", "getVirtualCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SubmitVirtualCardApplicationDetailsSuccessCreditApplication {
    public static final int $stable = 0;
    private final java.lang.String applicationId;
    private final java.lang.String applicationStatus;
    private final java.lang.String creditAccountId;
    private final java.lang.String creditProductIdentifier;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money loanAmount;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent virtualCard;

    public SubmitVirtualCardApplicationDetailsSuccessCreditApplication(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent virtualCardContent) {
        this.creditAccountId = str;
        this.applicationId = str2;
        this.applicationStatus = str3;
        this.creditProductIdentifier = str4;
        this.loanAmount = money;
        this.virtualCard = virtualCardContent;
    }

    public /* synthetic */ SubmitVirtualCardApplicationDetailsSuccessCreditApplication(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent virtualCardContent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : money, (i & 32) != 0 ? null : virtualCardContent);
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.lang.String getApplicationId() {
        return this.applicationId;
    }

    public final java.lang.String getApplicationStatus() {
        return this.applicationStatus;
    }

    public final java.lang.String getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getLoanAmount() {
        return this.loanAmount;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent getVirtualCard() {
        return this.virtualCard;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditAccountId;
        java.lang.String str2 = this.applicationId;
        java.lang.String str3 = this.applicationStatus;
        java.lang.String str4 = this.creditProductIdentifier;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = this.loanAmount;
        com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent virtualCardContent = this.virtualCard;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmitVirtualCardApplicationDetailsSuccessCreditApplication(creditAccountId=");
        sb.append(str);
        sb.append(", applicationId=");
        sb.append(str2);
        sb.append(", applicationStatus=");
        sb.append(str3);
        sb.append(", creditProductIdentifier=");
        sb.append(str4);
        sb.append(", loanAmount=");
        sb.append(money);
        sb.append(", virtualCard=");
        sb.append(virtualCardContent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.creditAccountId;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.applicationId;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.applicationStatus;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.creditProductIdentifier;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = this.loanAmount;
        int hashCode5 = money == null ? 0 : money.hashCode();
        com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent virtualCardContent = this.virtualCard;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (virtualCardContent != null ? virtualCardContent.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccessCreditApplication)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccessCreditApplication submitVirtualCardApplicationDetailsSuccessCreditApplication = (com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccessCreditApplication) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, submitVirtualCardApplicationDetailsSuccessCreditApplication.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.applicationId, submitVirtualCardApplicationDetailsSuccessCreditApplication.applicationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.applicationStatus, submitVirtualCardApplicationDetailsSuccessCreditApplication.applicationStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditProductIdentifier, submitVirtualCardApplicationDetailsSuccessCreditApplication.creditProductIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.loanAmount, submitVirtualCardApplicationDetailsSuccessCreditApplication.loanAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.virtualCard, submitVirtualCardApplicationDetailsSuccessCreditApplication.virtualCard);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccessCreditApplication copy(java.lang.String creditAccountId, java.lang.String applicationId, java.lang.String applicationStatus, java.lang.String creditProductIdentifier, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money loanAmount, com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent virtualCard) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccessCreditApplication(creditAccountId, applicationId, applicationStatus, creditProductIdentifier, loanAmount, virtualCard);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent getVirtualCard() {
        return this.virtualCard;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getLoanAmount() {
        return this.loanAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getApplicationStatus() {
        return this.applicationStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccessCreditApplication copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccessCreditApplication submitVirtualCardApplicationDetailsSuccessCreditApplication, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent virtualCardContent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = submitVirtualCardApplicationDetailsSuccessCreditApplication.creditAccountId;
        }
        if ((i & 2) != 0) {
            str2 = submitVirtualCardApplicationDetailsSuccessCreditApplication.applicationId;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = submitVirtualCardApplicationDetailsSuccessCreditApplication.applicationStatus;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = submitVirtualCardApplicationDetailsSuccessCreditApplication.creditProductIdentifier;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            money = submitVirtualCardApplicationDetailsSuccessCreditApplication.loanAmount;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2 = money;
        if ((i & 32) != 0) {
            virtualCardContent = submitVirtualCardApplicationDetailsSuccessCreditApplication.virtualCard;
        }
        return submitVirtualCardApplicationDetailsSuccessCreditApplication.copy(str, str5, str6, str7, money2, virtualCardContent);
    }

    public SubmitVirtualCardApplicationDetailsSuccessCreditApplication() {
        this(null, null, null, null, null, null, 63, null);
    }
}
