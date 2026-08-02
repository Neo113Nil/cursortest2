package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: sh */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0692sh {

    /* JADX INFO: renamed from: a */
    public String f7116a;

    /* JADX INFO: renamed from: b */
    public C0831w8 f7117b;

    /* JADX INFO: renamed from: c */
    public rb0 f7118c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0692sh)) {
            return false;
        }
        C0692sh c0692sh = (C0692sh) obj;
        return this.f7116a.equals(c0692sh.f7116a) && this.f7117b.equals(c0692sh.f7117b) && AbstractC0875xf.m5649f(null, null) && AbstractC0875xf.m5649f(this.f7118c, c0692sh.f7118c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7116a, this.f7117b, null, this.f7118c});
    }
}
