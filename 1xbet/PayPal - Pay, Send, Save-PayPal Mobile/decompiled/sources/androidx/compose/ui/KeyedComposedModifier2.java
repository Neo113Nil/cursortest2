package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001BZ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n\u0012\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\b\r¢\u0006\u0002\b\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b"}, d2 = {"Landroidx/compose/ui/KeyedComposedModifier2;", "Landroidx/compose/ui/ComposedModifier;", "", "p0", "", "p1", "p2", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p3", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class KeyedComposedModifier2 extends androidx.compose.ui.ComposedModifier {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    public KeyedComposedModifier2(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.ui.Modifier> function3) {
        super(function1, function3);
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes = obj2;
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.compose.ui.KeyedComposedModifier2)) {
            return false;
        }
        androidx.compose.ui.KeyedComposedModifier2 keyedComposedModifier2 = (androidx.compose.ui.KeyedComposedModifier2) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, keyedComposedModifier2.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, keyedComposedModifier2.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, keyedComposedModifier2.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        int hashCode = this.Camera2StreamConfigurationMap.hashCode();
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges;
        int hashCode2 = obj != null ? obj.hashCode() : 0;
        java.lang.Object obj2 = this.getHighSpeedVideoSizes;
        return (((hashCode * 31) + hashCode2) * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }
}
