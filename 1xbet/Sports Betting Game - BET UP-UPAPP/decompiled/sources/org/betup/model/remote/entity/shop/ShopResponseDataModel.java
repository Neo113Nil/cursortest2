package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class ShopResponseDataModel {

    @SerializedName("amount")
    private long amount;

    @SerializedName("money_balance")
    private long moneyBalance;

    @SerializedName("shop_item")
    private ShopItemModel shopItemModel;

    @SerializedName("token")
    private String token;

    public ShopItemModel getShopItemModel() {
        return this.shopItemModel;
    }

    public void setShopItemModel(ShopItemModel shopItemModel) {
        this.shopItemModel = shopItemModel;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getMoneyBalance() {
        return this.moneyBalance;
    }

    public void setMoneyBalance(long moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    public long getAmount() {
        return this.amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
