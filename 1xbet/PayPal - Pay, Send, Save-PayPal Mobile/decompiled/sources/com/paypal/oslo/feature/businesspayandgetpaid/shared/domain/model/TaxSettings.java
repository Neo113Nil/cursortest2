package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\u0003\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\u0004\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;", "", "", "isTaxInclusive", "isTaxCalculatedAfterDiscount", "<init>", "(ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_pay_and_get_paid_prodRelease", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class TaxSettings {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings.Companion INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings.Companion(null);
    private final boolean isTaxCalculatedAfterDiscount;
    private final boolean isTaxInclusive;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TaxSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings> serializer() {
            return com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TaxSettings(int i, boolean z, boolean z2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        this.isTaxInclusive = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.isTaxCalculatedAfterDiscount = true;
        } else {
            this.isTaxCalculatedAfterDiscount = z2;
        }
    }

    public TaxSettings(boolean z, boolean z2) {
        this.isTaxInclusive = z;
        this.isTaxCalculatedAfterDiscount = z2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$business_pay_and_get_paid_prodRelease(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isTaxInclusive) {
            output.encodeBooleanElement(serialDesc, 0, self.isTaxInclusive);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !self.isTaxCalculatedAfterDiscount) {
            output.encodeBooleanElement(serialDesc, 1, self.isTaxCalculatedAfterDiscount);
        }
    }

    public /* synthetic */ TaxSettings(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2);
    }

    public final boolean isTaxInclusive() {
        return this.isTaxInclusive;
    }

    public final boolean isTaxCalculatedAfterDiscount() {
        return this.isTaxCalculatedAfterDiscount;
    }

    public final java.lang.String toString() {
        boolean z = this.isTaxInclusive;
        boolean z2 = this.isTaxCalculatedAfterDiscount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxSettings(isTaxInclusive=");
        sb.append(z);
        sb.append(", isTaxCalculatedAfterDiscount=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.isTaxInclusive) * 31) + java.lang.Boolean.hashCode(this.isTaxCalculatedAfterDiscount);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings) other;
        return this.isTaxInclusive == taxSettings.isTaxInclusive && this.isTaxCalculatedAfterDiscount == taxSettings.isTaxCalculatedAfterDiscount;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings copy(boolean isTaxInclusive, boolean isTaxCalculatedAfterDiscount) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings(isTaxInclusive, isTaxCalculatedAfterDiscount);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsTaxCalculatedAfterDiscount() {
        return this.isTaxCalculatedAfterDiscount;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsTaxInclusive() {
        return this.isTaxInclusive;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings copy$default(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = taxSettings.isTaxInclusive;
        }
        if ((i & 2) != 0) {
            z2 = taxSettings.isTaxCalculatedAfterDiscount;
        }
        return taxSettings.copy(z, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TaxSettings() {
        this(r2, r2, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        boolean z = false;
    }
}
