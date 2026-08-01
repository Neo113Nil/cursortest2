package sg.bigo.ads.n1;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.AbstractC5507g;
import sg.bigo.ads.x1.w;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.z1.p f13215a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final sg.bigo.ads.x1.f f;
    public sg.bigo.ads.m1.c g;
    public boolean h;
    public final Context i;
    public final ArrayList k;
    public final ArrayList l;
    public boolean e = false;
    public boolean j = false;

    public o(Context context, sg.bigo.ads.z1.p pVar, sg.bigo.ads.x1.f fVar) {
        ArrayList arrayList = new ArrayList(4);
        this.k = arrayList;
        ArrayList arrayList2 = new ArrayList(5);
        this.l = arrayList2;
        this.i = context;
        this.f13215a = pVar;
        this.f = fVar;
        arrayList.add(0);
        arrayList.add(25);
        arrayList.add(50);
        arrayList.add(75);
        arrayList2.add(2000);
        arrayList2.add(3000);
        arrayList2.add(5000);
        arrayList2.add(8000);
        arrayList2.add(10000);
    }

    public static String a(int i, String str) {
        if (I.a((CharSequence) str)) {
            return "";
        }
        try {
            return I.a(str, "ad_imp_indx=__ad_imp_indx__", "ad_imp_indx=" + i, true);
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String a(String str) {
        return I.a((CharSequence) str) ? "" : I.a(I.a(str, "[TIMESTAMP]", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).format(new Date()), true), "[CACHEBUSTING]", "" + (((int) (Math.random() * 9.0E7d)) + 10000000), true);
    }

    public final void a(sg.bigo.ads.z1.n nVar, String str) {
        String str2 = nVar.f13447a;
        if (!I.a((CharSequence) str2) && (!nVar.b || nVar.c)) {
            String a2 = a(str2);
            nVar.b = true;
            if (I.a((CharSequence) a2)) {
                return;
            }
            sg.bigo.ads.x1.f fVar = this.f;
            new w(fVar.g, fVar.e, fVar.h, str, a2, nVar.d).a(this.i, 0);
            return;
        }
        AbstractC5496a.a("VASTController", "invalidate tracking url or is tracked");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sg.bigo.ads.z1.n nVar, String str, sg.bigo.ads.P.c cVar, int i, int i2) {
        String a2;
        String str2 = nVar.f13447a;
        if (!I.a((CharSequence) str2) && (!nVar.b || nVar.c)) {
            String a3 = a(str2);
            if ("va_show".equals(str) && (cVar instanceof InterfaceC5087a) && a3.contains("ad_imp_indx=__ad_imp_indx__")) {
                a3 = a(((sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar)).b1.get(), a3);
            }
            if (("va_cli".equals(str) || "va_cpn_cli".equals(str)) && (cVar instanceof InterfaceC5087a)) {
                if (a3.contains("ad_click_indx=__ad_click_indx__")) {
                    int i3 = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar)).c1.get();
                    if (I.a((CharSequence) a3)) {
                        a3 = "";
                    } else {
                        try {
                            a3 = I.a(a3, "ad_click_indx=__ad_click_indx__", "ad_click_indx=" + i3, true);
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (a3.contains("ad_imp_indx=__ad_imp_indx__")) {
                    a3 = a(((sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar)).b1.get(), a3);
                }
                if (a3.contains("click_source=__click_source__")) {
                    a3 = I.a(a3, "click_source=__click_source__", "click_source=" + i, true);
                }
                if (a3.contains("click_module=__click_module__")) {
                    a2 = I.a(a3, "click_module=__click_module__", "click_module=" + i2, true);
                    nVar.b = true;
                    if (I.a((CharSequence) a2)) {
                        sg.bigo.ads.x1.f fVar = this.f;
                        new w(fVar.g, fVar.e, fVar.h, str, a2, nVar.d).a(this.i, 0);
                        return;
                    }
                    return;
                }
            }
            a2 = a3;
            nVar.b = true;
            if (I.a((CharSequence) a2)) {
            }
        } else {
            AbstractC5496a.a("VASTController", "invalidate tracking url or is tracked");
        }
    }

    public final void a(ArrayList arrayList, String str) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (str.equals("va_cpn_cli")) {
                this.e = true;
            }
            a((sg.bigo.ads.z1.n) it.next(), str);
            it.remove();
        }
    }

    public static void a(InterfaceC5087a interfaceC5087a, int i) {
        sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) interfaceC5087a;
        sg.bigo.ads.s1.b.c(i, kVar.F0, kVar.k(), kVar);
    }

    public static void a(Context context, int i, List list) {
        int i2;
        boolean z;
        if (i == 0) {
            throw null;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sg.bigo.ads.z1.n nVar = (sg.bigo.ads.z1.n) it.next();
                if (nVar != null) {
                    String str = nVar.f13447a;
                    if (I.a((CharSequence) str) || (nVar.b && !nVar.c)) {
                        AbstractC5496a.a("VASTController", "invalidate tracking url or is tracked");
                    } else {
                        sg.bigo.ads.B0.a aVar = new sg.bigo.ads.B0.a(new sg.bigo.ads.B0.d(str), context);
                        sg.bigo.ads.R0.j jVar = AbstractRunnableC5522h.e;
                        if (jVar != null) {
                            i2 = jVar.f;
                            z = jVar.a(11);
                        } else {
                            i2 = 10;
                            z = false;
                        }
                        aVar.c = AbstractRunnableC5522h.a("TrackerNet", i2, z);
                        AbstractC5507g.a(aVar, null);
                    }
                }
            }
        }
    }
}
