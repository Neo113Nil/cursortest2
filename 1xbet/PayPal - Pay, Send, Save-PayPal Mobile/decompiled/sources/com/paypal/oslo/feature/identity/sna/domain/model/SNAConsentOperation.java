package com.paypal.oslo.feature.identity.sna.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentOperation;", "", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAOperationType;", "operationType", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentType;", "consentType", "Lcom/paypal/oslo/feature/identity/sna/domain/model/MobileNumberData;", "mobileNumber", "<init>", "(Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAOperationType;Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentType;Lcom/paypal/oslo/feature/identity/sna/domain/model/MobileNumberData;)V", "component1", "()Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAOperationType;", "component2", "()Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentType;", "component3", "()Lcom/paypal/oslo/feature/identity/sna/domain/model/MobileNumberData;", "copy", "(Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAOperationType;Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentType;Lcom/paypal/oslo/feature/identity/sna/domain/model/MobileNumberData;)Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentOperation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAOperationType;", "getOperationType", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentType;", "getConsentType", "Lcom/paypal/oslo/feature/identity/sna/domain/model/MobileNumberData;", "getMobileNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SNAConsentOperation {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentType consentType;
    private final com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData mobileNumber;
    private final com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType operationType;

    public SNAConsentOperation(com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType sNAOperationType, com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentType sNAConsentType, com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData mobileNumberData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sNAOperationType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sNAConsentType, "");
        this.operationType = sNAOperationType;
        this.consentType = sNAConsentType;
        this.mobileNumber = mobileNumberData;
    }

    public /* synthetic */ SNAConsentOperation(com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType sNAOperationType, com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentType sNAConsentType, com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData mobileNumberData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(sNAOperationType, sNAConsentType, (i & 4) != 0 ? null : mobileNumberData);
    }

    public final com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType getOperationType() {
        return this.operationType;
    }

    public final com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentType getConsentType() {
        return this.consentType;
    }

    public final com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData getMobileNumber() {
        return this.mobileNumber;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType sNAOperationType = this.operationType;
        com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentType sNAConsentType = this.consentType;
        com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData mobileNumberData = this.mobileNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SNAConsentOperation(operationType=");
        sb.append(sNAOperationType);
        sb.append(", consentType=");
        sb.append(sNAConsentType);
        sb.append(", mobileNumber=");
        sb.append(mobileNumberData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.operationType.hashCode();
        int hashCode2 = this.consentType.hashCode();
        com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData mobileNumberData = this.mobileNumber;
        return (((hashCode * 31) + hashCode2) * 31) + (mobileNumberData == null ? 0 : mobileNumberData.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentOperation)) {
            return false;
        }
        com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentOperation sNAConsentOperation = (com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentOperation) other;
        return this.operationType == sNAConsentOperation.operationType && this.consentType == sNAConsentOperation.consentType && kotlin.jvm.internal.Intrinsics.areEqual(this.mobileNumber, sNAConsentOperation.mobileNumber);
    }

    public final com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentOperation copy(com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType operationType, com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentType consentType, com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData mobileNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consentType, "");
        return new com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentOperation(operationType, consentType, mobileNumber);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData getMobileNumber() {
        return this.mobileNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentType getConsentType() {
        return this.consentType;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType getOperationType() {
        return this.operationType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentOperation copy$default(com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentOperation sNAConsentOperation, com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType sNAOperationType, com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentType sNAConsentType, com.paypal.oslo.feature.identity.sna.domain.model.MobileNumberData mobileNumberData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            sNAOperationType = sNAConsentOperation.operationType;
        }
        if ((i & 2) != 0) {
            sNAConsentType = sNAConsentOperation.consentType;
        }
        if ((i & 4) != 0) {
            mobileNumberData = sNAConsentOperation.mobileNumber;
        }
        return sNAConsentOperation.copy(sNAOperationType, sNAConsentType, mobileNumberData);
    }
}
