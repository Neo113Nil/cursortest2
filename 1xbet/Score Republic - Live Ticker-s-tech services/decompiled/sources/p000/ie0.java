package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ie0 {

    /* JADX INFO: renamed from: a */
    public final String f3557a;

    /* JADX INFO: renamed from: b */
    public final he0 f3558b;

    /* JADX INFO: renamed from: c */
    public final long f3559c;

    /* JADX INFO: renamed from: d */
    public final le0 f3560d;

    public ie0(String str, he0 he0Var, long j, xe0 xe0Var) {
        this.f3557a = str;
        this.f3558b = he0Var;
        this.f3559c = j;
        this.f3560d = xe0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ie0)) {
            return false;
        }
        ie0 ie0Var = (ie0) obj;
        return AbstractC0875xf.m5649f(this.f3557a, ie0Var.f3557a) && AbstractC0875xf.m5649f(this.f3558b, ie0Var.f3558b) && this.f3559c == ie0Var.f3559c && AbstractC0875xf.m5649f(null, null) && AbstractC0875xf.m5649f(this.f3560d, ie0Var.f3560d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3557a, this.f3558b, Long.valueOf(this.f3559c), null, this.f3560d});
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f3557a, "description");
        c0809vnM5362k.m5172c(this.f3558b, "severity");
        c0809vnM5362k.m5173d("timestampNanos", this.f3559c);
        c0809vnM5362k.m5172c(null, "channelRef");
        c0809vnM5362k.m5172c(this.f3560d, "subchannelRef");
        return c0809vnM5362k.toString();
    }
}
