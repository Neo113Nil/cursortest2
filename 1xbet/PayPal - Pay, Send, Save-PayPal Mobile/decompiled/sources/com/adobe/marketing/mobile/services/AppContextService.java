package com.adobe.marketing.mobile.services;

/* loaded from: classes7.dex */
public interface AppContextService {
    com.adobe.marketing.mobile.services.AppState getAppState();

    android.app.Application getApplication();

    android.content.Context getApplicationContext();

    android.net.ConnectivityManager getConnectivityManager();

    android.app.Activity getCurrentActivity();

    void setApplication(android.app.Application application);
}
