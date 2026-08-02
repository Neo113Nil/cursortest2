package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u001f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÇ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b$\u0010\r"}, d2 = {"Lcom/zettle/sdk/core/user/AmountRange;", "", "", "seen1", "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Long;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Long;Ljava/lang/Long;)V", "component1", "()Ljava/lang/Long;", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/zettle/sdk/core/user/AmountRange;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/AmountRange;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Long;", "getMax", "getMin", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class AmountRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.AmountRange.Companion INSTANCE = new com.zettle.sdk.core.user.AmountRange.Companion(null);
    private final java.lang.Long max;
    private final java.lang.Long min;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/AmountRange$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/AmountRange;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.AmountRange> serializer() {
            return com.zettle.sdk.core.user.AmountRange$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ AmountRange(int i, java.lang.Long l, java.lang.Long l2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.min = null;
        } else {
            this.min = l;
        }
        if ((i & 2) == 0) {
            this.max = null;
        } else {
            this.max = l2;
        }
    }

    public AmountRange(java.lang.Long l, java.lang.Long l2) {
        this.min = l;
        this.max = l2;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.AmountRange self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.min != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.LongSerializer.INSTANCE, self.min);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.max != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.LongSerializer.INSTANCE, self.max);
        }
    }

    public /* synthetic */ AmountRange(java.lang.Long l, java.lang.Long l2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }

    public final java.lang.Long getMin() {
        return this.min;
    }

    public final java.lang.Long getMax() {
        return this.max;
    }

    public final java.lang.String toString() {
        java.lang.Long l = this.min;
        java.lang.Long l2 = this.max;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountRange(min=");
        sb.append(l);
        sb.append(", max=");
        sb.append(l2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Long l = this.min;
        int hashCode = l == null ? 0 : l.hashCode();
        java.lang.Long l2 = this.max;
        return (hashCode * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.core.user.AmountRange)) {
            return false;
        }
        com.zettle.sdk.core.user.AmountRange amountRange = (com.zettle.sdk.core.user.AmountRange) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.min, amountRange.min) && kotlin.jvm.internal.Intrinsics.areEqual(this.max, amountRange.max);
    }

    public final com.zettle.sdk.core.user.AmountRange copy(java.lang.Long min, java.lang.Long max) {
        return new com.zettle.sdk.core.user.AmountRange(min, max);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getMax() {
        return this.max;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getMin() {
        return this.min;
    }

    public static /* synthetic */ com.zettle.sdk.core.user.AmountRange copy$default(com.zettle.sdk.core.user.AmountRange amountRange, java.lang.Long l, java.lang.Long l2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = amountRange.min;
        }
        if ((i & 2) != 0) {
            l2 = amountRange.max;
        }
        return amountRange.copy(l, l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AmountRange() {
        this((java.lang.Long) null, (java.lang.Long) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
