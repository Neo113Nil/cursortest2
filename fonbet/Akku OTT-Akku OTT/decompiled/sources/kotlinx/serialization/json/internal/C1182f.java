package kotlinx.serialization.json.internal;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* renamed from: kotlinx.serialization.json.internal.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1182f {

    @JvmField
    public final u a;
    public boolean b;

    public C1182f(u writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.a = writer;
        this.b = true;
    }

    public void a() {
        this.b = false;
    }

    public void b(byte b) {
        this.a.d(b);
    }

    public final void c(char c) {
        u uVar = this.a;
        uVar.a(uVar.b, 1);
        char[] cArr = uVar.a;
        int i = uVar.b;
        uVar.b = i + 1;
        cArr[i] = c;
    }

    public void d(int i) {
        this.a.d(i);
    }

    public void e(long j) {
        this.a.d(j);
    }

    public final void f(String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.a.c(v);
    }

    public void g(short s) {
        this.a.d(s);
    }

    public void h(String text) {
        int i;
        Intrinsics.checkNotNullParameter(text, "value");
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length() + 2;
        u uVar = this.a;
        uVar.a(uVar.b, length);
        char[] cArr = uVar.a;
        int i2 = uVar.b;
        int i3 = i2 + 1;
        cArr[i2] = Typography.quote;
        int length2 = text.length();
        text.getChars(0, length2, cArr, i3);
        int i4 = length2 + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = G.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length3 = text.length();
                for (int i6 = i5 - i3; i6 < length3; i6++) {
                    uVar.a(i5, 2);
                    char charAt = text.charAt(i6);
                    byte[] bArr2 = G.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i = i5 + 1;
                            uVar.a[i5] = charAt;
                        } else {
                            if (b == 1) {
                                String str = G.a[charAt];
                                Intrinsics.checkNotNull(str);
                                uVar.a(i5, str.length());
                                str.getChars(0, str.length(), uVar.a, i5);
                                int length4 = str.length() + i5;
                                uVar.b = length4;
                                i5 = length4;
                            } else {
                                char[] cArr2 = uVar.a;
                                cArr2[i5] = '\\';
                                cArr2[i5 + 1] = (char) b;
                                i5 += 2;
                                uVar.b = i5;
                            }
                        }
                    } else {
                        i = i5 + 1;
                        uVar.a[i5] = charAt;
                    }
                    i5 = i;
                }
                uVar.a(i5, 1);
                uVar.a[i5] = Typography.quote;
                uVar.b = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = Typography.quote;
        uVar.b = i4 + 1;
    }

    public void i() {
    }

    public void j() {
    }
}
