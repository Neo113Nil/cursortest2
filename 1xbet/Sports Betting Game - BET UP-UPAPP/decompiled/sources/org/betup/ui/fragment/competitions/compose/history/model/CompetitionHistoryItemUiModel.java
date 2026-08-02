package org.betup.ui.fragment.competitions.compose.history.model;

import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionHistoryItemUiModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001J\u0013\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\nHÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019¨\u0006+"}, d2 = {"Lorg/betup/ui/fragment/competitions/compose/history/model/CompetitionHistoryItemUiModel;", "", "id", "", "competitionId", "date", "", "time", "title", "score", "", X3.i.l, "isWin", "", "state", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZI)V", "getId", "()J", "getCompetitionId", "getDate", "()Ljava/lang/String;", "getTime", "getTitle", "getScore", "()I", "getTotal", "()Z", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CompetitionHistoryItemUiModel {
    public static final int $stable = 0;
    private final long competitionId;
    private final String date;
    private final long id;
    private final boolean isWin;
    private final int score;
    private final int state;
    private final String time;
    private final String title;
    private final int total;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCompetitionId() {
        return this.competitionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* renamed from: component7, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsWin() {
        return this.isWin;
    }

    /* renamed from: component9, reason: from getter */
    public final int getState() {
        return this.state;
    }

    public final CompetitionHistoryItemUiModel copy(long id, long competitionId, String date, String time, String title, int score, int total, boolean isWin, int state) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(title, "title");
        return new CompetitionHistoryItemUiModel(id, competitionId, date, time, title, score, total, isWin, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetitionHistoryItemUiModel)) {
            return false;
        }
        CompetitionHistoryItemUiModel competitionHistoryItemUiModel = (CompetitionHistoryItemUiModel) other;
        return this.id == competitionHistoryItemUiModel.id && this.competitionId == competitionHistoryItemUiModel.competitionId && Intrinsics.areEqual(this.date, competitionHistoryItemUiModel.date) && Intrinsics.areEqual(this.time, competitionHistoryItemUiModel.time) && Intrinsics.areEqual(this.title, competitionHistoryItemUiModel.title) && this.score == competitionHistoryItemUiModel.score && this.total == competitionHistoryItemUiModel.total && this.isWin == competitionHistoryItemUiModel.isWin && this.state == competitionHistoryItemUiModel.state;
    }

    public int hashCode() {
        return (((((((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.competitionId)) * 31) + this.date.hashCode()) * 31) + this.time.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.score)) * 31) + Integer.hashCode(this.total)) * 31) + Boolean.hashCode(this.isWin)) * 31) + Integer.hashCode(this.state);
    }

    public String toString() {
        return "CompetitionHistoryItemUiModel(id=" + this.id + ", competitionId=" + this.competitionId + ", date=" + this.date + ", time=" + this.time + ", title=" + this.title + ", score=" + this.score + ", total=" + this.total + ", isWin=" + this.isWin + ", state=" + this.state + ")";
    }

    public CompetitionHistoryItemUiModel(long j, long j2, String date, String time, String title, int i, int i2, boolean z, int i3) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j;
        this.competitionId = j2;
        this.date = date;
        this.time = time;
        this.title = title;
        this.score = i;
        this.total = i2;
        this.isWin = z;
        this.state = i3;
    }

    public final long getId() {
        return this.id;
    }

    public final long getCompetitionId() {
        return this.competitionId;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getTime() {
        return this.time;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getScore() {
        return this.score;
    }

    public final int getTotal() {
        return this.total;
    }

    public final boolean isWin() {
        return this.isWin;
    }

    public final int getState() {
        return this.state;
    }
}
