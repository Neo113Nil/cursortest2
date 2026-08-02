package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bR%\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/platform/InspectableValue;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "info", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/compose/ui/platform/InspectorInfo;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/ui/platform/InspectorInfo;", "", "getNameFallback", "()Ljava/lang/String;", "nameFallback", "", "getValueOverride", "()Ljava/lang/Object;", "valueOverride", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "getInspectableElements", "()Lkotlin/sequences/Sequence;", "inspectableElements"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class InspectorValueInfo implements androidx.compose.ui.platform.InspectableValue {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> getHighSpeedVideoFpsRanges;
    private androidx.compose.ui.platform.InspectorInfo getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public InspectorValueInfo(kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRanges = function1;
    }

    private final androidx.compose.ui.platform.InspectorInfo getHighResolutionOutputSizeshNQ4ISI() {
        androidx.compose.ui.platform.InspectorInfo inspectorInfo = this.getHighSpeedVideoSizes;
        if (inspectorInfo == null) {
            inspectorInfo = new androidx.compose.ui.platform.InspectorInfo();
            this.getHighSpeedVideoFpsRanges.invoke(inspectorInfo);
        }
        this.getHighSpeedVideoSizes = inspectorInfo;
        return inspectorInfo;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public java.lang.String getNameFallback() {
        return getHighResolutionOutputSizeshNQ4ISI().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public java.lang.Object getValueOverride() {
        return getHighResolutionOutputSizeshNQ4ISI().getValue();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public kotlin.sequences.Sequence<androidx.compose.ui.platform.ValueElement> getInspectableElements() {
        return getHighResolutionOutputSizeshNQ4ISI().getProperties();
    }
}
