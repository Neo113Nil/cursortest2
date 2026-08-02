package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\r\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeMapEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "Lkotlinx/serialization/json/Json;", "p0", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "p1", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "Camera2StreamConfigurationMap", "()Lkotlinx/serialization/json/JsonElement;", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "", "getHighSpeedVideoFpsRanges", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class JsonTreeMapEncoder extends kotlinx.serialization.json.internal.JsonTreeEncoder {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeMapEncoder(kotlinx.serialization.json.Json json, kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonElement, kotlin.Unit> function1) {
        super(json, function1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.Camera2StreamConfigurationMap = true;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeEncoder, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, kotlinx.serialization.json.JsonElement p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        if (this.Camera2StreamConfigurationMap) {
            if (p1 instanceof kotlinx.serialization.json.JsonPrimitive) {
                this.getHighSpeedVideoFpsRangesFor = ((kotlinx.serialization.json.JsonPrimitive) p1).getContent();
                this.Camera2StreamConfigurationMap = false;
                return;
            } else {
                if (p1 instanceof kotlinx.serialization.json.JsonObject) {
                    throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidKeyKindException(kotlinx.serialization.json.JsonObjectSerializer.INSTANCE.getDescriptor());
                }
                if (!(p1 instanceof kotlinx.serialization.json.JsonArray)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                throw kotlinx.serialization.json.internal.JsonExceptionsKt.InvalidKeyKindException(kotlinx.serialization.json.JsonArraySerializer.INSTANCE.getDescriptor());
            }
        }
        java.util.Map<java.lang.String, kotlinx.serialization.json.JsonElement> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        if (str == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        highResolutionOutputSizeshNQ4ISI.put(str, p1);
        this.Camera2StreamConfigurationMap = true;
    }

    @Override // kotlinx.serialization.json.internal.JsonTreeEncoder, kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public final kotlinx.serialization.json.JsonElement Camera2StreamConfigurationMap() {
        return new kotlinx.serialization.json.JsonObject(getHighResolutionOutputSizeshNQ4ISI());
    }
}
