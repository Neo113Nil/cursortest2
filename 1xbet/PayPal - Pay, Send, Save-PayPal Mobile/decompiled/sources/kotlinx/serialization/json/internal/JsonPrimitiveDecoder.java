package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000e\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPrimitiveDecoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "Lkotlinx/serialization/json/Json;", "p0", "Lkotlinx/serialization/json/JsonElement;", "p1", "", "p2", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "decodeElementIndex", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/json/JsonElement;", "getHighResolutionOutputSizeshNQ4ISI", "()Lkotlinx/serialization/json/JsonElement;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class JsonPrimitiveDecoder extends kotlinx.serialization.json.internal.AbstractJsonTreeDecoder {
    private final kotlinx.serialization.json.JsonElement getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonPrimitiveDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonElement jsonElement, java.lang.String str) {
        super(json, jsonElement, str, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonElement, "");
        this.getHighSpeedVideoFpsRanges = jsonElement;
        pushTag(kotlinx.serialization.json.internal.TreeJsonEncoderKt.PRIMITIVE_TAG);
    }

    public /* synthetic */ JsonPrimitiveDecoder(kotlinx.serialization.json.Json json, kotlinx.serialization.json.JsonElement jsonElement, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(json, jsonElement, (i & 4) != 0 ? null : str);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final kotlinx.serialization.json.JsonElement getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    protected final kotlinx.serialization.json.JsonElement getHighSpeedVideoFpsRanges(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        if (p0 != kotlinx.serialization.json.internal.TreeJsonEncoderKt.PRIMITIVE_TAG) {
            throw new java.lang.IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int decodeElementIndex(kotlinx.serialization.descriptors.SerialDescriptor p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return 0;
    }
}
