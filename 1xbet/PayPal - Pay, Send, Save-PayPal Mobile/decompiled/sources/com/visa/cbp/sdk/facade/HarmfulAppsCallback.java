package com.visa.cbp.sdk.facade;

/* loaded from: classes16.dex */
public interface HarmfulAppsCallback {
    void onError(int i, java.lang.Exception exc);

    void onResult(int i, java.util.List<com.google.android.gms.safetynet.HarmfulAppsData> list);
}
