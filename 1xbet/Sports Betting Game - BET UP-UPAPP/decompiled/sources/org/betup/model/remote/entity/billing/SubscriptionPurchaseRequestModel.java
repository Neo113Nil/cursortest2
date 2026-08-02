package org.betup.model.remote.entity.billing;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class SubscriptionPurchaseRequestModel {

    @SerializedName("environment")
    private String environment;

    @SerializedName("product_id")
    private String productId;

    @SerializedName("shop_response")
    private String shopResponse;

    public SubscriptionPurchaseRequestModel(String environment, String productId, String shopResponse) {
        this.environment = environment;
        this.productId = productId;
        this.shopResponse = shopResponse;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getShopResponse() {
        return this.shopResponse;
    }

    public void setShopResponse(String shopResponse) {
        this.shopResponse = shopResponse;
    }
}
