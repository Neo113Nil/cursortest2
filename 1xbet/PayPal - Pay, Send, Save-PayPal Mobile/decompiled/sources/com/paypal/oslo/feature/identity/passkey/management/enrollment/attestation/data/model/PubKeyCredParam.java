package com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/data/model/PubKeyCredParam;", "", "", "type", "", "alg", "<init>", "(Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/data/model/PubKeyCredParam;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/data/model/PubKeyCredParam;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getType", com.visa.cbp.getEncExpo.warmup, "getAlg", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PubKeyCredParam {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.PubKeyCredParam.Companion INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.PubKeyCredParam.Companion(null);
    private final int alg;
    private final java.lang.String type;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/data/model/PubKeyCredParam$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/data/model/PubKeyCredParam;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.PubKeyCredParam> serializer() {
            return com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.PubKeyCredParam$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PubKeyCredParam(int i, java.lang.String str, int i2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.PubKeyCredParam$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.alg = i2;
    }

    public PubKeyCredParam(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.alg = i;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.PubKeyCredParam self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.type);
        output.encodeIntElement(serialDesc, 1, self.alg);
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final int getAlg() {
        return this.alg;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        int i = this.alg;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PubKeyCredParam(type=");
        sb.append(str);
        sb.append(", alg=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + java.lang.Integer.hashCode(this.alg);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.PubKeyCredParam)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.PubKeyCredParam pubKeyCredParam = (com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.PubKeyCredParam) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, pubKeyCredParam.type) && this.alg == pubKeyCredParam.alg;
    }

    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.PubKeyCredParam copy(java.lang.String type, int alg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.PubKeyCredParam(type, alg);
    }

    /* renamed from: component2, reason: from getter */
    public final int getAlg() {
        return this.alg;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.PubKeyCredParam copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.model.PubKeyCredParam pubKeyCredParam, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = pubKeyCredParam.type;
        }
        if ((i2 & 2) != 0) {
            i = pubKeyCredParam.alg;
        }
        return pubKeyCredParam.copy(str, i);
    }
}
