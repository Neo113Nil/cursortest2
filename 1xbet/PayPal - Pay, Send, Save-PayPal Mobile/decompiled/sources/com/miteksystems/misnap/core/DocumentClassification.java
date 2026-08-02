package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$#%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0014"}, d2 = {"Lcom/miteksystems/misnap/core/DocumentClassification;", "", "Lcom/miteksystems/misnap/core/DocumentClassification$Type;", "documentType", "<init>", "(Lcom/miteksystems/misnap/core/DocumentClassification$Type;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/miteksystems/misnap/core/DocumentClassification$Type;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/core/DocumentClassification;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Lcom/miteksystems/misnap/core/DocumentClassification$Type;", "copy", "(Lcom/miteksystems/misnap/core/DocumentClassification$Type;)Lcom/miteksystems/misnap/core/DocumentClassification;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/miteksystems/misnap/core/DocumentClassification$Type;", "getDocumentType", "Companion", "$serializer", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {1, 8, 0})
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class DocumentClassification {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.core.DocumentClassification.Companion INSTANCE = new com.miteksystems.misnap.core.DocumentClassification.Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.miteksystems.misnap.core.DocumentClassification.Type documentType;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/miteksystems/misnap/core/DocumentClassification$Type;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "ID_FRONT", "ID_BACK", "DL_FRONT", "DL_BACK", "RP_FRONT", com.daon.dmds.utils.face.FaceFinderImpl.PASSPORT_DOCUMENT_CLASS, "PASSPORT_CARD", "GENERIC_FRONT", "GENERIC_BACK", "EDUCATION_ID", "GIFT_CARD", "HEALTH_INSURANCE", "LIBRARY_CARD"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Type {
        UNKNOWN,
        ID_FRONT,
        ID_BACK,
        DL_FRONT,
        DL_BACK,
        RP_FRONT,
        PASSPORT,
        PASSPORT_CARD,
        GENERIC_FRONT,
        GENERIC_BACK,
        EDUCATION_ID,
        GIFT_CARD,
        HEALTH_INSURANCE,
        LIBRARY_CARD
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DocumentClassification(int i, com.miteksystems.misnap.core.DocumentClassification.Type type, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.miteksystems.misnap.core.DocumentClassification$$serializer.INSTANCE.getDescriptor());
        }
        this.documentType = type;
    }

    public DocumentClassification(com.miteksystems.misnap.core.DocumentClassification.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.documentType = type;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentClassification(documentType=");
        sb.append(this.documentType);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.documentType.hashCode();
    }

    public final com.miteksystems.misnap.core.DocumentClassification.Type getDocumentType() {
        return this.documentType;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.miteksystems.misnap.core.DocumentClassification) && this.documentType == ((com.miteksystems.misnap.core.DocumentClassification) other).documentType;
    }

    public final com.miteksystems.misnap.core.DocumentClassification copy(com.miteksystems.misnap.core.DocumentClassification.Type documentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        return new com.miteksystems.misnap.core.DocumentClassification(documentType);
    }

    /* renamed from: component1, reason: from getter */
    public final com.miteksystems.misnap.core.DocumentClassification.Type getDocumentType() {
        return this.documentType;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/DocumentClassification$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/DocumentClassification;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.DocumentClassification> serializer() {
            return com.miteksystems.misnap.core.DocumentClassification$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.miteksystems.misnap.core.DocumentClassification self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        output.encodeSerializableElement(serialDesc, 0, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.core.DocumentClassification.Type", com.miteksystems.misnap.core.DocumentClassification.Type.values()), self.documentType);
    }

    public static /* synthetic */ com.miteksystems.misnap.core.DocumentClassification copy$default(com.miteksystems.misnap.core.DocumentClassification documentClassification, com.miteksystems.misnap.core.DocumentClassification.Type type, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            type = documentClassification.documentType;
        }
        return documentClassification.copy(type);
    }
}
