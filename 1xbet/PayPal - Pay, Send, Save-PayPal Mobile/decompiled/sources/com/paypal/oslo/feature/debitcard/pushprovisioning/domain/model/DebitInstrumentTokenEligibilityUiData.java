package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityUiData;", "", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus;", "primaryWidgetStatus", "companionWidgetStatus", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "debitInstrument", "<init>", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus;", "component2", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "copy", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitInstrumentTokenEligibilityUiData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus;", "getPrimaryWidgetStatus", "getCompanionWidgetStatus", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "getDebitInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitInstrumentTokenEligibilityUiData {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus companionWidgetStatus;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument;
    private final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus primaryWidgetStatus;

    public DebitInstrumentTokenEligibilityUiData(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus pushProvisioningWidgetStatus, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus pushProvisioningWidgetStatus2, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningWidgetStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningWidgetStatus2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        this.primaryWidgetStatus = pushProvisioningWidgetStatus;
        this.companionWidgetStatus = pushProvisioningWidgetStatus2;
        this.debitInstrument = debitInstrument;
    }

    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus getPrimaryWidgetStatus() {
        return this.primaryWidgetStatus;
    }

    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus getCompanionWidgetStatus() {
        return this.companionWidgetStatus;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getDebitInstrument() {
        return this.debitInstrument;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus pushProvisioningWidgetStatus = this.primaryWidgetStatus;
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus pushProvisioningWidgetStatus2 = this.companionWidgetStatus;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = this.debitInstrument;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentTokenEligibilityUiData(primaryWidgetStatus=");
        sb.append(pushProvisioningWidgetStatus);
        sb.append(", companionWidgetStatus=");
        sb.append(pushProvisioningWidgetStatus2);
        sb.append(", debitInstrument=");
        sb.append(debitInstrument);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.primaryWidgetStatus.hashCode() * 31) + this.companionWidgetStatus.hashCode()) * 31) + this.debitInstrument.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData debitInstrumentTokenEligibilityUiData = (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.primaryWidgetStatus, debitInstrumentTokenEligibilityUiData.primaryWidgetStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.companionWidgetStatus, debitInstrumentTokenEligibilityUiData.companionWidgetStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrument, debitInstrumentTokenEligibilityUiData.debitInstrument);
    }

    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData copy(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus primaryWidgetStatus, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus companionWidgetStatus, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryWidgetStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companionWidgetStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData(primaryWidgetStatus, companionWidgetStatus, debitInstrument);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument getDebitInstrument() {
        return this.debitInstrument;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus getCompanionWidgetStatus() {
        return this.companionWidgetStatus;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus getPrimaryWidgetStatus() {
        return this.primaryWidgetStatus;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData copy$default(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData debitInstrumentTokenEligibilityUiData, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus pushProvisioningWidgetStatus, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus pushProvisioningWidgetStatus2, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pushProvisioningWidgetStatus = debitInstrumentTokenEligibilityUiData.primaryWidgetStatus;
        }
        if ((i & 2) != 0) {
            pushProvisioningWidgetStatus2 = debitInstrumentTokenEligibilityUiData.companionWidgetStatus;
        }
        if ((i & 4) != 0) {
            debitInstrument = debitInstrumentTokenEligibilityUiData.debitInstrument;
        }
        return debitInstrumentTokenEligibilityUiData.copy(pushProvisioningWidgetStatus, pushProvisioningWidgetStatus2, debitInstrument);
    }
}
