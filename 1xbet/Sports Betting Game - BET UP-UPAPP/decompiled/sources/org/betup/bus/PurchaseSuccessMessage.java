package org.betup.bus;

import org.betup.model.remote.entity.shop.ShopItemModel;

/* loaded from: classes2.dex */
public class PurchaseSuccessMessage {
    private ShopItemModel shopItemModel;

    public ShopItemModel getShopItemModel() {
        return this.shopItemModel;
    }

    public PurchaseSuccessMessage(ShopItemModel shopItemModel) {
        this.shopItemModel = shopItemModel;
    }
}
