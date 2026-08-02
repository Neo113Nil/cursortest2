package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pb2 {

    /* JADX INFO: renamed from: d */
    public static final long f6075d;

    /* JADX INFO: renamed from: e */
    public static final pb2 f6076e;

    /* JADX INFO: renamed from: a */
    public final int f6077a;

    /* JADX INFO: renamed from: b */
    public final int f6078b;

    /* JADX INFO: renamed from: c */
    public final int f6079c;

    static {
        long jCharAt = 0;
        for (int i = 0; i < 7; i++) {
            jCharAt |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        f6075d = jCharAt;
        f6076e = new pb2(0, -1, -1);
    }

    public pb2(int i, int i2, int i3) {
        this.f6077a = i;
        this.f6078b = i2;
        this.f6079c = i3;
    }

    /* JADX INFO: renamed from: e */
    public static int m3896e(int i, int i2, String str) {
        if (i == i2) {
            throw C0694sj.m4528b(i - 1, "missing precision", str);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char cCharAt = (char) (str.charAt(i4) - '0');
            if (cCharAt >= '\n') {
                throw C0694sj.m4528b(i4, "invalid precision character", str);
            }
            i3 = (i3 * 10) + cCharAt;
            if (i3 > 999999) {
                throw C0694sj.m4527a(i, i2, "precision too large", str);
            }
        }
        if (i3 != 0) {
            return i3;
        }
        if (i2 == i + 1) {
            return 0;
        }
        throw C0694sj.m4527a(i, i2, "invalid precision", str);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3897a() {
        return this == f6076e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3898b(int i, boolean z) {
        int i2;
        if (m3897a()) {
            return true;
        }
        int i3 = ~i;
        int i4 = this.f6077a;
        if ((i3 & i4) != 0) {
            return false;
        }
        if ((!z && this.f6079c != -1) || (i4 & 9) == 9 || (i2 = i4 & 96) == 96) {
            return false;
        }
        return i2 == 0 || this.f6078b != -1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3899c() {
        return (this.f6077a & 128) != 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m3900d(StringBuilder sb) {
        if (m3897a()) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = this.f6077a & (-129);
            int i3 = 1 << i;
            if (i3 > i2) {
                break;
            }
            if ((i2 & i3) != 0) {
                sb.append(" #(+,-0".charAt(i));
            }
            i++;
        }
        int i4 = this.f6078b;
        if (i4 != -1) {
            sb.append(i4);
        }
        int i5 = this.f6079c;
        if (i5 != -1) {
            sb.append('.');
            sb.append(i5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pb2) {
            pb2 pb2Var = (pb2) obj;
            if (pb2Var.f6077a == this.f6077a && pb2Var.f6078b == this.f6078b && pb2Var.f6079c == this.f6079c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f6077a * 31) + this.f6078b) * 31) + this.f6079c;
    }
}
