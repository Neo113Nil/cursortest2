package androidx.compose.foundation.interaction;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/HoverInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", "Enter", com.ingo.sdk.kotlin.common.analytics.IEventNames.Exit}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface HoverInteraction extends androidx.compose.foundation.interaction.Interaction {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "Landroidx/compose/foundation/interaction/HoverInteraction;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Enter implements androidx.compose.foundation.interaction.HoverInteraction {
        public static final int $stable = 0;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/interaction/HoverInteraction$Exit;", "Landroidx/compose/foundation/interaction/HoverInteraction;", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "enter", "<init>", "(Landroidx/compose/foundation/interaction/HoverInteraction$Enter;)V", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "getEnter", "()Landroidx/compose/foundation/interaction/HoverInteraction$Enter;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Exit implements androidx.compose.foundation.interaction.HoverInteraction {
        public static final int $stable = 0;
        private final androidx.compose.foundation.interaction.HoverInteraction.Enter enter;

        public Exit(androidx.compose.foundation.interaction.HoverInteraction.Enter enter) {
            this.enter = enter;
        }

        public final androidx.compose.foundation.interaction.HoverInteraction.Enter getEnter() {
            return this.enter;
        }
    }
}
