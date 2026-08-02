package androidx.compose.ui.text.platform;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/text/platform/ImmutableBool;", "Landroidx/compose/runtime/State;", "", "p0", "<init>", "(Z)V", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoFpsRanges", "()Ljava/lang/Boolean;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ImmutableBool implements androidx.compose.runtime.State<java.lang.Boolean> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    public ImmutableBool(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // androidx.compose.runtime.State
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean getValue() {
        return java.lang.Boolean.valueOf(this.Camera2StreamConfigurationMap);
    }
}
