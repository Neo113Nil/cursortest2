package p125r2;

import C1.C0095a;
import D3.f;
import W5.AbstractC0486a1;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import java.util.List;
import p068j2.b;
import p068j2.e;
import p068j2.h;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0095a f16020D = new C0095a(4, false);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f16021E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f16022F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f16023G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f16024H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final float f16025I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f16026J;

    public a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f16022F = 0;
            this.f16023G = -1;
            this.f16024H = "sans-serif";
            this.f16021E = false;
            this.f16025I = 0.85f;
            this.f16026J = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f16022F = bArr[24];
        this.f16023G = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f16024H = "Serif".equals(new String(bArr, 43, bArr.length - 43, f.f1719c)) ? "serif" : "sans-serif";
        int i7 = bArr[25] * 20;
        this.f16026J = i7;
        boolean z4 = (bArr[0] & 32) != 0;
        this.f16021E = z4;
        if (z4) {
            this.f16025I = t.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.0f, 0.95f);
        } else {
            this.f16025I = 0.85f;
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

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    @Override // p068j2.e
    public final p068j2.f e(byte[] bArr, int i7, boolean z4) throws h {
        String strR;
        C0095a c0095a = this.f16020D;
        c0095a.B(i7, bArr);
        if (c0095a.d() < 2) {
            throw new h("Unexpected subtitle format.");
        }
        int iY = c0095a.y();
        int i8 = 1;
        int i9 = 8;
        if (iY == 0) {
            strR = "";
        } else if (c0095a.d() >= 2) {
            byte[] bArr2 = (byte[]) c0095a.f1465c;
            int i10 = c0095a.f1463a;
            char c3 = (char) ((bArr2[i10 + 1] & 255) | ((bArr2[i10] & 255) << 8));
            if (c3 == 65279 || c3 == 65534) {
                strR = c0095a.r(iY, f.f1720d);
            } else {
                strR = c0095a.r(iY, f.f1719c);
            }
        } else {
            strR = c0095a.r(iY, f.f1719c);
        }
        if (strR.isEmpty()) {
            return b.f16027b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strR);
        i(spannableStringBuilder, this.f16022F, 0, 0, spannableStringBuilder.length(), 16711680);
        h(spannableStringBuilder, this.f16023G, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        int i11 = 0;
        String str = this.f16024H;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fI = this.f16025I;
        while (c0095a.d() >= i9) {
            int i12 = c0095a.f1463a;
            int iG = c0095a.g();
            int iG2 = c0095a.g();
            if (iG2 == 1937013100) {
                if (c0095a.d() < 2) {
                    throw new h("Unexpected subtitle format.");
                }
                int iY2 = c0095a.y();
                int i13 = i11;
                while (i13 < iY2) {
                    if (c0095a.d() < 12) {
                        throw new h("Unexpected subtitle format.");
                    }
                    int iY3 = c0095a.y();
                    int iY4 = c0095a.y();
                    c0095a.E(2);
                    int iT = c0095a.t();
                    c0095a.E(i8);
                    int iG3 = c0095a.g();
                    if (iY4 > spannableStringBuilder.length()) {
                        StringBuilder sbJ = AbstractC0486a1.j(iY4, "Truncating styl end (", ") to cueText.length() (");
                        sbJ.append(spannableStringBuilder.length());
                        sbJ.append(").");
                        Log.w("Tx3gDecoder", sbJ.toString());
                        iY4 = spannableStringBuilder.length();
                    }
                    int i14 = iY4;
                    if (iY3 >= i14) {
                        Log.w("Tx3gDecoder", "Ignoring styl with start (" + iY3 + ") >= end (" + i14 + ").");
                    } else {
                        i(spannableStringBuilder, iT, this.f16022F, iY3, i14, 0);
                        h(spannableStringBuilder, iG3, this.f16023G, iY3, i14, 0);
                    }
                    i13++;
                    iY2 = iY2;
                    i8 = 1;
                }
            } else if (iG2 == 1952608120 && this.f16021E) {
                if (c0095a.d() < 2) {
                    throw new h("Unexpected subtitle format.");
                }
                fI = t.i(c0095a.y() / this.f16026J, 0.0f, 0.95f);
            }
            c0095a.D(i12 + iG);
            i8 = 1;
            i9 = 8;
            i11 = 0;
        }
        return new b(new b(spannableStringBuilder, null, null, null, fI, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f));
    }
}
