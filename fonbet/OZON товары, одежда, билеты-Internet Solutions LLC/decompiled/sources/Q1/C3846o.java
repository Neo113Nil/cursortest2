package Q1;

import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Q1.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3846o {

    /* renamed from: a, reason: collision with root package name */
    private int f22903a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private char[] f22904b;

    /* renamed from: c, reason: collision with root package name */
    private int f22905c;

    /* renamed from: d, reason: collision with root package name */
    private int f22906d;

    public C3846o(@NotNull char[] cArr, int i11, int i12) {
        this.f22903a = cArr.length;
        this.f22904b = cArr;
        this.f22905c = i11;
        this.f22906d = i12;
    }

    private final int b() {
        return this.f22906d - this.f22905c;
    }

    public final void a(@NotNull StringBuilder sb2) {
        sb2.append(this.f22904b, 0, this.f22905c);
        Intrinsics.checkNotNullExpressionValue(sb2, "this.append(value, start…x, endIndex - startIndex)");
        char[] cArr = this.f22904b;
        int i11 = this.f22906d;
        sb2.append(cArr, i11, this.f22903a - i11);
        Intrinsics.checkNotNullExpressionValue(sb2, "this.append(value, start…x, endIndex - startIndex)");
    }

    public final char c(int i11) {
        int i12 = this.f22905c;
        return i11 < i12 ? this.f22904b[i11] : this.f22904b[(i11 - i12) + this.f22906d];
    }

    public final int d() {
        return this.f22903a - b();
    }

    public final void e(int i11, int i12, @NotNull String str) {
        int length = str.length() - (i12 - i11);
        if (length > b()) {
            int b11 = length - b();
            int i13 = this.f22903a;
            do {
                i13 *= 2;
            } while (i13 - this.f22903a < b11);
            char[] cArr = new char[i13];
            C7705l.q(this.f22904b, cArr, 0, 0, this.f22905c);
            int i14 = this.f22903a;
            int i15 = this.f22906d;
            int i16 = i14 - i15;
            int i17 = i13 - i16;
            C7705l.q(this.f22904b, cArr, i17, i15, i16 + i15);
            this.f22904b = cArr;
            this.f22903a = i13;
            this.f22906d = i17;
        }
        int i18 = this.f22905c;
        if (i11 < i18 && i12 <= i18) {
            int i19 = i18 - i12;
            char[] cArr2 = this.f22904b;
            C7705l.q(cArr2, cArr2, this.f22906d - i19, i12, i18);
            this.f22905c = i11;
            this.f22906d -= i19;
        } else if (i11 >= i18 || i12 < i18) {
            int b12 = i11 + b();
            int b13 = i12 + b();
            int i21 = this.f22906d;
            char[] cArr3 = this.f22904b;
            C7705l.q(cArr3, cArr3, this.f22905c, i21, b12);
            this.f22905c += b12 - i21;
            this.f22906d = b13;
        } else {
            this.f22906d = i12 + b();
            this.f22905c = i11;
        }
        C3847p.a(str, this.f22904b, this.f22905c, 0, str.length());
        this.f22905c = str.length() + this.f22905c;
    }

    @NotNull
    public final String toString() {
        return "";
    }
}
