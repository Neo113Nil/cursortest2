package com.paypal.oslo.feature.taptopay.api.domain.model.topbar;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/model/topbar/ProgressRange;", "", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "<init>", "(II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/taptopay/api/domain/model/topbar/ProgressRange;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$taptopay_api_prodRelease", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/topbar/ProgressRange;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getStart", "getEnd", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ProgressRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange.Companion(null);
    private final int end;
    private final int start;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/model/topbar/ProgressRange$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/topbar/ProgressRange;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange> serializer() {
            return com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProgressRange(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    public /* synthetic */ ProgressRange(int i, int i2, int i3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange$$serializer.INSTANCE.getDescriptor());
        }
        this.start = i2;
        this.end = i3;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$taptopay_api_prodRelease(com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.start);
        output.encodeIntElement(serialDesc, 1, self.end);
    }

    public final int getStart() {
        return this.start;
    }

    public final int getEnd() {
        return this.end;
    }

    public final java.lang.String toString() {
        int i = this.start;
        int i2 = this.end;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProgressRange(start=");
        sb.append(i);
        sb.append(", end=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.start) * 31) + java.lang.Integer.hashCode(this.end);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange progressRange = (com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange) other;
        return this.start == progressRange.start && this.end == progressRange.end;
    }

    public final com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange copy(int start, int end) {
        return new com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange(start, end);
    }

    /* renamed from: component2, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    /* renamed from: component1, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange copy$default(com.paypal.oslo.feature.taptopay.api.domain.model.topbar.ProgressRange progressRange, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = progressRange.start;
        }
        if ((i3 & 2) != 0) {
            i2 = progressRange.end;
        }
        return progressRange.copy(i, i2);
    }
}
