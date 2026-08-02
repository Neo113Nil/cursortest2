package E0;

import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class M {

    /* renamed from: a, reason: collision with root package name */
    private int f7048a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private char[] f7049b;

    /* renamed from: c, reason: collision with root package name */
    private int f7050c;

    /* renamed from: d, reason: collision with root package name */
    private int f7051d;

    public M(@NotNull char[] cArr, int i11, int i12) {
        this.f7048a = cArr.length;
        this.f7049b = cArr;
        this.f7050c = i11;
        this.f7051d = i12;
    }

    private final int b() {
        return this.f7051d - this.f7050c;
    }

    public final void a(@NotNull StringBuilder sb2) {
        sb2.append(this.f7049b, 0, this.f7050c);
        Intrinsics.checkNotNullExpressionValue(sb2, "this.append(value, start…x, endIndex - startIndex)");
        char[] cArr = this.f7049b;
        int i11 = this.f7051d;
        sb2.append(cArr, i11, this.f7048a - i11);
        Intrinsics.checkNotNullExpressionValue(sb2, "this.append(value, start…x, endIndex - startIndex)");
    }

    public final char c(int i11) {
        int i12 = this.f7050c;
        return i11 < i12 ? this.f7049b[i11] : this.f7049b[(i11 - i12) + this.f7051d];
    }

    public final int d() {
        return this.f7048a - b();
    }

    public final void e(int i11, int i12, int i13, @NotNull CharSequence charSequence) {
        int i14 = i13 - (i12 - i11);
        if (i14 > b()) {
            int b11 = i14 - b();
            int i15 = this.f7048a;
            do {
                i15 *= 2;
            } while (i15 - this.f7048a < b11);
            char[] cArr = new char[i15];
            C7705l.q(this.f7049b, cArr, 0, 0, this.f7050c);
            int i16 = this.f7048a;
            int i17 = this.f7051d;
            int i18 = i16 - i17;
            int i19 = i15 - i18;
            C7705l.q(this.f7049b, cArr, i19, i17, i18 + i17);
            this.f7049b = cArr;
            this.f7048a = i15;
            this.f7051d = i19;
        }
        int i21 = this.f7050c;
        if (i11 < i21 && i12 <= i21) {
            int i22 = i21 - i12;
            char[] cArr2 = this.f7049b;
            C7705l.q(cArr2, cArr2, this.f7051d - i22, i12, i21);
            this.f7050c = i11;
            this.f7051d -= i22;
        } else if (i11 >= i21 || i12 < i21) {
            int b12 = i11 + b();
            int b13 = i12 + b();
            int i23 = this.f7051d;
            char[] cArr3 = this.f7049b;
            C7705l.q(cArr3, cArr3, this.f7050c, i23, b12);
            this.f7050c += b12 - i23;
            this.f7051d = b13;
        } else {
            this.f7051d = i12 + b();
            this.f7050c = i11;
        }
        b1.a(charSequence, this.f7049b, this.f7050c, 0, i13);
        this.f7050c += i13;
    }

    @NotNull
    public final String toString() {
        return "";
    }
}
