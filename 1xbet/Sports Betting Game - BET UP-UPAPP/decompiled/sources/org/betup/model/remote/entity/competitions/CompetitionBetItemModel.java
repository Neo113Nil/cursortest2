package org.betup.model.remote.entity.competitions;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CompetitionDetailsModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lorg/betup/model/remote/entity/competitions/CompetitionBetItemModel;", "", "grabbedBetId", "", "grabbedCoefficient", "", "betTypeId", "", "isAvailable", "", "betName", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JDIZLjava/lang/String;)V", "getGrabbedBetId", "()J", "getGrabbedCoefficient", "()D", "getBetTypeId", "()I", "()Z", "getBetName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CompetitionBetItemModel {
    public static final int $stable = 0;

    @SerializedName("bet_name")
    private final String betName;

    @SerializedName("bet_type_id")
    private final int betTypeId;

    @SerializedName("grabbed_bet_id")
    private final long grabbedBetId;

    @SerializedName("grabbed_coeficient")
    private final double grabbedCoefficient;

    @SerializedName("is_available")
    private final boolean isAvailable;

    public CompetitionBetItemModel() {
        this(0L, 0.0d, 0, false, null, 31, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getGrabbedBetId() {
        return this.grabbedBetId;
    }

    /* renamed from: component2, reason: from getter */
    public final double getGrabbedCoefficient() {
        return this.grabbedCoefficient;
    }

    /* renamed from: component3, reason: from getter */
    public final int getBetTypeId() {
        return this.betTypeId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBetName() {
        return this.betName;
    }

    public final CompetitionBetItemModel copy(long grabbedBetId, double grabbedCoefficient, int betTypeId, boolean isAvailable, String betName) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        return new CompetitionBetItemModel(grabbedBetId, grabbedCoefficient, betTypeId, isAvailable, betName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompetitionBetItemModel)) {
            return false;
        }
        CompetitionBetItemModel competitionBetItemModel = (CompetitionBetItemModel) other;
        return this.grabbedBetId == competitionBetItemModel.grabbedBetId && Double.compare(this.grabbedCoefficient, competitionBetItemModel.grabbedCoefficient) == 0 && this.betTypeId == competitionBetItemModel.betTypeId && this.isAvailable == competitionBetItemModel.isAvailable && Intrinsics.areEqual(this.betName, competitionBetItemModel.betName);
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.grabbedBetId) * 31) + Double.hashCode(this.grabbedCoefficient)) * 31) + Integer.hashCode(this.betTypeId)) * 31) + Boolean.hashCode(this.isAvailable)) * 31) + this.betName.hashCode();
    }

    public String toString() {
        return "CompetitionBetItemModel(grabbedBetId=" + this.grabbedBetId + ", grabbedCoefficient=" + this.grabbedCoefficient + ", betTypeId=" + this.betTypeId + ", isAvailable=" + this.isAvailable + ", betName=" + this.betName + ")";
    }

    public CompetitionBetItemModel(long j, double d, int i, boolean z, String betName) {
        Intrinsics.checkNotNullParameter(betName, "betName");
        this.grabbedBetId = j;
        this.grabbedCoefficient = d;
        this.betTypeId = i;
        this.isAvailable = z;
        this.betName = betName;
    }

    public final long getGrabbedBetId() {
        return this.grabbedBetId;
    }

    public final double getGrabbedCoefficient() {
        return this.grabbedCoefficient;
    }

    public final int getBetTypeId() {
        return this.betTypeId;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final String getBetName() {
        return this.betName;
    }

    public /* synthetic */ CompetitionBetItemModel(long j, double d, int i, boolean z, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? "" : str);
    }
}
