package org.betup.model.remote.entity.billing;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UserOfferRequestModel {

    @SerializedName("environment")
    private String environment;

    @SerializedName("offer_token")
    private String offerToken;

    @SerializedName("product_id")
    private String productId;

    @SerializedName("purchase_token")
    private String purchaseToken;

    public UserOfferRequestModel(String purchaseToken, String offerToken, String productId, String environment) {
        this.purchaseToken = purchaseToken;
        this.offerToken = offerToken;
        this.productId = productId;
        this.environment = environment == null ? "environment" : environment;
    }

    public String getPurchaseToken() {
        return this.purchaseToken;
    }

    public void setPurchaseToken(String purchaseToken) {
        this.purchaseToken = purchaseToken;
    }

    public String getOfferToken() {
        return this.offerToken;
    }

    public void setOfferToken(String offerToken) {
        this.offerToken = offerToken;
    }

    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
