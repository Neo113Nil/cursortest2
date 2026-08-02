package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.zg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1881zg {

    /* renamed from: A, reason: collision with root package name */
    public static final String f16725A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f16726B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f16727C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f16728D;

    /* renamed from: E, reason: collision with root package name */
    public static final String f16729E;

    /* renamed from: F, reason: collision with root package name */
    public static final String f16730F;

    /* renamed from: G, reason: collision with root package name */
    public static final String f16731G;

    /* renamed from: p, reason: collision with root package name */
    public static final String f16732p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f16733q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f16734r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f16735s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f16736t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f16737u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f16738v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f16739w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f16740x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f16741y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f16742z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f16743a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f16744b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f16745c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f16746d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16747e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16748g;

    /* renamed from: h, reason: collision with root package name */
    public final float f16749h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final float f16750j;

    /* renamed from: k, reason: collision with root package name */
    public final float f16751k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16752l;

    /* renamed from: m, reason: collision with root package name */
    public final float f16753m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16754n;

    /* renamed from: o, reason: collision with root package name */
    public final float f16755o;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = Integer.MIN_VALUE;
        float f = -3.4028235E38f;
        new C1881zg("", null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f, i, i, f, i, i, f, f, f, i, 0.0f);
        f16732p = Integer.toString(0, 36);
        f16733q = Integer.toString(17, 36);
        f16734r = Integer.toString(1, 36);
        f16735s = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f16736t = Integer.toString(18, 36);
        f16737u = Integer.toString(4, 36);
        f16738v = Integer.toString(5, 36);
        f16739w = Integer.toString(6, 36);
        f16740x = Integer.toString(7, 36);
        f16741y = Integer.toString(8, 36);
        f16742z = Integer.toString(9, 36);
        f16725A = Integer.toString(10, 36);
        f16726B = Integer.toString(11, 36);
        f16727C = Integer.toString(12, 36);
        f16728D = Integer.toString(13, 36);
        f16729E = Integer.toString(14, 36);
        f16730F = Integer.toString(15, 36);
        f16731G = Integer.toString(16, 36);
    }

    public /* synthetic */ C1881zg(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i5, float f5, int i6, int i7, float f6, float f7, float f8, int i8, float f9) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC1668us.S(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f16743a = SpannedString.valueOf(charSequence);
        } else {
            this.f16743a = charSequence != null ? charSequence.toString() : null;
        }
        this.f16744b = alignment;
        this.f16745c = alignment2;
        this.f16746d = bitmap;
        this.f16747e = f;
        this.f = i;
        this.f16748g = i5;
        this.f16749h = f5;
        this.i = i6;
        this.f16750j = f7;
        this.f16751k = f8;
        this.f16752l = i7;
        this.f16753m = f6;
        this.f16754n = i8;
        this.f16755o = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1881zg.class != obj.getClass()) {
            return false;
        }
        C1881zg c1881zg = (C1881zg) obj;
        if (!TextUtils.equals(this.f16743a, c1881zg.f16743a) || this.f16744b != c1881zg.f16744b || this.f16745c != c1881zg.f16745c) {
            return false;
        }
        Bitmap bitmap = c1881zg.f16746d;
        Bitmap bitmap2 = this.f16746d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f16747e == c1881zg.f16747e && this.f == c1881zg.f && this.f16748g == c1881zg.f16748g && this.f16749h == c1881zg.f16749h && this.i == c1881zg.i && this.f16750j == c1881zg.f16750j && this.f16751k == c1881zg.f16751k && this.f16752l == c1881zg.f16752l && this.f16753m == c1881zg.f16753m && this.f16754n == c1881zg.f16754n && this.f16755o == c1881zg.f16755o;
    }

    public final int hashCode() {
        Float valueOf = Float.valueOf(this.f16747e);
        Integer valueOf2 = Integer.valueOf(this.f);
        Integer valueOf3 = Integer.valueOf(this.f16748g);
        Float valueOf4 = Float.valueOf(this.f16749h);
        Integer valueOf5 = Integer.valueOf(this.i);
        Float valueOf6 = Float.valueOf(this.f16750j);
        Float valueOf7 = Float.valueOf(this.f16751k);
        Integer valueOf8 = Integer.valueOf(this.f16752l);
        Float valueOf9 = Float.valueOf(this.f16753m);
        Integer valueOf10 = Integer.valueOf(this.f16754n);
        Float valueOf11 = Float.valueOf(this.f16755o);
        return Arrays.hashCode(new Object[]{this.f16743a, this.f16744b, this.f16745c, this.f16746d, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, Boolean.FALSE, -16777216, valueOf8, valueOf9, valueOf10, valueOf11});
    }
}
