package org.betup.model.remote.entity.rank;

import com.google.gson.annotations.SerializedName;
import org.betup.model.remote.entity.country.CountryModel;

/* loaded from: classes2.dex */
public class RankUserModel {

    @SerializedName("change")
    private double change;

    @SerializedName("country")
    private CountryModel country;

    @SerializedName("id")
    private int id;

    @SerializedName("level")
    private int level;

    @SerializedName("name")
    private String name;

    @SerializedName("photo_url")
    private String photoUrl;

    @SerializedName("rank")
    private int rank;

    @SerializedName("reward_photo_url")
    private String rewardPhotoUrl;

    @SerializedName("reward_prize")
    private int rewardPrize;

    @SerializedName("reward_tickets")
    private int rewardTickets;

    @SerializedName("roi")
    private double roi;

    @SerializedName("type")
    private int type;

    public RankUserModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public RankUserModel() {
    }

    public double getRoi() {
        return this.roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public double getChange() {
        return this.change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public CountryModel getCountry() {
        return this.country;
    }

    public void setCountry(CountryModel country) {
        this.country = country;
    }

    public String getRewardPhotoUrl() {
        return this.rewardPhotoUrl;
    }

    public void setRewardPhotoUrl(String rewardPhotoUrl) {
        this.rewardPhotoUrl = rewardPhotoUrl;
    }

    public int getRewardPrize() {
        return this.rewardPrize;
    }

    public void setRewardPrize(int rewardPrize) {
        this.rewardPrize = rewardPrize;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public ItemType getItemType() {
        return ItemType.getFromInt(this.type);
    }

    public void setItemType(ItemType itemType) {
        this.type = itemType.getType();
    }

    public enum ItemType {
        ANY(1),
        ME(2),
        SEPARATOR(3),
        USER(4);

        private int type;

        ItemType(int type) {
            this.type = type;
        }

        public int getType() {
            return this.type;
        }

        public static ItemType getFromInt(int type) {
            if (type == 2) {
                return ME;
            }
            if (type == 3) {
                return SEPARATOR;
            }
            if (type != 4) {
                return ANY;
            }
            return USER;
        }
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return this.rank;
    }

    public int getRewardTickets() {
        return this.rewardTickets;
    }

    public void setRewardTickets(int rewardTickets) {
        this.rewardTickets = rewardTickets;
    }
}
