package e5;

import T4.u;
import android.util.Log;
import g4.AbstractC0476u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f5530a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f5531b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = u.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(u.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(a5.h.class.getName(), "okhttp.Http2");
        linkedHashMap.put(W4.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f5531b = AbstractC0476u.d0(linkedHashMap);
    }

    public static void a(String str, int i2, String str2, Throwable th) {
        int min;
        String str3 = (String) f5531b.get(str);
        if (str3 == null) {
            str3 = B4.k.l0(23, str);
        }
        if (Log.isLoggable(str3, i2)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i3 = 0;
            while (i3 < length) {
                int W5 = B4.k.W(str2, '\n', i3, false, 4);
                if (W5 == -1) {
                    W5 = length;
                }
                while (true) {
                    min = Math.min(W5, i3 + 4000);
                    String substring = str2.substring(i3, min);
                    kotlin.jvm.internal.i.d(substring, "substring(...)");
                    Log.println(i2, str3, substring);
                    if (min >= W5) {
                        break;
                    } else {
                        i3 = min;
                    }
                }
                i3 = min + 1;
            }
        }
    }
}
