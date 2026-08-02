package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class SingleShopModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel meta;

    @SerializedName("response")
    private ShopItemModel shopItemModel;

    public MetaModel getMeta() {
        return this.meta;
    }

    public void setMeta(MetaModel meta) {
        this.meta = meta;
    }

    public ShopItemModel getShopItemModel() {
        return this.shopItemModel;
    }

    public void setShopItemModel(ShopItemModel shopItemModel) {
        this.shopItemModel = shopItemModel;
    }
}
