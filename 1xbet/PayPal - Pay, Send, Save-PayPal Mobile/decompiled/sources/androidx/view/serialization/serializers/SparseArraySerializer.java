package androidx.view.serialization.serializers;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002:\u0001\u001aB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00158\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer;", "T", "Lkotlinx/serialization/KSerializer;", "Landroid/util/SparseArray;", "elementSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Landroid/util/SparseArray;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Landroid/util/SparseArray;", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/KSerializer;", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "SparseArraySurrogate"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SparseArraySerializer<T> implements kotlinx.serialization.KSerializer<android.util.SparseArray<T>> {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.serialization.KSerializer<androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate<T>> getHighSpeedVideoFpsRanges;

    public SparseArraySerializer(kotlinx.serialization.KSerializer<T> kSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlinx.serialization.KSerializer<androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate<T>> serializer = androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate.INSTANCE.serializer(kSerializer);
        this.getHighSpeedVideoFpsRanges = serializer;
        this.descriptor = serializer.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, android.util.SparseArray<T> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        int size = value.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(java.lang.Integer.valueOf(value.keyAt(i)));
        }
        java.util.ArrayList arrayList2 = arrayList;
        int size2 = value.size();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList3.add(value.valueAt(i2));
        }
        encoder.encodeSerializableValue(this.getHighSpeedVideoFpsRanges, new androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate(arrayList2, arrayList3));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final android.util.SparseArray<T> deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
        androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate sparseArraySurrogate = (androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate) decoder.decodeSerializableValue(this.getHighSpeedVideoFpsRanges);
        if (sparseArraySurrogate.getKeys().size() != sparseArraySurrogate.getValues().size()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        android.util.SparseArray<T> sparseArray = new android.util.SparseArray<>(sparseArraySurrogate.getKeys().size());
        int size = sparseArraySurrogate.getKeys().size();
        for (int i = 0; i < size; i++) {
            sparseArray.append(sparseArraySurrogate.getKeys().get(i).intValue(), sparseArraySurrogate.getValues().get(i));
        }
        return sparseArray;
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0003\u0018\u0000 \u0019*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u001a\u0019B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJG\u0010\u0011\u001a\u00020\u0010\"\n\b\u0002\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "T", "", "", "", "p0", "p1", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "p2", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "p3", "(ILjava/util/List;Ljava/util/List;)V", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/KSerializer;", "", "Camera2StreamConfigurationMap", "(Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "Ljava/util/List;", "getKeys", "()Ljava/util/List;", "values", "getValues", "Companion", "$serializer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    static final class SparseArraySurrogate<T> {
        private static final kotlinx.serialization.descriptors.SerialDescriptor $cachedDescriptor;
        private final java.util.List<java.lang.Integer> keys;
        private final java.util.List<T> values;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate.Companion INSTANCE = new androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: androidx.savedstate.serialization.serializers.SparseArraySerializer$SparseArraySurrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate.getHighResolutionOutputSizeshNQ4ISI();
            }
        }), null};

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00070\u0005\"\u0004\b\u0002\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate$Companion;", "", "<init>", "()V", "T", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "serializer", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public final <T> kotlinx.serialization.KSerializer<androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate<T>> serializer(kotlinx.serialization.KSerializer<T> typeSerial0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSerial0, "");
                return new androidx.view.serialization.serializers.SparseArraySerializer$SparseArraySurrogate$$serializer(typeSerial0);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        static {
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            pluginGeneratedSerialDescriptor.addElement(org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, false);
            pluginGeneratedSerialDescriptor.addElement("values", false);
            $cachedDescriptor = pluginGeneratedSerialDescriptor;
        }

        public /* synthetic */ SparseArraySurrogate(int i, java.util.List list, java.util.List list2) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, $cachedDescriptor);
            }
            this.keys = list;
            this.values = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SparseArraySurrogate(java.util.List<java.lang.Integer> list, java.util.List<? extends T> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.keys = list;
            this.values = list2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void Camera2StreamConfigurationMap(androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate p0, kotlinx.serialization.encoding.CompositeEncoder p1, kotlinx.serialization.descriptors.SerialDescriptor p2, kotlinx.serialization.KSerializer p3) {
            p1.encodeSerializableElement(p2, 0, $childSerializers[0].getValue(), p0.keys);
            p1.encodeSerializableElement(p2, 1, new kotlinx.serialization.internal.ArrayListSerializer(p3), p0.values);
        }

        public final java.util.List<java.lang.Integer> getKeys() {
            return this.keys;
        }

        public final java.util.List<T> getValues() {
            return this.values;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer getHighResolutionOutputSizeshNQ4ISI() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.IntSerializer.INSTANCE);
        }
    }
}
