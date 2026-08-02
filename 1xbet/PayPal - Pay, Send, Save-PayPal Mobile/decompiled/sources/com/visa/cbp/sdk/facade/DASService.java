package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public interface DASService {

    /* loaded from: classes16.dex */
    public interface AuthenticateCallback {
        void onError(com.visa.cbp.setDeviceCerts setdevicecerts);

        void onResult(retrofit2.Response<com.visa.cbp.sdk.facade.LoginResponse> response);
    }

    public interface DeviceAttestationCallback {
        void onError(int i, java.lang.Exception exc);

        void onResult(int i, java.lang.String str);
    }

    /* loaded from: classes16.dex */
    public interface EnrollDeviceCallback {
        void onError(com.visa.cbp.setDeviceCerts setdevicecerts);

        void onResult(retrofit2.Response<com.visa.cbp.sdk.facade.EnrollDeviceDasResponse> response);
    }

    /* loaded from: classes16.dex */
    public interface GetKeyCallback {
        void onError(com.visa.cbp.setDeviceCerts setdevicecerts);

        void onResult(retrofit2.Response<com.visa.cbp.sdk.facade.KeyRamResponse> response);
    }

    public interface GetServerDataCallback {
        void onError(com.visa.cbp.setDeviceCerts setdevicecerts);

        void onError(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str);

        void onError(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str, java.lang.String str2);

        void onResult(retrofit2.Response<com.visa.cbp.sdk.facade.GetServerNonceResponse> response);
    }

    /* loaded from: classes16.dex */
    public interface HarmfulAppsCallback {
        void onError(int i, java.lang.Exception exc);

        void onResult(int i, java.util.List<com.google.android.gms.safetynet.HarmfulAppsData> list);
    }

    public interface LoginCallback {
        void onError(com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException visaPaymentSDKException);

        void onResult(retrofit2.Response<com.visa.cbp.sdk.facade.LoginResponse> response);
    }

    /* loaded from: classes16.dex */
    public interface ValidateKeyCallback {
        void onError(com.visa.cbp.setDeviceCerts setdevicecerts);

        void onError(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str);

        void onError(com.visa.cbp.setDeviceCerts setdevicecerts, java.lang.String str, java.lang.String str2);

        void onResult(retrofit2.Response<com.visa.cbp.sdk.facade.ValidateDeviceAndGetKramResponse> response);
    }

    /* loaded from: classes16.dex */
    public interface VerifyAppsCallback {
        void onError(int i, java.lang.Exception exc);

        void onResult(int i);
    }
}
