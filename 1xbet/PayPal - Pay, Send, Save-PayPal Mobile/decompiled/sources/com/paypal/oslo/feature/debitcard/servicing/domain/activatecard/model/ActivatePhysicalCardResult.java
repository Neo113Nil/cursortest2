package com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/model/ActivatePhysicalCardResult;", "", "", "instrumentId", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "lifecycleState", "", "isPrimary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;Z)Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/model/ActivatePhysicalCardResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId", "getProductName", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "getLifecycleState", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ActivatePhysicalCardResult {
    public static final int $stable = 0;
    private final java.lang.String instrumentId;
    private final boolean isPrimary;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState lifecycleState;
    private final java.lang.String productName;

    public ActivatePhysicalCardResult(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentLifecycleState, "");
        this.instrumentId = str;
        this.productName = str2;
        this.lifecycleState = debitInstrumentLifecycleState;
        this.isPrimary = z;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final java.lang.String getProductName() {
        return this.productName;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState getLifecycleState() {
        return this.lifecycleState;
    }

    public final boolean isPrimary() {
        return this.isPrimary;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.instrumentId;
        java.lang.String str2 = this.productName;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState = this.lifecycleState;
        boolean z = this.isPrimary;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivatePhysicalCardResult(instrumentId=");
        sb.append(str);
        sb.append(", productName=");
        sb.append(str2);
        sb.append(", lifecycleState=");
        sb.append(debitInstrumentLifecycleState);
        sb.append(", isPrimary=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.instrumentId.hashCode() * 31) + this.productName.hashCode()) * 31) + this.lifecycleState.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isPrimary);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardResult)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardResult activatePhysicalCardResult = (com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, activatePhysicalCardResult.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.productName, activatePhysicalCardResult.productName) && this.lifecycleState == activatePhysicalCardResult.lifecycleState && this.isPrimary == activatePhysicalCardResult.isPrimary;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardResult copy(java.lang.String instrumentId, java.lang.String productName, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState lifecycleState, boolean isPrimary) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleState, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardResult(instrumentId, productName, lifecycleState, isPrimary);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState getLifecycleState() {
        return this.lifecycleState;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getProductName() {
        return this.productName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardResult copy$default(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.model.ActivatePhysicalCardResult activatePhysicalCardResult, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activatePhysicalCardResult.instrumentId;
        }
        if ((i & 2) != 0) {
            str2 = activatePhysicalCardResult.productName;
        }
        if ((i & 4) != 0) {
            debitInstrumentLifecycleState = activatePhysicalCardResult.lifecycleState;
        }
        if ((i & 8) != 0) {
            z = activatePhysicalCardResult.isPrimary;
        }
        return activatePhysicalCardResult.copy(str, str2, debitInstrumentLifecycleState, z);
    }
}
