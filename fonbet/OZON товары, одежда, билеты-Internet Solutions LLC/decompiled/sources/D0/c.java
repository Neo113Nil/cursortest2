package D0;

import B0.A0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f5189a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5190b;

    public c() {
        this(0, 3);
    }

    public final int a() {
        return this.f5190b;
    }

    public final int b() {
        return this.f5189a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5189a == cVar.f5189a && this.f5190b == cVar.f5190b;
    }

    public final int hashCode() {
        return (this.f5189a * 31) + this.f5190b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiLine(minHeightInLines=");
        sb2.append(this.f5189a);
        sb2.append(", maxHeightInLines=");
        return Ek.a.d(sb2, this.f5190b, ')');
    }

    public c(int i11, int i12) {
        i11 = (i12 & 2) != 0 ? Integer.MAX_VALUE : i11;
        this.f5189a = 1;
        this.f5190b = i11;
        if (1 > i11) {
            throw new IllegalArgumentException(A0.a(1, i11, "Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were ", ", ").toString());
        }
    }
}
