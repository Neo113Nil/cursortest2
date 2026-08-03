package com.facebook.ads.internal.api;

/* loaded from: classes2.dex */
public interface AudienceNetworkRemoteServiceApi {

    public interface MessageHandler {
        boolean handleMessage(android.os.Message message);
    }

    public interface PackageVerifier {
        java.lang.String verifyPackage(android.content.Context context, android.os.Message message, java.lang.String str);
    }

    android.os.IBinder onBind(android.content.Intent intent);

    void onCreate();

    void onDestroy();

    void setMessageHandler(com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi.MessageHandler messageHandler);

    void setPackageVerifier(com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi.PackageVerifier packageVerifier);
}
