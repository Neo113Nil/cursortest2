package com.paypal.oslo.feature.qrc.domain.model.session;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b\u0003\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTipDetails;", "", "", "isTipEligible", "Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfig;", "tipConfiguration", "<init>", "(ZLcom/paypal/oslo/feature/qrc/domain/model/session/TipConfig;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLcom/paypal/oslo/feature/qrc/domain/model/session/TipConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfig;", "copy", "(ZLcom/paypal/oslo/feature/qrc/domain/model/session/TipConfig;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTipDetails;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$qrc_prodRelease", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTipDetails;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "Lcom/paypal/oslo/feature/qrc/domain/model/session/TipConfig;", "getTipConfiguration", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class QrcTipDetails {
    private final boolean isTipEligible;
    private final com.paypal.oslo.feature.qrc.domain.model.session.TipConfig tipConfiguration;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails.Companion INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTipDetails$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcTipDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails> serializer() {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ QrcTipDetails(int i, boolean z, com.paypal.oslo.feature.qrc.domain.model.session.TipConfig tipConfig, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.isTipEligible = z;
        this.tipConfiguration = tipConfig;
    }

    public QrcTipDetails(boolean z, com.paypal.oslo.feature.qrc.domain.model.session.TipConfig tipConfig) {
        this.isTipEligible = z;
        this.tipConfiguration = tipConfig;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$qrc_prodRelease(com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.isTipEligible);
        output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.qrc.domain.model.session.TipConfig$$serializer.INSTANCE, self.tipConfiguration);
    }

    public final boolean isTipEligible() {
        return this.isTipEligible;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.TipConfig getTipConfiguration() {
        return this.tipConfiguration;
    }

    public final java.lang.String toString() {
        boolean z = this.isTipEligible;
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfig tipConfig = this.tipConfiguration;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QrcTipDetails(isTipEligible=");
        sb.append(z);
        sb.append(", tipConfiguration=");
        sb.append(tipConfig);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isTipEligible);
        com.paypal.oslo.feature.qrc.domain.model.session.TipConfig tipConfig = this.tipConfiguration;
        return (hashCode * 31) + (tipConfig == null ? 0 : tipConfig.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails qrcTipDetails = (com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails) other;
        return this.isTipEligible == qrcTipDetails.isTipEligible && kotlin.jvm.internal.Intrinsics.areEqual(this.tipConfiguration, qrcTipDetails.tipConfiguration);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails copy(boolean isTipEligible, com.paypal.oslo.feature.qrc.domain.model.session.TipConfig tipConfiguration) {
        return new com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails(isTipEligible, tipConfiguration);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.session.TipConfig getTipConfiguration() {
        return this.tipConfiguration;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsTipEligible() {
        return this.isTipEligible;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails copy$default(com.paypal.oslo.feature.qrc.domain.model.session.QrcTipDetails qrcTipDetails, boolean z, com.paypal.oslo.feature.qrc.domain.model.session.TipConfig tipConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = qrcTipDetails.isTipEligible;
        }
        if ((i & 2) != 0) {
            tipConfig = qrcTipDetails.tipConfiguration;
        }
        return qrcTipDetails.copy(z, tipConfig);
    }
}
