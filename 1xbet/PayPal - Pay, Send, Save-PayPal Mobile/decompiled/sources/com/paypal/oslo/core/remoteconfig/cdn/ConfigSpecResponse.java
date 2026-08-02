package com.paypal.oslo.core.remoteconfig.cdn;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002+*B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ0\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u000fR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/cdn/ConfigSpecResponse;", "", "", "Lcom/paypal/oslo/core/remoteconfig/cdn/FeatureGateSpec;", "featureGates", "Lcom/paypal/oslo/core/remoteconfig/cdn/DynamicConfigSpec;", "dynamicConfigs", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/core/remoteconfig/cdn/ConfigSpecResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$remote_config_release", "(Lcom/paypal/oslo/core/remoteconfig/cdn/ConfigSpecResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getFeatureGates", "getFeatureGates$annotations", "()V", "getDynamicConfigs", "getDynamicConfigs$annotations", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ConfigSpecResponse {
    private final java.util.List<com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec> dynamicConfigs;
    private final java.util.List<com.paypal.oslo.core.remoteconfig.cdn.FeatureGateSpec> featureGates;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse.Companion INSTANCE = new com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse.m11677$r8$lambda$zIbwlJgrmEgdBPXTfWY8hzZJYs();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse.$r8$lambda$ty2gnrMAVlG3HohSumdvxyz3eXs();
        }
    })};

    @kotlinx.serialization.SerialName("dynamic_configs")
    public static /* synthetic */ void getDynamicConfigs$annotations() {
    }

    @kotlinx.serialization.SerialName("feature_gates")
    public static /* synthetic */ void getFeatureGates$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/cdn/ConfigSpecResponse$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/remoteconfig/cdn/ConfigSpecResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse> serializer() {
            return com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ConfigSpecResponse(int i, java.util.List list, java.util.List list2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        this.featureGates = (i & 1) == 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
        if ((i & 2) == 0) {
            this.dynamicConfigs = kotlin.collections.CollectionsKt.emptyList();
        } else {
            this.dynamicConfigs = list2;
        }
    }

    public ConfigSpecResponse(java.util.List<com.paypal.oslo.core.remoteconfig.cdn.FeatureGateSpec> list, java.util.List<com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.featureGates = list;
        this.dynamicConfigs = list2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$remote_config_release(com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !kotlin.jvm.internal.Intrinsics.areEqual(self.featureGates, kotlin.collections.CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.featureGates);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.dynamicConfigs, kotlin.collections.CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.dynamicConfigs);
        }
    }

    public /* synthetic */ ConfigSpecResponse(java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
    }

    public final java.util.List<com.paypal.oslo.core.remoteconfig.cdn.FeatureGateSpec> getFeatureGates() {
        return this.featureGates;
    }

    public final java.util.List<com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec> getDynamicConfigs() {
        return this.dynamicConfigs;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$ty2gnrMAVlG3HohSumdvxyz3eXs() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec$$serializer.INSTANCE);
    }

    /* renamed from: $r8$lambda$zIbwlJgrmEgdBPXTf-WY8hzZJYs, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m11677$r8$lambda$zIbwlJgrmEgdBPXTfWY8hzZJYs() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.core.remoteconfig.cdn.FeatureGateSpec$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.core.remoteconfig.cdn.FeatureGateSpec> list = this.featureGates;
        java.util.List<com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec> list2 = this.dynamicConfigs;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfigSpecResponse(featureGates=");
        sb.append(list);
        sb.append(", dynamicConfigs=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.featureGates.hashCode() * 31) + this.dynamicConfigs.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse)) {
            return false;
        }
        com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse configSpecResponse = (com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.featureGates, configSpecResponse.featureGates) && kotlin.jvm.internal.Intrinsics.areEqual(this.dynamicConfigs, configSpecResponse.dynamicConfigs);
    }

    public final com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse copy(java.util.List<com.paypal.oslo.core.remoteconfig.cdn.FeatureGateSpec> featureGates, java.util.List<com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec> dynamicConfigs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGates, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfigs, "");
        return new com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse(featureGates, dynamicConfigs);
    }

    public final java.util.List<com.paypal.oslo.core.remoteconfig.cdn.DynamicConfigSpec> component2() {
        return this.dynamicConfigs;
    }

    public final java.util.List<com.paypal.oslo.core.remoteconfig.cdn.FeatureGateSpec> component1() {
        return this.featureGates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse copy$default(com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse configSpecResponse, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = configSpecResponse.featureGates;
        }
        if ((i & 2) != 0) {
            list2 = configSpecResponse.dynamicConfigs;
        }
        return configSpecResponse.copy(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConfigSpecResponse() {
        this((java.util.List) null, (java.util.List) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
