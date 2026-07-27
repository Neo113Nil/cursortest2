package G0;

import android.view.KeyEvent;
import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.i2;
import n1.C1313Q;

/* loaded from: classes.dex */
public class P {

    /* renamed from: a, reason: collision with root package name */
    public boolean f796a = true;

    /* renamed from: b, reason: collision with root package name */
    public Object f797b;

    public P(F f3) {
        this.f797b = f3;
    }

    public void a() {
        this.f796a = true;
    }

    public void b() {
        this.f796a = false;
    }

    public void c() {
        this.f796a = false;
    }

    public void d(boolean z) {
        if (this.f796a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f796a = true;
        C1313Q c1313q = (C1313Q) this.f797b;
        int i2 = c1313q.f11340a - 1;
        c1313q.f11340a = i2;
        boolean z5 = z | c1313q.f11341b;
        c1313q.f11341b = z5;
        if (i2 != 0 || z5) {
            return;
        }
        ((x0.c) c1313q.f11343d).c((KeyEvent) c1313q.f11342c);
    }

    public void e(byte b6) {
        ((F) this.f797b).e(String.valueOf(b6));
    }

    public void f(char c2) {
        F f3 = (F) this.f797b;
        f3.a(f3.f753b, 1);
        char[] cArr = (char[]) f3.f754c;
        int i2 = f3.f753b;
        f3.f753b = i2 + 1;
        cArr[i2] = c2;
    }

    public void g(int i2) {
        ((F) this.f797b).e(String.valueOf(i2));
    }

    public void h(long j2) {
        ((F) this.f797b).e(String.valueOf(j2));
    }

    public void i(String v4) {
        kotlin.jvm.internal.i.e(v4, "v");
        ((F) this.f797b).e(v4);
    }

    public void j(short s2) {
        ((F) this.f797b).e(String.valueOf(s2));
    }

    public void k(String value) {
        int i2;
        kotlin.jvm.internal.i.e(value, "value");
        F f3 = (F) this.f797b;
        f3.a(f3.f753b, value.length() + 2);
        char[] cArr = (char[]) f3.f754c;
        int i3 = f3.f753b;
        int i6 = i3 + 1;
        cArr[i3] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i6);
        int i7 = length + i6;
        int i8 = i6;
        while (i8 < i7) {
            char c2 = cArr[i8];
            byte[] bArr = R4.v.f2726b;
            if (c2 < bArr.length && bArr[c2] != 0) {
                int length2 = value.length();
                for (int i9 = i8 - i6; i9 < length2; i9++) {
                    f3.a(i8, 2);
                    char charAt = value.charAt(i9);
                    byte[] bArr2 = R4.v.f2726b;
                    if (charAt < bArr2.length) {
                        byte b6 = bArr2[charAt];
                        if (b6 == 0) {
                            i2 = i8 + 1;
                            ((char[]) f3.f754c)[i8] = charAt;
                        } else {
                            if (b6 == 1) {
                                String str = R4.v.f2725a[charAt];
                                kotlin.jvm.internal.i.b(str);
                                f3.a(i8, str.length());
                                str.getChars(0, str.length(), (char[]) f3.f754c, i8);
                                int length3 = str.length() + i8;
                                f3.f753b = length3;
                                i8 = length3;
                            } else {
                                char[] cArr2 = (char[]) f3.f754c;
                                cArr2[i8] = '\\';
                                cArr2[i8 + 1] = (char) b6;
                                i8 += 2;
                                f3.f753b = i8;
                            }
                        }
                    } else {
                        i2 = i8 + 1;
                        ((char[]) f3.f754c)[i8] = charAt;
                    }
                    i8 = i2;
                }
                f3.a(i8, 1);
                ((char[]) f3.f754c)[i8] = '\"';
                f3.f753b = i8 + 1;
                return;
            }
            i8++;
        }
        cArr[i7] = '\"';
        f3.f753b = i7 + 1;
    }

    public void n(i2 i2Var) {
        if (this.f796a) {
            AbstractC0357o0.g("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((B.d) this.f797b).k(new S0.a(i2Var, null));
        } catch (Throwable unused) {
            AbstractC0357o0.g("BillingLogger", "logging failed.");
        }
    }

    public void l() {
    }

    public void m() {
    }
}
