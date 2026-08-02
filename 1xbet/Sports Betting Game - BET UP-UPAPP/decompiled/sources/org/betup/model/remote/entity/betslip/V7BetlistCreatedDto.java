package org.betup.model.remote.entity.betslip;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7BetlistPlacementResponse.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003Jg\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u0006-"}, d2 = {"Lorg/betup/model/remote/entity/betslip/V7BetlistCreatedDto;", "", "id", "", "state", "", "createdAt", "", "finishedAt", "placedBets", "moneyPlaced", "moneyPotential", "finalCoeficient", "", "expAdded", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JILjava/lang/String;Ljava/lang/String;IJJDI)V", "getId", "()J", "getState", "()I", "getCreatedAt", "()Ljava/lang/String;", "getFinishedAt", "getPlacedBets", "getMoneyPlaced", "getMoneyPotential", "getFinalCoeficient", "()D", "getExpAdded", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7BetlistCreatedDto {
    public static final int $stable = 0;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("exp_added")
    private final int expAdded;

    @SerializedName("final_coeficient")
    private final double finalCoeficient;

    @SerializedName("finished_at")
    private final String finishedAt;

    @SerializedName("id")
    private final long id;

    @SerializedName("money_placed")
    private final long moneyPlaced;

    @SerializedName("money_potential")
    private final long moneyPotential;

    @SerializedName("placed_bets")
    private final int placedBets;

    @SerializedName("state")
    private final int state;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFinishedAt() {
        return this.finishedAt;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPlacedBets() {
        return this.placedBets;
    }

    /* renamed from: component6, reason: from getter */
    public final long getMoneyPlaced() {
        return this.moneyPlaced;
    }

    /* renamed from: component7, reason: from getter */
    public final long getMoneyPotential() {
        return this.moneyPotential;
    }

    /* renamed from: component8, reason: from getter */
    public final double getFinalCoeficient() {
        return this.finalCoeficient;
    }

    /* renamed from: component9, reason: from getter */
    public final int getExpAdded() {
        return this.expAdded;
    }

    public final V7BetlistCreatedDto copy(long id, int state, String createdAt, String finishedAt, int placedBets, long moneyPlaced, long moneyPotential, double finalCoeficient, int expAdded) {
        return new V7BetlistCreatedDto(id, state, createdAt, finishedAt, placedBets, moneyPlaced, moneyPotential, finalCoeficient, expAdded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7BetlistCreatedDto)) {
            return false;
        }
        V7BetlistCreatedDto v7BetlistCreatedDto = (V7BetlistCreatedDto) other;
        return this.id == v7BetlistCreatedDto.id && this.state == v7BetlistCreatedDto.state && Intrinsics.areEqual(this.createdAt, v7BetlistCreatedDto.createdAt) && Intrinsics.areEqual(this.finishedAt, v7BetlistCreatedDto.finishedAt) && this.placedBets == v7BetlistCreatedDto.placedBets && this.moneyPlaced == v7BetlistCreatedDto.moneyPlaced && this.moneyPotential == v7BetlistCreatedDto.moneyPotential && Double.compare(this.finalCoeficient, v7BetlistCreatedDto.finalCoeficient) == 0 && this.expAdded == v7BetlistCreatedDto.expAdded;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.id) * 31) + Integer.hashCode(this.state)) * 31;
        String str = this.createdAt;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.finishedAt;
        return ((((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.placedBets)) * 31) + Long.hashCode(this.moneyPlaced)) * 31) + Long.hashCode(this.moneyPotential)) * 31) + Double.hashCode(this.finalCoeficient)) * 31) + Integer.hashCode(this.expAdded);
    }

    public String toString() {
        return "V7BetlistCreatedDto(id=" + this.id + ", state=" + this.state + ", createdAt=" + this.createdAt + ", finishedAt=" + this.finishedAt + ", placedBets=" + this.placedBets + ", moneyPlaced=" + this.moneyPlaced + ", moneyPotential=" + this.moneyPotential + ", finalCoeficient=" + this.finalCoeficient + ", expAdded=" + this.expAdded + ")";
    }

    public V7BetlistCreatedDto(long j, int i, String str, String str2, int i2, long j2, long j3, double d, int i3) {
        this.id = j;
        this.state = i;
        this.createdAt = str;
        this.finishedAt = str2;
        this.placedBets = i2;
        this.moneyPlaced = j2;
        this.moneyPotential = j3;
        this.finalCoeficient = d;
        this.expAdded = i3;
    }

    public /* synthetic */ V7BetlistCreatedDto(long j, int i, String str, String str2, int i2, long j2, long j3, double d, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, str, str2, i2, j2, j3, d, (i4 & 256) != 0 ? 0 : i3);
    }

    public final long getId() {
        return this.id;
    }

    public final int getState() {
        return this.state;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getFinishedAt() {
        return this.finishedAt;
    }

    public final int getPlacedBets() {
        return this.placedBets;
    }

    public final long getMoneyPlaced() {
        return this.moneyPlaced;
    }

    public final long getMoneyPotential() {
        return this.moneyPotential;
    }

    public final double getFinalCoeficient() {
        return this.finalCoeficient;
    }

    public final int getExpAdded() {
        return this.expAdded;
    }
}
