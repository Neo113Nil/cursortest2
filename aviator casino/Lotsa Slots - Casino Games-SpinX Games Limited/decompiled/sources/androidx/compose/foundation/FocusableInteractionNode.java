package androidx.compose.foundation;

/* compiled from: Focusable.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\u0014\u0010\r\u001a\u00020\b*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/FocusableInteractionNode;", "Landroidx/compose/ui/Modifier$Node;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "focusedInteraction", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "disposeInteractionSource", "", "setFocus", "isFocused", "", "update", "emitWithFallback", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FocusableInteractionNode extends androidx.compose.ui.Modifier.Node {
    private androidx.compose.foundation.interaction.FocusInteraction.Focus focusedInteraction;
    private androidx.compose.foundation.interaction.MutableInteractionSource interactionSource;

    public FocusableInteractionNode(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public final void setFocus(boolean isFocused) {
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            if (isFocused) {
                androidx.compose.foundation.interaction.FocusInteraction.Focus focus = this.focusedInteraction;
                if (focus != null) {
                    emitWithFallback(mutableInteractionSource, new androidx.compose.foundation.interaction.FocusInteraction.Unfocus(focus));
                    this.focusedInteraction = null;
                }
                androidx.compose.foundation.interaction.FocusInteraction.Focus focus2 = new androidx.compose.foundation.interaction.FocusInteraction.Focus();
                emitWithFallback(mutableInteractionSource, focus2);
                this.focusedInteraction = focus2;
                return;
            }
            androidx.compose.foundation.interaction.FocusInteraction.Focus focus3 = this.focusedInteraction;
            if (focus3 != null) {
                emitWithFallback(mutableInteractionSource, new androidx.compose.foundation.interaction.FocusInteraction.Unfocus(focus3));
                this.focusedInteraction = null;
            }
        }
    }

    public final void update(androidx.compose.foundation.interaction.MutableInteractionSource interactionSource) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.interactionSource, interactionSource)) {
            return;
        }
        disposeInteractionSource();
        this.interactionSource = interactionSource;
    }

    private final void disposeInteractionSource() {
        androidx.compose.foundation.interaction.FocusInteraction.Focus focus;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (focus = this.focusedInteraction) != null) {
            mutableInteractionSource.tryEmit(new androidx.compose.foundation.interaction.FocusInteraction.Unfocus(focus));
        }
        this.focusedInteraction = null;
    }

    private final void emitWithFallback(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.interaction.Interaction interaction) {
        if (getIsAttached()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1(mutableInteractionSource, interaction, null), 3, null);
        } else {
            mutableInteractionSource.tryEmit(interaction);
        }
    }
}
