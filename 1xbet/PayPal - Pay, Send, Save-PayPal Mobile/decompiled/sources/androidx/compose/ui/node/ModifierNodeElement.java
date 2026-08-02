package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H¦\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010 \u001a\u0004\u0018\u00010\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010#\u001a\u0004\u0018\u00010\u00138G¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8G¢\u0006\u0006\u001a\u0004\b&\u0010'"}, d2 = {"Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "N", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectableValue;", "<init>", "()V", "create", "()Landroidx/compose/ui/Modifier$Node;", "node", "", "update", "(Landroidx/compose/ui/Modifier$Node;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "_inspectorValues", "Landroidx/compose/ui/platform/InspectorInfo;", "getHighSpeedVideoSizes", "()Landroidx/compose/ui/platform/InspectorInfo;", "getHighSpeedVideoFpsRangesFor", "", "getNameFallback", "()Ljava/lang/String;", "nameFallback", "getValueOverride", "()Ljava/lang/Object;", "valueOverride", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "getInspectableElements", "()Lkotlin/sequences/Sequence;", "inspectableElements"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ModifierNodeElement<N extends androidx.compose.ui.Modifier.Node> implements androidx.compose.ui.Modifier.Element, androidx.compose.ui.platform.InspectableValue {
    public static final int $stable = 0;
    private androidx.compose.ui.platform.InspectorInfo _inspectorValues;

    public abstract N create();

    public abstract boolean equals(java.lang.Object other);

    public abstract int hashCode();

    public abstract void update(N node);

    private final androidx.compose.ui.platform.InspectorInfo getHighSpeedVideoSizes() {
        androidx.compose.ui.platform.InspectorInfo inspectorInfo = this._inspectorValues;
        if (inspectorInfo != null) {
            return inspectorInfo;
        }
        androidx.compose.ui.platform.InspectorInfo inspectorInfo2 = new androidx.compose.ui.platform.InspectorInfo();
        inspectorInfo2.setName(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getSimpleName());
        inspectableProperties(inspectorInfo2);
        this._inspectorValues = inspectorInfo2;
        return inspectorInfo2;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final java.lang.String getNameFallback() {
        return getHighSpeedVideoSizes().getName();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final java.lang.Object getValueOverride() {
        return getHighSpeedVideoSizes().getValue();
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public final kotlin.sequences.Sequence<androidx.compose.ui.platform.ValueElement> getInspectableElements() {
        return getHighSpeedVideoSizes().getProperties();
    }

    public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        androidx.compose.ui.Actual_jvmKt.tryPopulateReflectively(inspectorInfo, this);
    }
}
