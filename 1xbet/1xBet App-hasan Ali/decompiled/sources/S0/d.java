package S0;

import A0.J0;
import A0.S0;
import A0.V;
import K0.AbstractC0205j;
import K0.C0201f;
import K0.G;
import K0.InterfaceC0198c;
import K0.O;
import K0.v;
import K0.w;
import K0.y;
import K0.z;
import O0.o;
import O0.q;
import P.d1;
import V0.p;
import V0.s;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import i0.F;
import i0.H;
import i0.I;
import i0.M;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import k0.AbstractC2024d;
import k4.AbstractC2036a;
import o4.AbstractC2227e;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: k, reason: collision with root package name */
    public final String f5254k;

    /* renamed from: l, reason: collision with root package name */
    public final O f5255l;

    /* renamed from: m, reason: collision with root package name */
    public final List f5256m;

    /* renamed from: n, reason: collision with root package name */
    public final List f5257n;

    /* renamed from: o, reason: collision with root package name */
    public final O0.d f5258o;

    /* renamed from: p, reason: collision with root package name */
    public final W0.c f5259p;

    /* renamed from: q, reason: collision with root package name */
    public final f f5260q;

    /* renamed from: r, reason: collision with root package name */
    public final CharSequence f5261r;

    /* renamed from: s, reason: collision with root package name */
    public final L0.e f5262s;

    /* renamed from: t, reason: collision with root package name */
    public v3.e f5263t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f5264u;

    /* renamed from: v, reason: collision with root package name */
    public final int f5265v;

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0395, code lost:
    
        if ((r4.f2806b.f2873c & 1095216660480L) == 0) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x047d, code lost:
    
        if (W0.o.a(r12, k4.AbstractC2036a.H(0)) == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0095, code lost:
    
        if (r11 == 1) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0852 A[LOOP:6: B:279:0x0850->B:280:0x0852, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0309  */
    /* JADX WARN: Type inference failed for: r3v54, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(String str, O o5, List list, List list2, O0.d dVar, W0.c cVar) {
        Locale locale;
        int i;
        int i5;
        int size;
        int i6;
        Object obj;
        boolean a5;
        O0.l lVar;
        O0.j jVar;
        o oVar;
        q b3;
        Typeface typeface;
        R0.b bVar;
        String str2;
        p pVar;
        long j5;
        G g5;
        ?? r32;
        List list3;
        String str3;
        float textSize;
        O o6;
        List list4;
        W0.c cVar2;
        boolean z3;
        CharSequence charSequence;
        float f;
        boolean z5;
        w wVar;
        long j6;
        float G5;
        int length;
        V0.q qVar;
        W0.c cVar3;
        ArrayList arrayList;
        int size2;
        int i7;
        G g6;
        ArrayList arrayList2;
        int i8;
        int size3;
        int i9;
        boolean z6;
        V0.q qVar2;
        int size4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z7;
        int i16;
        int i17;
        int i18;
        int i19;
        y yVar;
        CharSequence charSequence2;
        this.f5254k = str;
        this.f5255l = o5;
        this.f5256m = list;
        this.f5257n = list2;
        this.f5258o = dVar;
        this.f5259p = cVar;
        float c5 = cVar.c();
        f fVar = new f(1);
        ((TextPaint) fVar).density = c5;
        fVar.f5269b = V0.l.f5944b;
        fVar.f5270c = 3;
        fVar.f5271d = I.f17244d;
        this.f5260q = fVar;
        z zVar = o5.f2807c;
        J0 j02 = j.f5279a;
        J0 j03 = j.f5279a;
        d1 d1Var = (d1) j03.f304k;
        if (d1Var == null) {
            if (v1.k.d()) {
                d1Var = j03.r();
                j03.f304k = d1Var;
            } else {
                d1Var = k.f5280a;
            }
        }
        this.f5264u = ((Boolean) d1Var.getValue()).booleanValue();
        w wVar2 = o5.f2806b;
        int i20 = wVar2.f2872b;
        G g7 = o5.f2805a;
        R0.b bVar2 = g7.f2772k;
        if (i20 != 4) {
            if (i20 != 5) {
                if (i20 == 1) {
                    i = 0;
                } else if (i20 == 2) {
                    i = 1;
                } else {
                    if (i20 != 3 && i20 != Integer.MIN_VALUE) {
                        throw new IllegalStateException("Invalid TextDirection.");
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((bVar2 == null || (locale = bVar2.c().f5120a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                this.f5265v = i;
                c cVar4 = new c(this);
                s sVar = wVar2.i;
                sVar = sVar == null ? s.f5957c : sVar;
                fVar.setFlags(sVar.f5960b ? fVar.getFlags() | 128 : fVar.getFlags() & (-129));
                i5 = sVar.f5959a;
                if (i5 == 1) {
                    fVar.setFlags(fVar.getFlags() | 64);
                    fVar.setHinting(0);
                } else if (i5 == 2) {
                    fVar.getFlags();
                    fVar.setHinting(1);
                } else if (i5 == 3) {
                    fVar.getFlags();
                    fVar.setHinting(0);
                } else {
                    fVar.getFlags();
                }
                size = list.size();
                i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i6);
                    if (((C0201f) obj).f2823a instanceof G) {
                        break;
                    } else {
                        i6++;
                    }
                }
                boolean z8 = obj != null;
                long b5 = W0.o.b(g7.f2765b);
                a5 = W0.p.a(b5, 4294967296L);
                long j7 = g7.f2765b;
                if (a5) {
                    fVar.setTextSize(cVar.V(j7));
                } else if (W0.p.a(b5, 8589934592L)) {
                    fVar.setTextSize(W0.o.c(j7) * fVar.getTextSize());
                }
                lVar = g7.f2766c;
                jVar = g7.f2767d;
                oVar = g7.f;
                if (oVar == null || jVar != null || lVar != null) {
                    lVar = lVar == null ? O0.l.f4027m : lVar;
                    int i21 = jVar != null ? jVar.f4024a : 0;
                    O0.k kVar = g7.f2768e;
                    int i22 = kVar != null ? kVar.f4025a : 65535;
                    d dVar2 = cVar4.f5253k;
                    b3 = ((O0.f) dVar2.f5258o).b(oVar, lVar, i21, i22);
                    if (b3 instanceof q) {
                        Object obj2 = b3.f4042k;
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.graphics.Typeface", obj2);
                        typeface = (Typeface) obj2;
                    } else {
                        v3.e eVar = new v3.e(b3, dVar2.f5263t);
                        dVar2.f5263t = eVar;
                        Object obj3 = eVar.f20434n;
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.graphics.Typeface", obj3);
                        typeface = (Typeface) obj3;
                    }
                    fVar.setTypeface(typeface);
                }
                bVar = g7.f2772k;
                if (bVar != null) {
                    R0.b bVar3 = R0.b.f5121m;
                    R0.c cVar5 = R0.d.f5124a;
                    if (!bVar.equals(cVar5.b())) {
                        int i23 = Build.VERSION.SDK_INT;
                        List list5 = bVar.f5122k;
                        if (i23 >= 24) {
                            ArrayList arrayList3 = new ArrayList(X3.o.S(bVar, 10));
                            Iterator it = list5.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((R0.a) it.next()).f5120a);
                            }
                            Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                            fVar.setTextLocales(V.d((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                        } else {
                            fVar.setTextLocale((list5.isEmpty() ? cVar5.b().c() : bVar.c()).f5120a);
                        }
                    }
                }
                str2 = g7.f2769g;
                if (str2 != null && !str2.equals("")) {
                    fVar.setFontFeatureSettings(str2);
                }
                pVar = g7.f2771j;
                if (pVar != null && !pVar.equals(p.f5950c)) {
                    fVar.setTextScaleX(fVar.getTextScaleX() * pVar.f5951a);
                    fVar.setTextSkewX(fVar.getTextSkewX() + pVar.f5952b);
                }
                V0.o oVar2 = g7.f2764a;
                fVar.d(oVar2.b());
                fVar.c(oVar2.d(), 9205357640488583168L, oVar2.a());
                fVar.f(g7.f2775n);
                fVar.g(g7.f2774m);
                fVar.e(g7.f2776o);
                j5 = g7.f2770h;
                if (!W0.p.a(W0.o.b(j5), 4294967296L) && W0.o.c(j5) != 0.0f) {
                    float textScaleX = fVar.getTextScaleX() * fVar.getTextSize();
                    float V4 = cVar.V(j5);
                    if (textScaleX != 0.0f) {
                        fVar.setLetterSpacing(V4 / textScaleX);
                    }
                } else if (W0.p.a(W0.o.b(j5), 8589934592L)) {
                    fVar.setLetterSpacing(W0.o.c(j5));
                }
                boolean z9 = (z8 || !W0.p.a(W0.o.b(j5), 4294967296L) || W0.o.c(j5) == 0.0f) ? false : true;
                long j8 = i0.p.f17293g;
                long j9 = g7.f2773l;
                boolean z10 = i0.p.c(j9, j8) && !i0.p.c(j9, i0.p.f);
                V0.a aVar = g7.i;
                boolean z11 = aVar == null && Float.compare(aVar.f5925a, 0.0f) != 0;
                g5 = (!z9 || z10 || z11) ? new G(0L, 0L, (O0.l) null, (O0.j) null, (O0.k) null, (o) null, (String) null, z9 ? j5 : W0.o.f6021c, z11 ? aVar : null, (p) null, (R0.b) null, z10 ? j9 : j8, (V0.l) null, (I) null, 63103) : null;
                if (g5 != null) {
                    int size5 = this.f5256m.size() + 1;
                    r32 = new ArrayList(size5);
                    int i24 = 0;
                    while (i24 < size5) {
                        r32.add(i24 == 0 ? new C0201f(0, this.f5254k.length(), g5) : (C0201f) this.f5256m.get(i24 - 1));
                        i24++;
                    }
                } else {
                    r32 = this.f5256m;
                }
                list3 = r32;
                str3 = this.f5254k;
                textSize = this.f5260q.getTextSize();
                o6 = this.f5255l;
                list4 = this.f5257n;
                cVar2 = this.f5259p;
                z3 = this.f5264u;
                a aVar2 = b.f5252a;
                if (z3 || !v1.k.d()) {
                    charSequence = str3;
                } else {
                    z zVar2 = o6.f2807c;
                    if (zVar2 != null) {
                        y yVar2 = zVar2.f2881a;
                    }
                    CharSequence g8 = v1.k.a().g(0, str3.length(), 0, str3);
                    kotlin.jvm.internal.l.c(g8);
                    charSequence = g8;
                }
                if (list3.isEmpty() || !list4.isEmpty()) {
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    charSequence2 = kotlin.jvm.internal.l.a(o6.f2806b.f2874d, V0.q.f5953c) ? charSequence : charSequence2;
                }
                SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                if (kotlin.jvm.internal.l.a(o6.f2805a.f2774m, V0.l.f5945c)) {
                    spannableString.setSpan(b.f5252a, 0, str3.length(), 33);
                }
                z zVar3 = o6.f2807c;
                z5 = (zVar3 != null || (yVar = zVar3.f2881a) == null) ? false : yVar.f2880a;
                wVar = o6.f2806b;
                if (z5 || wVar.f != null) {
                    j6 = 0;
                    V0.i iVar = wVar.f;
                    iVar = iVar == null ? V0.i.f5937c : iVar;
                    G5 = AbstractC2425d.G(wVar.f2873c, textSize, cVar2);
                    if (!Float.isNaN(G5)) {
                        if (spannableString.length() != 0) {
                            if (spannableString.length() == 0) {
                                throw new NoSuchElementException("Char sequence is empty.");
                            }
                            if (spannableString.charAt(AbstractC2227e.D0(spannableString)) != '\n') {
                                length = spannableString.length();
                                int i25 = length;
                                int i26 = iVar.f5939b;
                                spannableString.setSpan(new N0.h(G5, i25, (i26 & 1) <= 0, (i26 & 16) <= 0, iVar.f5938a, false), 0, spannableString.length(), 33);
                            }
                        }
                        length = spannableString.length() + 1;
                        int i252 = length;
                        int i262 = iVar.f5939b;
                        spannableString.setSpan(new N0.h(G5, i252, (i262 & 1) <= 0, (i262 & 16) <= 0, iVar.f5938a, false), 0, spannableString.length(), 33);
                    }
                } else {
                    j6 = 0;
                    float G6 = AbstractC2425d.G(wVar.f2873c, textSize, cVar2);
                    if (!Float.isNaN(G6)) {
                        spannableString.setSpan(new N0.g(G6), 0, spannableString.length(), 33);
                    }
                }
                qVar = wVar.f2874d;
                if (qVar != null) {
                    long H5 = AbstractC2036a.H(0);
                    long j10 = qVar.f5954a;
                    boolean a6 = W0.o.a(j10, H5);
                    long j11 = qVar.f5955b;
                    if (a6) {
                        cVar3 = cVar2;
                    } else {
                        cVar3 = cVar2;
                    }
                    if ((j10 & 1095216660480L) != j6 && (j11 & 1095216660480L) != j6) {
                        long b6 = W0.o.b(j10);
                        float V5 = W0.p.a(b6, 4294967296L) ? cVar3.V(j10) : W0.p.a(b6, 8589934592L) ? W0.o.c(j10) * textSize : f;
                        long b7 = W0.o.b(j11);
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(V5), (int) Math.ceil(W0.p.a(b7, 4294967296L) ? cVar3.V(j11) : W0.p.a(b7, 8589934592L) ? W0.o.c(j11) * textSize : f)), 0, spannableString.length(), 33);
                    }
                } else {
                    cVar3 = cVar2;
                }
                arrayList = new ArrayList(list3.size());
                size2 = list3.size();
                for (i7 = 0; i7 < size2; i7++) {
                    C0201f c0201f = (C0201f) list3.get(i7);
                    Object obj4 = c0201f.f2823a;
                    if (obj4 instanceof G) {
                        G g9 = (G) obj4;
                        if (g9.f != null || g9.f2767d != null || g9.f2766c != null || ((G) obj4).f2768e != null) {
                            arrayList.add(c0201f);
                        }
                    }
                }
                G g10 = o6.f2805a;
                o oVar3 = g10.f;
                G g11 = (oVar3 != null && g10.f2767d == null && g10.f2766c == null && g10.f2768e == null) ? null : new G(0L, 0L, g10.f2766c, g10.f2767d, g10.f2768e, oVar3, (String) null, 0L, (V0.a) null, (p) null, (R0.b) null, 0L, (V0.l) null, (I) null, 65475);
                T0.a aVar3 = new T0.a(0, spannableString, cVar4);
                if (arrayList.size() > 1) {
                    int size6 = arrayList.size();
                    int i27 = size6 * 2;
                    int[] iArr = new int[i27];
                    int size7 = arrayList.size();
                    for (int i28 = 0; i28 < size7; i28++) {
                        C0201f c0201f2 = (C0201f) arrayList.get(i28);
                        iArr[i28] = c0201f2.f2824b;
                        iArr[i28 + size6] = c0201f2.f2825c;
                    }
                    if (i27 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i27 == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    int i29 = iArr[0];
                    int i30 = 0;
                    while (i30 < i27) {
                        int i31 = iArr[i30];
                        if (i31 == i29) {
                            g6 = g11;
                            arrayList2 = arrayList;
                            i8 = 1;
                        } else {
                            int size8 = arrayList.size();
                            g6 = g11;
                            int i32 = 0;
                            while (i32 < size8) {
                                int i33 = size8;
                                C0201f c0201f3 = (C0201f) arrayList.get(i32);
                                int i34 = i32;
                                int i35 = c0201f3.f2824b;
                                ArrayList arrayList4 = arrayList;
                                int i36 = c0201f3.f2825c;
                                if (i35 != i36 && AbstractC0205j.b(i29, i31, i35, i36)) {
                                    G g12 = (G) c0201f3.f2823a;
                                    g11 = g11 != null ? g11.c(g12) : g12;
                                }
                                i32 = i34 + 1;
                                size8 = i33;
                                arrayList = arrayList4;
                            }
                            arrayList2 = arrayList;
                            i8 = 1;
                            if (g11 != null) {
                                aVar3.b(g11, Integer.valueOf(i29), Integer.valueOf(i31));
                            }
                            i29 = i31;
                        }
                        i30 += i8;
                        g11 = g6;
                        arrayList = arrayList2;
                    }
                } else if (!arrayList.isEmpty()) {
                    G g13 = (G) ((C0201f) arrayList.get(0)).f2823a;
                    aVar3.b(g11 != null ? g11.c(g13) : g13, Integer.valueOf(((C0201f) arrayList.get(0)).f2824b), Integer.valueOf(((C0201f) arrayList.get(0)).f2825c));
                }
                i9 = 0;
                z6 = false;
                for (size3 = list3.size(); i9 < size3; size3 = i14) {
                    C0201f c0201f4 = (C0201f) list3.get(i9);
                    if (!(c0201f4.f2823a instanceof G) || (i16 = c0201f4.f2824b) < 0 || i16 >= spannableString.length() || (i17 = c0201f4.f2825c) <= i16 || i17 > spannableString.length()) {
                        i14 = size3;
                        i15 = i9;
                        z7 = z6;
                    } else {
                        G g14 = (G) c0201f4.f2823a;
                        V0.a aVar4 = g14.i;
                        if (aVar4 != null) {
                            spannableString.setSpan(new N0.a(0, aVar4.f5925a), i16, i17, 33);
                        }
                        V0.o oVar4 = g14.f2764a;
                        AbstractC2425d.H(spannableString, oVar4.b(), i16, i17);
                        F d5 = oVar4.d();
                        float a7 = oVar4.a();
                        if (d5 != null) {
                            if (d5 instanceof M) {
                                AbstractC2425d.H(spannableString, ((M) d5).f17262e, i16, i17);
                            } else {
                                spannableString.setSpan(new U0.b((H) d5, a7), i16, i17, 33);
                            }
                        }
                        V0.l lVar2 = g14.f2774m;
                        if (lVar2 != null) {
                            int i37 = lVar2.f5947a;
                            spannableString.setSpan(new N0.k((i37 | 1) == i37, (i37 | 2) == i37), i16, i17, 33);
                        }
                        AbstractC2425d.I(spannableString, g14.f2765b, cVar3, i16, i17);
                        String str4 = g14.f2769g;
                        if (str4 != null) {
                            i18 = 33;
                            spannableString.setSpan(new N0.b(0, str4), i16, i17, 33);
                        } else {
                            i18 = 33;
                        }
                        p pVar2 = g14.f2771j;
                        if (pVar2 != null) {
                            spannableString.setSpan(new ScaleXSpan(pVar2.f5951a), i16, i17, i18);
                            spannableString.setSpan(new N0.a(1, pVar2.f5952b), i16, i17, i18);
                        }
                        AbstractC2425d.J(spannableString, g14.f2772k, i16, i17);
                        i14 = size3;
                        long j12 = g14.f2773l;
                        if (j12 != 16) {
                            spannableString.setSpan(new BackgroundColorSpan(F.u(j12)), i16, i17, 33);
                        }
                        I i38 = g14.f2775n;
                        if (i38 != null) {
                            int u5 = F.u(i38.f17245a);
                            long j13 = i38.f17246b;
                            i15 = i9;
                            z7 = z6;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L));
                            float f5 = i38.f17247c;
                            i19 = 33;
                            spannableString.setSpan(new N0.j(u5, intBitsToFloat, intBitsToFloat2, f5 == f ? Float.MIN_VALUE : f5), i16, i17, 33);
                        } else {
                            i15 = i9;
                            z7 = z6;
                            i19 = 33;
                        }
                        AbstractC2024d abstractC2024d = g14.f2776o;
                        if (abstractC2024d != null) {
                            spannableString.setSpan(new U0.a(abstractC2024d), i16, i17, i19);
                        }
                        long j14 = g14.f2770h;
                        if (W0.p.a(W0.o.b(j14), 4294967296L) || W0.p.a(W0.o.b(j14), 8589934592L)) {
                            z6 = true;
                            i9 = i15 + 1;
                        }
                    }
                    z6 = z7;
                    i9 = i15 + 1;
                }
                if (z6) {
                    int size9 = list3.size();
                    for (int i39 = 0; i39 < size9; i39 = i11 + 1) {
                        C0201f c0201f5 = (C0201f) list3.get(i39);
                        InterfaceC0198c interfaceC0198c = (InterfaceC0198c) c0201f5.f2823a;
                        if (!(interfaceC0198c instanceof G) || (i12 = c0201f5.f2824b) < 0 || i12 >= spannableString.length() || (i13 = c0201f5.f2825c) <= i12) {
                            i11 = i39;
                        } else if (i13 > spannableString.length()) {
                            i11 = i39;
                        } else {
                            long j15 = ((G) interfaceC0198c).f2770h;
                            long b8 = W0.o.b(j15);
                            i11 = i39;
                            Object fVar2 = W0.p.a(b8, 4294967296L) ? new N0.f(cVar3.V(j15)) : W0.p.a(b8, 8589934592L) ? new N0.e(W0.o.c(j15)) : null;
                            if (fVar2 != null) {
                                spannableString.setSpan(fVar2, i12, i13, 33);
                            }
                        }
                    }
                }
                qVar2 = wVar.f2874d;
                if (qVar2 != null) {
                    long j16 = qVar2.f5954a;
                    long b9 = W0.o.b(j16);
                    if (W0.p.a(b9, 4294967296L)) {
                        cVar3.V(j16);
                    } else if (W0.p.a(b9, 8589934592L)) {
                        W0.o.c(j16);
                    }
                }
                size4 = list3.size();
                for (i10 = 0; i10 < size4; i10++) {
                    Object obj5 = ((C0201f) list3.get(i10)).f2823a;
                }
                charSequence2 = spannableString;
                if (list4.size() > 0) {
                    C0201f c0201f6 = (C0201f) list4.get(0);
                    if (c0201f6.f2823a != null) {
                        throw new ClassCastException();
                    }
                    for (Object obj6 : spannableString.getSpans(c0201f6.f2824b, c0201f6.f2825c, v1.w.class)) {
                        spannableString.removeSpan((v1.w) obj6);
                    }
                    throw null;
                }
                this.f5261r = charSequence2;
                this.f5262s = new L0.e(charSequence2, this.f5260q, this.f5265v);
            }
            i = 3;
            this.f5265v = i;
            c cVar42 = new c(this);
            s sVar2 = wVar2.i;
            if (sVar2 == null) {
            }
            fVar.setFlags(sVar2.f5960b ? fVar.getFlags() | 128 : fVar.getFlags() & (-129));
            i5 = sVar2.f5959a;
            if (i5 == 1) {
            }
            size = list.size();
            i6 = 0;
            while (true) {
                if (i6 >= size) {
                }
                i6++;
            }
            if (obj != null) {
            }
            long b52 = W0.o.b(g7.f2765b);
            a5 = W0.p.a(b52, 4294967296L);
            long j72 = g7.f2765b;
            if (a5) {
            }
            lVar = g7.f2766c;
            jVar = g7.f2767d;
            oVar = g7.f;
            if (oVar == null) {
            }
            if (lVar == null) {
            }
            if (jVar != null) {
            }
            O0.k kVar2 = g7.f2768e;
            if (kVar2 != null) {
            }
            d dVar22 = cVar42.f5253k;
            b3 = ((O0.f) dVar22.f5258o).b(oVar, lVar, i21, i22);
            if (b3 instanceof q) {
            }
            fVar.setTypeface(typeface);
            bVar = g7.f2772k;
            if (bVar != null) {
            }
            str2 = g7.f2769g;
            if (str2 != null) {
                fVar.setFontFeatureSettings(str2);
            }
            pVar = g7.f2771j;
            if (pVar != null) {
                fVar.setTextScaleX(fVar.getTextScaleX() * pVar.f5951a);
                fVar.setTextSkewX(fVar.getTextSkewX() + pVar.f5952b);
            }
            V0.o oVar22 = g7.f2764a;
            fVar.d(oVar22.b());
            fVar.c(oVar22.d(), 9205357640488583168L, oVar22.a());
            fVar.f(g7.f2775n);
            fVar.g(g7.f2774m);
            fVar.e(g7.f2776o);
            j5 = g7.f2770h;
            if (!W0.p.a(W0.o.b(j5), 4294967296L)) {
            }
            if (W0.p.a(W0.o.b(j5), 8589934592L)) {
            }
            if (z8) {
            }
            long j82 = i0.p.f17293g;
            long j92 = g7.f2773l;
            if (i0.p.c(j92, j82)) {
            }
            V0.a aVar5 = g7.i;
            if (aVar5 == null) {
            }
            if (z9) {
            }
            if (g5 != null) {
            }
            list3 = r32;
            str3 = this.f5254k;
            textSize = this.f5260q.getTextSize();
            o6 = this.f5255l;
            list4 = this.f5257n;
            cVar2 = this.f5259p;
            z3 = this.f5264u;
            a aVar22 = b.f5252a;
            if (z3) {
            }
            charSequence = str3;
            if (list3.isEmpty()) {
            }
            f = 0.0f;
            if (charSequence instanceof Spannable) {
            }
            if (kotlin.jvm.internal.l.a(o6.f2805a.f2774m, V0.l.f5945c)) {
            }
            z zVar32 = o6.f2807c;
            if (zVar32 != null) {
            }
            wVar = o6.f2806b;
            if (z5) {
            }
            j6 = 0;
            V0.i iVar2 = wVar.f;
            if (iVar2 == null) {
            }
            G5 = AbstractC2425d.G(wVar.f2873c, textSize, cVar2);
            if (!Float.isNaN(G5)) {
            }
            qVar = wVar.f2874d;
            if (qVar != null) {
            }
            arrayList = new ArrayList(list3.size());
            size2 = list3.size();
            while (i7 < size2) {
            }
            G g102 = o6.f2805a;
            o oVar32 = g102.f;
            if (oVar32 != null) {
            }
            T0.a aVar32 = new T0.a(0, spannableString, cVar42);
            if (arrayList.size() > 1) {
            }
            i9 = 0;
            z6 = false;
            while (i9 < size3) {
            }
            if (z6) {
            }
            qVar2 = wVar.f2874d;
            if (qVar2 != null) {
            }
            size4 = list3.size();
            while (i10 < size4) {
            }
            charSequence2 = spannableString;
            if (list4.size() > 0) {
            }
            this.f5261r = charSequence2;
            this.f5262s = new L0.e(charSequence2, this.f5260q, this.f5265v);
        }
        i = 2;
        this.f5265v = i;
        c cVar422 = new c(this);
        s sVar22 = wVar2.i;
        if (sVar22 == null) {
        }
        fVar.setFlags(sVar22.f5960b ? fVar.getFlags() | 128 : fVar.getFlags() & (-129));
        i5 = sVar22.f5959a;
        if (i5 == 1) {
        }
        size = list.size();
        i6 = 0;
        while (true) {
            if (i6 >= size) {
            }
            i6++;
        }
        if (obj != null) {
        }
        long b522 = W0.o.b(g7.f2765b);
        a5 = W0.p.a(b522, 4294967296L);
        long j722 = g7.f2765b;
        if (a5) {
        }
        lVar = g7.f2766c;
        jVar = g7.f2767d;
        oVar = g7.f;
        if (oVar == null) {
        }
        if (lVar == null) {
        }
        if (jVar != null) {
        }
        O0.k kVar22 = g7.f2768e;
        if (kVar22 != null) {
        }
        d dVar222 = cVar422.f5253k;
        b3 = ((O0.f) dVar222.f5258o).b(oVar, lVar, i21, i22);
        if (b3 instanceof q) {
        }
        fVar.setTypeface(typeface);
        bVar = g7.f2772k;
        if (bVar != null) {
        }
        str2 = g7.f2769g;
        if (str2 != null) {
        }
        pVar = g7.f2771j;
        if (pVar != null) {
        }
        V0.o oVar222 = g7.f2764a;
        fVar.d(oVar222.b());
        fVar.c(oVar222.d(), 9205357640488583168L, oVar222.a());
        fVar.f(g7.f2775n);
        fVar.g(g7.f2774m);
        fVar.e(g7.f2776o);
        j5 = g7.f2770h;
        if (!W0.p.a(W0.o.b(j5), 4294967296L)) {
        }
        if (W0.p.a(W0.o.b(j5), 8589934592L)) {
        }
        if (z8) {
        }
        long j822 = i0.p.f17293g;
        long j922 = g7.f2773l;
        if (i0.p.c(j922, j822)) {
        }
        V0.a aVar52 = g7.i;
        if (aVar52 == null) {
        }
        if (z9) {
        }
        if (g5 != null) {
        }
        list3 = r32;
        str3 = this.f5254k;
        textSize = this.f5260q.getTextSize();
        o6 = this.f5255l;
        list4 = this.f5257n;
        cVar2 = this.f5259p;
        z3 = this.f5264u;
        a aVar222 = b.f5252a;
        if (z3) {
        }
        charSequence = str3;
        if (list3.isEmpty()) {
        }
        f = 0.0f;
        if (charSequence instanceof Spannable) {
        }
        if (kotlin.jvm.internal.l.a(o6.f2805a.f2774m, V0.l.f5945c)) {
        }
        z zVar322 = o6.f2807c;
        if (zVar322 != null) {
        }
        wVar = o6.f2806b;
        if (z5) {
        }
        j6 = 0;
        V0.i iVar22 = wVar.f;
        if (iVar22 == null) {
        }
        G5 = AbstractC2425d.G(wVar.f2873c, textSize, cVar2);
        if (!Float.isNaN(G5)) {
        }
        qVar = wVar.f2874d;
        if (qVar != null) {
        }
        arrayList = new ArrayList(list3.size());
        size2 = list3.size();
        while (i7 < size2) {
        }
        G g1022 = o6.f2805a;
        o oVar322 = g1022.f;
        if (oVar322 != null) {
        }
        T0.a aVar322 = new T0.a(0, spannableString, cVar422);
        if (arrayList.size() > 1) {
        }
        i9 = 0;
        z6 = false;
        while (i9 < size3) {
        }
        if (z6) {
        }
        qVar2 = wVar.f2874d;
        if (qVar2 != null) {
        }
        size4 = list3.size();
        while (i10 < size4) {
        }
        charSequence2 = spannableString;
        if (list4.size() > 0) {
        }
        this.f5261r = charSequence2;
        this.f5262s = new L0.e(charSequence2, this.f5260q, this.f5265v);
    }

    @Override // K0.v
    public final float b() {
        float f;
        L0.e eVar = this.f5262s;
        if (!Float.isNaN(eVar.f3008e)) {
            return eVar.f3008e;
        }
        TextPaint textPaint = eVar.f3005b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = eVar.f3004a;
        lineInstance.setText(new L0.b(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new S0(2));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new W3.h(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                W3.h hVar = (W3.h) priorityQueue.peek();
                if (hVar != null && ((Number) hVar.f6037l).intValue() - ((Number) hVar.f6036k).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new W3.h(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            W3.h hVar2 = (W3.h) it.next();
            float desiredWidth = Layout.getDesiredWidth(eVar.b(), ((Number) hVar2.f6036k).intValue(), ((Number) hVar2.f6037l).intValue(), textPaint);
            while (it.hasNext()) {
                W3.h hVar3 = (W3.h) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(eVar.b(), ((Number) hVar3.f6036k).intValue(), ((Number) hVar3.f6037l).intValue(), textPaint));
            }
            f = desiredWidth;
        }
        eVar.f3008e = f;
        return f;
    }

    @Override // K0.v
    public final boolean c() {
        v3.e eVar = this.f5263t;
        if (eVar != null ? eVar.F() : false) {
            return true;
        }
        if (!this.f5264u) {
            z zVar = this.f5255l.f2807c;
            J0 j02 = j.f5279a;
            J0 j03 = j.f5279a;
            d1 d1Var = (d1) j03.f304k;
            if (d1Var == null) {
                if (v1.k.d()) {
                    d1Var = j03.r();
                    j03.f304k = d1Var;
                } else {
                    d1Var = k.f5280a;
                }
            }
            if (((Boolean) d1Var.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // K0.v
    public final float e() {
        return this.f5262s.c();
    }
}
