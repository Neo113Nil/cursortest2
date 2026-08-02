package org.betup.model.remote.entity.competitions;

import com.google.gson.annotations.SerializedName;
import com.ironsource.X3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionHistoryCountModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lorg/betup/model/remote/entity/competitions/CompetitionHistoryCountModel;", "", "all", "", X3.i.t, "jackpot", "notStarted", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIII)V", "getAll", "()I", "getFailed", "getJackpot", "getNotStarted", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompetitionHistoryCountModel {
    public static final int $stable = 0;

    @SerializedName("all")
    private final int all;

    @SerializedName(X3.i.t)
    private final int failed;

    @SerializedName("jackpot")
    private final int jackpot;

    @SerializedName("notStarted")
    private final int notStarted;

    public CompetitionHistoryCountModel() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ CompetitionHistoryCountModel copy$default(CompetitionHistoryCountModel competitionHistoryCountModel, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = competitionHistoryCountModel.all;
        }
        if ((i5 & 2) != 0) {
            i2 = competitionHistoryCountModel.failed;
        }
        if ((i5 & 4) != 0) {
            i3 = competitionHistoryCountModel.jackpot;
        }
        if ((i5 & 8) != 0) {
            i4 = competitionHistoryCountModel.notStarted;
        }
        return competitionHistoryCountModel.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAll() {
        return this.all;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFailed() {
        return this.failed;
    }

    /* renamed from: component3, reason: from getter */
    public final int getJackpot() {
        return this.jackpot;
    }

    /* renamed from: component4, reason: from getter */
    public final int getNotStarted() {
        return this.notStarted;
    }

    public final CompetitionHistoryCountModel copy(int all, int failed, int jackpot, int notStarted) {
        return new CompetitionHistoryCountModel(all, failed, jackpot, notStarted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetitionHistoryCountModel)) {
            return false;
        }
        CompetitionHistoryCountModel competitionHistoryCountModel = (CompetitionHistoryCountModel) other;
        return this.all == competitionHistoryCountModel.all && this.failed == competitionHistoryCountModel.failed && this.jackpot == competitionHistoryCountModel.jackpot && this.notStarted == competitionHistoryCountModel.notStarted;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.all) * 31) + Integer.hashCode(this.failed)) * 31) + Integer.hashCode(this.jackpot)) * 31) + Integer.hashCode(this.notStarted);
    }

    public String toString() {
        return "CompetitionHistoryCountModel(all=" + this.all + ", failed=" + this.failed + ", jackpot=" + this.jackpot + ", notStarted=" + this.notStarted + ")";
    }

    public CompetitionHistoryCountModel(int i, int i2, int i3, int i4) {
        this.all = i;
        this.failed = i2;
        this.jackpot = i3;
        this.notStarted = i4;
    }

    public /* synthetic */ CompetitionHistoryCountModel(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    public final int getAll() {
        return this.all;
    }

    public final int getFailed() {
        return this.failed;
    }

    public final int getJackpot() {
        return this.jackpot;
    }

    public final int getNotStarted() {
        return this.notStarted;
    }
}
