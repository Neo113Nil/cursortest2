package androidx.compose.foundation;

/* compiled from: FocusedBounds.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/FocusedBoundsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "()V", "isFocused", "", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "observer", "Lkotlin/Function1;", "", "getObserver", "()Lkotlin/jvm/functions/Function1;", "notifyObserverWhenAttached", "onGloballyPositioned", com.ironsource.Y3.f, "setFocus", "focused", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusedBoundsNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.node.GlobalPositionAwareModifierNode {
    public static final int $stable = 8;
    private boolean isFocused;
    private androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ java.lang.Object getCurrent(androidx.compose.ui.modifier.ModifierLocal modifierLocal) {
        return androidx.compose.ui.modifier.ModifierLocalModifierNode.CC.$default$getCurrent(this, modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ androidx.compose.ui.modifier.ModifierLocalMap getProvidedValues() {
        androidx.compose.ui.modifier.ModifierLocalMap modifierLocalMap;
        modifierLocalMap = androidx.compose.ui.modifier.EmptyMap.INSTANCE;
        return modifierLocalMap;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(androidx.compose.ui.modifier.ModifierLocal modifierLocal, java.lang.Object obj) {
        androidx.compose.ui.modifier.ModifierLocalModifierNode.CC.$default$provide(this, modifierLocal, obj);
    }

    private final kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> getObserver() {
        if (getIsAttached()) {
            return (kotlin.jvm.functions.Function1) getCurrent(androidx.compose.foundation.FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        }
        return null;
    }

    public final void setFocus(boolean focused) {
        if (focused == this.isFocused) {
            return;
        }
        if (!focused) {
            kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> observer = getObserver();
            if (observer != null) {
                observer.invoke(null);
            }
        } else {
            notifyObserverWhenAttached();
        }
        this.isFocused = focused;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.layoutCoordinates = coordinates;
        if (this.isFocused) {
            if (coordinates.isAttached()) {
                notifyObserverWhenAttached();
                return;
            }
            kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> observer = getObserver();
            if (observer != null) {
                observer.invoke(null);
            }
        }
    }

    private final void notifyObserverWhenAttached() {
        kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> observer;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        if (layoutCoordinates != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates);
            if (!layoutCoordinates.isAttached() || (observer = getObserver()) == null) {
                return;
            }
            observer.invoke(this.layoutCoordinates);
        }
    }
}
