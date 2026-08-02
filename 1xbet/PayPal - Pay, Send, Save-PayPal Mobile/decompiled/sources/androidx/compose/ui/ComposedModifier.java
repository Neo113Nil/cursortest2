package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B>\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\b\t¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u000b\u0010\fR-\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\b\t¢\u0006\u0002\b\u00068\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/ComposedModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function3;", "getHighSpeedVideoSizes", "()Lkotlin/jvm/functions/Function3;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
class ComposedModifier extends androidx.compose.ui.platform.InspectorValueInfo implements androidx.compose.ui.Modifier.Element {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposedModifier(kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function3<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.ui.Modifier> function3) {
        super(function1);
        this.getHighSpeedVideoFpsRanges = function3;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier> getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
