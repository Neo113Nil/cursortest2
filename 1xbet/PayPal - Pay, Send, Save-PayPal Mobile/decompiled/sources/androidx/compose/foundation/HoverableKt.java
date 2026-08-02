package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "enabled", "hoverable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Z)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HoverableKt {
    public static /* synthetic */ androidx.compose.ui.Modifier hoverable$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hoverable(modifier, mutableInteractionSource, z);
    }

    public static final androidx.compose.ui.Modifier hoverable(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z) {
        return modifier.then(z ? new androidx.compose.foundation.HoverableElement(mutableInteractionSource) : androidx.compose.ui.Modifier.INSTANCE);
    }
}
