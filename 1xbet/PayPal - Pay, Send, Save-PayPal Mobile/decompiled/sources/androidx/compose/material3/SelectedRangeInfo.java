package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo;", "", "Landroidx/compose/ui/unit/IntOffset;", "gridStartCoordinates", "gridEndCoordinates", "", "firstIsSelectionStart", "lastIsSelectionEnd", "<init>", "(JJZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getGridStartCoordinates-nOcc-ac", "()J", "getGridEndCoordinates-nOcc-ac", "Z", "getFirstIsSelectionStart", "()Z", "getLastIsSelectionEnd", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectedRangeInfo {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.SelectedRangeInfo.Companion INSTANCE = new androidx.compose.material3.SelectedRangeInfo.Companion(null);
    private final boolean firstIsSelectionStart;
    private final long gridEndCoordinates;
    private final long gridStartCoordinates;
    private final boolean lastIsSelectionEnd;

    private SelectedRangeInfo(long j, long j2, boolean z, boolean z2) {
        this.gridStartCoordinates = j;
        this.gridEndCoordinates = j2;
        this.firstIsSelectionStart = z;
        this.lastIsSelectionEnd = z2;
    }

    /* renamed from: getGridStartCoordinates-nOcc-ac, reason: not valid java name and from getter */
    public final long getGridStartCoordinates() {
        return this.gridStartCoordinates;
    }

    /* renamed from: getGridEndCoordinates-nOcc-ac, reason: not valid java name and from getter */
    public final long getGridEndCoordinates() {
        return this.gridEndCoordinates;
    }

    public final boolean getFirstIsSelectionStart() {
        return this.firstIsSelectionStart;
    }

    public final boolean getLastIsSelectionEnd() {
        return this.lastIsSelectionEnd;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/internal/CalendarMonth;", "month", "Landroidx/compose/material3/internal/CalendarDate;", "startDate", "endDate", "Landroidx/compose/material3/SelectedRangeInfo;", "calculateRangeInfo", "(Landroidx/compose/material3/internal/CalendarMonth;Landroidx/compose/material3/internal/CalendarDate;Landroidx/compose/material3/internal/CalendarDate;)Landroidx/compose/material3/SelectedRangeInfo;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.material3.SelectedRangeInfo calculateRangeInfo(androidx.compose.material3.internal.CalendarMonth month, androidx.compose.material3.internal.CalendarDate startDate, androidx.compose.material3.internal.CalendarDate endDate) {
            int daysFromStartOfWeekToFirstOfMonth;
            int daysFromStartOfWeekToFirstOfMonth2;
            if (startDate.getUtcTimeMillis() > month.getEndUtcTimeMillis() || endDate.getUtcTimeMillis() < month.getStartUtcTimeMillis()) {
                return null;
            }
            boolean z = startDate.getUtcTimeMillis() >= month.getStartUtcTimeMillis();
            boolean z2 = endDate.getUtcTimeMillis() <= month.getEndUtcTimeMillis();
            if (z) {
                daysFromStartOfWeekToFirstOfMonth = (month.getDaysFromStartOfWeekToFirstOfMonth() + startDate.getDayOfMonth()) - 1;
            } else {
                daysFromStartOfWeekToFirstOfMonth = month.getDaysFromStartOfWeekToFirstOfMonth();
            }
            if (z2) {
                daysFromStartOfWeekToFirstOfMonth2 = (month.getDaysFromStartOfWeekToFirstOfMonth() + endDate.getDayOfMonth()) - 1;
            } else {
                daysFromStartOfWeekToFirstOfMonth2 = (month.getDaysFromStartOfWeekToFirstOfMonth() + month.getNumberOfDays()) - 1;
            }
            return new androidx.compose.material3.SelectedRangeInfo(androidx.compose.ui.unit.IntOffset.m8723constructorimpl(((daysFromStartOfWeekToFirstOfMonth / 7) & 4294967295L) | ((daysFromStartOfWeekToFirstOfMonth % 7) << 32)), androidx.compose.ui.unit.IntOffset.m8723constructorimpl(((daysFromStartOfWeekToFirstOfMonth2 / 7) & 4294967295L) | ((daysFromStartOfWeekToFirstOfMonth2 % 7) << 32)), z, z2, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SelectedRangeInfo(long j, long j2, boolean z, boolean z2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, z, z2);
    }
}
