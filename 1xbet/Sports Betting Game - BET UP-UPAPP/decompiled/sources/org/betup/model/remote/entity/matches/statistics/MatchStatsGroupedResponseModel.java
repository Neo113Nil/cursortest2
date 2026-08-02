package org.betup.model.remote.entity.matches.statistics;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchStatsGroupedResponseModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lorg/betup/model/remote/entity/matches/statistics/MatchStatsGroupedResponseModel;", "", "varieties", "", "Lorg/betup/model/remote/entity/matches/statistics/VarietyStatsModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;)V", "getVarieties", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MatchStatsGroupedResponseModel {
    public static final int $stable = 8;

    @SerializedName("varieties")
    private final List<VarietyStatsModel> varieties;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchStatsGroupedResponseModel copy$default(MatchStatsGroupedResponseModel matchStatsGroupedResponseModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = matchStatsGroupedResponseModel.varieties;
        }
        return matchStatsGroupedResponseModel.copy(list);
    }

    public final List<VarietyStatsModel> component1() {
        return this.varieties;
    }

    public final MatchStatsGroupedResponseModel copy(List<VarietyStatsModel> varieties) {
        Intrinsics.checkNotNullParameter(varieties, "varieties");
        return new MatchStatsGroupedResponseModel(varieties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MatchStatsGroupedResponseModel) && Intrinsics.areEqual(this.varieties, ((MatchStatsGroupedResponseModel) other).varieties);
    }

    public int hashCode() {
        return this.varieties.hashCode();
    }

    public String toString() {
        return "MatchStatsGroupedResponseModel(varieties=" + this.varieties + ")";
    }

    public MatchStatsGroupedResponseModel(List<VarietyStatsModel> varieties) {
        Intrinsics.checkNotNullParameter(varieties, "varieties");
        this.varieties = varieties;
    }

    public final List<VarietyStatsModel> getVarieties() {
        return this.varieties;
    }
}
