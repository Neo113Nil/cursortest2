package com.google.android.gms.internal.ads;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.internal.ads.k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1185k2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14207a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14208b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14209c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14210d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14211e;
    public final C1365o2 f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f14212g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14213h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final C1185k2 f14214j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f14215k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f14216l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f14217m;

    public C1185k2(String str, String str2, long j5, long j6, C1365o2 c1365o2, String[] strArr, String str3, String str4, C1185k2 c1185k2) {
        this.f14207a = str;
        this.f14208b = str2;
        this.i = str4;
        this.f = c1365o2;
        this.f14212g = strArr;
        this.f14209c = str2 != null;
        this.f14210d = j5;
        this.f14211e = j6;
        str3.getClass();
        this.f14213h = str3;
        this.f14214j = c1185k2;
        this.f14215k = new HashMap();
        this.f14216l = new HashMap();
    }

    public static C1185k2 b(String str, long j5, long j6, C1365o2 c1365o2, String[] strArr, String str2, String str3, C1185k2 c1185k2) {
        return new C1185k2(str, null, j5, j6, c1365o2, strArr, str2, str3, c1185k2);
    }

    public static C1185k2 c(String str) {
        return new C1185k2(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder f(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C0895dg c0895dg = new C0895dg();
            c0895dg.f13128a = new SpannableStringBuilder();
            treeMap.put(str, c0895dg);
        }
        CharSequence charSequence = ((C0895dg) treeMap.get(str)).f13128a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final int a() {
        ArrayList arrayList = this.f14217m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final C1185k2 d(int i) {
        ArrayList arrayList = this.f14217m;
        if (arrayList != null) {
            return (C1185k2) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean e(long j5) {
        long j6 = this.f14210d;
        long j7 = this.f14211e;
        if (j6 == -9223372036854775807L) {
            if (j7 == -9223372036854775807L) {
                return true;
            }
            j6 = -9223372036854775807L;
        }
        if (j6 <= j5 && j7 == -9223372036854775807L) {
            return true;
        }
        if (j6 != -9223372036854775807L || j5 >= j7) {
            return j6 <= j5 && j5 < j7;
        }
        return true;
    }

    public final void g(TreeSet treeSet, boolean z3) {
        String str = this.f14207a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z3 || equals || (equals2 && this.i != null)) {
            long j5 = this.f14210d;
            if (j5 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j5));
            }
            long j6 = this.f14211e;
            if (j6 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j6));
            }
        }
        if (this.f14217m != null) {
            for (int i = 0; i < this.f14217m.size(); i++) {
                C1185k2 c1185k2 = (C1185k2) this.f14217m.get(i);
                boolean z5 = true;
                if (!z3 && !equals) {
                    z5 = false;
                }
                c1185k2.g(treeSet, z5);
            }
        }
    }

    public final void h(long j5, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f14213h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (e(j5) && "div".equals(this.f14207a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < a(); i++) {
            d(i).h(j5, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j5, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        int i;
        int i5;
        C1185k2 c1185k2;
        int i6;
        int i7;
        C1365o2 f;
        int i8;
        Iterator it;
        float f5;
        int i9;
        int i10;
        Map map2 = map;
        int i11 = -1;
        int i12 = 1;
        if (e(j5)) {
            String str2 = this.f14213h;
            String str3 = !"".equals(str2) ? str2 : str;
            Iterator it2 = this.f14216l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.f14215k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    C0895dg c0895dg = (C0895dg) treeMap.get(str4);
                    c0895dg.getClass();
                    C1320n2 c1320n2 = (C1320n2) hashMap.get(str3);
                    c1320n2.getClass();
                    C1365o2 f6 = AbstractC1803xs.f(this.f, this.f14212g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0895dg.f13128a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c0895dg.f13128a = spannableStringBuilder;
                    }
                    if (f6 != null) {
                        int i13 = f6.f14752h;
                        if (((i13 == i11 && f6.i == i11) ? i11 : (i13 == i12 ? i12 : 0) | (f6.i == i12 ? 2 : 0)) != i11) {
                            int i14 = f6.f14752h;
                            if (i14 == i11) {
                                if (f6.i != i11) {
                                    i12 = 1;
                                } else {
                                    i10 = i11;
                                    i12 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i10);
                                    i = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                }
                            }
                            i10 = (i14 == i12 ? i12 : 0) | (f6.i == i12 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i10);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (f6.f == i12) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i);
                        }
                        if (f6.f14751g == i12) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i);
                        }
                        if (f6.f14748c) {
                            if (!f6.f14748c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            AbstractC1803xs.x(spannableStringBuilder, new ForegroundColorSpan(f6.f14747b), intValue, intValue2);
                        }
                        if (f6.f14750e) {
                            if (!f6.f14750e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            AbstractC1803xs.x(spannableStringBuilder, new BackgroundColorSpan(f6.f14749d), intValue, intValue2);
                        }
                        if (f6.f14746a != null) {
                            AbstractC1803xs.x(spannableStringBuilder, new TypefaceSpan(f6.f14746a), intValue, intValue2);
                        }
                        C1140j2 c1140j2 = f6.f14761r;
                        if (c1140j2 != null) {
                            int i15 = c1140j2.f14056a;
                            if (i15 == i11) {
                                int i16 = c1320n2.f14576j;
                                i15 = (i16 == 2 || i16 == 1) ? 3 : 1;
                                i9 = 1;
                            } else {
                                i9 = c1140j2.f14057b;
                            }
                            i5 = i11;
                            int i17 = c1140j2.f14058c;
                            if (i17 == -2) {
                                i17 = 1;
                            }
                            AbstractC1803xs.x(spannableStringBuilder, new C1702vh(i15, i9, i17), intValue, intValue2);
                        } else {
                            i5 = i11;
                        }
                        int i18 = f6.f14756m;
                        if (i18 == 2) {
                            C1185k2 c1185k22 = this.f14214j;
                            while (true) {
                                if (c1185k22 == null) {
                                    c1185k22 = null;
                                    break;
                                }
                                C1365o2 f7 = AbstractC1803xs.f(c1185k22.f, c1185k22.f14212g, map2);
                                if (f7 != null && f7.f14756m == 1) {
                                    break;
                                } else {
                                    c1185k22 = c1185k22.f14214j;
                                }
                            }
                            if (c1185k22 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c1185k22);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c1185k2 = null;
                                        break;
                                    }
                                    C1185k2 c1185k23 = (C1185k2) arrayDeque.pop();
                                    C1365o2 f8 = AbstractC1803xs.f(c1185k23.f, c1185k23.f14212g, map2);
                                    if (f8 != null && f8.f14756m == 3) {
                                        c1185k2 = c1185k23;
                                        break;
                                    }
                                    int a5 = c1185k23.a();
                                    while (true) {
                                        a5--;
                                        if (a5 >= 0) {
                                            arrayDeque.push(c1185k23.d(a5));
                                        }
                                    }
                                }
                                if (c1185k2 != null) {
                                    if (c1185k2.a() != 1 || c1185k2.d(0).f14208b == null) {
                                        JB.i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = c1185k2.d(0).f14208b;
                                        int i19 = AbstractC1260lo.f14419a;
                                        C1365o2 f9 = AbstractC1803xs.f(c1185k2.f, c1185k2.f14212g, map2);
                                        if (f9 != null) {
                                            i6 = f9.f14757n;
                                            i7 = i5;
                                        } else {
                                            i6 = i5;
                                            i7 = i6;
                                        }
                                        if (i6 == i7 && (f = AbstractC1803xs.f(c1185k22.f, c1185k22.f14212g, map2)) != null) {
                                            i6 = f.f14757n;
                                        }
                                        spannableStringBuilder.setSpan(new C1208kh(str5, i6), intValue, intValue2, 33);
                                    }
                                    if (f6.f14760q == 1) {
                                        AbstractC1803xs.x(spannableStringBuilder, new C0807bh(), intValue, intValue2);
                                    }
                                    i8 = f6.f14753j;
                                    if (i8 != 1) {
                                        it = it2;
                                        f5 = 100.0f;
                                        AbstractC1803xs.x(spannableStringBuilder, new AbsoluteSizeSpan((int) f6.f14754k, true), intValue, intValue2);
                                    } else if (i8 == 2) {
                                        it = it2;
                                        f5 = 100.0f;
                                        AbstractC1803xs.x(spannableStringBuilder, new RelativeSizeSpan(f6.f14754k), intValue, intValue2);
                                    } else if (i8 != 3) {
                                        it = it2;
                                        f5 = 100.0f;
                                    } else {
                                        float f10 = f6.f14754k / 100.0f;
                                        RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                        int length = relativeSizeSpanArr.length;
                                        f5 = 100.0f;
                                        int i20 = 0;
                                        while (i20 < length) {
                                            RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i20];
                                            Iterator it3 = it2;
                                            if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                f10 = relativeSizeSpan.getSizeChange() * f10;
                                            }
                                            if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                    spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                }
                                            }
                                            i20++;
                                            it2 = it3;
                                        }
                                        it = it2;
                                        spannableStringBuilder.setSpan(new RelativeSizeSpan(f10), intValue, intValue2, 33);
                                    }
                                    if ("p".equals(this.f14207a)) {
                                        float f11 = f6.f14762s;
                                        if (f11 != Float.MAX_VALUE) {
                                            c0895dg.f13140o = (f11 * (-90.0f)) / f5;
                                        }
                                        Layout.Alignment alignment = f6.f14758o;
                                        if (alignment != null) {
                                            c0895dg.f13130c = alignment;
                                        }
                                        Layout.Alignment alignment2 = f6.f14759p;
                                        if (alignment2 != null) {
                                            c0895dg.f13131d = alignment2;
                                        }
                                    }
                                    map2 = map;
                                    it2 = it;
                                    i11 = -1;
                                    i12 = 1;
                                }
                            }
                        } else if (i18 == 3 || i18 == 4) {
                            spannableStringBuilder.setSpan(new C1097i2(), intValue, intValue2, 33);
                        }
                        if (f6.f14760q == 1) {
                        }
                        i8 = f6.f14753j;
                        if (i8 != 1) {
                        }
                        if ("p".equals(this.f14207a)) {
                        }
                        map2 = map;
                        it2 = it;
                        i11 = -1;
                        i12 = 1;
                    }
                }
                map2 = map;
            }
            for (int i21 = 0; i21 < a(); i21++) {
                d(i21).i(j5, map, hashMap, str3, treeMap);
            }
        }
    }

    public final void j(long j5, boolean z3, String str, TreeMap treeMap) {
        TreeMap treeMap2;
        boolean z5;
        long j6;
        HashMap hashMap = this.f14215k;
        hashMap.clear();
        HashMap hashMap2 = this.f14216l;
        hashMap2.clear();
        String str2 = this.f14207a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f14213h;
        String str4 = !"".equals(str3) ? str3 : str;
        if (this.f14209c && z3) {
            SpannableStringBuilder f = f(str4, treeMap);
            String str5 = this.f14208b;
            str5.getClass();
            f.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z3) {
            f(str4, treeMap).append('\n');
            return;
        }
        if (e(j5)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C0895dg) entry.getValue()).f13128a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i = 0; i < a(); i++) {
                C1185k2 d5 = d(i);
                if (z3 || equals) {
                    treeMap2 = treeMap;
                    z5 = true;
                    j6 = j5;
                } else {
                    j6 = j5;
                    treeMap2 = treeMap;
                    z5 = false;
                }
                d5.j(j6, z5, str4, treeMap2);
            }
            if (equals) {
                SpannableStringBuilder f5 = f(str4, treeMap);
                int length = f5.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (f5.charAt(length) == ' ');
                if (length >= 0 && f5.charAt(length) != '\n') {
                    f5.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C0895dg) entry2.getValue()).f13128a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
