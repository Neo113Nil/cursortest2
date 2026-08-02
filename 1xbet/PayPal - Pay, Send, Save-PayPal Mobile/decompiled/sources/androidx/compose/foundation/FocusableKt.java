package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "focusable", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;", "focusGroup", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FocusableKt {
    public static /* synthetic */ androidx.compose.ui.Modifier focusable$default(androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z, mutableInteractionSource);
    }

    public static final androidx.compose.ui.Modifier focusable(androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        androidx.compose.ui.Modifier.Companion companion;
        if (z) {
            companion = new androidx.compose.foundation.FocusableElement(mutableInteractionSource);
        } else {
            companion = androidx.compose.ui.Modifier.INSTANCE;
        }
        return modifier.then(companion);
    }

    public static final androidx.compose.ui.Modifier focusGroup(androidx.compose.ui.Modifier modifier) {
        return modifier.then(androidx.compose.foundation.FocusGroupElement.INSTANCE);
    }
}
