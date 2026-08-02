package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/InstrumentAdditionConfig;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/InstrumentAdditionConfigStatus;", "status", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/InstrumentAdditionConfigStatus;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/InstrumentAdditionConfigStatus;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/InstrumentAdditionConfigStatus;)Lcom/paypal/oslo/feature/p2p/domain/model/InstrumentAdditionConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/InstrumentAdditionConfigStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InstrumentAdditionConfig {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus status;

    public InstrumentAdditionConfig(com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus instrumentAdditionConfigStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentAdditionConfigStatus, "");
        this.status = instrumentAdditionConfigStatus;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus getStatus() {
        return this.status;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus instrumentAdditionConfigStatus = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstrumentAdditionConfig(status=");
        sb.append(instrumentAdditionConfigStatus);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.status.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig) && this.status == ((com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig) other).status;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig copy(com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig(status);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig copy$default(com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig instrumentAdditionConfig, com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus instrumentAdditionConfigStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            instrumentAdditionConfigStatus = instrumentAdditionConfig.status;
        }
        return instrumentAdditionConfig.copy(instrumentAdditionConfigStatus);
    }
}
