package p000;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: em */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0179em extends C0143dm {

    /* JADX INFO: renamed from: A0 */
    public C0579pf[] f2121A0;

    /* JADX INFO: renamed from: B0 */
    public C0579pf[] f2122B0;

    /* JADX INFO: renamed from: C0 */
    public int f2123C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f2124D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f2125E0;

    /* JADX INFO: renamed from: F0 */
    public WeakReference f2126F0;

    /* JADX INFO: renamed from: G0 */
    public WeakReference f2127G0;

    /* JADX INFO: renamed from: H0 */
    public WeakReference f2128H0;

    /* JADX INFO: renamed from: I0 */
    public WeakReference f2129I0;

    /* JADX INFO: renamed from: J0 */
    public HashSet f2130J0;

    /* JADX INFO: renamed from: K0 */
    public C0834wb f2131K0;

    /* JADX INFO: renamed from: p0 */
    public ArrayList f2132p0;

    /* JADX INFO: renamed from: q0 */
    public qd0 f2133q0;

    /* JADX INFO: renamed from: r0 */
    public C0592ps f2134r0;

    /* JADX INFO: renamed from: s0 */
    public int f2135s0;

    /* JADX INFO: renamed from: t0 */
    public C0770ul f2136t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f2137u0;

    /* JADX INFO: renamed from: v0 */
    public gi0 f2138v0;

    /* JADX INFO: renamed from: w0 */
    public int f2139w0;

    /* JADX INFO: renamed from: x0 */
    public int f2140x0;

    /* JADX INFO: renamed from: y0 */
    public int f2141y0;

    /* JADX INFO: renamed from: z0 */
    public int f2142z0;

    /* JADX INFO: renamed from: R */
    public static void m1458R(C0143dm c0143dm, C0770ul c0770ul, C0834wb c0834wb) {
        int i;
        int i2;
        if (c0770ul == null) {
            return;
        }
        int i3 = c0143dm.f1718f0;
        int[] iArr = c0143dm.f1741t;
        if (i3 == 8 || (c0143dm instanceof ea0) || (c0143dm instanceof C0205fb)) {
            c0834wb.f8498e = 0;
            c0834wb.f8499f = 0;
            return;
        }
        int[] iArr2 = c0143dm.f1736o0;
        c0834wb.f8494a = iArr2[0];
        c0834wb.f8495b = iArr2[1];
        c0834wb.f8496c = c0143dm.m1260o();
        c0834wb.f8497d = c0143dm.m1256i();
        c0834wb.f8502i = false;
        c0834wb.f8503j = 0;
        boolean z = c0834wb.f8494a == 3;
        boolean z2 = c0834wb.f8495b == 3;
        boolean z3 = z && c0143dm.f1702V > 0.0f;
        boolean z4 = z2 && c0143dm.f1702V > 0.0f;
        if (z && c0143dm.m1263r(0) && c0143dm.f1739r == 0 && !z3) {
            c0834wb.f8494a = 2;
            if (z2 && c0143dm.f1740s == 0) {
                c0834wb.f8494a = 1;
            }
            z = false;
        }
        if (z2 && c0143dm.m1263r(1) && c0143dm.f1740s == 0 && !z4) {
            c0834wb.f8495b = 2;
            if (z && c0143dm.f1739r == 0) {
                c0834wb.f8495b = 1;
            }
            z2 = false;
        }
        if (c0143dm.mo1270y()) {
            c0834wb.f8494a = 1;
            z = false;
        }
        if (c0143dm.mo1271z()) {
            c0834wb.f8495b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                c0834wb.f8494a = 1;
            } else if (!z2) {
                if (c0834wb.f8495b == 1) {
                    i2 = c0834wb.f8497d;
                } else {
                    c0834wb.f8494a = 2;
                    c0770ul.m4934b(c0143dm, c0834wb);
                    i2 = c0834wb.f8499f;
                }
                c0834wb.f8494a = 1;
                c0834wb.f8496c = (int) (c0143dm.f1702V * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                c0834wb.f8495b = 1;
            } else if (!z) {
                if (c0834wb.f8494a == 1) {
                    i = c0834wb.f8496c;
                } else {
                    c0834wb.f8495b = 2;
                    c0770ul.m4934b(c0143dm, c0834wb);
                    i = c0834wb.f8498e;
                }
                c0834wb.f8495b = 1;
                int i4 = c0143dm.f1703W;
                float f = c0143dm.f1702V;
                if (i4 == -1) {
                    c0834wb.f8497d = (int) (i / f);
                } else {
                    c0834wb.f8497d = (int) (f * i);
                }
            }
        }
        c0770ul.m4934b(c0143dm, c0834wb);
        c0143dm.m1245K(c0834wb.f8498e);
        c0143dm.m1242H(c0834wb.f8499f);
        c0143dm.f1685E = c0834wb.f8501h;
        int i5 = c0834wb.f8500g;
        c0143dm.f1706Z = i5;
        c0143dm.f1685E = i5 > 0;
        c0834wb.f8503j = 0;
    }

    @Override // p000.C0143dm
    /* JADX INFO: renamed from: A */
    public final void mo1237A() {
        this.f2138v0.m2098t();
        this.f2139w0 = 0;
        this.f2140x0 = 0;
        this.f2132p0.clear();
        super.mo1237A();
    }

    @Override // p000.C0143dm
    /* JADX INFO: renamed from: C */
    public final void mo1239C(qd0 qd0Var) {
        super.mo1239C(qd0Var);
        int size = this.f2132p0.size();
        for (int i = 0; i < size; i++) {
            ((C0143dm) this.f2132p0.get(i)).mo1239C(qd0Var);
        }
    }

    @Override // p000.C0143dm
    /* JADX INFO: renamed from: L */
    public final void mo1246L(boolean z, boolean z2) {
        super.mo1246L(z, z2);
        int size = this.f2132p0.size();
        for (int i = 0; i < size; i++) {
            ((C0143dm) this.f2132p0.get(i)).mo1246L(z, z2);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m1459N(C0143dm c0143dm, int i) {
        if (i == 0) {
            int i2 = this.f2141y0 + 1;
            C0579pf[] c0579pfArr = this.f2122B0;
            if (i2 >= c0579pfArr.length) {
                this.f2122B0 = (C0579pf[]) Arrays.copyOf(c0579pfArr, c0579pfArr.length * 2);
            }
            C0579pf[] c0579pfArr2 = this.f2122B0;
            int i3 = this.f2141y0;
            c0579pfArr2[i3] = new C0579pf(c0143dm, 0, this.f2137u0);
            this.f2141y0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f2142z0 + 1;
            C0579pf[] c0579pfArr3 = this.f2121A0;
            if (i4 >= c0579pfArr3.length) {
                this.f2121A0 = (C0579pf[]) Arrays.copyOf(c0579pfArr3, c0579pfArr3.length * 2);
            }
            C0579pf[] c0579pfArr4 = this.f2121A0;
            int i5 = this.f2142z0;
            c0579pfArr4[i5] = new C0579pf(c0143dm, 1, this.f2137u0);
            this.f2142z0 = i5 + 1;
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m1460O(gi0 gi0Var) {
        C0179em c0179em;
        gi0 gi0Var2;
        HashSet hashSet = this.f2130J0;
        boolean zM1463S = m1463S(64);
        mo1249b(gi0Var, zM1463S);
        int size = this.f2132p0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C0143dm c0143dm = (C0143dm) this.f2132p0.get(i);
            boolean[] zArr = c0143dm.f1698R;
            zArr[0] = false;
            zArr[1] = false;
            if (c0143dm instanceof C0205fb) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C0143dm c0143dm2 = (C0143dm) this.f2132p0.get(i2);
                if (c0143dm2 instanceof C0205fb) {
                    C0205fb c0205fb = (C0205fb) c0143dm2;
                    for (int i3 = 0; i3 < c0205fb.f2367q0; i3++) {
                        C0143dm c0143dm3 = c0205fb.f2366p0[i3];
                        if (c0205fb.f2369s0 || c0143dm3.mo1250c()) {
                            int i4 = c0205fb.f2368r0;
                            if (i4 == 0 || i4 == 1) {
                                c0143dm3.f1698R[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c0143dm3.f1698R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C0143dm c0143dm4 = (C0143dm) this.f2132p0.get(i5);
            c0143dm4.getClass();
            if (c0143dm4 instanceof ea0) {
                c0143dm4.mo1249b(gi0Var, zM1463S);
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            if (it.hasNext()) {
                ((C0143dm) it.next()).getClass();
                dd0.m1158c();
                return;
            } else if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C0143dm) it2.next()).mo1249b(gi0Var, zM1463S);
                }
                hashSet.clear();
            }
        }
        if (gi0.f2742q) {
            HashSet<C0143dm> hashSet2 = new HashSet();
            for (int i6 = 0; i6 < size; i6++) {
                C0143dm c0143dm5 = (C0143dm) this.f2132p0.get(i6);
                c0143dm5.getClass();
                if (!(c0143dm5 instanceof ea0)) {
                    hashSet2.add(c0143dm5);
                }
            }
            c0179em = this;
            gi0Var2 = gi0Var;
            c0179em.m1248a(this, gi0Var2, hashSet2, this.f1736o0[0] == 2 ? 0 : 1, false);
            for (C0143dm c0143dm6 : hashSet2) {
                a90.m125i(c0179em, gi0Var2, c0143dm6);
                c0143dm6.mo1249b(gi0Var2, zM1463S);
            }
        } else {
            c0179em = this;
            gi0Var2 = gi0Var;
            for (int i7 = 0; i7 < size; i7++) {
                C0143dm c0143dm7 = (C0143dm) c0179em.f2132p0.get(i7);
                if (c0143dm7 instanceof C0179em) {
                    int[] iArr = c0143dm7.f1736o0;
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    if (i8 == 2) {
                        c0143dm7.m1243I(1);
                    }
                    if (i9 == 2) {
                        c0143dm7.m1244J(1);
                    }
                    c0143dm7.mo1249b(gi0Var2, zM1463S);
                    if (i8 == 2) {
                        c0143dm7.m1243I(i8);
                    }
                    if (i9 == 2) {
                        c0143dm7.m1244J(i9);
                    }
                } else {
                    a90.m125i(c0179em, gi0Var2, c0143dm7);
                    if (!(c0143dm7 instanceof ea0)) {
                        c0143dm7.mo1249b(gi0Var2, zM1463S);
                    }
                }
            }
        }
        if (c0179em.f2141y0 > 0) {
            a90.m117a(c0179em, gi0Var2, null, 0);
        }
        if (c0179em.f2142z0 > 0) {
            a90.m117a(c0179em, gi0Var2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX INFO: renamed from: P */
    public final boolean m1461P(int i, boolean z) {
        boolean z2;
        C0592ps c0592ps = this.f2134r0;
        ArrayList arrayList = c0592ps.f6239e;
        C0179em c0179em = c0592ps.f6235a;
        boolean z3 = false;
        int iM1255h = c0179em.m1255h(0);
        int iM1255h2 = c0179em.m1255h(1);
        int iM1261p = c0179em.m1261p();
        int iM1262q = c0179em.m1262q();
        if (z && (iM1255h == 2 || iM1255h2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                bj1 bj1Var = (bj1) obj;
                if (bj1Var.f894f == i && !bj1Var.mo713k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iM1255h == 2) {
                    c0179em.m1243I(1);
                    c0179em.m1245K(c0592ps.m3979d(c0179em, 0));
                    c0179em.f1713d.f893e.mo759d(c0179em.m1260o());
                }
            } else if (z && iM1255h2 == 2) {
                c0179em.m1244J(1);
                c0179em.m1242H(c0592ps.m3979d(c0179em, 1));
                c0179em.f1715e.f893e.mo759d(c0179em.m1256i());
            }
        }
        int[] iArr = c0179em.f1736o0;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int iM1260o = c0179em.m1260o() + iM1261p;
                c0179em.f1713d.f897i.mo759d(iM1260o);
                c0179em.f1713d.f893e.mo759d(iM1260o - iM1261p);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int iM1256i = c0179em.m1256i() + iM1262q;
                c0179em.f1715e.f897i.mo759d(iM1256i);
                c0179em.f1715e.f893e.mo759d(iM1256i - iM1262q);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        c0592ps.m3982g();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            bj1 bj1Var2 = (bj1) obj2;
            if (bj1Var2.f894f == i && (bj1Var2.f890b != c0179em || bj1Var2.f895g)) {
                bj1Var2.mo709e();
            }
        }
        int size3 = arrayList.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList.get(i6);
            i6++;
            bj1 bj1Var3 = (bj1) obj3;
            if (bj1Var3.f894f == i && (z2 || bj1Var3.f890b != c0179em)) {
                if (!bj1Var3.f896h.f6581j || !bj1Var3.f897i.f6581j || (!(bj1Var3 instanceof C0616qf) && !bj1Var3.f893e.f6581j)) {
                    c0179em.m1243I(iM1255h);
                    c0179em.m1244J(iM1255h2);
                    return z3;
                }
            }
        }
        z3 = true;
        c0179em.m1243I(iM1255h);
        c0179em.m1244J(iM1255h2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:332:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:334:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:342:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:343:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:349:0x0608  */
    /* JADX WARN: Code duplicated, block: B:355:0x0621  */
    /* JADX WARN: Code duplicated, block: B:358:0x0627  */
    /* JADX WARN: Code duplicated, block: B:360:0x062f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:362:0x0638  */
    /* JADX WARN: Code duplicated, block: B:363:0x063d  */
    /* JADX WARN: Code duplicated, block: B:368:0x064b  */
    /* JADX WARN: Code duplicated, block: B:372:0x0656  */
    /* JADX WARN: Code duplicated, block: B:375:0x0661 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:377:0x0667  */
    /* JADX WARN: Code duplicated, block: B:380:0x066f  */
    /* JADX WARN: Code duplicated, block: B:384:0x0676  */
    /* JADX WARN: Code duplicated, block: B:387:0x0680  */
    /* JADX WARN: Code duplicated, block: B:389:0x068c  */
    /* JADX WARN: Code duplicated, block: B:393:0x069d  */
    /* JADX WARN: Code duplicated, block: B:396:0x06af A[Catch: Exception -> 0x06bd, LOOP:12: B:395:0x06ad->B:396:0x06af, LOOP_END, TryCatch #3 {Exception -> 0x06bd, blocks: (B:394:0x06a1, B:396:0x06af, B:399:0x06c6), top: B:529:0x06a1 }] */
    /* JADX WARN: Code duplicated, block: B:404:0x06d3 A[Catch: Exception -> 0x06fc, TRY_LEAVE, TryCatch #4 {Exception -> 0x06fc, blocks: (B:402:0x06cd, B:404:0x06d3), top: B:531:0x06cd }] */
    /* JADX WARN: Code duplicated, block: B:420:0x0700  */
    /* JADX WARN: Code duplicated, block: B:423:0x0708 A[Catch: Exception -> 0x06f0, TryCatch #0 {Exception -> 0x06f0, blocks: (B:409:0x06e9, B:421:0x0704, B:423:0x0708, B:425:0x070e, B:426:0x0728, B:428:0x072c, B:430:0x0732, B:434:0x0748, B:437:0x0753, B:439:0x0757, B:441:0x075d), top: B:523:0x06e9 }] */
    /* JADX WARN: Code duplicated, block: B:428:0x072c A[Catch: Exception -> 0x06f0, TryCatch #0 {Exception -> 0x06f0, blocks: (B:409:0x06e9, B:421:0x0704, B:423:0x0708, B:425:0x070e, B:426:0x0728, B:428:0x072c, B:430:0x0732, B:434:0x0748, B:437:0x0753, B:439:0x0757, B:441:0x075d), top: B:523:0x06e9 }] */
    /* JADX WARN: Code duplicated, block: B:439:0x0757 A[Catch: Exception -> 0x06f0, TryCatch #0 {Exception -> 0x06f0, blocks: (B:409:0x06e9, B:421:0x0704, B:423:0x0708, B:425:0x070e, B:426:0x0728, B:428:0x072c, B:430:0x0732, B:434:0x0748, B:437:0x0753, B:439:0x0757, B:441:0x075d), top: B:523:0x06e9 }] */
    /* JADX WARN: Code duplicated, block: B:453:0x0782  */
    /* JADX WARN: Code duplicated, block: B:460:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:462:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:464:0x07da  */
    /* JADX WARN: Code duplicated, block: B:466:0x07de  */
    /* JADX WARN: Code duplicated, block: B:469:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:471:0x07f1 A[LOOP:15: B:470:0x07ef->B:471:0x07f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:475:0x0804 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:480:0x0811 A[LOOP:14: B:479:0x080f->B:480:0x0811, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:483:0x0846  */
    /* JADX WARN: Code duplicated, block: B:487:0x0858  */
    /* JADX WARN: Code duplicated, block: B:492:0x0878  */
    /* JADX WARN: Code duplicated, block: B:493:0x0884  */
    /* JADX WARN: Code duplicated, block: B:496:0x0897  */
    /* JADX WARN: Code duplicated, block: B:497:0x089f  */
    /* JADX WARN: Code duplicated, block: B:499:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:501:0x08aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:504:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:507:0x08c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:513:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:515:0x08da  */
    /* JADX WARN: Code duplicated, block: B:516:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:520:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:531:0x06cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x0691 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0131  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r32v0, types: [dm, em] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean] */
    /* JADX INFO: renamed from: Q */
    public final void m1462Q() {
        C0585pl c0585pl;
        int i;
        int i2;
        int i3;
        int i4;
        C0585pl c0585pl2;
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        int i5;
        int i6;
        boolean zM1463S;
        ?? r12;
        int i7;
        boolean z4;
        boolean z5;
        int i8;
        C0585pl c0585pl3;
        boolean z6;
        boolean z7;
        int i9;
        boolean z8;
        int iMax;
        ?? r7;
        ?? r17;
        boolean z9;
        int iMax2;
        ?? r0;
        boolean z10;
        boolean z11;
        ?? r1;
        boolean z12;
        ?? r2;
        boolean z13;
        boolean z14;
        ?? r3;
        ?? r4;
        int i10;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zM1463S2;
        int size;
        int i11;
        boolean z15;
        C0143dm c0143dm;
        boolean z16;
        int i12;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C0585pl c0585pl4;
        C0143dm c0143dm2;
        int i13;
        int i14;
        int i15;
        int i16;
        char c2;
        aj1 aj1Var;
        aj1 aj1Var2;
        int i17;
        int iM1260o;
        int size2;
        int i18;
        int i19;
        aj1 aj1Var3;
        int iM262b;
        int iM262b2;
        aj1 aj1Var4;
        aj1 aj1Var5;
        int i20;
        C0585pl c0585pl5;
        boolean[] zArr = a90.f79b;
        gi0 gi0Var = this.f2138v0;
        this.f1704X = 0;
        this.f1705Y = 0;
        this.f2124D0 = false;
        this.f2125E0 = false;
        int size3 = this.f2132p0.size();
        int iMax7 = Math.max(0, m1260o());
        int iMax8 = Math.max(0, m1256i());
        int[] iArr = this.f1736o0;
        int i21 = iArr[1];
        int i22 = iArr[0];
        int i23 = this.f2135s0;
        C0585pl c0585pl6 = this.f1689I;
        C0585pl c0585pl7 = this.f1688H;
        if (i23 == 0 && a90.m134r(this.f2123C0, 1)) {
            C0770ul c0770ul = this.f2136t0;
            int i24 = iArr[0];
            int i25 = iArr[1];
            m1238B();
            ArrayList arrayList = this.f2132p0;
            int size4 = arrayList.size();
            for (int i26 = 0; i26 < size4; i26++) {
                ((C0143dm) arrayList.get(i26)).m1238B();
            }
            boolean z17 = this.f2137u0;
            if (i24 == 1) {
                m1240F(0, m1260o());
            } else {
                c0585pl7.m3962i(0);
                this.f1704X = 0;
            }
            int i27 = 0;
            boolean z18 = false;
            boolean z19 = false;
            while (i27 < size4) {
                int i28 = i27;
                C0143dm c0143dm3 = (C0143dm) arrayList.get(i27);
                boolean z20 = z18;
                if (c0143dm3 instanceof ea0) {
                    ea0 ea0Var = (ea0) c0143dm3;
                    c0585pl5 = c0585pl7;
                    if (ea0Var.f2041t0 == 1) {
                        int i29 = ea0Var.f2038q0;
                        if (i29 != -1) {
                            ea0Var.m1397N(i29);
                        } else if (ea0Var.f2039r0 != -1 && mo1270y()) {
                            ea0Var.m1397N(m1260o() - ea0Var.f2039r0);
                        } else if (mo1270y()) {
                            ea0Var.m1397N((int) ((ea0Var.f2037p0 * m1260o()) + 0.5f));
                        }
                        z20 = true;
                    }
                } else {
                    c0585pl5 = c0585pl7;
                    if ((c0143dm3 instanceof C0205fb) && ((C0205fb) c0143dm3).m1757P() == 0) {
                        z18 = z20;
                        z19 = true;
                    }
                    i27 = i28 + 1;
                    c0585pl7 = c0585pl5;
                }
                z18 = z20;
                i27 = i28 + 1;
                c0585pl7 = c0585pl5;
            }
            c0585pl = c0585pl7;
            if (z18) {
                for (int i30 = 0; i30 < size4; i30 = i20 + 1) {
                    C0143dm c0143dm4 = (C0143dm) arrayList.get(i30);
                    if (c0143dm4 instanceof ea0) {
                        ea0 ea0Var2 = (ea0) c0143dm4;
                        i20 = i30;
                        if (ea0Var2.f2041t0 == 1) {
                            yd0.m5772k(0, c0770ul, ea0Var2, z17);
                        }
                    } else {
                        i20 = i30;
                    }
                }
            }
            yd0.m5772k(0, c0770ul, this, z17);
            if (z19) {
                for (int i31 = 0; i31 < size4; i31++) {
                    C0143dm c0143dm5 = (C0143dm) arrayList.get(i31);
                    if (c0143dm5 instanceof C0205fb) {
                        C0205fb c0205fb = (C0205fb) c0143dm5;
                        if (c0205fb.m1757P() == 0 && c0205fb.m1756O()) {
                            yd0.m5772k(1, c0770ul, c0205fb, z17);
                        }
                    }
                }
            }
            if (i25 == 1) {
                m1241G(0, m1256i());
            } else {
                c0585pl6.m3962i(0);
                this.f1705Y = 0;
            }
            int i32 = 0;
            boolean z21 = false;
            boolean z22 = false;
            while (i32 < size4) {
                C0143dm c0143dm6 = (C0143dm) arrayList.get(i32);
                int i33 = i32;
                if (c0143dm6 instanceof ea0) {
                    ea0 ea0Var3 = (ea0) c0143dm6;
                    if (ea0Var3.f2041t0 == 0) {
                        int i34 = ea0Var3.f2038q0;
                        if (i34 != -1) {
                            ea0Var3.m1397N(i34);
                        } else if (ea0Var3.f2039r0 != -1 && mo1271z()) {
                            ea0Var3.m1397N(m1256i() - ea0Var3.f2039r0);
                        } else if (mo1271z()) {
                            ea0Var3.m1397N((int) ((ea0Var3.f2037p0 * m1256i()) + 0.5f));
                        }
                        z21 = true;
                    }
                } else if ((c0143dm6 instanceof C0205fb) && ((C0205fb) c0143dm6).m1757P() == 1) {
                    z22 = true;
                }
                i32 = i33 + 1;
            }
            if (z21) {
                for (int i35 = 0; i35 < size4; i35++) {
                    C0143dm c0143dm7 = (C0143dm) arrayList.get(i35);
                    if (c0143dm7 instanceof ea0) {
                        ea0 ea0Var4 = (ea0) c0143dm7;
                        if (ea0Var4.f2041t0 == 0) {
                            yd0.m5786y(1, c0770ul, ea0Var4);
                        }
                    }
                }
            }
            yd0.m5786y(0, c0770ul, this);
            if (z22) {
                for (int i36 = 0; i36 < size4; i36++) {
                    C0143dm c0143dm8 = (C0143dm) arrayList.get(i36);
                    if (c0143dm8 instanceof C0205fb) {
                        C0205fb c0205fb2 = (C0205fb) c0143dm8;
                        if (c0205fb2.m1757P() == 1 && c0205fb2.m1756O()) {
                            yd0.m5786y(1, c0770ul, c0205fb2);
                        }
                    }
                }
            }
            for (int i37 = 0; i37 < size4; i37++) {
                C0143dm c0143dm9 = (C0143dm) arrayList.get(i37);
                if (c0143dm9.m1269x() && yd0.m5763b(c0143dm9)) {
                    m1458R(c0143dm9, c0770ul, yd0.f9277l);
                    if (!(c0143dm9 instanceof ea0)) {
                        yd0.m5772k(0, c0770ul, c0143dm9, z17);
                        yd0.m5786y(0, c0770ul, c0143dm9);
                    } else if (((ea0) c0143dm9).f2041t0 == 0) {
                        yd0.m5786y(0, c0770ul, c0143dm9);
                    } else {
                        yd0.m5772k(0, c0770ul, c0143dm9, z17);
                    }
                }
            }
            for (int i38 = 0; i38 < size3; i38++) {
                C0143dm c0143dm10 = (C0143dm) this.f2132p0.get(i38);
                if (c0143dm10.m1269x() && !(c0143dm10 instanceof ea0) && !(c0143dm10 instanceof C0205fb)) {
                    int iM1255h = c0143dm10.m1255h(0);
                    int iM1255h2 = c0143dm10.m1255h(1);
                    if (iM1255h != 3 || c0143dm10.f1739r == 1 || iM1255h2 != 3 || c0143dm10.f1740s == 1) {
                        m1458R(c0143dm10, this.f2136t0, new C0834wb());
                    }
                }
            }
        } else {
            c0585pl = c0585pl7;
        }
        if (size3 <= 2 || !((i22 == 2 || i21 == 2) && a90.m134r(this.f2123C0, 1024))) {
            i = iMax7;
            i2 = size3;
            i3 = i21;
            i4 = i22;
            c0585pl2 = c0585pl6;
        } else {
            C0770ul c0770ul2 = this.f2136t0;
            ArrayList arrayList2 = this.f2132p0;
            int size5 = arrayList2.size();
            int i39 = 0;
            while (true) {
                if (i39 < size5) {
                    C0143dm c0143dm11 = (C0143dm) arrayList2.get(i39);
                    int i40 = iArr[0];
                    int i41 = iArr[1];
                    int[] iArr2 = c0143dm11.f1736o0;
                    if (p80.m3873r(i40, i41, iArr2[0], iArr2[1])) {
                        i39++;
                    } else {
                        i13 = iMax7;
                        i2 = size3;
                        i14 = iMax8;
                        i15 = i21;
                        i16 = i22;
                        c0585pl2 = c0585pl6;
                    }
                } else {
                    i2 = size3;
                    c0585pl2 = c0585pl6;
                    int i42 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i42 < size5) {
                        int i43 = i42;
                        C0143dm c0143dm12 = (C0143dm) arrayList2.get(i42);
                        int i44 = iMax8;
                        int i45 = iArr[0];
                        int i46 = i21;
                        int i47 = iArr[1];
                        int i48 = iMax7;
                        int[] iArr3 = c0143dm12.f1736o0;
                        int i49 = i22;
                        if (!p80.m3873r(i45, i47, iArr3[0], iArr3[1])) {
                            m1458R(c0143dm12, c0770ul2, this.f2131K0);
                        }
                        boolean z23 = c0143dm12 instanceof ea0;
                        if (z23) {
                            ea0 ea0Var5 = (ea0) c0143dm12;
                            if (ea0Var5.f2041t0 == 0) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(ea0Var5);
                            }
                            if (ea0Var5.f2041t0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(ea0Var5);
                            }
                        }
                        if (c0143dm12 instanceof C0205fb) {
                            if (c0143dm12 instanceof C0205fb) {
                                C0205fb c0205fb3 = (C0205fb) c0143dm12;
                                if (c0205fb3.m1757P() == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(c0205fb3);
                                }
                                if (c0205fb3.m1757P() == 1) {
                                    if (arrayList8 == null) {
                                        arrayList8 = new ArrayList();
                                    }
                                    arrayList8.add(c0205fb3);
                                }
                            } else {
                                C0205fb c0205fb4 = (C0205fb) c0143dm12;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(c0205fb4);
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(c0205fb4);
                            }
                        }
                        if (c0143dm12.f1688H.f6197f == null && c0143dm12.f1690J.f6197f == null && !z23 && !(c0143dm12 instanceof C0205fb)) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(c0143dm12);
                        }
                        if (c0143dm12.f1689I.f6197f == null && c0143dm12.f1691K.f6197f == null && c0143dm12.f1692L.f6197f == null && !z23 && !(c0143dm12 instanceof C0205fb)) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(c0143dm12);
                        }
                        i42 = i43 + 1;
                        iMax8 = i44;
                        i21 = i46;
                        iMax7 = i48;
                        i22 = i49;
                    }
                    i13 = iMax7;
                    i14 = iMax8;
                    i15 = i21;
                    i16 = i22;
                    ArrayList arrayList9 = new ArrayList();
                    if (arrayList3 != null) {
                        int size6 = arrayList3.size();
                        int i50 = 0;
                        while (i50 < size6) {
                            Object obj = arrayList3.get(i50);
                            i50++;
                            p80.m3868m((ea0) obj, 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        int size7 = arrayList5.size();
                        int i51 = 0;
                        while (i51 < size7) {
                            Object obj2 = arrayList5.get(i51);
                            i51++;
                            C0205fb c0205fb5 = (C0205fb) obj2;
                            aj1 aj1VarM3868m = p80.m3868m(c0205fb5, 0, arrayList9, null);
                            c0205fb5.m1755N(0, aj1VarM3868m, arrayList9);
                            aj1VarM3868m.m261a(arrayList9);
                        }
                    }
                    HashSet hashSet = mo1254g(2).f6192a;
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            p80.m3868m(((C0585pl) it.next()).f6195d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = mo1254g(4).f6192a;
                    if (hashSet2 != null) {
                        Iterator it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            p80.m3868m(((C0585pl) it2.next()).f6195d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet3 = mo1254g(7).f6192a;
                    if (hashSet3 != null) {
                        Iterator it3 = hashSet3.iterator();
                        while (it3.hasNext()) {
                            p80.m3868m(((C0585pl) it3.next()).f6195d, 0, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        int size8 = arrayList6.size();
                        int i52 = 0;
                        while (i52 < size8) {
                            Object obj3 = arrayList6.get(i52);
                            i52++;
                            p80.m3868m((C0143dm) obj3, 0, arrayList9, null);
                        }
                    }
                    if (arrayList7 != null) {
                        int size9 = arrayList7.size();
                        int i53 = 0;
                        while (i53 < size9) {
                            Object obj4 = arrayList7.get(i53);
                            i53++;
                            p80.m3868m((ea0) obj4, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        int size10 = arrayList8.size();
                        int i54 = 0;
                        while (i54 < size10) {
                            Object obj5 = arrayList8.get(i54);
                            i54++;
                            C0205fb c0205fb6 = (C0205fb) obj5;
                            aj1 aj1VarM3868m2 = p80.m3868m(c0205fb6, 1, arrayList9, null);
                            c0205fb6.m1755N(1, aj1VarM3868m2, arrayList9);
                            aj1VarM3868m2.m261a(arrayList9);
                        }
                    }
                    HashSet hashSet4 = mo1254g(3).f6192a;
                    if (hashSet4 != null) {
                        Iterator it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            p80.m3868m(((C0585pl) it4.next()).f6195d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = mo1254g(6).f6192a;
                    if (hashSet5 != null) {
                        Iterator it5 = hashSet5.iterator();
                        while (it5.hasNext()) {
                            p80.m3868m(((C0585pl) it5.next()).f6195d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = mo1254g(5).f6192a;
                    if (hashSet6 != null) {
                        Iterator it6 = hashSet6.iterator();
                        while (it6.hasNext()) {
                            p80.m3868m(((C0585pl) it6.next()).f6195d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = mo1254g(7).f6192a;
                    if (hashSet7 != null) {
                        Iterator it7 = hashSet7.iterator();
                        while (it7.hasNext()) {
                            p80.m3868m(((C0585pl) it7.next()).f6195d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList4 != null) {
                        int size11 = arrayList4.size();
                        int i55 = 0;
                        while (i55 < size11) {
                            Object obj6 = arrayList4.get(i55);
                            i55++;
                            p80.m3868m((C0143dm) obj6, 1, arrayList9, null);
                        }
                    }
                    char c3 = 1;
                    int i56 = 0;
                    while (i56 < size5) {
                        C0143dm c0143dm13 = (C0143dm) arrayList2.get(i56);
                        int[] iArr4 = c0143dm13.f1736o0;
                        if (iArr4[0] == 3 && iArr4[c3] == 3) {
                            int i57 = c0143dm13.f1732m0;
                            int size12 = arrayList9.size();
                            int i58 = 0;
                            while (true) {
                                if (i58 >= size12) {
                                    aj1Var4 = null;
                                    break;
                                }
                                aj1Var4 = (aj1) arrayList9.get(i58);
                                if (i57 == aj1Var4.f217b) {
                                    break;
                                } else {
                                    i58++;
                                }
                            }
                            int i59 = c0143dm13.f1734n0;
                            int size13 = arrayList9.size();
                            int i60 = 0;
                            while (true) {
                                if (i60 >= size13) {
                                    aj1Var5 = null;
                                    break;
                                }
                                aj1Var5 = (aj1) arrayList9.get(i60);
                                if (i59 == aj1Var5.f217b) {
                                    break;
                                } else {
                                    i60++;
                                }
                            }
                            if (aj1Var4 != null && aj1Var5 != null) {
                                aj1Var4.m263c(0, aj1Var5);
                                aj1Var5.f218c = 2;
                                arrayList9.remove(aj1Var4);
                            }
                        }
                        i56++;
                        c3 = 1;
                    }
                    if (arrayList9.size() > 1) {
                        if (iArr[0] == 2) {
                            int size14 = arrayList9.size();
                            int i61 = 0;
                            int i62 = 0;
                            aj1Var = null;
                            while (i62 < size14) {
                                Object obj7 = arrayList9.get(i62);
                                i62++;
                                aj1 aj1Var6 = (aj1) obj7;
                                if (aj1Var6.f218c != 1 && (iM262b2 = aj1Var6.m262b(gi0Var, 0)) > i61) {
                                    aj1Var = aj1Var6;
                                    i61 = iM262b2;
                                }
                            }
                            c2 = 1;
                            if (aj1Var != null) {
                                m1243I(1);
                                m1245K(i61);
                            }
                            if (iArr[c2] == 2) {
                                size2 = arrayList9.size();
                                i18 = 0;
                                i19 = 0;
                                aj1Var2 = null;
                                while (i19 < size2) {
                                    Object obj8 = arrayList9.get(i19);
                                    i19++;
                                    aj1Var3 = (aj1) obj8;
                                    if (aj1Var3.f218c != 0 && (iM262b = aj1Var3.m262b(gi0Var, 1)) > i18) {
                                        aj1Var2 = aj1Var3;
                                        i18 = iM262b;
                                    }
                                }
                                if (aj1Var2 != null) {
                                    m1244J(1);
                                    m1242H(i18);
                                } else {
                                    aj1Var2 = null;
                                }
                            } else {
                                aj1Var2 = null;
                            }
                            if (aj1Var == null || aj1Var2 != null) {
                                i4 = i16;
                                if (i4 == 2) {
                                    i17 = i13;
                                    if (i17 < m1260o() || i17 <= 0) {
                                        iM1260o = m1260o();
                                    } else {
                                        m1245K(i17);
                                        this.f2124D0 = true;
                                    }
                                    i3 = i15;
                                    if (i3 == 2) {
                                        iMax8 = i14;
                                        if (iMax8 < m1256i() || iMax8 <= 0) {
                                            iMax8 = m1256i();
                                        } else {
                                            m1242H(iMax8);
                                            this.f2125E0 = true;
                                        }
                                    } else {
                                        iMax8 = i14;
                                    }
                                    i = iM1260o;
                                    z = true;
                                } else {
                                    i17 = i13;
                                }
                                iM1260o = i17;
                                i3 = i15;
                                if (i3 == 2) {
                                    iMax8 = i14;
                                    if (iMax8 < m1256i()) {
                                        iMax8 = m1256i();
                                    } else {
                                        iMax8 = m1256i();
                                    }
                                } else {
                                    iMax8 = i14;
                                }
                                i = iM1260o;
                                z = true;
                            }
                            if (!m1463S(64) || m1463S(128)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            gi0Var.getClass();
                            gi0Var.f2750h = false;
                            if (this.f2123C0 == 0 && z2) {
                                c = 1;
                                gi0Var.f2750h = true;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList10 = this.f2132p0;
                            if (iArr[0] != 2 || iArr[c] == 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.f2141y0 = 0;
                            this.f2142z0 = 0;
                            i5 = i2;
                            for (i6 = 0; i6 < i5; i6++) {
                                c0143dm2 = (C0143dm) this.f2132p0.get(i6);
                                if (c0143dm2 instanceof C0179em) {
                                    ((C0179em) c0143dm2).m1462Q();
                                }
                            }
                            zM1463S = m1463S(64);
                            r12 = z;
                            i7 = 0;
                            z4 = true;
                            while (z4) {
                                i8 = i7 + 1;
                                try {
                                    gi0Var.m2098t();
                                    this.f2141y0 = 0;
                                    this.f2142z0 = 0;
                                    m1252e(gi0Var);
                                    for (i12 = 0; i12 < i5; i12++) {
                                        ((C0143dm) this.f2132p0.get(i12)).m1252e(gi0Var);
                                    }
                                    m1460O(gi0Var);
                                    try {
                                        weakReference = this.f2126F0;
                                        if (weakReference != null) {
                                            try {
                                                if (weakReference.get() != null) {
                                                    c0585pl3 = c0585pl2;
                                                    try {
                                                        try {
                                                            z6 = z3;
                                                            try {
                                                                gi0Var.m2085f(gi0Var.m2090k((C0585pl) this.f2126F0.get()), gi0Var.m2090k(c0585pl3), 0, 5);
                                                                this.f2126F0 = null;
                                                            } catch (Exception e) {
                                                                e = e;
                                                                z16 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                z7 = z16;
                                                                if (z7) {
                                                                    zArr[2] = false;
                                                                    zM1463S2 = m1463S(64);
                                                                    mo1247M(gi0Var, zM1463S2);
                                                                    size = this.f2132p0.size();
                                                                    i11 = 0;
                                                                    z15 = false;
                                                                    while (i11 < size) {
                                                                        c0143dm = (C0143dm) this.f2132p0.get(i11);
                                                                        c0143dm.mo1247M(gi0Var, zM1463S2);
                                                                        boolean z24 = zM1463S2;
                                                                        int i63 = size;
                                                                        if (c0143dm.f1721h == -1) {
                                                                            z15 = true;
                                                                        } else {
                                                                            z15 = true;
                                                                        }
                                                                        i11++;
                                                                        zM1463S2 = z24;
                                                                        size = i63;
                                                                        z15 = z15;
                                                                    }
                                                                    z8 = z15;
                                                                } else {
                                                                    mo1247M(gi0Var, zM1463S);
                                                                    for (i9 = 0; i9 < i5; i9++) {
                                                                        ((C0143dm) this.f2132p0.get(i9)).mo1247M(gi0Var, zM1463S);
                                                                    }
                                                                    z8 = false;
                                                                }
                                                                if (z6) {
                                                                    iMax3 = 0;
                                                                    iMax4 = 0;
                                                                    for (i10 = 0; i10 < i5; i10++) {
                                                                        C0143dm c0143dm14 = (C0143dm) this.f2132p0.get(i10);
                                                                        iMax4 = Math.max(iMax4, c0143dm14.m1260o() + c0143dm14.f1704X);
                                                                        iMax3 = Math.max(iMax3, c0143dm14.m1256i() + c0143dm14.f1705Y);
                                                                    }
                                                                    iMax5 = Math.max(this.f1708a0, iMax4);
                                                                    iMax6 = Math.max(this.f1710b0, iMax3);
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    if (i4 == 2) {
                                                                        z8 = z8;
                                                                        r12 = r12;
                                                                        m1245K(iMax5);
                                                                        iArr[0] = 2;
                                                                        z8 = true;
                                                                        r12 = 1;
                                                                    }
                                                                    if (i3 == 2) {
                                                                        m1242H(iMax6);
                                                                        iArr[1] = 2;
                                                                        z8 = true;
                                                                        r12 = 1;
                                                                    }
                                                                }
                                                                iMax = Math.max(this.f1708a0, m1260o());
                                                                if (iMax > m1260o()) {
                                                                    m1245K(iMax);
                                                                    r7 = 1;
                                                                    iArr[0] = 1;
                                                                    z9 = true;
                                                                    r17 = 1;
                                                                } else {
                                                                    r7 = 1;
                                                                    r17 = r12;
                                                                    z9 = z8;
                                                                }
                                                                iMax2 = Math.max(this.f1710b0, m1256i());
                                                                if (iMax2 > m1256i()) {
                                                                    m1242H(iMax2);
                                                                    iArr[r7] = r7;
                                                                    r4 = r7;
                                                                    z10 = r4 == true ? 1 : 0;
                                                                } else {
                                                                    r0 = r17;
                                                                }
                                                                if (r0 == 0) {
                                                                    z10 = z9;
                                                                    if (iArr[0] == 2) {
                                                                        r3 = r0;
                                                                        z14 = z10;
                                                                        if (m1260o() > i) {
                                                                            this.f2124D0 = r7;
                                                                            iArr[0] = r7;
                                                                            m1245K(i);
                                                                            ?? r5 = r7;
                                                                            z14 = r5 == true ? 1 : 0;
                                                                            r3 = r5;
                                                                        }
                                                                    }
                                                                    r0 = r4;
                                                                    r3 = r0;
                                                                    r3 = r0;
                                                                    z14 = z10;
                                                                    z14 = z10;
                                                                    r1 = r3;
                                                                    r1 = r3;
                                                                    z11 = z14;
                                                                    z11 = z14;
                                                                    if (iArr[r7] != 2) {
                                                                    }
                                                                    if (i8 > 8) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = z12;
                                                                    }
                                                                    r12 = r2;
                                                                    i7 = i8;
                                                                    z3 = z6;
                                                                    c0585pl2 = c0585pl3;
                                                                    z4 = z13;
                                                                } else {
                                                                    z10 = z9;
                                                                    r0 = r4;
                                                                    r1 = r0;
                                                                    z11 = z10;
                                                                }
                                                                r1 = r3;
                                                                z11 = z14;
                                                                z12 = z11;
                                                                r2 = r1;
                                                                if (i8 > 8) {
                                                                    z13 = false;
                                                                } else {
                                                                    z13 = z12;
                                                                }
                                                                r12 = r2;
                                                                i7 = i8;
                                                                z3 = z6;
                                                                c0585pl2 = c0585pl3;
                                                                z4 = z13;
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            z6 = z3;
                                                            z16 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z7 = z16;
                                                            if (z7) {
                                                                zArr[2] = false;
                                                                zM1463S2 = m1463S(64);
                                                                mo1247M(gi0Var, zM1463S2);
                                                                size = this.f2132p0.size();
                                                                i11 = 0;
                                                                z15 = false;
                                                                while (i11 < size) {
                                                                    c0143dm = (C0143dm) this.f2132p0.get(i11);
                                                                    c0143dm.mo1247M(gi0Var, zM1463S2);
                                                                    boolean z25 = zM1463S2;
                                                                    int i64 = size;
                                                                    if (c0143dm.f1721h == -1) {
                                                                        z15 = true;
                                                                    } else {
                                                                        z15 = true;
                                                                    }
                                                                    i11++;
                                                                    zM1463S2 = z25;
                                                                    size = i64;
                                                                    z15 = z15;
                                                                }
                                                                z8 = z15;
                                                            } else {
                                                                mo1247M(gi0Var, zM1463S);
                                                                while (i9 < i5) {
                                                                    ((C0143dm) this.f2132p0.get(i9)).mo1247M(gi0Var, zM1463S);
                                                                }
                                                                z8 = false;
                                                            }
                                                            if (z6) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i10 < i5) {
                                                                    C0143dm c0143dm15 = (C0143dm) this.f2132p0.get(i10);
                                                                    iMax4 = Math.max(iMax4, c0143dm15.m1260o() + c0143dm15.f1704X);
                                                                    iMax3 = Math.max(iMax3, c0143dm15.m1256i() + c0143dm15.f1705Y);
                                                                }
                                                                iMax5 = Math.max(this.f1708a0, iMax4);
                                                                iMax6 = Math.max(this.f1710b0, iMax3);
                                                                z8 = z8;
                                                                r12 = r12;
                                                                if (i4 == 2) {
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    m1245K(iMax5);
                                                                    iArr[0] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                                if (i3 == 2) {
                                                                    m1242H(iMax6);
                                                                    iArr[1] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.f1708a0, m1260o());
                                                            if (iMax > m1260o()) {
                                                                m1245K(iMax);
                                                                r7 = 1;
                                                                iArr[0] = 1;
                                                                z9 = true;
                                                                r17 = 1;
                                                            } else {
                                                                r7 = 1;
                                                                r17 = r12;
                                                                z9 = z8;
                                                            }
                                                            iMax2 = Math.max(this.f1710b0, m1256i());
                                                            if (iMax2 > m1256i()) {
                                                                m1242H(iMax2);
                                                                iArr[r7] = r7;
                                                                r4 = r7;
                                                                z10 = r4 == true ? 1 : 0;
                                                            } else {
                                                                r0 = r17;
                                                            }
                                                            if (r0 == 0) {
                                                                z10 = z9;
                                                                if (iArr[0] == 2) {
                                                                    r3 = r0;
                                                                    z14 = z10;
                                                                    if (m1260o() > i) {
                                                                        this.f2124D0 = r7;
                                                                        iArr[0] = r7;
                                                                        m1245K(i);
                                                                        ?? r6 = r7;
                                                                        z14 = r6 == true ? 1 : 0;
                                                                        r3 = r6;
                                                                    }
                                                                }
                                                                r0 = r4;
                                                                r3 = r0;
                                                                r3 = r0;
                                                                z14 = z10;
                                                                z14 = z10;
                                                                r1 = r3;
                                                                r1 = r3;
                                                                z11 = z14;
                                                                z11 = z14;
                                                                if (iArr[r7] != 2) {
                                                                }
                                                                if (i8 > 8) {
                                                                    z13 = false;
                                                                } else {
                                                                    z13 = z12;
                                                                }
                                                                r12 = r2;
                                                                i7 = i8;
                                                                z3 = z6;
                                                                c0585pl2 = c0585pl3;
                                                                z4 = z13;
                                                            } else {
                                                                z10 = z9;
                                                                r0 = r4;
                                                                r1 = r0;
                                                                z11 = z10;
                                                            }
                                                            r1 = r3;
                                                            z11 = z14;
                                                            z12 = z11;
                                                            r2 = r1;
                                                            if (i8 > 8) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = z12;
                                                            }
                                                            r12 = r2;
                                                            i7 = i8;
                                                            z3 = z6;
                                                            c0585pl2 = c0585pl3;
                                                            z4 = z13;
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                    }
                                                } else {
                                                    c0585pl3 = c0585pl2;
                                                    z6 = z3;
                                                }
                                                weakReference2 = this.f2128H0;
                                                if (weakReference2 != null && weakReference2.get() != null) {
                                                    gi0Var.m2085f(gi0Var.m2090k(this.f1691K), gi0Var.m2090k((C0585pl) this.f2128H0.get()), 0, 5);
                                                    this.f2128H0 = null;
                                                }
                                                weakReference3 = this.f2127G0;
                                                if (weakReference3 != null && weakReference3.get() != null) {
                                                    c0585pl4 = c0585pl;
                                                    try {
                                                        c0585pl = c0585pl4;
                                                        gi0Var.m2085f(gi0Var.m2090k((C0585pl) this.f2127G0.get()), gi0Var.m2090k(c0585pl4), 0, 5);
                                                        this.f2127G0 = null;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        c0585pl = c0585pl4;
                                                        z16 = true;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        z7 = z16;
                                                        if (z7) {
                                                            zArr[2] = false;
                                                            zM1463S2 = m1463S(64);
                                                            mo1247M(gi0Var, zM1463S2);
                                                            size = this.f2132p0.size();
                                                            i11 = 0;
                                                            z15 = false;
                                                            while (i11 < size) {
                                                                c0143dm = (C0143dm) this.f2132p0.get(i11);
                                                                c0143dm.mo1247M(gi0Var, zM1463S2);
                                                                boolean z26 = zM1463S2;
                                                                int i65 = size;
                                                                if (c0143dm.f1721h == -1) {
                                                                    z15 = true;
                                                                } else {
                                                                    z15 = true;
                                                                }
                                                                i11++;
                                                                zM1463S2 = z26;
                                                                size = i65;
                                                                z15 = z15;
                                                            }
                                                            z8 = z15;
                                                        } else {
                                                            mo1247M(gi0Var, zM1463S);
                                                            while (i9 < i5) {
                                                                ((C0143dm) this.f2132p0.get(i9)).mo1247M(gi0Var, zM1463S);
                                                            }
                                                            z8 = false;
                                                        }
                                                        if (z6) {
                                                            iMax3 = 0;
                                                            iMax4 = 0;
                                                            while (i10 < i5) {
                                                                C0143dm c0143dm16 = (C0143dm) this.f2132p0.get(i10);
                                                                iMax4 = Math.max(iMax4, c0143dm16.m1260o() + c0143dm16.f1704X);
                                                                iMax3 = Math.max(iMax3, c0143dm16.m1256i() + c0143dm16.f1705Y);
                                                            }
                                                            iMax5 = Math.max(this.f1708a0, iMax4);
                                                            iMax6 = Math.max(this.f1710b0, iMax3);
                                                            z8 = z8;
                                                            r12 = r12;
                                                            if (i4 == 2) {
                                                                z8 = z8;
                                                                r12 = r12;
                                                                m1245K(iMax5);
                                                                iArr[0] = 2;
                                                                z8 = true;
                                                                r12 = 1;
                                                            }
                                                            if (i3 == 2) {
                                                                m1242H(iMax6);
                                                                iArr[1] = 2;
                                                                z8 = true;
                                                                r12 = 1;
                                                            }
                                                        }
                                                        iMax = Math.max(this.f1708a0, m1260o());
                                                        if (iMax > m1260o()) {
                                                            m1245K(iMax);
                                                            r7 = 1;
                                                            iArr[0] = 1;
                                                            z9 = true;
                                                            r17 = 1;
                                                        } else {
                                                            r7 = 1;
                                                            r17 = r12;
                                                            z9 = z8;
                                                        }
                                                        iMax2 = Math.max(this.f1710b0, m1256i());
                                                        if (iMax2 > m1256i()) {
                                                            m1242H(iMax2);
                                                            iArr[r7] = r7;
                                                            r4 = r7;
                                                            z10 = r4 == true ? 1 : 0;
                                                        } else {
                                                            r0 = r17;
                                                        }
                                                        if (r0 == 0) {
                                                            z10 = z9;
                                                            if (iArr[0] == 2) {
                                                                r3 = r0;
                                                                z14 = z10;
                                                                if (m1260o() > i) {
                                                                    this.f2124D0 = r7;
                                                                    iArr[0] = r7;
                                                                    m1245K(i);
                                                                    ?? r8 = r7;
                                                                    z14 = r8 == true ? 1 : 0;
                                                                    r3 = r8;
                                                                }
                                                            }
                                                            r0 = r4;
                                                            r3 = r0;
                                                            r3 = r0;
                                                            z14 = z10;
                                                            z14 = z10;
                                                            r1 = r3;
                                                            r1 = r3;
                                                            z11 = z14;
                                                            z11 = z14;
                                                            if (iArr[r7] != 2) {
                                                            }
                                                            if (i8 > 8) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = z12;
                                                            }
                                                            r12 = r2;
                                                            i7 = i8;
                                                            z3 = z6;
                                                            c0585pl2 = c0585pl3;
                                                            z4 = z13;
                                                        } else {
                                                            z10 = z9;
                                                            r0 = r4;
                                                            r1 = r0;
                                                            z11 = z10;
                                                        }
                                                        r1 = r3;
                                                        z11 = z14;
                                                        z12 = z11;
                                                        r2 = r1;
                                                        if (i8 > 8) {
                                                            z13 = false;
                                                        } else {
                                                            z13 = z12;
                                                        }
                                                        r12 = r2;
                                                        i7 = i8;
                                                        z3 = z6;
                                                        c0585pl2 = c0585pl3;
                                                        z4 = z13;
                                                    }
                                                }
                                                weakReference4 = this.f2129I0;
                                                if (weakReference4 == null && weakReference4.get() != null) {
                                                    try {
                                                        try {
                                                            gi0Var.m2085f(gi0Var.m2090k(this.f1690J), gi0Var.m2090k((C0585pl) this.f2129I0.get()), 0, 5);
                                                            try {
                                                                this.f2129I0 = null;
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                z16 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                z7 = z16;
                                                            }
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            z16 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z7 = z16;
                                                            if (z7) {
                                                                zArr[2] = false;
                                                                zM1463S2 = m1463S(64);
                                                                mo1247M(gi0Var, zM1463S2);
                                                                size = this.f2132p0.size();
                                                                i11 = 0;
                                                                z15 = false;
                                                                while (i11 < size) {
                                                                    c0143dm = (C0143dm) this.f2132p0.get(i11);
                                                                    c0143dm.mo1247M(gi0Var, zM1463S2);
                                                                    boolean z27 = zM1463S2;
                                                                    int i66 = size;
                                                                    if (c0143dm.f1721h == -1) {
                                                                        z15 = true;
                                                                    } else {
                                                                        z15 = true;
                                                                    }
                                                                    i11++;
                                                                    zM1463S2 = z27;
                                                                    size = i66;
                                                                    z15 = z15;
                                                                }
                                                                z8 = z15;
                                                            } else {
                                                                mo1247M(gi0Var, zM1463S);
                                                                while (i9 < i5) {
                                                                    ((C0143dm) this.f2132p0.get(i9)).mo1247M(gi0Var, zM1463S);
                                                                }
                                                                z8 = false;
                                                            }
                                                            if (z6) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i10 < i5) {
                                                                    C0143dm c0143dm17 = (C0143dm) this.f2132p0.get(i10);
                                                                    iMax4 = Math.max(iMax4, c0143dm17.m1260o() + c0143dm17.f1704X);
                                                                    iMax3 = Math.max(iMax3, c0143dm17.m1256i() + c0143dm17.f1705Y);
                                                                }
                                                                iMax5 = Math.max(this.f1708a0, iMax4);
                                                                iMax6 = Math.max(this.f1710b0, iMax3);
                                                                z8 = z8;
                                                                r12 = r12;
                                                                if (i4 == 2) {
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    m1245K(iMax5);
                                                                    iArr[0] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                                if (i3 == 2) {
                                                                    m1242H(iMax6);
                                                                    iArr[1] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.f1708a0, m1260o());
                                                            if (iMax > m1260o()) {
                                                                m1245K(iMax);
                                                                r7 = 1;
                                                                iArr[0] = 1;
                                                                z9 = true;
                                                                r17 = 1;
                                                            } else {
                                                                r7 = 1;
                                                                r17 = r12;
                                                                z9 = z8;
                                                            }
                                                            iMax2 = Math.max(this.f1710b0, m1256i());
                                                            if (iMax2 > m1256i()) {
                                                                m1242H(iMax2);
                                                                iArr[r7] = r7;
                                                                r4 = r7;
                                                                z10 = r4 == true ? 1 : 0;
                                                            } else {
                                                                r0 = r17;
                                                            }
                                                            if (r0 == 0) {
                                                                z10 = z9;
                                                                if (iArr[0] == 2) {
                                                                    r3 = r0;
                                                                    z14 = z10;
                                                                    if (m1260o() > i) {
                                                                        this.f2124D0 = r7;
                                                                        iArr[0] = r7;
                                                                        m1245K(i);
                                                                        ?? r9 = r7;
                                                                        z14 = r9 == true ? 1 : 0;
                                                                        r3 = r9;
                                                                    }
                                                                }
                                                                r0 = r4;
                                                                r3 = r0;
                                                                r3 = r0;
                                                                z14 = z10;
                                                                z14 = z10;
                                                                r1 = r3;
                                                                r1 = r3;
                                                                z11 = z14;
                                                                z11 = z14;
                                                                if (iArr[r7] != 2) {
                                                                }
                                                                if (i8 > 8) {
                                                                    z13 = false;
                                                                } else {
                                                                    z13 = z12;
                                                                }
                                                                r12 = r2;
                                                                i7 = i8;
                                                                z3 = z6;
                                                                c0585pl2 = c0585pl3;
                                                                z4 = z13;
                                                            } else {
                                                                z10 = z9;
                                                                r0 = r4;
                                                                r1 = r0;
                                                                z11 = z10;
                                                            }
                                                            r1 = r3;
                                                            z11 = z14;
                                                            z12 = z11;
                                                            r2 = r1;
                                                            if (i8 > 8) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = z12;
                                                            }
                                                            r12 = r2;
                                                            i7 = i8;
                                                            z3 = z6;
                                                            c0585pl2 = c0585pl3;
                                                            z4 = z13;
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                    }
                                                }
                                                gi0Var.m2094p();
                                                z7 = true;
                                            } catch (Exception e8) {
                                                e = e8;
                                                c0585pl3 = c0585pl2;
                                            }
                                        } else {
                                            c0585pl3 = c0585pl2;
                                            z6 = z3;
                                            weakReference2 = this.f2128H0;
                                            if (weakReference2 != null) {
                                                gi0Var.m2085f(gi0Var.m2090k(this.f1691K), gi0Var.m2090k((C0585pl) this.f2128H0.get()), 0, 5);
                                                this.f2128H0 = null;
                                            }
                                            weakReference3 = this.f2127G0;
                                            if (weakReference3 != null) {
                                                c0585pl4 = c0585pl;
                                                c0585pl = c0585pl4;
                                                gi0Var.m2085f(gi0Var.m2090k((C0585pl) this.f2127G0.get()), gi0Var.m2090k(c0585pl4), 0, 5);
                                                this.f2127G0 = null;
                                            }
                                            weakReference4 = this.f2129I0;
                                            if (weakReference4 == null) {
                                            }
                                            gi0Var.m2094p();
                                            z7 = true;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        c0585pl3 = c0585pl2;
                                        z6 = z3;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    c0585pl3 = c0585pl2;
                                    z6 = z3;
                                    z16 = z4;
                                }
                                if (z7) {
                                    zArr[2] = false;
                                    zM1463S2 = m1463S(64);
                                    mo1247M(gi0Var, zM1463S2);
                                    size = this.f2132p0.size();
                                    i11 = 0;
                                    z15 = false;
                                    while (i11 < size) {
                                        c0143dm = (C0143dm) this.f2132p0.get(i11);
                                        c0143dm.mo1247M(gi0Var, zM1463S2);
                                        boolean z28 = zM1463S2;
                                        int i67 = size;
                                        if (c0143dm.f1721h == -1 || c0143dm.f1723i != -1) {
                                            z15 = true;
                                        }
                                        i11++;
                                        zM1463S2 = z28;
                                        size = i67;
                                        z15 = z15;
                                    }
                                    z8 = z15;
                                } else {
                                    mo1247M(gi0Var, zM1463S);
                                    while (i9 < i5) {
                                        ((C0143dm) this.f2132p0.get(i9)).mo1247M(gi0Var, zM1463S);
                                    }
                                    z8 = false;
                                }
                                if (z6 && i8 < 8 && zArr[2]) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i10 < i5) {
                                        C0143dm c0143dm18 = (C0143dm) this.f2132p0.get(i10);
                                        iMax4 = Math.max(iMax4, c0143dm18.m1260o() + c0143dm18.f1704X);
                                        iMax3 = Math.max(iMax3, c0143dm18.m1256i() + c0143dm18.f1705Y);
                                    }
                                    iMax5 = Math.max(this.f1708a0, iMax4);
                                    iMax6 = Math.max(this.f1710b0, iMax3);
                                    z8 = z8;
                                    r12 = r12;
                                    if (i4 == 2 && m1260o() < iMax5) {
                                        z8 = z8;
                                        r12 = r12;
                                        m1245K(iMax5);
                                        iArr[0] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                    if (i3 == 2 && m1256i() < iMax6) {
                                        m1242H(iMax6);
                                        iArr[1] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.f1708a0, m1260o());
                                if (iMax > m1260o()) {
                                    m1245K(iMax);
                                    r7 = 1;
                                    iArr[0] = 1;
                                    z9 = true;
                                    r17 = 1;
                                } else {
                                    r7 = 1;
                                    r17 = r12;
                                    z9 = z8;
                                }
                                iMax2 = Math.max(this.f1710b0, m1256i());
                                if (iMax2 > m1256i()) {
                                    m1242H(iMax2);
                                    iArr[r7] = r7;
                                    r4 = r7;
                                    z10 = r4 == true ? 1 : 0;
                                } else {
                                    r0 = r17;
                                }
                                if (r0 == 0) {
                                    z10 = z9;
                                    if (iArr[0] == 2 && i > 0) {
                                        r3 = r0;
                                        z14 = z10;
                                        if (m1260o() > i) {
                                            this.f2124D0 = r7;
                                            iArr[0] = r7;
                                            m1245K(i);
                                            ?? r10 = r7;
                                            z14 = r10 == true ? 1 : 0;
                                            r3 = r10;
                                        }
                                    }
                                    r0 = r4;
                                    r3 = r0;
                                    r3 = r0;
                                    z14 = z10;
                                    z14 = z10;
                                    r1 = r3;
                                    r1 = r3;
                                    z11 = z14;
                                    z11 = z14;
                                    if (iArr[r7] != 2 && iMax8 > 0 && m1256i() > iMax8) {
                                        r1 = r3;
                                        z11 = z14;
                                        this.f2125E0 = r7;
                                        iArr[r7] = r7;
                                        m1242H(iMax8);
                                        r2 = 1;
                                        z12 = true;
                                    }
                                    if (i8 > 8) {
                                        z13 = false;
                                    } else {
                                        z13 = z12;
                                    }
                                    r12 = r2;
                                    i7 = i8;
                                    z3 = z6;
                                    c0585pl2 = c0585pl3;
                                    z4 = z13;
                                } else {
                                    z10 = z9;
                                    r0 = r4;
                                    r1 = r0;
                                    z11 = z10;
                                }
                                r1 = r3;
                                z11 = z14;
                                z12 = z11;
                                r2 = r1;
                                if (i8 > 8) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                r12 = r2;
                                i7 = i8;
                                z3 = z6;
                                c0585pl2 = c0585pl3;
                                z4 = z13;
                            }
                            z5 = r12 == true ? 1 : 0;
                            this.f2132p0 = arrayList10;
                            if (z5) {
                                iArr[0] = i4;
                                iArr[1] = i3;
                            }
                            mo1239C(gi0Var.f2755m);
                        }
                        c2 = 1;
                        aj1Var = null;
                        if (iArr[c2] == 2) {
                            size2 = arrayList9.size();
                            i18 = 0;
                            i19 = 0;
                            aj1Var2 = null;
                            while (i19 < size2) {
                                Object obj9 = arrayList9.get(i19);
                                i19++;
                                aj1Var3 = (aj1) obj9;
                                if (aj1Var3.f218c != 0) {
                                    aj1Var2 = aj1Var3;
                                    i18 = iM262b;
                                }
                            }
                            if (aj1Var2 != null) {
                                m1244J(1);
                                m1242H(i18);
                            } else {
                                aj1Var2 = null;
                            }
                        } else {
                            aj1Var2 = null;
                        }
                        if (aj1Var == null) {
                        }
                        i4 = i16;
                        if (i4 == 2) {
                            i17 = i13;
                            if (i17 < m1260o()) {
                            }
                            iM1260o = m1260o();
                            i3 = i15;
                            if (i3 == 2) {
                                iMax8 = i14;
                                if (iMax8 < m1256i()) {
                                    iMax8 = m1256i();
                                } else {
                                    iMax8 = m1256i();
                                }
                            } else {
                                iMax8 = i14;
                            }
                            i = iM1260o;
                            z = true;
                            if (m1463S(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            gi0Var.getClass();
                            gi0Var.f2750h = false;
                            if (this.f2123C0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList11 = this.f2132p0;
                            if (iArr[0] != 2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.f2141y0 = 0;
                            this.f2142z0 = 0;
                            i5 = i2;
                            while (i6 < i5) {
                                c0143dm2 = (C0143dm) this.f2132p0.get(i6);
                                if (c0143dm2 instanceof C0179em) {
                                    ((C0179em) c0143dm2).m1462Q();
                                }
                            }
                            zM1463S = m1463S(64);
                            r12 = z;
                            i7 = 0;
                            z4 = true;
                            while (z4) {
                                i8 = i7 + 1;
                                gi0Var.m2098t();
                                this.f2141y0 = 0;
                                this.f2142z0 = 0;
                                m1252e(gi0Var);
                                while (i12 < i5) {
                                    ((C0143dm) this.f2132p0.get(i12)).m1252e(gi0Var);
                                }
                                m1460O(gi0Var);
                                weakReference = this.f2126F0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        c0585pl3 = c0585pl2;
                                        z6 = z3;
                                        gi0Var.m2085f(gi0Var.m2090k((C0585pl) this.f2126F0.get()), gi0Var.m2090k(c0585pl3), 0, 5);
                                        this.f2126F0 = null;
                                    } else {
                                        c0585pl3 = c0585pl2;
                                        z6 = z3;
                                    }
                                    weakReference2 = this.f2128H0;
                                    if (weakReference2 != null) {
                                        gi0Var.m2085f(gi0Var.m2090k(this.f1691K), gi0Var.m2090k((C0585pl) this.f2128H0.get()), 0, 5);
                                        this.f2128H0 = null;
                                    }
                                    weakReference3 = this.f2127G0;
                                    if (weakReference3 != null) {
                                        c0585pl4 = c0585pl;
                                        c0585pl = c0585pl4;
                                        gi0Var.m2085f(gi0Var.m2090k((C0585pl) this.f2127G0.get()), gi0Var.m2090k(c0585pl4), 0, 5);
                                        this.f2127G0 = null;
                                    }
                                    weakReference4 = this.f2129I0;
                                    if (weakReference4 == null) {
                                    }
                                    gi0Var.m2094p();
                                    z7 = true;
                                } else {
                                    c0585pl3 = c0585pl2;
                                    z6 = z3;
                                    weakReference2 = this.f2128H0;
                                    if (weakReference2 != null) {
                                        gi0Var.m2085f(gi0Var.m2090k(this.f1691K), gi0Var.m2090k((C0585pl) this.f2128H0.get()), 0, 5);
                                        this.f2128H0 = null;
                                    }
                                    weakReference3 = this.f2127G0;
                                    if (weakReference3 != null) {
                                        c0585pl4 = c0585pl;
                                        c0585pl = c0585pl4;
                                        gi0Var.m2085f(gi0Var.m2090k((C0585pl) this.f2127G0.get()), gi0Var.m2090k(c0585pl4), 0, 5);
                                        this.f2127G0 = null;
                                    }
                                    weakReference4 = this.f2129I0;
                                    if (weakReference4 == null) {
                                    }
                                    gi0Var.m2094p();
                                    z7 = true;
                                }
                                if (z7) {
                                    zArr[2] = false;
                                    zM1463S2 = m1463S(64);
                                    mo1247M(gi0Var, zM1463S2);
                                    size = this.f2132p0.size();
                                    i11 = 0;
                                    z15 = false;
                                    while (i11 < size) {
                                        c0143dm = (C0143dm) this.f2132p0.get(i11);
                                        c0143dm.mo1247M(gi0Var, zM1463S2);
                                        boolean z29 = zM1463S2;
                                        int i68 = size;
                                        if (c0143dm.f1721h == -1) {
                                            z15 = true;
                                        } else {
                                            z15 = true;
                                        }
                                        i11++;
                                        zM1463S2 = z29;
                                        size = i68;
                                        z15 = z15;
                                    }
                                    z8 = z15;
                                } else {
                                    mo1247M(gi0Var, zM1463S);
                                    while (i9 < i5) {
                                        ((C0143dm) this.f2132p0.get(i9)).mo1247M(gi0Var, zM1463S);
                                    }
                                    z8 = false;
                                }
                                if (z6) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i10 < i5) {
                                        C0143dm c0143dm19 = (C0143dm) this.f2132p0.get(i10);
                                        iMax4 = Math.max(iMax4, c0143dm19.m1260o() + c0143dm19.f1704X);
                                        iMax3 = Math.max(iMax3, c0143dm19.m1256i() + c0143dm19.f1705Y);
                                    }
                                    iMax5 = Math.max(this.f1708a0, iMax4);
                                    iMax6 = Math.max(this.f1710b0, iMax3);
                                    z8 = z8;
                                    r12 = r12;
                                    if (i4 == 2) {
                                        z8 = z8;
                                        r12 = r12;
                                        m1245K(iMax5);
                                        iArr[0] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                    if (i3 == 2) {
                                        m1242H(iMax6);
                                        iArr[1] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.f1708a0, m1260o());
                                if (iMax > m1260o()) {
                                    m1245K(iMax);
                                    r7 = 1;
                                    iArr[0] = 1;
                                    z9 = true;
                                    r17 = 1;
                                } else {
                                    r7 = 1;
                                    r17 = r12;
                                    z9 = z8;
                                }
                                iMax2 = Math.max(this.f1710b0, m1256i());
                                if (iMax2 > m1256i()) {
                                    m1242H(iMax2);
                                    iArr[r7] = r7;
                                    r4 = r7;
                                    z10 = r4 == true ? 1 : 0;
                                } else {
                                    r0 = r17;
                                }
                                if (r0 == 0) {
                                    z10 = z9;
                                    if (iArr[0] == 2) {
                                        r3 = r0;
                                        z14 = z10;
                                        if (m1260o() > i) {
                                            this.f2124D0 = r7;
                                            iArr[0] = r7;
                                            m1245K(i);
                                            ?? r11 = r7;
                                            z14 = r11 == true ? 1 : 0;
                                            r3 = r11;
                                        }
                                    }
                                    r0 = r4;
                                    r3 = r0;
                                    r3 = r0;
                                    z14 = z10;
                                    z14 = z10;
                                    r1 = r3;
                                    r1 = r3;
                                    z11 = z14;
                                    z11 = z14;
                                    if (iArr[r7] != 2) {
                                    }
                                    if (i8 > 8) {
                                        z13 = false;
                                    } else {
                                        z13 = z12;
                                    }
                                    r12 = r2;
                                    i7 = i8;
                                    z3 = z6;
                                    c0585pl2 = c0585pl3;
                                    z4 = z13;
                                } else {
                                    z10 = z9;
                                    r0 = r4;
                                    r1 = r0;
                                    z11 = z10;
                                }
                                r1 = r3;
                                z11 = z14;
                                z12 = z11;
                                r2 = r1;
                                if (i8 > 8) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                r12 = r2;
                                i7 = i8;
                                z3 = z6;
                                c0585pl2 = c0585pl3;
                                z4 = z13;
                            }
                            z5 = r12 == true ? 1 : 0;
                            this.f2132p0 = arrayList11;
                            if (z5) {
                                iArr[0] = i4;
                                iArr[1] = i3;
                            }
                            mo1239C(gi0Var.f2755m);
                        }
                        i17 = i13;
                        iM1260o = i17;
                        i3 = i15;
                        if (i3 == 2) {
                            iMax8 = i14;
                            if (iMax8 < m1256i()) {
                                iMax8 = m1256i();
                            } else {
                                iMax8 = m1256i();
                            }
                        } else {
                            iMax8 = i14;
                        }
                        i = iM1260o;
                        z = true;
                        if (m1463S(64)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        gi0Var.getClass();
                        gi0Var.f2750h = false;
                        if (this.f2123C0 == 0) {
                            c = 1;
                        } else {
                            c = 1;
                        }
                        ArrayList arrayList12 = this.f2132p0;
                        if (iArr[0] != 2) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        this.f2141y0 = 0;
                        this.f2142z0 = 0;
                        i5 = i2;
                        while (i6 < i5) {
                            c0143dm2 = (C0143dm) this.f2132p0.get(i6);
                            if (c0143dm2 instanceof C0179em) {
                                ((C0179em) c0143dm2).m1462Q();
                            }
                        }
                        zM1463S = m1463S(64);
                        r12 = z;
                        i7 = 0;
                        z4 = true;
                        while (z4) {
                            i8 = i7 + 1;
                            gi0Var.m2098t();
                            this.f2141y0 = 0;
                            this.f2142z0 = 0;
                            m1252e(gi0Var);
                            while (i12 < i5) {
                                ((C0143dm) this.f2132p0.get(i12)).m1252e(gi0Var);
                            }
                            m1460O(gi0Var);
                            weakReference = this.f2126F0;
                            if (weakReference != null) {
                                if (weakReference.get() != null) {
                                    c0585pl3 = c0585pl2;
                                    z6 = z3;
                                    gi0Var.m2085f(gi0Var.m2090k((C0585pl) this.f2126F0.get()), gi0Var.m2090k(c0585pl3), 0, 5);
                                    this.f2126F0 = null;
                                } else {
                                    c0585pl3 = c0585pl2;
                                    z6 = z3;
                                }
                                weakReference2 = this.f2128H0;
                                if (weakReference2 != null) {
                                    gi0Var.m2085f(gi0Var.m2090k(this.f1691K), gi0Var.m2090k((C0585pl) this.f2128H0.get()), 0, 5);
                                    this.f2128H0 = null;
                                }
                                weakReference3 = this.f2127G0;
                                if (weakReference3 != null) {
                                    c0585pl4 = c0585pl;
                                    c0585pl = c0585pl4;
                                    gi0Var.m2085f(gi0Var.m2090k((C0585pl) this.f2127G0.get()), gi0Var.m2090k(c0585pl4), 0, 5);
                                    this.f2127G0 = null;
                                }
                                weakReference4 = this.f2129I0;
                                if (weakReference4 == null) {
                                }
                                gi0Var.m2094p();
                                z7 = true;
                            } else {
                                c0585pl3 = c0585pl2;
                                z6 = z3;
                                weakReference2 = this.f2128H0;
                                if (weakReference2 != null) {
                                    gi0Var.m2085f(gi0Var.m2090k(this.f1691K), gi0Var.m2090k((C0585pl) this.f2128H0.get()), 0, 5);
                                    this.f2128H0 = null;
                                }
                                weakReference3 = this.f2127G0;
                                if (weakReference3 != null) {
                                    c0585pl4 = c0585pl;
                                    c0585pl = c0585pl4;
                                    gi0Var.m2085f(gi0Var.m2090k((C0585pl) this.f2127G0.get()), gi0Var.m2090k(c0585pl4), 0, 5);
                                    this.f2127G0 = null;
                                }
                                weakReference4 = this.f2129I0;
                                if (weakReference4 == null) {
                                }
                                gi0Var.m2094p();
                                z7 = true;
                            }
                            if (z7) {
                                zArr[2] = false;
                                zM1463S2 = m1463S(64);
                                mo1247M(gi0Var, zM1463S2);
                                size = this.f2132p0.size();
                                i11 = 0;
                                z15 = false;
                                while (i11 < size) {
                                    c0143dm = (C0143dm) this.f2132p0.get(i11);
                                    c0143dm.mo1247M(gi0Var, zM1463S2);
                                    boolean z210 = zM1463S2;
                                    int i69 = size;
                                    if (c0143dm.f1721h == -1) {
                                        z15 = true;
                                    } else {
                                        z15 = true;
                                    }
                                    i11++;
                                    zM1463S2 = z210;
                                    size = i69;
                                    z15 = z15;
                                }
                                z8 = z15;
                            } else {
                                mo1247M(gi0Var, zM1463S);
                                while (i9 < i5) {
                                    ((C0143dm) this.f2132p0.get(i9)).mo1247M(gi0Var, zM1463S);
                                }
                                z8 = false;
                            }
                            if (z6) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i10 < i5) {
                                    C0143dm c0143dm110 = (C0143dm) this.f2132p0.get(i10);
                                    iMax4 = Math.max(iMax4, c0143dm110.m1260o() + c0143dm110.f1704X);
                                    iMax3 = Math.max(iMax3, c0143dm110.m1256i() + c0143dm110.f1705Y);
                                }
                                iMax5 = Math.max(this.f1708a0, iMax4);
                                iMax6 = Math.max(this.f1710b0, iMax3);
                                z8 = z8;
                                r12 = r12;
                                if (i4 == 2) {
                                    z8 = z8;
                                    r12 = r12;
                                    m1245K(iMax5);
                                    iArr[0] = 2;
                                    z8 = true;
                                    r12 = 1;
                                }
                                if (i3 == 2) {
                                    m1242H(iMax6);
                                    iArr[1] = 2;
                                    z8 = true;
                                    r12 = 1;
                                }
                            }
                            iMax = Math.max(this.f1708a0, m1260o());
                            if (iMax > m1260o()) {
                                m1245K(iMax);
                                r7 = 1;
                                iArr[0] = 1;
                                z9 = true;
                                r17 = 1;
                            } else {
                                r7 = 1;
                                r17 = r12;
                                z9 = z8;
                            }
                            iMax2 = Math.max(this.f1710b0, m1256i());
                            if (iMax2 > m1256i()) {
                                m1242H(iMax2);
                                iArr[r7] = r7;
                                r4 = r7;
                                z10 = r4 == true ? 1 : 0;
                            } else {
                                r0 = r17;
                            }
                            if (r0 == 0) {
                                z10 = z9;
                                if (iArr[0] == 2) {
                                    r3 = r0;
                                    z14 = z10;
                                    if (m1260o() > i) {
                                        this.f2124D0 = r7;
                                        iArr[0] = r7;
                                        m1245K(i);
                                        ?? r13 = r7;
                                        z14 = r13 == true ? 1 : 0;
                                        r3 = r13;
                                    }
                                }
                                r0 = r4;
                                r3 = r0;
                                r3 = r0;
                                z14 = z10;
                                z14 = z10;
                                r1 = r3;
                                r1 = r3;
                                z11 = z14;
                                z11 = z14;
                                if (iArr[r7] != 2) {
                                }
                                if (i8 > 8) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                r12 = r2;
                                i7 = i8;
                                z3 = z6;
                                c0585pl2 = c0585pl3;
                                z4 = z13;
                            } else {
                                z10 = z9;
                                r0 = r4;
                                r1 = r0;
                                z11 = z10;
                            }
                            r1 = r3;
                            z11 = z14;
                            z12 = z11;
                            r2 = r1;
                            if (i8 > 8) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            r12 = r2;
                            i7 = i8;
                            z3 = z6;
                            c0585pl2 = c0585pl3;
                            z4 = z13;
                        }
                        z5 = r12 == true ? 1 : 0;
                        this.f2132p0 = arrayList12;
                        if (z5) {
                            iArr[0] = i4;
                            iArr[1] = i3;
                        }
                        mo1239C(gi0Var.f2755m);
                    }
                }
                iMax8 = i14;
                i3 = i15;
                i = i13;
                i4 = i16;
            }
        }
        z = false;
        if (m1463S(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        gi0Var.getClass();
        gi0Var.f2750h = false;
        if (this.f2123C0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList arrayList13 = this.f2132p0;
        if (iArr[0] != 2) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.f2141y0 = 0;
        this.f2142z0 = 0;
        i5 = i2;
        while (i6 < i5) {
            c0143dm2 = (C0143dm) this.f2132p0.get(i6);
            if (c0143dm2 instanceof C0179em) {
                ((C0179em) c0143dm2).m1462Q();
            }
        }
        zM1463S = m1463S(64);
        r12 = z;
        i7 = 0;
        z4 = true;
        while (z4) {
            i8 = i7 + 1;
            gi0Var.m2098t();
            this.f2141y0 = 0;
            this.f2142z0 = 0;
            m1252e(gi0Var);
            while (i12 < i5) {
                ((C0143dm) this.f2132p0.get(i12)).m1252e(gi0Var);
            }
            m1460O(gi0Var);
            weakReference = this.f2126F0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    c0585pl3 = c0585pl2;
                    z6 = z3;
                    gi0Var.m2085f(gi0Var.m2090k((C0585pl) this.f2126F0.get()), gi0Var.m2090k(c0585pl3), 0, 5);
                    this.f2126F0 = null;
                } else {
                    c0585pl3 = c0585pl2;
                    z6 = z3;
                }
                weakReference2 = this.f2128H0;
                if (weakReference2 != null) {
                    gi0Var.m2085f(gi0Var.m2090k(this.f1691K), gi0Var.m2090k((C0585pl) this.f2128H0.get()), 0, 5);
                    this.f2128H0 = null;
                }
                weakReference3 = this.f2127G0;
                if (weakReference3 != null) {
                    c0585pl4 = c0585pl;
                    c0585pl = c0585pl4;
                    gi0Var.m2085f(gi0Var.m2090k((C0585pl) this.f2127G0.get()), gi0Var.m2090k(c0585pl4), 0, 5);
                    this.f2127G0 = null;
                }
                weakReference4 = this.f2129I0;
                if (weakReference4 == null) {
                }
                gi0Var.m2094p();
                z7 = true;
            } else {
                c0585pl3 = c0585pl2;
                z6 = z3;
                weakReference2 = this.f2128H0;
                if (weakReference2 != null) {
                    gi0Var.m2085f(gi0Var.m2090k(this.f1691K), gi0Var.m2090k((C0585pl) this.f2128H0.get()), 0, 5);
                    this.f2128H0 = null;
                }
                weakReference3 = this.f2127G0;
                if (weakReference3 != null) {
                    c0585pl4 = c0585pl;
                    c0585pl = c0585pl4;
                    gi0Var.m2085f(gi0Var.m2090k((C0585pl) this.f2127G0.get()), gi0Var.m2090k(c0585pl4), 0, 5);
                    this.f2127G0 = null;
                }
                weakReference4 = this.f2129I0;
                if (weakReference4 == null) {
                }
                gi0Var.m2094p();
                z7 = true;
            }
            if (z7) {
                zArr[2] = false;
                zM1463S2 = m1463S(64);
                mo1247M(gi0Var, zM1463S2);
                size = this.f2132p0.size();
                i11 = 0;
                z15 = false;
                while (i11 < size) {
                    c0143dm = (C0143dm) this.f2132p0.get(i11);
                    c0143dm.mo1247M(gi0Var, zM1463S2);
                    boolean z211 = zM1463S2;
                    int i610 = size;
                    if (c0143dm.f1721h == -1) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    i11++;
                    zM1463S2 = z211;
                    size = i610;
                    z15 = z15;
                }
                z8 = z15;
            } else {
                mo1247M(gi0Var, zM1463S);
                while (i9 < i5) {
                    ((C0143dm) this.f2132p0.get(i9)).mo1247M(gi0Var, zM1463S);
                }
                z8 = false;
            }
            if (z6) {
                iMax3 = 0;
                iMax4 = 0;
                while (i10 < i5) {
                    C0143dm c0143dm111 = (C0143dm) this.f2132p0.get(i10);
                    iMax4 = Math.max(iMax4, c0143dm111.m1260o() + c0143dm111.f1704X);
                    iMax3 = Math.max(iMax3, c0143dm111.m1256i() + c0143dm111.f1705Y);
                }
                iMax5 = Math.max(this.f1708a0, iMax4);
                iMax6 = Math.max(this.f1710b0, iMax3);
                z8 = z8;
                r12 = r12;
                if (i4 == 2) {
                    z8 = z8;
                    r12 = r12;
                    m1245K(iMax5);
                    iArr[0] = 2;
                    z8 = true;
                    r12 = 1;
                }
                if (i3 == 2) {
                    m1242H(iMax6);
                    iArr[1] = 2;
                    z8 = true;
                    r12 = 1;
                }
            }
            iMax = Math.max(this.f1708a0, m1260o());
            if (iMax > m1260o()) {
                m1245K(iMax);
                r7 = 1;
                iArr[0] = 1;
                z9 = true;
                r17 = 1;
            } else {
                r7 = 1;
                r17 = r12;
                z9 = z8;
            }
            iMax2 = Math.max(this.f1710b0, m1256i());
            if (iMax2 > m1256i()) {
                m1242H(iMax2);
                iArr[r7] = r7;
                r4 = r7;
                z10 = r4 == true ? 1 : 0;
            } else {
                r0 = r17;
            }
            if (r0 == 0) {
                z10 = z9;
                if (iArr[0] == 2) {
                    r3 = r0;
                    z14 = z10;
                    if (m1260o() > i) {
                        this.f2124D0 = r7;
                        iArr[0] = r7;
                        m1245K(i);
                        ?? r14 = r7;
                        z14 = r14 == true ? 1 : 0;
                        r3 = r14;
                    }
                }
                r0 = r4;
                r3 = r0;
                r3 = r0;
                z14 = z10;
                z14 = z10;
                r1 = r3;
                r1 = r3;
                z11 = z14;
                z11 = z14;
                if (iArr[r7] != 2) {
                }
                if (i8 > 8) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                r12 = r2;
                i7 = i8;
                z3 = z6;
                c0585pl2 = c0585pl3;
                z4 = z13;
            } else {
                z10 = z9;
                r0 = r4;
                r1 = r0;
                z11 = z10;
            }
            r1 = r3;
            z11 = z14;
            z12 = z11;
            r2 = r1;
            if (i8 > 8) {
                z13 = false;
            } else {
                z13 = z12;
            }
            r12 = r2;
            i7 = i8;
            z3 = z6;
            c0585pl2 = c0585pl3;
            z4 = z13;
        }
        z5 = r12 == true ? 1 : 0;
        this.f2132p0 = arrayList13;
        if (z5) {
            iArr[0] = i4;
            iArr[1] = i3;
        }
        mo1239C(gi0Var.f2755m);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m1463S(int i) {
        return (this.f2123C0 & i) == i;
    }

    @Override // p000.C0143dm
    /* JADX INFO: renamed from: l */
    public final void mo1259l(StringBuilder sb) {
        sb.append(this.f1725j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f1700T);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f1701U);
        sb.append("\n");
        ArrayList arrayList = this.f2132p0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C0143dm) obj).mo1259l(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
