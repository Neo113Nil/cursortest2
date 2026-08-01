package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusRequesterModifier.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bJ\u0014\u0010\u0016\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\bJ\u0014\u0010\u001d\u001a\u00020\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Landroidx/compose/ui/focus/FocusRequester;)V", "focusModifiers", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/focus/FocusModifier;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "parent", "value", "getValue", "()Landroidx/compose/ui/focus/FocusRequesterModifierLocal;", "addFocusModifier", "", "focusModifier", "addFocusModifiers", "newModifiers", "findFocusNode", "onModifierLocalsUpdated", "scope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "removeFocusModifier", "removeFocusModifiers", "removedModifiers", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusRequesterModifierLocal implements ModifierLocalConsumer, ModifierLocalProvider<FocusRequesterModifierLocal> {
    private final MutableVector<FocusModifier> focusModifiers;
    private final FocusRequester focusRequester;
    private FocusRequesterModifierLocal parent;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public FocusRequesterModifierLocal getValue() {
        return this;
    }

    public FocusRequesterModifierLocal(FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        this.focusRequester = focusRequester;
        this.focusModifiers = new MutableVector<>(new FocusModifier[16], 0);
        focusRequester.getFocusRequesterModifierLocals$ui_release().add(this);
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        FocusRequesterModifierLocal focusRequesterModifierLocal = (FocusRequesterModifierLocal) scope.getCurrent(FocusRequesterModifierKt.getModifierLocalFocusRequester());
        if (Intrinsics.areEqual(focusRequesterModifierLocal, this.parent)) {
            return;
        }
        FocusRequesterModifierLocal focusRequesterModifierLocal2 = this.parent;
        if (focusRequesterModifierLocal2 != null) {
            focusRequesterModifierLocal2.removeFocusModifiers(this.focusModifiers);
        }
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.addFocusModifiers(this.focusModifiers);
        }
        this.parent = focusRequesterModifierLocal;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<FocusRequesterModifierLocal> getKey() {
        return FocusRequesterModifierKt.getModifierLocalFocusRequester();
    }

    public final void addFocusModifier(FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.focusModifiers.add(focusModifier);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.addFocusModifier(focusModifier);
        }
    }

    public final void addFocusModifiers(MutableVector<FocusModifier> newModifiers) {
        Intrinsics.checkNotNullParameter(newModifiers, "newModifiers");
        MutableVector<FocusModifier> mutableVector = this.focusModifiers;
        mutableVector.addAll(mutableVector.getSize(), newModifiers);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.addFocusModifiers(newModifiers);
        }
    }

    public final void removeFocusModifier(FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.focusModifiers.remove(focusModifier);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.removeFocusModifier(focusModifier);
        }
    }

    public final void removeFocusModifiers(MutableVector<FocusModifier> removedModifiers) {
        Intrinsics.checkNotNullParameter(removedModifiers, "removedModifiers");
        this.focusModifiers.removeAll(removedModifiers);
        FocusRequesterModifierLocal focusRequesterModifierLocal = this.parent;
        if (focusRequesterModifierLocal != null) {
            focusRequesterModifierLocal.removeFocusModifiers(removedModifiers);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r7.indexOf(r5) < r7.indexOf(r6)) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FocusModifier findFocusNode() {
        LayoutNodeWrapper layoutNodeWrapper;
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        MutableVector<FocusModifier> mutableVector = this.focusModifiers;
        FocusModifier focusModifier = null;
        int size = mutableVector.getSize();
        if (size > 0) {
            FocusModifier[] content = mutableVector.getContent();
            int i = 0;
            do {
                FocusModifier focusModifier2 = content[i];
                if (focusModifier != null && (layoutNodeWrapper = focusModifier.getLayoutNodeWrapper()) != null && (layoutNode = layoutNodeWrapper.getLayoutNode()) != null) {
                    LayoutNodeWrapper layoutNodeWrapper2 = focusModifier2.getLayoutNodeWrapper();
                    if (layoutNodeWrapper2 != null && (layoutNode2 = layoutNodeWrapper2.getLayoutNode()) != null) {
                        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
                            layoutNode = layoutNode.getParent$ui_release();
                            Intrinsics.checkNotNull(layoutNode);
                        }
                        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
                            layoutNode2 = layoutNode2.getParent$ui_release();
                            Intrinsics.checkNotNull(layoutNode2);
                        }
                        while (!Intrinsics.areEqual(layoutNode.getParent$ui_release(), layoutNode2.getParent$ui_release())) {
                            layoutNode = layoutNode.getParent$ui_release();
                            Intrinsics.checkNotNull(layoutNode);
                            layoutNode2 = layoutNode2.getParent$ui_release();
                            Intrinsics.checkNotNull(layoutNode2);
                        }
                        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                        Intrinsics.checkNotNull(parent$ui_release);
                        MutableVector<LayoutNode> mutableVector2 = parent$ui_release.get_children$ui_release();
                    }
                    i++;
                }
                focusModifier = focusModifier2;
                i++;
            } while (i < size);
        }
        return focusModifier;
    }
}
