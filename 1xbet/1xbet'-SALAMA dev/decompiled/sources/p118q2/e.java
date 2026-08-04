package p118q2;

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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p068j2.a;
import p151v2.t;
import p155w1.C1013m0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f15820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f15821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f15822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15823i;
    public final e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f15824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f15825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f15826m;

    public e(String str, String str2, long j, long j3, h hVar, String[] strArr, String str3, String str4, e eVar) {
        this.f15815a = str;
        this.f15816b = str2;
        this.f15823i = str4;
        this.f15820f = hVar;
        this.f15821g = strArr;
        this.f15817c = str2 != null;
        this.f15818d = j;
        this.f15819e = j3;
        str3.getClass();
        this.f15822h = str3;
        this.j = eVar;
        this.f15824k = new HashMap();
        this.f15825l = new HashMap();
    }

    public static e a(String str) {
        return new e(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            a aVar = new a();
            aVar.f14557a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((a) treeMap.get(str)).f14557a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final e b(int i7) {
        ArrayList arrayList = this.f15826m;
        if (arrayList != null) {
            return (e) arrayList.get(i7);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f15826m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z4) {
        String str = this.f15815a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z4 || zEquals || (zEquals2 && this.f15823i != null)) {
            long j = this.f15818d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j3 = this.f15819e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.f15826m == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f15826m.size(); i7++) {
            ((e) this.f15826m.get(i7)).d(treeSet, z4 || zEquals);
        }
    }

    public final boolean f(long j) {
        long j3 = this.f15818d;
        long j7 = this.f15819e;
        return (j3 == -9223372036854775807L && j7 == -9223372036854775807L) || (j3 <= j && j7 == -9223372036854775807L) || ((j3 == -9223372036854775807L && j < j7) || (j3 <= j && j < j7));
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f15822h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.f15815a) && (str2 = this.f15823i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i7 = 0; i7 < c(); i7++) {
            b(i7).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:134:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:136:0x0200  */
    /* JADX WARN: Code duplicated, block: B:139:0x0211  */
    /* JADX WARN: Code duplicated, block: B:141:0x0214  */
    /* JADX WARN: Code duplicated, block: B:144:0x0218  */
    /* JADX WARN: Code duplicated, block: B:145:0x0224  */
    /* JADX WARN: Code duplicated, block: B:146:0x022f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0245  */
    /* JADX WARN: Code duplicated, block: B:151:0x024e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0258  */
    /* JADX WARN: Code duplicated, block: B:157:0x025e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    public final void h(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        int i7;
        int i8;
        e eVar;
        boolean z4;
        boolean z7;
        int i9;
        float f7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i10;
        int i11;
        int i12;
        int i13 = -1;
        int i14 = 1;
        if (f(j)) {
            String str2 = this.f15822h;
            String str3 = "".equals(str2) ? str : str2;
            for (Map.Entry entry : this.f15825l.entrySet()) {
                String str4 = (String) entry.getKey();
                HashMap map3 = this.f15824k;
                int iIntValue = map3.containsKey(str4) ? ((Integer) map3.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    a aVar = (a) treeMap.get(str4);
                    aVar.getClass();
                    f fVar = (f) map2.get(str3);
                    fVar.getClass();
                    h hVarB = g.b(this.f15820f, this.f15821g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.f14557a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.f14557a = spannableStringBuilder;
                    }
                    if (hVarB != null) {
                        int i15 = hVarB.f15843h;
                        if (((i15 == i13 && hVarB.f15844i == i13) ? i13 : (i15 == i14 ? i14 : 0) | (hVarB.f15844i == i14 ? 2 : 0)) != i13) {
                            int i16 = hVarB.f15843h;
                            if (i16 != i13) {
                                if (i16 == i14) {
                                    i10 = i14;
                                } else {
                                    i10 = 0;
                                }
                                if (hVarB.f15844i == i14) {
                                    i11 = 2;
                                } else {
                                    i11 = 0;
                                }
                                i12 = i10 | i11;
                            } else if (hVarB.f15844i == i13) {
                                i12 = i13;
                                i14 = 1;
                            } else {
                                i14 = 1;
                                if (i16 == i14) {
                                    i10 = i14;
                                } else {
                                    i10 = 0;
                                }
                                if (hVarB.f15844i == i14) {
                                    i11 = 2;
                                } else {
                                    i11 = 0;
                                }
                                i12 = i10 | i11;
                            }
                            StyleSpan styleSpan = new StyleSpan(i12);
                            i8 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i8 = 33;
                        }
                        if (hVarB.f15841f == i14) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i8);
                        }
                        if (hVarB.f15842g == i14) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i8);
                        }
                        if (hVarB.f15838c) {
                            if (!hVarB.f15838c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            Q0.a.b(spannableStringBuilder, new ForegroundColorSpan(hVarB.f15837b), iIntValue, iIntValue2);
                        }
                        if (hVarB.f15840e) {
                            if (!hVarB.f15840e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            Q0.a.b(spannableStringBuilder, new BackgroundColorSpan(hVarB.f15839d), iIntValue, iIntValue2);
                        }
                        if (hVarB.f15836a != null) {
                            Q0.a.b(spannableStringBuilder, new TypefaceSpan(hVarB.f15836a), iIntValue, iIntValue2);
                        }
                        b bVar = hVarB.f15852r;
                        if (bVar != null) {
                            if (bVar.f15801a == i13 && fVar.j != 2) {
                            }
                            Q0.a.b(spannableStringBuilder, new M4.e(), iIntValue, iIntValue2);
                        }
                        int i17 = hVarB.f15847m;
                        if (i17 == 2) {
                            e eVar2 = this.j;
                            while (true) {
                                if (eVar2 == null) {
                                    eVar2 = null;
                                    break;
                                }
                                h hVarB2 = g.b(eVar2.f15820f, eVar2.f15821g, map);
                                if (hVarB2 != null && hVarB2.f15847m == 1) {
                                    break;
                                } else {
                                    eVar2 = eVar2.j;
                                }
                            }
                            if (eVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(eVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        eVar = null;
                                        break;
                                    }
                                    e eVar3 = (e) arrayDeque.pop();
                                    h hVarB3 = g.b(eVar3.f15820f, eVar3.f15821g, map);
                                    if (hVarB3 != null && hVarB3.f15847m == 3) {
                                        eVar = eVar3;
                                        break;
                                    }
                                    for (int iC = eVar3.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(eVar3.b(iC));
                                    }
                                }
                                if (eVar == null) {
                                    z4 = false;
                                    i7 = -1;
                                } else {
                                    if (eVar.c() == 1) {
                                        z4 = false;
                                        if (eVar.b(0).f15816b != null) {
                                            String str5 = eVar.b(0).f15816b;
                                            int i18 = t.f17159a;
                                            h hVarB4 = g.b(eVar.f15820f, eVar.f15821g, map);
                                            i7 = -1;
                                            if ((hVarB4 != null ? hVarB4.f15848n : -1) == -1) {
                                                g.b(eVar2.f15820f, eVar2.f15821g, map);
                                            }
                                            spannableStringBuilder.setSpan(new V(20), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        z4 = false;
                                    }
                                    i7 = -1;
                                    Log.i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (hVarB.f15851q == 1) {
                                z7 = true;
                            } else {
                                z7 = z4;
                            }
                            if (z7) {
                                Q0.a.b(spannableStringBuilder, new C1013m0(19), iIntValue, iIntValue2);
                            }
                            i9 = hVarB.j;
                            if (i9 != 1) {
                                Q0.a.b(spannableStringBuilder, new AbsoluteSizeSpan((int) hVarB.f15845k, true), iIntValue, iIntValue2);
                            } else if (i9 != 2) {
                                Q0.a.b(spannableStringBuilder, new RelativeSizeSpan(hVarB.f15845k), iIntValue, iIntValue2);
                            } else if (i9 == 3) {
                                Q0.a.b(spannableStringBuilder, new RelativeSizeSpan(hVarB.f15845k / 100.0f), iIntValue, iIntValue2);
                            }
                            if ("p".equals(this.f15815a)) {
                                f7 = hVarB.f15853s;
                                if (f7 != Float.MAX_VALUE) {
                                    aVar.f14572q = (f7 * (-90.0f)) / 100.0f;
                                }
                                alignment = hVarB.f15849o;
                                if (alignment != null) {
                                    aVar.f14559c = alignment;
                                }
                                alignment2 = hVarB.f15850p;
                                if (alignment2 != null) {
                                    aVar.f14560d = alignment2;
                                }
                            }
                        } else if (i17 == 3 || i17 == 4) {
                            spannableStringBuilder.setSpan(new a(), iIntValue, iIntValue2, 33);
                        }
                        i7 = i13;
                        z4 = false;
                        if (hVarB.f15851q == 1) {
                            z7 = true;
                        } else {
                            z7 = z4;
                        }
                        if (z7) {
                            Q0.a.b(spannableStringBuilder, new C1013m0(19), iIntValue, iIntValue2);
                        }
                        i9 = hVarB.j;
                        if (i9 != 1) {
                            Q0.a.b(spannableStringBuilder, new AbsoluteSizeSpan((int) hVarB.f15845k, true), iIntValue, iIntValue2);
                        } else if (i9 != 2) {
                            Q0.a.b(spannableStringBuilder, new RelativeSizeSpan(hVarB.f15845k), iIntValue, iIntValue2);
                        } else if (i9 == 3) {
                            Q0.a.b(spannableStringBuilder, new RelativeSizeSpan(hVarB.f15845k / 100.0f), iIntValue, iIntValue2);
                        }
                        if ("p".equals(this.f15815a)) {
                            f7 = hVarB.f15853s;
                            if (f7 != Float.MAX_VALUE) {
                                aVar.f14572q = (f7 * (-90.0f)) / 100.0f;
                            }
                            alignment = hVarB.f15849o;
                            if (alignment != null) {
                                aVar.f14559c = alignment;
                            }
                            alignment2 = hVarB.f15850p;
                            if (alignment2 != null) {
                                aVar.f14560d = alignment2;
                            }
                        }
                    }
                    i13 = i7;
                    i14 = 1;
                }
                i7 = i13;
                i13 = i7;
                i14 = 1;
            }
            for (int i19 = 0; i19 < c(); i19++) {
                b(i19).h(j, map, map2, str3, treeMap);
            }
        }
    }

    public final void i(long j, boolean z4, String str, TreeMap treeMap) {
        HashMap map = this.f15824k;
        map.clear();
        HashMap map2 = this.f15825l;
        map2.clear();
        String str2 = this.f15815a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f15822h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f15817c && z4) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f15816b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z4) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((a) entry.getValue()).f14557a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i7 = 0; i7 < c(); i7++) {
                b(i7).i(j, z4 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((a) entry2.getValue()).f14557a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
