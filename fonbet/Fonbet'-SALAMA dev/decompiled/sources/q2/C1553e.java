package q2;

import B4.V;
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
import android.util.Log;
import android.util.Pair;
import j2.C1304a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import v2.t;
import w1.C1722m0;

/* renamed from: q2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1553e {

    /* renamed from: a, reason: collision with root package name */
    public final String f15809a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15810b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15811c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15812d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15813e;

    /* renamed from: f, reason: collision with root package name */
    public final h f15814f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f15815g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15816h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15817i;
    public final C1553e j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f15818k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f15819l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f15820m;

    public C1553e(String str, String str2, long j, long j3, h hVar, String[] strArr, String str3, String str4, C1553e c1553e) {
        this.f15809a = str;
        this.f15810b = str2;
        this.f15817i = str4;
        this.f15814f = hVar;
        this.f15815g = strArr;
        this.f15811c = str2 != null;
        this.f15812d = j;
        this.f15813e = j3;
        str3.getClass();
        this.f15816h = str3;
        this.j = c1553e;
        this.f15818k = new HashMap();
        this.f15819l = new HashMap();
    }

    public static C1553e a(String str) {
        return new C1553e(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C1304a c1304a = new C1304a();
            c1304a.f14551a = new SpannableStringBuilder();
            treeMap.put(str, c1304a);
        }
        CharSequence charSequence = ((C1304a) treeMap.get(str)).f14551a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final C1553e b(int i7) {
        ArrayList arrayList = this.f15820m;
        if (arrayList != null) {
            return (C1553e) arrayList.get(i7);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f15820m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z4) {
        String str = this.f15809a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z4 || equals || (equals2 && this.f15817i != null)) {
            long j = this.f15812d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j3 = this.f15813e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.f15820m == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f15820m.size(); i7++) {
            ((C1553e) this.f15820m.get(i7)).d(treeSet, z4 || equals);
        }
    }

    public final boolean f(long j) {
        long j3 = this.f15812d;
        long j7 = this.f15813e;
        return (j3 == -9223372036854775807L && j7 == -9223372036854775807L) || (j3 <= j && j7 == -9223372036854775807L) || ((j3 == -9223372036854775807L && j < j7) || (j3 <= j && j < j7));
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f15816h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.f15809a) && (str2 = this.f15817i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i7 = 0; i7 < c(); i7++) {
            b(i7).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        int i7;
        int i8;
        C1553e c1553e;
        boolean z4;
        int i9;
        int i10;
        int i11 = -1;
        int i12 = 1;
        if (f(j)) {
            String str2 = this.f15816h;
            String str3 = "".equals(str2) ? str : str2;
            for (Map.Entry entry : this.f15819l.entrySet()) {
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.f15818k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    C1304a c1304a = (C1304a) treeMap.get(str4);
                    c1304a.getClass();
                    f fVar = (f) hashMap.get(str3);
                    fVar.getClass();
                    h b7 = g.b(this.f15814f, this.f15815g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c1304a.f14551a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c1304a.f14551a = spannableStringBuilder;
                    }
                    if (b7 != null) {
                        int i13 = b7.f15837h;
                        if (((i13 == i11 && b7.f15838i == i11) ? i11 : (i13 == i12 ? i12 : 0) | (b7.f15838i == i12 ? 2 : 0)) != i11) {
                            int i14 = b7.f15837h;
                            if (i14 == i11) {
                                if (b7.f15838i == i11) {
                                    i10 = i11;
                                    i12 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i10);
                                    i8 = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i12 = 1;
                                }
                            }
                            i10 = (i14 == i12 ? i12 : 0) | (b7.f15838i == i12 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i10);
                            i8 = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i8 = 33;
                        }
                        if (b7.f15835f == i12) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i8);
                        }
                        if (b7.f15836g == i12) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i8);
                        }
                        if (b7.f15832c) {
                            if (!b7.f15832c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            Q0.a.b(spannableStringBuilder, new ForegroundColorSpan(b7.f15831b), intValue, intValue2);
                        }
                        if (b7.f15834e) {
                            if (!b7.f15834e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            Q0.a.b(spannableStringBuilder, new BackgroundColorSpan(b7.f15833d), intValue, intValue2);
                        }
                        if (b7.f15830a != null) {
                            Q0.a.b(spannableStringBuilder, new TypefaceSpan(b7.f15830a), intValue, intValue2);
                        }
                        C1550b c1550b = b7.f15846r;
                        if (c1550b != null) {
                            if (c1550b.f15795a == i11 && fVar.j != 2) {
                            }
                            Q0.a.b(spannableStringBuilder, new M4.e(), intValue, intValue2);
                        }
                        int i15 = b7.f15841m;
                        if (i15 == 2) {
                            C1553e c1553e2 = this.j;
                            while (true) {
                                if (c1553e2 == null) {
                                    c1553e2 = null;
                                    break;
                                }
                                h b8 = g.b(c1553e2.f15814f, c1553e2.f15815g, map);
                                if (b8 != null && b8.f15841m == 1) {
                                    break;
                                } else {
                                    c1553e2 = c1553e2.j;
                                }
                            }
                            if (c1553e2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c1553e2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c1553e = null;
                                        break;
                                    }
                                    C1553e c1553e3 = (C1553e) arrayDeque.pop();
                                    h b9 = g.b(c1553e3.f15814f, c1553e3.f15815g, map);
                                    if (b9 != null && b9.f15841m == 3) {
                                        c1553e = c1553e3;
                                        break;
                                    }
                                    for (int c3 = c1553e3.c() - 1; c3 >= 0; c3--) {
                                        arrayDeque.push(c1553e3.b(c3));
                                    }
                                }
                                if (c1553e == null) {
                                    z4 = false;
                                    i7 = -1;
                                } else {
                                    if (c1553e.c() == 1) {
                                        z4 = false;
                                        if (c1553e.b(0).f15810b != null) {
                                            String str5 = c1553e.b(0).f15810b;
                                            int i16 = t.f17153a;
                                            h b10 = g.b(c1553e.f15814f, c1553e.f15815g, map);
                                            i7 = -1;
                                            if ((b10 != null ? b10.f15842n : -1) == -1) {
                                                g.b(c1553e2.f15814f, c1553e2.f15815g, map);
                                            }
                                            spannableStringBuilder.setSpan(new V(20), intValue, intValue2, 33);
                                        }
                                    } else {
                                        z4 = false;
                                    }
                                    i7 = -1;
                                    Log.i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                                if (b7.f15845q != 1 ? true : z4) {
                                    Q0.a.b(spannableStringBuilder, new C1722m0(19), intValue, intValue2);
                                }
                                i9 = b7.j;
                                if (i9 != 1) {
                                    Q0.a.b(spannableStringBuilder, new AbsoluteSizeSpan((int) b7.f15839k, true), intValue, intValue2);
                                } else if (i9 == 2) {
                                    Q0.a.b(spannableStringBuilder, new RelativeSizeSpan(b7.f15839k), intValue, intValue2);
                                } else if (i9 == 3) {
                                    Q0.a.b(spannableStringBuilder, new RelativeSizeSpan(b7.f15839k / 100.0f), intValue, intValue2);
                                }
                                if (!"p".equals(this.f15809a)) {
                                    float f7 = b7.f15847s;
                                    if (f7 != Float.MAX_VALUE) {
                                        c1304a.f14566q = (f7 * (-90.0f)) / 100.0f;
                                    }
                                    Layout.Alignment alignment = b7.f15843o;
                                    if (alignment != null) {
                                        c1304a.f14553c = alignment;
                                    }
                                    Layout.Alignment alignment2 = b7.f15844p;
                                    if (alignment2 != null) {
                                        c1304a.f14554d = alignment2;
                                    }
                                }
                                i11 = i7;
                                i12 = 1;
                            }
                        } else if (i15 == 3 || i15 == 4) {
                            spannableStringBuilder.setSpan(new C1549a(), intValue, intValue2, 33);
                        }
                        i7 = i11;
                        z4 = false;
                        if (b7.f15845q != 1 ? true : z4) {
                        }
                        i9 = b7.j;
                        if (i9 != 1) {
                        }
                        if (!"p".equals(this.f15809a)) {
                        }
                        i11 = i7;
                        i12 = 1;
                    }
                }
                i7 = i11;
                i11 = i7;
                i12 = 1;
            }
            for (int i17 = 0; i17 < c(); i17++) {
                b(i17).h(j, map, hashMap, str3, treeMap);
            }
        }
    }

    public final void i(long j, boolean z4, String str, TreeMap treeMap) {
        HashMap hashMap = this.f15818k;
        hashMap.clear();
        HashMap hashMap2 = this.f15819l;
        hashMap2.clear();
        String str2 = this.f15809a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f15816h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f15811c && z4) {
            SpannableStringBuilder e7 = e(str4, treeMap);
            String str5 = this.f15810b;
            str5.getClass();
            e7.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z4) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C1304a) entry.getValue()).f14551a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i7 = 0; i7 < c(); i7++) {
                b(i7).i(j, z4 || equals, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e8 = e(str4, treeMap);
                int length = e8.length() - 1;
                while (length >= 0 && e8.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e8.charAt(length) != '\n') {
                    e8.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C1304a) entry2.getValue()).f14551a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
