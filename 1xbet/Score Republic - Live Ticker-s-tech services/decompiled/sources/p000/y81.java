package p000;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y81 implements Iterator {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9212j;

    /* JADX INFO: renamed from: k */
    public int f9213k;

    /* JADX INFO: renamed from: l */
    public boolean f9214l;

    /* JADX INFO: renamed from: m */
    public Iterator f9215m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ AbstractMap f9216n;

    public /* synthetic */ y81(jq1 jq1Var) {
        this.f9212j = 2;
        Objects.requireNonNull(jq1Var);
        this.f9216n = jq1Var;
        this.f9213k = -1;
    }

    /* JADX INFO: renamed from: a */
    public Iterator m5744a() {
        int i = this.f9212j;
        AbstractMap abstractMap = this.f9216n;
        switch (i) {
            case 0:
                if (this.f9215m == null) {
                    this.f9215m = ((s81) abstractMap).f7054l.entrySet().iterator();
                }
                break;
            default:
                if (this.f9215m == null) {
                    this.f9215m = ((t81) abstractMap).f7351k.entrySet().iterator();
                }
                break;
        }
        return this.f9215m;
    }

    /* JADX INFO: renamed from: b */
    public Iterator m5745b() {
        if (this.f9215m == null) {
            this.f9215m = ((jq1) this.f9216n).f4067l.entrySet().iterator();
        }
        return this.f9215m;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f9212j;
        AbstractMap abstractMap = this.f9216n;
        switch (i) {
            case 0:
                s81 s81Var = (s81) abstractMap;
                if (this.f9213k + 1 >= s81Var.f7053k.size()) {
                    return !s81Var.f7054l.isEmpty() && m5744a().hasNext();
                }
                return true;
            case 1:
                t81 t81Var = (t81) abstractMap;
                if (this.f9213k + 1 >= t81Var.f7350j.size()) {
                    return !t81Var.f7351k.isEmpty() && m5744a().hasNext();
                }
                return true;
            default:
                jq1 jq1Var = (jq1) abstractMap;
                if (this.f9213k + 1 >= jq1Var.f4066k) {
                    return !jq1Var.f4067l.isEmpty() && m5745b().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f9212j;
        AbstractMap abstractMap = this.f9216n;
        switch (i) {
            case 0:
                this.f9214l = true;
                int i2 = this.f9213k + 1;
                this.f9213k = i2;
                s81 s81Var = (s81) abstractMap;
                return i2 < s81Var.f7053k.size() ? (Map.Entry) s81Var.f7053k.get(this.f9213k) : (Map.Entry) m5744a().next();
            case 1:
                this.f9214l = true;
                int i3 = this.f9213k + 1;
                this.f9213k = i3;
                t81 t81Var = (t81) abstractMap;
                return i3 < t81Var.f7350j.size() ? (Map.Entry) t81Var.f7350j.get(this.f9213k) : (Map.Entry) m5744a().next();
            default:
                this.f9214l = true;
                int i4 = this.f9213k + 1;
                this.f9213k = i4;
                jq1 jq1Var = (jq1) abstractMap;
                return i4 < jq1Var.f4066k ? (kq1) jq1Var.f4065j[i4] : (Map.Entry) m5745b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f9212j;
        AbstractMap abstractMap = this.f9216n;
        switch (i) {
            case 0:
                s81 s81Var = (s81) abstractMap;
                if (!this.f9214l) {
                    C0270h1.m2191g("remove() was called before next()");
                } else {
                    this.f9214l = false;
                    int i2 = s81.f7051p;
                    s81Var.m4500b();
                    if (this.f9213k >= s81Var.f7053k.size()) {
                        m5744a().remove();
                    } else {
                        int i3 = this.f9213k;
                        this.f9213k = i3 - 1;
                        s81Var.m4505g(i3);
                    }
                }
                break;
            case 1:
                t81 t81Var = (t81) abstractMap;
                if (!this.f9214l) {
                    C0270h1.m2191g("remove() was called before next()");
                } else {
                    this.f9214l = false;
                    int i4 = t81.f7349o;
                    t81Var.m4766b();
                    if (this.f9213k >= t81Var.f7350j.size()) {
                        m5744a().remove();
                    } else {
                        int i5 = this.f9213k;
                        this.f9213k = i5 - 1;
                        t81Var.m4771h(i5);
                    }
                }
                break;
            default:
                if (!this.f9214l) {
                    C0270h1.m2191g("remove() was called before next()");
                } else {
                    this.f9214l = false;
                    jq1 jq1Var = (jq1) abstractMap;
                    jq1Var.m2959f();
                    int i6 = this.f9213k;
                    if (i6 >= jq1Var.f4066k) {
                        m5745b().remove();
                    } else {
                        this.f9213k = i6 - 1;
                        jq1Var.m2957d(i6);
                    }
                }
                break;
        }
    }

    public /* synthetic */ y81(AbstractMap abstractMap, int i) {
        this.f9212j = i;
        this.f9216n = abstractMap;
        this.f9213k = -1;
    }
}
