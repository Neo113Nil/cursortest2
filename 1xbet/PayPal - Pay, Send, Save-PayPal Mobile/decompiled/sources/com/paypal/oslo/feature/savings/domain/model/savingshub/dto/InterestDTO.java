package com.paypal.oslo.feature.savings.domain.model.savingshub.dto;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/InterestDTO;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/SavingsHubTileDTO;", "", "pendingFormatted", "lifetimeFormatted", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/InterestDTO;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPendingFormatted", "getLifetimeFormatted"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InterestDTO implements com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO {
    public static final int $stable = 0;
    private final java.lang.String lifetimeFormatted;
    private final java.lang.String pendingFormatted;

    public InterestDTO(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.pendingFormatted = str;
        this.lifetimeFormatted = str2;
    }

    public final java.lang.String getPendingFormatted() {
        return this.pendingFormatted;
    }

    public final java.lang.String getLifetimeFormatted() {
        return this.lifetimeFormatted;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.pendingFormatted;
        java.lang.String str2 = this.lifetimeFormatted;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InterestDTO(pendingFormatted=");
        sb.append(str);
        sb.append(", lifetimeFormatted=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.pendingFormatted.hashCode() * 31) + this.lifetimeFormatted.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InterestDTO)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InterestDTO interestDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InterestDTO) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.pendingFormatted, interestDTO.pendingFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.lifetimeFormatted, interestDTO.lifetimeFormatted);
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InterestDTO copy(java.lang.String pendingFormatted, java.lang.String lifetimeFormatted) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingFormatted, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifetimeFormatted, "");
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InterestDTO(pendingFormatted, lifetimeFormatted);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLifetimeFormatted() {
        return this.lifetimeFormatted;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPendingFormatted() {
        return this.pendingFormatted;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InterestDTO copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.InterestDTO interestDTO, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = interestDTO.pendingFormatted;
        }
        if ((i & 2) != 0) {
            str2 = interestDTO.lifetimeFormatted;
        }
        return interestDTO.copy(str, str2);
    }
}
