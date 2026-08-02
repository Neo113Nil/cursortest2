package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 *2\u00020\u0001:\u0001*J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010!\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020\u0006H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b$\u0010\u000eR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8'X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "subscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)Landroidx/compose/foundation/text/selection/Selectable;", "", "unsubscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)V", "", "nextSelectableId", "()J", "selectableId", "notifyPositionChange", "(J)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", "startPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", "isInTouchMode", "notifySelectionUpdateStart-ubNVwUQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)V", "notifySelectionUpdateStart", "notifySelectionUpdateSelectAll", "(JZ)V", "newPosition", "previousPosition", "isStartHandle", "notifySelectionUpdate-njBpvok", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)Z", "notifySelectionUpdate", "notifySelectionUpdateEnd", "()V", "notifySelectableChange", "Landroidx/collection/LongObjectMap;", "Landroidx/compose/foundation/text/selection/Selection;", "getSubselections", "()Landroidx/collection/LongObjectMap;", "subselections", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SelectionRegistrar {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.selection.SelectionRegistrar.Companion INSTANCE = androidx.compose.foundation.text.selection.SelectionRegistrar.Companion.getHighSpeedVideoSizes;
    public static final long InvalidSelectableId = 0;

    androidx.collection.LongObjectMap<androidx.compose.foundation.text.selection.Selection> getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long selectableId);

    void notifySelectableChange(long selectableId);

    /* renamed from: notifySelectionUpdate-njBpvok, reason: not valid java name */
    boolean mo2432notifySelectionUpdatenjBpvok(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment, boolean isInTouchMode);

    void notifySelectionUpdateEnd();

    void notifySelectionUpdateSelectAll(long selectableId, boolean isInTouchMode);

    /* renamed from: notifySelectionUpdateStart-ubNVwUQ, reason: not valid java name */
    void mo2433notifySelectionUpdateStartubNVwUQ(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, long startPosition, androidx.compose.foundation.text.selection.SelectionAdjustment adjustment, boolean isInTouchMode);

    androidx.compose.foundation.text.selection.Selectable subscribe(androidx.compose.foundation.text.selection.Selectable selectable);

    void unsubscribe(androidx.compose.foundation.text.selection.Selectable selectable);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar$Companion;", "", "<init>", "()V", "", "InvalidSelectableId", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static final long InvalidSelectableId = 0;
        static final /* synthetic */ androidx.compose.foundation.text.selection.SelectionRegistrar.Companion getHighSpeedVideoSizes = new androidx.compose.foundation.text.selection.SelectionRegistrar.Companion();

        private Companion() {
        }
    }
}
