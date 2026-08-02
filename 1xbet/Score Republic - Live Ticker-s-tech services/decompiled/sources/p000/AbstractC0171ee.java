package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ee */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0171ee implements rg0, Serializable {

    /* JADX INFO: renamed from: j */
    public transient rg0 f2069j;

    /* JADX INFO: renamed from: k */
    public final Object f2070k;

    /* JADX INFO: renamed from: l */
    public final Class f2071l;

    /* JADX INFO: renamed from: m */
    public final String f2072m;

    /* JADX INFO: renamed from: n */
    public final String f2073n;

    /* JADX INFO: renamed from: o */
    public final boolean f2074o;

    public AbstractC0171ee(Object obj, Class cls, String str, String str2, boolean z) {
        this.f2070k = obj;
        this.f2071l = cls;
        this.f2072m = str;
        this.f2073n = str2;
        this.f2074o = z;
    }

    /* JADX INFO: renamed from: c */
    public abstract rg0 mo1404c();

    /* JADX INFO: renamed from: d */
    public final InterfaceC0543og m1405d() {
        boolean z = this.f2074o;
        Class cls = this.f2071l;
        if (z) {
            l01.f4622a.getClass();
            return new jv0(cls);
        }
        l01.f4622a.getClass();
        return new C0580pg(cls);
    }
}
