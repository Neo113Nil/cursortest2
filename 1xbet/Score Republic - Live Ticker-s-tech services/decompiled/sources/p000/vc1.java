package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vc1 implements InterfaceC0420l4 {

    /* JADX INFO: renamed from: c */
    public static final vc1 f8175c = new vc1(null);

    /* JADX INFO: renamed from: b */
    public final String f8176b;

    public /* synthetic */ vc1(String str) {
        this.f8176b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vc1) {
            return AbstractC0477mo.m3406e(this.f8176b, ((vc1) obj).f8176b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8176b});
    }
}
