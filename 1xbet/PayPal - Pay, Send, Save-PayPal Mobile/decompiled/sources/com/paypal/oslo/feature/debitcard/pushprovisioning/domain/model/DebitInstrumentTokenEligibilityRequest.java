package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014Jr\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u0010R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b(\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b\n\u0010\u0017R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b*\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityRequest;", "", "", "clientChannel", "experienceChannel", "instrumentId", "", "tokenProductNames", "productNames", "", "isCompanionDevicePaired", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/WalletToken;", "walletTokens", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityRequest;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getClientChannel", "getExperienceChannel", "getInstrumentId", "Ljava/util/List;", "getTokenProductNames", "getProductNames", "Ljava/lang/Boolean;", "getWalletTokens"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentTokenEligibilityRequest {
    public static final int $stable = 8;
    private final java.lang.String clientChannel;
    private final java.lang.String experienceChannel;
    private final java.lang.String instrumentId;
    private final java.lang.Boolean isCompanionDevicePaired;
    private final java.util.List<java.lang.String> productNames;
    private final java.util.List<java.lang.String> tokenProductNames;
    private final java.util.List<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken> walletTokens;

    public DebitInstrumentTokenEligibilityRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.lang.Boolean bool, java.util.List<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken> list3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.clientChannel = str;
        this.experienceChannel = str2;
        this.instrumentId = str3;
        this.tokenProductNames = list;
        this.productNames = list2;
        this.isCompanionDevicePaired = bool;
        this.walletTokens = list3;
    }

    public /* synthetic */ DebitInstrumentTokenEligibilityRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.util.List list2, java.lang.Boolean bool, java.util.List list3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, list, list2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : list3);
    }

    public final java.lang.String getClientChannel() {
        return this.clientChannel;
    }

    public final java.lang.String getExperienceChannel() {
        return this.experienceChannel;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final java.util.List<java.lang.String> getTokenProductNames() {
        return this.tokenProductNames;
    }

    public final java.util.List<java.lang.String> getProductNames() {
        return this.productNames;
    }

    public final java.lang.Boolean isCompanionDevicePaired() {
        return this.isCompanionDevicePaired;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken> getWalletTokens() {
        return this.walletTokens;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.clientChannel;
        java.lang.String str2 = this.experienceChannel;
        java.lang.String str3 = this.instrumentId;
        java.util.List<java.lang.String> list = this.tokenProductNames;
        java.util.List<java.lang.String> list2 = this.productNames;
        java.lang.Boolean bool = this.isCompanionDevicePaired;
        java.util.List<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken> list3 = this.walletTokens;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentTokenEligibilityRequest(clientChannel=");
        sb.append(str);
        sb.append(", experienceChannel=");
        sb.append(str2);
        sb.append(", instrumentId=");
        sb.append(str3);
        sb.append(", tokenProductNames=");
        sb.append(list);
        sb.append(", productNames=");
        sb.append(list2);
        sb.append(", isCompanionDevicePaired=");
        sb.append(bool);
        sb.append(", walletTokens=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.clientChannel;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.experienceChannel;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.instrumentId;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        int hashCode4 = this.tokenProductNames.hashCode();
        int hashCode5 = this.productNames.hashCode();
        java.lang.Boolean bool = this.isCompanionDevicePaired;
        int hashCode6 = bool == null ? 0 : bool.hashCode();
        java.util.List<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken> list = this.walletTokens;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityRequest)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityRequest debitInstrumentTokenEligibilityRequest = (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.clientChannel, debitInstrumentTokenEligibilityRequest.clientChannel) && kotlin.jvm.internal.Intrinsics.areEqual(this.experienceChannel, debitInstrumentTokenEligibilityRequest.experienceChannel) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, debitInstrumentTokenEligibilityRequest.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenProductNames, debitInstrumentTokenEligibilityRequest.tokenProductNames) && kotlin.jvm.internal.Intrinsics.areEqual(this.productNames, debitInstrumentTokenEligibilityRequest.productNames) && kotlin.jvm.internal.Intrinsics.areEqual(this.isCompanionDevicePaired, debitInstrumentTokenEligibilityRequest.isCompanionDevicePaired) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletTokens, debitInstrumentTokenEligibilityRequest.walletTokens);
    }

    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityRequest copy(java.lang.String clientChannel, java.lang.String experienceChannel, java.lang.String instrumentId, java.util.List<java.lang.String> tokenProductNames, java.util.List<java.lang.String> productNames, java.lang.Boolean isCompanionDevicePaired, java.util.List<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken> walletTokens) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProductNames, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productNames, "");
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityRequest(clientChannel, experienceChannel, instrumentId, tokenProductNames, productNames, isCompanionDevicePaired, walletTokens);
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken> component7() {
        return this.walletTokens;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.Boolean getIsCompanionDevicePaired() {
        return this.isCompanionDevicePaired;
    }

    public final java.util.List<java.lang.String> component5() {
        return this.productNames;
    }

    public final java.util.List<java.lang.String> component4() {
        return this.tokenProductNames;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getExperienceChannel() {
        return this.experienceChannel;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getClientChannel() {
        return this.clientChannel;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityRequest copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityRequest debitInstrumentTokenEligibilityRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.util.List list2, java.lang.Boolean bool, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = debitInstrumentTokenEligibilityRequest.clientChannel;
        }
        if ((i & 2) != 0) {
            str2 = debitInstrumentTokenEligibilityRequest.experienceChannel;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = debitInstrumentTokenEligibilityRequest.instrumentId;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            list = debitInstrumentTokenEligibilityRequest.tokenProductNames;
        }
        java.util.List list4 = list;
        if ((i & 16) != 0) {
            list2 = debitInstrumentTokenEligibilityRequest.productNames;
        }
        java.util.List list5 = list2;
        if ((i & 32) != 0) {
            bool = debitInstrumentTokenEligibilityRequest.isCompanionDevicePaired;
        }
        java.lang.Boolean bool2 = bool;
        if ((i & 64) != 0) {
            list3 = debitInstrumentTokenEligibilityRequest.walletTokens;
        }
        return debitInstrumentTokenEligibilityRequest.copy(str, str4, str5, list4, list5, bool2, list3);
    }
}
