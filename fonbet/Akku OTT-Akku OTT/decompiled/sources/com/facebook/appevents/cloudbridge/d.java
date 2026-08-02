package com.facebook.appevents.cloudbridge;

import android.content.SharedPreferences;
import com.facebook.G;
import com.facebook.internal.u;
import com.facebook.w;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class d {
    public static final d a = new d();
    public static final String b = d.class.getCanonicalName();
    public static boolean c;

    public static void a(HashMap hashMap) {
        SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        Object obj = hashMap.get("dataset_id");
        Object obj2 = hashMap.get("endpoint");
        Object obj3 = hashMap.get("access_key");
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("dataset_id", obj.toString());
        edit.putString("endpoint", obj2.toString());
        edit.putString("access_key", obj3.toString());
        edit.apply();
        u.Companion.getClass();
        u.a.b(G.d, b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
