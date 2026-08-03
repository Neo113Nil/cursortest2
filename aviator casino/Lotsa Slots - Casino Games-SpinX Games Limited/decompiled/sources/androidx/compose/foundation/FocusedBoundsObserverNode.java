package androidx.compose.foundation;

/* compiled from: FocusedBounds.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007R\u001c\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsObserverNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "onPositioned", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "(Lkotlin/jvm/functions/Function1;)V", "focusBoundsObserver", "getOnPositioned", "()Lkotlin/jvm/functions/Function1;", "setOnPositioned", "parent", "getParent", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusedBoundsObserverNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.modifier.ModifierLocalModifierNode {
    public static final int $stable = 8;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> focusBoundsObserver;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> onPositioned;
    private final androidx.compose.ui.modifier.ModifierLocalMap providedValues;

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ java.lang.Object getCurrent(androidx.compose.ui.modifier.ModifierLocal modifierLocal) {
        return androidx.compose.ui.modifier.ModifierLocalModifierNode.CC.$default$getCurrent(this, modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(androidx.compose.ui.modifier.ModifierLocal modifierLocal, java.lang.Object obj) {
        androidx.compose.ui.modifier.ModifierLocalModifierNode.CC.$default$provide(this, modifierLocal, obj);
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> getOnPositioned() {
        return this.onPositioned;
    }

    public final void setOnPositioned(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> function1) {
        this.onPositioned = function1;
    }

    public FocusedBoundsObserverNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> function1) {
        this.onPositioned = function1;
        kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> function12 = new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.foundation.FocusedBoundsObserverNode$focusBoundsObserver$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                kotlin.jvm.functions.Function1 parent;
                if (androidx.compose.foundation.FocusedBoundsObserverNode.this.getIsAttached()) {
                    androidx.compose.foundation.FocusedBoundsObserverNode.this.getOnPositioned().invoke(layoutCoordinates);
                    parent = androidx.compose.foundation.FocusedBoundsObserverNode.this.getParent();
                    if (parent != null) {
                        parent.invoke(layoutCoordinates);
                    }
                }
            }
        };
        this.focusBoundsObserver = function12;
        this.providedValues = androidx.compose.ui.modifier.ModifierLocalModifierNodeKt.modifierLocalMapOf(kotlin.TuplesKt.to(androidx.compose.foundation.FocusedBoundsKt.getModifierLocalFocusedBoundsObserver(), function12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> getParent() {
        if (getIsAttached()) {
            return (kotlin.jvm.functions.Function1) getCurrent(androidx.compose.foundation.FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        }
        return null;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public androidx.compose.ui.modifier.ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }
}
