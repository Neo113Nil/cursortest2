package sg.bigo.ads.h0;

import java.util.HashMap;
import java.util.List;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(String str) {
        String str2;
        if (str == 0) {
            return;
        }
        if (str.getClass() == String.class) {
            HashMap hashMap = g.f12955a;
            C5228a c5228a = hashMap.containsKey(str) ? (C5228a) hashMap.get(str) : null;
            if (c5228a != null) {
                g.a(c5228a);
            } else {
                AbstractC5496a.a("TaskManager", "you add " + str + " to TaskQueue ?");
            }
            HashMap hashMap2 = g.f12955a;
            if (hashMap2.containsKey(str)) {
                hashMap2.remove(str);
                return;
            }
            return;
        }
        if (str instanceof List) {
            List<String> list = (List) str;
            if (list.size() > 0 && list.get(0).getClass() == String.class) {
                HashMap hashMap3 = g.f12955a;
                for (String str3 : list) {
                    HashMap hashMap4 = g.f12955a;
                    C5228a c5228a2 = hashMap4.containsKey(str3) ? (C5228a) hashMap4.get(str3) : null;
                    if (c5228a2 != null) {
                        g.a(c5228a2);
                    } else {
                        AbstractC5496a.a("TaskManager", "you add " + str3 + " to TaskQueue ?");
                    }
                    HashMap hashMap5 = g.f12955a;
                    if (hashMap5.containsKey(str3)) {
                        hashMap5.remove(str3);
                    }
                }
                return;
            }
            str2 = "argument of collect is only String";
        } else {
            str2 = "argument is only String or List ";
        }
        AbstractC5496a.a("DownloadHandler", str2);
    }
}
