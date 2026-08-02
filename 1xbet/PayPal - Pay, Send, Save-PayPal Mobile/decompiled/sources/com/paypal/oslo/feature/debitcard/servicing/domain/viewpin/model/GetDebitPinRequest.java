package com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/GetDebitPinRequest;", "", "", "instrumentId", "cardVerificationCode", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitPinClientChannel;", "clientChannel", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitPinExperienceChannel;", "experienceChannel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitPinClientChannel;Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitPinExperienceChannel;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitPinClientChannel;", "component4", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitPinExperienceChannel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitPinClientChannel;Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitPinExperienceChannel;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/GetDebitPinRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId", "getCardVerificationCode", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitPinClientChannel;", "getClientChannel", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/DebitPinExperienceChannel;", "getExperienceChannel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GetDebitPinRequest {
    public static final int $stable = 0;
    private final java.lang.String cardVerificationCode;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel clientChannel;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel experienceChannel;
    private final java.lang.String instrumentId;

    public GetDebitPinRequest(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel debitPinClientChannel, com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel debitPinExperienceChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.instrumentId = str;
        this.cardVerificationCode = str2;
        this.clientChannel = debitPinClientChannel;
        this.experienceChannel = debitPinExperienceChannel;
    }

    public /* synthetic */ GetDebitPinRequest(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel debitPinClientChannel, com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel debitPinExperienceChannel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : debitPinClientChannel, (i & 8) != 0 ? null : debitPinExperienceChannel);
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final java.lang.String getCardVerificationCode() {
        return this.cardVerificationCode;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel getClientChannel() {
        return this.clientChannel;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel getExperienceChannel() {
        return this.experienceChannel;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.instrumentId;
        java.lang.String str2 = this.cardVerificationCode;
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel debitPinClientChannel = this.clientChannel;
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel debitPinExperienceChannel = this.experienceChannel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetDebitPinRequest(instrumentId=");
        sb.append(str);
        sb.append(", cardVerificationCode=");
        sb.append(str2);
        sb.append(", clientChannel=");
        sb.append(debitPinClientChannel);
        sb.append(", experienceChannel=");
        sb.append(debitPinExperienceChannel);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.instrumentId.hashCode();
        int hashCode2 = this.cardVerificationCode.hashCode();
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel debitPinClientChannel = this.clientChannel;
        int hashCode3 = debitPinClientChannel == null ? 0 : debitPinClientChannel.hashCode();
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel debitPinExperienceChannel = this.experienceChannel;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (debitPinExperienceChannel != null ? debitPinExperienceChannel.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.GetDebitPinRequest)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.GetDebitPinRequest getDebitPinRequest = (com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.GetDebitPinRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, getDebitPinRequest.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardVerificationCode, getDebitPinRequest.cardVerificationCode) && this.clientChannel == getDebitPinRequest.clientChannel && this.experienceChannel == getDebitPinRequest.experienceChannel;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.GetDebitPinRequest copy(java.lang.String instrumentId, java.lang.String cardVerificationCode, com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel clientChannel, com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel experienceChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardVerificationCode, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.GetDebitPinRequest(instrumentId, cardVerificationCode, clientChannel, experienceChannel);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel getExperienceChannel() {
        return this.experienceChannel;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel getClientChannel() {
        return this.clientChannel;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCardVerificationCode() {
        return this.cardVerificationCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.GetDebitPinRequest copy$default(com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.GetDebitPinRequest getDebitPinRequest, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinClientChannel debitPinClientChannel, com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.DebitPinExperienceChannel debitPinExperienceChannel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = getDebitPinRequest.instrumentId;
        }
        if ((i & 2) != 0) {
            str2 = getDebitPinRequest.cardVerificationCode;
        }
        if ((i & 4) != 0) {
            debitPinClientChannel = getDebitPinRequest.clientChannel;
        }
        if ((i & 8) != 0) {
            debitPinExperienceChannel = getDebitPinRequest.experienceChannel;
        }
        return getDebitPinRequest.copy(str, str2, debitPinClientChannel, debitPinExperienceChannel);
    }
}
