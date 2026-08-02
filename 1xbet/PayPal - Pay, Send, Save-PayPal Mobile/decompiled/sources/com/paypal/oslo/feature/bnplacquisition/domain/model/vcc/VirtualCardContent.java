package com.paypal.oslo.feature.bnplacquisition.domain.model.vcc;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JJ\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/VirtualCardContent;", "", "", "lastNCharsText", "imageUrl", "createTime", "expirationDuration", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "loanAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/VirtualCardContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLastNCharsText", "getImageUrl", "getCreateTime", "getExpirationDuration", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "getLoanAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class VirtualCardContent {
    public static final int $stable = 0;
    private final java.lang.String createTime;
    private final java.lang.String expirationDuration;
    private final java.lang.String imageUrl;
    private final java.lang.String lastNCharsText;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money loanAmount;

    public VirtualCardContent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        this.lastNCharsText = str;
        this.imageUrl = str2;
        this.createTime = str3;
        this.expirationDuration = str4;
        this.loanAmount = money;
    }

    public final java.lang.String getLastNCharsText() {
        return this.lastNCharsText;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public final java.lang.String getCreateTime() {
        return this.createTime;
    }

    public final java.lang.String getExpirationDuration() {
        return this.expirationDuration;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getLoanAmount() {
        return this.loanAmount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.lastNCharsText;
        java.lang.String str2 = this.imageUrl;
        java.lang.String str3 = this.createTime;
        java.lang.String str4 = this.expirationDuration;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = this.loanAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VirtualCardContent(lastNCharsText=");
        sb.append(str);
        sb.append(", imageUrl=");
        sb.append(str2);
        sb.append(", createTime=");
        sb.append(str3);
        sb.append(", expirationDuration=");
        sb.append(str4);
        sb.append(", loanAmount=");
        sb.append(money);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.lastNCharsText;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.imageUrl;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.createTime;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.expirationDuration;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.loanAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent virtualCardContent = (com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.lastNCharsText, virtualCardContent.lastNCharsText) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, virtualCardContent.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.createTime, virtualCardContent.createTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDuration, virtualCardContent.expirationDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.loanAmount, virtualCardContent.loanAmount);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent copy(java.lang.String lastNCharsText, java.lang.String imageUrl, java.lang.String createTime, java.lang.String expirationDuration, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money loanAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loanAmount, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent(lastNCharsText, imageUrl, createTime, expirationDuration, loanAmount);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getLoanAmount() {
        return this.loanAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getExpirationDuration() {
        return this.expirationDuration;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLastNCharsText() {
        return this.lastNCharsText;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.VirtualCardContent virtualCardContent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = virtualCardContent.lastNCharsText;
        }
        if ((i & 2) != 0) {
            str2 = virtualCardContent.imageUrl;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = virtualCardContent.createTime;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = virtualCardContent.expirationDuration;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            money = virtualCardContent.loanAmount;
        }
        return virtualCardContent.copy(str, str5, str6, str7, money);
    }
}
