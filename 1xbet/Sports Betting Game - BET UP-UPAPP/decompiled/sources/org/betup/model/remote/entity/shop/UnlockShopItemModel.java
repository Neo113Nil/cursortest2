package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UnlockShopItemModel {

    @SerializedName("available")
    private boolean available;

    @SerializedName("bonus")
    private long bonus;
    private transient int iconRes;

    @SerializedName("id")
    private int id;

    @SerializedName("store_code")
    private String storeCode;

    @SerializedName("tickets")
    private int tickets;
    private transient String title;

    public int getIconRes() {
        return this.iconRes;
    }

    public void setIconRes(int iconRes) {
        this.iconRes = iconRes;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public int getTickets() {
        return this.tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public long getBonus() {
        return this.bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
