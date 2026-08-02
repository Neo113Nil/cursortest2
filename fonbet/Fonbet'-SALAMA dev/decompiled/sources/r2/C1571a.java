package r2;

import C1.C0095a;
import D3.f;
import W5.AbstractC0486a1;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import j2.AbstractC1308e;
import j2.C1305b;
import j2.C1311h;
import j2.InterfaceC1309f;
import java.util.List;
import v2.t;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1571a extends AbstractC1308e {

    /* renamed from: D, reason: collision with root package name */
    public final C0095a f16014D = new C0095a(4, false);

    /* renamed from: E, reason: collision with root package name */
    public final boolean f16015E;

    /* renamed from: F, reason: collision with root package name */
    public final int f16016F;

    /* renamed from: G, reason: collision with root package name */
    public final int f16017G;

    /* renamed from: H, reason: collision with root package name */
    public final String f16018H;

    /* renamed from: I, reason: collision with root package name */
    public final float f16019I;

    /* renamed from: J, reason: collision with root package name */
    public final int f16020J;

    public C1571a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f16016F = 0;
            this.f16017G = -1;
            this.f16018H = "sans-serif";
            this.f16015E = false;
            this.f16019I = 0.85f;
            this.f16020J = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f16016F = bArr[24];
        this.f16017G = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f16018H = "Serif".equals(new String(bArr, 43, bArr.length - 43, f.f1719c)) ? "serif" : "sans-serif";
        int i7 = bArr[25] * 20;
        this.f16020J = i7;
        boolean z4 = (bArr[0] & 32) != 0;
        this.f16015E = z4;
        if (z4) {
            this.f16019I = t.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.0f, 0.95f);
        } else {
            this.f16019I = 0.85f;
        }
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i9, i10, i11 | 33);
        }
    }

    public static void i(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            int i12 = i11 | 33;
            boolean z4 = (i7 & 1) != 0;
            boolean z7 = (i7 & 2) != 0;
            if (z4) {
                if (z7) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i9, i10, i12);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i9, i10, i12);
                }
            } else if (z7) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i9, i10, i12);
            }
            boolean z8 = (i7 & 4) != 0;
            if (z8) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, i12);
            }
            if (z8 || z4 || z7) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i9, i10, i12);
        }
    }

    @Override // j2.AbstractC1308e
    public final InterfaceC1309f e(byte[] bArr, int i7, boolean z4) {
        String r7;
        int i8;
        int i9;
        C0095a c0095a = this.f16014D;
        c0095a.B(i7, bArr);
        if (c0095a.d() < 2) {
            throw new C1311h("Unexpected subtitle format.");
        }
        int y4 = c0095a.y();
        int i10 = 1;
        int i11 = 8;
        if (y4 == 0) {
            r7 = "";
        } else {
            if (c0095a.d() >= 2) {
                byte[] bArr2 = (byte[]) c0095a.f1465c;
                int i12 = c0095a.f1463a;
                char c3 = (char) ((bArr2[i12 + 1] & 255) | ((bArr2[i12] & 255) << 8));
                if (c3 == 65279 || c3 == 65534) {
                    r7 = c0095a.r(y4, f.f1720d);
                }
            }
            r7 = c0095a.r(y4, f.f1719c);
        }
        if (r7.isEmpty()) {
            return C1572b.f16021b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r7);
        i(spannableStringBuilder, this.f16016F, 0, 0, spannableStringBuilder.length(), 16711680);
        h(spannableStringBuilder, this.f16017G, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        int i13 = 0;
        String str = this.f16018H;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f7 = this.f16019I;
        while (c0095a.d() >= i11) {
            int i14 = c0095a.f1463a;
            int g3 = c0095a.g();
            int g7 = c0095a.g();
            if (g7 == 1937013100) {
                if (c0095a.d() < 2) {
                    throw new C1311h("Unexpected subtitle format.");
                }
                int y5 = c0095a.y();
                int i15 = i13;
                while (i15 < y5) {
                    if (c0095a.d() < 12) {
                        throw new C1311h("Unexpected subtitle format.");
                    }
                    int y7 = c0095a.y();
                    int y8 = c0095a.y();
                    c0095a.E(2);
                    int t7 = c0095a.t();
                    c0095a.E(i10);
                    int g8 = c0095a.g();
                    if (y8 > spannableStringBuilder.length()) {
                        StringBuilder j = AbstractC0486a1.j(y8, "Truncating styl end (", ") to cueText.length() (");
                        j.append(spannableStringBuilder.length());
                        j.append(").");
                        Log.w("Tx3gDecoder", j.toString());
                        y8 = spannableStringBuilder.length();
                    }
                    int i16 = y8;
                    if (y7 >= i16) {
                        Log.w("Tx3gDecoder", "Ignoring styl with start (" + y7 + ") >= end (" + i16 + ").");
                        i8 = i15;
                        i9 = y5;
                    } else {
                        i8 = i15;
                        i9 = y5;
                        i(spannableStringBuilder, t7, this.f16016F, y7, i16, 0);
                        h(spannableStringBuilder, g8, this.f16017G, y7, i16, 0);
                    }
                    i15 = i8 + 1;
                    y5 = i9;
                    i10 = 1;
                }
            } else if (g7 == 1952608120 && this.f16015E) {
                if (c0095a.d() < 2) {
                    throw new C1311h("Unexpected subtitle format.");
                }
                f7 = t.i(c0095a.y() / this.f16020J, 0.0f, 0.95f);
            }
            c0095a.D(i14 + g3);
            i10 = 1;
            i11 = 8;
            i13 = 0;
        }
        return new C1572b(new C1305b(spannableStringBuilder, null, null, null, f7, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f));
    }
}
