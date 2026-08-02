package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B!\b\u0002\u0012\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore;", "", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey;", "p0", "<init>", "(Ljava/util/Map;)V", "T", "key", "get", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;", "toBuilder", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "Companion", "Builder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FieldMetadataStore {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Companion(null);
    private static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore EMPTY = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore(kotlin.collections.MapsKt.emptyMap());

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey<?>, java.lang.Object> Camera2StreamConfigurationMap;

    private FieldMetadataStore(java.util.Map<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey<?>, ? extends java.lang.Object> map) {
        this.Camera2StreamConfigurationMap = map;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\u0005\u001a\u00020\u000b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\fR\u0017\u0010\r\u001a\u00020\u000b8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;", "builder", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore;", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore;", "EMPTY", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore;", "getEMPTY", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder() {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore builder(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder(null, 1, 0 == true ? 1 : 0);
            block.invoke(builder);
            return builder.build();
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore getEMPTY() {
            return com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.EMPTY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\n\u001a\u00020\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;", "", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey;", "initialData", "<init>", "(Ljava/util/Map;)V", "T", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "set", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/MetadataKey;Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore$Builder;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore;", "build", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FieldMetadataStore;", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.util.Map<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey<?>, java.lang.Object> getHighSpeedVideoFpsRanges;

        public Builder(java.util.Map<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey<?>, ? extends java.lang.Object> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.putAll(map);
            this.getHighSpeedVideoFpsRanges = linkedHashMap;
        }

        public /* synthetic */ Builder(java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final <T> com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder set(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey<T> key, T value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.getHighSpeedVideoFpsRanges.put(key, value);
            return this;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore build() {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore(kotlin.collections.MapsKt.toMap(this.getHighSpeedVideoFpsRanges), null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public final <T> T get(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        T t = (T) this.Camera2StreamConfigurationMap.get(key);
        if (t == null) {
            return null;
        }
        return t;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder toBuilder() {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore) other).Camera2StreamConfigurationMap);
        }
        return false;
    }

    public final int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    public /* synthetic */ FieldMetadataStore(java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }
}
