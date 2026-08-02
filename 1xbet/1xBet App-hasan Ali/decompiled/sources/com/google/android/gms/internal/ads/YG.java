package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class YG extends AbstractC1022gH implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final int f12312A;

    /* renamed from: B, reason: collision with root package name */
    public final int f12313B;

    /* renamed from: C, reason: collision with root package name */
    public final int f12314C;

    /* renamed from: D, reason: collision with root package name */
    public final int f12315D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f12316E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f12317F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f12318G;

    /* renamed from: o, reason: collision with root package name */
    public final int f12319o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f12320p;

    /* renamed from: q, reason: collision with root package name */
    public final String f12321q;

    /* renamed from: r, reason: collision with root package name */
    public final C0843cH f12322r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f12323s;

    /* renamed from: t, reason: collision with root package name */
    public final int f12324t;

    /* renamed from: u, reason: collision with root package name */
    public final int f12325u;

    /* renamed from: v, reason: collision with root package name */
    public final int f12326v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f12327w;

    /* renamed from: x, reason: collision with root package name */
    public final int f12328x;

    /* renamed from: y, reason: collision with root package name */
    public final int f12329y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f12330z;

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb A[LOOP:1: B:30:0x00e8->B:32:0x00eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a A[EDGE_INSN: B:82:0x012a->B:50:0x012a BREAK  A[LOOP:3: B:42:0x010f->B:80:0x0127], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a8 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public YG(int i, C1292mb c1292mb, int i5, C0843cH c0843cH, int i6, boolean z3, XG xg) {
        super(i, c1292mb, i5);
        int i7;
        int i8;
        char c5;
        boolean z5;
        String[] strArr;
        int i9;
        int i10;
        int i11;
        int i12;
        C1761wv c1761wv;
        C0843cH c0843cH2;
        boolean z6;
        LocaleList locales;
        String languageTags;
        this.f12322r = c0843cH;
        int i13 = 1;
        int i14 = true != c0843cH.f12991o ? 16 : 24;
        this.f12321q = C1112iH.c(this.f13586n.f14897d);
        this.f12323s = AbstractC1400ot.p(i6, false);
        int i15 = 0;
        while (true) {
            C1761wv c1761wv2 = c0843cH.f16304e;
            i7 = Integer.MAX_VALUE;
            if (i15 >= c1761wv2.f16186n) {
                i8 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                i8 = C1112iH.b(this.f13586n, (String) c1761wv2.get(i15), false);
                if (i8 > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f12325u = i15;
        this.f12324t = i8;
        int i16 = this.f13586n.f;
        this.f12326v = (i16 == 0 || i16 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        C1407p c1407p = this.f13586n;
        int i17 = c1407p.f;
        this.f12327w = i17 == 0 || (i17 & 1) != 0;
        this.f12330z = 1 == (c1407p.f14898e & 1);
        String str = c1407p.f14904m;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode == -2123537834) {
                if (str.equals("audio/eac3-joc")) {
                    c5 = 0;
                    if (c5 != 0) {
                    }
                }
                c5 = 65535;
                if (c5 != 0) {
                }
            } else if (hashCode != 187078297) {
                if (hashCode == 1504698186 && str.equals("audio/iamf")) {
                    c5 = 2;
                    z5 = (c5 != 0 || c5 == 1 || c5 == 2) ? true : z5;
                }
                c5 = 65535;
                if (c5 != 0) {
                }
            } else {
                if (str.equals("audio/ac4")) {
                    c5 = 1;
                    if (c5 != 0) {
                    }
                }
                c5 = 65535;
                if (c5 != 0) {
                }
            }
            this.f12318G = z5;
            this.f12312A = c1407p.f14886B;
            this.f12313B = c1407p.f14887C;
            this.f12314C = c1407p.i;
            this.f12320p = xg.k(c1407p);
            Configuration configuration = Resources.getSystem().getConfiguration();
            if (AbstractC1260lo.f14419a < 24) {
                locales = configuration.getLocales();
                languageTags = locales.toLanguageTags();
                strArr = languageTags.split(",", -1);
            } else {
                strArr = new String[]{configuration.locale.toLanguageTag()};
            }
            for (i9 = 0; i9 < strArr.length; i9++) {
                strArr[i9] = AbstractC1260lo.a(strArr[i9]);
            }
            i10 = 0;
            while (true) {
                if (i10 < strArr.length) {
                    i11 = 0;
                    i10 = Integer.MAX_VALUE;
                    break;
                } else {
                    i11 = C1112iH.b(this.f13586n, strArr[i10], false);
                    if (i11 > 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f12328x = i10;
            this.f12329y = i11;
            i12 = 0;
            while (true) {
                c1761wv = c0843cH.f;
                if (i12 >= c1761wv.f16186n) {
                    break;
                }
                String str2 = this.f13586n.f14904m;
                if (str2 != null && str2.equals(c1761wv.get(i12))) {
                    i7 = i12;
                    break;
                }
                i12++;
            }
            this.f12315D = i7;
            this.f12316E = (i6 & 384) != 128;
            this.f12317F = (i6 & 64) != 64;
            c0843cH2 = this.f12322r;
            if (!AbstractC1400ot.p(i6, c0843cH2.f12993q) || (!(z6 = this.f12320p) && !c0843cH2.f12990n)) {
                i13 = 0;
            } else if (AbstractC1400ot.p(i6, false) && z6 && this.f13586n.i != -1 && ((c0843cH2.f12994r || !z3) && (i14 & i6) != 0)) {
                i13 = 2;
            }
            this.f12319o = i13;
        }
        z5 = false;
        this.f12318G = z5;
        this.f12312A = c1407p.f14886B;
        this.f12313B = c1407p.f14887C;
        this.f12314C = c1407p.i;
        this.f12320p = xg.k(c1407p);
        Configuration configuration2 = Resources.getSystem().getConfiguration();
        if (AbstractC1260lo.f14419a < 24) {
        }
        while (i9 < strArr.length) {
        }
        i10 = 0;
        while (true) {
            if (i10 < strArr.length) {
            }
            i10++;
        }
        this.f12328x = i10;
        this.f12329y = i11;
        i12 = 0;
        while (true) {
            c1761wv = c0843cH.f;
            if (i12 >= c1761wv.f16186n) {
            }
            i12++;
        }
        this.f12315D = i7;
        this.f12316E = (i6 & 384) != 128;
        this.f12317F = (i6 & 64) != 64;
        c0843cH2 = this.f12322r;
        if (!AbstractC1400ot.p(i6, c0843cH2.f12993q)) {
            if (AbstractC1400ot.p(i6, false)) {
                i13 = 2;
            }
            this.f12319o = i13;
        }
        i13 = 0;
        this.f12319o = i13;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1022gH
    public final int a() {
        return this.f12319o;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1022gH
    public final /* bridge */ /* synthetic */ boolean b(AbstractC1022gH abstractC1022gH) {
        String str;
        int i;
        YG yg = (YG) abstractC1022gH;
        this.f12322r.getClass();
        C1407p c1407p = this.f13586n;
        int i5 = c1407p.f14886B;
        if (i5 == -1) {
            return false;
        }
        C1407p c1407p2 = yg.f13586n;
        return i5 == c1407p2.f14886B && (str = c1407p.f14904m) != null && TextUtils.equals(str, c1407p2.f14904m) && (i = c1407p.f14887C) != -1 && i == c1407p2.f14887C && this.f12316E == yg.f12316E && this.f12317F == yg.f12317F;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(YG yg) {
        Comparator comparator = C1112iH.f13929j;
        boolean z3 = this.f12323s;
        boolean z5 = this.f12320p;
        if (!z5 || !z3) {
            comparator = new Ev();
        }
        Zu d5 = Zu.f12539a.d(z3, yg.f12323s);
        Integer valueOf = Integer.valueOf(this.f12325u);
        Integer valueOf2 = Integer.valueOf(yg.f12325u);
        C1671uv c1671uv = C1671uv.f15932m;
        Zu c5 = d5.c(valueOf, valueOf2, c1671uv).b(this.f12324t, yg.f12324t).b(this.f12326v, yg.f12326v).d(this.f12330z, yg.f12330z).d(this.f12327w, yg.f12327w).c(Integer.valueOf(this.f12328x), Integer.valueOf(yg.f12328x), c1671uv).b(this.f12329y, yg.f12329y).d(z5, yg.f12320p).c(Integer.valueOf(this.f12315D), Integer.valueOf(yg.f12315D), c1671uv);
        this.f12322r.getClass();
        Zu c6 = c5.d(this.f12316E, yg.f12316E).d(this.f12317F, yg.f12317F).d(this.f12318G, yg.f12318G).c(Integer.valueOf(this.f12312A), Integer.valueOf(yg.f12312A), comparator).c(Integer.valueOf(this.f12313B), Integer.valueOf(yg.f12313B), comparator);
        if (Objects.equals(this.f12321q, yg.f12321q)) {
            c6 = c6.c(Integer.valueOf(this.f12314C), Integer.valueOf(yg.f12314C), comparator);
        }
        return c6.a();
    }
}
