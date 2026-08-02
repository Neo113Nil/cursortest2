package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001BX\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n\u0012\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0002\b\r¢\u0006\u0002\b\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/KeyedComposedModifierN;", "Landroidx/compose/ui/ComposedModifier;", "", "p0", "", "", "p1", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p2", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "p3", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "[Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class KeyedComposedModifierN extends androidx.compose.ui.ComposedModifier {
    private final java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    public KeyedComposedModifierN(java.lang.String str, java.lang.Object[] objArr, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.ui.Modifier> function3) {
        super(function1, function3);
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = objArr;
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.compose.ui.KeyedComposedModifierN)) {
            return false;
        }
        androidx.compose.ui.KeyedComposedModifierN keyedComposedModifierN = (androidx.compose.ui.KeyedComposedModifierN) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, keyedComposedModifierN.getHighSpeedVideoSizes) && java.util.Arrays.equals(this.getHighResolutionOutputSizeshNQ4ISI, keyedComposedModifierN.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoSizes.hashCode() * 31) + java.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
