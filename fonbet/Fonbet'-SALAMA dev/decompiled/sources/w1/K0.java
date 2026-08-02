package w1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class K0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f17428a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f17429b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f17430c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f17431d;

    static {
        ArrayList arrayList = new ArrayList();
        f17431d = arrayList;
        arrayList.add("com.flurry.android.marketing.core.FlurryMarketingCoreModule");
        arrayList.add("com.flurry.android.marketing.FlurryMarketingModule");
        arrayList.add("com.flurry.android.config.killswitch.FlurryKillSwitchModule");
        arrayList.add("com.flurry.android.nativecrash.FlurryNativeCrashModule");
        arrayList.add("com.flurry.android.nativecrash.internal.FlurryNativeCrashModuleStreamingImpl");
        arrayList.add("com.flurry.android.FlurryAdModule");
        arrayList.add("com.flurry.android.ymadlite.YahooAdModule");
    }

    public static void a(Class cls) {
        "Register Ads ".concat(String.valueOf(cls));
        LinkedHashMap linkedHashMap = f17429b;
        synchronized (linkedHashMap) {
            linkedHashMap.put(cls, new J0(cls));
        }
    }

    public static void b(L0 l02) {
        "Register Add-On ".concat(String.valueOf(l02));
        if (l02 != null) {
            ArrayList arrayList = f17428a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((L0) it.next()).getClass().getSimpleName().equals(l02.getClass().getSimpleName())) {
                    l02.toString();
                    return;
                }
            }
            arrayList.add(l02);
        }
    }

    public static void c(Context context) {
        synchronized (f17430c) {
            try {
                Iterator it = f17428a.iterator();
                while (it.hasNext()) {
                    L0 l02 = (L0) it.next();
                    "Module list: ".concat(String.valueOf(l02));
                    LinkedHashMap linkedHashMap = f17430c;
                    if (linkedHashMap.containsKey(l02.getClass())) {
                        l02.getClass().toString();
                    } else {
                        l02.init(context);
                        linkedHashMap.put(l02.getClass(), l02);
                        l02.getClass().toString();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
