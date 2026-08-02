package K1;

import B0.C2454a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S1.d f15087a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15088b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15089c;

    public r(@NotNull S1.d dVar, int i11, int i12) {
        this.f15087a = dVar;
        this.f15088b = i11;
        this.f15089c = i12;
    }

    public final int a() {
        return this.f15089c;
    }

    @NotNull
    public final InterfaceC3438s b() {
        return this.f15087a;
    }

    public final int c() {
        return this.f15088b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f15087a.equals(rVar.f15087a) && this.f15088b == rVar.f15088b && this.f15089c == rVar.f15089c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15089c) + C2454a.a(this.f15088b, this.f15087a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f15087a);
        sb2.append(", startIndex=");
        sb2.append(this.f15088b);
        sb2.append(", endIndex=");
        return Ek.a.d(sb2, this.f15089c, ')');
    }
}
