package sg.bigo.ads.u;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.AbstractC4964v;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.T0.q;
import sg.bigo.ads.U0.m;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.s0.AbstractC5459A;
import sg.bigo.ads.s0.C5460B;
import sg.bigo.ads.s0.t;
import sg.bigo.ads.s0.x;

/* renamed from: sg.bigo.ads.u.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5485f {

    /* renamed from: a, reason: collision with root package name */
    public final q f13330a;
    public final int b;
    public final int c;
    public final boolean d;
    public final List e;
    public final int f;
    public final sg.bigo.ads.C.l g;
    public final HashSet h = new HashSet();

    public C5485f(sg.bigo.ads.C.l lVar, q qVar, int i, int i2, int i3, boolean z, ArrayList arrayList) {
        this.g = lVar;
        this.f13330a = qVar;
        this.b = i;
        this.c = i3;
        this.d = z;
        this.e = arrayList;
        this.f = i2;
    }

    public static C5485f b(sg.bigo.ads.C.l lVar, q qVar) {
        if (lVar == null || qVar == null) {
            return null;
        }
        Integer a2 = z.a(qVar.a("endpage.ad_component_layout"));
        switch (a2 != null ? a2.intValue() : 0) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                Integer a3 = z.a(qVar.a("endpage.multi_img_load"));
                int intValue = a3 != null ? a3.intValue() : 0;
                Integer a4 = z.a(qVar.a("endpage.multi_img"));
                int a5 = AbstractC5488i.a(a4 != null ? a4.intValue() : 0);
                Integer a6 = z.a(qVar.a("endpage.multi_render_way"));
                int intValue2 = a6 != null ? a6.intValue() : 0;
                int i = 2;
                if (intValue2 != 2) {
                    i = 3;
                    if (intValue2 != 3) {
                        i = 1;
                    }
                }
                return a(lVar, qVar, intValue, a5, i, true, true);
            default:
                return null;
        }
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        if (A.a(this.e)) {
            return arrayList;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            arrayList.add(((C5484e) it.next()).f13329a);
        }
        return arrayList;
    }

    public static C5485f a(sg.bigo.ads.C.l lVar, q qVar) {
        int i;
        int i2;
        int i3;
        if (lVar == null || qVar == null) {
            return null;
        }
        Integer a2 = z.a(qVar.a("video_play_page.multi_img_load"));
        int intValue = a2 != null ? a2.intValue() : 0;
        Integer a3 = z.a(qVar.a("video_play_page.ad_component_layout"));
        switch (a3 != null ? a3.intValue() : 0) {
            case 13:
            case 18:
                i = 5;
                i2 = 1;
                i3 = 1;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                Integer a4 = z.a(qVar.a("video_play_page.multi_img"));
                int a5 = AbstractC5488i.a(a4 != null ? a4.intValue() : 0);
                Integer a6 = z.a(qVar.a("video_play_page.multi_render_way"));
                int intValue2 = a6 != null ? a6.intValue() : 0;
                int i4 = 2;
                if (intValue2 != 2) {
                    i4 = 3;
                    if (intValue2 != 3) {
                        i4 = 1;
                    }
                }
                Integer a7 = z.a(qVar.a("video_play_page.multi_method"));
                if (a7 != null) {
                    i2 = a7.intValue();
                    i = a5;
                } else {
                    i = a5;
                    i2 = 0;
                }
                i3 = i4;
                break;
            default:
                return null;
        }
        return a(lVar, qVar, intValue, i, i3, i2 == 1, false);
    }

    public final void b() {
        if (A.a(this.e)) {
            return;
        }
        for (C5484e c5484e : this.e) {
            String str = c5484e.f13329a;
            Context context = this.g.k.e;
            C5460B c5460b = AbstractC5459A.f13283a;
            c5460b.getClass();
            String valueOf = !TextUtils.isEmpty(null) ? null : String.valueOf(str.hashCode());
            if (t.a(context).a(valueOf) == null && !AbstractC4964v.a(c5460b.b(valueOf, context))) {
                if (x.a(str)) {
                    return;
                }
                sg.bigo.ads.C.l lVar = this.g;
                x.a(lVar.k.e, null, str, ((sg.bigo.ads.U0.b) ((InterfaceC5087a) lVar.e())).T, new C5483d(c5484e));
            }
        }
    }

    public static C5485f a(sg.bigo.ads.C.l lVar, q qVar, int i, int i2, int i3, boolean z, boolean z2) {
        boolean z3;
        ArrayList arrayList;
        boolean z4;
        ArrayList arrayList2 = null;
        if (i2 != 1 || z2) {
            sg.bigo.ads.P.b popPage = lVar.getPopPage();
            if (popPage != null) {
                String[] strArr = ((m) popPage).e;
                if (!A.c(strArr)) {
                    arrayList2 = new ArrayList();
                    for (String str : strArr) {
                        arrayList2.add(new C5484e(str));
                    }
                }
            }
            if (A.a(arrayList2) && (z || z2)) {
                arrayList2 = new ArrayList();
                sg.bigo.ads.U0.h[] hVarArr = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).z0;
                for (int i4 = 0; !A.c(hVarArr) && i4 < hVarArr.length; i4++) {
                    sg.bigo.ads.U0.h hVar = hVarArr[i4];
                    if (hVar != null && !I.a((CharSequence) hVar.c)) {
                        arrayList2.add(new C5484e(hVarArr[i4].c));
                    }
                }
            }
            if (A.a(arrayList2) && ((z || z2) && ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).p())) {
                arrayList2 = new ArrayList();
                String str2 = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).x0;
                if (!I.a((CharSequence) str2)) {
                    arrayList2.add(new C5484e(str2));
                }
            }
            if (A.a(arrayList2) && (z || z2)) {
                z3 = true;
                int i5 = (A.a(arrayList2) || z3) ? i2 : 1;
                if (i2 == 1 || !z2) {
                    arrayList = arrayList2;
                } else {
                    if (A.a(arrayList2)) {
                        arrayList = arrayList2;
                        z4 = true;
                        return new C5485f(lVar, qVar, i5, i, i3, z4, arrayList);
                    }
                    arrayList = new ArrayList(arrayList2.subList(0, 1));
                }
                z4 = z3;
                return new C5485f(lVar, qVar, i5, i, i3, z4, arrayList);
            }
        }
        z3 = false;
        if (A.a(arrayList2)) {
        }
        if (i2 == 1) {
        }
        arrayList = arrayList2;
        z4 = z3;
        return new C5485f(lVar, qVar, i5, i, i3, z4, arrayList);
    }

    public final void a(int i, String str) {
        if (A.a(this.e) || I.a((CharSequence) str)) {
            return;
        }
        for (C5484e c5484e : this.e) {
            if (str.equalsIgnoreCase(c5484e.f13329a)) {
                c5484e.b = i;
                return;
            }
        }
    }

    public final void a(int i, int i2) {
        String str = i + "_" + i2;
        if (this.h.contains(str)) {
            return;
        }
        this.h.add(str);
        AbstractC5446j.a(1, null, new RunnableC5482c(this, i, i2), 0L);
    }
}
