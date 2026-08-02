package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BetModelShortInfo.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018¨\u0006$"}, d2 = {"Lorg/betup/model/remote/entity/matches/details/BetModelShortInfo;", "", "betTypeId", "", "betName", "", "grabbedBetId", "", "grabbedCoefficient", "", "isAvailable", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Z)V", "getBetTypeId", "()I", "getBetName", "()Ljava/lang/String;", "getGrabbedBetId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGrabbedCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Z)Lorg/betup/model/remote/entity/matches/details/BetModelShortInfo;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BetModelShortInfo {
    public static final int $stable = 0;

    @SerializedName("bet_name")
    private final String betName;

    @SerializedName("bet_type_id")
    private final int betTypeId;

    @SerializedName("grabbed_bet_id")
    private final Long grabbedBetId;

    @SerializedName("grabbed_coeficient")
    private final Double grabbedCoefficient;

    @SerializedName("is_available")
    private final boolean isAvailable;

    public BetModelShortInfo() {
        this(0, null, null, null, false, 31, null);
    }

    public static /* synthetic */ BetModelShortInfo copy$default(BetModelShortInfo betModelShortInfo, int i, String str, Long l, Double d, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = betModelShortInfo.betTypeId;
        }
        if ((i2 & 2) != 0) {
            str = betModelShortInfo.betName;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            l = betModelShortInfo.grabbedBetId;
        }
        Long l2 = l;
        if ((i2 & 8) != 0) {
            d = betModelShortInfo.grabbedCoefficient;
        }
        Double d2 = d;
        if ((i2 & 16) != 0) {
            z = betModelShortInfo.isAvailable;
        }
        return betModelShortInfo.copy(i, str2, l2, d2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBetTypeId() {
        return this.betTypeId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBetName() {
        return this.betName;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getGrabbedBetId() {
        return this.grabbedBetId;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getGrabbedCoefficient() {
        return this.grabbedCoefficient;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    public final BetModelShortInfo copy(int betTypeId, String betName, Long grabbedBetId, Double grabbedCoefficient, boolean isAvailable) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        return new BetModelShortInfo(betTypeId, betName, grabbedBetId, grabbedCoefficient, isAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetModelShortInfo)) {
            return false;
        }
        BetModelShortInfo betModelShortInfo = (BetModelShortInfo) other;
        return this.betTypeId == betModelShortInfo.betTypeId && Intrinsics.areEqual(this.betName, betModelShortInfo.betName) && Intrinsics.areEqual(this.grabbedBetId, betModelShortInfo.grabbedBetId) && Intrinsics.areEqual((Object) this.grabbedCoefficient, (Object) betModelShortInfo.grabbedCoefficient) && this.isAvailable == betModelShortInfo.isAvailable;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.betTypeId) * 31) + this.betName.hashCode()) * 31;
        Long l = this.grabbedBetId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.grabbedCoefficient;
        return ((hashCode2 + (d != null ? d.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAvailable);
    }

    public String toString() {
        return "BetModelShortInfo(betTypeId=" + this.betTypeId + ", betName=" + this.betName + ", grabbedBetId=" + this.grabbedBetId + ", grabbedCoefficient=" + this.grabbedCoefficient + ", isAvailable=" + this.isAvailable + ")";
    }

    public BetModelShortInfo(int i, String betName, Long l, Double d, boolean z) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        this.betTypeId = i;
        this.betName = betName;
        this.grabbedBetId = l;
        this.grabbedCoefficient = d;
        this.isAvailable = z;
    }

    public final int getBetTypeId() {
        return this.betTypeId;
    }

    public /* synthetic */ BetModelShortInfo(int i, String str, Long l, Double d, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : l, (i2 & 8) == 0 ? d : null, (i2 & 16) != 0 ? true : z);
    }

    public final String getBetName() {
        return this.betName;
    }

    public final Long getGrabbedBetId() {
        return this.grabbedBetId;
    }

    public final Double getGrabbedCoefficient() {
        return this.grabbedCoefficient;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }
}
