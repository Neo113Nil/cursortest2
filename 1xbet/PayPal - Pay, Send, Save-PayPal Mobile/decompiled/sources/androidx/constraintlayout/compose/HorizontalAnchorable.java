package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/HorizontalAnchorable;", "", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/ui/unit/Dp;", "margin", "goneMargin", "", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;FF)V", "linkTo", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FF)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface HorizontalAnchorable {
    /* renamed from: linkTo-VpY3zN4 */
    void mo8856linkToVpY3zN4(androidx.constraintlayout.compose.ConstraintLayoutBaseScope.BaselineAnchor anchor, float margin, float goneMargin);

    /* renamed from: linkTo-VpY3zN4 */
    void mo8857linkToVpY3zN4(androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor anchor, float margin, float goneMargin);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: linkTo-VpY3zN4$default, reason: not valid java name */
    static /* synthetic */ void m8964linkToVpY3zN4$default(androidx.constraintlayout.compose.HorizontalAnchorable horizontalAnchorable, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, float f, float f2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
        if ((i & 2) != 0) {
            f = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        horizontalAnchorable.mo8857linkToVpY3zN4(horizontalAnchor, f, f2);
    }

    /* renamed from: linkTo-VpY3zN4$default, reason: not valid java name */
    static /* synthetic */ void m8963linkToVpY3zN4$default(androidx.constraintlayout.compose.HorizontalAnchorable horizontalAnchorable, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.BaselineAnchor baselineAnchor, float f, float f2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
        if ((i & 2) != 0) {
            f = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        horizontalAnchorable.mo8856linkToVpY3zN4(baselineAnchor, f, f2);
    }
}
