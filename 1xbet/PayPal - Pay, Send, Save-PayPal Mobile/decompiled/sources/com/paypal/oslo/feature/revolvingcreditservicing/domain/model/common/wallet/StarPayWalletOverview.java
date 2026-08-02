package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u0000 :2\u00020\u0001:\u0002;:B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJN\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J'\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u001bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;", "", "", "pushProvisioningActionEnabled", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletTracking;", "tracking", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityStatus;", "externalWalletStatus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityReason;", "externalWalletReason", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ProvisionedWalletToken;", "provisionedWalletTokens", "<init>", "(Ljava/lang/Boolean;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletTracking;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityReason;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletTracking;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityReason;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletTracking;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityStatus;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityReason;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/Boolean;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletTracking;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityReason;Ljava/util/List;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/Boolean;", "getPushProvisioningActionEnabled", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletTracking;", "getTracking", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityStatus;", "getExternalWalletStatus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletEligibilityReason;", "getExternalWalletReason", "Ljava/util/List;", "getProvisionedWalletTokens", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class StarPayWalletOverview {
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletReason;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletStatus;
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> provisionedWalletTokens;
    private final java.lang.Boolean pushProvisioningActionEnabled;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTracking tracking;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus.values());
            return createSimpleEnumSerializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason.values());
            return createSimpleEnumSerializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview.$r8$lambda$1ab4sGWCvv3Lpz6NfiYb5Q4Q3mE();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/StarPayWalletOverview;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StarPayWalletOverview(int i, java.lang.Boolean bool, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTracking walletTracking, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletEligibilityStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 31, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview$$serializer.INSTANCE.getDescriptor());
        }
        this.pushProvisioningActionEnabled = bool;
        this.tracking = walletTracking;
        this.externalWalletStatus = externalWalletEligibilityStatus;
        this.externalWalletReason = externalWalletEligibilityReason;
        this.provisionedWalletTokens = list;
    }

    public StarPayWalletOverview(java.lang.Boolean bool, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTracking walletTracking, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletEligibilityStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalWalletEligibilityStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalWalletEligibilityReason, "");
        this.pushProvisioningActionEnabled = bool;
        this.tracking = walletTracking;
        this.externalWalletStatus = externalWalletEligibilityStatus;
        this.externalWalletReason = externalWalletEligibilityReason;
        this.provisionedWalletTokens = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.pushProvisioningActionEnabled);
        output.encodeNullableSerializableElement(serialDesc, 1, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTracking$$serializer.INSTANCE, self.tracking);
        output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.externalWalletStatus);
        output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.externalWalletReason);
        output.encodeNullableSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.provisionedWalletTokens);
    }

    public final java.lang.Boolean getPushProvisioningActionEnabled() {
        return this.pushProvisioningActionEnabled;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTracking getTracking() {
        return this.tracking;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus getExternalWalletStatus() {
        return this.externalWalletStatus;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason getExternalWalletReason() {
        return this.externalWalletReason;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> getProvisionedWalletTokens() {
        return this.provisionedWalletTokens;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$1ab4sGWCvv3Lpz6NfiYb5Q4Q3mE() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.Boolean bool = this.pushProvisioningActionEnabled;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTracking walletTracking = this.tracking;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletEligibilityStatus = this.externalWalletStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason = this.externalWalletReason;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> list = this.provisionedWalletTokens;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StarPayWalletOverview(pushProvisioningActionEnabled=");
        sb.append(bool);
        sb.append(", tracking=");
        sb.append(walletTracking);
        sb.append(", externalWalletStatus=");
        sb.append(externalWalletEligibilityStatus);
        sb.append(", externalWalletReason=");
        sb.append(externalWalletEligibilityReason);
        sb.append(", provisionedWalletTokens=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.pushProvisioningActionEnabled;
        int hashCode = bool == null ? 0 : bool.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTracking walletTracking = this.tracking;
        int hashCode2 = walletTracking == null ? 0 : walletTracking.hashCode();
        int hashCode3 = this.externalWalletStatus.hashCode();
        int hashCode4 = this.externalWalletReason.hashCode();
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> list = this.provisionedWalletTokens;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.pushProvisioningActionEnabled, starPayWalletOverview.pushProvisioningActionEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.tracking, starPayWalletOverview.tracking) && this.externalWalletStatus == starPayWalletOverview.externalWalletStatus && this.externalWalletReason == starPayWalletOverview.externalWalletReason && kotlin.jvm.internal.Intrinsics.areEqual(this.provisionedWalletTokens, starPayWalletOverview.provisionedWalletTokens);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview copy(java.lang.Boolean pushProvisioningActionEnabled, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTracking tracking, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletReason, java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> provisionedWalletTokens) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalWalletStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalWalletReason, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview(pushProvisioningActionEnabled, tracking, externalWalletStatus, externalWalletReason, provisionedWalletTokens);
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> component5() {
        return this.provisionedWalletTokens;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason getExternalWalletReason() {
        return this.externalWalletReason;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus getExternalWalletStatus() {
        return this.externalWalletStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTracking getTracking() {
        return this.tracking;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getPushProvisioningActionEnabled() {
        return this.pushProvisioningActionEnabled;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview, java.lang.Boolean bool, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTracking walletTracking, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletEligibilityStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = starPayWalletOverview.pushProvisioningActionEnabled;
        }
        if ((i & 2) != 0) {
            walletTracking = starPayWalletOverview.tracking;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTracking walletTracking2 = walletTracking;
        if ((i & 4) != 0) {
            externalWalletEligibilityStatus = starPayWalletOverview.externalWalletStatus;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityStatus externalWalletEligibilityStatus2 = externalWalletEligibilityStatus;
        if ((i & 8) != 0) {
            externalWalletEligibilityReason = starPayWalletOverview.externalWalletReason;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletEligibilityReason externalWalletEligibilityReason2 = externalWalletEligibilityReason;
        if ((i & 16) != 0) {
            list = starPayWalletOverview.provisionedWalletTokens;
        }
        return starPayWalletOverview.copy(bool, walletTracking2, externalWalletEligibilityStatus2, externalWalletEligibilityReason2, list);
    }
}
