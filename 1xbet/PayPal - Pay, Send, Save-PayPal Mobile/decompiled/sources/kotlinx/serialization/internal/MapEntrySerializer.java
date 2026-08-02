package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003:\u0001\u0016B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\n\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u000b\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014"}, d2 = {"Lkotlinx/serialization/internal/MapEntrySerializer;", "K", "V", "Lkotlinx/serialization/internal/KeyValueSerializer;", "", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getKey", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "getValue", "MapEntry"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MapEntrySerializer<K, V> extends kotlinx.serialization.internal.KeyValueSerializer<K, V, java.util.Map.Entry<? extends K, ? extends V>> {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer(final kotlinx.serialization.KSerializer<K> kSerializer, final kotlinx.serialization.KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer2, "");
        this.descriptor = kotlinx.serialization.descriptors.SerialDescriptorsKt.buildSerialDescriptor("kotlin.collections.Map.Entry", kotlinx.serialization.descriptors.StructureKind.MAP.INSTANCE, new kotlinx.serialization.descriptors.SerialDescriptor[0], new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.internal.MapEntrySerializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.serialization.internal.MapEntrySerializer.m24217$r8$lambda$OpkROm_ArWMMdjLNh8LkCpGaY0(kotlinx.serialization.KSerializer.this, kSerializer2, (kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final /* bridge */ /* synthetic */ java.lang.Object toResult(java.lang.Object obj, java.lang.Object obj2) {
        return toResult((kotlinx.serialization.internal.MapEntrySerializer<K, V>) obj, obj2);
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00028\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00028\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015"}, d2 = {"Lkotlinx/serialization/internal/MapEntrySerializer$MapEntry;", "K", "V", "", "p0", "p1", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "getValue", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final /* data */ class MapEntry<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMappedMarker {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final K getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final V getHighSpeedVideoSizes;

        public MapEntry(K k, V v) {
            this.getHighSpeedVideoFpsRanges = k;
            this.getHighSpeedVideoSizes = v;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MapEntry(getHighSpeedVideoFpsRanges=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(')');
            return sb.toString();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.getHighSpeedVideoFpsRanges;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.getHighSpeedVideoSizes;
            return (hashCode * 31) + (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof kotlinx.serialization.internal.MapEntrySerializer.MapEntry)) {
                return false;
            }
            kotlinx.serialization.internal.MapEntrySerializer.MapEntry mapEntry = (kotlinx.serialization.internal.MapEntrySerializer.MapEntry) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, mapEntry.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, mapEntry.getHighSpeedVideoSizes);
        }
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final K getKey(java.util.Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final V getValue(java.util.Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        return entry.getValue();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    protected final java.util.Map.Entry<K, V> toResult(K key, V value) {
        return new kotlinx.serialization.internal.MapEntrySerializer.MapEntry(key, value);
    }

    /* renamed from: $r8$lambda$OpkROm_ArWMMd-jLNh8LkCpGaY0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24217$r8$lambda$OpkROm_ArWMMdjLNh8LkCpGaY0(kotlinx.serialization.KSerializer kSerializer, kotlinx.serialization.KSerializer kSerializer2, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "key", kSerializer.getDescriptor(), null, false, 12, null);
        kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, kSerializer2.getDescriptor(), null, false, 12, null);
        return kotlin.Unit.INSTANCE;
    }
}
