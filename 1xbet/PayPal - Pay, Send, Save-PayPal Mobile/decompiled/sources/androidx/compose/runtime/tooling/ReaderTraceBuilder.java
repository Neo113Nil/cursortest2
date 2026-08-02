package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/runtime/tooling/ReaderTraceBuilder;", "Landroidx/compose/runtime/tooling/ComposeStackTraceBuilder;", "Landroidx/compose/runtime/SlotReader;", "reader", "<init>", "(Landroidx/compose/runtime/SlotReader;)V", "Landroidx/compose/runtime/Anchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "Landroidx/compose/runtime/GroupSourceInformation;", "sourceInformationOf", "(Landroidx/compose/runtime/Anchor;)Landroidx/compose/runtime/GroupSourceInformation;", "", "groupKeyOf", "(Landroidx/compose/runtime/Anchor;)I", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/SlotReader;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReaderTraceBuilder extends androidx.compose.runtime.tooling.ComposeStackTraceBuilder {
    public static final int $stable = 8;
    private final androidx.compose.runtime.SlotReader getHighSpeedVideoFpsRangesFor;

    public ReaderTraceBuilder(androidx.compose.runtime.SlotReader slotReader) {
        this.getHighSpeedVideoFpsRangesFor = slotReader;
    }

    @Override // androidx.compose.runtime.tooling.ComposeStackTraceBuilder
    public final androidx.compose.runtime.GroupSourceInformation sourceInformationOf(androidx.compose.runtime.Anchor anchor) {
        return this.getHighSpeedVideoFpsRangesFor.getTable().sourceInformationOf(this.getHighSpeedVideoFpsRangesFor.getTable().anchorIndex(anchor));
    }

    @Override // androidx.compose.runtime.tooling.ComposeStackTraceBuilder
    public final int groupKeyOf(androidx.compose.runtime.Anchor anchor) {
        androidx.compose.runtime.SlotReader slotReader = this.getHighSpeedVideoFpsRangesFor;
        return slotReader.groupKey(slotReader.getTable().anchorIndex(anchor));
    }
}
