package com.paypal.oslo.feature.subscriptions.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J`\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b(\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b)\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "", "", "id", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentType;", "type", "name", "lastDigits", "primaryImageUrl", "thumbnailImageUrl", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/Balance;", "balance", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/Balance;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentType;", "component3", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/Balance;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/Balance;)Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentType;", "getType", "getName", "getLastDigits", "getPrimaryImageUrl", "getThumbnailImageUrl", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/Balance;", "getBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FundingInstrument {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance balance;
    private final java.lang.String id;
    private final java.lang.String lastDigits;
    private final java.lang.String name;
    private final java.lang.String primaryImageUrl;
    private final java.lang.String thumbnailImageUrl;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType type;

    public FundingInstrument(java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance balance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        this.id = str;
        this.type = fundingInstrumentType;
        this.name = str2;
        this.lastDigits = str3;
        this.primaryImageUrl = str4;
        this.thumbnailImageUrl = str5;
        this.balance = balance;
    }

    public /* synthetic */ FundingInstrument(java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance balance, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fundingInstrumentType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : balance);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType getType() {
        return this.type;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getLastDigits() {
        return this.lastDigits;
    }

    public final java.lang.String getPrimaryImageUrl() {
        return this.primaryImageUrl;
    }

    public final java.lang.String getThumbnailImageUrl() {
        return this.thumbnailImageUrl;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance getBalance() {
        return this.balance;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType fundingInstrumentType = this.type;
        java.lang.String str2 = this.name;
        java.lang.String str3 = this.lastDigits;
        java.lang.String str4 = this.primaryImageUrl;
        java.lang.String str5 = this.thumbnailImageUrl;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance balance = this.balance;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrument(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(fundingInstrumentType);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", lastDigits=");
        sb.append(str3);
        sb.append(", primaryImageUrl=");
        sb.append(str4);
        sb.append(", thumbnailImageUrl=");
        sb.append(str5);
        sb.append(", balance=");
        sb.append(balance);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.type.hashCode();
        java.lang.String str = this.name;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.lastDigits;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.primaryImageUrl;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.thumbnailImageUrl;
        int hashCode6 = str4 == null ? 0 : str4.hashCode();
        com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance balance = this.balance;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (balance != null ? balance.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = (com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fundingInstrument.id) && this.type == fundingInstrument.type && kotlin.jvm.internal.Intrinsics.areEqual(this.name, fundingInstrument.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, fundingInstrument.lastDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryImageUrl, fundingInstrument.primaryImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailImageUrl, fundingInstrument.thumbnailImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.balance, fundingInstrument.balance);
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument copy(java.lang.String id, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType type, java.lang.String name2, java.lang.String lastDigits, java.lang.String primaryImageUrl, java.lang.String thumbnailImageUrl, com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance balance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument(id, type, name2, lastDigits, primaryImageUrl, thumbnailImageUrl, balance);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance getBalance() {
        return this.balance;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getThumbnailImageUrl() {
        return this.thumbnailImageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getPrimaryImageUrl() {
        return this.primaryImageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLastDigits() {
        return this.lastDigits;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument copy$default(com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance balance, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fundingInstrument.id;
        }
        if ((i & 2) != 0) {
            fundingInstrumentType = fundingInstrument.type;
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentType fundingInstrumentType2 = fundingInstrumentType;
        if ((i & 4) != 0) {
            str2 = fundingInstrument.name;
        }
        java.lang.String str6 = str2;
        if ((i & 8) != 0) {
            str3 = fundingInstrument.lastDigits;
        }
        java.lang.String str7 = str3;
        if ((i & 16) != 0) {
            str4 = fundingInstrument.primaryImageUrl;
        }
        java.lang.String str8 = str4;
        if ((i & 32) != 0) {
            str5 = fundingInstrument.thumbnailImageUrl;
        }
        java.lang.String str9 = str5;
        if ((i & 64) != 0) {
            balance = fundingInstrument.balance;
        }
        return fundingInstrument.copy(str, fundingInstrumentType2, str6, str7, str8, str9, balance);
    }
}
