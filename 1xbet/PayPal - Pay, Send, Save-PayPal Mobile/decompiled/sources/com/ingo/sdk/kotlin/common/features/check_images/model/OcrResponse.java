package com.ingo.sdk.kotlin.common.features.check_images.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/check_images/model/OcrResponse;", "", "", "transactionReferenceNumber", "", "ocrAmountInCents", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/ingo/sdk/kotlin/common/features/check_images/model/OcrResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/features/check_images/model/OcrResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getTransactionReferenceNumber", "Ljava/lang/Long;", "getOcrAmountInCents", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class OcrResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse.Companion INSTANCE = new com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse.Companion(null);
    private final java.lang.Long ocrAmountInCents;
    private final java.lang.String transactionReferenceNumber;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/check_images/model/OcrResponse$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/features/check_images/model/OcrResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse> serializer() {
            return com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ OcrResponse(int i, java.lang.String str, java.lang.Long l, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.transactionReferenceNumber = str;
        this.ocrAmountInCents = l;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.transactionReferenceNumber);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.LongSerializer.INSTANCE, self.ocrAmountInCents);
    }

    public OcrResponse(java.lang.String str, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.transactionReferenceNumber = str;
        this.ocrAmountInCents = l;
    }

    public final java.lang.Long getOcrAmountInCents() {
        return this.ocrAmountInCents;
    }

    public final java.lang.String getTransactionReferenceNumber() {
        return this.transactionReferenceNumber;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.transactionReferenceNumber;
        java.lang.Long l = this.ocrAmountInCents;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OcrResponse(transactionReferenceNumber=");
        sb.append(str);
        sb.append(", ocrAmountInCents=");
        sb.append(l);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.transactionReferenceNumber.hashCode();
        java.lang.Long l = this.ocrAmountInCents;
        return (hashCode * 31) + (l == null ? 0 : l.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse ocrResponse = (com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionReferenceNumber, ocrResponse.transactionReferenceNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.ocrAmountInCents, ocrResponse.ocrAmountInCents);
    }

    public final com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse copy(java.lang.String transactionReferenceNumber, java.lang.Long ocrAmountInCents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionReferenceNumber, "");
        return new com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse(transactionReferenceNumber, ocrAmountInCents);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getOcrAmountInCents() {
        return this.ocrAmountInCents;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTransactionReferenceNumber() {
        return this.transactionReferenceNumber;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse copy$default(com.ingo.sdk.kotlin.common.features.check_images.model.OcrResponse ocrResponse, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = ocrResponse.transactionReferenceNumber;
        }
        if ((i & 2) != 0) {
            l = ocrResponse.ocrAmountInCents;
        }
        return ocrResponse.copy(str, l);
    }
}
