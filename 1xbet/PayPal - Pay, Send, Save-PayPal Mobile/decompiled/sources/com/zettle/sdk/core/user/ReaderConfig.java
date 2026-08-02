package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u001f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fHÇ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/core/user/ReaderConfig;", "", "", "seen1", "Lcom/zettle/sdk/core/user/PaymentModeConfig;", "offline", "Lcom/zettle/sdk/core/user/Gratuity;", "gratuity", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILcom/zettle/sdk/core/user/PaymentModeConfig;Lcom/zettle/sdk/core/user/Gratuity;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/zettle/sdk/core/user/PaymentModeConfig;Lcom/zettle/sdk/core/user/Gratuity;)V", "component1", "()Lcom/zettle/sdk/core/user/PaymentModeConfig;", "component2", "()Lcom/zettle/sdk/core/user/Gratuity;", "copy", "(Lcom/zettle/sdk/core/user/PaymentModeConfig;Lcom/zettle/sdk/core/user/Gratuity;)Lcom/zettle/sdk/core/user/ReaderConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/ReaderConfig;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/zettle/sdk/core/user/Gratuity;", "getGratuity", "Lcom/zettle/sdk/core/user/PaymentModeConfig;", "getOffline", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class ReaderConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.ReaderConfig.Companion INSTANCE = new com.zettle.sdk.core.user.ReaderConfig.Companion(null);
    private final com.zettle.sdk.core.user.Gratuity gratuity;
    private final com.zettle.sdk.core.user.PaymentModeConfig offline;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/ReaderConfig$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/ReaderConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.ReaderConfig> serializer() {
            return com.zettle.sdk.core.user.ReaderConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ReaderConfig(int i, com.zettle.sdk.core.user.PaymentModeConfig paymentModeConfig, com.zettle.sdk.core.user.Gratuity gratuity, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.offline = null;
        } else {
            this.offline = paymentModeConfig;
        }
        if ((i & 2) == 0) {
            this.gratuity = null;
        } else {
            this.gratuity = gratuity;
        }
    }

    public ReaderConfig(com.zettle.sdk.core.user.PaymentModeConfig paymentModeConfig, com.zettle.sdk.core.user.Gratuity gratuity) {
        this.offline = paymentModeConfig;
        this.gratuity = gratuity;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.ReaderConfig self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.offline != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, com.zettle.sdk.core.user.PaymentModeConfig$$serializer.INSTANCE, self.offline);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.gratuity != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, com.zettle.sdk.core.user.Gratuity$$serializer.INSTANCE, self.gratuity);
        }
    }

    public /* synthetic */ ReaderConfig(com.zettle.sdk.core.user.PaymentModeConfig paymentModeConfig, com.zettle.sdk.core.user.Gratuity gratuity, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentModeConfig, (i & 2) != 0 ? null : gratuity);
    }

    public final com.zettle.sdk.core.user.PaymentModeConfig getOffline() {
        return this.offline;
    }

    public final com.zettle.sdk.core.user.Gratuity getGratuity() {
        return this.gratuity;
    }

    public final java.lang.String toString() {
        com.zettle.sdk.core.user.PaymentModeConfig paymentModeConfig = this.offline;
        com.zettle.sdk.core.user.Gratuity gratuity = this.gratuity;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReaderConfig(offline=");
        sb.append(paymentModeConfig);
        sb.append(", gratuity=");
        sb.append(gratuity);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.zettle.sdk.core.user.PaymentModeConfig paymentModeConfig = this.offline;
        int hashCode = paymentModeConfig == null ? 0 : paymentModeConfig.hashCode();
        com.zettle.sdk.core.user.Gratuity gratuity = this.gratuity;
        return (hashCode * 31) + (gratuity != null ? gratuity.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.core.user.ReaderConfig)) {
            return false;
        }
        com.zettle.sdk.core.user.ReaderConfig readerConfig = (com.zettle.sdk.core.user.ReaderConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.offline, readerConfig.offline) && kotlin.jvm.internal.Intrinsics.areEqual(this.gratuity, readerConfig.gratuity);
    }

    public final com.zettle.sdk.core.user.ReaderConfig copy(com.zettle.sdk.core.user.PaymentModeConfig offline, com.zettle.sdk.core.user.Gratuity gratuity) {
        return new com.zettle.sdk.core.user.ReaderConfig(offline, gratuity);
    }

    /* renamed from: component2, reason: from getter */
    public final com.zettle.sdk.core.user.Gratuity getGratuity() {
        return this.gratuity;
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.sdk.core.user.PaymentModeConfig getOffline() {
        return this.offline;
    }

    public static /* synthetic */ com.zettle.sdk.core.user.ReaderConfig copy$default(com.zettle.sdk.core.user.ReaderConfig readerConfig, com.zettle.sdk.core.user.PaymentModeConfig paymentModeConfig, com.zettle.sdk.core.user.Gratuity gratuity, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            paymentModeConfig = readerConfig.offline;
        }
        if ((i & 2) != 0) {
            gratuity = readerConfig.gratuity;
        }
        return readerConfig.copy(paymentModeConfig, gratuity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReaderConfig() {
        this((com.zettle.sdk.core.user.PaymentModeConfig) null, (com.zettle.sdk.core.user.Gratuity) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
