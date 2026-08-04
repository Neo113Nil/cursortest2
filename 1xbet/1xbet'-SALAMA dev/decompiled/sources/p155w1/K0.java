package p155w1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f17434a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f17435b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f17436c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f17437d;

    static {
        ArrayList arrayList = new ArrayList();
        f17437d = arrayList;
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
        LinkedHashMap linkedHashMap = f17435b;
        synchronized (linkedHashMap) {
            linkedHashMap.put(cls, new J0(cls));
        }
    }

    public static void b(L0 l7) {
        "Register Add-On ".concat(String.valueOf(l7));
        if (l7 != null) {
            ArrayList arrayList = f17434a;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((L0) it.next()).getClass().getSimpleName().equals(l7.getClass().getSimpleName())) {
                    l7.toString();
                    return;
                }
            }
            arrayList.add(l7);
        }
    }

    public static void c(Context context) {
        synchronized (f17436c) {
            try {
                for (L0 l7 : f17434a) {
                    "Module list: ".concat(String.valueOf(l7));
                    LinkedHashMap linkedHashMap = f17436c;
                    if (linkedHashMap.containsKey(l7.getClass())) {
                        l7.getClass().toString();
                    } else {
                        l7.init(context);
                        linkedHashMap.put(l7.getClass(), l7);
                        l7.getClass().toString();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
