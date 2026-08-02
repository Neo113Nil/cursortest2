package Qe;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private char[] f23339a = C3858b.f23332c.b();

    /* renamed from: b, reason: collision with root package name */
    private int f23340b;

    private final void a(int i11, int i12) {
        int i13 = i12 + i11;
        char[] cArr = this.f23339a;
        if (cArr.length <= i13) {
            int i14 = i11 * 2;
            if (i13 < i14) {
                i13 = i14;
            }
            char[] copyOf = Arrays.copyOf(cArr, i13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f23339a = copyOf;
        }
    }

    public final void b() {
        C3858b c3858b = C3858b.f23332c;
        char[] array = this.f23339a;
        c3858b.getClass();
        Intrinsics.checkNotNullParameter(array, "array");
        c3858b.a(array);
    }

    public final void c(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.f23340b, length);
        text.getChars(0, text.length(), this.f23339a, this.f23340b);
        this.f23340b += length;
    }

    public final void d(char c11) {
        a(this.f23340b, 1);
        char[] cArr = this.f23339a;
        int i11 = this.f23340b;
        this.f23340b = i11 + 1;
        cArr[i11] = c11;
    }

    public final void e(long j11) {
        c(String.valueOf(j11));
    }

    public final void f(@NotNull String text) {
        int i11;
        Intrinsics.checkNotNullParameter(text, "text");
        a(this.f23340b, text.length() + 2);
        char[] cArr = this.f23339a;
        int i12 = this.f23340b;
        int i13 = i12 + 1;
        cArr[i12] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i13);
        int i14 = length + i13;
        int i15 = i13;
        while (i15 < i14) {
            char c11 = cArr[i15];
            if (c11 < n.a().length && n.a()[c11] != 0) {
                int length2 = text.length();
                for (int i16 = i15 - i13; i16 < length2; i16++) {
                    a(i15, 2);
                    char charAt = text.charAt(i16);
                    if (charAt < n.a().length) {
                        byte b11 = n.a()[charAt];
                        if (b11 == 0) {
                            i11 = i15 + 1;
                            this.f23339a[i15] = charAt;
                        } else {
                            if (b11 == 1) {
                                String str = n.b()[charAt];
                                Intrinsics.f(str);
                                a(i15, str.length());
                                str.getChars(0, str.length(), this.f23339a, i15);
                                int length3 = str.length() + i15;
                                this.f23340b = length3;
                                i15 = length3;
                            } else {
                                char[] cArr2 = this.f23339a;
                                cArr2[i15] = '\\';
                                cArr2[i15 + 1] = (char) b11;
                                i15 += 2;
                                this.f23340b = i15;
                            }
                        }
                    } else {
                        i11 = i15 + 1;
                        this.f23339a[i15] = charAt;
                    }
                    i15 = i11;
                }
                a(i15, 1);
                this.f23339a[i15] = '\"';
                this.f23340b = i15 + 1;
                return;
            }
            i15++;
        }
        cArr[i14] = '\"';
        this.f23340b = i14 + 1;
    }

    @NotNull
    public final String toString() {
        return new String(this.f23339a, 0, this.f23340b);
    }
}
