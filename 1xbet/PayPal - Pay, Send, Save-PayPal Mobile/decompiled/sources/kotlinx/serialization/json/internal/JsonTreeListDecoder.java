package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeListDecoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "Lkotlinx/serialization/json/Json;", "p0", "Lkotlinx/serialization/json/JsonArray;", "p1", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonArray;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "elementName", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "Lkotlinx/serialization/json/JsonElement;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "getHighSpeedVideoSizes", "Lkotlinx/serialization/json/JsonArray;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class JsonTreeListDecoder extends kotlinx.serialization.json.internal.AbstractJsonTreeDecoder {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.serialization.json.JsonArray getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeListDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonArray jsonArray) {
        super(json, jsonArray, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonArray, "");
        this.getHighResolutionOutputSizeshNQ4ISI = jsonArray;
        this.getHighSpeedVideoSizes = jsonArray.size();
        this.getHighSpeedVideoFpsRanges = -1;
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public final java.lang.String elementName(kotlinx.serialization.descriptors.SerialDescriptor p0, int p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return java.lang.String.valueOf(p1);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(kotlinx.serialization.descriptors.SerialDescriptor p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        int i = this.getHighSpeedVideoFpsRanges;
        if (i >= this.getHighSpeedVideoSizes - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.getHighSpeedVideoFpsRanges = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    protected final kotlinx.serialization.json.JsonElement getHighSpeedVideoFpsRanges(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.get(java.lang.Integer.parseInt(p0));
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI */
    public final /* bridge */ /* synthetic */ kotlinx.serialization.json.JsonElement getGetHighSpeedVideoSizes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
