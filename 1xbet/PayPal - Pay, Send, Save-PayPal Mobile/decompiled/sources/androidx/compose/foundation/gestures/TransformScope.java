package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "", "", "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "", "transformBy-d-4ec7I", "(FJF)V", "transformBy"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TransformScope {
    /* renamed from: transformBy-d-4ec7I */
    void mo1439transformByd4ec7I(float zoomChange, long panChange, float rotationChange);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: transformBy-d-4ec7I$default, reason: not valid java name */
    static /* synthetic */ void m1548transformByd4ec7I$default(androidx.compose.foundation.gestures.TransformScope transformScope, float f, long j, float f2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            j = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        transformScope.mo1439transformByd4ec7I(f, j, f2);
    }
}
