package com.chartboost.sdk.impl;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class o2 {
    public static boolean a(AtomicReference atomicReference, JSONObject jSONObject) {
        try {
            atomicReference.set(new com.chartboost.sdk.internal.Model.a(jSONObject));
            return true;
        } catch (Exception e) {
            mb.b("updateConfig: " + e, null);
            return false;
        }
    }

    public static boolean a(Context context) {
        try {
            if (context != null) {
                int checkSelfPermission = context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE");
                boolean z = context.checkSelfPermission("android.permission.INTERNET") != 0;
                boolean z2 = checkSelfPermission != 0;
                if (z) {
                    throw new RuntimeException("Please add the permission : android.permission.INTERNET in your android manifest.xml");
                }
                if (z2) {
                    throw new RuntimeException("Please add the permission : android.permission.ACCESS_NETWORK_STATE in your android manifest.xml");
                }
                return true;
            }
            throw new RuntimeException("Invalid activity context passed during intitalization");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
