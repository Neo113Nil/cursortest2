package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import io.sentry.protocol.Mechanism;
import java.util.List;
import org.betup.model.remote.entity.MetaModel;

/* loaded from: classes2.dex */
public class ShopModel {

    @SerializedName(Mechanism.JsonKeys.META)
    private MetaModel metaModel;

    @SerializedName("response")
    private List<ShopItemModel> shopItemModels;

    public MetaModel getMetaModel() {
        return this.metaModel;
    }

    public void setMetaModel(MetaModel metaModel) {
        this.metaModel = metaModel;
    }

    public List<ShopItemModel> getShopItemModels() {
        return this.shopItemModels;
    }

    public void setShopItemModels(List<ShopItemModel> shopItemModels) {
        this.shopItemModels = shopItemModels;
    }
}
