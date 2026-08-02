package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0010\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0016\u0010\u0019\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeMapDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/Json;", "p0", "Lkotlinx/serialization/json/JsonObject;", "p1", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "elementName", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "Lkotlinx/serialization/json/JsonElement;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lkotlinx/serialization/json/JsonObject;", "getHighSpeedVideoFpsRangesFor", "()Lkotlinx/serialization/json/JsonObject;", "", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class JsonTreeMapDecoder extends kotlinx.serialization.json.internal.JsonTreeDecoder {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;
    private final kotlinx.serialization.json.JsonObject getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeMapDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonObject jsonObject) {
        super(json, jsonObject, null, null, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
        this.getHighSpeedVideoFpsRanges = jsonObject;
        java.util.List<java.lang.String> list = kotlin.collections.CollectionsKt.toList(jsonObject.keySet());
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRangesFor = list.size() * 2;
        this.getHighSpeedVideoSizes = -1;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    public final kotlinx.serialization.json.JsonObject getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.internal.NamedValueDecoder
    public final java.lang.String elementName(kotlinx.serialization.descriptors.SerialDescriptor p0, int p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.get(p1 / 2);
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(kotlinx.serialization.descriptors.SerialDescriptor p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        int i = this.getHighSpeedVideoSizes;
        if (i >= this.getHighSpeedVideoFpsRangesFor - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.getHighSpeedVideoSizes = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    protected final kotlinx.serialization.json.JsonElement getHighSpeedVideoFpsRanges(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return (kotlinx.serialization.json.JsonElement) (this.getHighSpeedVideoSizes % 2 == 0 ? kotlinx.serialization.json.JsonElementKt.JsonPrimitive(p0) : kotlin.collections.MapsKt.getValue(this.getHighSpeedVideoFpsRanges, p0));
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI */
    public final /* bridge */ /* synthetic */ kotlinx.serialization.json.JsonElement getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeDecoder, kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public final void endStructure(kotlinx.serialization.descriptors.SerialDescriptor p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
    }
}
