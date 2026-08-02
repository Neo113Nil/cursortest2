package bh;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.common.Spacings;

/* renamed from: bh.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5664b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f56022a;

    /* renamed from: b, reason: collision with root package name */
    private final int f56023b;

    /* renamed from: c, reason: collision with root package name */
    private final int f56024c;

    /* renamed from: d, reason: collision with root package name */
    private final int f56025d;

    /* renamed from: e, reason: collision with root package name */
    private final int f56026e;

    /* renamed from: f, reason: collision with root package name */
    private final int f56027f;

    /* renamed from: g, reason: collision with root package name */
    private final int f56028g;

    /* renamed from: h, reason: collision with root package name */
    private final int f56029h;

    public C5664b(c textAppearance, int i11, int i12, int i13, int i14, int i15) {
        int px = Spacings.SPACING_2.getPx();
        int px2 = Spacings.SPACING_0.getPx();
        Intrinsics.checkNotNullParameter(textAppearance, "textAppearance");
        this.f56022a = textAppearance;
        this.f56023b = i11;
        this.f56024c = i12;
        this.f56025d = i13;
        this.f56026e = i14;
        this.f56027f = i15;
        this.f56028g = px;
        this.f56029h = px2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5664b)) {
            return false;
        }
        C5664b c5664b = (C5664b) obj;
        return Intrinsics.d(this.f56022a, c5664b.f56022a) && this.f56023b == c5664b.f56023b && this.f56024c == c5664b.f56024c && this.f56025d == c5664b.f56025d && this.f56026e == c5664b.f56026e && this.f56027f == c5664b.f56027f && this.f56028g == c5664b.f56028g && this.f56029h == c5664b.f56029h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56029h) + C2454a.a(this.f56028g, C2454a.a(this.f56027f, C2454a.a(this.f56026e, C2454a.a(this.f56025d, C2454a.a(this.f56024c, C2454a.a(this.f56023b, this.f56022a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PricePreset(textAppearance=");
        sb2.append(this.f56022a);
        sb2.append(", iconSize=");
        sb2.append(this.f56023b);
        sb2.append(", contentGap=");
        sb2.append(this.f56024c);
        sb2.append(", bgPaddings=");
        sb2.append(this.f56025d);
        sb2.append(", bgCornerRadius=");
        sb2.append(this.f56026e);
        sb2.append(", atomHeight=");
        sb2.append(this.f56027f);
        sb2.append(", priceGap=");
        sb2.append(this.f56028g);
        sb2.append(", leftPartGap=");
        return K00.b.e(this.f56029h, ")", sb2);
    }
}
