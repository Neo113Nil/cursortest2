package com.visa.cbp.sdk.facade.data;

/* loaded from: classes5.dex */
public enum IdStore {
    DEVICE_ID("device_id", false),
    API_KEY("api_key", true),
    V_CLIENT_ID("v_client_id", false),
    V_CLIENT_APP_ID("v_client_app_id", false),
    CLIENT_WALLET_ACCOUNT_ID("client_wallet_account_id", false);

    public static final java.lang.String TAG = "IdStore";
    private boolean canOverride;
    private java.lang.String idName;

    IdStore(java.lang.String str, boolean z) {
        this.canOverride = z;
        this.idName = str;
    }

    public final boolean canOverride() {
        return this.canOverride;
    }

    public final java.lang.String getIdName() {
        return this.idName;
    }
}
