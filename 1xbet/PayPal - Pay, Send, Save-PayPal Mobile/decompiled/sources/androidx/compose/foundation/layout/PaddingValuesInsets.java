package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/foundation/layout/PaddingValues;", "p0", "<init>", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "p1", "", "getLeft", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;)I", "getTop", "(Landroidx/compose/ui/unit/Density;)I", "getRight", "getBottom", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/layout/PaddingValues;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PaddingValuesInsets implements androidx.compose.foundation.layout.WindowInsets {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.layout.PaddingValues Camera2StreamConfigurationMap;

    public PaddingValuesInsets(androidx.compose.foundation.layout.PaddingValues paddingValues) {
        this.Camera2StreamConfigurationMap = paddingValues;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getLeft(androidx.compose.ui.unit.Density p0, androidx.compose.ui.unit.LayoutDirection p1) {
        return p0.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap.mo1672calculateLeftPaddingu2uoSUM(p1));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getTop(androidx.compose.ui.unit.Density p0) {
        return p0.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap.getTop());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getRight(androidx.compose.ui.unit.Density p0, androidx.compose.ui.unit.LayoutDirection p1) {
        return p0.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap.mo1673calculateRightPaddingu2uoSUM(p1));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int getBottom(androidx.compose.ui.unit.Density p0) {
        return p0.mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap.getBottom());
    }

    public final java.lang.String toString() {
        androidx.compose.ui.unit.LayoutDirection layoutDirection = androidx.compose.ui.unit.LayoutDirection.Ltr;
        float mo1672calculateLeftPaddingu2uoSUM = this.Camera2StreamConfigurationMap.mo1672calculateLeftPaddingu2uoSUM(layoutDirection);
        float top = this.Camera2StreamConfigurationMap.getTop();
        float mo1673calculateRightPaddingu2uoSUM = this.Camera2StreamConfigurationMap.mo1673calculateRightPaddingu2uoSUM(layoutDirection);
        float bottom = this.Camera2StreamConfigurationMap.getBottom();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaddingValues(");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(mo1672calculateLeftPaddingu2uoSUM));
        sb.append(", ");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(top));
        sb.append(", ");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(mo1673calculateRightPaddingu2uoSUM));
        sb.append(", ");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(bottom));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof androidx.compose.foundation.layout.PaddingValuesInsets) {
            return kotlin.jvm.internal.Intrinsics.areEqual(((androidx.compose.foundation.layout.PaddingValuesInsets) p0).Camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap);
        }
        return false;
    }

    public final int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }
}
