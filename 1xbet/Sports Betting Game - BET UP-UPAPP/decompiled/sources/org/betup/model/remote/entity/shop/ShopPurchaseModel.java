package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class ShopPurchaseModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    @SerializedName("response")
    private ShopResponseDataModel shopResponseDataModel;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public ShopResponseDataModel getShopResponseDataModel() {
        return this.shopResponseDataModel;
    }

    public void setShopResponseDataModel(ShopResponseDataModel shopResponseDataModel) {
        this.shopResponseDataModel = shopResponseDataModel;
    }
}
