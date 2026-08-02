package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001Bd\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u0012\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b"}, d2 = {"Landroidx/compose/ui/KeyedComposedModifier3;", "Landroidx/compose/ui/ComposedModifier;", "", "p0", "", "p1", "p2", "p3", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p4", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class KeyedComposedModifier3 extends androidx.compose.ui.ComposedModifier {
    private final java.lang.Object Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes;

    public KeyedComposedModifier3(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.ui.Modifier> function3) {
        super(function1, function3);
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap = obj2;
        this.getHighSpeedVideoSizes = obj3;
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.compose.ui.KeyedComposedModifier3)) {
            return false;
        }
        androidx.compose.ui.KeyedComposedModifier3 keyedComposedModifier3 = (androidx.compose.ui.KeyedComposedModifier3) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, keyedComposedModifier3.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, keyedComposedModifier3.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, keyedComposedModifier3.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, keyedComposedModifier3.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRanges.hashCode();
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        int hashCode2 = obj != null ? obj.hashCode() : 0;
        java.lang.Object obj2 = this.Camera2StreamConfigurationMap;
        int hashCode3 = obj2 != null ? obj2.hashCode() : 0;
        java.lang.Object obj3 = this.getHighSpeedVideoSizes;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (obj3 != null ? obj3.hashCode() : 0);
    }
}
