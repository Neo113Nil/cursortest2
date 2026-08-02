package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintBaselineAnchorable;", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "Landroidx/constraintlayout/core/parser/CLObject;", "p0", "<init>", "(Landroidx/constraintlayout/core/parser/CLObject;)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "Landroidx/compose/ui/unit/Dp;", "p1", "p2", "", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;FF)V", "linkTo", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FF)V", "Camera2StreamConfigurationMap", "Landroidx/constraintlayout/core/parser/CLObject;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ConstraintBaselineAnchorable implements androidx.constraintlayout.compose.BaselineAnchorable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.constraintlayout.core.parser.CLObject getHighResolutionOutputSizeshNQ4ISI;

    public ConstraintBaselineAnchorable(androidx.constraintlayout.core.parser.CLObject cLObject) {
        this.getHighResolutionOutputSizeshNQ4ISI = cLObject;
    }

    @Override // androidx.constraintlayout.compose.BaselineAnchorable
    /* renamed from: linkTo-VpY3zN4 */
    public final void mo8861linkToVpY3zN4(androidx.constraintlayout.compose.ConstraintLayoutBaseScope.BaselineAnchor p0, float p1, float p2) {
        androidx.constraintlayout.core.parser.CLArray cLArray = new androidx.constraintlayout.core.parser.CLArray(new char[0]);
        cLArray.add(androidx.constraintlayout.core.parser.CLString.from(p0.getId$constraintlayout_compose_release().toString()));
        cLArray.add(androidx.constraintlayout.core.parser.CLString.from("baseline"));
        cLArray.add(new androidx.constraintlayout.core.parser.CLNumber(p1));
        cLArray.add(new androidx.constraintlayout.core.parser.CLNumber(p2));
        this.getHighResolutionOutputSizeshNQ4ISI.put("baseline", cLArray);
    }

    @Override // androidx.constraintlayout.compose.BaselineAnchorable
    /* renamed from: linkTo-VpY3zN4 */
    public final void mo8862linkToVpY3zN4(androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor p0, float p1, float p2) {
        java.lang.String horizontalAnchorIndexToAnchorName = androidx.constraintlayout.compose.AnchorFunctions.INSTANCE.horizontalAnchorIndexToAnchorName(p0.getIndex$constraintlayout_compose_release());
        androidx.constraintlayout.core.parser.CLArray cLArray = new androidx.constraintlayout.core.parser.CLArray(new char[0]);
        cLArray.add(androidx.constraintlayout.core.parser.CLString.from(p0.getId$constraintlayout_compose_release().toString()));
        cLArray.add(androidx.constraintlayout.core.parser.CLString.from(horizontalAnchorIndexToAnchorName));
        cLArray.add(new androidx.constraintlayout.core.parser.CLNumber(p1));
        cLArray.add(new androidx.constraintlayout.core.parser.CLNumber(p2));
        this.getHighResolutionOutputSizeshNQ4ISI.put("baseline", cLArray);
    }
}
