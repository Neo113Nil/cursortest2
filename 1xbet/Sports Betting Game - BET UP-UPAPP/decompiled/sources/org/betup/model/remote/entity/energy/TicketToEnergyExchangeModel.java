package org.betup.model.remote.entity.energy;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TicketToEnergyExchangeModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0010HÆ\u0003J\u0095\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001J\u0013\u00105\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0016\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#¨\u0006:"}, d2 = {"Lorg/betup/model/remote/entity/energy/TicketToEnergyExchangeModel;", "", "currentEnergy", "", "maxEnergy", "moneyBalance", "moneyInplay", "moneyPotential", "experience", "levelStartExp", "ticketReward", "moneyToNext", "maxBetsPerDay", "maxMoneyPlace", "", "dailyBonus", "", "tickets", "vip", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIIIIIIIIIDZIZ)V", "getCurrentEnergy", "()I", "getMaxEnergy", "getMoneyBalance", "getMoneyInplay", "getMoneyPotential", "getExperience", "getLevelStartExp", "getTicketReward", "getMoneyToNext", "getMaxBetsPerDay", "getMaxMoneyPlace", "()D", "getDailyBonus", "()Z", "getTickets", "getVip", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TicketToEnergyExchangeModel {
    public static final int $stable = 0;

    @SerializedName("currentEnergy")
    private final int currentEnergy;

    @SerializedName("dailyBonus")
    private final boolean dailyBonus;

    @SerializedName("experience")
    private final int experience;

    @SerializedName("levelStartExp")
    private final int levelStartExp;

    @SerializedName("max_bets_per_day")
    private final int maxBetsPerDay;

    @SerializedName("maxEnergy")
    private final int maxEnergy;

    @SerializedName("max_money_place")
    private final double maxMoneyPlace;

    @SerializedName("money_balance")
    private final int moneyBalance;

    @SerializedName("money_inplay")
    private final int moneyInplay;

    @SerializedName("money_potential")
    private final int moneyPotential;

    @SerializedName("money_to_next")
    private final int moneyToNext;

    @SerializedName("ticket_reward")
    private final int ticketReward;

    @SerializedName("tickets")
    private final int tickets;

    @SerializedName("vip")
    private final boolean vip;

    /* renamed from: component1, reason: from getter */
    public final int getCurrentEnergy() {
        return this.currentEnergy;
    }

    /* renamed from: component10, reason: from getter */
    public final int getMaxBetsPerDay() {
        return this.maxBetsPerDay;
    }

    /* renamed from: component11, reason: from getter */
    public final double getMaxMoneyPlace() {
        return this.maxMoneyPlace;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getDailyBonus() {
        return this.dailyBonus;
    }

    /* renamed from: component13, reason: from getter */
    public final int getTickets() {
        return this.tickets;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getVip() {
        return this.vip;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxEnergy() {
        return this.maxEnergy;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMoneyBalance() {
        return this.moneyBalance;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMoneyInplay() {
        return this.moneyInplay;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMoneyPotential() {
        return this.moneyPotential;
    }

    /* renamed from: component6, reason: from getter */
    public final int getExperience() {
        return this.experience;
    }

    /* renamed from: component7, reason: from getter */
    public final int getLevelStartExp() {
        return this.levelStartExp;
    }

    /* renamed from: component8, reason: from getter */
    public final int getTicketReward() {
        return this.ticketReward;
    }

    /* renamed from: component9, reason: from getter */
    public final int getMoneyToNext() {
        return this.moneyToNext;
    }

    public final TicketToEnergyExchangeModel copy(int currentEnergy, int maxEnergy, int moneyBalance, int moneyInplay, int moneyPotential, int experience, int levelStartExp, int ticketReward, int moneyToNext, int maxBetsPerDay, double maxMoneyPlace, boolean dailyBonus, int tickets, boolean vip) {
        return new TicketToEnergyExchangeModel(currentEnergy, maxEnergy, moneyBalance, moneyInplay, moneyPotential, experience, levelStartExp, ticketReward, moneyToNext, maxBetsPerDay, maxMoneyPlace, dailyBonus, tickets, vip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketToEnergyExchangeModel)) {
            return false;
        }
        TicketToEnergyExchangeModel ticketToEnergyExchangeModel = (TicketToEnergyExchangeModel) other;
        return this.currentEnergy == ticketToEnergyExchangeModel.currentEnergy && this.maxEnergy == ticketToEnergyExchangeModel.maxEnergy && this.moneyBalance == ticketToEnergyExchangeModel.moneyBalance && this.moneyInplay == ticketToEnergyExchangeModel.moneyInplay && this.moneyPotential == ticketToEnergyExchangeModel.moneyPotential && this.experience == ticketToEnergyExchangeModel.experience && this.levelStartExp == ticketToEnergyExchangeModel.levelStartExp && this.ticketReward == ticketToEnergyExchangeModel.ticketReward && this.moneyToNext == ticketToEnergyExchangeModel.moneyToNext && this.maxBetsPerDay == ticketToEnergyExchangeModel.maxBetsPerDay && Double.compare(this.maxMoneyPlace, ticketToEnergyExchangeModel.maxMoneyPlace) == 0 && this.dailyBonus == ticketToEnergyExchangeModel.dailyBonus && this.tickets == ticketToEnergyExchangeModel.tickets && this.vip == ticketToEnergyExchangeModel.vip;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.currentEnergy) * 31) + Integer.hashCode(this.maxEnergy)) * 31) + Integer.hashCode(this.moneyBalance)) * 31) + Integer.hashCode(this.moneyInplay)) * 31) + Integer.hashCode(this.moneyPotential)) * 31) + Integer.hashCode(this.experience)) * 31) + Integer.hashCode(this.levelStartExp)) * 31) + Integer.hashCode(this.ticketReward)) * 31) + Integer.hashCode(this.moneyToNext)) * 31) + Integer.hashCode(this.maxBetsPerDay)) * 31) + Double.hashCode(this.maxMoneyPlace)) * 31) + Boolean.hashCode(this.dailyBonus)) * 31) + Integer.hashCode(this.tickets)) * 31) + Boolean.hashCode(this.vip);
    }

    public String toString() {
        return "TicketToEnergyExchangeModel(currentEnergy=" + this.currentEnergy + ", maxEnergy=" + this.maxEnergy + ", moneyBalance=" + this.moneyBalance + ", moneyInplay=" + this.moneyInplay + ", moneyPotential=" + this.moneyPotential + ", experience=" + this.experience + ", levelStartExp=" + this.levelStartExp + ", ticketReward=" + this.ticketReward + ", moneyToNext=" + this.moneyToNext + ", maxBetsPerDay=" + this.maxBetsPerDay + ", maxMoneyPlace=" + this.maxMoneyPlace + ", dailyBonus=" + this.dailyBonus + ", tickets=" + this.tickets + ", vip=" + this.vip + ")";
    }

    public TicketToEnergyExchangeModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, double d, boolean z, int i11, boolean z2) {
        this.currentEnergy = i;
        this.maxEnergy = i2;
        this.moneyBalance = i3;
        this.moneyInplay = i4;
        this.moneyPotential = i5;
        this.experience = i6;
        this.levelStartExp = i7;
        this.ticketReward = i8;
        this.moneyToNext = i9;
        this.maxBetsPerDay = i10;
        this.maxMoneyPlace = d;
        this.dailyBonus = z;
        this.tickets = i11;
        this.vip = z2;
    }

    public final int getCurrentEnergy() {
        return this.currentEnergy;
    }

    public final int getMaxEnergy() {
        return this.maxEnergy;
    }

    public final int getMoneyBalance() {
        return this.moneyBalance;
    }

    public final int getMoneyInplay() {
        return this.moneyInplay;
    }

    public final int getMoneyPotential() {
        return this.moneyPotential;
    }

    public final int getExperience() {
        return this.experience;
    }

    public final int getLevelStartExp() {
        return this.levelStartExp;
    }

    public final int getTicketReward() {
        return this.ticketReward;
    }

    public final int getMoneyToNext() {
        return this.moneyToNext;
    }

    public final int getMaxBetsPerDay() {
        return this.maxBetsPerDay;
    }

    public final double getMaxMoneyPlace() {
        return this.maxMoneyPlace;
    }

    public final boolean getDailyBonus() {
        return this.dailyBonus;
    }

    public final int getTickets() {
        return this.tickets;
    }

    public final boolean getVip() {
        return this.vip;
    }
}
