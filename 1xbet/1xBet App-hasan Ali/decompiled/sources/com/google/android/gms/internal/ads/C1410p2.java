package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1410p2 implements P1 {

    /* renamed from: k, reason: collision with root package name */
    public final C1617tm f14932k = new C1617tm();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14933l;

    /* renamed from: m, reason: collision with root package name */
    public final int f14934m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14935n;

    /* renamed from: o, reason: collision with root package name */
    public final String f14936o;

    /* renamed from: p, reason: collision with root package name */
    public final float f14937p;

    /* renamed from: q, reason: collision with root package name */
    public final int f14938q;

    public C1410p2(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f14934m = 0;
            this.f14935n = -1;
            this.f14936o = "sans-serif";
            this.f14933l = false;
            this.f14937p = 0.85f;
            this.f14938q = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f14934m = bArr[24];
        this.f14935n = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f14936o = true == "Serif".equals(new String(bArr, 43, bArr.length + (-43), StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f14938q = i;
        boolean z3 = (bArr[0] & 32) != 0;
        this.f14933l = z3;
        if (z3) {
            this.f14937p = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.f14937p = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i5, int i6, int i7, int i8) {
        if (i != i5) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i6, i7, i8 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i5, int i6, int i7, int i8) {
        if (i != i5) {
            int i9 = i8 | 33;
            int i10 = i & 1;
            int i11 = i & 2;
            boolean z3 = true;
            if (i10 == 0) {
                if (i11 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i6, i7, i9);
                }
                z3 = false;
            } else if (i11 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(3), i6, i7, i9);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i6, i7, i9);
                z3 = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, i7, i9);
            } else {
                if (i10 != 0 || z3) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i6, i7, i9);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.P1
    public final void f(byte[] bArr, int i, int i5, Q1 q12) {
        String b3;
        float f;
        int i6;
        int i7;
        float f5;
        int i8;
        C1617tm c1617tm = this.f14932k;
        c1617tm.h(i + i5, bArr);
        c1617tm.j(i);
        int i9 = 0;
        int i10 = 1;
        int i11 = 2;
        AbstractC1668us.S(c1617tm.o() >= 2);
        int z3 = c1617tm.z();
        if (z3 == 0) {
            b3 = "";
        } else {
            int i12 = c1617tm.f15725b;
            Charset c5 = c1617tm.c();
            int i13 = c1617tm.f15725b - i12;
            if (c5 == null) {
                c5 = StandardCharsets.UTF_8;
            }
            b3 = c1617tm.b(z3 - i13, c5);
        }
        if (b3.isEmpty()) {
            C0954ev c0954ev = AbstractC1044gv.f13676l;
            q12.mo11k(new L1(C1761wv.f16184o, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b3);
        b(spannableStringBuilder, this.f14934m, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f14935n, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f14936o;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f6 = this.f14937p;
        while (c1617tm.o() >= 8) {
            int i14 = c1617tm.f15725b;
            int q5 = c1617tm.q();
            int q6 = c1617tm.q();
            if (q6 == 1937013100) {
                AbstractC1668us.S(c1617tm.o() >= i11 ? i10 : i9);
                int z5 = c1617tm.z();
                int i15 = i9;
                while (i15 < z5) {
                    AbstractC1668us.S(c1617tm.o() >= 12 ? i10 : i9);
                    int z6 = c1617tm.z();
                    int z7 = c1617tm.z();
                    c1617tm.k(i11);
                    int i16 = i15;
                    int v4 = c1617tm.v();
                    c1617tm.k(i10);
                    int q7 = c1617tm.q();
                    int i17 = i10;
                    if (z7 > spannableStringBuilder.length()) {
                        f5 = f6;
                        JB.l("Tx3gParser", "Truncating styl end (" + z7 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        z7 = spannableStringBuilder.length();
                    } else {
                        f5 = f6;
                    }
                    if (z6 >= z7) {
                        JB.l("Tx3gParser", "Ignoring styl with start (" + z6 + ") >= end (" + z7 + ").");
                        i8 = i16;
                    } else {
                        i8 = i16;
                        int i18 = z7;
                        b(spannableStringBuilder, v4, this.f14934m, z6, i18, 0);
                        a(spannableStringBuilder, q7, this.f14935n, z6, i18, 0);
                    }
                    i15 = i8 + 1;
                    i10 = i17;
                    f6 = f5;
                    i9 = 0;
                    i11 = 2;
                }
                f = f6;
                i6 = i10;
                i7 = i11;
            } else {
                f = f6;
                i6 = i10;
                if (q6 == 1952608120 && this.f14933l) {
                    i7 = 2;
                    AbstractC1668us.S(c1617tm.o() >= 2 ? i6 : 0);
                    f6 = Math.max(0.0f, Math.min(c1617tm.z() / this.f14938q, 0.95f));
                    c1617tm.j(i14 + q5);
                    i10 = i6;
                    i11 = i7;
                    i9 = 0;
                } else {
                    i7 = 2;
                }
            }
            f6 = f;
            c1617tm.j(i14 + q5);
            i10 = i6;
            i11 = i7;
            i9 = 0;
        }
        q12.mo11k(new L1(AbstractC1044gv.n(new C1881zg(spannableStringBuilder, null, null, null, f6, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }
}
