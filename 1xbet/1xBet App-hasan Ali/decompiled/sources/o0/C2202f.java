package o0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import o4.AbstractC2227e;
import v.AbstractC2527w;

/* renamed from: o0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2202f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18548a;

    public C2202f(int i) {
        switch (i) {
            case 1:
                this.f18548a = new ArrayList(20);
                break;
            case 2:
                this.f18548a = new ArrayList();
                new HashMap();
                new HashMap();
                break;
            default:
                this.f18548a = new ArrayList(32);
                break;
        }
    }

    public void a(String str, String str2) {
        kotlin.jvm.internal.l.f("name", str);
        kotlin.jvm.internal.l.f("value", str2);
        AbstractC2527w.b(str);
        AbstractC2527w.c(str2, str);
        b(str, str2);
    }

    public void b(String str, String str2) {
        kotlin.jvm.internal.l.f("name", str);
        kotlin.jvm.internal.l.f("value", str2);
        ArrayList arrayList = this.f18548a;
        arrayList.add(str);
        arrayList.add(AbstractC2227e.Q0(str2).toString());
    }

    public void c(String str, String str2) {
        kotlin.jvm.internal.l.f("name", str);
        kotlin.jvm.internal.l.f("value", str2);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(z4.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
            }
        }
        b(str, str2);
    }

    public y4.m d() {
        return new y4.m((String[]) this.f18548a.toArray(new String[0]));
    }

    public void e() {
        this.f18548a.add(C2205i.f18558b);
    }

    public void f(float f, float f5, float f6, float f7, float f8, float f9) {
        this.f18548a.add(new C2206j(f, f5, f6, f7, f8, f9));
    }

    public void g(float f, float f5, float f6, float f7, float f8, float f9) {
        this.f18548a.add(new C2211o(f, f5, f6, f7, f8, f9));
    }

    public List h() {
        ArrayList arrayList;
        if (this.f18548a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f18548a) {
            arrayList = new ArrayList(this.f18548a);
        }
        return arrayList;
    }

    public void i(float f) {
        this.f18548a.add(new C2207k(f));
    }

    public void j(float f) {
        this.f18548a.add(new C2212p(f));
    }

    public void k(float f, float f5) {
        this.f18548a.add(new C2208l(f, f5));
    }

    public void l(float f, float f5) {
        this.f18548a.add(new C2213q(f, f5));
    }

    public void m(float f, float f5) {
        this.f18548a.add(new C2209m(f, f5));
    }

    public void n(float f, float f5, float f6, float f7) {
        this.f18548a.add(new C2210n(f, f5, f6, f7));
    }

    public void o(float f, float f5, float f6, float f7) {
        this.f18548a.add(new r(f, f5, f6, f7));
    }

    public void p(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f18548a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void q(float f) {
        this.f18548a.add(new t(f));
    }

    public void r(float f) {
        this.f18548a.add(new s(f));
    }
}
