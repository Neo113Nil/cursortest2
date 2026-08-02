package org.betup.model.remote.entity.shop;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.ironsource.X3;
import org.betup.ui.fragment.shop.ShopItemType;

/* loaded from: classes2.dex */
public class ShopItemModel {

    @SerializedName("available")
    private boolean available;

    @SerializedName("betcoins")
    private long betcoins;

    @SerializedName("bonus")
    private long bonus;

    @SerializedName("bonusIcon")
    private String bonusIcon;

    @SerializedName("color")
    private String color;

    @SerializedName(FirebaseAnalytics.Param.DISCOUNT)
    private int discount;

    @SerializedName("effect")
    private ShopEffectModel effect;

    @SerializedName("effect_duration")
    private Integer effectDuration;

    @SerializedName(X3.i.H0)
    private String icon;

    @SerializedName("id")
    private int id;

    @SerializedName("top_label_index")
    private int index;
    private String name;

    @SerializedName("no_ads")
    private boolean noAds;

    @SerializedName("open_bets")
    private boolean openBets;
    private transient String price;

    @SerializedName("itemType")
    private ShopItemType shopItemType;

    @SerializedName("store_code")
    private String storeCode;

    @SerializedName("tickets")
    private long tickets;

    @SerializedName("title_text")
    private String titleText;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean hasBonus() {
        return this.bonus > 0;
    }

    public boolean hasDiscount() {
        return this.discount > 0;
    }

    public boolean hasLabel() {
        return this.index >= 0;
    }

    public long getBonus() {
        return this.bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getBonusIcon() {
        return this.bonusIcon;
    }

    public void setBonusIcon(String bonusIcon) {
        this.bonusIcon = bonusIcon;
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

    public long getTickets() {
        return this.tickets;
    }

    public void setTickets(long tickets) {
        this.tickets = tickets;
    }

    public long getBetcoins() {
        return this.betcoins;
    }

    public void setBetcoins(long betcoins) {
        this.betcoins = betcoins;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setItemType(ShopItemType shopItemType) {
        this.shopItemType = shopItemType;
    }

    public ShopItemType getShopItemType() {
        return this.shopItemType;
    }

    public void setShopItemType(ShopItemType shopItemType) {
        this.shopItemType = shopItemType;
    }

    public ShopEffectModel getEffect() {
        return this.effect;
    }

    public void setEffect(ShopEffectModel effect) {
        this.effect = effect;
    }

    public Integer getEffectDuration() {
        return this.effectDuration;
    }

    public void setEffectDuration(Integer effectDuration) {
        this.effectDuration = effectDuration;
    }

    public boolean isNoAds() {
        return this.noAds;
    }

    public void setNoAds(boolean noAds) {
        this.noAds = noAds;
    }

    public String getTitleText() {
        return this.titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpenBets() {
        return this.openBets;
    }

    public void setOpenBets(boolean openBets) {
        this.openBets = openBets;
    }
}
