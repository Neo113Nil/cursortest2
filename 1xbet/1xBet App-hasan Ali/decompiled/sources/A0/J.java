package A0;

import K0.AbstractC0205j;
import K0.AbstractC0210o;
import K0.C0201f;
import K0.C0203h;
import K0.C0209n;
import a.AbstractC0444a;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.EnumC0487p;
import g0.C1965j;
import game.betting133.sports1xbet.R;
import h0.C1989c;
import i4.InterfaceC2015a;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import k0.C2023c;
import k4.AbstractC2036a;
import l4.C2059a;
import n.AbstractC2107A;
import n.C2138i;
import n1.AbstractC2176q;
import o1.C2216c;
import o1.C2218e;
import r.C2315A;
import r.C2321G;
import r.C2341t;
import r.C2342u;
import s.AbstractC2351a;
import t3.AbstractC2425d;
import w0.AbstractC2540a;
import x0.InterfaceC2637x;
import z0.C2731G;

/* loaded from: classes.dex */
public final class J extends C2023c {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f303m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(N n5) {
        super(7);
        this.f303m = n5;
    }

    @Override // k0.C2023c
    public final void k(int i, C2218e c2218e, String str, Bundle bundle) {
        this.f303m.e(i, c2218e, str, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 34 ? n1.AbstractC2176q.h(r12) : true) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0842, code lost:
    
        if (r4 == false) goto L419;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0821 A[LOOP:9: B:382:0x0804->B:391:0x0821, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0828 A[EDGE_INSN: B:392:0x0828->B:393:0x0828 BREAK  A[LOOP:9: B:382:0x0804->B:391:0x0821], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x09e9  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0bfb  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0c0c  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0c55  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0bff  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0ab9  */
    /* JADX WARN: Type inference failed for: r7v173 */
    /* JADX WARN: Type inference failed for: r7v174, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v175 */
    /* JADX WARN: Type inference failed for: r7v176, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v177, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v178, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v89, types: [java.util.ArrayList] */
    @Override // k0.C2023c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2218e s(int i) {
        C2218e c2218e;
        boolean z3;
        C2341t c2341t;
        C2341t c2341t2;
        F f;
        Resources resources;
        H0.n nVar;
        H0.g gVar;
        SpannableString spannableString;
        H0.g gVar2;
        boolean z5;
        H0.a aVar;
        H0.a aVar2;
        H0.a aVar3;
        boolean z6;
        H0.f fVar;
        int i5;
        H0.h hVar;
        H0.h hVar2;
        int d5;
        F f5;
        int d6;
        String str;
        Z0.j C5;
        Object g5;
        boolean z7;
        Object g6;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        X3.v vVar;
        X3.v vVar2;
        ?? r7;
        v3.e eVar;
        ?? r72;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z14;
        H0.n nVar2;
        androidx.lifecycle.L g7;
        N n5 = this.f303m;
        F f6 = n5.f346d;
        C0053q viewTreeOwners = f6.getViewTreeOwners();
        EnumC0487p h3 = (viewTreeOwners == null || (g7 = viewTreeOwners.f549a.g()) == null) ? null : g7.h();
        EnumC0487p enumC0487p = EnumC0487p.f7058k;
        AccessibilityManager accessibilityManager = n5.f348g;
        if (h3 == enumC0487p) {
            if (!accessibilityManager.isEnabled()) {
                c2218e = new C2218e(AccessibilityNodeInfo.obtain());
            }
            c2218e = null;
        } else {
            H0.o oVar = (H0.o) n5.o().b(i);
            if (oVar == null) {
                if (!accessibilityManager.isEnabled()) {
                    c2218e = new C2218e(AccessibilityNodeInfo.obtain());
                }
                c2218e = null;
            } else {
                H0.n nVar3 = oVar.f2117a;
                Object g8 = nVar3.k().f2103k.g(H0.s.f2168n);
                if (g8 == null) {
                    g8 = null;
                }
                boolean a5 = kotlin.jvm.internal.l.a(g8, Boolean.TRUE);
                if (a5) {
                }
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
                c2218e = new C2218e(obtain);
                AccessibilityNodeInfo accessibilityNodeInfo = c2218e.f18616a;
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 34) {
                    AbstractC2176q.j(obtain, a5);
                    z3 = true;
                } else {
                    z3 = true;
                    c2218e.f(64, a5);
                }
                if (i == -1) {
                    Object parentForAccessibility = f6.getParentForAccessibility();
                    View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                    c2218e.f18617b = -1;
                    obtain.setParent(view);
                } else {
                    H0.n l5 = nVar3.l();
                    Integer valueOf = l5 != null ? Integer.valueOf(l5.f2116g) : null;
                    if (valueOf == null) {
                        AbstractC2540a.c("semanticsNode " + i + " has null parent");
                        throw new D2.e();
                    }
                    int intValue = valueOf.intValue();
                    if (intValue == f6.getSemanticsOwner().a().f2116g) {
                        intValue = -1;
                    }
                    c2218e.f18617b = intValue;
                    obtain.setParent(f6, intValue);
                }
                c2218e.f18618c = i;
                obtain.setSource(f6, i);
                obtain.setBoundsInScreen(n5.f(oVar));
                Resources resources2 = f6.getContext().getResources();
                c2218e.g("android.view.View");
                H0.v vVar3 = H0.s.f2148E;
                H0.j jVar = nVar3.f2114d;
                C2321G c2321g = jVar.f2103k;
                if (c2321g.c(vVar3)) {
                    c2218e.g("android.widget.EditText");
                }
                if (c2321g.c(H0.s.f2144A)) {
                    c2218e.g("android.widget.TextView");
                }
                Object g9 = c2321g.g(H0.s.f2178x);
                if (g9 == null) {
                    g9 = null;
                }
                H0.g gVar3 = (H0.g) g9;
                if (gVar3 != null && (nVar3.f2115e || H0.n.j(4, nVar3).isEmpty())) {
                    int i14 = gVar3.f2074a;
                    if (i14 == 4) {
                        obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.tab));
                    } else if (i14 == 2) {
                        obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources2.getString(R.string.switch_role));
                    } else {
                        String E5 = Z.E(i14);
                        if (i14 != 5 || nVar3.o() || jVar.f2105m) {
                            c2218e.g(E5);
                        }
                    }
                }
                obtain.setPackageName(f6.getContext().getPackageName());
                boolean f7 = H0.q.f(nVar3);
                if (i13 >= 24) {
                    obtain.setImportantForAccessibility(f7);
                }
                boolean h4 = i13 >= 34 ? AbstractC2176q.h(accessibilityManager) : z3;
                List j5 = H0.n.j(4, nVar3);
                int size = j5.size();
                boolean z15 = h4;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    c2341t = n5.f342M;
                    if (i15 >= size) {
                        break;
                    }
                    int i17 = size;
                    H0.n nVar4 = (H0.n) j5.get(i15);
                    int i18 = i15;
                    List list = j5;
                    if (n5.o().a(nVar4.f2116g)) {
                        Z0.j jVar2 = f6.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(nVar4.f2113c);
                        int i19 = nVar4.f2116g;
                        if (i19 != -1) {
                            if (jVar2 != null) {
                                obtain.addChild(jVar2);
                            } else {
                                H0.o oVar2 = (H0.o) n5.o().b(i19);
                                if (oVar2 == null || (nVar2 = oVar2.f2117a) == null) {
                                    z14 = false;
                                } else {
                                    Object g10 = nVar2.k().f2103k.g(H0.s.f2168n);
                                    if (g10 == null) {
                                        g10 = null;
                                    }
                                    z14 = kotlin.jvm.internal.l.a(g10, Boolean.TRUE);
                                }
                                if (z15 || !z14) {
                                    obtain.addChild(f6, i19);
                                }
                            }
                            c2341t.f(i19, i16);
                            i16++;
                        }
                    }
                    i15 = i18 + 1;
                    size = i17;
                    j5 = list;
                }
                if (i == n5.f354n) {
                    accessibilityNodeInfo.setAccessibilityFocused(z3);
                    c2218e.a(C2216c.f18608d);
                } else {
                    accessibilityNodeInfo.setAccessibilityFocused(false);
                    c2218e.a(C2216c.f18607c);
                }
                C0203h v4 = Z.v(nVar3);
                if (v4 != null) {
                    F f8 = n5.f346d;
                    f8.getFontFamilyResolver();
                    W0.c density = f8.getDensity();
                    String str2 = v4.f2829l;
                    SpannableString spannableString2 = new SpannableString(str2);
                    ArrayList arrayList = v4.f2830m;
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        f = f6;
                        int i20 = 0;
                        while (i20 < size2) {
                            int i21 = size2;
                            C0201f c0201f = (C0201f) arrayList.get(i20);
                            int i22 = i20;
                            K0.G g11 = (K0.G) c0201f.f2823a;
                            ArrayList arrayList2 = arrayList;
                            H0.g gVar4 = gVar3;
                            long b3 = g11.f2764a.b();
                            C2341t c2341t3 = c2341t;
                            V0.o oVar3 = g11.f2764a;
                            Resources resources3 = resources2;
                            H0.n nVar5 = nVar3;
                            if (!i0.p.c(b3, oVar3.b())) {
                                oVar3 = b3 != 16 ? new V0.c(b3) : V0.n.f5949a;
                            }
                            long b5 = oVar3.b();
                            int i23 = c0201f.f2824b;
                            int i24 = c0201f.f2825c;
                            AbstractC2425d.H(spannableString2, b5, i23, i24);
                            SpannableString spannableString3 = spannableString2;
                            AbstractC2425d.I(spannableString3, g11.f2765b, density, i23, i24);
                            O0.l lVar = g11.f2766c;
                            O0.j jVar3 = g11.f2767d;
                            if (lVar == null && jVar3 == null) {
                                i12 = 33;
                            } else {
                                if (lVar == null) {
                                    lVar = O0.l.f4027m;
                                }
                                StyleSpan styleSpan = new StyleSpan(AbstractC2425d.t(lVar, jVar3 != null ? jVar3.f4024a : 0));
                                i12 = 33;
                                spannableString3.setSpan(styleSpan, i23, i24, 33);
                            }
                            V0.l lVar2 = g11.f2774m;
                            if (lVar2 != null) {
                                int i25 = lVar2.f5947a;
                                if ((i25 | 1) == i25) {
                                    spannableString3.setSpan(new UnderlineSpan(), i23, i24, i12);
                                }
                                if ((i25 | 2) == i25) {
                                    spannableString3.setSpan(new StrikethroughSpan(), i23, i24, i12);
                                }
                            }
                            V0.p pVar = g11.f2771j;
                            if (pVar != null) {
                                spannableString3.setSpan(new ScaleXSpan(pVar.f5951a), i23, i24, i12);
                            }
                            AbstractC2425d.J(spannableString3, g11.f2772k, i23, i24);
                            long j6 = g11.f2773l;
                            if (j6 != 16) {
                                spannableString3.setSpan(new BackgroundColorSpan(i0.F.u(j6)), i23, i24, 33);
                            }
                            i20 = i22 + 1;
                            spannableString2 = spannableString3;
                            size2 = i21;
                            arrayList = arrayList2;
                            gVar3 = gVar4;
                            c2341t = c2341t3;
                            nVar3 = nVar5;
                            resources2 = resources3;
                        }
                    } else {
                        f = f6;
                    }
                    c2341t2 = c2341t;
                    SpannableString spannableString4 = spannableString2;
                    resources = resources2;
                    nVar = nVar3;
                    gVar = gVar3;
                    int length = str2.length();
                    X3.v vVar4 = X3.v.f6090k;
                    List list2 = v4.f2828k;
                    if (list2 != null) {
                        ?? arrayList3 = new ArrayList(list2.size());
                        int i26 = 0;
                        for (int size3 = list2.size(); i26 < size3; size3 = i11) {
                            Object obj = list2.get(i26);
                            C0201f c0201f2 = (C0201f) obj;
                            X3.v vVar5 = vVar4;
                            if (c0201f2.f2823a instanceof K0.Q) {
                                i11 = size3;
                                if (AbstractC0205j.b(0, length, c0201f2.f2824b, c0201f2.f2825c)) {
                                    arrayList3.add(obj);
                                }
                            } else {
                                i11 = size3;
                            }
                            i26++;
                            vVar4 = vVar5;
                        }
                        vVar = vVar4;
                        vVar2 = arrayList3;
                    } else {
                        vVar = vVar4;
                        vVar2 = vVar;
                    }
                    int size4 = vVar2.size();
                    for (int i27 = 0; i27 < size4; i27++) {
                        C0201f c0201f3 = (C0201f) vVar2.get(i27);
                        K0.Q q5 = (K0.Q) c0201f3.f2823a;
                        if (!(q5 instanceof K0.Q)) {
                            throw new D2.e();
                        }
                        spannableString4.setSpan(new TtsSpan.VerbatimBuilder(q5.f2809a).build(), c0201f3.f2824b, c0201f3.f2825c, 33);
                    }
                    int length2 = str2.length();
                    if (list2 != null) {
                        r7 = new ArrayList(list2.size());
                        int i28 = 0;
                        for (int size5 = list2.size(); i28 < size5; size5 = i10) {
                            Object obj2 = list2.get(i28);
                            C0201f c0201f4 = (C0201f) obj2;
                            if (c0201f4.f2823a instanceof K0.P) {
                                i10 = size5;
                                if (AbstractC0205j.b(0, length2, c0201f4.f2824b, c0201f4.f2825c)) {
                                    r7.add(obj2);
                                }
                            } else {
                                i10 = size5;
                            }
                            i28++;
                        }
                    } else {
                        r7 = vVar;
                    }
                    int size6 = r7.size();
                    int i29 = 0;
                    while (true) {
                        eVar = n5.f340I;
                        if (i29 >= size6) {
                            break;
                        }
                        C0201f c0201f5 = (C0201f) r7.get(i29);
                        K0.P p5 = (K0.P) c0201f5.f2823a;
                        WeakHashMap weakHashMap = (WeakHashMap) eVar.f20432l;
                        Object obj3 = weakHashMap.get(p5);
                        if (obj3 == null) {
                            i9 = size6;
                            obj3 = new URLSpan(p5.f2808a);
                            weakHashMap.put(p5, obj3);
                        } else {
                            i9 = size6;
                        }
                        spannableString4.setSpan((URLSpan) obj3, c0201f5.f2824b, c0201f5.f2825c, 33);
                        i29++;
                        size6 = i9;
                    }
                    int length3 = str2.length();
                    if (list2 != null) {
                        r72 = new ArrayList(list2.size());
                        int size7 = list2.size();
                        int i30 = 0;
                        while (i30 < size7) {
                            Object obj4 = list2.get(i30);
                            C0201f c0201f6 = (C0201f) obj4;
                            List list3 = list2;
                            if (c0201f6.f2823a instanceof AbstractC0210o) {
                                i8 = size7;
                                if (AbstractC0205j.b(0, length3, c0201f6.f2824b, c0201f6.f2825c)) {
                                    r72.add(obj4);
                                }
                            } else {
                                i8 = size7;
                            }
                            i30++;
                            size7 = i8;
                            list2 = list3;
                        }
                    } else {
                        r72 = vVar;
                    }
                    int i31 = 0;
                    for (int size8 = r72.size(); i31 < size8; size8 = i6) {
                        C0201f c0201f7 = (C0201f) r72.get(i31);
                        int i32 = c0201f7.f2824b;
                        int i33 = c0201f7.f2825c;
                        if (i32 != i33) {
                            Object obj5 = c0201f7.f2823a;
                            i6 = size8;
                            AbstractC0210o abstractC0210o = (AbstractC0210o) obj5;
                            i7 = i31;
                            if (abstractC0210o instanceof C0209n) {
                                ((C0209n) abstractC0210o).getClass();
                                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url", obj5);
                                C0209n c0209n = (C0209n) obj5;
                                C0201f c0201f8 = new C0201f(i32, i33, c0209n);
                                WeakHashMap weakHashMap2 = (WeakHashMap) eVar.f20433m;
                                Object obj6 = weakHashMap2.get(c0201f8);
                                if (obj6 == null) {
                                    obj6 = new URLSpan(c0209n.f2844a);
                                    weakHashMap2.put(c0201f8, obj6);
                                }
                                spannableString4.setSpan((URLSpan) obj6, i32, i33, 33);
                            } else {
                                WeakHashMap weakHashMap3 = (WeakHashMap) eVar.f20434n;
                                Object obj7 = weakHashMap3.get(c0201f7);
                                if (obj7 == null) {
                                    obj7 = new S0.g(abstractC0210o);
                                    weakHashMap3.put(c0201f7, obj7);
                                }
                                spannableString4.setSpan((ClickableSpan) obj7, i32, i33, 33);
                            }
                        } else {
                            i6 = size8;
                            i7 = i31;
                        }
                        i31 = i7 + 1;
                    }
                    spannableString = (SpannableString) N.J(spannableString4);
                } else {
                    c2341t2 = c2341t;
                    f = f6;
                    resources = resources2;
                    nVar = nVar3;
                    gVar = gVar3;
                    spannableString = null;
                }
                accessibilityNodeInfo.setText(spannableString);
                H0.v vVar6 = H0.s.K;
                if (c2321g.c(vVar6)) {
                    obtain.setContentInvalid(true);
                    Object g12 = c2321g.g(vVar6);
                    if (g12 == null) {
                        g12 = null;
                    }
                    obtain.setError((CharSequence) g12);
                }
                H0.n nVar6 = nVar;
                Resources resources4 = resources;
                String u5 = Z.u(nVar6, resources4);
                if (Build.VERSION.SDK_INT >= 30) {
                    D0.d.i(accessibilityNodeInfo, u5);
                } else {
                    accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", u5);
                }
                obtain.setCheckable(Z.t(nVar6));
                Object g13 = c2321g.g(H0.s.f2152I);
                if (g13 == null) {
                    g13 = null;
                }
                J0.a aVar4 = (J0.a) g13;
                if (aVar4 != null) {
                    if (aVar4 == J0.a.f2689k) {
                        accessibilityNodeInfo.setChecked(true);
                    } else if (aVar4 == J0.a.f2690l) {
                        accessibilityNodeInfo.setChecked(false);
                    }
                }
                Object g14 = c2321g.g(H0.s.f2151H);
                if (g14 == null) {
                    g14 = null;
                }
                Boolean bool = (Boolean) g14;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (gVar == null) {
                        gVar2 = gVar;
                    } else {
                        gVar2 = gVar;
                        if (gVar2.f2074a == 4) {
                            obtain.setSelected(booleanValue);
                        }
                    }
                    accessibilityNodeInfo.setChecked(booleanValue);
                } else {
                    gVar2 = gVar;
                }
                if (!jVar.f2105m || H0.n.j(4, nVar6).isEmpty()) {
                    Object g15 = c2321g.g(H0.s.f2157a);
                    if (g15 == null) {
                        g15 = null;
                    }
                    List list4 = (List) g15;
                    obtain.setContentDescription(list4 != null ? (String) X3.m.Z(list4) : null);
                }
                String str3 = (String) H0.q.d(jVar, H0.s.f2179y);
                if (str3 != null) {
                    H0.n nVar7 = nVar6;
                    while (true) {
                        if (nVar7 == null) {
                            z13 = false;
                            break;
                        }
                        H0.v vVar7 = H0.t.f2181a;
                        H0.j jVar4 = nVar7.f2114d;
                        if (jVar4.f2103k.c(vVar7)) {
                            z13 = ((Boolean) jVar4.d(vVar7)).booleanValue();
                            break;
                        }
                        nVar7 = nVar7.l();
                    }
                    if (z13) {
                        obtain.setViewIdResourceName(str3);
                    }
                }
                if (((W3.o) H0.q.d(jVar, H0.s.f2163h)) != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo.setHeading(true);
                    } else {
                        c2218e.f(2, true);
                    }
                }
                if (i != -1) {
                    int d7 = c2341t2.d(nVar6.f2116g);
                    if (d7 == -1) {
                        Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        obtain.setDrawingOrder(d7);
                    }
                }
                obtain.setPassword(c2321g.c(H0.s.J));
                obtain.setEditable(c2321g.c(H0.s.f2154M));
                Integer num = (Integer) H0.q.d(jVar, H0.s.f2155N);
                obtain.setMaxTextLength(num != null ? num.intValue() : -1);
                obtain.setEnabled(Z.i(nVar6));
                H0.v vVar8 = H0.s.f2165k;
                obtain.setFocusable(c2321g.c(vVar8));
                if (obtain.isFocusable()) {
                    obtain.setFocused(((Boolean) jVar.d(vVar8)).booleanValue());
                    if (obtain.isFocused()) {
                        accessibilityNodeInfo.addAction(2);
                        n5.f355o = i;
                    } else {
                        z5 = true;
                        accessibilityNodeInfo.addAction(1);
                        accessibilityNodeInfo.setVisibleToUser(H0.q.e(nVar6) ^ z5);
                        L1.a.t(H0.q.d(jVar, H0.s.f2164j));
                        accessibilityNodeInfo.setClickable(false);
                        aVar = (H0.a) H0.q.d(jVar, H0.i.f2080b);
                        if (aVar != null) {
                            boolean a6 = kotlin.jvm.internal.l.a(H0.q.d(jVar, H0.s.f2151H), Boolean.TRUE);
                            if (!(gVar2 != null && gVar2.f2074a == 4)) {
                                if (!(gVar2 != null && gVar2.f2074a == 3)) {
                                    z12 = false;
                                    accessibilityNodeInfo.setClickable(z12 || (z12 && !a6));
                                    if (Z.i(nVar6) && obtain.isClickable()) {
                                        c2218e.a(new C2216c(aVar.f2062a, 16));
                                    }
                                }
                            }
                            z12 = true;
                            accessibilityNodeInfo.setClickable(z12 || (z12 && !a6));
                            if (Z.i(nVar6)) {
                                c2218e.a(new C2216c(aVar.f2062a, 16));
                            }
                        }
                        accessibilityNodeInfo.setLongClickable(false);
                        aVar2 = (H0.a) H0.q.d(jVar, H0.i.f2081c);
                        if (aVar2 != null) {
                            accessibilityNodeInfo.setLongClickable(true);
                            if (Z.i(nVar6)) {
                                c2218e.a(new C2216c(aVar2.f2062a, 32));
                            }
                        }
                        aVar3 = (H0.a) H0.q.d(jVar, H0.i.f2092p);
                        if (aVar3 != null) {
                            c2218e.a(new C2216c(aVar3.f2062a, 16384));
                        }
                        if (Z.i(nVar6)) {
                            H0.a aVar5 = (H0.a) H0.q.d(jVar, H0.i.f2086j);
                            if (aVar5 != null) {
                                c2218e.a(new C2216c(aVar5.f2062a, 2097152));
                            }
                            H0.a aVar6 = (H0.a) H0.q.d(jVar, H0.i.f2091o);
                            if (aVar6 != null) {
                                c2218e.a(new C2216c(aVar6.f2062a, android.R.id.accessibilityActionImeEnter));
                            }
                            H0.a aVar7 = (H0.a) H0.q.d(jVar, H0.i.f2093q);
                            if (aVar7 != null) {
                                c2218e.a(new C2216c(aVar7.f2062a, 65536));
                            }
                            H0.a aVar8 = (H0.a) H0.q.d(jVar, H0.i.f2094r);
                            if (aVar8 != null && obtain.isFocused()) {
                                ClipDescription primaryClipDescription = f.getClipboardManager().f514a.getPrimaryClipDescription();
                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                    c2218e.a(new C2216c(aVar8.f2062a, 32768));
                                }
                            }
                        }
                        String p6 = N.p(nVar6);
                        z6 = p6 != null || p6.length() == 0;
                        C2731G c2731g = nVar6.f2113c;
                        if (!z6) {
                            obtain.setTextSelection(n5.n(nVar6), n5.m(nVar6));
                            H0.a aVar9 = (H0.a) H0.q.d(jVar, H0.i.i);
                            c2218e.a(new C2216c(aVar9 != null ? aVar9.f2062a : null, 131072));
                            accessibilityNodeInfo.addAction(256);
                            accessibilityNodeInfo.addAction(512);
                            accessibilityNodeInfo.setMovementGranularities(11);
                            List list5 = (List) H0.q.d(jVar, H0.s.f2157a);
                            if ((list5 == null || list5.isEmpty()) && c2321g.c(H0.i.f2079a)) {
                                if (!c2321g.c(H0.s.f2148E) || kotlin.jvm.internal.l.a(H0.q.d(jVar, vVar8), Boolean.TRUE)) {
                                    C2731G u6 = c2731g.u();
                                    while (true) {
                                        if (u6 == null) {
                                            u6 = null;
                                            break;
                                        }
                                        H0.j w5 = u6.w();
                                        if (w5 != null && w5.f2105m) {
                                            if (w5.f2103k.c(H0.s.f2148E)) {
                                                z11 = true;
                                                if (!z11) {
                                                    break;
                                                }
                                                u6 = u6.u();
                                            }
                                        }
                                        z11 = false;
                                        if (!z11) {
                                        }
                                    }
                                    if (u6 != null) {
                                        H0.j w6 = u6.w();
                                        if (w6 != null) {
                                            Object g16 = w6.f2103k.g(vVar8);
                                            if (g16 == null) {
                                                g16 = null;
                                            }
                                            z10 = kotlin.jvm.internal.l.a(g16, Boolean.TRUE);
                                        } else {
                                            z10 = false;
                                        }
                                    }
                                    z9 = false;
                                    if (!z9) {
                                        accessibilityNodeInfo.setMovementGranularities(obtain.getMovementGranularities() | 20);
                                    }
                                }
                                z9 = true;
                                if (!z9) {
                                }
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add("androidx.compose.ui.semantics.id");
                            CharSequence e3 = c2218e.e();
                            if (!(e3 == null || e3.length() == 0) && c2321g.c(H0.i.f2079a)) {
                                arrayList4.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (c2321g.c(H0.s.f2179y)) {
                                arrayList4.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (c2321g.c(H0.s.f2156O)) {
                                arrayList4.add("androidx.compose.ui.semantics.shapeType");
                                arrayList4.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList4.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList4.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            jVar.getClass();
                            if (Build.VERSION.SDK_INT >= 26) {
                                accessibilityNodeInfo.setAvailableExtraData(arrayList4);
                            }
                        }
                        fVar = (H0.f) H0.q.d(nVar6.m(), H0.s.f2159c);
                        if (fVar != null) {
                            H0.j m5 = nVar6.m();
                            H0.v vVar9 = H0.i.f2085h;
                            if (m5.f2103k.c(vVar9)) {
                                c2218e.g("android.widget.SeekBar");
                            } else {
                                c2218e.g("android.widget.ProgressBar");
                            }
                            H0.f fVar2 = H0.f.f2072b;
                            if (fVar != H0.f.f2072b) {
                                c2218e.h(new C2138i(5, AccessibilityNodeInfo.RangeInfo.obtain(1, Float.valueOf(fVar.a().f17849a).floatValue(), Float.valueOf(fVar.a().f17850b).floatValue(), 0.0f)));
                            }
                            if (nVar6.m().f2103k.c(vVar9) && Z.i(nVar6)) {
                                float floatValue = Float.valueOf(fVar.a().f17850b).floatValue();
                                float floatValue2 = Float.valueOf(fVar.a().f17849a).floatValue();
                                if (floatValue < floatValue2) {
                                    floatValue = floatValue2;
                                }
                                if (0.0f < floatValue) {
                                    c2218e.a(C2216c.f18609e);
                                }
                                if (0.0f > AbstractC0444a.q(Float.valueOf(fVar.a().f17849a).floatValue(), Float.valueOf(fVar.a().f17850b).floatValue())) {
                                    c2218e.a(C2216c.f);
                                }
                            }
                        }
                        i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 24) {
                            Z.o(nVar6, c2218e);
                        }
                        G4.d.I(nVar6, c2218e);
                        G4.d.J(nVar6, c2218e);
                        hVar = (H0.h) H0.q.d(nVar6.m(), H0.s.f2174t);
                        H0.a aVar10 = (H0.a) H0.q.d(nVar6.m(), H0.i.f2082d);
                        if (hVar != null && aVar10 != null) {
                            g6 = nVar6.k().f2103k.g(H0.s.f);
                            if (g6 == null) {
                                g6 = null;
                            }
                            if (g6 == null) {
                                Object g17 = nVar6.k().f2103k.g(H0.s.f2161e);
                                if (g17 == null) {
                                    g17 = null;
                                }
                                if (g17 == null) {
                                    z8 = false;
                                    if (!z8) {
                                        c2218e.g("android.widget.HorizontalScrollView");
                                    }
                                    if (((Number) hVar.a().invoke()).floatValue() > 0.0f) {
                                        accessibilityNodeInfo.setScrollable(true);
                                    }
                                    if (Z.i(nVar6)) {
                                        boolean u7 = N.u(hVar);
                                        W0.m mVar = W0.m.f6017l;
                                        if (u7) {
                                            c2218e.a(C2216c.f18609e);
                                            c2218e.a(!(c2731g.f21608I == mVar) ? C2216c.f18612j : C2216c.f18611h);
                                        }
                                        if (N.t(hVar)) {
                                            c2218e.a(C2216c.f);
                                            c2218e.a(!(c2731g.f21608I == mVar) ? C2216c.f18611h : C2216c.f18612j);
                                        }
                                    }
                                }
                            }
                            z8 = true;
                            if (!z8) {
                            }
                            if (((Number) hVar.a().invoke()).floatValue() > 0.0f) {
                            }
                            if (Z.i(nVar6)) {
                            }
                        }
                        hVar2 = (H0.h) H0.q.d(nVar6.m(), H0.s.f2175u);
                        if (hVar2 != null && aVar10 != null) {
                            g5 = nVar6.k().f2103k.g(H0.s.f);
                            if (g5 == null) {
                                g5 = null;
                            }
                            if (g5 == null) {
                                Object g18 = nVar6.k().f2103k.g(H0.s.f2161e);
                                if (g18 == null) {
                                    g18 = null;
                                }
                                if (g18 == null) {
                                    z7 = false;
                                    if (!z7) {
                                        c2218e.g("android.widget.ScrollView");
                                    }
                                    if (((Number) hVar2.a().invoke()).floatValue() > 0.0f) {
                                        accessibilityNodeInfo.setScrollable(true);
                                    }
                                    if (Z.i(nVar6)) {
                                        if (N.u(hVar2)) {
                                            c2218e.a(C2216c.f18609e);
                                            c2218e.a(C2216c.i);
                                        }
                                        if (N.t(hVar2)) {
                                            c2218e.a(C2216c.f);
                                            c2218e.a(C2216c.f18610g);
                                        }
                                    }
                                }
                            }
                            z7 = true;
                            if (!z7) {
                            }
                            if (((Number) hVar2.a().invoke()).floatValue() > 0.0f) {
                            }
                            if (Z.i(nVar6)) {
                            }
                        }
                        if (i5 >= 29) {
                            Z.n(nVar6, c2218e);
                        }
                        CharSequence charSequence = (CharSequence) H0.q.d(nVar6.m(), H0.s.f2160d);
                        if (i5 < 28) {
                            accessibilityNodeInfo.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (Z.i(nVar6)) {
                            H0.a aVar11 = (H0.a) H0.q.d(nVar6.m(), H0.i.f2095s);
                            if (aVar11 != null) {
                                c2218e.a(new C2216c(aVar11.f2062a, 262144));
                            }
                            H0.a aVar12 = (H0.a) H0.q.d(nVar6.m(), H0.i.f2096t);
                            if (aVar12 != null) {
                                c2218e.a(new C2216c(aVar12.f2062a, 524288));
                            }
                            H0.a aVar13 = (H0.a) H0.q.d(nVar6.m(), H0.i.f2097u);
                            if (aVar13 != null) {
                                c2218e.a(new C2216c(aVar13.f2062a, 1048576));
                            }
                            H0.j m6 = nVar6.m();
                            H0.v vVar10 = H0.i.f2099w;
                            if (m6.f2103k.c(vVar10)) {
                                List list6 = (List) nVar6.m().d(vVar10);
                                int size9 = list6.size();
                                C2342u c2342u = N.f331Q;
                                if (size9 >= c2342u.f19051b) {
                                    throw new IllegalStateException(L1.a.o(new StringBuilder("Can't have more than "), c2342u.f19051b, " custom actions for one widget"));
                                }
                                r.S s2 = new r.S(0);
                                C2315A a7 = r.K.a();
                                r.S s5 = n5.f362v;
                                if (s5.c(i)) {
                                    C2315A c2315a = (C2315A) s5.e(i);
                                    int[] iArr = new int[16];
                                    int[] iArr2 = c2342u.f19050a;
                                    int i34 = c2342u.f19051b;
                                    int i35 = 0;
                                    int i36 = 0;
                                    while (i35 < i34) {
                                        int i37 = iArr2[i35];
                                        int i38 = i34;
                                        int i39 = i36 + 1;
                                        C2315A c2315a2 = c2315a;
                                        if (iArr.length < i39) {
                                            iArr = Arrays.copyOf(iArr, Math.max(i39, (iArr.length * 3) / 2));
                                            kotlin.jvm.internal.l.e("copyOf(...)", iArr);
                                        }
                                        iArr[i36] = i37;
                                        i35++;
                                        i36 = i39;
                                        i34 = i38;
                                        c2315a = c2315a2;
                                    }
                                    C2315A c2315a3 = c2315a;
                                    ArrayList arrayList5 = new ArrayList();
                                    if (list6.size() > 0) {
                                        L1.a.t(list6.get(0));
                                        kotlin.jvm.internal.l.c(c2315a3);
                                        throw null;
                                    }
                                    if (arrayList5.size() > 0) {
                                        L1.a.t(arrayList5.get(0));
                                        if (i36 > 0) {
                                            int i40 = iArr[0];
                                            throw null;
                                        }
                                        AbstractC2351a.d("Index must be between 0 and size");
                                        throw null;
                                    }
                                } else if (list6.size() > 0) {
                                    L1.a.t(list6.get(0));
                                    c2342u.c(0);
                                    throw null;
                                }
                                n5.f361u.i(i, s2);
                                s5.i(i, a7);
                            }
                        }
                        boolean l6 = Z.l(nVar6, resources4);
                        if (Build.VERSION.SDK_INT < 28) {
                            accessibilityNodeInfo.setScreenReaderFocusable(l6);
                        } else {
                            c2218e.f(1, l6);
                        }
                        d5 = n5.f336E.d(i);
                        if (d5 == -1) {
                            Z0.j C6 = Z.C(f.getAndroidViewsHandler$ui_release(), d5);
                            if (C6 != null) {
                                accessibilityNodeInfo.setTraversalBefore(C6);
                                f5 = f;
                            } else {
                                f5 = f;
                                accessibilityNodeInfo.setTraversalBefore(f5, d5);
                            }
                            n5.e(i, c2218e, n5.f338G, null);
                        } else {
                            f5 = f;
                        }
                        d6 = n5.f337F.d(i);
                        if (d6 != -1 && (C5 = Z.C(f5.getAndroidViewsHandler$ui_release(), d6)) != null) {
                            accessibilityNodeInfo.setTraversalAfter(C5);
                            n5.e(i, c2218e, n5.f339H, null);
                        }
                        str = (String) H0.q.d(nVar6.m(), H0.t.f2182b);
                        if (str != null) {
                            c2218e.g(str);
                        }
                    }
                }
                z5 = true;
                accessibilityNodeInfo.setVisibleToUser(H0.q.e(nVar6) ^ z5);
                L1.a.t(H0.q.d(jVar, H0.s.f2164j));
                accessibilityNodeInfo.setClickable(false);
                aVar = (H0.a) H0.q.d(jVar, H0.i.f2080b);
                if (aVar != null) {
                }
                accessibilityNodeInfo.setLongClickable(false);
                aVar2 = (H0.a) H0.q.d(jVar, H0.i.f2081c);
                if (aVar2 != null) {
                }
                aVar3 = (H0.a) H0.q.d(jVar, H0.i.f2092p);
                if (aVar3 != null) {
                }
                if (Z.i(nVar6)) {
                }
                String p62 = N.p(nVar6);
                if (p62 != null) {
                }
                C2731G c2731g2 = nVar6.f2113c;
                if (!z6) {
                }
                if (Build.VERSION.SDK_INT >= 26) {
                }
                fVar = (H0.f) H0.q.d(nVar6.m(), H0.s.f2159c);
                if (fVar != null) {
                }
                i5 = Build.VERSION.SDK_INT;
                if (i5 >= 24) {
                }
                G4.d.I(nVar6, c2218e);
                G4.d.J(nVar6, c2218e);
                hVar = (H0.h) H0.q.d(nVar6.m(), H0.s.f2174t);
                H0.a aVar102 = (H0.a) H0.q.d(nVar6.m(), H0.i.f2082d);
                if (hVar != null) {
                    g6 = nVar6.k().f2103k.g(H0.s.f);
                    if (g6 == null) {
                    }
                    if (g6 == null) {
                    }
                    z8 = true;
                    if (!z8) {
                    }
                    if (((Number) hVar.a().invoke()).floatValue() > 0.0f) {
                    }
                    if (Z.i(nVar6)) {
                    }
                }
                hVar2 = (H0.h) H0.q.d(nVar6.m(), H0.s.f2175u);
                if (hVar2 != null) {
                    g5 = nVar6.k().f2103k.g(H0.s.f);
                    if (g5 == null) {
                    }
                    if (g5 == null) {
                    }
                    z7 = true;
                    if (!z7) {
                    }
                    if (((Number) hVar2.a().invoke()).floatValue() > 0.0f) {
                    }
                    if (Z.i(nVar6)) {
                    }
                }
                if (i5 >= 29) {
                }
                CharSequence charSequence2 = (CharSequence) H0.q.d(nVar6.m(), H0.s.f2160d);
                if (i5 < 28) {
                }
                if (Z.i(nVar6)) {
                }
                boolean l62 = Z.l(nVar6, resources4);
                if (Build.VERSION.SDK_INT < 28) {
                }
                d5 = n5.f336E.d(i);
                if (d5 == -1) {
                }
                d6 = n5.f337F.d(i);
                if (d6 != -1) {
                    accessibilityNodeInfo.setTraversalAfter(C5);
                    n5.e(i, c2218e, n5.f339H, null);
                }
                str = (String) H0.q.d(nVar6.m(), H0.t.f2182b);
                if (str != null) {
                }
            }
        }
        if (n5.f358r) {
            if (i == n5.f354n) {
                n5.f356p = c2218e;
            }
            if (i == n5.f355o) {
                n5.f357q = c2218e;
            }
        }
        return c2218e;
    }

    @Override // k0.C2023c
    public final C2218e t(int i) {
        N n5 = this.f303m;
        if (i != 1) {
            if (i == 2) {
                return s(n5.f354n);
            }
            throw new IllegalArgumentException(AbstractC2107A.q("Unknown focus type: ", i));
        }
        int i5 = n5.f355o;
        if (i5 == Integer.MIN_VALUE) {
            return null;
        }
        return s(i5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 34 ? n1.AbstractC2176q.h(r12) : true) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x01a3, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x06d7, code lost:
    
        if (r0 != 16) goto L519;
     */
    /* JADX WARN: Removed duplicated region for block: B:314:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0135  */
    @Override // k0.C2023c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(int i, int i5, Bundle bundle) {
        H0.n nVar;
        Integer num;
        int i6;
        AbstractC0015c abstractC0015c;
        int i7;
        int i8;
        K0.L x5;
        InterfaceC2015a interfaceC2015a;
        int i9;
        int i10;
        InterfaceC2015a interfaceC2015a2;
        InterfaceC2015a interfaceC2015a3;
        InterfaceC2015a interfaceC2015a4;
        InterfaceC2015a interfaceC2015a5;
        InterfaceC2015a interfaceC2015a6;
        InterfaceC2015a interfaceC2015a7;
        InterfaceC2015a interfaceC2015a8;
        InterfaceC2015a interfaceC2015a9;
        i4.c cVar;
        H0.a aVar;
        W0.m mVar;
        long j5;
        long j6;
        Object g5;
        Object g6;
        float f;
        float f5;
        i4.e eVar;
        i4.c cVar2;
        InterfaceC2015a interfaceC2015a10;
        Float f6;
        boolean z3;
        H0.a aVar2;
        InterfaceC2015a interfaceC2015a11;
        float intBitsToFloat;
        H0.a aVar3;
        InterfaceC2015a interfaceC2015a12;
        i4.c cVar3;
        InterfaceC2015a interfaceC2015a13;
        InterfaceC2015a interfaceC2015a14;
        InterfaceC2015a interfaceC2015a15;
        InterfaceC2015a interfaceC2015a16;
        N n5 = this.f303m;
        H0.o oVar = (H0.o) n5.o().b(i);
        if (oVar != null && (nVar = oVar.f2117a) != null) {
            H0.v vVar = H0.s.f2168n;
            H0.j jVar = nVar.f2114d;
            C2321G c2321g = jVar.f2103k;
            Object g7 = c2321g.g(vVar);
            if (g7 == null) {
                g7 = null;
            }
            Boolean bool = Boolean.TRUE;
            boolean a5 = kotlin.jvm.internal.l.a(g7, bool);
            AccessibilityManager accessibilityManager = n5.f348g;
            if (a5) {
            }
            F f7 = n5.f346d;
            if (i5 == 64) {
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                    int i11 = n5.f354n;
                    if (!(i11 == i)) {
                        if (i11 != Integer.MIN_VALUE) {
                            num = null;
                            i6 = 12;
                            N.z(n5, i11, 65536, null, 12);
                        } else {
                            num = null;
                            i6 = 12;
                        }
                        n5.f354n = i;
                        f7.invalidate();
                        N.z(n5, i, 32768, num, i6);
                        return true;
                    }
                }
            } else if (i5 != 128) {
                int i12 = nVar.f2116g;
                if (i5 == 256 || i5 == 512) {
                    if (bundle != null) {
                        int i13 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
                        boolean z5 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
                        boolean z6 = i5 == 256;
                        Integer num2 = n5.f364x;
                        if (num2 == null || i12 != num2.intValue()) {
                            n5.f363w = -1;
                            n5.f364x = Integer.valueOf(i12);
                        }
                        String p5 = N.p(nVar);
                        if (p5 != null && p5.length() != 0) {
                            String p6 = N.p(nVar);
                            if (p6 != null && p6.length() != 0) {
                                if (i13 == 1) {
                                    Locale locale = f7.getContext().getResources().getConfiguration().locale;
                                    if (C0018d.f479e == null) {
                                        C0018d c0018d = new C0018d(0);
                                        c0018d.f483d = BreakIterator.getCharacterInstance(locale);
                                        C0018d.f479e = c0018d;
                                    }
                                    C0018d c0018d2 = C0018d.f479e;
                                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator", c0018d2);
                                    c0018d2.r(p6);
                                    abstractC0015c = c0018d2;
                                } else if (i13 != 2) {
                                    if (i13 != 4) {
                                        if (i13 == 8) {
                                            if (C0024f.f496c == null) {
                                                C0024f.f496c = new C0024f(0);
                                            }
                                            C0024f c0024f = C0024f.f496c;
                                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator", c0024f);
                                            c0024f.f474a = p6;
                                            abstractC0015c = c0024f;
                                        }
                                    }
                                    if (c2321g.c(H0.i.f2079a) && (x5 = Z.x(jVar)) != null) {
                                        if (i13 == 4) {
                                            if (C0018d.f480g == null) {
                                                C0018d.f480g = new C0018d(2);
                                            }
                                            C0018d c0018d3 = C0018d.f480g;
                                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator", c0018d3);
                                            c0018d3.f474a = p6;
                                            c0018d3.f483d = x5;
                                            abstractC0015c = c0018d3;
                                        } else {
                                            if (C0021e.f489e == null) {
                                                C0021e c0021e = new C0021e(0);
                                                new Rect();
                                                C0021e.f489e = c0021e;
                                            }
                                            C0021e c0021e2 = C0021e.f489e;
                                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator", c0021e2);
                                            c0021e2.f474a = p6;
                                            c0021e2.f491c = x5;
                                            c0021e2.f492d = nVar;
                                            abstractC0015c = c0021e2;
                                        }
                                    }
                                } else {
                                    Locale locale2 = f7.getContext().getResources().getConfiguration().locale;
                                    if (C0018d.f == null) {
                                        C0018d c0018d4 = new C0018d(1);
                                        c0018d4.f483d = BreakIterator.getWordInstance(locale2);
                                        C0018d.f = c0018d4;
                                    }
                                    C0018d c0018d5 = C0018d.f;
                                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator", c0018d5);
                                    c0018d5.r(p6);
                                    abstractC0015c = c0018d5;
                                }
                                if (abstractC0015c != null) {
                                    int m5 = n5.m(nVar);
                                    if (m5 == -1) {
                                        m5 = z6 ? 0 : p5.length();
                                    }
                                    int[] a6 = z6 ? abstractC0015c.a(m5) : abstractC0015c.k(m5);
                                    if (a6 != null) {
                                        int i14 = a6[0];
                                        int i15 = a6[1];
                                        if (z5 && !c2321g.c(H0.s.f2157a) && c2321g.c(H0.s.f2148E)) {
                                            i7 = n5.n(nVar);
                                            if (i7 == -1) {
                                                i7 = z6 ? i14 : i15;
                                            }
                                            i8 = z6 ? i15 : i14;
                                        } else {
                                            i7 = z6 ? i15 : i14;
                                            i8 = i7;
                                        }
                                        n5.f333B = new K(nVar, z6 ? 256 : 512, i13, i14, i15, SystemClock.uptimeMillis());
                                        n5.F(nVar, i7, i8, true);
                                        return true;
                                    }
                                }
                            }
                            abstractC0015c = null;
                            if (abstractC0015c != null) {
                            }
                        }
                    }
                } else if (i5 == 16384) {
                    Object g8 = c2321g.g(H0.i.f2092p);
                    H0.a aVar4 = (H0.a) (g8 == null ? null : g8);
                    if (aVar4 != null && (interfaceC2015a = (InterfaceC2015a) aVar4.f2063b) != null) {
                        return ((Boolean) interfaceC2015a.invoke()).booleanValue();
                    }
                } else {
                    if (i5 == 131072) {
                        if (bundle != null) {
                            i9 = -1;
                            i10 = bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1);
                        } else {
                            i9 = -1;
                            i10 = -1;
                        }
                        boolean F5 = n5.F(nVar, i10, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", i9) : -1, false);
                        if (F5) {
                            N.z(n5, n5.v(i12), 0, null, 12);
                        }
                        return F5;
                    }
                    if (Z.i(nVar)) {
                        if (i5 == 1) {
                            if (f7.isInTouchMode()) {
                                f7.requestFocusFromTouch();
                            }
                            Object g9 = c2321g.g(H0.i.f2098v);
                            H0.a aVar5 = (H0.a) (g9 == null ? null : g9);
                            if (aVar5 != null && (interfaceC2015a2 = (InterfaceC2015a) aVar5.f2063b) != null) {
                                return ((Boolean) interfaceC2015a2.invoke()).booleanValue();
                            }
                        } else if (i5 != 2) {
                            W0.m mVar2 = W0.m.f6017l;
                            C2731G c2731g = nVar.f2113c;
                            switch (i5) {
                                case 16:
                                    Object g10 = c2321g.g(H0.i.f2080b);
                                    if (g10 == null) {
                                        g10 = null;
                                    }
                                    H0.a aVar6 = (H0.a) g10;
                                    Boolean bool2 = (aVar6 == null || (interfaceC2015a3 = (InterfaceC2015a) aVar6.f2063b) == null) ? null : (Boolean) interfaceC2015a3.invoke();
                                    N.z(n5, i, 1, null, 12);
                                    if (bool2 != null) {
                                        return bool2.booleanValue();
                                    }
                                    break;
                                case 32:
                                    Object g11 = c2321g.g(H0.i.f2081c);
                                    H0.a aVar7 = (H0.a) (g11 == null ? null : g11);
                                    if (aVar7 != null && (interfaceC2015a4 = (InterfaceC2015a) aVar7.f2063b) != null) {
                                        return ((Boolean) interfaceC2015a4.invoke()).booleanValue();
                                    }
                                    break;
                                case 4096:
                                case 8192:
                                    boolean z7 = i5 == 4096;
                                    boolean z8 = i5 == 8192;
                                    boolean z9 = i5 == 16908345;
                                    boolean z10 = i5 == 16908347;
                                    boolean z11 = i5 == 16908344;
                                    boolean z12 = i5 == 16908346;
                                    boolean z13 = z9 || z10 || z7 || z8;
                                    boolean z14 = z11 || z12 || z7 || z8;
                                    if (z7 || z8) {
                                        Object g12 = c2321g.g(H0.s.f2159c);
                                        if (g12 == null) {
                                            g12 = null;
                                        }
                                        H0.f fVar = (H0.f) g12;
                                        Object g13 = c2321g.g(H0.i.f2085h);
                                        if (g13 == null) {
                                            g13 = null;
                                        }
                                        H0.a aVar8 = (H0.a) g13;
                                        if (fVar != null && aVar8 != null) {
                                            C2059a c2059a = fVar.f2073a;
                                            float f8 = c2059a.f17850b;
                                            float f9 = c2059a.f17849a;
                                            float f10 = f8 < f9 ? f9 : f8;
                                            if (f9 <= f8) {
                                                f8 = f9;
                                            }
                                            float f11 = (f10 - f8) / 20;
                                            if (z8) {
                                                f11 = -f11;
                                            }
                                            i4.c cVar4 = (i4.c) aVar8.f2063b;
                                            if (cVar4 != null) {
                                                return ((Boolean) cVar4.c(Float.valueOf(0.0f + f11))).booleanValue();
                                            }
                                        }
                                    }
                                    long b3 = x0.f0.e(c2731g.f21612O.f21768c).b();
                                    ArrayList arrayList = new ArrayList();
                                    Object g14 = c2321g.g(H0.i.f2078B);
                                    if (g14 == null) {
                                        g14 = null;
                                    }
                                    H0.a aVar9 = (H0.a) g14;
                                    Float f12 = (aVar9 == null || (cVar3 = (i4.c) aVar9.f2063b) == null || !((Boolean) cVar3.c(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
                                    Object g15 = c2321g.g(H0.i.f2082d);
                                    if (g15 == null) {
                                        g15 = null;
                                    }
                                    H0.a aVar10 = (H0.a) g15;
                                    if (aVar10 != null) {
                                        Object g16 = c2321g.g(H0.s.f2174t);
                                        if (g16 == null) {
                                            g16 = null;
                                        }
                                        H0.h hVar = (H0.h) g16;
                                        W3.c cVar5 = aVar10.f2063b;
                                        if (hVar == null || !z13) {
                                            f6 = f12;
                                            z3 = z14;
                                        } else {
                                            if (f12 != null) {
                                                intBitsToFloat = f12.floatValue();
                                                f6 = f12;
                                                z3 = z14;
                                            } else {
                                                f6 = f12;
                                                z3 = z14;
                                                intBitsToFloat = Float.intBitsToFloat((int) (b3 >> 32));
                                            }
                                            if (z9 || z8) {
                                                intBitsToFloat = -intBitsToFloat;
                                            }
                                            if ((c2731g.f21608I == mVar2) && (z9 || z10)) {
                                                intBitsToFloat = -intBitsToFloat;
                                            }
                                            if (N.s(hVar, intBitsToFloat)) {
                                                H0.v vVar2 = H0.i.f2101y;
                                                if (c2321g.c(vVar2) || c2321g.c(H0.i.f2077A)) {
                                                    if (intBitsToFloat > 0.0f) {
                                                        Object g17 = c2321g.g(H0.i.f2077A);
                                                        aVar3 = (H0.a) (g17 == null ? null : g17);
                                                    } else {
                                                        Object g18 = c2321g.g(vVar2);
                                                        aVar3 = (H0.a) (g18 == null ? null : g18);
                                                    }
                                                    if (aVar3 != null && (interfaceC2015a12 = (InterfaceC2015a) aVar3.f2063b) != null) {
                                                        return ((Boolean) interfaceC2015a12.invoke()).booleanValue();
                                                    }
                                                } else {
                                                    i4.e eVar2 = (i4.e) cVar5;
                                                    if (eVar2 != null) {
                                                        return ((Boolean) eVar2.invoke(Float.valueOf(intBitsToFloat), Float.valueOf(0.0f))).booleanValue();
                                                    }
                                                }
                                            }
                                        }
                                        Object g19 = c2321g.g(H0.s.f2175u);
                                        if (g19 == null) {
                                            g19 = null;
                                        }
                                        H0.h hVar2 = (H0.h) g19;
                                        if (hVar2 != null && z3) {
                                            float floatValue = f6 != null ? f6.floatValue() : Float.intBitsToFloat((int) (4294967295L & b3));
                                            if (z11 || z8) {
                                                floatValue = -floatValue;
                                            }
                                            if (N.s(hVar2, floatValue)) {
                                                H0.v vVar3 = H0.i.f2100x;
                                                if (c2321g.c(vVar3) || c2321g.c(H0.i.f2102z)) {
                                                    if (floatValue > 0.0f) {
                                                        Object g20 = c2321g.g(H0.i.f2102z);
                                                        aVar2 = (H0.a) (g20 == null ? null : g20);
                                                    } else {
                                                        Object g21 = c2321g.g(vVar3);
                                                        aVar2 = (H0.a) (g21 == null ? null : g21);
                                                    }
                                                    if (aVar2 != null && (interfaceC2015a11 = (InterfaceC2015a) aVar2.f2063b) != null) {
                                                        return ((Boolean) interfaceC2015a11.invoke()).booleanValue();
                                                    }
                                                } else {
                                                    i4.e eVar3 = (i4.e) cVar5;
                                                    if (eVar3 != null) {
                                                        return ((Boolean) eVar3.invoke(Float.valueOf(0.0f), Float.valueOf(floatValue))).booleanValue();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    break;
                                case 32768:
                                    Object g22 = c2321g.g(H0.i.f2094r);
                                    H0.a aVar11 = (H0.a) (g22 == null ? null : g22);
                                    if (aVar11 != null && (interfaceC2015a5 = (InterfaceC2015a) aVar11.f2063b) != null) {
                                        return ((Boolean) interfaceC2015a5.invoke()).booleanValue();
                                    }
                                    break;
                                case 65536:
                                    Object g23 = c2321g.g(H0.i.f2093q);
                                    H0.a aVar12 = (H0.a) (g23 == null ? null : g23);
                                    if (aVar12 != null && (interfaceC2015a6 = (InterfaceC2015a) aVar12.f2063b) != null) {
                                        return ((Boolean) interfaceC2015a6.invoke()).booleanValue();
                                    }
                                    break;
                                case 262144:
                                    Object g24 = c2321g.g(H0.i.f2095s);
                                    H0.a aVar13 = (H0.a) (g24 == null ? null : g24);
                                    if (aVar13 != null && (interfaceC2015a7 = (InterfaceC2015a) aVar13.f2063b) != null) {
                                        return ((Boolean) interfaceC2015a7.invoke()).booleanValue();
                                    }
                                    break;
                                case 524288:
                                    Object g25 = c2321g.g(H0.i.f2096t);
                                    H0.a aVar14 = (H0.a) (g25 == null ? null : g25);
                                    if (aVar14 != null && (interfaceC2015a8 = (InterfaceC2015a) aVar14.f2063b) != null) {
                                        return ((Boolean) interfaceC2015a8.invoke()).booleanValue();
                                    }
                                    break;
                                case 1048576:
                                    Object g26 = c2321g.g(H0.i.f2097u);
                                    H0.a aVar15 = (H0.a) (g26 == null ? null : g26);
                                    if (aVar15 != null && (interfaceC2015a9 = (InterfaceC2015a) aVar15.f2063b) != null) {
                                        return ((Boolean) interfaceC2015a9.invoke()).booleanValue();
                                    }
                                    break;
                                case 2097152:
                                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                                    Object g27 = c2321g.g(H0.i.f2086j);
                                    H0.a aVar16 = (H0.a) (g27 == null ? null : g27);
                                    if (aVar16 != null && (cVar = (i4.c) aVar16.f2063b) != null) {
                                        if (string == null) {
                                            string = "";
                                        }
                                        return ((Boolean) cVar.c(new C0203h(string))).booleanValue();
                                    }
                                    break;
                                case android.R.id.accessibilityActionShowOnScreen:
                                    H0.n l5 = nVar.l();
                                    if (l5 != null) {
                                        Object g28 = l5.f2114d.f2103k.g(H0.i.f2082d);
                                        if (g28 == null) {
                                            g28 = null;
                                        }
                                        aVar = (H0.a) g28;
                                        while (l5 != null && aVar == null) {
                                            l5 = l5.l();
                                            if (l5 != null) {
                                                Object g29 = l5.f2114d.f2103k.g(H0.i.f2082d);
                                                if (g29 == null) {
                                                    g29 = null;
                                                }
                                                aVar = (H0.a) g29;
                                            }
                                        }
                                        if (l5 == null) {
                                            C1989c g30 = nVar.g();
                                            return f7.requestRectangleOnScreen(new Rect((int) Math.floor(g30.f17193a), (int) Math.floor(g30.f17194b), AbstractC2036a.U((float) Math.ceil(g30.f17195c)), AbstractC2036a.U((float) Math.ceil(g30.f17196d))));
                                        }
                                        C2731G c2731g2 = l5.f2113c;
                                        C1989c e3 = x0.f0.e(c2731g2.f21612O.f21768c);
                                        InterfaceC2637x l6 = c2731g2.f21612O.f21768c.l();
                                        if (l6 != null) {
                                            mVar = mVar2;
                                            j5 = ((z0.e0) l6).J(0L);
                                        } else {
                                            mVar = mVar2;
                                            j5 = 0;
                                        }
                                        C1989c g31 = e3.g(j5);
                                        z0.e0 d5 = nVar.d();
                                        if (d5 != null) {
                                            if (!d5.I0().f7175x) {
                                                d5 = null;
                                            }
                                            if (d5 != null) {
                                                j6 = d5.J(0L);
                                                z0.e0 d6 = nVar.d();
                                                C1989c f13 = G4.l.f(j6, AbstractC0444a.d0(d6 != null ? d6.f20975m : 0L));
                                                H0.v vVar4 = H0.s.f2174t;
                                                C2321G c2321g2 = l5.f2114d.f2103k;
                                                g5 = c2321g2.g(vVar4);
                                                if (g5 == null) {
                                                    g5 = null;
                                                }
                                                g6 = c2321g2.g(H0.s.f2175u);
                                                if (g6 == null) {
                                                    g6 = null;
                                                }
                                                f = f13.f17193a - g31.f17193a;
                                                f5 = f13.f17195c - g31.f17195c;
                                                if (Math.signum(f) == Math.signum(f5)) {
                                                    f = 0.0f;
                                                } else if (Math.abs(f) >= Math.abs(f5)) {
                                                    f = f5;
                                                }
                                                if (c2731g.f21608I != mVar) {
                                                    f = -f;
                                                }
                                                float f14 = f13.f17194b - g31.f17194b;
                                                float f15 = f13.f17196d - g31.f17196d;
                                                float f16 = Math.signum(f14) == Math.signum(f15) ? Math.abs(f14) < Math.abs(f15) ? f14 : f15 : 0.0f;
                                                if (aVar == null && (eVar = (i4.e) aVar.f2063b) != null && ((Boolean) eVar.invoke(Float.valueOf(f), Float.valueOf(f16))).booleanValue()) {
                                                    return true;
                                                }
                                            }
                                        }
                                        j6 = 0;
                                        z0.e0 d62 = nVar.d();
                                        C1989c f132 = G4.l.f(j6, AbstractC0444a.d0(d62 != null ? d62.f20975m : 0L));
                                        H0.v vVar42 = H0.s.f2174t;
                                        C2321G c2321g22 = l5.f2114d.f2103k;
                                        g5 = c2321g22.g(vVar42);
                                        if (g5 == null) {
                                        }
                                        g6 = c2321g22.g(H0.s.f2175u);
                                        if (g6 == null) {
                                        }
                                        f = f132.f17193a - g31.f17193a;
                                        f5 = f132.f17195c - g31.f17195c;
                                        if (Math.signum(f) == Math.signum(f5)) {
                                        }
                                        if (c2731g.f21608I != mVar) {
                                        }
                                        float f142 = f132.f17194b - g31.f17194b;
                                        float f152 = f132.f17196d - g31.f17196d;
                                        if (Math.signum(f142) == Math.signum(f152)) {
                                        }
                                        if (aVar == null) {
                                        }
                                    }
                                    aVar = null;
                                    break;
                                case android.R.id.accessibilityActionSetProgress:
                                    if (bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                                        Object g32 = c2321g.g(H0.i.f2085h);
                                        H0.a aVar17 = (H0.a) (g32 == null ? null : g32);
                                        if (aVar17 != null && (cVar2 = (i4.c) aVar17.f2063b) != null) {
                                            return ((Boolean) cVar2.c(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                                        }
                                    }
                                    break;
                                case android.R.id.accessibilityActionImeEnter:
                                    Object g33 = c2321g.g(H0.i.f2091o);
                                    H0.a aVar18 = (H0.a) (g33 == null ? null : g33);
                                    if (aVar18 != null && (interfaceC2015a10 = (InterfaceC2015a) aVar18.f2063b) != null) {
                                        return ((Boolean) interfaceC2015a10.invoke()).booleanValue();
                                    }
                                    break;
                                default:
                                    switch (i5) {
                                        case android.R.id.accessibilityActionScrollUp:
                                        case android.R.id.accessibilityActionScrollLeft:
                                        case android.R.id.accessibilityActionScrollDown:
                                        case android.R.id.accessibilityActionScrollRight:
                                            break;
                                        default:
                                            switch (i5) {
                                                case android.R.id.accessibilityActionPageUp:
                                                    Object g34 = c2321g.g(H0.i.f2100x);
                                                    H0.a aVar19 = (H0.a) (g34 == null ? null : g34);
                                                    if (aVar19 != null && (interfaceC2015a13 = (InterfaceC2015a) aVar19.f2063b) != null) {
                                                        return ((Boolean) interfaceC2015a13.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case android.R.id.accessibilityActionPageDown:
                                                    Object g35 = c2321g.g(H0.i.f2102z);
                                                    H0.a aVar20 = (H0.a) (g35 == null ? null : g35);
                                                    if (aVar20 != null && (interfaceC2015a14 = (InterfaceC2015a) aVar20.f2063b) != null) {
                                                        return ((Boolean) interfaceC2015a14.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case android.R.id.accessibilityActionPageLeft:
                                                    Object g36 = c2321g.g(H0.i.f2101y);
                                                    H0.a aVar21 = (H0.a) (g36 == null ? null : g36);
                                                    if (aVar21 != null && (interfaceC2015a15 = (InterfaceC2015a) aVar21.f2063b) != null) {
                                                        return ((Boolean) interfaceC2015a15.invoke()).booleanValue();
                                                    }
                                                    break;
                                                case android.R.id.accessibilityActionPageRight:
                                                    Object g37 = c2321g.g(H0.i.f2077A);
                                                    H0.a aVar22 = (H0.a) (g37 == null ? null : g37);
                                                    if (aVar22 != null && (interfaceC2015a16 = (InterfaceC2015a) aVar22.f2063b) != null) {
                                                        return ((Boolean) interfaceC2015a16.invoke()).booleanValue();
                                                    }
                                                    break;
                                                default:
                                                    r.S s2 = (r.S) n5.f361u.e(i);
                                                    if (s2 != null && ((CharSequence) s2.e(i5)) != null) {
                                                        Object g38 = c2321g.g(H0.i.f2099w);
                                                        List list = (List) (g38 == null ? null : g38);
                                                        if (list != null && list.size() > 0) {
                                                            list.get(0).getClass();
                                                            throw new ClassCastException();
                                                        }
                                                    }
                                                    break;
                                            }
                                    }
                            }
                        } else {
                            Object g39 = c2321g.g(H0.s.f2165k);
                            if (kotlin.jvm.internal.l.a(g39 == null ? null : g39, bool)) {
                                ((C1965j) f7.getFocusOwner()).b(8, false, true);
                                return true;
                            }
                        }
                    }
                }
            } else {
                if (n5.f354n == i) {
                    n5.f354n = Integer.MIN_VALUE;
                    n5.f356p = null;
                    f7.invalidate();
                    N.z(n5, i, 65536, null, 12);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
