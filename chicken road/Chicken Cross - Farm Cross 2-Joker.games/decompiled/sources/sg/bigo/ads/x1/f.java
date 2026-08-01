package sg.bigo.ads.x1;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f13390a;
    public final CopyOnWriteArrayList b;
    public final CopyOnWriteArrayList c;
    public final CopyOnWriteArrayList d;
    public final sg.bigo.ads.P.u e;
    public final s f;
    public final HashMap g;
    public int h;
    public CopyOnWriteArrayList i;
    public CopyOnWriteArrayList j;
    public CopyOnWriteArrayList k;
    public CopyOnWriteArrayList l;

    public f(sg.bigo.ads.P.u uVar, q[] qVarArr, q[] qVarArr2, q[] qVarArr3, q[] qVarArr4, HashMap hashMap) {
        this.e = uVar;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f13390a = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.b = copyOnWriteArrayList2;
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        this.c = copyOnWriteArrayList3;
        CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList();
        this.d = copyOnWriteArrayList4;
        HashMap hashMap2 = new HashMap();
        this.g = hashMap2;
        this.f = new s(uVar, hashMap2);
        copyOnWriteArrayList.addAll(Arrays.asList(qVarArr));
        copyOnWriteArrayList2.addAll(Arrays.asList(qVarArr2));
        copyOnWriteArrayList3.addAll(Arrays.asList(qVarArr3));
        copyOnWriteArrayList4.addAll(Arrays.asList(qVarArr4));
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str != null && str2 != null) {
                this.g.put(str, str2);
            }
        }
    }

    public static void a(f fVar, Context context, String str, q qVar) {
        fVar.getClass();
        String a2 = qVar.a().b.a();
        String str2 = qVar.c;
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        if ("sizmek".equals(str2)) {
            a2 = a2.replaceAll("\\?", "%3f");
        }
        HashMap hashMap = new HashMap(fVar.g);
        String str3 = TextUtils.isEmpty(str) ? "unknown" : str;
        hashMap.put("action", str3);
        hashMap.put("track_url", a2);
        hashMap.put("domain_front", "");
        hashMap.put("track_name", str2);
        hashMap.put("states", "start");
        hashMap.put("retry", "0");
        hashMap.put("out_ad", String.valueOf(fVar.h));
        if ("impl_track".equals(str3)) {
            sg.bigo.ads.s1.b.a("06002013", hashMap);
        } else if ("click_track".equals(str3)) {
            sg.bigo.ads.s1.b.a("06002014", hashMap);
        }
        sg.bigo.ads.E1.k a3 = sg.bigo.ads.E1.k.a(context);
        if (a3 == null) {
            return;
        }
        a3.setWebViewClient(new l(fVar, a3, str, str2));
        try {
            int i = qVar.f13401a;
            if (i == 1) {
                a3.loadUrl(a2);
            } else if (i == 2) {
                a3.loadData(a2, "text/html", "UTF-8");
            }
        } catch (Exception e) {
            sg.bigo.ads.s1.b.a(3002, 10106, e.getMessage(), (sg.bigo.ads.P.c) null);
        }
    }

    public static void a(String str, f fVar, q qVar, boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        fVar.getClass();
        if ("impl_track".equals(str)) {
            if (!z || (copyOnWriteArrayList = fVar.i) == null) {
                return;
            }
        } else if ("click_track".equals(str)) {
            if (!z || (copyOnWriteArrayList = fVar.j) == null) {
                return;
            }
        } else if ("nurl_track".equals(str)) {
            if (!z || (copyOnWriteArrayList = fVar.k) == null) {
                return;
            }
        } else if (!"lurl_track".equals(str) || !z || (copyOnWriteArrayList = fVar.l) == null) {
            return;
        }
        copyOnWriteArrayList.remove(qVar);
    }

    public final void a(String str, String str2) {
        Iterator it = this.f13390a.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (qVar.b()) {
                qVar.l.put(str, str2);
            }
        }
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            q qVar2 = (q) it2.next();
            if (qVar2.b()) {
                qVar2.l.put(str, str2);
            }
        }
        Iterator it3 = this.c.iterator();
        while (it3.hasNext()) {
            q qVar3 = (q) it3.next();
            if (qVar3.b()) {
                qVar3.l.put(str, str2);
            }
        }
        Iterator it4 = this.d.iterator();
        while (it4.hasNext()) {
            q qVar4 = (q) it4.next();
            if (qVar4.b()) {
                qVar4.l.put(str, str2);
            }
        }
    }

    public final void a(Context context, String str, q qVar, boolean z) {
        String str2 = qVar.c;
        sg.bigo.ads.w1.a a2 = qVar.a();
        boolean z2 = qVar.k;
        int i = qVar.i;
        "bigo_tracker".equals(qVar.d);
        sg.bigo.ads.w1.d.a(context, i, str, a2, str2, z2, this.h, false, 0, this.g, new k(str, this, qVar, z));
    }
}
