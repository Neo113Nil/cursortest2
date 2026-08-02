package com.visa.cbp;

/* loaded from: classes5.dex */
public interface getDeviceCerts {
    public static final java.lang.String BuildConfig = "/vas/dpe/devices/{serverDeviceID}/validateandgetkey";
    public static final java.lang.String ConfirmReplenishRequest = "serverDeviceID";
    public static final java.lang.String ReplenishAckRequest = "/vas/dpe/devices/{serverDeviceID}/servernonce";
    public static final java.lang.String ReplenishRequest = "assertion";
    public static final int getTokenInfo = 120;
    public static final java.lang.String setTokenInfo = "grant_type";
    public static final java.lang.String valueOf = "/apn/dpe/oauth2/token";
    public static final java.lang.String values = "/vas/dpe";

    @retrofit2.http.GET
    retrofit2.Call<com.visa.cbp.sdk.facade.KeyRamResponse> ReplenishAckRequest(@retrofit2.http.Url java.lang.String str, @retrofit2.http.HeaderMap java.util.Map<java.lang.String, java.lang.String> map);

    @retrofit2.http.GET
    retrofit2.Call<com.visa.cbp.sdk.facade.GetServerNonceResponse> values(@retrofit2.http.Url java.lang.String str, @retrofit2.http.HeaderMap java.util.Map<java.lang.String, java.lang.String> map);

    @retrofit2.http.POST
    retrofit2.Call<com.visa.cbp.sdk.facade.ValidateDeviceAndGetKramResponse> values(@retrofit2.http.Url java.lang.String str, @retrofit2.http.HeaderMap java.util.Map<java.lang.String, java.lang.String> map, @retrofit2.http.Body com.visa.cbp.sdk.facade.ValidateDeviceRequest validateDeviceRequest);

    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST
    retrofit2.Call<com.visa.cbp.sdk.facade.LoginResponse> values(@retrofit2.http.Url java.lang.String str, @retrofit2.http.HeaderMap java.util.Map<java.lang.String, java.lang.String> map, @retrofit2.http.Field("grant_type") java.lang.String str2, @retrofit2.http.Field("assertion") java.lang.String str3);
}
