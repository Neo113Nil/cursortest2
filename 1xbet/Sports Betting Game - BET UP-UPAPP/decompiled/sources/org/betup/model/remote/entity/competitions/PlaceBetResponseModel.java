package org.betup.model.remote.entity.competitions;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.matches.details.BetDataModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PlaceBetResponseModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lorg/betup/model/remote/entity/competitions/PlaceBetResponseModel;", "", "participantId", "", "grabbedBets", "", "Lorg/betup/model/remote/entity/matches/details/BetDataModel;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Long;Ljava/util/List;)V", "getParticipantId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGrabbedBets", "()Ljava/util/List;", "success", "", "getSuccess", "()Z", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/util/List;)Lorg/betup/model/remote/entity/competitions/PlaceBetResponseModel;", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlaceBetResponseModel {
    public static final int $stable = 8;

    @SerializedName("grabbedBets")
    private final List<BetDataModel> grabbedBets;

    @SerializedName("participantId")
    private final Long participantId;

    /* JADX WARN: Multi-variable type inference failed */
    public PlaceBetResponseModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaceBetResponseModel copy$default(PlaceBetResponseModel placeBetResponseModel, Long l, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = placeBetResponseModel.participantId;
        }
        if ((i & 2) != 0) {
            list = placeBetResponseModel.grabbedBets;
        }
        return placeBetResponseModel.copy(l, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getParticipantId() {
        return this.participantId;
    }

    public final List<BetDataModel> component2() {
        return this.grabbedBets;
    }

    public final PlaceBetResponseModel copy(Long participantId, List<BetDataModel> grabbedBets) {
        return new PlaceBetResponseModel(participantId, grabbedBets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceBetResponseModel)) {
            return false;
        }
        PlaceBetResponseModel placeBetResponseModel = (PlaceBetResponseModel) other;
        return Intrinsics.areEqual(this.participantId, placeBetResponseModel.participantId) && Intrinsics.areEqual(this.grabbedBets, placeBetResponseModel.grabbedBets);
    }

    public int hashCode() {
        Long l = this.participantId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<BetDataModel> list = this.grabbedBets;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "PlaceBetResponseModel(participantId=" + this.participantId + ", grabbedBets=" + this.grabbedBets + ")";
    }

    public PlaceBetResponseModel(Long l, List<BetDataModel> list) {
        this.participantId = l;
        this.grabbedBets = list;
    }

    public /* synthetic */ PlaceBetResponseModel(Long l, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : list);
    }

    public final Long getParticipantId() {
        return this.participantId;
    }

    public final List<BetDataModel> getGrabbedBets() {
        return this.grabbedBets;
    }

    public final boolean getSuccess() {
        Long l = this.participantId;
        return l != null && l.longValue() > 0;
    }
}
