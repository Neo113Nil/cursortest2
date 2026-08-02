package org.betup.model.remote.entity.billing;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UserPurchaseRequestModel {

    @SerializedName("environment")
    private String environment;

    @SerializedName("product_id")
    private String productId;

    @SerializedName("purchase_token")
    private String purchaseToken;

    public UserPurchaseRequestModel(String purchaseToken, String productId, String environment) {
        this.purchaseToken = purchaseToken;
        this.productId = productId;
        this.environment = environment == null ? "GOOGLE_PLAY" : environment;
    }

    public String getPurchaseToken() {
        return this.purchaseToken;
    }

    public void setPurchaseToken(String purchaseToken) {
        this.purchaseToken = purchaseToken;
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
