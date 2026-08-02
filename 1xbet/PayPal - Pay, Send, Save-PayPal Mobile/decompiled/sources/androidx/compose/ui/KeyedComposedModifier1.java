package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001BP\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t\u0012\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0002\b\f¢\u0006\u0002\b\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/ui/KeyedComposedModifier1;", "Landroidx/compose/ui/ComposedModifier;", "", "p0", "", "p1", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p2", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class KeyedComposedModifier1 extends androidx.compose.ui.ComposedModifier {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    public KeyedComposedModifier1(java.lang.String str, java.lang.Object obj, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.ui.Modifier> function3) {
        super(function1, function3);
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.compose.ui.KeyedComposedModifier1)) {
            return false;
        }
        androidx.compose.ui.KeyedComposedModifier1 keyedComposedModifier1 = (androidx.compose.ui.KeyedComposedModifier1) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, keyedComposedModifier1.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, keyedComposedModifier1.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        int hashCode = this.Camera2StreamConfigurationMap.hashCode();
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
        return (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
    }
}
