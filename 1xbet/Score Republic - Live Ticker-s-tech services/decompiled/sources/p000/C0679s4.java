package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: s4 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0679s4 {

    /* JADX INFO: renamed from: a */
    public final int f7025a;

    /* JADX INFO: renamed from: b */
    public final C0312i6 f7026b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0420l4 f7027c;

    /* JADX INFO: renamed from: d */
    public final String f7028d;

    public C0679s4(C0312i6 c0312i6, InterfaceC0420l4 interfaceC0420l4, String str) {
        this.f7026b = c0312i6;
        this.f7027c = interfaceC0420l4;
        this.f7028d = str;
        this.f7025a = Arrays.hashCode(new Object[]{c0312i6, interfaceC0420l4, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0679s4)) {
            return false;
        }
        C0679s4 c0679s4 = (C0679s4) obj;
        return AbstractC0477mo.m3406e(this.f7026b, c0679s4.f7026b) && AbstractC0477mo.m3406e(this.f7027c, c0679s4.f7027c) && AbstractC0477mo.m3406e(this.f7028d, c0679s4.f7028d);
    }

    public final int hashCode() {
        return this.f7025a;
    }
}
