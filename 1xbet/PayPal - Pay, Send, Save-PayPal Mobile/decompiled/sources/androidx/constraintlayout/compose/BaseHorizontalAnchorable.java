package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/constraintlayout/compose/BaseHorizontalAnchorable;", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "Landroidx/constraintlayout/core/parser/CLObject;", "containerObject", "", "index", "<init>", "(Landroidx/constraintlayout/core/parser/CLObject;I)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/ui/unit/Dp;", "margin", "goneMargin", "", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;FF)V", "linkTo", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FF)V", "", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/constraintlayout/core/parser/CLObject;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseHorizontalAnchorable implements androidx.constraintlayout.compose.HorizontalAnchorable {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.constraintlayout.core.parser.CLObject getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    public BaseHorizontalAnchorable(androidx.constraintlayout.core.parser.CLObject cLObject, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = cLObject;
        this.getHighSpeedVideoFpsRanges = androidx.constraintlayout.compose.AnchorFunctions.INSTANCE.horizontalAnchorIndexToAnchorName(i);
    }

    @Override // androidx.constraintlayout.compose.HorizontalAnchorable
    /* renamed from: linkTo-VpY3zN4, reason: not valid java name */
    public final void mo8857linkToVpY3zN4(androidx.constraintlayout.compose.ConstraintLayoutBaseScope.HorizontalAnchor anchor, float margin, float goneMargin) {
        java.lang.String horizontalAnchorIndexToAnchorName = androidx.constraintlayout.compose.AnchorFunctions.INSTANCE.horizontalAnchorIndexToAnchorName(anchor.getIndex$constraintlayout_compose_release());
        androidx.constraintlayout.core.parser.CLArray cLArray = new androidx.constraintlayout.core.parser.CLArray(new char[0]);
        cLArray.add(androidx.constraintlayout.core.parser.CLString.from(anchor.getId$constraintlayout_compose_release().toString()));
        cLArray.add(androidx.constraintlayout.core.parser.CLString.from(horizontalAnchorIndexToAnchorName));
        cLArray.add(new androidx.constraintlayout.core.parser.CLNumber(margin));
        cLArray.add(new androidx.constraintlayout.core.parser.CLNumber(goneMargin));
        this.getHighResolutionOutputSizeshNQ4ISI.put(this.getHighSpeedVideoFpsRanges, cLArray);
    }

    @Override // androidx.constraintlayout.compose.HorizontalAnchorable
    /* renamed from: linkTo-VpY3zN4, reason: not valid java name */
    public final void mo8856linkToVpY3zN4(androidx.constraintlayout.compose.ConstraintLayoutBaseScope.BaselineAnchor anchor, float margin, float goneMargin) {
        androidx.constraintlayout.core.parser.CLArray cLArray = new androidx.constraintlayout.core.parser.CLArray(new char[0]);
        cLArray.add(androidx.constraintlayout.core.parser.CLString.from(anchor.getId$constraintlayout_compose_release().toString()));
        cLArray.add(androidx.constraintlayout.core.parser.CLString.from("baseline"));
        cLArray.add(new androidx.constraintlayout.core.parser.CLNumber(margin));
        cLArray.add(new androidx.constraintlayout.core.parser.CLNumber(goneMargin));
        this.getHighResolutionOutputSizeshNQ4ISI.put(this.getHighSpeedVideoFpsRanges, cLArray);
    }
}
