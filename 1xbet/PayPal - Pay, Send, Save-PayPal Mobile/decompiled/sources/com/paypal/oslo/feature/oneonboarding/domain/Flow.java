package com.paypal.oslo.feature.oneonboarding.domain;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u000b¢\u0006\u0004\b\u000f\u0010\u0010Bk\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\"\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ`\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u000bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J'\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0017R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010\u001bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b8\u0010\u0019R,\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "steps", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "status", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/StatusDetails;", "statusDetails", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "contextualInfo", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/util/List;Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;Ljava/util/List;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/util/List;Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;Ljava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "component4", "component5", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Ljava/util/List;Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;Ljava/util/List;Ljava/util/Map;)Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$one_onboarding_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId", "Ljava/util/List;", "getSteps", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "getStatus", "getStatusDetails", "Ljava/util/Map;", "getContextualInfo", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class Flow {
    private final java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> contextualInfo;
    private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;
    private final com.paypal.oslo.feature.oneonboarding.api.domain.Status status;
    private final java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails> statusDetails;
    private final java.util.List<com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig> steps;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.domain.Flow.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.domain.Flow.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.domain.Flow$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.domain.Flow$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.oneonboarding.domain.Flow.$r8$lambda$cTDB3JtxAtba_RSLFWxFR4ozPfk();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.domain.Flow$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.oneonboarding.api.domain.Status.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.domain.Flow$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.oneonboarding.domain.Flow.m16707$r8$lambda$4EYtWh7tllsrB_aMivq2Ll1zfI();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.domain.Flow$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.oneonboarding.domain.Flow.$r8$lambda$ULEqF9EuwACC8Bhnhv7tnipdrbs();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/Flow$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/domain/Flow;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.domain.Flow> serializer() {
            return com.paypal.oslo.feature.oneonboarding.domain.Flow$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Flow(int i, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List list, com.paypal.oslo.feature.oneonboarding.api.domain.Status status, java.util.List list2, java.util.Map map, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.oneonboarding.domain.Flow$$serializer.INSTANCE.getDescriptor());
        }
        this.intentId = intentId;
        this.steps = list;
        this.status = status;
        if ((i & 8) == 0) {
            this.statusDetails = kotlin.collections.CollectionsKt.emptyList();
        } else {
            this.statusDetails = list2;
        }
        if ((i & 16) == 0) {
            this.contextualInfo = kotlin.collections.MapsKt.emptyMap();
        } else {
            this.contextualInfo = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Flow(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig> list, com.paypal.oslo.feature.oneonboarding.api.domain.Status status, java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails> list2, java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, ? extends java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.intentId = intentId;
        this.steps = list;
        this.status = status;
        this.statusDetails = list2;
        this.contextualInfo = map;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$one_onboarding_prodRelease(com.paypal.oslo.feature.oneonboarding.domain.Flow self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.intentId);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.steps);
        output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.status);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(self.statusDetails, kotlin.collections.CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.statusDetails);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !kotlin.jvm.internal.Intrinsics.areEqual(self.contextualInfo, kotlin.collections.MapsKt.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.contextualInfo);
        }
    }

    public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
        return this.intentId;
    }

    public final java.util.List<com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig> getSteps() {
        return this.steps;
    }

    public final com.paypal.oslo.feature.oneonboarding.api.domain.Status getStatus() {
        return this.status;
    }

    public /* synthetic */ Flow(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List list, com.paypal.oslo.feature.oneonboarding.api.domain.Status status, java.util.List list2, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(intentId, list, status, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 16) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails> getStatusDetails() {
        return this.statusDetails;
    }

    public final java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> getContextualInfo() {
        return this.contextualInfo;
    }

    /* renamed from: $r8$lambda$4EYtWh7tllsrB_aMivq2Ll1zf-I, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m16707$r8$lambda$4EYtWh7tllsrB_aMivq2Ll1zfI() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails$$serializer.INSTANCE);
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$ULEqF9EuwACC8Bhnhv7tnipdrbs() {
        return new kotlinx.serialization.internal.LinkedHashMapSerializer(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId$$serializer.INSTANCE, new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo$$serializer.INSTANCE));
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$cTDB3JtxAtba_RSLFWxFR4ozPfk() {
        return new kotlinx.serialization.internal.ArrayListSerializer(new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig.class), new java.lang.annotation.Annotation[0]));
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
        java.util.List<com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig> list = this.steps;
        com.paypal.oslo.feature.oneonboarding.api.domain.Status status = this.status;
        java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails> list2 = this.statusDetails;
        java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> map = this.contextualInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Flow(intentId=");
        sb.append(intentId);
        sb.append(", steps=");
        sb.append(list);
        sb.append(", status=");
        sb.append(status);
        sb.append(", statusDetails=");
        sb.append(list2);
        sb.append(", contextualInfo=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.intentId.hashCode() * 31) + this.steps.hashCode()) * 31) + this.status.hashCode()) * 31) + this.statusDetails.hashCode()) * 31) + this.contextualInfo.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.domain.Flow)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.domain.Flow flow = (com.paypal.oslo.feature.oneonboarding.domain.Flow) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, flow.intentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.steps, flow.steps) && this.status == flow.status && kotlin.jvm.internal.Intrinsics.areEqual(this.statusDetails, flow.statusDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.contextualInfo, flow.contextualInfo);
    }

    public final com.paypal.oslo.feature.oneonboarding.domain.Flow copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List<? extends com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig> steps, com.paypal.oslo.feature.oneonboarding.api.domain.Status status, java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails> statusDetails, java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, ? extends java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> contextualInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(steps, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualInfo, "");
        return new com.paypal.oslo.feature.oneonboarding.domain.Flow(intentId, steps, status, statusDetails, contextualInfo);
    }

    public final java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> component5() {
        return this.contextualInfo;
    }

    public final java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails> component4() {
        return this.statusDetails;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.api.domain.Status getStatus() {
        return this.status;
    }

    public final java.util.List<com.paypal.oslo.feature.oneonboarding.domain.StepComponentConfig> component2() {
        return this.steps;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
        return this.intentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.domain.Flow copy$default(com.paypal.oslo.feature.oneonboarding.domain.Flow flow, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, java.util.List list, com.paypal.oslo.feature.oneonboarding.api.domain.Status status, java.util.List list2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            intentId = flow.intentId;
        }
        if ((i & 2) != 0) {
            list = flow.steps;
        }
        java.util.List list3 = list;
        if ((i & 4) != 0) {
            status = flow.status;
        }
        com.paypal.oslo.feature.oneonboarding.api.domain.Status status2 = status;
        if ((i & 8) != 0) {
            list2 = flow.statusDetails;
        }
        java.util.List list4 = list2;
        if ((i & 16) != 0) {
            map = flow.contextualInfo;
        }
        return flow.copy(intentId, list3, status2, list4, map);
    }
}
