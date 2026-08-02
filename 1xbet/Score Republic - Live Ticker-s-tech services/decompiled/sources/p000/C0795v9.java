package p000;

import android.content.Context;

/* JADX INFO: renamed from: v9 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0795v9 extends AbstractC0698sn {

    /* JADX INFO: renamed from: a */
    public final Context f8134a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0766uh f8135b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0766uh f8136c;

    /* JADX INFO: renamed from: d */
    public final String f8137d;

    public C0795v9(Context context, InterfaceC0766uh interfaceC0766uh, InterfaceC0766uh interfaceC0766uh2, String str) {
        if (context == null) {
            C0270h1.m2192h("Null applicationContext");
            throw null;
        }
        this.f8134a = context;
        if (interfaceC0766uh == null) {
            C0270h1.m2192h("Null wallClock");
            throw null;
        }
        this.f8135b = interfaceC0766uh;
        if (interfaceC0766uh2 == null) {
            C0270h1.m2192h("Null monotonicClock");
            throw null;
        }
        this.f8136c = interfaceC0766uh2;
        if (str != null) {
            this.f8137d = str;
        } else {
            C0270h1.m2192h("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0698sn) {
            C0795v9 c0795v9 = (C0795v9) ((AbstractC0698sn) obj);
            if (this.f8134a.equals(c0795v9.f8134a) && this.f8135b.equals(c0795v9.f8135b) && this.f8136c.equals(c0795v9.f8136c) && this.f8137d.equals(c0795v9.f8137d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8137d.hashCode() ^ ((((((this.f8134a.hashCode() ^ 1000003) * 1000003) ^ this.f8135b.hashCode()) * 1000003) ^ this.f8136c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f8134a);
        sb.append(", wallClock=");
        sb.append(this.f8135b);
        sb.append(", monotonicClock=");
        sb.append(this.f8136c);
        sb.append(", backendName=");
        return AbstractC0024an.m285h(sb, this.f8137d, "}");
    }
}
