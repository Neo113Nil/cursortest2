package androidx.core.graphics;

import android.graphics.Insets;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public static final d f42125e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f42126a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42127b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42128c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42129d;

    /* loaded from: classes8.dex */
    static class a {
        static Insets a(int i11, int i12, int i13, int i14) {
            return Insets.of(i11, i12, i13, i14);
        }
    }

    private d(int i11, int i12, int i13, int i14) {
        this.f42126a = i11;
        this.f42127b = i12;
        this.f42128c = i13;
        this.f42129d = i14;
    }

    @NonNull
    public static d a(@NonNull d dVar, @NonNull d dVar2) {
        return b(Math.max(dVar.f42126a, dVar2.f42126a), Math.max(dVar.f42127b, dVar2.f42127b), Math.max(dVar.f42128c, dVar2.f42128c), Math.max(dVar.f42129d, dVar2.f42129d));
    }

    @NonNull
    public static d b(int i11, int i12, int i13, int i14) {
        return (i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) ? f42125e : new d(i11, i12, i13, i14);
    }

    @NonNull
    public static d c(@NonNull Insets insets) {
        int i11;
        int i12;
        int i13;
        int i14;
        i11 = insets.left;
        i12 = insets.top;
        i13 = insets.right;
        i14 = insets.bottom;
        return b(i11, i12, i13, i14);
    }

    @NonNull
    public final Insets d() {
        return a.a(this.f42126a, this.f42127b, this.f42128c, this.f42129d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f42129d == dVar.f42129d && this.f42126a == dVar.f42126a && this.f42128c == dVar.f42128c && this.f42127b == dVar.f42127b;
    }

    public final int hashCode() {
        return (((((this.f42126a * 31) + this.f42127b) * 31) + this.f42128c) * 31) + this.f42129d;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f42126a);
        sb2.append(", top=");
        sb2.append(this.f42127b);
        sb2.append(", right=");
        sb2.append(this.f42128c);
        sb2.append(", bottom=");
        return Ek.a.d(sb2, this.f42129d, '}');
    }
}
