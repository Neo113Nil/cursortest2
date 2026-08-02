package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlinx/serialization/json/internal/JsonElementMarker;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "", "mark$kotlinx_serialization_json", "(I)V", "nextUnmarkedIndex$kotlinx_serialization_json", "()I", "Lkotlinx/serialization/internal/ElementMarker;", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/internal/ElementMarker;", "getHighSpeedVideoFpsRanges", "", "p0", "isUnmarkedNull", "Z", "isUnmarkedNull$kotlinx_serialization_json", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonElementMarker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.serialization.internal.ElementMarker getHighSpeedVideoFpsRanges;
    private boolean isUnmarkedNull;

    public JsonElementMarker(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        this.getHighSpeedVideoFpsRanges = new kotlinx.serialization.internal.ElementMarker(serialDescriptor, new kotlinx.serialization.json.internal.JsonElementMarker$origin$1(this));
    }

    /* renamed from: isUnmarkedNull$kotlinx_serialization_json, reason: from getter */
    public final boolean getIsUnmarkedNull() {
        return this.isUnmarkedNull;
    }

    public final void mark$kotlinx_serialization_json(int index) {
        this.getHighSpeedVideoFpsRanges.mark(index);
    }

    public final int nextUnmarkedIndex$kotlinx_serialization_json() {
        return this.getHighSpeedVideoFpsRanges.nextUnmarkedIndex();
    }

    public static final /* synthetic */ boolean access$readIfAbsent(kotlinx.serialization.json.internal.JsonElementMarker jsonElementMarker, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i) {
        boolean z = !serialDescriptor.isElementOptional(i) && serialDescriptor.getElementDescriptor(i).isNullable();
        jsonElementMarker.isUnmarkedNull = z;
        return z;
    }
}
