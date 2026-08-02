package Ue;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.danlew.android.joda.R$raw;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap f27623a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f27624b = 0;

    public static int a(String str) {
        Map map;
        ConcurrentHashMap concurrentHashMap = f27623a;
        if (concurrentHashMap.containsKey(R$raw.class)) {
            map = (Map) concurrentHashMap.get(R$raw.class);
        } else {
            map = new ConcurrentHashMap();
            concurrentHashMap.put(R$raw.class, map);
        }
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        try {
            int i11 = R$raw.class.getField(str).getInt(null);
            if (i11 == 0) {
                return i11;
            }
            map.put(str, Integer.valueOf(i11));
            return i11;
        } catch (Exception e11) {
            Log.e("JodaTimeAndroid", "Failed to retrieve identifier: type=" + R$raw.class + " name=" + str, e11);
            return 0;
        }
    }
}
