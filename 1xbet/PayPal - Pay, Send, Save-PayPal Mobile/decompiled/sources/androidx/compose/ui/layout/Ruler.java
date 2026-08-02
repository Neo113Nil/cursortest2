package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B*\b\u0004\u0012\u001f\u0010\u0006\u001a\u001b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH ¢\u0006\u0004\b\r\u0010\u000eR3\u0010\u000f\u001a\u001b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0002\u0013\u0014"}, d2 = {"Landroidx/compose/ui/layout/Ruler;", "", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "coordinate", "Landroidx/compose/ui/layout/LayoutCoordinates;", "sourceCoordinates", "targetCoordinates", "calculateCoordinate$ui", "(FLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)F", "calculate", "Lkotlin/jvm/functions/Function2;", "getCalculate$ui", "()Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/layout/HorizontalRuler;", "Landroidx/compose/ui/layout/VerticalRuler;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Ruler {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.layout.Placeable.PlacementScope, java.lang.Float, java.lang.Float> calculate;

    public abstract float calculateCoordinate$ui(float coordinate, androidx.compose.ui.layout.LayoutCoordinates sourceCoordinates, androidx.compose.ui.layout.LayoutCoordinates targetCoordinates);

    /* JADX WARN: Multi-variable type inference failed */
    private Ruler(kotlin.jvm.functions.Function2<? super androidx.compose.ui.layout.Placeable.PlacementScope, ? super java.lang.Float, java.lang.Float> function2) {
        this.calculate = function2;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.ui.layout.Placeable.PlacementScope, java.lang.Float, java.lang.Float> getCalculate$ui() {
        return this.calculate;
    }

    public /* synthetic */ Ruler(kotlin.jvm.functions.Function2 function2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }
}
