package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BI\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB7\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J@\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J(\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&HÇ\u0001¢\u0006\u0004\b)\u0010*R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0012R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b6\u0010.\u001a\u0004\b5\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/core/user/PaymentModeConfig;", "", "", "seen1", "", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "Lcom/zettle/sdk/core/user/StoragePolicy;", "storagePolicy", "Lcom/zettle/sdk/core/user/ApprovePolicy;", "approvePolicy", "Lcom/zettle/sdk/core/user/ReaderSupportPolicy;", "readerSupportPolicy", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Lcom/zettle/sdk/core/user/StoragePolicy;Lcom/zettle/sdk/core/user/ApprovePolicy;Lcom/zettle/sdk/core/user/ReaderSupportPolicy;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Boolean;Lcom/zettle/sdk/core/user/StoragePolicy;Lcom/zettle/sdk/core/user/ApprovePolicy;Lcom/zettle/sdk/core/user/ReaderSupportPolicy;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/zettle/sdk/core/user/StoragePolicy;", "component3", "()Lcom/zettle/sdk/core/user/ApprovePolicy;", "component4", "()Lcom/zettle/sdk/core/user/ReaderSupportPolicy;", "copy", "(Ljava/lang/Boolean;Lcom/zettle/sdk/core/user/StoragePolicy;Lcom/zettle/sdk/core/user/ApprovePolicy;Lcom/zettle/sdk/core/user/ReaderSupportPolicy;)Lcom/zettle/sdk/core/user/PaymentModeConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/PaymentModeConfig;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/zettle/sdk/core/user/ApprovePolicy;", "getApprovePolicy", "getApprovePolicy$annotations", "()V", "Ljava/lang/Boolean;", "getAvailable", "Lcom/zettle/sdk/core/user/ReaderSupportPolicy;", "getReaderSupportPolicy", "getReaderSupportPolicy$annotations", "Lcom/zettle/sdk/core/user/StoragePolicy;", "getStoragePolicy", "getStoragePolicy$annotations", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class PaymentModeConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.PaymentModeConfig.Companion INSTANCE = new com.zettle.sdk.core.user.PaymentModeConfig.Companion(null);
    private final com.zettle.sdk.core.user.ApprovePolicy approvePolicy;
    private final java.lang.Boolean available;
    private final com.zettle.sdk.core.user.ReaderSupportPolicy readerSupportPolicy;
    private final com.zettle.sdk.core.user.StoragePolicy storagePolicy;

    @kotlinx.serialization.SerialName("approve_policy")
    public static /* synthetic */ void getApprovePolicy$annotations() {
    }

    @kotlinx.serialization.SerialName("reader_support_policy")
    public static /* synthetic */ void getReaderSupportPolicy$annotations() {
    }

    @kotlinx.serialization.SerialName("storage_policy")
    public static /* synthetic */ void getStoragePolicy$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/PaymentModeConfig$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/PaymentModeConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.PaymentModeConfig> serializer() {
            return com.zettle.sdk.core.user.PaymentModeConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PaymentModeConfig(int i, java.lang.Boolean bool, @kotlinx.serialization.SerialName("storage_policy") com.zettle.sdk.core.user.StoragePolicy storagePolicy, @kotlinx.serialization.SerialName("approve_policy") com.zettle.sdk.core.user.ApprovePolicy approvePolicy, @kotlinx.serialization.SerialName("reader_support_policy") com.zettle.sdk.core.user.ReaderSupportPolicy readerSupportPolicy, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.available = null;
        } else {
            this.available = bool;
        }
        if ((i & 2) == 0) {
            this.storagePolicy = null;
        } else {
            this.storagePolicy = storagePolicy;
        }
        if ((i & 4) == 0) {
            this.approvePolicy = null;
        } else {
            this.approvePolicy = approvePolicy;
        }
        if ((i & 8) == 0) {
            this.readerSupportPolicy = null;
        } else {
            this.readerSupportPolicy = readerSupportPolicy;
        }
    }

    public PaymentModeConfig(java.lang.Boolean bool, com.zettle.sdk.core.user.StoragePolicy storagePolicy, com.zettle.sdk.core.user.ApprovePolicy approvePolicy, com.zettle.sdk.core.user.ReaderSupportPolicy readerSupportPolicy) {
        this.available = bool;
        this.storagePolicy = storagePolicy;
        this.approvePolicy = approvePolicy;
        this.readerSupportPolicy = readerSupportPolicy;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.PaymentModeConfig self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.available != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.available);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.storagePolicy != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, com.zettle.sdk.core.user.StoragePolicy$$serializer.INSTANCE, self.storagePolicy);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.approvePolicy != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, com.zettle.sdk.core.user.ApprovePolicy$$serializer.INSTANCE, self.approvePolicy);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.readerSupportPolicy != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, com.zettle.sdk.core.user.ReaderSupportPolicy$$serializer.INSTANCE, self.readerSupportPolicy);
        }
    }

    public /* synthetic */ PaymentModeConfig(java.lang.Boolean bool, com.zettle.sdk.core.user.StoragePolicy storagePolicy, com.zettle.sdk.core.user.ApprovePolicy approvePolicy, com.zettle.sdk.core.user.ReaderSupportPolicy readerSupportPolicy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : storagePolicy, (i & 4) != 0 ? null : approvePolicy, (i & 8) != 0 ? null : readerSupportPolicy);
    }

    public final java.lang.Boolean getAvailable() {
        return this.available;
    }

    public final com.zettle.sdk.core.user.StoragePolicy getStoragePolicy() {
        return this.storagePolicy;
    }

    public final com.zettle.sdk.core.user.ApprovePolicy getApprovePolicy() {
        return this.approvePolicy;
    }

    public final com.zettle.sdk.core.user.ReaderSupportPolicy getReaderSupportPolicy() {
        return this.readerSupportPolicy;
    }

    public final java.lang.String toString() {
        java.lang.Boolean bool = this.available;
        com.zettle.sdk.core.user.StoragePolicy storagePolicy = this.storagePolicy;
        com.zettle.sdk.core.user.ApprovePolicy approvePolicy = this.approvePolicy;
        com.zettle.sdk.core.user.ReaderSupportPolicy readerSupportPolicy = this.readerSupportPolicy;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentModeConfig(available=");
        sb.append(bool);
        sb.append(", storagePolicy=");
        sb.append(storagePolicy);
        sb.append(", approvePolicy=");
        sb.append(approvePolicy);
        sb.append(", readerSupportPolicy=");
        sb.append(readerSupportPolicy);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.available;
        int hashCode = bool == null ? 0 : bool.hashCode();
        com.zettle.sdk.core.user.StoragePolicy storagePolicy = this.storagePolicy;
        int hashCode2 = storagePolicy == null ? 0 : storagePolicy.hashCode();
        com.zettle.sdk.core.user.ApprovePolicy approvePolicy = this.approvePolicy;
        int hashCode3 = approvePolicy == null ? 0 : approvePolicy.hashCode();
        com.zettle.sdk.core.user.ReaderSupportPolicy readerSupportPolicy = this.readerSupportPolicy;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (readerSupportPolicy != null ? readerSupportPolicy.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.core.user.PaymentModeConfig)) {
            return false;
        }
        com.zettle.sdk.core.user.PaymentModeConfig paymentModeConfig = (com.zettle.sdk.core.user.PaymentModeConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.available, paymentModeConfig.available) && kotlin.jvm.internal.Intrinsics.areEqual(this.storagePolicy, paymentModeConfig.storagePolicy) && kotlin.jvm.internal.Intrinsics.areEqual(this.approvePolicy, paymentModeConfig.approvePolicy) && kotlin.jvm.internal.Intrinsics.areEqual(this.readerSupportPolicy, paymentModeConfig.readerSupportPolicy);
    }

    public final com.zettle.sdk.core.user.PaymentModeConfig copy(java.lang.Boolean available, com.zettle.sdk.core.user.StoragePolicy storagePolicy, com.zettle.sdk.core.user.ApprovePolicy approvePolicy, com.zettle.sdk.core.user.ReaderSupportPolicy readerSupportPolicy) {
        return new com.zettle.sdk.core.user.PaymentModeConfig(available, storagePolicy, approvePolicy, readerSupportPolicy);
    }

    /* renamed from: component4, reason: from getter */
    public final com.zettle.sdk.core.user.ReaderSupportPolicy getReaderSupportPolicy() {
        return this.readerSupportPolicy;
    }

    /* renamed from: component3, reason: from getter */
    public final com.zettle.sdk.core.user.ApprovePolicy getApprovePolicy() {
        return this.approvePolicy;
    }

    /* renamed from: component2, reason: from getter */
    public final com.zettle.sdk.core.user.StoragePolicy getStoragePolicy() {
        return this.storagePolicy;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getAvailable() {
        return this.available;
    }

    public static /* synthetic */ com.zettle.sdk.core.user.PaymentModeConfig copy$default(com.zettle.sdk.core.user.PaymentModeConfig paymentModeConfig, java.lang.Boolean bool, com.zettle.sdk.core.user.StoragePolicy storagePolicy, com.zettle.sdk.core.user.ApprovePolicy approvePolicy, com.zettle.sdk.core.user.ReaderSupportPolicy readerSupportPolicy, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = paymentModeConfig.available;
        }
        if ((i & 2) != 0) {
            storagePolicy = paymentModeConfig.storagePolicy;
        }
        if ((i & 4) != 0) {
            approvePolicy = paymentModeConfig.approvePolicy;
        }
        if ((i & 8) != 0) {
            readerSupportPolicy = paymentModeConfig.readerSupportPolicy;
        }
        return paymentModeConfig.copy(bool, storagePolicy, approvePolicy, readerSupportPolicy);
    }

    public PaymentModeConfig() {
        this((java.lang.Boolean) null, (com.zettle.sdk.core.user.StoragePolicy) null, (com.zettle.sdk.core.user.ApprovePolicy) null, (com.zettle.sdk.core.user.ReaderSupportPolicy) null, 15, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
