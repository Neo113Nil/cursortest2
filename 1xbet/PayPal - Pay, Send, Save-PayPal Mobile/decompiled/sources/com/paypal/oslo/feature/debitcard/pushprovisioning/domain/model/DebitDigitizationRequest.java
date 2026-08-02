package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0084\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b0\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b1\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b2\u0010\u0014R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitDigitizationRequest;", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardTokenProductName;", "tokenProductName", "", "fundingCardId", "clientChannel", "experienceChannel", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitDigitizationWallet;", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, "nonceSignature", "nonce", "tokenRequestorId", "", "additionalAttributes", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardTokenProductName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitDigitizationWallet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardTokenProductName;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitDigitizationWallet;", "component6", "component7", "component8", "component9", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardTokenProductName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitDigitizationWallet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitDigitizationRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardTokenProductName;", "getTokenProductName", "Ljava/lang/String;", "getFundingCardId", "getClientChannel", "getExperienceChannel", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitDigitizationWallet;", "getWallet", "getNonceSignature", "getNonce", "getTokenRequestorId", "Ljava/util/Map;", "getAdditionalAttributes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitDigitizationRequest {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, java.lang.String> additionalAttributes;
    private final java.lang.String clientChannel;
    private final java.lang.String experienceChannel;
    private final java.lang.String fundingCardId;
    private final java.lang.String nonce;
    private final java.lang.String nonceSignature;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName tokenProductName;
    private final java.lang.String tokenRequestorId;
    private final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet wallet;

    public DebitDigitizationRequest(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName debitCardTokenProductName, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet debitDigitizationWallet, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardTokenProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.tokenProductName = debitCardTokenProductName;
        this.fundingCardId = str;
        this.clientChannel = str2;
        this.experienceChannel = str3;
        this.wallet = debitDigitizationWallet;
        this.nonceSignature = str4;
        this.nonce = str5;
        this.tokenRequestorId = str6;
        this.additionalAttributes = map;
    }

    public /* synthetic */ DebitDigitizationRequest(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName debitCardTokenProductName, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet debitDigitizationWallet, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(debitCardTokenProductName, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : debitDigitizationWallet, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : map);
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName getTokenProductName() {
        return this.tokenProductName;
    }

    public final java.lang.String getFundingCardId() {
        return this.fundingCardId;
    }

    public final java.lang.String getClientChannel() {
        return this.clientChannel;
    }

    public final java.lang.String getExperienceChannel() {
        return this.experienceChannel;
    }

    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet getWallet() {
        return this.wallet;
    }

    public final java.lang.String getNonceSignature() {
        return this.nonceSignature;
    }

    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final java.lang.String getTokenRequestorId() {
        return this.tokenRequestorId;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName debitCardTokenProductName = this.tokenProductName;
        java.lang.String str = this.fundingCardId;
        java.lang.String str2 = this.clientChannel;
        java.lang.String str3 = this.experienceChannel;
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet debitDigitizationWallet = this.wallet;
        java.lang.String str4 = this.nonceSignature;
        java.lang.String str5 = this.nonce;
        java.lang.String str6 = this.tokenRequestorId;
        java.util.Map<java.lang.String, java.lang.String> map = this.additionalAttributes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitDigitizationRequest(tokenProductName=");
        sb.append(debitCardTokenProductName);
        sb.append(", fundingCardId=");
        sb.append(str);
        sb.append(", clientChannel=");
        sb.append(str2);
        sb.append(", experienceChannel=");
        sb.append(str3);
        sb.append(", wallet=");
        sb.append(debitDigitizationWallet);
        sb.append(", nonceSignature=");
        sb.append(str4);
        sb.append(", nonce=");
        sb.append(str5);
        sb.append(", tokenRequestorId=");
        sb.append(str6);
        sb.append(", additionalAttributes=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.tokenProductName.hashCode();
        int hashCode2 = this.fundingCardId.hashCode();
        java.lang.String str = this.clientChannel;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.experienceChannel;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet debitDigitizationWallet = this.wallet;
        int hashCode5 = debitDigitizationWallet == null ? 0 : debitDigitizationWallet.hashCode();
        java.lang.String str3 = this.nonceSignature;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.nonce;
        int hashCode7 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.tokenRequestorId;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        java.util.Map<java.lang.String, java.lang.String> map = this.additionalAttributes;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (map != null ? map.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationRequest)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationRequest debitDigitizationRequest = (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationRequest) other;
        return this.tokenProductName == debitDigitizationRequest.tokenProductName && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingCardId, debitDigitizationRequest.fundingCardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientChannel, debitDigitizationRequest.clientChannel) && kotlin.jvm.internal.Intrinsics.areEqual(this.experienceChannel, debitDigitizationRequest.experienceChannel) && kotlin.jvm.internal.Intrinsics.areEqual(this.wallet, debitDigitizationRequest.wallet) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonceSignature, debitDigitizationRequest.nonceSignature) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, debitDigitizationRequest.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenRequestorId, debitDigitizationRequest.tokenRequestorId) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalAttributes, debitDigitizationRequest.additionalAttributes);
    }

    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationRequest copy(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName tokenProductName, java.lang.String fundingCardId, java.lang.String clientChannel, java.lang.String experienceChannel, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet wallet, java.lang.String nonceSignature, java.lang.String nonce, java.lang.String tokenRequestorId, java.util.Map<java.lang.String, java.lang.String> additionalAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingCardId, "");
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationRequest(tokenProductName, fundingCardId, clientChannel, experienceChannel, wallet, nonceSignature, nonce, tokenRequestorId, additionalAttributes);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component9() {
        return this.additionalAttributes;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getTokenRequestorId() {
        return this.tokenRequestorId;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getNonce() {
        return this.nonce;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getNonceSignature() {
        return this.nonceSignature;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationWallet getWallet() {
        return this.wallet;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getExperienceChannel() {
        return this.experienceChannel;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getClientChannel() {
        return this.clientChannel;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFundingCardId() {
        return this.fundingCardId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName getTokenProductName() {
        return this.tokenProductName;
    }
}
