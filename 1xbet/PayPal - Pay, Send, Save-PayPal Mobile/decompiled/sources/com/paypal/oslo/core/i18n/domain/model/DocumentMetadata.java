package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002$#B'\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012 \u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u00020\u00002 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R/\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DocumentMetadata;", "", "", "", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentValidation;", "documentType", "<init>", "(Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/paypal/oslo/core/i18n/domain/model/DocumentMetadata;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$i18n_release", "(Lcom/paypal/oslo/core/i18n/domain/model/DocumentMetadata;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/Map;", "getDocumentType", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DocumentMetadata {
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.DocumentValidation>> documentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.i18n.domain.model.DocumentMetadata.Companion INSTANCE = new com.paypal.oslo.core.i18n.domain.model.DocumentMetadata.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.domain.model.DocumentMetadata$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.i18n.domain.model.DocumentMetadata.m11411$r8$lambda$wViG5IvWiq4z2AMqZGF09LXmM();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DocumentMetadata$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentMetadata;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.i18n.domain.model.DocumentMetadata> serializer() {
            return com.paypal.oslo.core.i18n.domain.model.DocumentMetadata$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DocumentMetadata(int i, java.util.Map map, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.core.i18n.domain.model.DocumentMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.documentType = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentMetadata(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.DocumentValidation>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.documentType = map;
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.DocumentValidation>> getDocumentType() {
        return this.documentType;
    }

    /* renamed from: $r8$lambda$wViG5IvWi-q4z2AM-qZGF09LXmM, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m11411$r8$lambda$wViG5IvWiq4z2AMqZGF09LXmM() {
        return new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, new kotlinx.serialization.internal.LinkedHashMapSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE, com.paypal.oslo.core.i18n.domain.model.DocumentValidation$$serializer.INSTANCE));
    }

    public final java.lang.String toString() {
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.DocumentValidation>> map = this.documentType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentMetadata(documentType=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.documentType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.i18n.domain.model.DocumentMetadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentType, ((com.paypal.oslo.core.i18n.domain.model.DocumentMetadata) other).documentType);
    }

    public final com.paypal.oslo.core.i18n.domain.model.DocumentMetadata copy(java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.DocumentValidation>> documentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        return new com.paypal.oslo.core.i18n.domain.model.DocumentMetadata(documentType);
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.paypal.oslo.core.i18n.domain.model.DocumentValidation>> component1() {
        return this.documentType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DocumentMetadata copy$default(com.paypal.oslo.core.i18n.domain.model.DocumentMetadata documentMetadata, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = documentMetadata.documentType;
        }
        return documentMetadata.copy(map);
    }
}
