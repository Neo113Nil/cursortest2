package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0003\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0014\u001a\u00020\u0006\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00188\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000b\u0010\u001b"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "Lkotlinx/serialization/json/Json;", "p0", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "p1", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "Lkotlinx/serialization/SerializationStrategy;", "p2", "p3", "encodeNullableSerializableElement", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "Camera2StreamConfigurationMap", "()Lkotlinx/serialization/json/JsonElement;", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "()Ljava/util/Map;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
class JsonTreeEncoder extends kotlinx.serialization.json.internal.AbstractJsonTreeEncoder {
    private final java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement> getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeEncoder(kotlinx.serialization.json.Json json, kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonElement, kotlin.Unit> function1) {
        super(json, function1, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = new java.util.LinkedHashMap();
    }

    protected final java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement> getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, kotlinx.serialization.json.JsonElement p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        this.getHighSpeedVideoSizes.put(p0, p1);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeNullableSerializableElement(kotlinx.serialization.descriptors.SerialDescriptor p0, int p1, kotlinx.serialization.SerializationStrategy<? super T> p2, T p3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        if (p3 != null || this.getHighResolutionOutputSizeshNQ4ISI.getExplicitNulls()) {
            super.encodeNullableSerializableElement(p0, p1, p2, p3);
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public kotlinx.serialization.json.JsonElement Camera2StreamConfigurationMap() {
        return new kotlinx.serialization.json.JsonObject(this.getHighSpeedVideoSizes);
    }
}
