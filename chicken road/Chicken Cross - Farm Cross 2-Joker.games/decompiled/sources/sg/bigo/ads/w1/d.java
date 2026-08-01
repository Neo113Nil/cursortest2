package sg.bigo.ads.w1;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.facebook.login.LoginLogger;
import java.util.HashMap;
import java.util.Map;
import sg.bigo.ads.O.g;
import sg.bigo.ads.R0.j;
import sg.bigo.ads.e.AbstractC5081e;
import sg.bigo.ads.x0.AbstractC5507g;
import sg.bigo.ads.x0.InterfaceC5501a;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public abstract class d {
    public static void a(int i, String str, String str2, InterfaceC5501a interfaceC5501a, String str3, boolean z, int i2, int i3, Map map, int i4, String str4, boolean z2) {
        HashMap hashMap;
        if (map == null) {
            map = new HashMap();
        }
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        hashMap = new HashMap(map);
        hashMap.put("action", str);
        hashMap.put("track_url", interfaceC5501a.a());
        hashMap.put("domain_front", interfaceC5501a.c() ? interfaceC5501a.b() : "");
        hashMap.put("track_name", str3);
        hashMap.put("states", str2);
        AbstractC5081e.a(hashMap, "src", z ? "1" : "0", i4, "res_code");
        if (str4 == null) {
            str4 = "";
        }
        AbstractC5081e.a(hashMap, "res_msg", str4, i2, "retry");
        hashMap.put("out_ad", String.valueOf(i3));
        hashMap.put("replace", String.valueOf(i));
        str.getClass();
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "va_cpn_cli":
            case "va_cli":
            case "click_track":
                if (z2) {
                    hashMap.put("auto_click_tracker", "1");
                }
                sg.bigo.ads.s1.b.a("06002014", hashMap);
                break;
            case "va_cpn_imp":
            case "impl_track":
            case "va_show":
                sg.bigo.ads.s1.b.a("06002013", hashMap);
                break;
        }
    }

    public static void a(Context context, int i, String str, sg.bigo.ads.B0.d dVar, String str2, boolean z, int i2, boolean z2, int i3, Map map, c cVar) {
        int i4;
        boolean z3;
        if (sg.bigo.ads.F0.a.f()) {
            return;
        }
        dVar.a();
        if (g.f12472a.B.a(9) && URLUtil.isHttpUrl(dVar.a())) {
            a(i, str, LoginLogger.EVENT_EXTRAS_FAILURE, dVar, str2, z2, i3, i2, map, 901, "Invalid http url", z);
            return;
        }
        a(i, str, "start", dVar, str2, z2, i3, i2, map, 0, "", z);
        sg.bigo.ads.B0.a aVar = new sg.bigo.ads.B0.a(dVar, context);
        j jVar = AbstractRunnableC5522h.e;
        if (jVar != null) {
            i4 = jVar.f;
            z3 = jVar.a(11);
        } else {
            i4 = 10;
            z3 = false;
        }
        aVar.c = AbstractRunnableC5522h.a("TrackerNet", i4, z3);
        AbstractC5507g.a(aVar, new b(cVar, i, str, dVar, str2, z2, i3, i2, map, z));
    }
}
