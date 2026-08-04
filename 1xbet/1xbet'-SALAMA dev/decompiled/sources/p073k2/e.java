package p073k2;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import p151v2.a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f14724A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final boolean[] f14725B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f14726C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f14727D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f14728E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f14729F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f14730w = c(2, 2, 2, 0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f14731x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f14732y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f14733z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14734a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f14735b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14742i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14743k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14744l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14745m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14746n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14747o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14748p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14753u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14754v;

    static {
        int iC = c(0, 0, 0, 0);
        f14731x = iC;
        int iC2 = c(0, 0, 0, 3);
        f14732y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f14733z = new int[]{0, 0, 0, 0, 0, 0, 2};
        f14724A = new int[]{3, 3, 3, 3, 3, 3, 1};
        f14725B = new boolean[]{false, false, false, true, true, true, false};
        f14726C = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        f14727D = new int[]{0, 1, 2, 3, 4, 3, 4};
        f14728E = new int[]{0, 0, 0, 0, 0, 3, 3};
        f14729F = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public e() {
        d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public static int c(int i7, int i8, int i9, int i10) {
        int i11;
        a.g(i7, 4);
        a.g(i8, 4);
        a.g(i9, 4);
        a.g(i10, 4);
        if (i10 == 0 || i10 == 1) {
            i11 = 255;
        } else if (i10 == 2) {
            i11 = 127;
        } else if (i10 != 3) {
            i11 = 255;
        } else {
            i11 = 0;
        }
        return Color.argb(i11, i7 > 1 ? 255 : 0, i8 > 1 ? 255 : 0, i9 > 1 ? 255 : 0);
    }

    public final void a(char c3) {
        SpannableStringBuilder spannableStringBuilder = this.f14735b;
        if (c3 != '\n') {
            spannableStringBuilder.append(c3);
            return;
        }
        ArrayList arrayList = this.f14734a;
        arrayList.add(b());
        spannableStringBuilder.clear();
        if (this.f14748p != -1) {
            this.f14748p = 0;
        }
        if (this.f14749q != -1) {
            this.f14749q = 0;
        }
        if (this.f14750r != -1) {
            this.f14750r = 0;
        }
        if (this.f14752t != -1) {
            this.f14752t = 0;
        }
        while (true) {
            if ((!this.f14743k || arrayList.size() < this.j) && arrayList.size() < 15) {
                return;
            } else {
                arrayList.remove(0);
            }
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f14735b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f14748p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f14748p, length, 33);
            }
            if (this.f14749q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f14749q, length, 33);
            }
            if (this.f14750r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f14751s), this.f14750r, length, 33);
            }
            if (this.f14752t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f14753u), this.f14752t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f14734a.clear();
        this.f14735b.clear();
        this.f14748p = -1;
        this.f14749q = -1;
        this.f14750r = -1;
        this.f14752t = -1;
        this.f14754v = 0;
        this.f14736c = false;
        this.f14737d = false;
        this.f14738e = 4;
        this.f14739f = false;
        this.f14740g = 0;
        this.f14741h = 0;
        this.f14742i = 0;
        this.j = 15;
        this.f14743k = true;
        this.f14744l = 0;
        this.f14745m = 0;
        this.f14746n = 0;
        int i7 = f14731x;
        this.f14747o = i7;
        this.f14751s = f14730w;
        this.f14753u = i7;
    }

    public final void e(boolean z4, boolean z7) {
        int i7 = this.f14748p;
        SpannableStringBuilder spannableStringBuilder = this.f14735b;
        if (i7 != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f14748p, spannableStringBuilder.length(), 33);
                this.f14748p = -1;
            }
        } else if (z4) {
            this.f14748p = spannableStringBuilder.length();
        }
        if (this.f14749q == -1) {
            if (z7) {
                this.f14749q = spannableStringBuilder.length();
            }
        } else {
            if (z7) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f14749q, spannableStringBuilder.length(), 33);
            this.f14749q = -1;
        }
    }

    public final void f(int i7, int i8) {
        int i9 = this.f14750r;
        SpannableStringBuilder spannableStringBuilder = this.f14735b;
        if (i9 != -1 && this.f14751s != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f14751s), this.f14750r, spannableStringBuilder.length(), 33);
        }
        if (i7 != f14730w) {
            this.f14750r = spannableStringBuilder.length();
            this.f14751s = i7;
        }
        if (this.f14752t != -1 && this.f14753u != i8) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f14753u), this.f14752t, spannableStringBuilder.length(), 33);
        }
        if (i8 != f14731x) {
            this.f14752t = spannableStringBuilder.length();
            this.f14753u = i8;
        }
    }
}
