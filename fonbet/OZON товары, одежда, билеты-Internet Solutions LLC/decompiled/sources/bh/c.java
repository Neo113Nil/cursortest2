package bh;

import B0.C2454a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f56030a;

    /* renamed from: b, reason: collision with root package name */
    private final int f56031b;

    /* renamed from: c, reason: collision with root package name */
    private final int f56032c;

    /* renamed from: d, reason: collision with root package name */
    private final int f56033d;

    /* renamed from: e, reason: collision with root package name */
    private final int f56034e;

    /* renamed from: f, reason: collision with root package name */
    private final int f56035f;

    public c(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f56030a = i11;
        this.f56031b = i12;
        this.f56032c = i13;
        this.f56033d = i14;
        this.f56034e = i15;
        this.f56035f = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f56030a == cVar.f56030a && this.f56031b == cVar.f56031b && this.f56032c == cVar.f56032c && this.f56033d == cVar.f56033d && this.f56034e == cVar.f56034e && this.f56035f == cVar.f56035f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56035f) + C2454a.a(this.f56034e, C2454a.a(this.f56033d, C2454a.a(this.f56032c, C2454a.a(this.f56031b, Integer.hashCode(this.f56030a) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceTextAppearance(prefixTextAppearanceResId=");
        sb2.append(this.f56030a);
        sb2.append(", priceTextAppearanceResId=");
        sb2.append(this.f56031b);
        sb2.append(", ppuTextAppearanceResId=");
        sb2.append(this.f56032c);
        sb2.append(", captionTextAppearanceResId=");
        sb2.append(this.f56033d);
        sb2.append(", originalPriceTextAppearanceResId=");
        sb2.append(this.f56034e);
        sb2.append(", discountTextAppearanceResId=");
        return K00.b.e(this.f56035f, ")", sb2);
    }
}
