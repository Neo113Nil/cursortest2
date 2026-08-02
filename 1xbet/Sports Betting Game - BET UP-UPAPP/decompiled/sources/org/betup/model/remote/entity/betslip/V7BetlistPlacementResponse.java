package org.betup.model.remote.entity.betslip;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7BetlistPlacementResponse.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lorg/betup/model/remote/entity/betslip/V7BetlistPlacementResponse;", "", "betlist", "Lorg/betup/model/remote/entity/betslip/V7BetlistCreatedDto;", "grabbedBets", "", "Lorg/betup/model/remote/entity/betslip/V7GrabbedBetDto;", "errorCodes", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/betslip/V7BetlistCreatedDto;Ljava/util/List;Ljava/util/List;)V", "getBetlist", "()Lorg/betup/model/remote/entity/betslip/V7BetlistCreatedDto;", "getGrabbedBets", "()Ljava/util/List;", "getErrorCodes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7BetlistPlacementResponse {
    public static final int $stable = 8;

    @SerializedName("betlist")
    private final V7BetlistCreatedDto betlist;

    @SerializedName("error_codes")
    private final List<Integer> errorCodes;

    @SerializedName("grabbed_bets")
    private final List<V7GrabbedBetDto> grabbedBets;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ V7BetlistPlacementResponse copy$default(V7BetlistPlacementResponse v7BetlistPlacementResponse, V7BetlistCreatedDto v7BetlistCreatedDto, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            v7BetlistCreatedDto = v7BetlistPlacementResponse.betlist;
        }
        if ((i & 2) != 0) {
            list = v7BetlistPlacementResponse.grabbedBets;
        }
        if ((i & 4) != 0) {
            list2 = v7BetlistPlacementResponse.errorCodes;
        }
        return v7BetlistPlacementResponse.copy(v7BetlistCreatedDto, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final V7BetlistCreatedDto getBetlist() {
        return this.betlist;
    }

    public final List<V7GrabbedBetDto> component2() {
        return this.grabbedBets;
    }

    public final List<Integer> component3() {
        return this.errorCodes;
    }

    public final V7BetlistPlacementResponse copy(V7BetlistCreatedDto betlist, List<V7GrabbedBetDto> grabbedBets, List<Integer> errorCodes) {
        Intrinsics.checkNotNullParameter(grabbedBets, "grabbedBets");
        Intrinsics.checkNotNullParameter(errorCodes, "errorCodes");
        return new V7BetlistPlacementResponse(betlist, grabbedBets, errorCodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7BetlistPlacementResponse)) {
            return false;
        }
        V7BetlistPlacementResponse v7BetlistPlacementResponse = (V7BetlistPlacementResponse) other;
        return Intrinsics.areEqual(this.betlist, v7BetlistPlacementResponse.betlist) && Intrinsics.areEqual(this.grabbedBets, v7BetlistPlacementResponse.grabbedBets) && Intrinsics.areEqual(this.errorCodes, v7BetlistPlacementResponse.errorCodes);
    }

    public int hashCode() {
        V7BetlistCreatedDto v7BetlistCreatedDto = this.betlist;
        return ((((v7BetlistCreatedDto == null ? 0 : v7BetlistCreatedDto.hashCode()) * 31) + this.grabbedBets.hashCode()) * 31) + this.errorCodes.hashCode();
    }

    public String toString() {
        return "V7BetlistPlacementResponse(betlist=" + this.betlist + ", grabbedBets=" + this.grabbedBets + ", errorCodes=" + this.errorCodes + ")";
    }

    public V7BetlistPlacementResponse(V7BetlistCreatedDto v7BetlistCreatedDto, List<V7GrabbedBetDto> grabbedBets, List<Integer> errorCodes) {
        Intrinsics.checkNotNullParameter(grabbedBets, "grabbedBets");
        Intrinsics.checkNotNullParameter(errorCodes, "errorCodes");
        this.betlist = v7BetlistCreatedDto;
        this.grabbedBets = grabbedBets;
        this.errorCodes = errorCodes;
    }

    public final V7BetlistCreatedDto getBetlist() {
        return this.betlist;
    }

    public final List<V7GrabbedBetDto> getGrabbedBets() {
        return this.grabbedBets;
    }

    public /* synthetic */ V7BetlistPlacementResponse(V7BetlistCreatedDto v7BetlistCreatedDto, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(v7BetlistCreatedDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final List<Integer> getErrorCodes() {
        return this.errorCodes;
    }
}
