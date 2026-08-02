package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u000eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DocumentValidation;", "", "", "advancedValidation", "Lcom/paypal/oslo/core/i18n/domain/model/ValidationRegex;", "validationRegex", "<init>", "(Ljava/lang/Boolean;Lcom/paypal/oslo/core/i18n/domain/model/ValidationRegex;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/paypal/oslo/core/i18n/domain/model/ValidationRegex;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/paypal/oslo/core/i18n/domain/model/ValidationRegex;", "copy", "(Ljava/lang/Boolean;Lcom/paypal/oslo/core/i18n/domain/model/ValidationRegex;)Lcom/paypal/oslo/core/i18n/domain/model/DocumentValidation;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$i18n_release", "(Lcom/paypal/oslo/core/i18n/domain/model/DocumentValidation;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Boolean;", "getAdvancedValidation", "getAdvancedValidation$annotations", "()V", "Lcom/paypal/oslo/core/i18n/domain/model/ValidationRegex;", "getValidationRegex", "getValidationRegex$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DocumentValidation {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.i18n.domain.model.DocumentValidation.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.DocumentValidation.Companion(null);
    private final java.lang.Boolean advancedValidation;
    private final com.paypal.oslo.core.i18n.domain.model.ValidationRegex validationRegex;

    @kotlinx.serialization.SerialName("advancedValidation")
    public static /* synthetic */ void getAdvancedValidation$annotations() {
    }

    @kotlinx.serialization.SerialName("validationRegex")
    public static /* synthetic */ void getValidationRegex$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DocumentValidation$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.DocumentValidation> serializer() {
            return com.paypal.oslo.core.i18n.domain.model.DocumentValidation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DocumentValidation(int i, java.lang.Boolean bool, com.paypal.oslo.core.i18n.domain.model.ValidationRegex validationRegex, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.advancedValidation = null;
        } else {
            this.advancedValidation = bool;
        }
        if ((i & 2) == 0) {
            this.validationRegex = null;
        } else {
            this.validationRegex = validationRegex;
        }
    }

    public DocumentValidation(java.lang.Boolean bool, com.paypal.oslo.core.i18n.domain.model.ValidationRegex validationRegex) {
        this.advancedValidation = bool;
        this.validationRegex = validationRegex;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$i18n_release(com.paypal.oslo.core.i18n.domain.model.DocumentValidation self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.advancedValidation != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.advancedValidation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.validationRegex != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.core.i18n.domain.model.ValidationRegex$$serializer.INSTANCE, self.validationRegex);
        }
    }

    public /* synthetic */ DocumentValidation(java.lang.Boolean bool, com.paypal.oslo.core.i18n.domain.model.ValidationRegex validationRegex, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : validationRegex);
    }

    public final java.lang.Boolean getAdvancedValidation() {
        return this.advancedValidation;
    }

    public final com.paypal.oslo.core.i18n.domain.model.ValidationRegex getValidationRegex() {
        return this.validationRegex;
    }

    public final java.lang.String toString() {
        java.lang.Boolean bool = this.advancedValidation;
        com.paypal.oslo.core.i18n.domain.model.ValidationRegex validationRegex = this.validationRegex;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentValidation(advancedValidation=");
        sb.append(bool);
        sb.append(", validationRegex=");
        sb.append(validationRegex);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.advancedValidation;
        int hashCode = bool == null ? 0 : bool.hashCode();
        com.paypal.oslo.core.i18n.domain.model.ValidationRegex validationRegex = this.validationRegex;
        return (hashCode * 31) + (validationRegex != null ? validationRegex.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.DocumentValidation)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.DocumentValidation documentValidation = (com.paypal.oslo.core.i18n.domain.model.DocumentValidation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.advancedValidation, documentValidation.advancedValidation) && kotlin.jvm.internal.Intrinsics.areEqual(this.validationRegex, documentValidation.validationRegex);
    }

    public final com.paypal.oslo.core.i18n.domain.model.DocumentValidation copy(java.lang.Boolean advancedValidation, com.paypal.oslo.core.i18n.domain.model.ValidationRegex validationRegex) {
        return new com.paypal.oslo.core.i18n.domain.model.DocumentValidation(advancedValidation, validationRegex);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.ValidationRegex getValidationRegex() {
        return this.validationRegex;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getAdvancedValidation() {
        return this.advancedValidation;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DocumentValidation copy$default(com.paypal.oslo.core.i18n.domain.model.DocumentValidation documentValidation, java.lang.Boolean bool, com.paypal.oslo.core.i18n.domain.model.ValidationRegex validationRegex, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = documentValidation.advancedValidation;
        }
        if ((i & 2) != 0) {
            validationRegex = documentValidation.validationRegex;
        }
        return documentValidation.copy(bool, validationRegex);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentValidation() {
        this((java.lang.Boolean) null, (com.paypal.oslo.core.i18n.domain.model.ValidationRegex) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
