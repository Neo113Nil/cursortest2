package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class Ql {

    /* renamed from: a, reason: collision with root package name */
    public final Kl f11244a;

    /* renamed from: b, reason: collision with root package name */
    public final C0855cl f11245b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11246c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11247d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f11248e;

    public Ql(Kl kl, C0855cl c0855cl) {
        this.f11244a = kl;
        this.f11245b = c0855cl;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f11246c) {
            try {
                if (!this.f11248e) {
                    Kl kl = this.f11244a;
                    if (!kl.f10229b) {
                        Q2.E0 e02 = new Q2.E0(1, this);
                        Kl kl2 = this.f11244a;
                        kl2.getClass();
                        kl2.f10232e.f10334k.a(new Kw(26, kl2, e02), kl2.f10235j);
                        return jSONArray;
                    }
                    b(kl.a());
                }
                ArrayList arrayList = this.f11247d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    jSONArray.put(((Pl) obj).a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List list) {
        String str;
        String str2;
        C1651ub c1651ub;
        C0811bl a5;
        C1651ub c1651ub2;
        synchronized (this.f11246c) {
            try {
                if (this.f11248e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Q9 q9 = (Q9) it.next();
                    A7 a7 = F7.V8;
                    Q2.r rVar = Q2.r.f5053d;
                    if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                        C0811bl a6 = this.f11245b.a(q9.f11187k);
                        if (a6 != null && (c1651ub2 = a6.f12899c) != null) {
                            str = c1651ub2.toString();
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str3 = str;
                    boolean z3 = ((Boolean) rVar.f5056c.a(F7.W8)).booleanValue() && (a5 = this.f11245b.a(q9.f11187k)) != null && a5.f12900d;
                    ArrayList arrayList = this.f11247d;
                    String str4 = q9.f11187k;
                    C0811bl a8 = this.f11245b.a(str4);
                    if (a8 != null && (c1651ub = a8.f12898b) != null) {
                        str2 = c1651ub.toString();
                        arrayList.add(new Pl(str4, str3, str2, q9.f11188l ? 1 : 0, q9.f11190n, q9.f11189m, z3));
                    }
                    str2 = "";
                    arrayList.add(new Pl(str4, str3, str2, q9.f11188l ? 1 : 0, q9.f11190n, q9.f11189m, z3));
                }
                this.f11248e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
