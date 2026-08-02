package g0;

import A.x;
import A0.A;
import A0.F;
import A0.R0;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import b0.o;
import c0.C0532a;
import c0.C0533b;
import g0.C1965j;
import h0.C1989c;
import i4.InterfaceC2015a;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import r.C2316B;
import r.z;
import r0.AbstractC2346c;
import r0.InterfaceC2347d;
import w0.AbstractC2540a;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.C2731G;
import z0.Z;
import z0.c0;

/* renamed from: g0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1965j implements InterfaceC1964i {

    /* renamed from: a, reason: collision with root package name */
    public final F f17029a;

    /* renamed from: b, reason: collision with root package name */
    public final F f17030b;

    /* renamed from: d, reason: collision with root package name */
    public final C1962g f17032d;
    public z f;

    /* renamed from: h, reason: collision with root package name */
    public s f17035h;

    /* renamed from: c, reason: collision with root package name */
    public final s f17031c = new s(null, 6);

    /* renamed from: e, reason: collision with root package name */
    public final FocusOwnerImpl$modifier$1 f17033e = new Z() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return C1965j.this.f17031c.hashCode();
        }

        @Override // z0.Z
        public final o i() {
            return C1965j.this.f17031c;
        }

        @Override // z0.Z
        public final /* bridge */ /* synthetic */ void k(o oVar) {
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public final C2316B f17034g = new C2316B(1);

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public C1965j(F f, F f5) {
        this.f17029a = f;
        this.f17030b = f5;
        this.f17032d = new C1962g(this, f5);
    }

    public final boolean a(boolean z3) {
        c0 c0Var;
        s sVar = this.f17035h;
        if (sVar != null) {
            g(null);
            r rVar = r.f17054k;
            r rVar2 = r.f17057n;
            sVar.y0(rVar, rVar2);
            if (!sVar.f7162k.f7175x) {
                AbstractC2540a.b("visitAncestors called on an unattached node");
            }
            b0.o oVar = sVar.f7162k.f7166o;
            C2731G v4 = AbstractC2749f.v(sVar);
            while (v4 != null) {
                if ((v4.f21612O.f.f7165n & 1024) != 0) {
                    while (oVar != null) {
                        if ((oVar.f7164m & 1024) != 0) {
                            R.e eVar = null;
                            b0.o oVar2 = oVar;
                            while (oVar2 != null) {
                                if (oVar2 instanceof s) {
                                    ((s) oVar2).y0(r.f17055l, rVar2);
                                } else if ((oVar2.f7164m & 1024) != 0 && (oVar2 instanceof AbstractC2756m)) {
                                    int i = 0;
                                    for (b0.o oVar3 = ((AbstractC2756m) oVar2).f21839z; oVar3 != null; oVar3 = oVar3.f7167p) {
                                        if ((oVar3.f7164m & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                oVar2 = oVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new R.e(new b0.o[16]);
                                                }
                                                if (oVar2 != null) {
                                                    eVar.c(oVar2);
                                                    oVar2 = null;
                                                }
                                                eVar.c(oVar3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                oVar2 = AbstractC2749f.f(eVar);
                            }
                        }
                        oVar = oVar.f7166o;
                    }
                }
                v4 = v4.u();
                oVar = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z3, boolean z5) {
        boolean z6 = true;
        if (z3) {
            a(z3);
        } else {
            int ordinal = AbstractC1961f.s(this.f17031c, i).ordinal();
            if (ordinal == 0) {
                a(z3);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    throw new D2.e();
                }
                z6 = false;
            }
        }
        if (z6 && z5) {
            c();
        }
        return z6;
    }

    public final void c() {
        F f = this.f17029a;
        if (f.isFocused() || f.hasFocus()) {
            f.clearFocus();
        } else if (f.hasFocus()) {
            View findFocus = f.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            f.clearFocus();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016a A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x001c, B:13:0x0026, B:16:0x0032, B:18:0x0038, B:19:0x003d, B:21:0x0045, B:23:0x004a, B:25:0x0050, B:29:0x0056, B:34:0x016a, B:36:0x0170, B:37:0x0173, B:39:0x017e, B:42:0x018a, B:46:0x0194, B:81:0x019a, B:82:0x019f, B:75:0x01d9, B:48:0x01a3, B:50:0x01a9, B:52:0x01ad, B:54:0x01b5, B:56:0x01bb, B:62:0x01c3, B:64:0x01cc, B:65:0x01d0, B:60:0x01d3, B:84:0x01de, B:87:0x01e1, B:89:0x01e7, B:96:0x01eb, B:101:0x01f2, B:103:0x01fa, B:111:0x0211, B:113:0x0216, B:147:0x021a, B:142:0x025c, B:115:0x0226, B:117:0x022c, B:119:0x0230, B:121:0x0238, B:123:0x023e, B:129:0x0246, B:131:0x024f, B:132:0x0253, B:127:0x0256, B:153:0x0261, B:157:0x0271, B:159:0x0276, B:193:0x027a, B:188:0x02bc, B:161:0x0286, B:163:0x028c, B:165:0x0290, B:167:0x0298, B:169:0x029e, B:175:0x02a6, B:177:0x02af, B:178:0x02b3, B:173:0x02b6, B:200:0x02c3, B:202:0x02ca, B:215:0x005e, B:217:0x0064, B:218:0x0067, B:220:0x006f, B:223:0x007b, B:227:0x0085, B:262:0x00d8, B:264:0x00dc, B:229:0x008a, B:231:0x0090, B:233:0x0094, B:235:0x009c, B:237:0x00a2, B:243:0x00aa, B:245:0x00b3, B:246:0x00b7, B:241:0x00ba, B:252:0x00c0, B:266:0x00c5, B:269:0x00c8, B:271:0x00ce, B:278:0x00d2, B:283:0x00e2, B:285:0x00e8, B:286:0x00eb, B:288:0x00f5, B:291:0x0101, B:295:0x010b, B:330:0x015e, B:332:0x0162, B:297:0x0110, B:299:0x0116, B:301:0x011a, B:303:0x0122, B:305:0x0128, B:311:0x0130, B:313:0x0139, B:314:0x013d, B:309:0x0140, B:320:0x0146, B:335:0x014b, B:338:0x014e, B:340:0x0154, B:347:0x0158), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [R.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [R.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r15v5, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r15v9, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v35, types: [R.e] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [R.e] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(KeyEvent keyEvent, InterfaceC2015a interfaceC2015a) {
        Object obj;
        b0.o oVar;
        c0 c0Var;
        Object obj2;
        c0 c0Var2;
        int size;
        c0 c0Var3;
        s sVar = this.f17031c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f17032d.f17027e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!h(keyEvent)) {
                return false;
            }
            s g5 = AbstractC1961f.g(sVar);
            if (g5 != null) {
                if (!g5.f7162k.f7175x) {
                    AbstractC2540a.b("visitLocalDescendants called on an unattached node");
                }
                b0.o oVar2 = g5.f7162k;
                if ((oVar2.f7165n & 9216) != 0) {
                    oVar = null;
                    for (b0.o oVar3 = oVar2.f7167p; oVar3 != null; oVar3 = oVar3.f7167p) {
                        int i = oVar3.f7164m;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            oVar = oVar3;
                        }
                    }
                } else {
                    oVar = null;
                }
            }
            if (g5 != null) {
                if (!g5.f7162k.f7175x) {
                    AbstractC2540a.b("visitAncestors called on an unattached node");
                }
                b0.o oVar4 = g5.f7162k;
                C2731G v4 = AbstractC2749f.v(g5);
                loop11: while (true) {
                    if (v4 == null) {
                        obj2 = null;
                        break;
                    }
                    if ((v4.f21612O.f.f7165n & 8192) != 0) {
                        while (oVar4 != null) {
                            if ((oVar4.f7164m & 8192) != 0) {
                                R.e eVar = null;
                                b0.o oVar5 = oVar4;
                                while (oVar5 != null) {
                                    if (oVar5 instanceof InterfaceC2347d) {
                                        obj2 = oVar5;
                                        break loop11;
                                    }
                                    if ((oVar5.f7164m & 8192) != 0 && (oVar5 instanceof AbstractC2756m)) {
                                        b0.o oVar6 = ((AbstractC2756m) oVar5).f21839z;
                                        int i5 = 0;
                                        oVar5 = oVar5;
                                        eVar = eVar;
                                        while (oVar6 != null) {
                                            if ((oVar6.f7164m & 8192) != 0) {
                                                i5++;
                                                eVar = eVar;
                                                if (i5 == 1) {
                                                    oVar5 = oVar6;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new R.e(new b0.o[16]);
                                                    }
                                                    if (oVar5 != null) {
                                                        eVar.c(oVar5);
                                                        oVar5 = null;
                                                    }
                                                    eVar.c(oVar6);
                                                }
                                            }
                                            oVar6 = oVar6.f7167p;
                                            oVar5 = oVar5;
                                            eVar = eVar;
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                    oVar5 = AbstractC2749f.f(eVar);
                                }
                            }
                            oVar4 = oVar4.f7166o;
                        }
                    }
                    v4 = v4.u();
                    oVar4 = (v4 == null || (c0Var2 = v4.f21612O) == null) ? null : c0Var2.f21770e;
                }
                Object obj3 = (InterfaceC2347d) obj2;
                if (obj3 != null) {
                    oVar = ((b0.o) obj3).f7162k;
                    if (oVar != null) {
                        if (!oVar.f7162k.f7175x) {
                            AbstractC2540a.b("visitAncestors called on an unattached node");
                        }
                        b0.o oVar7 = oVar.f7162k.f7166o;
                        C2731G v5 = AbstractC2749f.v(oVar);
                        ArrayList arrayList = null;
                        while (v5 != null) {
                            if ((v5.f21612O.f.f7165n & 8192) != 0) {
                                while (oVar7 != null) {
                                    if ((oVar7.f7164m & 8192) != 0) {
                                        b0.o oVar8 = oVar7;
                                        R.e eVar2 = null;
                                        while (oVar8 != null) {
                                            if (oVar8 instanceof InterfaceC2347d) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(oVar8);
                                            } else if ((oVar8.f7164m & 8192) != 0 && (oVar8 instanceof AbstractC2756m)) {
                                                int i6 = 0;
                                                for (b0.o oVar9 = ((AbstractC2756m) oVar8).f21839z; oVar9 != null; oVar9 = oVar9.f7167p) {
                                                    if ((oVar9.f7164m & 8192) != 0) {
                                                        i6++;
                                                        if (i6 == 1) {
                                                            oVar8 = oVar9;
                                                        } else {
                                                            if (eVar2 == null) {
                                                                eVar2 = new R.e(new b0.o[16]);
                                                            }
                                                            if (oVar8 != null) {
                                                                eVar2.c(oVar8);
                                                                oVar8 = null;
                                                            }
                                                            eVar2.c(oVar9);
                                                        }
                                                    }
                                                }
                                                if (i6 == 1) {
                                                }
                                            }
                                            oVar8 = AbstractC2749f.f(eVar2);
                                        }
                                    }
                                    oVar7 = oVar7.f7166o;
                                }
                            }
                            v5 = v5.u();
                            oVar7 = (v5 == null || (c0Var3 = v5.f21612O) == null) ? null : c0Var3.f21770e;
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i7 = size - 1;
                                if (((InterfaceC2347d) arrayList.get(size)).l(keyEvent)) {
                                    return true;
                                }
                                if (i7 < 0) {
                                    break;
                                }
                                size = i7;
                            }
                        }
                        AbstractC2756m abstractC2756m = oVar.f7162k;
                        ?? r1 = 0;
                        while (abstractC2756m != 0) {
                            if (abstractC2756m instanceof InterfaceC2347d) {
                                if (((InterfaceC2347d) abstractC2756m).l(keyEvent)) {
                                    return true;
                                }
                            } else if ((abstractC2756m.f7164m & 8192) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                b0.o oVar10 = abstractC2756m.f21839z;
                                int i8 = 0;
                                abstractC2756m = abstractC2756m;
                                r1 = r1;
                                while (oVar10 != null) {
                                    if ((oVar10.f7164m & 8192) != 0) {
                                        i8++;
                                        r1 = r1;
                                        if (i8 == 1) {
                                            abstractC2756m = oVar10;
                                        } else {
                                            if (r1 == 0) {
                                                r1 = new R.e(new b0.o[16]);
                                            }
                                            if (abstractC2756m != 0) {
                                                r1.c(abstractC2756m);
                                                abstractC2756m = 0;
                                            }
                                            r1.c(oVar10);
                                        }
                                    }
                                    oVar10 = oVar10.f7167p;
                                    abstractC2756m = abstractC2756m;
                                    r1 = r1;
                                }
                                if (i8 == 1) {
                                }
                            }
                            abstractC2756m = AbstractC2749f.f(r1);
                        }
                        if (((Boolean) interfaceC2015a.invoke()).booleanValue()) {
                            return true;
                        }
                        AbstractC2756m abstractC2756m2 = oVar.f7162k;
                        ?? r02 = 0;
                        while (abstractC2756m2 != 0) {
                            if (abstractC2756m2 instanceof InterfaceC2347d) {
                                if (((InterfaceC2347d) abstractC2756m2).O(keyEvent)) {
                                    return true;
                                }
                            } else if ((abstractC2756m2.f7164m & 8192) != 0 && (abstractC2756m2 instanceof AbstractC2756m)) {
                                b0.o oVar11 = abstractC2756m2.f21839z;
                                int i9 = 0;
                                r02 = r02;
                                abstractC2756m2 = abstractC2756m2;
                                while (oVar11 != null) {
                                    if ((oVar11.f7164m & 8192) != 0) {
                                        i9++;
                                        r02 = r02;
                                        if (i9 == 1) {
                                            abstractC2756m2 = oVar11;
                                        } else {
                                            if (r02 == 0) {
                                                r02 = new R.e(new b0.o[16]);
                                            }
                                            if (abstractC2756m2 != 0) {
                                                r02.c(abstractC2756m2);
                                                abstractC2756m2 = 0;
                                            }
                                            r02.c(oVar11);
                                        }
                                    }
                                    oVar11 = oVar11.f7167p;
                                    r02 = r02;
                                    abstractC2756m2 = abstractC2756m2;
                                }
                                if (i9 == 1) {
                                }
                            }
                            abstractC2756m2 = AbstractC2749f.f(r02);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                if (((InterfaceC2347d) arrayList.get(i10)).O(keyEvent)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!sVar.f7162k.f7175x) {
                AbstractC2540a.b("visitAncestors called on an unattached node");
            }
            b0.o oVar12 = sVar.f7162k.f7166o;
            C2731G v6 = AbstractC2749f.v(sVar);
            loop15: while (true) {
                if (v6 == null) {
                    obj = null;
                    break;
                }
                if ((v6.f21612O.f.f7165n & 8192) != 0) {
                    while (oVar12 != null) {
                        if ((oVar12.f7164m & 8192) != 0) {
                            b0.o oVar13 = oVar12;
                            R.e eVar3 = null;
                            while (oVar13 != null) {
                                if (oVar13 instanceof InterfaceC2347d) {
                                    obj = oVar13;
                                    break loop15;
                                }
                                if ((oVar13.f7164m & 8192) != 0 && (oVar13 instanceof AbstractC2756m)) {
                                    b0.o oVar14 = ((AbstractC2756m) oVar13).f21839z;
                                    int i11 = 0;
                                    oVar13 = oVar13;
                                    eVar3 = eVar3;
                                    while (oVar14 != null) {
                                        if ((oVar14.f7164m & 8192) != 0) {
                                            i11++;
                                            eVar3 = eVar3;
                                            if (i11 == 1) {
                                                oVar13 = oVar14;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new R.e(new b0.o[16]);
                                                }
                                                if (oVar13 != null) {
                                                    eVar3.c(oVar13);
                                                    oVar13 = null;
                                                }
                                                eVar3.c(oVar14);
                                            }
                                        }
                                        oVar14 = oVar14.f7167p;
                                        oVar13 = oVar13;
                                        eVar3 = eVar3;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                oVar13 = AbstractC2749f.f(eVar3);
                            }
                        }
                        oVar12 = oVar12.f7166o;
                    }
                }
                v6 = v6.u();
                oVar12 = (v6 == null || (c0Var = v6.f21612O) == null) ? null : c0Var.f21770e;
            }
            Object obj4 = (InterfaceC2347d) obj;
            oVar = obj4 != null ? ((b0.o) obj4).f7162k : null;
            if (oVar != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [i4.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r15v8, types: [i4.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [z0.x0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r5v11, types: [g0.s] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [R.e] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [R.e] */
    public final Boolean e(int i, C1989c c1989c, i4.c cVar) {
        Boolean bool;
        boolean a5;
        Boolean bool2;
        c0 c0Var;
        o oVar;
        o oVar2;
        s sVar = this.f17031c;
        s g5 = AbstractC1961f.g(sVar);
        F f = this.f17030b;
        int i5 = 4;
        if (g5 != null) {
            W0.m layoutDirection = f.getLayoutDirection();
            bool = null;
            m z02 = g5.z0();
            if (i == 1) {
                oVar = z02.f17041b;
            } else if (i == 2) {
                oVar = z02.f17042c;
            } else if (i == 5) {
                oVar = z02.f17043d;
            } else if (i == 6) {
                oVar = z02.f17044e;
            } else if (i == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal == 0) {
                    oVar2 = z02.f17046h;
                } else {
                    if (ordinal != 1) {
                        throw new D2.e();
                    }
                    oVar2 = z02.i;
                }
                if (oVar2 == o.f17049b) {
                    oVar2 = null;
                }
                if (oVar2 == null) {
                    oVar = z02.f;
                }
                oVar = oVar2;
            } else if (i == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    oVar2 = z02.i;
                } else {
                    if (ordinal2 != 1) {
                        throw new D2.e();
                    }
                    oVar2 = z02.f17046h;
                }
                if (oVar2 == o.f17049b) {
                    oVar2 = null;
                }
                if (oVar2 == null) {
                    oVar = z02.f17045g;
                }
                oVar = oVar2;
            } else {
                if (i != 7 && i != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                C1956a c1956a = new C1956a(i);
                C1965j c1965j = (C1965j) ((F) AbstractC2749f.w(g5)).getFocusOwner();
                s sVar2 = c1965j.f17035h;
                if (i == 7) {
                    z02.f17047j.c(c1956a);
                } else {
                    z02.f17048k.c(c1956a);
                }
                oVar = c1956a.f17014b ? o.f17050c : sVar2 != c1965j.f17035h ? o.f17051d : o.f17049b;
            }
            if (!kotlin.jvm.internal.l.a(oVar, o.f17050c)) {
                if (kotlin.jvm.internal.l.a(oVar, o.f17051d)) {
                    s g6 = AbstractC1961f.g(sVar);
                    if (g6 != null) {
                        return (Boolean) cVar.c(g6);
                    }
                } else if (!kotlin.jvm.internal.l.a(oVar, o.f17049b)) {
                    return Boolean.valueOf(oVar.a(cVar));
                }
            }
            return bool;
        }
        bool = null;
        g5 = null;
        W0.m layoutDirection2 = f.getLayoutDirection();
        A.s sVar3 = new A.s(g5, this, cVar);
        if (i == 1 || i == 2) {
            if (i == 1) {
                a5 = AbstractC1961f.k(sVar, sVar3);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                a5 = AbstractC1961f.a(sVar, sVar3);
            }
            return Boolean.valueOf(a5);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return AbstractC1961f.E(i, sVar3, sVar, c1989c);
        }
        if (i == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    throw new D2.e();
                }
                i5 = 3;
            }
            s g7 = AbstractC1961f.g(sVar);
            if (g7 != null) {
                return AbstractC1961f.E(i5, sVar3, g7, c1989c);
            }
            return bool;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C1959d.a(i))).toString());
        }
        s g8 = AbstractC1961f.g(sVar);
        boolean z3 = false;
        if (g8 != null) {
            if (!g8.f7162k.f7175x) {
                AbstractC2540a.b("visitAncestors called on an unattached node");
            }
            ?? r32 = g8.f7162k.f7166o;
            C2731G v4 = AbstractC2749f.v(g8);
            loop0: while (v4 != null) {
                if ((v4.f21612O.f.f7165n & 1024) != 0) {
                    for (b0.o oVar3 = r32; oVar3 != null; oVar3 = oVar3.f7166o) {
                        if ((oVar3.f7164m & 1024) != 0) {
                            AbstractC2756m abstractC2756m = oVar3;
                            ?? r6 = bool;
                            while (abstractC2756m != 0) {
                                if (abstractC2756m instanceof s) {
                                    ?? r5 = (s) abstractC2756m;
                                    if (r5.z0().f17040a) {
                                        bool2 = r5;
                                        break loop0;
                                    }
                                } else if ((abstractC2756m.f7164m & 1024) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                    b0.o oVar4 = abstractC2756m.f21839z;
                                    int i6 = 0;
                                    abstractC2756m = abstractC2756m;
                                    r6 = r6;
                                    while (oVar4 != null) {
                                        if ((oVar4.f7164m & 1024) != 0) {
                                            i6++;
                                            r6 = r6;
                                            if (i6 == 1) {
                                                abstractC2756m = oVar4;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new R.e(new b0.o[16]);
                                                }
                                                if (abstractC2756m != 0) {
                                                    r6.c(abstractC2756m);
                                                    abstractC2756m = bool;
                                                }
                                                r6.c(oVar4);
                                            }
                                        }
                                        oVar4 = oVar4.f7167p;
                                        abstractC2756m = abstractC2756m;
                                        r6 = r6;
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                abstractC2756m = AbstractC2749f.f(r6);
                            }
                        }
                    }
                }
                v4 = v4.u();
                r32 = (v4 == null || (c0Var = v4.f21612O) == null) ? bool : c0Var.f21770e;
            }
        }
        bool2 = bool;
        if (bool2 != null && !bool2.equals(sVar)) {
            z3 = ((Boolean) sVar3.c(bool2)).booleanValue();
        }
        return Boolean.valueOf(z3);
    }

    public final boolean f(int i) {
        boolean z3;
        View a5;
        w wVar = new w();
        wVar.f17624k = Boolean.FALSE;
        s sVar = this.f17035h;
        F f = this.f17029a;
        Boolean e3 = e(i, f.getEmbeddedViewFocusRect(), new x(i, 2, wVar));
        if (!kotlin.jvm.internal.l.a(e3, Boolean.TRUE) || sVar == this.f17035h) {
            if (e3 != null && wVar.f17624k != null) {
                if (!e3.booleanValue() || !((Boolean) wVar.f17624k).booleanValue()) {
                    if (i != 1 && i != 2) {
                        if (i != 7 && i != 8) {
                            Integer C5 = AbstractC1961f.C(i);
                            if (C5 == null) {
                                throw new IllegalStateException("Invalid focus direction");
                            }
                            int intValue = C5.intValue();
                            C1989c embeddedViewFocusRect = f.getEmbeddedViewFocusRect();
                            Rect s2 = embeddedViewFocusRect != null ? i0.F.s(embeddedViewFocusRect) : null;
                            Object obj = R0.f.get();
                            kotlin.jvm.internal.l.c(obj);
                            R0 r02 = (R0) obj;
                            if (s2 == null) {
                                a5 = r02.b(intValue, f.findFocus(), f);
                            } else {
                                r02.f381a.set(s2);
                                Rect rect = r02.f381a;
                                ArrayList<View> arrayList = r02.f385e;
                                try {
                                    arrayList.clear();
                                    if (Build.VERSION.SDK_INT < 26) {
                                        A0.Z.m(f, arrayList, f.isInTouchMode());
                                    } else {
                                        f.addFocusables(arrayList, intValue, f.isInTouchMode() ? 1 : 0);
                                    }
                                    a5 = arrayList.isEmpty() ? null : r02.a(intValue, rect, null, f, arrayList);
                                    arrayList.clear();
                                } catch (Throwable th) {
                                    arrayList.clear();
                                    throw th;
                                }
                            }
                            if (a5 != null) {
                                z3 = AbstractC1961f.y(a5, Integer.valueOf(intValue), s2);
                                if (!z3) {
                                }
                            }
                        }
                        z3 = false;
                        if (!z3) {
                        }
                    } else if (b(i, false, false)) {
                        Boolean e5 = e(i, null, new A(i, 2));
                        if (e5 != null ? e5.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void g(s sVar) {
        C2731G v4;
        H0.j w5;
        C2731G v5;
        H0.j w6;
        s sVar2 = this.f17035h;
        this.f17035h = sVar;
        C2316B c2316b = this.f17034g;
        Object[] objArr = c2316b.f18904a;
        int i = c2316b.f18905b;
        for (int i5 = 0; i5 < i; i5++) {
            C0533b c0533b = (C0533b) objArr[i5];
            c0533b.getClass();
            if (sVar2 != null && (v5 = AbstractC2749f.v(sVar2)) != null && (w6 = v5.w()) != null) {
                if (w6.f2103k.b(H0.i.f2084g)) {
                    ((AutofillManager) c0533b.f7378a.f16910l).notifyViewExited(c0533b.f7380c, v5.f21625l);
                }
            }
            if (sVar != null && (v4 = AbstractC2749f.v(sVar)) != null && (w5 = v4.w()) != null) {
                if (w5.f2103k.b(H0.i.f2084g)) {
                    int i6 = v4.f21625l;
                    c0533b.f7381d.f2552a.j(i6, new C0532a(c0533b, i6));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        r34 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r4.f19068e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        if (((r4.f19064a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        r3 = r4.f19066c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (r3 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:
    
        if (java.lang.Long.compare((r4.f19067d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
    
        r3 = r4.f19064a;
        r5 = r4.f19066c;
        r7 = r4.f19065b;
        r8 = (r5 + 7) >> 3;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00eb, code lost:
    
        if (r9 >= r8) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
    
        r13 = r3[r9] & (-9187201950435737472L);
        r3[r9] = ((~r13) + (r13 >>> 7)) & (-72340172838076674L);
        r9 = r9 + 1;
        r7 = r7;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0106, code lost:
    
        r15 = r7;
        r7 = X3.l.F0(r3);
        r8 = r7 - 1;
        r3[r8] = (r3[r8] & 72057594037927935L) | (-72057594037927936L);
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0122, code lost:
    
        if (r7 == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0124, code lost:
    
        r8 = r7 >> 3;
        r9 = (r7 & 7) << 3;
        r13 = (r3[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0131, code lost:
    
        if (r13 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0138, code lost:
    
        if (r13 == 254) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013b, code lost:
    
        r13 = r15[r7];
        r13 = ((int) (r13 ^ (r13 >>> 32))) * (-862048943);
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r22 = r4.b(r14);
        r14 = r14 & r5;
        r35 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015b, code lost:
    
        if ((((r22 - r14) & r5) / 8) != (((r7 - r14) & r5) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015d, code lost:
    
        r3[r8] = (r3[r8] & (~(255 << r9))) | ((r13 & 127) << r9);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017b, code lost:
    
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017e, code lost:
    
        r14 = r7;
        r7 = r22 >> 3;
        r36 = r3[r7];
        r8 = (r22 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018f, code lost:
    
        if (((r36 >> r8) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0191, code lost:
    
        r3[r7] = (r36 & (~(255 << r8))) | ((r13 & 127) << r8);
        r3[r8] = (r3[r8] & (~(255 << r9))) | (128 << r9);
        r15[r22] = r15[r14];
        r15[r14] = 0;
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d0, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b5, code lost:
    
        r3[r7] = ((r13 & 127) << r8) | (r36 & (~(255 << r8)));
        r7 = r15[r22];
        r15[r22] = r15[r14];
        r15[r14] = r7;
        r7 = r14 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0133, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01de, code lost:
    
        r4.f19068e = r.O.a(r4.f19066c) - r4.f19067d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0260, code lost:
    
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0264, code lost:
    
        r15 = r3;
        r4.f19067d++;
        r3 = r4.f19068e;
        r5 = r4.f19064a;
        r6 = r15 >> 3;
        r7 = r5[r6];
        r9 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027d, code lost:
    
        if (((r7 >> r9) & 255) != r20) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x027f, code lost:
    
        r25 = r34 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0281, code lost:
    
        r4.f19068e = r3 - r25;
        r3 = r4.f19066c;
        r7 = (r7 & (~(255 << r9))) | (r10 << r9);
        r5[r6] = r7;
        r5[(((r15 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ed, code lost:
    
        r3 = r.O.b(r4.f19066c);
        r5 = r4.f19064a;
        r7 = r4.f19065b;
        r8 = r4.f19066c;
        r4.c(r3);
        r3 = r4.f19064a;
        r9 = r4.f19065b;
        r12 = r4.f19066c;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0204, code lost:
    
        if (r13 >= r8) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0214, code lost:
    
        if (((r5[r13 >> 3] >> ((r13 & 7) << 3)) & 255) >= r20) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0216, code lost:
    
        r14 = r7[r13];
        r18 = r7;
        r19 = r8;
        r7 = ((int) (r14 ^ (r14 >>> 32))) * (-862048943);
        r8 = r4.b((r7 ^ (r7 << 16)) >>> 7);
        r17 = r8 >> 3;
        r22 = (r8 & 7) << 3;
        r7 = (r3[r17] & (~(255 << r22))) | ((r7 & 127) << r22);
        r3[r17] = r7;
        r3[(((r8 - 7) & r12) + (r12 & 7)) >> 3] = r7;
        r9[r8] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0259, code lost:
    
        r13 = r13 + 1;
        r7 = r18;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0255, code lost:
    
        r18 = r7;
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01eb, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bd, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x031f, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0321, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(KeyEvent keyEvent) {
        int i;
        boolean z3;
        int i5;
        long q5 = AbstractC2346c.q(keyEvent);
        int t5 = AbstractC2346c.t(keyEvent);
        int i6 = 1;
        char c5 = '\b';
        int i7 = 0;
        if (t5 == 2) {
            z zVar = this.f;
            if (zVar == null) {
                zVar = new z(3);
                this.f = zVar;
            }
            z zVar2 = zVar;
            int i8 = ((int) (q5 ^ (q5 >>> 32))) * (-862048943);
            int i9 = i8 ^ (i8 << 16);
            int i10 = i9 >>> 7;
            int i11 = i9 & 127;
            int i12 = zVar2.f19066c;
            int i13 = i10 & i12;
            int i14 = 0;
            loop0: while (true) {
                long[] jArr = zVar2.f19064a;
                int i15 = i13 >> 3;
                int i16 = (i13 & 7) << 3;
                long j5 = (jArr[i15] >>> i16) | ((jArr[i15 + i6] << (64 - i16)) & ((-i16) >> 63));
                long j6 = i11;
                long j7 = j5 ^ (j6 * 72340172838076673L);
                long j8 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
                while (true) {
                    if (j8 == 0) {
                        break;
                    }
                    i5 = (i13 + (Long.numberOfTrailingZeros(j8) >> 3)) & i12;
                    z3 = i6;
                    if (zVar2.f19065b[i5] == q5) {
                        break loop0;
                    }
                    j8 &= j8 - 1;
                    i6 = z3 ? 1 : 0;
                }
                i14 += 8;
                i13 = (i13 + i14) & i12;
                i6 = z3 ? 1 : 0;
            }
            zVar2.f19065b[i5] = q5;
            return z3;
        }
        if (t5 != 1) {
            return true;
        }
        z zVar3 = this.f;
        if (zVar3 == null || !zVar3.a(q5)) {
            return false;
        }
        z zVar4 = this.f;
        if (zVar4 != null) {
            int i17 = ((int) ((q5 >>> 32) ^ q5)) * (-862048943);
            int i18 = i17 ^ (i17 << 16);
            int i19 = i18 & 127;
            int i20 = zVar4.f19066c;
            int i21 = i18 >>> 7;
            loop5: while (true) {
                int i22 = i21 & i20;
                long[] jArr2 = zVar4.f19064a;
                int i23 = i22 >> 3;
                int i24 = (i22 & 7) << 3;
                long j9 = ((jArr2[i23 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr2[i23] >>> i24);
                long j10 = (i19 * 72340172838076673L) ^ j9;
                long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j11 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j11) >> 3) + i22) & i20;
                    if (zVar4.f19065b[i] == q5) {
                        break loop5;
                    }
                    j11 &= j11 - 1;
                }
                i7 += 8;
                i21 = i22 + i7;
            }
            if (i >= 0) {
                zVar4.f19067d--;
                long[] jArr3 = zVar4.f19064a;
                int i25 = zVar4.f19066c;
                int i26 = i >> 3;
                int i27 = (i & 7) << 3;
                long j12 = (jArr3[i26] & (~(255 << i27))) | (254 << i27);
                jArr3[i26] = j12;
                jArr3[(((i - 7) & i25) + (i25 & 7)) >> 3] = j12;
                return true;
            }
        }
        return true;
    }
}
