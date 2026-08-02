package org.betup.model.remote.entity.matches.statistics;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchStatsGroupedResponseModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lorg/betup/model/remote/entity/matches/statistics/VarietyStatsModel;", "", "varietyId", "", "varietyName", "", "stats", "", "Lorg/betup/model/remote/entity/matches/statistics/NewMatchStatisticsItemModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/String;Ljava/util/List;)V", "getVarietyId", "()J", "getVarietyName", "()Ljava/lang/String;", "getStats", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VarietyStatsModel {
    public static final int $stable = 8;

    @SerializedName("stats")
    private final List<NewMatchStatisticsItemModel> stats;

    @SerializedName("variety_id")
    private final long varietyId;

    @SerializedName("variety_name")
    private final String varietyName;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VarietyStatsModel copy$default(VarietyStatsModel varietyStatsModel, long j, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = varietyStatsModel.varietyId;
        }
        if ((i & 2) != 0) {
            str = varietyStatsModel.varietyName;
        }
        if ((i & 4) != 0) {
            list = varietyStatsModel.stats;
        }
        return varietyStatsModel.copy(j, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getVarietyId() {
        return this.varietyId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVarietyName() {
        return this.varietyName;
    }

    public final List<NewMatchStatisticsItemModel> component3() {
        return this.stats;
    }

    public final VarietyStatsModel copy(long varietyId, String varietyName, List<NewMatchStatisticsItemModel> stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        return new VarietyStatsModel(varietyId, varietyName, stats);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VarietyStatsModel)) {
            return false;
        }
        VarietyStatsModel varietyStatsModel = (VarietyStatsModel) other;
        return this.varietyId == varietyStatsModel.varietyId && Intrinsics.areEqual(this.varietyName, varietyStatsModel.varietyName) && Intrinsics.areEqual(this.stats, varietyStatsModel.stats);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.varietyId) * 31;
        String str = this.varietyName;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.stats.hashCode();
    }

    public String toString() {
        return "VarietyStatsModel(varietyId=" + this.varietyId + ", varietyName=" + this.varietyName + ", stats=" + this.stats + ")";
    }

    public VarietyStatsModel(long j, String str, List<NewMatchStatisticsItemModel> stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        this.varietyId = j;
        this.varietyName = str;
        this.stats = stats;
    }

    public final long getVarietyId() {
        return this.varietyId;
    }

    public final String getVarietyName() {
        return this.varietyName;
    }

    public final List<NewMatchStatisticsItemModel> getStats() {
        return this.stats;
    }
}
