package Q1;

import B0.A0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f22815a;

    /* renamed from: b, reason: collision with root package name */
    private C3846o f22816b;

    /* renamed from: c, reason: collision with root package name */
    private int f22817c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f22818d = -1;

    public E(@NotNull String str) {
        this.f22815a = str;
    }

    public final char a(int i11) {
        C3846o c3846o = this.f22816b;
        if (c3846o != null && i11 >= this.f22817c) {
            int d11 = c3846o.d();
            int i12 = this.f22817c;
            return i11 < d11 + i12 ? c3846o.c(i11 - i12) : this.f22815a.charAt(i11 - ((d11 - this.f22818d) + i12));
        }
        return this.f22815a.charAt(i11);
    }

    public final int b() {
        C3846o c3846o = this.f22816b;
        return c3846o == null ? this.f22815a.length() : (this.f22815a.length() - (this.f22818d - this.f22817c)) + c3846o.d();
    }

    public final void c(int i11, int i12, @NotNull String str) {
        if (i11 > i12) {
            throw new IllegalArgumentException(A0.a(i11, i12, "start index must be less than or equal to end index: ", " > ").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "start must be non-negative, but was ").toString());
        }
        C3846o c3846o = this.f22816b;
        if (c3846o != null) {
            int i13 = this.f22817c;
            int i14 = i11 - i13;
            int i15 = i12 - i13;
            if (i14 >= 0 && i15 <= c3846o.d()) {
                c3846o.e(i14, i15, str);
                return;
            }
            this.f22815a = toString();
            this.f22816b = null;
            this.f22817c = -1;
            this.f22818d = -1;
            c(i11, i12, str);
            return;
        }
        int max = Math.max(255, str.length() + UserVerificationMethods.USER_VERIFY_PATTERN);
        char[] cArr = new char[max];
        int min = Math.min(i11, 64);
        int min2 = Math.min(this.f22815a.length() - i12, 64);
        int i16 = i11 - min;
        C3847p.a(this.f22815a, cArr, 0, i16, i11);
        int i17 = max - min2;
        int i18 = min2 + i12;
        C3847p.a(this.f22815a, cArr, i17, i12, i18);
        P20.f.a(str, cArr, min);
        this.f22816b = new C3846o(cArr, str.length() + min, i17);
        this.f22817c = i16;
        this.f22818d = i18;
    }

    @NotNull
    public final String toString() {
        C3846o c3846o = this.f22816b;
        if (c3846o == null) {
            return this.f22815a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.f22815a, 0, this.f22817c);
        c3846o.a(sb2);
        String str = this.f22815a;
        sb2.append((CharSequence) str, this.f22818d, str.length());
        return sb2.toString();
    }
}
