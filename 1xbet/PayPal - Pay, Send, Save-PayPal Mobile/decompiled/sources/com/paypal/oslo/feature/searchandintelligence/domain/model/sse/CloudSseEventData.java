package com.paypal.oslo.feature.searchandintelligence.domain.model.sse;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001c\u0012\u0013\b\u0002\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u001b\u0010\r\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00002\u0013\b\u0002\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R+\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEventData;", "", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudDisplayComponent;", "Lkotlinx/serialization/Contextual;", "components", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEventData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_and_intelligence_prodRelease", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEventData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getComponents", "getComponents$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CloudSseEventData {
    private final java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent> components;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData.$r8$lambda$7ATOj0i6jrjQsL8Wj9UP9yQmEZY();
        }
    })};

    @kotlinx.serialization.SerialName("agentic_display_components")
    public static /* synthetic */ void getComponents$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEventData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/sse/CloudSseEventData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData> serializer() {
            return com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CloudSseEventData(int i, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.components = kotlin.collections.CollectionsKt.emptyList();
        } else {
            this.components = list;
        }
    }

    public CloudSseEventData(java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.components = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$search_and_intelligence_prodRelease(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !kotlin.jvm.internal.Intrinsics.areEqual(self.components, kotlin.collections.CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.components);
        }
    }

    public /* synthetic */ CloudSseEventData(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent> getComponents() {
        return this.components;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$7ATOj0i6jrjQsL8Wj9UP9yQmEZY() {
        return new kotlinx.serialization.internal.ArrayListSerializer(new kotlinx.serialization.ContextualSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent.class), null, new kotlinx.serialization.KSerializer[0]));
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent> list = this.components;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloudSseEventData(components=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.components.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData) && kotlin.jvm.internal.Intrinsics.areEqual(this.components, ((com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData) other).components);
    }

    public final com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData copy(java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent> components) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "");
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData(components);
    }

    public final java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudDisplayComponent> component1() {
        return this.components;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.sse.CloudSseEventData cloudSseEventData, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = cloudSseEventData.components;
        }
        return cloudSseEventData.copy(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CloudSseEventData() {
        this((java.util.List) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
