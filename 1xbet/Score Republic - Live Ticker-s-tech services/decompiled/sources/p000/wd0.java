package p000;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wd0 {

    /* JADX INFO: renamed from: e */
    public static final wd0 f8514e = new wd0(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f8515a;

    /* JADX INFO: renamed from: b */
    public final int f8516b;

    /* JADX INFO: renamed from: c */
    public final int f8517c;

    /* JADX INFO: renamed from: d */
    public final int f8518d;

    public wd0(int i, int i2, int i3, int i4) {
        this.f8515a = i;
        this.f8516b = i2;
        this.f8517c = i3;
        this.f8518d = i4;
    }

    /* JADX INFO: renamed from: a */
    public static wd0 m5318a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f8514e : new wd0(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static wd0 m5319b(Insets insets) {
        return m5318a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wd0.class != obj.getClass()) {
            return false;
        }
        wd0 wd0Var = (wd0) obj;
        return this.f8518d == wd0Var.f8518d && this.f8515a == wd0Var.f8515a && this.f8517c == wd0Var.f8517c && this.f8516b == wd0Var.f8516b;
    }

    public final int hashCode() {
        return (((((this.f8515a * 31) + this.f8516b) * 31) + this.f8517c) * 31) + this.f8518d;
    }

    public final String toString() {
        return "Insets{left=" + this.f8515a + ", top=" + this.f8516b + ", right=" + this.f8517c + ", bottom=" + this.f8518d + '}';
    }
}
