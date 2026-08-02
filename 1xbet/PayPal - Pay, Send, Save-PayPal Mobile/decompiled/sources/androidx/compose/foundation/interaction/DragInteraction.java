package androidx.compose.foundation.interaction;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", "Start", "Stop", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DragInteraction extends androidx.compose.foundation.interaction.Interaction {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Start;", "Landroidx/compose/foundation/interaction/DragInteraction;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Start implements androidx.compose.foundation.interaction.DragInteraction {
        public static final int $stable = 0;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Stop;", "Landroidx/compose/foundation/interaction/DragInteraction;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "<init>", "(Landroidx/compose/foundation/interaction/DragInteraction$Start;)V", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "getStart", "()Landroidx/compose/foundation/interaction/DragInteraction$Start;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Stop implements androidx.compose.foundation.interaction.DragInteraction {
        public static final int $stable = 0;
        private final androidx.compose.foundation.interaction.DragInteraction.Start start;

        public Stop(androidx.compose.foundation.interaction.DragInteraction.Start start) {
            this.start = start;
        }

        public final androidx.compose.foundation.interaction.DragInteraction.Start getStart() {
            return this.start;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/interaction/DragInteraction$Cancel;", "Landroidx/compose/foundation/interaction/DragInteraction;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "<init>", "(Landroidx/compose/foundation/interaction/DragInteraction$Start;)V", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "getStart", "()Landroidx/compose/foundation/interaction/DragInteraction$Start;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Cancel implements androidx.compose.foundation.interaction.DragInteraction {
        public static final int $stable = 0;
        private final androidx.compose.foundation.interaction.DragInteraction.Start start;

        public Cancel(androidx.compose.foundation.interaction.DragInteraction.Start start) {
            this.start = start;
        }

        public final androidx.compose.foundation.interaction.DragInteraction.Start getStart() {
            return this.start;
        }
    }
}
