package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/constraintlayout/compose/BaseVerticalAnchorable;", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "Landroidx/constraintlayout/core/parser/CLObject;", "containerObject", "", "index", "<init>", "(Landroidx/constraintlayout/core/parser/CLObject;I)V", "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/ui/unit/Dp;", "margin", "goneMargin", "", "linkTo-VpY3zN4", "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FF)V", "linkTo", "", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/constraintlayout/core/parser/CLObject;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseVerticalAnchorable implements androidx.constraintlayout.compose.VerticalAnchorable {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.constraintlayout.core.parser.CLObject Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    public BaseVerticalAnchorable(androidx.constraintlayout.core.parser.CLObject cLObject, int i) {
        this.Camera2StreamConfigurationMap = cLObject;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.constraintlayout.compose.AnchorFunctions.INSTANCE.verticalAnchorIndexToAnchorName(i);
    }

    @Override // androidx.constraintlayout.compose.VerticalAnchorable
    /* renamed from: linkTo-VpY3zN4, reason: not valid java name */
    public final void mo8858linkToVpY3zN4(androidx.constraintlayout.compose.ConstraintLayoutBaseScope.VerticalAnchor anchor, float margin, float goneMargin) {
        java.lang.String verticalAnchorIndexToAnchorName = androidx.constraintlayout.compose.AnchorFunctions.INSTANCE.verticalAnchorIndexToAnchorName(anchor.getIndex$constraintlayout_compose_release());
        androidx.constraintlayout.core.parser.CLArray cLArray = new androidx.constraintlayout.core.parser.CLArray(new char[0]);
        cLArray.add(androidx.constraintlayout.core.parser.CLString.from(anchor.getId$constraintlayout_compose_release().toString()));
        cLArray.add(androidx.constraintlayout.core.parser.CLString.from(verticalAnchorIndexToAnchorName));
        cLArray.add(new androidx.constraintlayout.core.parser.CLNumber(margin));
        cLArray.add(new androidx.constraintlayout.core.parser.CLNumber(goneMargin));
        this.Camera2StreamConfigurationMap.put(this.getHighResolutionOutputSizeshNQ4ISI, cLArray);
    }
}
