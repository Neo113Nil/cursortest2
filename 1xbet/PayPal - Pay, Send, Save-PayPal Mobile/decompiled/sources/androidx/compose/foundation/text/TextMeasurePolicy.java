package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\r*\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012"}, d2 = {"Landroidx/compose/foundation/text/TextMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function0;", "", "p0", "", "Landroidx/compose/ui/geometry/Rect;", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextMeasurePolicy implements androidx.compose.ui.layout.MeasurePolicy {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.util.List<androidx.compose.ui.geometry.Rect>> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public TextMeasurePolicy(kotlin.jvm.functions.Function0<java.lang.Boolean> function0, kotlin.jvm.functions.Function0<? extends java.util.List<androidx.compose.ui.geometry.Rect>> function02) {
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoSizes = function02;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope r20, java.util.List<? extends androidx.compose.ui.layout.Measurable> r21, long r22) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextMeasurePolicy.mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(java.util.List list, java.util.List list2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                kotlin.Pair pair = (kotlin.Pair) list.get(i);
                androidx.compose.ui.layout.Placeable.PlacementScope.m7415place70tqf50$default(placementScope, (androidx.compose.ui.layout.Placeable) pair.component1(), ((androidx.compose.ui.unit.IntOffset) pair.component2()).m8738unboximpl(), 0.0f, 2, null);
            }
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                kotlin.Pair pair2 = (kotlin.Pair) list2.get(i2);
                androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) pair2.component1();
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) pair2.component2();
                androidx.compose.ui.layout.Placeable.PlacementScope.m7415place70tqf50$default(placementScope, placeable, function0 != null ? ((androidx.compose.ui.unit.IntOffset) function0.invoke()).m8738unboximpl() : androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac(), 0.0f, 2, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
