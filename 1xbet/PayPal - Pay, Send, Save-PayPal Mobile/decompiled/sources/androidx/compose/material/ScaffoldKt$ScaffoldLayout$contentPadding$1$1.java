package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\tR+\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00018G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/material/ScaffoldKt$ScaffoldLayout$contentPadding$1$1;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Dp;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateLeftPadding", "calculateTopPadding-D9Ej5fM", "()F", "calculateTopPadding", "calculateRightPadding-u2uoSUM", "calculateRightPadding", "calculateBottomPadding-D9Ej5fM", "calculateBottomPadding", "<set-?>", "paddingHolder$delegate", "Landroidx/compose/runtime/MutableState;", "getPaddingHolder", "()Landroidx/compose/foundation/layout/PaddingValues;", "setPaddingHolder", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "paddingHolder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScaffoldKt$ScaffoldLayout$contentPadding$1$1 implements androidx.compose.foundation.layout.PaddingValues {

    /* renamed from: paddingHolder$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState paddingHolder = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)), null, 2, null);

    ScaffoldKt$ScaffoldLayout$contentPadding$1$1() {
    }

    public final androidx.compose.foundation.layout.PaddingValues getPaddingHolder() {
        return (androidx.compose.foundation.layout.PaddingValues) this.paddingHolder.getValue();
    }

    public final void setPaddingHolder(androidx.compose.foundation.layout.PaddingValues paddingValues) {
        this.paddingHolder.setValue(paddingValues);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public final float mo1672calculateLeftPaddingu2uoSUM(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return getPaddingHolder().mo1672calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public final float getTop() {
        return getPaddingHolder().getTop();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public final float mo1673calculateRightPaddingu2uoSUM(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        return getPaddingHolder().mo1673calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public final float getBottom() {
        return getPaddingHolder().getBottom();
    }
}
