package com.paypal.oslo.feature.mosaic.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/navigation/result/MosaicLegacyNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "", "status", "processStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/mosaic/api/navigation/result/MosaicLegacyNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$mosaic_api_prodRelease", "(Lcom/paypal/oslo/feature/mosaic/api/navigation/result/MosaicLegacyNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getStatus", "getProcessStatus", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class MosaicLegacyNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult.Companion INSTANCE = new com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult.Companion(null);
    private final java.lang.String processStatus;
    private final java.lang.String status;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/api/navigation/result/MosaicLegacyNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/mosaic/api/navigation/result/MosaicLegacyNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult> serializer() {
            return com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MosaicLegacyNavResult(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.status = str;
        if ((i & 2) == 0) {
            this.processStatus = null;
        } else {
            this.processStatus = str2;
        }
    }

    public MosaicLegacyNavResult(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
        this.processStatus = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$mosaic_api_prodRelease(com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.status);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.processStatus != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.processStatus);
        }
    }

    public /* synthetic */ MosaicLegacyNavResult(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final java.lang.String getStatus() {
        return this.status;
    }

    public final java.lang.String getProcessStatus() {
        return this.processStatus;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.status;
        java.lang.String str2 = this.processStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MosaicLegacyNavResult(status=");
        sb.append(str);
        sb.append(", processStatus=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode();
        java.lang.String str = this.processStatus;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult)) {
            return false;
        }
        com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult mosaicLegacyNavResult = (com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.status, mosaicLegacyNavResult.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.processStatus, mosaicLegacyNavResult.processStatus);
    }

    public final com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult copy(java.lang.String status, java.lang.String processStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult(status, processStatus);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getProcessStatus() {
        return this.processStatus;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult copy$default(com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult mosaicLegacyNavResult, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = mosaicLegacyNavResult.status;
        }
        if ((i & 2) != 0) {
            str2 = mosaicLegacyNavResult.processStatus;
        }
        return mosaicLegacyNavResult.copy(str, str2);
    }
}
