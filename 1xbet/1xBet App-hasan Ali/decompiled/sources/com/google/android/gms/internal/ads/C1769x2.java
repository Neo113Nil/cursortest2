package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.text.Layout;

/* renamed from: com.google.android.gms.internal.ads.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1769x2 {

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f16214c;

    /* renamed from: a, reason: collision with root package name */
    public long f16212a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f16213b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f16215d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f16216e = -3.4028235E38f;
    public int f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f16217g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f16218h = -3.4028235E38f;
    public int i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public float f16219j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f16220k = Integer.MIN_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x006f, code lost:
    
        if (r6 == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0895dg a() {
        Layout.Alignment alignment;
        float f;
        CharSequence charSequence;
        float f5 = this.f16218h;
        float f6 = -3.4028235E38f;
        if (f5 == -3.4028235E38f) {
            int i = this.f16215d;
            f5 = i != 4 ? i != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i5 = this.i;
        if (i5 == Integer.MIN_VALUE) {
            int i6 = this.f16215d;
            if (i6 != 1) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 != 5) {
                            i5 = 1;
                        }
                    }
                }
                i5 = 2;
            }
            i5 = 0;
        }
        C0895dg c0895dg = new C0895dg();
        int i7 = this.f16215d;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            AbstractC0467k.y(i7, "Unknown textAlignment: ", "WebvttCueParser");
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            c0895dg.f13130c = alignment;
            f = this.f16216e;
            int i8 = this.f;
            if (f != -3.4028235E38f || i8 != 0 || (f >= 0.0f && f <= 1.0f)) {
                if (f == -3.4028235E38f) {
                    f6 = f;
                }
                c0895dg.f13132e = f6;
                c0895dg.f = i8;
                c0895dg.f13133g = this.f16217g;
                c0895dg.f13134h = f5;
                c0895dg.i = i5;
                float f7 = this.f16219j;
                if (i5 == 0) {
                    f5 = 1.0f - f5;
                } else if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException(String.valueOf(i5));
                    }
                } else if (f5 <= 0.5f) {
                    f5 += f5;
                } else {
                    float f8 = 1.0f - f5;
                    f5 = f8 + f8;
                }
                c0895dg.f13137l = Math.min(f7, f5);
                c0895dg.f13139n = this.f16220k;
                charSequence = this.f16214c;
                if (charSequence != null) {
                    c0895dg.f13128a = charSequence;
                }
                return c0895dg;
            }
            f6 = 1.0f;
            c0895dg.f13132e = f6;
            c0895dg.f = i8;
            c0895dg.f13133g = this.f16217g;
            c0895dg.f13134h = f5;
            c0895dg.i = i5;
            float f72 = this.f16219j;
            if (i5 == 0) {
            }
            c0895dg.f13137l = Math.min(f72, f5);
            c0895dg.f13139n = this.f16220k;
            charSequence = this.f16214c;
            if (charSequence != null) {
            }
            return c0895dg;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        c0895dg.f13130c = alignment;
        f = this.f16216e;
        int i82 = this.f;
        if (f != -3.4028235E38f) {
        }
        if (f == -3.4028235E38f) {
        }
        c0895dg.f13132e = f6;
        c0895dg.f = i82;
        c0895dg.f13133g = this.f16217g;
        c0895dg.f13134h = f5;
        c0895dg.i = i5;
        float f722 = this.f16219j;
        if (i5 == 0) {
        }
        c0895dg.f13137l = Math.min(f722, f5);
        c0895dg.f13139n = this.f16220k;
        charSequence = this.f16214c;
        if (charSequence != null) {
        }
        return c0895dg;
    }
}
