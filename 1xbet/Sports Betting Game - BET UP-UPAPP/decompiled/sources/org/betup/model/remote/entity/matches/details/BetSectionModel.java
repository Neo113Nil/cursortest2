package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.bets.SubMatchModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetSectionModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/BetSectionModel;", "", "variety", "Lorg/betup/model/remote/entity/bets/SubMatchModel;", "groups", "", "Lorg/betup/model/remote/entity/matches/details/BetGroupSectionResponseModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/bets/SubMatchModel;Ljava/util/List;)V", "getVariety", "()Lorg/betup/model/remote/entity/bets/SubMatchModel;", "getGroups", "()Ljava/util/List;", "getQuizQuestionName", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BetSectionModel {
    public static final int $stable = 8;

    @SerializedName("groups")
    private final List<BetGroupSectionResponseModel> groups;

    @SerializedName("variety")
    private final SubMatchModel variety;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetSectionModel copy$default(BetSectionModel betSectionModel, SubMatchModel subMatchModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            subMatchModel = betSectionModel.variety;
        }
        if ((i & 2) != 0) {
            list = betSectionModel.groups;
        }
        return betSectionModel.copy(subMatchModel, list);
    }

    /* renamed from: component1, reason: from getter */
    public final SubMatchModel getVariety() {
        return this.variety;
    }

    public final List<BetGroupSectionResponseModel> component2() {
        return this.groups;
    }

    public final BetSectionModel copy(SubMatchModel variety, List<BetGroupSectionResponseModel> groups) {
        Intrinsics.checkNotNullParameter(variety, "variety");
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new BetSectionModel(variety, groups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetSectionModel)) {
            return false;
        }
        BetSectionModel betSectionModel = (BetSectionModel) other;
        return Intrinsics.areEqual(this.variety, betSectionModel.variety) && Intrinsics.areEqual(this.groups, betSectionModel.groups);
    }

    public int hashCode() {
        return (this.variety.hashCode() * 31) + this.groups.hashCode();
    }

    public String toString() {
        return "BetSectionModel(variety=" + this.variety + ", groups=" + this.groups + ")";
    }

    public BetSectionModel(SubMatchModel variety, List<BetGroupSectionResponseModel> groups) {
        Intrinsics.checkNotNullParameter(variety, "variety");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.variety = variety;
        this.groups = groups;
    }

    public final SubMatchModel getVariety() {
        return this.variety;
    }

    public final List<BetGroupSectionResponseModel> getGroups() {
        return this.groups;
    }

    public final String getQuizQuestionName() {
        return this.variety.getName() + ". " + ((BetGroupSectionResponseModel) CollectionsKt.first((List) this.groups)).getGroup().getName();
    }
}
