package Ch;

import B0.C2454a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f4991a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4992b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4993c;

    public c() {
        this(0, 8388611, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4991a == cVar.f4991a && this.f4992b == cVar.f4992b && this.f4993c == cVar.f4993c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4993c) + C2454a.a(this.f4992b, Integer.hashCode(this.f4991a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SmartLabelPreset(textAppearanceResId=");
        sb2.append(this.f4991a);
        sb2.append(", textAlignment=");
        sb2.append(this.f4992b);
        sb2.append(", gap=");
        return K00.b.e(this.f4993c, ")", sb2);
    }

    public c(int i11, int i12, int i13) {
        this.f4991a = i11;
        this.f4992b = i12;
        this.f4993c = i13;
    }
}
