package androidx.compose.foundation.content.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "getReceiveContentConfiguration", "(Landroidx/compose/ui/modifier/ModifierLocalModifierNode;)Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "ModifierLocalReceiveContent", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getModifierLocalReceiveContent", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReceiveContentConfigurationKt {
    private static final androidx.compose.ui.modifier.ProvidableModifierLocal<androidx.compose.foundation.content.internal.ReceiveContentConfiguration> ModifierLocalReceiveContent = androidx.compose.ui.modifier.ModifierLocalKt.modifierLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt.$r8$lambda$2B0TvkeTd_VrRylYopk7AnCfAtg();
        }
    });

    public static /* synthetic */ androidx.compose.foundation.content.internal.ReceiveContentConfiguration $r8$lambda$2B0TvkeTd_VrRylYopk7AnCfAtg() {
        return null;
    }

    public static final androidx.compose.ui.modifier.ProvidableModifierLocal<androidx.compose.foundation.content.internal.ReceiveContentConfiguration> getModifierLocalReceiveContent() {
        return ModifierLocalReceiveContent;
    }

    public static final androidx.compose.foundation.content.internal.ReceiveContentConfiguration getReceiveContentConfiguration(androidx.compose.ui.modifier.ModifierLocalModifierNode modifierLocalModifierNode) {
        if (modifierLocalModifierNode.getNode().getIsAttached()) {
            return (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) modifierLocalModifierNode.getCurrent(ModifierLocalReceiveContent);
        }
        return null;
    }
}
