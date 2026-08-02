package org.betup.model.remote.entity.competitions;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionDetailsModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lorg/betup/model/remote/entity/competitions/CompetitionBetGroupModel;", "", "group", "Lorg/betup/model/remote/entity/competitions/CompetitionBetGroupInfoModel;", "bets", "", "Lorg/betup/model/remote/entity/competitions/CompetitionBetItemModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/competitions/CompetitionBetGroupInfoModel;Ljava/util/List;)V", "getGroup", "()Lorg/betup/model/remote/entity/competitions/CompetitionBetGroupInfoModel;", "getBets", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompetitionBetGroupModel {
    public static final int $stable = 8;

    @SerializedName("bets")
    private final List<CompetitionBetItemModel> bets;

    @SerializedName("group")
    private final CompetitionBetGroupInfoModel group;

    /* JADX WARN: Multi-variable type inference failed */
    public CompetitionBetGroupModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompetitionBetGroupModel copy$default(CompetitionBetGroupModel competitionBetGroupModel, CompetitionBetGroupInfoModel competitionBetGroupInfoModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            competitionBetGroupInfoModel = competitionBetGroupModel.group;
        }
        if ((i & 2) != 0) {
            list = competitionBetGroupModel.bets;
        }
        return competitionBetGroupModel.copy(competitionBetGroupInfoModel, list);
    }

    /* renamed from: component1, reason: from getter */
    public final CompetitionBetGroupInfoModel getGroup() {
        return this.group;
    }

    public final List<CompetitionBetItemModel> component2() {
        return this.bets;
    }

    public final CompetitionBetGroupModel copy(CompetitionBetGroupInfoModel group, List<CompetitionBetItemModel> bets) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(bets, "bets");
        return new CompetitionBetGroupModel(group, bets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetitionBetGroupModel)) {
            return false;
        }
        CompetitionBetGroupModel competitionBetGroupModel = (CompetitionBetGroupModel) other;
        return Intrinsics.areEqual(this.group, competitionBetGroupModel.group) && Intrinsics.areEqual(this.bets, competitionBetGroupModel.bets);
    }

    public int hashCode() {
        return (this.group.hashCode() * 31) + this.bets.hashCode();
    }

    public String toString() {
        return "CompetitionBetGroupModel(group=" + this.group + ", bets=" + this.bets + ")";
    }

    public CompetitionBetGroupModel(CompetitionBetGroupInfoModel group, List<CompetitionBetItemModel> bets) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(bets, "bets");
        this.group = group;
        this.bets = bets;
    }

    public final CompetitionBetGroupInfoModel getGroup() {
        return this.group;
    }

    public /* synthetic */ CompetitionBetGroupModel(CompetitionBetGroupInfoModel competitionBetGroupInfoModel, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CompetitionBetGroupInfoModel(0, 0, null, false, 0, 0, 0, 127, null) : competitionBetGroupInfoModel, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<CompetitionBetItemModel> getBets() {
        return this.bets;
    }
}
