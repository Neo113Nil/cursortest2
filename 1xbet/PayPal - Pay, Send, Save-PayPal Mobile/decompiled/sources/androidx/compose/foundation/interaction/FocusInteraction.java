package androidx.compose.foundation.interaction;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/FocusInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", "Focus", "Unfocus"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FocusInteraction extends androidx.compose.foundation.interaction.Interaction {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "Landroidx/compose/foundation/interaction/FocusInteraction;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Focus implements androidx.compose.foundation.interaction.FocusInteraction {
        public static final int $stable = 0;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/interaction/FocusInteraction$Unfocus;", "Landroidx/compose/foundation/interaction/FocusInteraction;", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "focus", "<init>", "(Landroidx/compose/foundation/interaction/FocusInteraction$Focus;)V", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "getFocus", "()Landroidx/compose/foundation/interaction/FocusInteraction$Focus;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unfocus implements androidx.compose.foundation.interaction.FocusInteraction {
        public static final int $stable = 0;
        private final androidx.compose.foundation.interaction.FocusInteraction.Focus focus;

        public Unfocus(androidx.compose.foundation.interaction.FocusInteraction.Focus focus) {
            this.focus = focus;
        }

        public final androidx.compose.foundation.interaction.FocusInteraction.Focus getFocus() {
            return this.focus;
        }
    }
}
