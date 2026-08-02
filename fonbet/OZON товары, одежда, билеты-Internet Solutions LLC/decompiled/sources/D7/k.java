package D7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap f6106a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        f6106a = new HashMap();
        new n("PlayCoreVersion");
    }

    public static synchronized Map a() {
        Map map;
        synchronized (k.class) {
            try {
                HashMap hashMap = f6106a;
                if (!hashMap.containsKey("app_update")) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("java", 11004);
                    hashMap.put("app_update", hashMap2);
                }
                map = (Map) hashMap.get("app_update");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }
}
