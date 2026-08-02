package androidx.collection;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: androidx.collection.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5141j {

    /* renamed from: a, reason: collision with root package name */
    public final long f38713a;

    private /* synthetic */ C5141j(long j11) {
        this.f38713a = j11;
    }

    public static final /* synthetic */ C5141j a(long j11) {
        return new C5141j(j11);
    }

    public static long b(int i11, int i12) {
        return (i12 & 4294967295L) | (i11 << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5141j) {
            return this.f38713a == ((C5141j) obj).f38713a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38713a);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        long j11 = this.f38713a;
        sb2.append((int) (j11 >> 32));
        sb2.append(", ");
        return Ek.a.d(sb2, (int) (j11 & 4294967295L), ')');
    }
}
