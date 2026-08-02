package androidx.compose.foundation.interaction;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", "Press", "Release", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PressInteraction extends androidx.compose.foundation.interaction.Interaction {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction$Press;", "Landroidx/compose/foundation/interaction/PressInteraction;", "Landroidx/compose/ui/geometry/Offset;", "pressPosition", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getPressPosition-F1C5BW0", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Press implements androidx.compose.foundation.interaction.PressInteraction {
        public static final int $stable = 0;
        private final long pressPosition;

        private Press(long j) {
            this.pressPosition = j;
        }

        /* renamed from: getPressPosition-F1C5BW0, reason: not valid java name and from getter */
        public final long getPressPosition() {
            return this.pressPosition;
        }

        public /* synthetic */ Press(long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction$Release;", "Landroidx/compose/foundation/interaction/PressInteraction;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "press", "<init>", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "getPress", "()Landroidx/compose/foundation/interaction/PressInteraction$Press;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Release implements androidx.compose.foundation.interaction.PressInteraction {
        public static final int $stable = 0;
        private final androidx.compose.foundation.interaction.PressInteraction.Press press;

        public Release(androidx.compose.foundation.interaction.PressInteraction.Press press) {
            this.press = press;
        }

        public final androidx.compose.foundation.interaction.PressInteraction.Press getPress() {
            return this.press;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction$Cancel;", "Landroidx/compose/foundation/interaction/PressInteraction;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "press", "<init>", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "getPress", "()Landroidx/compose/foundation/interaction/PressInteraction$Press;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Cancel implements androidx.compose.foundation.interaction.PressInteraction {
        public static final int $stable = 0;
        private final androidx.compose.foundation.interaction.PressInteraction.Press press;

        public Cancel(androidx.compose.foundation.interaction.PressInteraction.Press press) {
            this.press = press;
        }

        public final androidx.compose.foundation.interaction.PressInteraction.Press getPress() {
            return this.press;
        }
    }
}
