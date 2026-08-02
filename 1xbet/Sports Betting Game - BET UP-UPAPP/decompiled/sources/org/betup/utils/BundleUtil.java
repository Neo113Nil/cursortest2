package org.betup.utils;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class BundleUtil {
    private BundleUtil() {
    }

    public static Map<String, String> bundleToMap(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                hashMap.put(str, obj.toString());
            }
        }
        return hashMap;
    }

    public static Bundle mapToBundle(Map<String, String> data) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : data.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }
}
