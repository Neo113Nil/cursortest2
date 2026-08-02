package org.betup.model.remote.entity.betslip;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7GrabbedBetsResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lorg/betup/model/remote/entity/betslip/V7GrabbedBetsResponse;", "", "grabbedBets", "", "Lorg/betup/model/remote/entity/betslip/V7GrabbedBetDto;", "placedBetlists", "", "availableCount", "maxMoneyPlaced", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;IIJ)V", "getGrabbedBets", "()Ljava/util/List;", "getPlacedBetlists", "()I", "getAvailableCount", "getMaxMoneyPlaced", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7GrabbedBetsResponse {
    public static final int $stable = 8;

    @SerializedName("available_count")
    private final int availableCount;

    @SerializedName("grabbed_bets")
    private final List<V7GrabbedBetDto> grabbedBets;

    @SerializedName("max_money_placed")
    private final long maxMoneyPlaced;

    @SerializedName("placed_betlists")
    private final int placedBetlists;

    public V7GrabbedBetsResponse() {
        this(null, 0, 0, 0L, 15, null);
    }

    public static /* synthetic */ V7GrabbedBetsResponse copy$default(V7GrabbedBetsResponse v7GrabbedBetsResponse, List list, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = v7GrabbedBetsResponse.grabbedBets;
        }
        if ((i3 & 2) != 0) {
            i = v7GrabbedBetsResponse.placedBetlists;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = v7GrabbedBetsResponse.availableCount;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            j = v7GrabbedBetsResponse.maxMoneyPlaced;
        }
        return v7GrabbedBetsResponse.copy(list, i4, i5, j);
    }

    public final List<V7GrabbedBetDto> component1() {
        return this.grabbedBets;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPlacedBetlists() {
        return this.placedBetlists;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAvailableCount() {
        return this.availableCount;
    }

    /* renamed from: component4, reason: from getter */
    public final long getMaxMoneyPlaced() {
        return this.maxMoneyPlaced;
    }

    public final V7GrabbedBetsResponse copy(List<V7GrabbedBetDto> grabbedBets, int placedBetlists, int availableCount, long maxMoneyPlaced) {
        Intrinsics.checkNotNullParameter(grabbedBets, "grabbedBets");
        return new V7GrabbedBetsResponse(grabbedBets, placedBetlists, availableCount, maxMoneyPlaced);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7GrabbedBetsResponse)) {
            return false;
        }
        V7GrabbedBetsResponse v7GrabbedBetsResponse = (V7GrabbedBetsResponse) other;
        return Intrinsics.areEqual(this.grabbedBets, v7GrabbedBetsResponse.grabbedBets) && this.placedBetlists == v7GrabbedBetsResponse.placedBetlists && this.availableCount == v7GrabbedBetsResponse.availableCount && this.maxMoneyPlaced == v7GrabbedBetsResponse.maxMoneyPlaced;
    }

    public int hashCode() {
        return (((((this.grabbedBets.hashCode() * 31) + Integer.hashCode(this.placedBetlists)) * 31) + Integer.hashCode(this.availableCount)) * 31) + Long.hashCode(this.maxMoneyPlaced);
    }

    public String toString() {
        return "V7GrabbedBetsResponse(grabbedBets=" + this.grabbedBets + ", placedBetlists=" + this.placedBetlists + ", availableCount=" + this.availableCount + ", maxMoneyPlaced=" + this.maxMoneyPlaced + ")";
    }

    public V7GrabbedBetsResponse(List<V7GrabbedBetDto> grabbedBets, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(grabbedBets, "grabbedBets");
        this.grabbedBets = grabbedBets;
        this.placedBetlists = i;
        this.availableCount = i2;
        this.maxMoneyPlaced = j;
    }

    public final List<V7GrabbedBetDto> getGrabbedBets() {
        return this.grabbedBets;
    }

    public /* synthetic */ V7GrabbedBetsResponse(List list, int i, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? CollectionsKt.emptyList() : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? 0L : j);
    }

    public final int getPlacedBetlists() {
        return this.placedBetlists;
    }

    public final int getAvailableCount() {
        return this.availableCount;
    }

    public final long getMaxMoneyPlaced() {
        return this.maxMoneyPlaced;
    }
}
