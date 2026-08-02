package com.android.volley.toolbox;

/* loaded from: classes7.dex */
public class AndroidAuthenticator implements com.android.volley.toolbox.Authenticator {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final android.accounts.Account getHighSpeedVideoFpsRanges;
    private final android.accounts.AccountManager getHighSpeedVideoSizes;

    public AndroidAuthenticator(android.content.Context context, android.accounts.Account account, java.lang.String str) {
        this(context, account, str, false);
    }

    public AndroidAuthenticator(android.content.Context context, android.accounts.Account account, java.lang.String str, boolean z) {
        this(android.accounts.AccountManager.get(context), account, str, z);
    }

    private AndroidAuthenticator(android.accounts.AccountManager accountManager, android.accounts.Account account, java.lang.String str, boolean z) {
        this.getHighSpeedVideoSizes = accountManager;
        this.getHighSpeedVideoFpsRanges = account;
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public android.accounts.Account getAccount() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String getAuthTokenType() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.android.volley.toolbox.Authenticator
    public java.lang.String getAuthToken() throws com.android.volley.AuthFailureError {
        java.lang.String str;
        android.accounts.AccountManagerFuture<android.os.Bundle> authToken = this.getHighSpeedVideoSizes.getAuthToken(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, null, null);
        try {
            android.os.Bundle result = authToken.getResult();
            if (!authToken.isDone() || authToken.isCancelled()) {
                str = null;
            } else {
                if (result.containsKey("intent")) {
                    throw new com.android.volley.AuthFailureError((android.content.Intent) result.getParcelable("intent"));
                }
                str = result.getString("authtoken");
            }
            if (str != null) {
                return str;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Got null auth token for type: ");
            sb.append(this.Camera2StreamConfigurationMap);
            throw new com.android.volley.AuthFailureError(sb.toString());
        } catch (java.lang.Exception e) {
            throw new com.android.volley.AuthFailureError("Error while retrieving auth token", e);
        }
    }

    @Override // com.android.volley.toolbox.Authenticator
    public void invalidateAuthToken(java.lang.String str) {
        this.getHighSpeedVideoSizes.invalidateAuthToken(this.getHighSpeedVideoFpsRanges.type, str);
    }
}
