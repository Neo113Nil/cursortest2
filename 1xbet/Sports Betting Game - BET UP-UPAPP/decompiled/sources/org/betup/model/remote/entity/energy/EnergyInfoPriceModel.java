package org.betup.model.remote.entity.energy;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: EnergyInfoPriceModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lorg/betup/model/remote/entity/energy/EnergyInfoPriceModel;", "", "betlistCost", "", "challengeCost", "competitionCost", "videoReward", "ticketExchangeRate", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIIII)V", "getBetlistCost", "()I", "getChallengeCost", "getCompetitionCost", "getVideoReward", "getTicketExchangeRate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EnergyInfoPriceModel {
    public static final int $stable = 0;

    @SerializedName("betlist_cost")
    private final int betlistCost;

    @SerializedName("challenge_cost")
    private final int challengeCost;

    @SerializedName("competition_cost")
    private final int competitionCost;

    @SerializedName("ticket_exchange_rate")
    private final int ticketExchangeRate;

    @SerializedName("video_reward")
    private final int videoReward;

    public static /* synthetic */ EnergyInfoPriceModel copy$default(EnergyInfoPriceModel energyInfoPriceModel, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = energyInfoPriceModel.betlistCost;
        }
        if ((i6 & 2) != 0) {
            i2 = energyInfoPriceModel.challengeCost;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = energyInfoPriceModel.competitionCost;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = energyInfoPriceModel.videoReward;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = energyInfoPriceModel.ticketExchangeRate;
        }
        return energyInfoPriceModel.copy(i, i7, i8, i9, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBetlistCost() {
        return this.betlistCost;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChallengeCost() {
        return this.challengeCost;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCompetitionCost() {
        return this.competitionCost;
    }

    /* renamed from: component4, reason: from getter */
    public final int getVideoReward() {
        return this.videoReward;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTicketExchangeRate() {
        return this.ticketExchangeRate;
    }

    public final EnergyInfoPriceModel copy(int betlistCost, int challengeCost, int competitionCost, int videoReward, int ticketExchangeRate) {
        return new EnergyInfoPriceModel(betlistCost, challengeCost, competitionCost, videoReward, ticketExchangeRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnergyInfoPriceModel)) {
            return false;
        }
        EnergyInfoPriceModel energyInfoPriceModel = (EnergyInfoPriceModel) other;
        return this.betlistCost == energyInfoPriceModel.betlistCost && this.challengeCost == energyInfoPriceModel.challengeCost && this.competitionCost == energyInfoPriceModel.competitionCost && this.videoReward == energyInfoPriceModel.videoReward && this.ticketExchangeRate == energyInfoPriceModel.ticketExchangeRate;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.betlistCost) * 31) + Integer.hashCode(this.challengeCost)) * 31) + Integer.hashCode(this.competitionCost)) * 31) + Integer.hashCode(this.videoReward)) * 31) + Integer.hashCode(this.ticketExchangeRate);
    }

    public String toString() {
        return "EnergyInfoPriceModel(betlistCost=" + this.betlistCost + ", challengeCost=" + this.challengeCost + ", competitionCost=" + this.competitionCost + ", videoReward=" + this.videoReward + ", ticketExchangeRate=" + this.ticketExchangeRate + ")";
    }

    public EnergyInfoPriceModel(int i, int i2, int i3, int i4, int i5) {
        this.betlistCost = i;
        this.challengeCost = i2;
        this.competitionCost = i3;
        this.videoReward = i4;
        this.ticketExchangeRate = i5;
    }

    public final int getBetlistCost() {
        return this.betlistCost;
    }

    public final int getChallengeCost() {
        return this.challengeCost;
    }

    public final int getCompetitionCost() {
        return this.competitionCost;
    }

    public final int getVideoReward() {
        return this.videoReward;
    }

    public final int getTicketExchangeRate() {
        return this.ticketExchangeRate;
    }
}
