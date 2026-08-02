package org.betup.model.remote.entity.promo;

/* loaded from: classes2.dex */
public class PromoDataModel {
    private String desc;
    private int icon;
    private String name;
    private String price;
    private PromoType type;

    public PromoDataModel(String name, String desc, String price, PromoType type, int icon) {
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.icon = icon;
        this.price = price;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getIcon() {
        return this.icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public PromoType getType() {
        return this.type;
    }

    public void setType(PromoType type) {
        this.type = type;
    }
}
