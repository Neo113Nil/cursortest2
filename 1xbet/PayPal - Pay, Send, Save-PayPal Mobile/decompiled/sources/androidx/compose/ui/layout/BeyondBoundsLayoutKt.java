package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001f\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "ModifierLocalBeyondBoundsLayout", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalBeyondBoundsLayout", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BeyondBoundsLayoutKt {
    private static final androidx.compose.ui.modifier.ProvidableModifierLocal<androidx.compose.ui.layout.BeyondBoundsLayout> ModifierLocalBeyondBoundsLayout = androidx.compose.ui.modifier.ModifierLocalKt.modifierLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.layout.BeyondBoundsLayout>() { // from class: androidx.compose.ui.layout.BeyondBoundsLayoutKt$ModifierLocalBeyondBoundsLayout$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.layout.BeyondBoundsLayout invoke() {
            return null;
        }
    });

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Please use DelegatableNode.findNearestBeyondBoundsLayoutAncestor() to access the nearest parent BeyondBoundsLayout.")
    public static final androidx.compose.ui.modifier.ProvidableModifierLocal<androidx.compose.ui.layout.BeyondBoundsLayout> getModifierLocalBeyondBoundsLayout() {
        return ModifierLocalBeyondBoundsLayout;
    }
}
