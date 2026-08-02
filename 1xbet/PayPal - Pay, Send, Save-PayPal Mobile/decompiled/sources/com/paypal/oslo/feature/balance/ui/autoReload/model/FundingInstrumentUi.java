package com.paypal.oslo.feature.balance.ui.autoReload.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b\t\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/FundingInstrumentUi;", "", "", "fiName", "fiDescription", "fiImageUrl", "Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;", "fiType", "", "isFiInstant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;Z)Lcom/paypal/oslo/feature/balance/ui/autoReload/model/FundingInstrumentUi;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFiName", "getFiDescription", "getFiImageUrl", "Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;", "getFiType", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FundingInstrumentUi {
    public static final int $stable = 0;
    private final java.lang.String fiDescription;
    private final java.lang.String fiImageUrl;
    private final java.lang.String fiName;
    private final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fiType;
    private final boolean isFiInstant;

    public FundingInstrumentUi(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        this.fiName = str;
        this.fiDescription = str2;
        this.fiImageUrl = str3;
        this.fiType = fundingInstrumentType;
        this.isFiInstant = z;
    }

    public /* synthetic */ FundingInstrumentUi(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.BANK : fundingInstrumentType, (i & 16) != 0 ? false : z);
    }

    public final java.lang.String getFiName() {
        return this.fiName;
    }

    public final java.lang.String getFiDescription() {
        return this.fiDescription;
    }

    public final java.lang.String getFiImageUrl() {
        return this.fiImageUrl;
    }

    public final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType getFiType() {
        return this.fiType;
    }

    public final boolean isFiInstant() {
        return this.isFiInstant;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.fiName;
        java.lang.String str2 = this.fiDescription;
        java.lang.String str3 = this.fiImageUrl;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType = this.fiType;
        boolean z = this.isFiInstant;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentUi(fiName=");
        sb.append(str);
        sb.append(", fiDescription=");
        sb.append(str2);
        sb.append(", fiImageUrl=");
        sb.append(str3);
        sb.append(", fiType=");
        sb.append(fundingInstrumentType);
        sb.append(", isFiInstant=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.fiName.hashCode() * 31) + this.fiDescription.hashCode()) * 31) + this.fiImageUrl.hashCode()) * 31) + this.fiType.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isFiInstant);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi)) {
            return false;
        }
        com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi fundingInstrumentUi = (com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fiName, fundingInstrumentUi.fiName) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiDescription, fundingInstrumentUi.fiDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiImageUrl, fundingInstrumentUi.fiImageUrl) && this.fiType == fundingInstrumentUi.fiType && this.isFiInstant == fundingInstrumentUi.isFiInstant;
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi copy(java.lang.String fiName, java.lang.String fiDescription, java.lang.String fiImageUrl, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fiType, boolean isFiInstant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiDescription, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiImageUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiType, "");
        return new com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi(fiName, fiDescription, fiImageUrl, fiType, isFiInstant);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsFiInstant() {
        return this.isFiInstant;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType getFiType() {
        return this.fiType;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFiImageUrl() {
        return this.fiImageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFiDescription() {
        return this.fiDescription;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFiName() {
        return this.fiName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi copy$default(com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi fundingInstrumentUi, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fundingInstrumentUi.fiName;
        }
        if ((i & 2) != 0) {
            str2 = fundingInstrumentUi.fiDescription;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = fundingInstrumentUi.fiImageUrl;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            fundingInstrumentType = fundingInstrumentUi.fiType;
        }
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType2 = fundingInstrumentType;
        if ((i & 16) != 0) {
            z = fundingInstrumentUi.isFiInstant;
        }
        return fundingInstrumentUi.copy(str, str4, str5, fundingInstrumentType2, z);
    }

    public FundingInstrumentUi() {
        this(null, null, null, null, false, 31, null);
    }
}
