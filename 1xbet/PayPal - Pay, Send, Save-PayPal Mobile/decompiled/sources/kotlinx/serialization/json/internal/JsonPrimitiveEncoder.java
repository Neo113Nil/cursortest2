package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPrimitiveEncoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "Lkotlinx/serialization/json/Json;", "p0", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "p1", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "Camera2StreamConfigurationMap", "()Lkotlinx/serialization/json/JsonElement;", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/json/JsonElement;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class JsonPrimitiveEncoder extends kotlinx.serialization.json.internal.AbstractJsonTreeEncoder {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlinx.serialization.json.JsonElement getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonPrimitiveEncoder(kotlinx.serialization.json.Json json, kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonElement, kotlin.Unit> function1) {
        super(json, function1, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        pushTag(kotlinx.serialization.json.internal.TreeJsonEncoderKt.PRIMITIVE_TAG);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, kotlinx.serialization.json.JsonElement p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        if (p0 != kotlinx.serialization.json.internal.TreeJsonEncoderKt.PRIMITIVE_TAG) {
            throw new java.lang.IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
        }
        if (this.getHighSpeedVideoSizes != null) {
            throw new java.lang.IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
        }
        this.getHighSpeedVideoSizes = p1;
        getHighSpeedVideoFpsRanges().invoke(p1);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public final kotlinx.serialization.json.JsonElement Camera2StreamConfigurationMap() {
        kotlinx.serialization.json.JsonElement jsonElement = this.getHighSpeedVideoSizes;
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new java.lang.IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
    }
}
