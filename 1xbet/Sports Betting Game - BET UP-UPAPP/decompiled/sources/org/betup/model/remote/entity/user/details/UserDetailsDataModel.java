package org.betup.model.remote.entity.user.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.betup.model.remote.entity.country.CountryModel;

/* loaded from: classes2.dex */
public class UserDetailsDataModel {

    @SerializedName("country")
    private CountryModel country;

    @SerializedName("id")
    @Expose
    private Integer id;

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

    @SerializedName("photo_url")
    @Expose
    private String photoUrl;

    @SerializedName("rank")
    @Expose
    private int rank;

    @SerializedName("referralsCount")
    @Expose
    private int referralsCount;

    @SerializedName("username")
    @Expose
    private String username;

    @SerializedName("vip")
    private boolean vip;

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getReferralsCount() {
        return this.referralsCount;
    }

    public void setReferralsCount(int referralsCount) {
        this.referralsCount = referralsCount;
    }

    public CountryModel getCountry() {
        return this.country;
    }

    public void setCountry(CountryModel country) {
        this.country = country;
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

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
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
