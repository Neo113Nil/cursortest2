package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/VerticalAnchorable;", "", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/ui/unit/Dp;", "margin", "goneMargin", "", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FF)V", "linkTo"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface VerticalAnchorable {
    /* renamed from: linkTo-VpY3zN4 */
    void mo8858linkToVpY3zN4(androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor anchor, float margin, float goneMargin);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* renamed from: linkTo-VpY3zN4$default, reason: not valid java name */
    static /* synthetic */ void m9045linkToVpY3zN4$default(androidx.constraintlayout.compose.VerticalAnchorable verticalAnchorable, androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, float f, float f2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
        if ((i & 2) != 0) {
            f = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        verticalAnchorable.mo8858linkToVpY3zN4(verticalAnchor, f, f2);
    }
}
