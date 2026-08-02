package Ve;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;

/* renamed from: Ve.nn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4481nn {

    /* renamed from: a, reason: collision with root package name */
    public final int f31678a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f31679b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31680c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f31681d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f31682e;

    public C4481nn(int i11, Integer num, int i12, Long l11, int i13) {
        num = (i13 & 2) != 0 ? null : num;
        i12 = (i13 & 4) != 0 ? R.color.spay_text_color_grey : i12;
        l11 = (i13 & 8) != 0 ? null : l11;
        boolean z11 = (i13 & 16) == 0;
        this.f31678a = i11;
        this.f31679b = num;
        this.f31680c = i12;
        this.f31681d = l11;
        this.f31682e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4481nn)) {
            return false;
        }
        C4481nn c4481nn = (C4481nn) obj;
        return this.f31678a == c4481nn.f31678a && Intrinsics.d(this.f31679b, c4481nn.f31679b) && this.f31680c == c4481nn.f31680c && Intrinsics.d(this.f31681d, c4481nn.f31681d) && this.f31682e == c4481nn.f31682e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f31678a) * 31;
        Integer num = this.f31679b;
        int a11 = C2454a.a(this.f31680c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        Long l11 = this.f31681d;
        int hashCode2 = (a11 + (l11 != null ? l11.hashCode() : 0)) * 31;
        boolean z11 = this.f31682e;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode2 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResendCodeStatusBtn(textRes=");
        sb2.append(this.f31678a);
        sb2.append(", pluralsRes=");
        sb2.append(this.f31679b);
        sb2.append(", textColorRes=");
        sb2.append(this.f31680c);
        sb2.append(", timerTick=");
        sb2.append(this.f31681d);
        sb2.append(", isClickable=");
        return Pk0.a.a(")", sb2, this.f31682e);
    }
}
