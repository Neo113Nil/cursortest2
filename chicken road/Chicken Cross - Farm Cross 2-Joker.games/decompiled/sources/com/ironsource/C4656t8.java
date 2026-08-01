package com.ironsource;

import android.util.Log;
import com.ironsource.C4430ge;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.t8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4656t8 {
    private static C4656t8 b;

    /* renamed from: a, reason: collision with root package name */
    private H5 f8676a;

    private C4656t8() {
    }

    private static C4656t8 a() {
        if (b == null) {
            b = new C4656t8();
        }
        return b;
    }

    public static void a(B5 b5, C4620r8 c4620r8) {
        if (b5 != null) {
            try {
                a().f8676a = new H5(b5, c4620r8);
            } catch (Exception e) {
                C4491k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    public static void a(C4430ge.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(C4430ge.a aVar, Map<String, Object> map) {
        H5 h5 = a().f8676a;
        if (h5 == null) {
            Log.d(C4761z5.f8791a, C4761z5.V);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.b));
        }
        h5.a(aVar.f8213a, map);
    }
}
