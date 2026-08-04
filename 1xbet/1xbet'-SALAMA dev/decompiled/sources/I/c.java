package I;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f3461e = new c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3465d;

    public c(int i7, int i8, int i9, int i10) {
        this.f3462a = i7;
        this.f3463b = i8;
        this.f3464c = i9;
        this.f3465d = i10;
    }

    public static c a(int i7, int i8, int i9, int i10) {
        return (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? f3461e : new c(i7, i8, i9, i10);
    }

    public final Insets b() {
        return b.a(this.f3462a, this.f3463b, this.f3464c, this.f3465d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3465d == cVar.f3465d && this.f3462a == cVar.f3462a && this.f3464c == cVar.f3464c && this.f3463b == cVar.f3463b;
    }

    public final int hashCode() {
        return (((((this.f3462a * 31) + this.f3463b) * 31) + this.f3464c) * 31) + this.f3465d;
    }

    public final String toString() {
        return "Insets{left=" + this.f3462a + ", top=" + this.f3463b + ", right=" + this.f3464c + ", bottom=" + this.f3465d + '}';
    }
}
