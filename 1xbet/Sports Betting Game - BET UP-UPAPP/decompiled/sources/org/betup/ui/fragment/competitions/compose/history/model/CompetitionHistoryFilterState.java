package org.betup.ui.fragment.competitions.compose.history.model;

import com.ironsource.X3;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CompetitionHistoryFilterState.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryFilterState;", "", "title", "", X3.i.H0, RRWebVideoEvent.JsonKeys.SIZE, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IIII)V", "getTitle", "()I", "getIcon", "getSize", "WON", "LOST", "NOT_STARTED", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompetitionHistoryFilterState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CompetitionHistoryFilterState[] $VALUES;
    private final int icon;
    private final int size;
    private final int title;
    public static final CompetitionHistoryFilterState WON = new CompetitionHistoryFilterState("WON", 0, R.string.won, R.drawable.won_gold, 0, 4, null);
    public static final CompetitionHistoryFilterState LOST = new CompetitionHistoryFilterState("LOST", 1, R.string.lost, R.drawable.lost_gold, 0, 4, null);
    public static final CompetitionHistoryFilterState NOT_STARTED = new CompetitionHistoryFilterState("NOT_STARTED", 2, R.string.not_started, R.drawable.ic_clock, 0, 4, null);

    private static final /* synthetic */ CompetitionHistoryFilterState[] $values() {
        return new CompetitionHistoryFilterState[]{WON, LOST, NOT_STARTED};
    }

    public static EnumEntries<CompetitionHistoryFilterState> getEntries() {
        return $ENTRIES;
    }

    private CompetitionHistoryFilterState(String str, int i, int i2, int i3, int i4) {
        this.title = i2;
        this.icon = i3;
        this.size = i4;
    }

    /* synthetic */ CompetitionHistoryFilterState(String str, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, (i5 & 4) != 0 ? 0 : i4);
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getSize() {
        return this.size;
    }

    static {
        CompetitionHistoryFilterState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static CompetitionHistoryFilterState valueOf(String str) {
        return (CompetitionHistoryFilterState) Enum.valueOf(CompetitionHistoryFilterState.class, str);
    }

    public static CompetitionHistoryFilterState[] values() {
        return (CompetitionHistoryFilterState[]) $VALUES.clone();
    }
}
