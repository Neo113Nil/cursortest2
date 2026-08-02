package com.paypal.oslo.feature.businessinventory.api.domain.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "", "", "id", "label", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "copy", "(Ljava/lang/String;Ljava/lang/String;D)Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_inventory_api_prodRelease", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "getLabel", "D", "getValue", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class TaxOption {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption.Companion INSTANCE = new com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption.Companion(null);
    private final java.lang.String id;
    private final java.lang.String label;
    private final double value;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption> serializer() {
            return com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TaxOption(int i, java.lang.String str, java.lang.String str2, double d, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.label = str2;
        this.value = d;
    }

    public TaxOption(java.lang.String str, java.lang.String str2, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.label = str2;
        this.value = d;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$business_inventory_api_prodRelease(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.label);
        output.encodeDoubleElement(serialDesc, 2, self.value);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final double getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.label;
        double d = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TaxOption(id=");
        sb.append(str);
        sb.append(", label=");
        sb.append(str2);
        sb.append(", value=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.label.hashCode()) * 31) + java.lang.Double.hashCode(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption)) {
            return false;
        }
        com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, taxOption.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, taxOption.label) && java.lang.Double.compare(this.value, taxOption.value) == 0;
    }

    public final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption copy(java.lang.String id, java.lang.String label, double value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        return new com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption(id, label, value);
    }

    /* renamed from: component3, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption copy$default(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption, java.lang.String str, java.lang.String str2, double d, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = taxOption.id;
        }
        if ((i & 2) != 0) {
            str2 = taxOption.label;
        }
        if ((i & 4) != 0) {
            d = taxOption.value;
        }
        return taxOption.copy(str, str2, d);
    }
}
