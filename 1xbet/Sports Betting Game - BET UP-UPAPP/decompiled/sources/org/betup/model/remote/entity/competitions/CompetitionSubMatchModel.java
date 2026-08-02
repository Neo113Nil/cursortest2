package org.betup.model.remote.entity.competitions;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionDetailsModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lorg/betup/model/remote/entity/competitions/CompetitionSubMatchModel;", "", "variety", "Lorg/betup/model/remote/entity/competitions/CompetitionBetVarietyModel;", "groups", "", "Lorg/betup/model/remote/entity/competitions/CompetitionBetGroupModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/competitions/CompetitionBetVarietyModel;Ljava/util/List;)V", "getVariety", "()Lorg/betup/model/remote/entity/competitions/CompetitionBetVarietyModel;", "getGroups", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompetitionSubMatchModel {
    public static final int $stable = 8;

    @SerializedName("groups")
    private final List<CompetitionBetGroupModel> groups;

    @SerializedName("variety")
    private final CompetitionBetVarietyModel variety;

    /* JADX WARN: Multi-variable type inference failed */
    public CompetitionSubMatchModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompetitionSubMatchModel copy$default(CompetitionSubMatchModel competitionSubMatchModel, CompetitionBetVarietyModel competitionBetVarietyModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            competitionBetVarietyModel = competitionSubMatchModel.variety;
        }
        if ((i & 2) != 0) {
            list = competitionSubMatchModel.groups;
        }
        return competitionSubMatchModel.copy(competitionBetVarietyModel, list);
    }

    /* renamed from: component1, reason: from getter */
    public final CompetitionBetVarietyModel getVariety() {
        return this.variety;
    }

    public final List<CompetitionBetGroupModel> component2() {
        return this.groups;
    }

    public final CompetitionSubMatchModel copy(CompetitionBetVarietyModel variety, List<CompetitionBetGroupModel> groups) {
        Intrinsics.checkNotNullParameter(variety, "variety");
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new CompetitionSubMatchModel(variety, groups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetitionSubMatchModel)) {
            return false;
        }
        CompetitionSubMatchModel competitionSubMatchModel = (CompetitionSubMatchModel) other;
        return Intrinsics.areEqual(this.variety, competitionSubMatchModel.variety) && Intrinsics.areEqual(this.groups, competitionSubMatchModel.groups);
    }

    public int hashCode() {
        return (this.variety.hashCode() * 31) + this.groups.hashCode();
    }

    public String toString() {
        return "CompetitionSubMatchModel(variety=" + this.variety + ", groups=" + this.groups + ")";
    }

    public CompetitionSubMatchModel(CompetitionBetVarietyModel variety, List<CompetitionBetGroupModel> groups) {
        Intrinsics.checkNotNullParameter(variety, "variety");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.variety = variety;
        this.groups = groups;
    }

    public final CompetitionBetVarietyModel getVariety() {
        return this.variety;
    }

    public /* synthetic */ CompetitionSubMatchModel(CompetitionBetVarietyModel competitionBetVarietyModel, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CompetitionBetVarietyModel(0L, 0, 0, null, 15, null) : competitionBetVarietyModel, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<CompetitionBetGroupModel> getGroups() {
        return this.groups;
    }
}
