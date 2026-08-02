package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0013j\b\u0012\u0004\u0012\u00020\u0005`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeListEncoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "Lkotlinx/serialization/json/Json;", "p0", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "p1", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "elementName", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "Camera2StreamConfigurationMap", "()Lkotlinx/serialization/json/JsonElement;", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "Ljava/util/ArrayList;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class JsonTreeListEncoder extends kotlinx.serialization.json.internal.AbstractJsonTreeEncoder {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.ArrayList<kotlinx.serialization.json.JsonElement> getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeListEncoder(kotlinx.serialization.json.Json json, kotlin.jvm.functions.Function1<? super kotlinx.serialization.json.JsonElement, kotlin.Unit> function1) {
        super(json, function1, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = new java.util.ArrayList<>();
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder, kotlinx.serialization.internal.NamedValueEncoder
    public final java.lang.String elementName(kotlinx.serialization.descriptors.SerialDescriptor p0, int p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return java.lang.String.valueOf(p1);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0, kotlinx.serialization.json.JsonElement p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        this.getHighSpeedVideoSizes.add(java.lang.Integer.parseInt(p0), p1);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public final kotlinx.serialization.json.JsonElement Camera2StreamConfigurationMap() {
        return new kotlinx.serialization.json.JsonArray(this.getHighSpeedVideoSizes);
    }
}
