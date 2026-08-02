package org.betup.model.remote.entity.user.homescreen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.betup.model.remote.entity.user.UserNumbersModel;

/* loaded from: classes2.dex */
public class HomeScreenUserOfTheDayDataModel {

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("level")
    @Expose
    private int level;

    @SerializedName("money_balance")
    @Expose
    private long moneyBalance;

    @SerializedName("money_inplay")
    @Expose
    private long moneyInplay;

    @SerializedName("money_potential")
    @Expose
    private long moneyPotential;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("numbers")
    @Expose
    private UserNumbersModel numbers;

    @SerializedName("photo_url")
    @Expose
    private String photoUrl;

    @SerializedName("rank")
    @Expose
    private Integer rank;

    @SerializedName("username")
    @Expose
    private String username;

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Integer getRank() {
        return this.rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public UserNumbersModel getNumbers() {
        return this.numbers;
    }

    public void setNumbers(UserNumbersModel numbers) {
        this.numbers = numbers;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMoneyBalance() {
        return this.moneyBalance;
    }

    public void setMoneyBalance(long moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    public long getMoneyInplay() {
        return this.moneyInplay;
    }

    public void setMoneyInplay(long moneyInplay) {
        this.moneyInplay = moneyInplay;
    }

    public long getMoneyPotential() {
        return this.moneyPotential;
    }

    public void setMoneyPotential(long moneyPotential) {
        this.moneyPotential = moneyPotential;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
