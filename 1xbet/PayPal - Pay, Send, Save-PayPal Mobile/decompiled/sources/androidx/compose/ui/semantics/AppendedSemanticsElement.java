package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B(\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\b*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR+\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "", "mergeDescendants", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "Lkotlin/ExtensionFunctionType;", "properties", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "create", "()Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;", "node", "update", "(Landroidx/compose/ui/semantics/CoreSemanticsModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "getMergeDescendants", "()Z", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "semanticsConfiguration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppendedSemanticsElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.semantics.CoreSemanticsModifierNode> implements androidx.compose.ui.semantics.SemanticsModifier {
    public static final int $stable = 0;
    private final boolean mergeDescendants;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public AppendedSemanticsElement(boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> function1) {
        this.mergeDescendants = z;
        this.properties = function1;
    }

    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit> getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    public final androidx.compose.ui.semantics.SemanticsConfiguration getSemanticsConfiguration() {
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = new androidx.compose.ui.semantics.SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(this.mergeDescendants);
        this.properties.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final androidx.compose.ui.semantics.CoreSemanticsModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.ui.semantics.CoreSemanticsModifierNode(this.mergeDescendants, false, this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.semantics.CoreSemanticsModifierNode node) {
        node.setMergeDescendants(this.mergeDescendants);
        node.setProperties(this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("semantics");
        inspectorInfo.getProperties().set("mergeDescendants", java.lang.Boolean.valueOf(this.mergeDescendants));
        androidx.compose.ui.semantics.SemanticsModifierKt.Camera2StreamConfigurationMap(inspectorInfo, getSemanticsConfiguration());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.semantics.AppendedSemanticsElement)) {
            return false;
        }
        androidx.compose.ui.semantics.AppendedSemanticsElement appendedSemanticsElement = (androidx.compose.ui.semantics.AppendedSemanticsElement) other;
        return this.mergeDescendants == appendedSemanticsElement.mergeDescendants && this.properties == appendedSemanticsElement.properties;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.mergeDescendants) * 31) + this.properties.hashCode();
    }
}
