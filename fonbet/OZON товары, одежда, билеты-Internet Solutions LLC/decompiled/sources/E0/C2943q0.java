package E0;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.q0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2943q0 implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private CharSequence f7282a;

    /* renamed from: b, reason: collision with root package name */
    private M f7283b;

    /* renamed from: c, reason: collision with root package name */
    private int f7284c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f7285d = -1;

    public C2943q0(@NotNull CharSequence charSequence) {
        this.f7282a = charSequence;
    }

    public final void a(int i11, int i12, int i13, @NotNull CharSequence charSequence) {
        if (i11 > i12) {
            throw new IllegalArgumentException(B0.A0.a(i11, i12, "start=", " > end=").toString());
        }
        if (i13 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i13, "textStart=0 > textEnd=").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "start must be non-negative, but was ").toString());
        }
        M m11 = this.f7283b;
        if (m11 != null) {
            int i14 = this.f7284c;
            int i15 = i11 - i14;
            int i16 = i12 - i14;
            if (i15 >= 0 && i16 <= m11.d()) {
                m11.e(i15, i16, i13, charSequence);
                return;
            }
            this.f7282a = toString();
            this.f7283b = null;
            this.f7284c = -1;
            this.f7285d = -1;
            a(i11, i12, i13, charSequence);
            return;
        }
        int max = Math.max(255, i13 + UserVerificationMethods.USER_VERIFY_PATTERN);
        char[] cArr = new char[max];
        int min = Math.min(i11, 64);
        int min2 = Math.min(this.f7282a.length() - i12, 64);
        int i17 = i11 - min;
        b1.a(this.f7282a, cArr, 0, i17, i11);
        int i18 = max - min2;
        int i19 = min2 + i12;
        b1.a(this.f7282a, cArr, i18, i12, i19);
        b1.a(charSequence, cArr, min, 0, i13);
        this.f7283b = new M(cArr, min + i13, i18);
        this.f7284c = i17;
        this.f7285d = i19;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i11) {
        M m11 = this.f7283b;
        if (m11 != null && i11 >= this.f7284c) {
            int d11 = m11.d();
            int i12 = this.f7284c;
            return i11 < d11 + i12 ? m11.c(i11 - i12) : this.f7282a.charAt(i11 - ((d11 - this.f7285d) + i12));
        }
        return this.f7282a.charAt(i11);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        M m11 = this.f7283b;
        return m11 == null ? this.f7282a.length() : (this.f7282a.length() - (this.f7285d - this.f7284c)) + m11.d();
    }

    @Override // java.lang.CharSequence
    @NotNull
    public final CharSequence subSequence(int i11, int i12) {
        return toString().subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    @NotNull
    public final String toString() {
        M m11 = this.f7283b;
        if (m11 == null) {
            return this.f7282a.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7282a, 0, this.f7284c);
        m11.a(sb2);
        CharSequence charSequence = this.f7282a;
        sb2.append(charSequence, this.f7285d, charSequence.length());
        return sb2.toString();
    }
}
