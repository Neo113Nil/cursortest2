package sg.bigo.ads.f0;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.K0.AbstractC4964v;
import sg.bigo.ads.K0.H;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.g0.C5123a;
import sg.bigo.ads.h0.C5228a;
import sg.bigo.ads.n1.n;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f12787a;
    public final CopyOnWriteArrayList b;
    public final CopyOnWriteArrayList c;
    public final CopyOnWriteArrayList d;
    public final C5123a e;
    public final g f;
    public final Context g;

    public h(Context context, C5123a c5123a, boolean z, n nVar) {
        sg.bigo.ads.h0.c cVar;
        this.g = context;
        this.f = nVar;
        synchronized (sg.bigo.ads.h0.c.class) {
            if (sg.bigo.ads.h0.c.f12951a == null) {
                synchronized (sg.bigo.ads.h0.c.class) {
                    if (sg.bigo.ads.h0.c.f12951a == null) {
                        sg.bigo.ads.h0.c.a(z);
                    }
                }
            }
            cVar = sg.bigo.ads.h0.c.f12951a;
        }
        sg.bigo.ads.h0.f.f12954a = cVar;
        this.e = c5123a;
        this.f12787a = new CopyOnWriteArrayList();
        this.b = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
    }

    public final void a(C5115b c5115b) {
        if (!c5115b.p) {
            this.c.add(c5115b);
            return;
        }
        int i = 0;
        while (i < this.c.size() && ((C5115b) this.c.get(i)).p) {
            i++;
        }
        this.c.add(i, c5115b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, C5115b c5115b) {
        C5228a c5228a;
        HashMap hashMap;
        CopyOnWriteArrayList copyOnWriteArrayList;
        String str;
        c5115b.n = SystemClock.elapsedRealtime();
        c5115b.toString();
        String str2 = c5115b.c;
        String str3 = c5115b.d;
        if ((I.a((CharSequence) str2) || I.a((CharSequence) str3)) ? false : new File(str2, str3).exists()) {
            c5115b.toString();
            String str4 = c5115b.c;
            String str5 = c5115b.d;
            if (!I.a((CharSequence) str4) && !I.a((CharSequence) str5)) {
                File file = new File(str4, str5);
                if (file.exists()) {
                    file.setLastModified(System.currentTimeMillis());
                }
            }
            c5115b.j = 3;
            c5115b.i = AbstractC4964v.a(1, c5115b.a());
            this.f12787a.remove(c5115b);
            this.b.add(c5115b);
            ((n) this.f).a(c5115b, 0, 0L);
            a();
            return;
        }
        if (!(H.b() > ((long) 20971520))) {
            this.f12787a.remove(c5115b);
            ((n) this.f).a(c5115b, "internal storage is not enough", SystemClock.elapsedRealtime() - c5115b.n, 0L);
            a();
            return;
        }
        String str6 = c5115b.f12782a;
        HashMap hashMap2 = sg.bigo.ads.h0.g.f12955a;
        C5228a c5228a2 = hashMap2.containsKey(str6) ? (C5228a) hashMap2.get(str6) : null;
        if (c5228a2 != null) {
            if (c5228a2.b.equals(c5115b)) {
                long j = c5115b.g;
                C5115b c5115b2 = c5228a2.b;
                c5115b2.g = j;
                c5115b2.i = c5115b.i;
                c5228a2.d = 1;
                sg.bigo.ads.h0.e.b.a(c5115b.f12782a);
            } else {
                sg.bigo.ads.h0.b.a(c5115b.f12782a);
                c5228a = new C5228a(c5115b);
                c5228a.c = new sg.bigo.ads.h0.d(context, c5228a);
                c5228a.d = 1;
                hashMap = sg.bigo.ads.h0.g.f12955a;
                if (!hashMap.containsKey(c5228a.f12950a)) {
                    hashMap.keySet().size();
                    hashMap.put(c5228a.f12950a, c5228a);
                }
            }
        } else {
            c5228a = new C5228a(c5115b);
            c5228a.c = new sg.bigo.ads.h0.d(context, c5228a);
            c5228a.d = 1;
            hashMap = sg.bigo.ads.h0.g.f12955a;
            if (!hashMap.containsKey(c5228a.f12950a)) {
                hashMap.keySet().size();
                hashMap.put(c5228a.f12950a, c5228a);
            }
        }
        String str7 = c5115b.f12782a;
        sg.bigo.ads.h0.e eVar = sg.bigo.ads.h0.e.b;
        if (eVar.f12953a.containsKey(str7)) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) eVar.f12953a.get(str7);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
            }
        } else {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
        }
        if (!copyOnWriteArrayList.contains(this)) {
            copyOnWriteArrayList.add(this);
            eVar.f12953a.put(str7, copyOnWriteArrayList);
        }
        c5115b.toString();
        String str8 = c5115b.f12782a;
        if (str8 == 0) {
            return;
        }
        if (str8.getClass() == String.class) {
            sg.bigo.ads.h0.g.a(str8);
            return;
        }
        if (str8 instanceof List) {
            List list = (List) str8;
            if (list.size() > 0 && list.get(0).getClass() == String.class) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    sg.bigo.ads.h0.g.a((String) it.next());
                }
                return;
            }
            str = "argument of collect is only String";
        } else {
            str = "argument is only String or List ";
        }
        AbstractC5496a.a("DownloadHandler", str);
    }

    public static C5115b a(CopyOnWriteArrayList copyOnWriteArrayList, boolean z) {
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C5115b c5115b = (C5115b) it.next();
            if (!z) {
                return c5115b;
            }
            int i = c5115b.k >= 3 ? Constants.THIRTY_MINUTES : 300000;
            if (c5115b.l > 0 && System.currentTimeMillis() - c5115b.l > i) {
                return c5115b;
            }
            c5115b.toString();
        }
        return null;
    }

    public static C5115b a(CopyOnWriteArrayList copyOnWriteArrayList, String str, String str2) {
        if (I.a((CharSequence) str) || I.a((CharSequence) str2)) {
            return null;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C5115b c5115b = (C5115b) it.next();
            if (TextUtils.equals(str, c5115b.c) && TextUtils.equals(str2, c5115b.d)) {
                return c5115b;
            }
        }
        return null;
    }

    public static C5115b a(CopyOnWriteArrayList copyOnWriteArrayList, C5115b c5115b) {
        int indexOf = copyOnWriteArrayList.indexOf(c5115b);
        if (indexOf >= 0) {
            try {
                return (C5115b) copyOnWriteArrayList.get(indexOf);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return null;
    }

    public final void a() {
        if (!sg.bigo.ads.F0.a.f() && this.f12787a.size() < this.e.f12796a) {
            C5115b a2 = a(this.c, false);
            if (a2 != null) {
                a2.toString();
                this.c.remove(a2);
            }
            if (a2 == null && (a2 = a(this.d, true)) != null) {
                a2.toString();
                this.d.remove(a2);
            }
            if (a2 != null) {
                this.f12787a.add(a2);
                a(this.g, a2);
            }
        }
    }

    public final void a(C5115b c5115b, boolean z) {
        if (c5115b != null) {
            c5115b.toString();
        }
        if (AbstractC4964v.a(c5115b.a())) {
            c5115b.toString();
            String str = c5115b.c;
            String str2 = c5115b.d;
            if (!I.a((CharSequence) str) && !I.a((CharSequence) str2)) {
                File file = new File(str, str2);
                if (file.exists()) {
                    file.setLastModified(System.currentTimeMillis());
                }
            }
            ((n) this.f).a(c5115b, 0, 0L);
            return;
        }
        if (a(this.f12787a, c5115b) != null) {
            c5115b.toString();
            return;
        }
        if (this.e.f12796a <= 0) {
            ((n) this.f).a(c5115b, "Unable to download media file.", 0L, 0L);
            return;
        }
        C5115b a2 = a(this.c, c5115b);
        if (a2 != null) {
            c5115b.toString();
            a2.b = c5115b.b;
            if (c5115b.p && !a2.p) {
                this.c.remove(a2);
                a2.p = true;
                a(a2);
            }
            if (!z && this.f12787a.size() >= this.e.f12796a) {
                c5115b.toString();
                return;
            }
        }
        C5115b a3 = a(this.d, c5115b);
        if (a3 != null) {
            c5115b.toString();
            this.d.remove(a3);
            a3.b = c5115b.b;
            a3.p = c5115b.p;
            a3.j = 0;
            c5115b = a3;
        }
        if (this.f12787a.size() < this.e.f12796a || z) {
            c5115b.toString();
            c5115b.o = z;
            this.f12787a.add(c5115b);
            a(this.g, c5115b);
            return;
        }
        c5115b.toString();
        a(c5115b);
    }
}
