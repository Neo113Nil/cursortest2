package sg.bigo.ads.h;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.h.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5189n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5204s f12908a;

    public RunnableC5189n(AbstractC5204s abstractC5204s) {
        this.f12908a = abstractC5204s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0256, code lost:
    
        if (r4 == 9) goto L108;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Y0 y0 = this.f12908a.J;
        sg.bigo.ads.T0.q qVar = y0.e;
        Context context = y0.f12865a;
        if (qVar == null || context == null) {
            return;
        }
        Integer a2 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.show_time"));
        boolean z = false;
        int intValue = a2 != null ? a2.intValue() : 0;
        if (intValue < 0) {
            intValue = -1;
        }
        y0.O = intValue;
        if (intValue == 0) {
            y0.m = false;
            return;
        }
        W0 w0 = y0.K;
        w0.getClass();
        Integer a3 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.pop_layout"));
        w0.b = a3 != null ? a3.intValue() : 0;
        Integer a4 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.pop_method"));
        w0.f12859a = a4 != null ? a4.intValue() : 0;
        Integer a5 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.cta_color"));
        w0.c = a5 != null ? a5.intValue() : 0;
        T0 t0 = y0.J;
        t0.p = y0;
        Integer a6 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.is_cta_show_animation"));
        t0.e = (a6 != null ? a6.intValue() : 0) == 1;
        Integer a7 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.click_type"));
        t0.f12855a = a7 != null ? a7.intValue() : 0;
        Integer a8 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.ad_component_clickable_switch"));
        t0.b = (a8 != null ? a8.intValue() : 0) == 1;
        Integer a9 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.media_view_clickable_switch"));
        t0.c = (a9 != null ? a9.intValue() : 0) == 1;
        Integer a10 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.other_space_clickable_switch"));
        t0.d = (a10 != null ? a10.intValue() : 0) == 1;
        Integer a11 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.below_area_dp"));
        int intValue2 = a11 != null ? a11.intValue() : 0;
        if (intValue2 > 0) {
            t0.f = AbstractC4963u.a(context, intValue2);
        }
        Integer a12 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.below_area_clickable"));
        t0.g = (a12 != null ? a12.intValue() : 0) == 1;
        Integer a13 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.up_area_dp"));
        int intValue3 = a13 != null ? a13.intValue() : 0;
        if (intValue3 > 0) {
            t0.h = AbstractC4963u.a(context, intValue3);
        }
        Integer a14 = sg.bigo.ads.K0.z.a(qVar.a("mid_page.up_area_clickable"));
        t0.i = (a14 != null ? a14.intValue() : 0) == 1;
        t0.j = context.getResources().getDisplayMetrics().heightPixels;
        t0.n = new View(context);
        t0.o = new View(context);
        Context context2 = y0.f12865a;
        sg.bigo.ads.C.l lVar = y0.b;
        sg.bigo.ads.P.c cVar = y0.c;
        sg.bigo.ads.T0.q qVar2 = y0.e;
        if (context2 != null && lVar != null && cVar != null && qVar2 != null && !y0.p) {
            z = true;
        }
        if (z) {
            int i = y0.K.f12859a;
            ArrayList arrayList = new ArrayList();
            if (y0.u) {
                arrayList.add(2);
            } else {
                if (i == 1) {
                    arrayList.add(1);
                }
                if (i == 2) {
                    arrayList.add(1);
                    arrayList.add(2);
                    arrayList.add(3);
                    arrayList.add(4);
                }
                if (i == 3) {
                    arrayList.add(2);
                }
                if (i == 4) {
                    arrayList.add(2);
                    arrayList.add(3);
                    arrayList.add(1);
                    arrayList.add(4);
                }
                if (i == 5) {
                    arrayList.add(2);
                    arrayList.add(3);
                    arrayList.add(4);
                }
                if (i == 6) {
                    arrayList.add(3);
                }
                if (i == 7) {
                    arrayList.add(3);
                    arrayList.add(2);
                    arrayList.add(1);
                    arrayList.add(4);
                }
                if (i == 8) {
                    arrayList.add(3);
                    arrayList.add(2);
                    arrayList.add(4);
                }
            }
            arrayList.add(4);
            y0.A = arrayList;
            AbstractC5446j.b(new RunnableC5208t0(y0, context2, lVar, cVar));
        }
        D0 d0 = new D0(y0);
        int i2 = y0.O;
        if (i2 <= 0) {
            if (i2 == -1) {
                y0.F = d0;
            }
        } else {
            long j = i2 * 1000;
            y0.B = j;
            y0.E = d0;
            y0.C = SystemClock.elapsedRealtime();
            AbstractC5446j.a(d0);
            AbstractC5446j.a(2, null, d0, j);
        }
    }
}
