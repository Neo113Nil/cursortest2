package androidx.compose.ui.platform;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "This API will create more invalidations of your modifier than necessary, so it's use is discouraged. Implementing the inspectableProperties method on ModifierNodeElement is the recommended zero-cost alternative to exposing properties on a Modifier to tooling.")
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000b\u001a\u00060\nR\u00020\u00008\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/platform/InspectableModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/platform/InspectableModifier$End;", "end", "Landroidx/compose/ui/platform/InspectableModifier$End;", "getEnd", "()Landroidx/compose/ui/platform/InspectableModifier$End;", "End"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InspectableModifier extends androidx.compose.ui.platform.InspectorValueInfo implements androidx.compose.ui.Modifier.Element {
    public static final int $stable = 0;
    private final androidx.compose.ui.platform.InspectableModifier.End end;

    public InspectableModifier(kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1) {
        super(function1);
        this.end = new androidx.compose.ui.platform.InspectableModifier.End();
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/InspectableModifier$End;", "Landroidx/compose/ui/Modifier$Element;", "<init>", "(Landroidx/compose/ui/platform/InspectableModifier;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class End implements androidx.compose.ui.Modifier.Element {
        public End() {
        }
    }

    public final androidx.compose.ui.platform.InspectableModifier.End getEnd() {
        return this.end;
    }
}
