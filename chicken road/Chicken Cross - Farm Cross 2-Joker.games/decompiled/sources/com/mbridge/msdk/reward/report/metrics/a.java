package com.mbridge.msdk.reward.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.videocommon.setting.b;
import java.util.List;

/* compiled from: MetricsRewardReport.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f9751a;

    private a() {
    }

    public static a a() {
        if (f9751a == null) {
            synchronized (a.class) {
                if (f9751a == null) {
                    f9751a = new a();
                }
            }
        }
        return f9751a;
    }

    private void b(c cVar) {
        List<CampaignEx> o;
        if (cVar == null) {
            return;
        }
        try {
            int g = cVar.g();
            String B = cVar.B();
            if (TextUtils.isEmpty(B) && (o = cVar.o()) != null && o.size() > 0 && o.get(0) != null) {
                B = o.get(0).getCampaignUnitId();
                g = o.get(0).getAdType();
                cVar.a(g);
                cVar.n(B);
            }
            com.mbridge.msdk.videocommon.setting.c a2 = b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), B, g == 287);
            if (a2 != null) {
                cVar.m(a2.x());
                cVar.o(a2.a());
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void a(String str, c cVar) {
        try {
            a(cVar);
            b(cVar);
            d.b().b(cVar);
            d.b().b(str, cVar, null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void a(c cVar) {
        if (cVar == null) {
            try {
                cVar = new c();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        com.mbridge.msdk.videocommon.setting.a c = b.b().c();
        if (c != null) {
            cVar.l(c.a());
            cVar.k(c.f());
        }
    }
}
