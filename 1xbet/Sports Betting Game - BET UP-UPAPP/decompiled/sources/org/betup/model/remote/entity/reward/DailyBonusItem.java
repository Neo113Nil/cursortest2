package org.betup.model.remote.entity.reward;

import com.google.gson.annotations.SerializedName;
import org.betup.model.remote.entity.shop.RewardState;

/* loaded from: classes2.dex */
public class DailyBonusItem {

    @SerializedName("betcoin_bonus")
    private Long betcoins;

    @SerializedName("day_number")
    private Integer dayNumber;

    @SerializedName("id")
    private Integer id;

    @SerializedName("photo_url")
    private String photoUrl;

    @SerializedName("state")
    private RewardState state;

    @SerializedName("ticket_bonus")
    private Long tickets;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDayNumber() {
        return this.dayNumber;
    }

    public void setDayNumber(Integer dayNumber) {
        this.dayNumber = dayNumber;
    }

    public Long getBetcoins() {
        return this.betcoins;
    }

    public void setBetcoins(Long betcoins) {
        this.betcoins = betcoins;
    }

    public Long getTickets() {
        return this.tickets;
    }

    public void setTickets(Long tickets) {
        this.tickets = tickets;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public RewardState getState() {
        return this.state;
    }

    public void setState(RewardState state) {
        this.state = state;
    }
}
