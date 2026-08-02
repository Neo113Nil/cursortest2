package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final int f10089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10090b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10091c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10092d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10093e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10094g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10095h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f10096j;

    /* renamed from: k, reason: collision with root package name */
    public final C0709Wb f10097k;

    /* renamed from: l, reason: collision with root package name */
    public final C5 f10098l;

    public K(int i, int i5, int i6, int i7, int i8, int i9, int i10, long j5, C0709Wb c0709Wb, C5 c5) {
        this.f10089a = i;
        this.f10090b = i5;
        this.f10091c = i6;
        this.f10092d = i7;
        this.f10093e = i8;
        this.f = d(i8);
        this.f10094g = i9;
        this.f10095h = i10;
        this.i = c(i10);
        this.f10096j = j5;
        this.f10097k = c0709Wb;
        this.f10098l = c5;
    }

    public static int c(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j5 = this.f10096j;
        if (j5 == 0) {
            return -9223372036854775807L;
        }
        return (j5 * 1000000) / this.f10093e;
    }

    public final C1407p b(byte[] bArr, C5 c5) {
        bArr[4] = Byte.MIN_VALUE;
        C5 c52 = this.f10098l;
        if (c52 != null) {
            c5 = c52.b(c5);
        }
        C1649uH c1649uH = new C1649uH();
        c1649uH.c("audio/flac");
        int i = this.f10092d;
        if (i <= 0) {
            i = -1;
        }
        c1649uH.f15849m = i;
        c1649uH.f15831A = this.f10094g;
        c1649uH.f15832B = this.f10093e;
        c1649uH.f15833C = AbstractC1260lo.q(this.f10095h);
        c1649uH.f15851o = Collections.singletonList(bArr);
        c1649uH.f15846j = c5;
        return new C1407p(c1649uH);
    }

    public K(int i, byte[] bArr) {
        C0826c0 c0826c0 = new C0826c0(bArr.length, bArr);
        c0826c0.s(i * 8);
        this.f10089a = c0826c0.f(16);
        this.f10090b = c0826c0.f(16);
        this.f10091c = c0826c0.f(24);
        this.f10092d = c0826c0.f(24);
        int f = c0826c0.f(20);
        this.f10093e = f;
        this.f = d(f);
        this.f10094g = c0826c0.f(3) + 1;
        int f5 = c0826c0.f(5) + 1;
        this.f10095h = f5;
        this.i = c(f5);
        this.f10096j = c0826c0.h(36);
        this.f10097k = null;
        this.f10098l = null;
    }
}
