package k2;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f14718A;

    /* renamed from: B, reason: collision with root package name */
    public static final boolean[] f14719B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f14720C;

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f14721D;

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f14722E;

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f14723F;

    /* renamed from: w, reason: collision with root package name */
    public static final int f14724w = c(2, 2, 2, 0);

    /* renamed from: x, reason: collision with root package name */
    public static final int f14725x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f14726y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f14727z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14728a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f14729b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f14730c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14731d;

    /* renamed from: e, reason: collision with root package name */
    public int f14732e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14733f;

    /* renamed from: g, reason: collision with root package name */
    public int f14734g;

    /* renamed from: h, reason: collision with root package name */
    public int f14735h;

    /* renamed from: i, reason: collision with root package name */
    public int f14736i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14737k;

    /* renamed from: l, reason: collision with root package name */
    public int f14738l;

    /* renamed from: m, reason: collision with root package name */
    public int f14739m;

    /* renamed from: n, reason: collision with root package name */
    public int f14740n;

    /* renamed from: o, reason: collision with root package name */
    public int f14741o;

    /* renamed from: p, reason: collision with root package name */
    public int f14742p;

    /* renamed from: q, reason: collision with root package name */
    public int f14743q;

    /* renamed from: r, reason: collision with root package name */
    public int f14744r;

    /* renamed from: s, reason: collision with root package name */
    public int f14745s;

    /* renamed from: t, reason: collision with root package name */
    public int f14746t;

    /* renamed from: u, reason: collision with root package name */
    public int f14747u;

    /* renamed from: v, reason: collision with root package name */
    public int f14748v;

    static {
        int c3 = c(0, 0, 0, 0);
        f14725x = c3;
        int c4 = c(0, 0, 0, 3);
        f14726y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f14727z = new int[]{0, 0, 0, 0, 0, 0, 2};
        f14718A = new int[]{3, 3, 3, 3, 3, 3, 1};
        f14719B = new boolean[]{false, false, false, true, true, true, false};
        f14720C = new int[]{c3, c4, c3, c3, c4, c3, c3};
        f14721D = new int[]{0, 1, 2, 3, 4, 3, 4};
        f14722E = new int[]{0, 0, 0, 0, 0, 3, 3};
        f14723F = new int[]{c3, c3, c3, c3, c3, c4, c4};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i7, int i8, int i9, int i10) {
        int i11;
        AbstractC1664a.g(i7, 4);
        AbstractC1664a.g(i8, 4);
        AbstractC1664a.g(i9, 4);
        AbstractC1664a.g(i10, 4);
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                i11 = 127;
            } else if (i10 == 3) {
                i11 = 0;
            }
            return Color.argb(i11, i7 <= 1 ? 255 : 0, i8 <= 1 ? 255 : 0, i9 > 1 ? 255 : 0);
        }
        i11 = 255;
        return Color.argb(i11, i7 <= 1 ? 255 : 0, i8 <= 1 ? 255 : 0, i9 > 1 ? 255 : 0);
    }

    public final void a(char c3) {
        SpannableStringBuilder spannableStringBuilder = this.f14729b;
        if (c3 != '\n') {
            spannableStringBuilder.append(c3);
            return;
        }
        ArrayList arrayList = this.f14728a;
        arrayList.add(b());
        spannableStringBuilder.clear();
        if (this.f14742p != -1) {
            this.f14742p = 0;
        }
        if (this.f14743q != -1) {
            this.f14743q = 0;
        }
        if (this.f14744r != -1) {
            this.f14744r = 0;
        }
        if (this.f14746t != -1) {
            this.f14746t = 0;
        }
        while (true) {
            if ((!this.f14737k || arrayList.size() < this.j) && arrayList.size() < 15) {
                return;
            } else {
                arrayList.remove(0);
            }
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f14729b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f14742p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f14742p, length, 33);
            }
            if (this.f14743q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f14743q, length, 33);
            }
            if (this.f14744r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f14745s), this.f14744r, length, 33);
            }
            if (this.f14746t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f14747u), this.f14746t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f14728a.clear();
        this.f14729b.clear();
        this.f14742p = -1;
        this.f14743q = -1;
        this.f14744r = -1;
        this.f14746t = -1;
        this.f14748v = 0;
        this.f14730c = false;
        this.f14731d = false;
        this.f14732e = 4;
        this.f14733f = false;
        this.f14734g = 0;
        this.f14735h = 0;
        this.f14736i = 0;
        this.j = 15;
        this.f14737k = true;
        this.f14738l = 0;
        this.f14739m = 0;
        this.f14740n = 0;
        int i7 = f14725x;
        this.f14741o = i7;
        this.f14745s = f14724w;
        this.f14747u = i7;
    }

    public final void e(boolean z4, boolean z7) {
        int i7 = this.f14742p;
        SpannableStringBuilder spannableStringBuilder = this.f14729b;
        if (i7 != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f14742p, spannableStringBuilder.length(), 33);
                this.f14742p = -1;
            }
        } else if (z4) {
            this.f14742p = spannableStringBuilder.length();
        }
        if (this.f14743q == -1) {
            if (z7) {
                this.f14743q = spannableStringBuilder.length();
            }
        } else {
            if (z7) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f14743q, spannableStringBuilder.length(), 33);
            this.f14743q = -1;
        }
    }

    public final void f(int i7, int i8) {
        int i9 = this.f14744r;
        SpannableStringBuilder spannableStringBuilder = this.f14729b;
        if (i9 != -1 && this.f14745s != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f14745s), this.f14744r, spannableStringBuilder.length(), 33);
        }
        if (i7 != f14724w) {
            this.f14744r = spannableStringBuilder.length();
            this.f14745s = i7;
        }
        if (this.f14746t != -1 && this.f14747u != i8) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f14747u), this.f14746t, spannableStringBuilder.length(), 33);
        }
        if (i8 != f14725x) {
            this.f14746t = spannableStringBuilder.length();
            this.f14747u = i8;
        }
    }
}
