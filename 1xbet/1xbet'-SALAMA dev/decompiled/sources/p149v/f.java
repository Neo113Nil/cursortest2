package p149v;

import B.d;
import D0.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p136t.c;
import p154w.b;
import p154w.g;
import p154w.m;
import p154w.n;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final c f16993A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f16994B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f16995C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f16996D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f16997E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public b[] f16998F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public b[] f16999G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f17000H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f17001I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public boolean f17002J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public WeakReference f17003K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public WeakReference f17004L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public WeakReference f17005M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public WeakReference f17006N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final HashSet f17007O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final b f17008P0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ArrayList f17009u0 = new ArrayList();

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final C1017n0 f17010v0 = new C1017n0(this);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final a f17011w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f17012x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public d f17013y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f17014z0;

    public f() {
        a aVar = new a();
        aVar.f1617a = true;
        aVar.f1618b = true;
        aVar.f1621e = new ArrayList();
        new ArrayList();
        aVar.f1622f = null;
        aVar.f1623g = new b();
        aVar.f1624h = new ArrayList();
        aVar.f1619c = this;
        aVar.f1620d = this;
        this.f17011w0 = aVar;
        this.f17013y0 = null;
        this.f17014z0 = false;
        this.f16993A0 = new c();
        this.f16996D0 = 0;
        this.f16997E0 = 0;
        this.f16998F0 = new b[4];
        this.f16999G0 = new b[4];
        this.f17000H0 = 257;
        this.f17001I0 = false;
        this.f17002J0 = false;
        this.f17003K0 = null;
        this.f17004L0 = null;
        this.f17005M0 = null;
        this.f17006N0 = null;
        this.f17007O0 = new HashSet();
        this.f17008P0 = new b();
    }

    public static void W(e eVar, d dVar, b bVar) {
        int i7;
        int i8;
        if (dVar == null) {
            return;
        }
        if (eVar.f16965i0 == 8 || (eVar instanceof i) || (eVar instanceof a)) {
            bVar.f17224e = 0;
            bVar.f17225f = 0;
            return;
        }
        d[] dVarArr = eVar.f16943U;
        bVar.f17220a = dVarArr[0];
        bVar.f17221b = dVarArr[1];
        bVar.f17222c = eVar.r();
        bVar.f17223d = eVar.l();
        bVar.f17228i = false;
        bVar.j = 0;
        d dVar2 = bVar.f17220a;
        d dVar3 = d.f16920c;
        boolean z4 = dVar2 == dVar3;
        boolean z7 = bVar.f17221b == dVar3;
        boolean z8 = z4 && eVar.f16947Y > 0.0f;
        boolean z9 = z7 && eVar.f16947Y > 0.0f;
        d dVar4 = d.f16919b;
        d dVar5 = d.f16918a;
        if (z4 && eVar.u(0) && eVar.f16981r == 0 && !z8) {
            bVar.f17220a = dVar4;
            if (z7 && eVar.f16983s == 0) {
                bVar.f17220a = dVar5;
            }
            z4 = false;
        }
        if (z7 && eVar.u(1) && eVar.f16983s == 0 && !z9) {
            bVar.f17221b = dVar4;
            if (z4 && eVar.f16981r == 0) {
                bVar.f17221b = dVar5;
            }
            z7 = false;
        }
        if (eVar.B()) {
            bVar.f17220a = dVar5;
            z4 = false;
        }
        if (eVar.C()) {
            bVar.f17221b = dVar5;
            z7 = false;
        }
        int[] iArr = eVar.f16985t;
        if (z8) {
            if (iArr[0] == 4) {
                bVar.f17220a = dVar5;
            } else if (!z7) {
                if (bVar.f17221b == dVar5) {
                    i8 = bVar.f17223d;
                } else {
                    bVar.f17220a = dVar4;
                    dVar.b(eVar, bVar);
                    i8 = bVar.f17225f;
                }
                bVar.f17220a = dVar5;
                bVar.f17222c = (int) (eVar.f16947Y * i8);
            }
        }
        if (z9) {
            if (iArr[1] == 4) {
                bVar.f17221b = dVar5;
            } else if (!z4) {
                if (bVar.f17220a == dVar5) {
                    i7 = bVar.f17222c;
                } else {
                    bVar.f17221b = dVar4;
                    dVar.b(eVar, bVar);
                    i7 = bVar.f17224e;
                }
                bVar.f17221b = dVar5;
                if (eVar.f16948Z == -1) {
                    bVar.f17223d = (int) (i7 / eVar.f16947Y);
                } else {
                    bVar.f17223d = (int) (eVar.f16947Y * i7);
                }
            }
        }
        dVar.b(eVar, bVar);
        eVar.P(bVar.f17224e);
        eVar.M(bVar.f17225f);
        eVar.f16927E = bVar.f17227h;
        eVar.J(bVar.f17226g);
        bVar.j = 0;
    }

    @Override // p149v.e
    public final void D() {
        this.f16993A0.t();
        this.f16994B0 = 0;
        this.f16995C0 = 0;
        this.f17009u0.clear();
        super.D();
    }

    @Override // p149v.e
    public final void G(C1017n0 c1017n0) {
        super.G(c1017n0);
        int size = this.f17009u0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((e) this.f17009u0.get(i7)).G(c1017n0);
        }
    }

    @Override // p149v.e
    public final void Q(boolean z4, boolean z7) {
        super.Q(z4, z7);
        int size = this.f17009u0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((e) this.f17009u0.get(i7)).Q(z4, z7);
        }
    }

    public final void S(e eVar, int i7) {
        if (i7 == 0) {
            int i8 = this.f16996D0 + 1;
            b[] bVarArr = this.f16999G0;
            if (i8 >= bVarArr.length) {
                this.f16999G0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f16999G0;
            int i9 = this.f16996D0;
            bVarArr2[i9] = new b(eVar, 0, this.f17014z0);
            this.f16996D0 = i9 + 1;
            return;
        }
        if (i7 == 1) {
            int i10 = this.f16997E0 + 1;
            b[] bVarArr3 = this.f16998F0;
            if (i10 >= bVarArr3.length) {
                this.f16998F0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f16998F0;
            int i11 = this.f16997E0;
            bVarArr4[i11] = new b(eVar, 1, this.f17014z0);
            this.f16997E0 = i11 + 1;
        }
    }

    public final void T(c cVar) {
        boolean zX = X(64);
        b(cVar, zX);
        int size = this.f17009u0.size();
        boolean z4 = false;
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = (e) this.f17009u0.get(i7);
            boolean[] zArr = eVar.f16942T;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z4 = true;
            }
        }
        if (z4) {
            for (int i8 = 0; i8 < size; i8++) {
                e eVar2 = (e) this.f17009u0.get(i8);
                if (eVar2 instanceof a) {
                    a aVar = (a) eVar2;
                    for (int i9 = 0; i9 < aVar.f17062v0; i9++) {
                        e eVar3 = aVar.f17061u0[i9];
                        if (aVar.f16890x0 || eVar3.c()) {
                            int i10 = aVar.f16889w0;
                            if (i10 == 0 || i10 == 1) {
                                eVar3.f16942T[0] = true;
                            } else if (i10 == 2 || i10 == 3) {
                                eVar3.f16942T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f17007O0;
        hashSet.clear();
        for (int i11 = 0; i11 < size; i11++) {
            e eVar4 = (e) this.f17009u0.get(i11);
            eVar4.getClass();
            boolean z7 = eVar4 instanceof m;
            if (z7 || (eVar4 instanceof i)) {
                if (z7) {
                    hashSet.add(eVar4);
                } else {
                    eVar4.b(cVar, zX);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                m mVar = (m) ((e) it.next());
                for (int i12 = 0; i12 < mVar.f17062v0; i12++) {
                    if (hashSet.contains(mVar.f17061u0[i12])) {
                        mVar.b(cVar, zX);
                        hashSet.remove(mVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).b(cVar, zX);
                }
                hashSet.clear();
            }
        }
        boolean z8 = c.f16234p;
        d dVar = d.f16919b;
        if (z8) {
            HashSet<e> hashSet2 = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar5 = (e) this.f17009u0.get(i13);
                eVar5.getClass();
                if (!(eVar5 instanceof m) && !(eVar5 instanceof i)) {
                    hashSet2.add(eVar5);
                }
            }
            a(this, cVar, hashSet2, this.f16943U[0] == dVar ? 0 : 1, false);
            for (e eVar6 : hashSet2) {
                k.b(this, cVar, eVar6);
                eVar6.b(cVar, zX);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                e eVar7 = (e) this.f17009u0.get(i14);
                if (eVar7 instanceof f) {
                    d[] dVarArr = eVar7.f16943U;
                    d dVar2 = dVarArr[0];
                    d dVar3 = dVarArr[1];
                    d dVar4 = d.f16918a;
                    if (dVar2 == dVar) {
                        eVar7.N(dVar4);
                    }
                    if (dVar3 == dVar) {
                        eVar7.O(dVar4);
                    }
                    eVar7.b(cVar, zX);
                    if (dVar2 == dVar) {
                        eVar7.N(dVar2);
                    }
                    if (dVar3 == dVar) {
                        eVar7.O(dVar3);
                    }
                } else {
                    k.b(this, cVar, eVar7);
                    if (!(eVar7 instanceof m) && !(eVar7 instanceof i)) {
                        eVar7.b(cVar, zX);
                    }
                }
            }
        }
        if (this.f16996D0 > 0) {
            k.a(this, cVar, null, 0);
        }
        if (this.f16997E0 > 0) {
            k.a(this, cVar, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    public final boolean U(int i7, boolean z4) {
        boolean z7;
        d dVar;
        boolean z8;
        a aVar = this.f17011w0;
        f fVar = (f) aVar.f1619c;
        boolean z9 = false;
        d dVarK = fVar.k(0);
        d dVarK2 = fVar.k(1);
        int iS = fVar.s();
        int iT = fVar.t();
        ArrayList<n> arrayList = (ArrayList) aVar.f1621e;
        d dVar2 = d.f16918a;
        if (z4 && (dVarK == (dVar = d.f16919b) || dVarK2 == dVar)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z8 = z4;
                    break;
                }
                n nVar = (n) it.next();
                if (nVar.f17260f == i7 && !nVar.k()) {
                    z8 = false;
                    break;
                }
            }
            if (i7 == 0) {
                if (z8 && dVarK == dVar) {
                    fVar.N(dVar2);
                    fVar.P(aVar.d(fVar, 0));
                    fVar.f16954d.f17259e.d(fVar.r());
                }
            } else if (z8 && dVarK2 == dVar) {
                fVar.O(dVar2);
                fVar.M(aVar.d(fVar, 1));
                fVar.f16956e.f17259e.d(fVar.l());
            }
        }
        d dVar3 = d.f16921d;
        if (i7 == 0) {
            d dVar4 = fVar.f16943U[0];
            if (dVar4 == dVar2 || dVar4 == dVar3) {
                int iR = fVar.r() + iS;
                fVar.f16954d.f17263i.d(iR);
                fVar.f16954d.f17259e.d(iR - iS);
                z7 = true;
            } else {
                z7 = false;
            }
        } else {
            d dVar5 = fVar.f16943U[1];
            if (dVar5 == dVar2 || dVar5 == dVar3) {
                int iL = fVar.l() + iT;
                fVar.f16956e.f17263i.d(iL);
                fVar.f16956e.f17259e.d(iL - iT);
                z7 = true;
            } else {
                z7 = false;
            }
        }
        aVar.g();
        for (n nVar2 : arrayList) {
            if (nVar2.f17260f == i7 && (nVar2.f17256b != fVar || nVar2.f17261g)) {
                nVar2.e();
            }
        }
        for (n nVar3 : arrayList) {
            if (nVar3.f17260f == i7 && (z7 || nVar3.f17256b != fVar)) {
                if (!nVar3.f17262h.j || !nVar3.f17263i.j || (!(nVar3 instanceof p154w.c) && !nVar3.f17259e.j)) {
                    fVar.N(dVarK);
                    fVar.O(dVarK2);
                    return z9;
                }
            }
        }
        z9 = true;
        fVar.N(dVarK);
        fVar.O(dVarK2);
        return z9;
    }

    /* JADX WARN: Code duplicated, block: B:349:0x0601  */
    /* JADX WARN: Code duplicated, block: B:352:0x060d  */
    /* JADX WARN: Code duplicated, block: B:359:0x0624  */
    /* JADX WARN: Code duplicated, block: B:360:0x062b  */
    /* JADX WARN: Code duplicated, block: B:366:0x063e  */
    /* JADX WARN: Code duplicated, block: B:372:0x0656  */
    /* JADX WARN: Code duplicated, block: B:375:0x065c  */
    /* JADX WARN: Code duplicated, block: B:377:0x0664 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:380:0x0672  */
    /* JADX WARN: Code duplicated, block: B:391:0x069b  */
    /* JADX WARN: Code duplicated, block: B:396:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:403:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:406:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:408:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:412:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:417:0x06f7 A[Catch: Exception -> 0x0705, LOOP:11: B:416:0x06f5->B:417:0x06f7, LOOP_END, TryCatch #7 {Exception -> 0x0705, blocks: (B:415:0x06ed, B:417:0x06f7, B:421:0x0712), top: B:560:0x06ed }] */
    /* JADX WARN: Code duplicated, block: B:426:0x071f A[Catch: Exception -> 0x0759, TRY_LEAVE, TryCatch #3 {Exception -> 0x0759, blocks: (B:424:0x0719, B:426:0x071f), top: B:552:0x0719 }] */
    /* JADX WARN: Code duplicated, block: B:442:0x0763  */
    /* JADX WARN: Code duplicated, block: B:445:0x076f A[Catch: Exception -> 0x0744, TryCatch #8 {Exception -> 0x0744, blocks: (B:432:0x073d, B:443:0x076b, B:445:0x076f, B:447:0x0775, B:448:0x0791, B:450:0x0795, B:452:0x079b, B:456:0x07b3, B:459:0x07be, B:461:0x07c2, B:463:0x07c8), top: B:562:0x073d }] */
    /* JADX WARN: Code duplicated, block: B:450:0x0795 A[Catch: Exception -> 0x0744, TryCatch #8 {Exception -> 0x0744, blocks: (B:432:0x073d, B:443:0x076b, B:445:0x076f, B:447:0x0775, B:448:0x0791, B:450:0x0795, B:452:0x079b, B:456:0x07b3, B:459:0x07be, B:461:0x07c2, B:463:0x07c8), top: B:562:0x073d }] */
    /* JADX WARN: Code duplicated, block: B:459:0x07be A[Catch: Exception -> 0x0744, PHI: r22
      0x07be: PHI (r22v7 v.c) = (r22v2 v.c), (r22v2 v.c), (r22v9 v.c) binds: [B:449:0x0793, B:451:0x0799, B:456:0x07b3] A[DONT_GENERATE, DONT_INLINE], TryCatch #8 {Exception -> 0x0744, blocks: (B:432:0x073d, B:443:0x076b, B:445:0x076f, B:447:0x0775, B:448:0x0791, B:450:0x0795, B:452:0x079b, B:456:0x07b3, B:459:0x07be, B:461:0x07c2, B:463:0x07c8), top: B:562:0x073d }] */
    /* JADX WARN: Code duplicated, block: B:461:0x07c2 A[Catch: Exception -> 0x0744, TryCatch #8 {Exception -> 0x0744, blocks: (B:432:0x073d, B:443:0x076b, B:445:0x076f, B:447:0x0775, B:448:0x0791, B:450:0x0795, B:452:0x079b, B:456:0x07b3, B:459:0x07be, B:461:0x07c2, B:463:0x07c8), top: B:562:0x073d }] */
    /* JADX WARN: Code duplicated, block: B:475:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:485:0x0827  */
    /* JADX WARN: Code duplicated, block: B:487:0x083f  */
    /* JADX WARN: Code duplicated, block: B:489:0x0853  */
    /* JADX WARN: Code duplicated, block: B:491:0x0857  */
    /* JADX WARN: Code duplicated, block: B:494:0x0863  */
    /* JADX WARN: Code duplicated, block: B:496:0x086a A[LOOP:14: B:495:0x0868->B:496:0x086a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:500:0x087e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:505:0x088a A[LOOP:13: B:504:0x0888->B:505:0x088a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:508:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:512:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:517:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:520:0x090f  */
    /* JADX WARN: Code duplicated, block: B:521:0x091c  */
    /* JADX WARN: Code duplicated, block: B:523:0x091f  */
    /* JADX WARN: Code duplicated, block: B:525:0x0926 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:528:0x092e  */
    /* JADX WARN: Code duplicated, block: B:531:0x0941 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:536:0x095f A[PHI: r18 r24
      0x095f: PHI (r18v7 ??) = (r18v6 ??), (r18v10 ??), (r18v10 ??) binds: [B:522:0x091d, B:530:0x093f, B:531:0x0941] A[DONT_GENERATE, DONT_INLINE]
      0x095f: PHI (r24v9 boolean) = (r24v8 boolean), (r24v12 boolean), (r24v12 boolean) binds: [B:522:0x091d, B:530:0x093f, B:531:0x0941] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:538:0x0964  */
    /* JADX WARN: Code duplicated, block: B:539:0x0966  */
    /* JADX WARN: Code duplicated, block: B:543:0x0979  */
    /* JADX WARN: Code duplicated, block: B:552:0x0719 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:0x06d7 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v33 */
    /* JADX WARN: Type inference failed for: r18v34 */
    /* JADX WARN: Type inference failed for: r18v35 */
    /* JADX WARN: Type inference failed for: r18v36 */
    /* JADX WARN: Type inference failed for: r18v37 */
    /* JADX WARN: Type inference failed for: r18v38 */
    /* JADX WARN: Type inference failed for: r18v39 */
    /* JADX WARN: Type inference failed for: r18v40 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r32v0, types: [v.e, v.f] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v17 */
    public final void V() {
        int i7;
        d dVar;
        c cVar;
        d dVar2;
        d dVar3;
        d dVar4;
        boolean z4;
        boolean z7;
        char c3;
        ArrayList arrayList;
        d[] dVarArr;
        boolean z8;
        int i8;
        int i9;
        boolean zX;
        boolean z9;
        int i10;
        ?? r15;
        boolean z10;
        int i11;
        c cVar2;
        boolean z11;
        ?? r21;
        boolean[] zArr;
        int i12;
        boolean z12;
        int iMax;
        boolean z13;
        int iMax2;
        ?? r7;
        ?? r18;
        int i13;
        ?? r19;
        int i14;
        ?? r110;
        ?? r16;
        int i15;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zX2;
        int size;
        int i16;
        boolean z14;
        e eVar;
        ?? r22;
        int i17;
        WeakReference weakReference;
        c cVar3;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        e eVar2;
        d dVar5;
        d dVar6;
        m mVar;
        m mVar2;
        int i18;
        int iR;
        int i19;
        int iL;
        int i20;
        int iB;
        m mVar3;
        m mVar4;
        d dVar7;
        this.f16950a0 = 0;
        this.f16952b0 = 0;
        this.f17001I0 = false;
        this.f17002J0 = false;
        int size2 = this.f17009u0.size();
        int iMax7 = Math.max(0, r());
        int iMax8 = Math.max(0, l());
        d[] dVarArr2 = this.f16943U;
        d dVar8 = dVarArr2[1];
        d dVar9 = dVarArr2[0];
        int i21 = this.f17012x0;
        d dVar10 = d.f16920c;
        c cVar4 = this.f16933K;
        c cVar5 = this.f16932J;
        d dVar11 = d.f16918a;
        if (i21 == 0 && k.c(this.f17000H0, 1)) {
            d dVar12 = this.f17013y0;
            d[] dVarArr3 = this.f16943U;
            d dVar13 = dVarArr3[0];
            d dVar14 = dVarArr3[1];
            F();
            ArrayList arrayList2 = this.f17009u0;
            int size3 = arrayList2.size();
            for (int i22 = 0; i22 < size3; i22++) {
                ((e) arrayList2.get(i22)).F();
            }
            boolean z15 = this.f17014z0;
            if (dVar13 == dVar11) {
                K(0, r());
            } else {
                cVar5.l(0);
                this.f16950a0 = 0;
            }
            boolean z16 = false;
            int i23 = 0;
            boolean z17 = false;
            while (i23 < size3) {
                c cVar6 = cVar5;
                e eVar3 = (e) arrayList2.get(i23);
                int i24 = iMax7;
                if (eVar3 instanceof i) {
                    i iVar = (i) eVar3;
                    dVar7 = dVar8;
                    if (iVar.f17059y0 == 1) {
                        int i25 = iVar.f17056v0;
                        if (i25 != -1) {
                            iVar.S(i25);
                        } else if (iVar.f17057w0 != -1 && B()) {
                            iVar.S(r() - iVar.f17057w0);
                        } else if (B()) {
                            iVar.S((int) ((iVar.f17055u0 * r()) + 0.5f));
                        }
                        z16 = true;
                    }
                } else {
                    dVar7 = dVar8;
                    if ((eVar3 instanceof a) && ((a) eVar3).W() == 0) {
                        z17 = true;
                    }
                }
                i23++;
                iMax7 = i24;
                cVar5 = cVar6;
                dVar8 = dVar7;
            }
            i7 = iMax7;
            dVar = dVar8;
            cVar = cVar5;
            if (z16) {
                for (int i26 = 0; i26 < size3; i26++) {
                    e eVar4 = (e) arrayList2.get(i26);
                    if (eVar4 instanceof i) {
                        i iVar2 = (i) eVar4;
                        if (iVar2.f17059y0 == 1) {
                            g.c(0, dVar12, iVar2, z15);
                        }
                    }
                }
            }
            g.c(0, dVar12, this, z15);
            if (z17) {
                for (int i27 = 0; i27 < size3; i27++) {
                    e eVar5 = (e) arrayList2.get(i27);
                    if (eVar5 instanceof a) {
                        a aVar = (a) eVar5;
                        if (aVar.W() == 0 && aVar.V()) {
                            g.c(1, dVar12, aVar, z15);
                        }
                    }
                }
            }
            if (dVar14 == dVar11) {
                L(0, l());
            } else {
                cVar4.l(0);
                this.f16952b0 = 0;
            }
            boolean z18 = false;
            boolean z19 = false;
            for (int i28 = 0; i28 < size3; i28++) {
                e eVar6 = (e) arrayList2.get(i28);
                if (eVar6 instanceof i) {
                    i iVar3 = (i) eVar6;
                    if (iVar3.f17059y0 == 0) {
                        int i29 = iVar3.f17056v0;
                        if (i29 != -1) {
                            iVar3.S(i29);
                        } else if (iVar3.f17057w0 != -1 && C()) {
                            iVar3.S(l() - iVar3.f17057w0);
                        } else if (C()) {
                            iVar3.S((int) ((iVar3.f17055u0 * l()) + 0.5f));
                        }
                        z18 = true;
                    }
                } else if ((eVar6 instanceof a) && ((a) eVar6).W() == 1) {
                    z19 = true;
                }
            }
            if (z18) {
                for (int i30 = 0; i30 < size3; i30++) {
                    e eVar7 = (e) arrayList2.get(i30);
                    if (eVar7 instanceof i) {
                        i iVar4 = (i) eVar7;
                        if (iVar4.f17059y0 == 0) {
                            g.i(1, dVar12, iVar4);
                        }
                    }
                }
            }
            g.i(0, dVar12, this);
            if (z19) {
                for (int i31 = 0; i31 < size3; i31++) {
                    e eVar8 = (e) arrayList2.get(i31);
                    if (eVar8 instanceof a) {
                        a aVar2 = (a) eVar8;
                        if (aVar2.W() == 1 && aVar2.V()) {
                            g.i(1, dVar12, aVar2);
                        }
                    }
                }
            }
            for (int i32 = 0; i32 < size3; i32++) {
                e eVar9 = (e) arrayList2.get(i32);
                if (eVar9.A() && g.a(eVar9)) {
                    W(eVar9, dVar12, g.f17243a);
                    if (!(eVar9 instanceof i)) {
                        g.c(0, dVar12, eVar9, z15);
                        g.i(0, dVar12, eVar9);
                    } else if (((i) eVar9).f17059y0 == 0) {
                        g.i(0, dVar12, eVar9);
                    } else {
                        g.c(0, dVar12, eVar9, z15);
                    }
                }
            }
            for (int i33 = 0; i33 < size2; i33++) {
                e eVar10 = (e) this.f17009u0.get(i33);
                if (eVar10.A() && !(eVar10 instanceof i) && !(eVar10 instanceof a) && !(eVar10 instanceof m) && !eVar10.f16929G) {
                    d dVarK = eVar10.k(0);
                    d dVarK2 = eVar10.k(1);
                    if (dVarK != dVar10 || eVar10.f16981r == 1 || dVarK2 != dVar10 || eVar10.f16983s == 1) {
                        W(eVar10, this.f17013y0, new b());
                    }
                }
            }
        } else {
            i7 = iMax7;
            iMax8 = iMax8;
            dVar = dVar8;
            cVar = cVar5;
        }
        d dVar15 = d.f16919b;
        c cVar7 = this.f16993A0;
        if (size2 > 2) {
            d dVar16 = dVar;
            if ((dVar9 == dVar15 || dVar16 == dVar15) && k.c(this.f17000H0, 1024)) {
                d dVar17 = this.f17013y0;
                ArrayList arrayList3 = this.f17009u0;
                int size4 = arrayList3.size();
                int i34 = 0;
                while (true) {
                    if (i34 < size4) {
                        e eVar11 = (e) arrayList3.get(i34);
                        d[] dVarArr4 = this.f16943U;
                        d dVar18 = dVarArr4[0];
                        d dVar19 = dVarArr4[1];
                        cVar4 = cVar4;
                        d[] dVarArr5 = eVar11.f16943U;
                        size2 = size2;
                        if (g.h(dVar18, dVar19, dVarArr5[0], dVarArr5[1]) && !(eVar11 instanceof h)) {
                            i34++;
                            cVar4 = cVar4;
                            size2 = size2;
                        } else {
                            dVar3 = dVar15;
                            cVar7 = cVar7;
                            dVar5 = dVar9;
                            dVar6 = dVar16;
                            dVar4 = dVar11;
                        }
                    } else {
                        size2 = size2;
                        cVar4 = cVar4;
                        int i35 = 0;
                        ArrayList arrayList4 = null;
                        ArrayList<j> arrayList5 = null;
                        ArrayList arrayList6 = null;
                        ArrayList<j> arrayList7 = null;
                        ArrayList arrayList8 = null;
                        ArrayList arrayList9 = null;
                        while (i35 < size4) {
                            d dVar20 = dVar16;
                            e eVar12 = (e) arrayList3.get(i35);
                            d dVar21 = dVar9;
                            d[] dVarArr6 = this.f16943U;
                            d dVar22 = dVar11;
                            d dVar23 = dVarArr6[0];
                            d dVar24 = dVarArr6[1];
                            c cVar8 = cVar7;
                            d[] dVarArr7 = eVar12.f16943U;
                            d dVar25 = dVar15;
                            if (!g.h(dVar23, dVar24, dVarArr7[0], dVarArr7[1])) {
                                W(eVar12, dVar17, this.f17008P0);
                            }
                            boolean z20 = eVar12 instanceof i;
                            if (z20) {
                                i iVar5 = (i) eVar12;
                                if (iVar5.f17059y0 == 0) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(iVar5);
                                }
                                if (iVar5.f17059y0 == 1) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(iVar5);
                                }
                            }
                            if (eVar12 instanceof j) {
                                if (eVar12 instanceof a) {
                                    a aVar3 = (a) eVar12;
                                    if (aVar3.W() == 0) {
                                        if (arrayList5 == null) {
                                            arrayList5 = new ArrayList();
                                        }
                                        arrayList5.add(aVar3);
                                    }
                                    if (aVar3.W() == 1) {
                                        if (arrayList7 == null) {
                                            arrayList7 = new ArrayList();
                                        }
                                        arrayList7.add(aVar3);
                                    }
                                } else {
                                    j jVar = (j) eVar12;
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(jVar);
                                    if (arrayList7 == null) {
                                        arrayList7 = new ArrayList();
                                    }
                                    arrayList7.add(jVar);
                                }
                            }
                            if (eVar12.f16932J.f16914f == null && eVar12.f16934L.f16914f == null && !z20 && !(eVar12 instanceof a)) {
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(eVar12);
                            }
                            if (eVar12.f16933K.f16914f == null && eVar12.f16935M.f16914f == null && eVar12.f16936N.f16914f == null && !z20 && !(eVar12 instanceof a)) {
                                if (arrayList9 == null) {
                                    arrayList9 = new ArrayList();
                                }
                                ArrayList arrayList10 = arrayList9;
                                arrayList10.add(eVar12);
                                arrayList9 = arrayList10;
                            }
                            i35++;
                            dVar9 = dVar21;
                            dVar16 = dVar20;
                            dVar11 = dVar22;
                            cVar7 = cVar8;
                            dVar15 = dVar25;
                        }
                        d dVar26 = dVar15;
                        c cVar9 = cVar7;
                        dVar5 = dVar9;
                        dVar6 = dVar16;
                        d dVar27 = dVar11;
                        ArrayList<m> arrayList11 = new ArrayList();
                        if (arrayList4 != null) {
                            Iterator it = arrayList4.iterator();
                            while (it.hasNext()) {
                                g.b((i) it.next(), 0, arrayList11, null);
                            }
                        }
                        int i36 = 0;
                        m mVar5 = null;
                        if (arrayList5 != null) {
                            for (j jVar2 : arrayList5) {
                                m mVarB = g.b(jVar2, i36, arrayList11, mVar5);
                                jVar2.T(i36, arrayList11, mVarB);
                                mVarB.a(arrayList11);
                                i36 = 0;
                                mVar5 = null;
                            }
                        }
                        HashSet hashSet = j(2).f16909a;
                        if (hashSet != null) {
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                g.b(((c) it2.next()).f16912d, 0, arrayList11, null);
                            }
                        }
                        HashSet hashSet2 = j(4).f16909a;
                        if (hashSet2 != null) {
                            Iterator it3 = hashSet2.iterator();
                            while (it3.hasNext()) {
                                g.b(((c) it3.next()).f16912d, 0, arrayList11, null);
                            }
                        }
                        HashSet hashSet3 = j(7).f16909a;
                        if (hashSet3 != null) {
                            Iterator it4 = hashSet3.iterator();
                            while (it4.hasNext()) {
                                g.b(((c) it4.next()).f16912d, 0, arrayList11, null);
                            }
                        }
                        m mVar6 = null;
                        if (arrayList8 != null) {
                            Iterator it5 = arrayList8.iterator();
                            while (it5.hasNext()) {
                                g.b((e) it5.next(), 0, arrayList11, null);
                            }
                        }
                        if (arrayList6 != null) {
                            Iterator it6 = arrayList6.iterator();
                            while (it6.hasNext()) {
                                g.b((i) it6.next(), 1, arrayList11, null);
                            }
                        }
                        int i37 = 1;
                        if (arrayList7 != null) {
                            for (j jVar3 : arrayList7) {
                                m mVarB2 = g.b(jVar3, i37, arrayList11, mVar6);
                                jVar3.T(i37, arrayList11, mVarB2);
                                mVarB2.a(arrayList11);
                                i37 = 1;
                                mVar6 = null;
                            }
                        }
                        HashSet hashSet4 = j(3).f16909a;
                        if (hashSet4 != null) {
                            Iterator it7 = hashSet4.iterator();
                            while (it7.hasNext()) {
                                g.b(((c) it7.next()).f16912d, 1, arrayList11, null);
                            }
                        }
                        HashSet hashSet5 = j(6).f16909a;
                        if (hashSet5 != null) {
                            Iterator it8 = hashSet5.iterator();
                            while (it8.hasNext()) {
                                g.b(((c) it8.next()).f16912d, 1, arrayList11, null);
                            }
                        }
                        HashSet hashSet6 = j(5).f16909a;
                        if (hashSet6 != null) {
                            Iterator it9 = hashSet6.iterator();
                            while (it9.hasNext()) {
                                g.b(((c) it9.next()).f16912d, 1, arrayList11, null);
                            }
                        }
                        HashSet hashSet7 = j(7).f16909a;
                        if (hashSet7 != null) {
                            Iterator it10 = hashSet7.iterator();
                            while (it10.hasNext()) {
                                g.b(((c) it10.next()).f16912d, 1, arrayList11, null);
                            }
                        }
                        if (arrayList9 != null) {
                            Iterator it11 = arrayList9.iterator();
                            while (it11.hasNext()) {
                                g.b((e) it11.next(), 1, arrayList11, null);
                            }
                        }
                        for (int i38 = 0; i38 < size4; i38++) {
                            e eVar13 = (e) arrayList3.get(i38);
                            d[] dVarArr8 = eVar13.f16943U;
                            if (dVarArr8[0] == dVar10 && dVarArr8[1] == dVar10) {
                                int i39 = eVar13.f16984s0;
                                int size5 = arrayList11.size();
                                int i40 = 0;
                                while (true) {
                                    if (i40 >= size5) {
                                        mVar3 = null;
                                        break;
                                    }
                                    mVar3 = (m) arrayList11.get(i40);
                                    if (i39 == mVar3.f17251b) {
                                        break;
                                    } else {
                                        i40++;
                                    }
                                }
                                int i41 = eVar13.f16986t0;
                                int size6 = arrayList11.size();
                                int i42 = 0;
                                while (true) {
                                    if (i42 >= size6) {
                                        mVar4 = null;
                                        break;
                                    }
                                    mVar4 = (m) arrayList11.get(i42);
                                    if (i41 == mVar4.f17251b) {
                                        break;
                                    } else {
                                        i42++;
                                    }
                                }
                                if (mVar3 != null && mVar4 != null) {
                                    mVar3.c(0, mVar4);
                                    mVar4.f17252c = 2;
                                    arrayList11.remove(mVar3);
                                }
                            }
                        }
                        if (arrayList11.size() <= 1) {
                            dVar4 = dVar27;
                            cVar7 = cVar9;
                            dVar3 = dVar26;
                        } else {
                            dVar3 = dVar26;
                            if (this.f16943U[0] == dVar3) {
                                int i43 = 0;
                                mVar = null;
                                for (m mVar7 : arrayList11) {
                                    if (mVar7.f17252c != 1) {
                                        c cVar10 = cVar9;
                                        int iB2 = mVar7.b(cVar10, 0);
                                        if (iB2 > i43) {
                                            mVar = mVar7;
                                            i43 = iB2;
                                        }
                                        cVar9 = cVar10;
                                    }
                                }
                                cVar7 = cVar9;
                                dVar4 = dVar27;
                                if (mVar != null) {
                                    N(dVar4);
                                    P(i43);
                                }
                                if (this.f16943U[1] == dVar3) {
                                    i20 = 0;
                                    mVar2 = null;
                                    for (m mVar8 : arrayList11) {
                                        if (mVar8.f17252c != 0 && (iB = mVar8.b(cVar7, 1)) > i20) {
                                            mVar2 = mVar8;
                                            i20 = iB;
                                        }
                                    }
                                    if (mVar2 != null) {
                                        O(dVar4);
                                        M(i20);
                                    } else {
                                        mVar2 = null;
                                    }
                                } else {
                                    mVar2 = null;
                                }
                                if (mVar == null || mVar2 != null) {
                                    dVar9 = dVar5;
                                    if (dVar9 == dVar3) {
                                        i18 = i7;
                                        if (i18 < r() || i18 <= 0) {
                                            iR = r();
                                        } else {
                                            P(i18);
                                            this.f17001I0 = true;
                                        }
                                        dVar2 = dVar6;
                                        if (dVar2 == dVar3) {
                                            i19 = iMax8;
                                            if (i19 < l() || i19 <= 0) {
                                                iL = l();
                                            } else {
                                                M(i19);
                                                this.f17002J0 = true;
                                            }
                                            iMax8 = iL;
                                            i7 = iR;
                                            z4 = true;
                                        } else {
                                            i19 = iMax8;
                                        }
                                        iL = i19;
                                        iMax8 = iL;
                                        i7 = iR;
                                        z4 = true;
                                    } else {
                                        i18 = i7;
                                    }
                                    iR = i18;
                                    dVar2 = dVar6;
                                    if (dVar2 == dVar3) {
                                        i19 = iMax8;
                                        if (i19 < l()) {
                                        }
                                        iL = l();
                                        iMax8 = iL;
                                        i7 = iR;
                                        z4 = true;
                                    } else {
                                        i19 = iMax8;
                                    }
                                    iL = i19;
                                    iMax8 = iL;
                                    i7 = iR;
                                    z4 = true;
                                }
                            } else {
                                dVar4 = dVar27;
                                cVar7 = cVar9;
                            }
                            mVar = null;
                            if (this.f16943U[1] == dVar3) {
                                i20 = 0;
                                mVar2 = null;
                                while (r0.hasNext()) {
                                    if (mVar8.f17252c != 0) {
                                        mVar2 = mVar8;
                                        i20 = iB;
                                    }
                                }
                                if (mVar2 != null) {
                                    O(dVar4);
                                    M(i20);
                                } else {
                                    mVar2 = null;
                                }
                            } else {
                                mVar2 = null;
                            }
                            if (mVar == null) {
                            }
                            dVar9 = dVar5;
                            if (dVar9 == dVar3) {
                                i18 = i7;
                                if (i18 < r()) {
                                }
                                iR = r();
                                dVar2 = dVar6;
                                if (dVar2 == dVar3) {
                                    i19 = iMax8;
                                    if (i19 < l()) {
                                    }
                                    iL = l();
                                    iMax8 = iL;
                                    i7 = iR;
                                    z4 = true;
                                } else {
                                    i19 = iMax8;
                                }
                                iL = i19;
                                iMax8 = iL;
                                i7 = iR;
                                z4 = true;
                            } else {
                                i18 = i7;
                            }
                            iR = i18;
                            dVar2 = dVar6;
                            if (dVar2 == dVar3) {
                                i19 = iMax8;
                                if (i19 < l()) {
                                }
                                iL = l();
                                iMax8 = iL;
                                i7 = iR;
                                z4 = true;
                            } else {
                                i19 = iMax8;
                            }
                            iL = i19;
                            iMax8 = iL;
                            i7 = iR;
                            z4 = true;
                        }
                    }
                    iMax8 = iMax8;
                    i7 = i7;
                    dVar9 = dVar5;
                    dVar2 = dVar6;
                    z4 = false;
                }
            } else {
                dVar2 = dVar16;
            }
            if (!X(64) || X(128)) {
                z7 = true;
            } else {
                z7 = false;
            }
            cVar7.getClass();
            cVar7.f16242g = false;
            if (this.f17000H0 == 0 && z7) {
                c3 = 1;
                cVar7.f16242g = true;
            } else {
                c3 = 1;
            }
            arrayList = this.f17009u0;
            dVarArr = this.f16943U;
            if (dVarArr[0] != dVar3 || dVarArr[c3] == dVar3) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f16996D0 = 0;
            this.f16997E0 = 0;
            i8 = size2;
            for (i9 = 0; i9 < i8; i9++) {
                eVar2 = (e) this.f17009u0.get(i9);
                if (eVar2 instanceof f) {
                    ((f) eVar2).V();
                }
            }
            zX = X(64);
            z9 = z4;
            i10 = 0;
            r15 = 1;
            while (r15 != 0) {
                i11 = i10 + 1;
                try {
                    cVar7.t();
                    try {
                        this.f16996D0 = 0;
                        this.f16997E0 = 0;
                        h(cVar7);
                        for (i17 = 0; i17 < i8; i17++) {
                            ((e) this.f17009u0.get(i17)).h(cVar7);
                        }
                        T(cVar7);
                        try {
                            weakReference = this.f17003K0;
                            if (weakReference != null) {
                                try {
                                    if (weakReference.get() != null) {
                                        c cVar11 = (c) this.f17003K0.get();
                                        cVar3 = cVar4;
                                        z11 = z9;
                                        try {
                                            p136t.f fVarK = cVar7.k(cVar3);
                                            cVar2 = cVar3;
                                            try {
                                                c cVar12 = this.f16993A0;
                                                iMax8 = iMax8;
                                                arrayList = arrayList;
                                                try {
                                                    cVar12.f(cVar12.k(cVar11), fVarK, 0, 5);
                                                    this.f17003K0 = null;
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    r22 = 1;
                                                    e.printStackTrace();
                                                    System.out.println("EXCEPTION : " + e);
                                                    r21 = r22;
                                                    zArr = k.f17063a;
                                                    if (r21 != 0) {
                                                        zArr[2] = false;
                                                        zX2 = X(64);
                                                        R(cVar7, zX2);
                                                        size = this.f17009u0.size();
                                                        i16 = 0;
                                                        z14 = false;
                                                        while (i16 < size) {
                                                            eVar = (e) this.f17009u0.get(i16);
                                                            eVar.R(cVar7, zX2);
                                                            boolean z21 = zX2;
                                                            int i44 = size;
                                                            if (eVar.f16962h == -1) {
                                                                z14 = true;
                                                            } else {
                                                                z14 = true;
                                                            }
                                                            i16++;
                                                            zX2 = z21;
                                                            size = i44;
                                                            z14 = z14;
                                                        }
                                                        z12 = z14;
                                                    } else {
                                                        R(cVar7, zX);
                                                        for (i12 = 0; i12 < i8; i12++) {
                                                            ((e) this.f17009u0.get(i12)).R(cVar7, zX);
                                                        }
                                                        z12 = false;
                                                    }
                                                    if (z8) {
                                                        iMax3 = 0;
                                                        iMax4 = 0;
                                                        for (i15 = 0; i15 < i8; i15++) {
                                                            e eVar14 = (e) this.f17009u0.get(i15);
                                                            iMax4 = Math.max(iMax4, eVar14.r() + eVar14.f16950a0);
                                                            iMax3 = Math.max(iMax3, eVar14.l() + eVar14.f16952b0);
                                                        }
                                                        iMax5 = Math.max(this.f16955d0, iMax4);
                                                        iMax6 = Math.max(this.f16957e0, iMax3);
                                                        z12 = z12;
                                                        if (dVar9 == dVar3) {
                                                            z12 = z12;
                                                            P(iMax5);
                                                            this.f16943U[0] = dVar3;
                                                            z12 = true;
                                                            z11 = true;
                                                        }
                                                        if (dVar2 == dVar3) {
                                                            M(iMax6);
                                                            this.f16943U[1] = dVar3;
                                                            z12 = true;
                                                            z11 = true;
                                                        }
                                                    }
                                                    iMax = Math.max(this.f16955d0, r());
                                                    z13 = z12;
                                                    if (iMax > r()) {
                                                        P(iMax);
                                                        this.f16943U[0] = dVar4;
                                                        z13 = true;
                                                        z11 = true;
                                                    }
                                                    iMax2 = Math.max(this.f16957e0, l());
                                                    if (iMax2 > l()) {
                                                        M(iMax2);
                                                        r7 = 1;
                                                        this.f16943U[1] = dVar4;
                                                        r18 = 1;
                                                        z11 = true;
                                                    } else {
                                                        r7 = 1;
                                                    }
                                                    if (z11) {
                                                        r18 = z13;
                                                        i13 = iMax8;
                                                        r19 = r18;
                                                        r19 = r18;
                                                        z9 = z11;
                                                        i14 = 8;
                                                        r110 = r19;
                                                    } else {
                                                        r18 = z13;
                                                        if (this.f16943U[0] == dVar3) {
                                                            r18 = r18;
                                                            if (r() > i7) {
                                                                this.f17001I0 = r7;
                                                                this.f16943U[0] = dVar4;
                                                                P(i7);
                                                                ?? r111 = r7;
                                                                z11 = r111 == true ? 1 : 0;
                                                                r18 = r111;
                                                            }
                                                        }
                                                        r18 = r18;
                                                        r18 = r18;
                                                        if (this.f16943U[r7] == dVar3) {
                                                            r18 = z13;
                                                            i13 = iMax8;
                                                            r19 = r18;
                                                            r19 = r18;
                                                            z9 = z11;
                                                            i14 = 8;
                                                            r110 = r19;
                                                        } else {
                                                            r18 = z13;
                                                            i13 = iMax8;
                                                            r19 = r18;
                                                            r19 = r18;
                                                            z9 = z11;
                                                            i14 = 8;
                                                            r110 = r19;
                                                        }
                                                    }
                                                    if (i11 > i14) {
                                                        r19 = r18;
                                                        r16 = 0;
                                                    } else {
                                                        r19 = r18;
                                                        r16 = r110;
                                                    }
                                                    i10 = i11;
                                                    iMax8 = i13;
                                                    cVar4 = cVar2;
                                                    arrayList = arrayList;
                                                    r15 = r16;
                                                }
                                            } catch (Exception e8) {
                                                e = e8;
                                                iMax8 = iMax8;
                                                arrayList = arrayList;
                                            }
                                        } catch (Exception e9) {
                                            e = e9;
                                            iMax8 = iMax8;
                                            arrayList = arrayList;
                                            cVar2 = cVar3;
                                        }
                                    } else {
                                        iMax8 = iMax8;
                                        arrayList = arrayList;
                                        cVar2 = cVar4;
                                        z11 = z9;
                                    }
                                    weakReference2 = this.f17005M0;
                                    if (weakReference2 != null && weakReference2.get() != null) {
                                        c cVar13 = (c) this.f17005M0.get();
                                        p136t.f fVarK2 = cVar7.k(this.f16935M);
                                        c cVar14 = this.f16993A0;
                                        cVar14.f(fVarK2, cVar14.k(cVar13), 0, 5);
                                        this.f17005M0 = null;
                                    }
                                    weakReference3 = this.f17004L0;
                                    if (weakReference3 != null || weakReference3.get() == null) {
                                        weakReference4 = this.f17006N0;
                                        if (weakReference4 == null && weakReference4.get() != null) {
                                            c cVar15 = (c) this.f17006N0.get();
                                            p136t.f fVarK3 = cVar7.k(this.f16934L);
                                            try {
                                                c cVar16 = this.f16993A0;
                                                try {
                                                    cVar16.f(fVarK3, cVar16.k(cVar15), 0, 5);
                                                    try {
                                                        this.f17006N0 = null;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        r22 = 1;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        r21 = r22;
                                                    }
                                                } catch (Exception e11) {
                                                    e = e11;
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                r22 = 1;
                                                e.printStackTrace();
                                                System.out.println("EXCEPTION : " + e);
                                                r21 = r22;
                                                zArr = k.f17063a;
                                                if (r21 != 0) {
                                                    zArr[2] = false;
                                                    zX2 = X(64);
                                                    R(cVar7, zX2);
                                                    size = this.f17009u0.size();
                                                    i16 = 0;
                                                    z14 = false;
                                                    while (i16 < size) {
                                                        eVar = (e) this.f17009u0.get(i16);
                                                        eVar.R(cVar7, zX2);
                                                        boolean z22 = zX2;
                                                        int i45 = size;
                                                        if (eVar.f16962h == -1) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = true;
                                                        }
                                                        i16++;
                                                        zX2 = z22;
                                                        size = i45;
                                                        z14 = z14;
                                                    }
                                                    z12 = z14;
                                                } else {
                                                    R(cVar7, zX);
                                                    while (i12 < i8) {
                                                        ((e) this.f17009u0.get(i12)).R(cVar7, zX);
                                                    }
                                                    z12 = false;
                                                }
                                                if (z8) {
                                                    iMax3 = 0;
                                                    iMax4 = 0;
                                                    while (i15 < i8) {
                                                        e eVar15 = (e) this.f17009u0.get(i15);
                                                        iMax4 = Math.max(iMax4, eVar15.r() + eVar15.f16950a0);
                                                        iMax3 = Math.max(iMax3, eVar15.l() + eVar15.f16952b0);
                                                    }
                                                    iMax5 = Math.max(this.f16955d0, iMax4);
                                                    iMax6 = Math.max(this.f16957e0, iMax3);
                                                    z12 = z12;
                                                    if (dVar9 == dVar3) {
                                                        z12 = z12;
                                                        P(iMax5);
                                                        this.f16943U[0] = dVar3;
                                                        z12 = true;
                                                        z11 = true;
                                                    }
                                                    if (dVar2 == dVar3) {
                                                        M(iMax6);
                                                        this.f16943U[1] = dVar3;
                                                        z12 = true;
                                                        z11 = true;
                                                    }
                                                }
                                                iMax = Math.max(this.f16955d0, r());
                                                z13 = z12;
                                                if (iMax > r()) {
                                                    P(iMax);
                                                    this.f16943U[0] = dVar4;
                                                    z13 = true;
                                                    z11 = true;
                                                }
                                                iMax2 = Math.max(this.f16957e0, l());
                                                if (iMax2 > l()) {
                                                    M(iMax2);
                                                    r7 = 1;
                                                    this.f16943U[1] = dVar4;
                                                    r18 = 1;
                                                    z11 = true;
                                                } else {
                                                    r7 = 1;
                                                }
                                                if (z11) {
                                                    r18 = z13;
                                                    if (this.f16943U[0] == dVar3) {
                                                        r18 = r18;
                                                        if (r() > i7) {
                                                            this.f17001I0 = r7;
                                                            this.f16943U[0] = dVar4;
                                                            P(i7);
                                                            ?? r112 = r7;
                                                            z11 = r112 == true ? 1 : 0;
                                                            r18 = r112;
                                                        }
                                                    }
                                                    r18 = r18;
                                                    r18 = r18;
                                                    if (this.f16943U[r7] == dVar3) {
                                                        r18 = z13;
                                                        i13 = iMax8;
                                                        r19 = r18;
                                                        r19 = r18;
                                                        z9 = z11;
                                                        i14 = 8;
                                                        r110 = r19;
                                                    } else {
                                                        r18 = z13;
                                                        i13 = iMax8;
                                                        r19 = r18;
                                                        r19 = r18;
                                                        z9 = z11;
                                                        i14 = 8;
                                                        r110 = r19;
                                                    }
                                                } else {
                                                    r18 = z13;
                                                    i13 = iMax8;
                                                    r19 = r18;
                                                    r19 = r18;
                                                    z9 = z11;
                                                    i14 = 8;
                                                    r110 = r19;
                                                }
                                                if (i11 > i14) {
                                                    r19 = r18;
                                                    r16 = 0;
                                                } else {
                                                    r19 = r18;
                                                    r16 = r110;
                                                }
                                                i10 = i11;
                                                iMax8 = i13;
                                                cVar4 = cVar2;
                                                arrayList = arrayList;
                                                r15 = r16;
                                            }
                                        }
                                        cVar7.p();
                                        r21 = 1;
                                    } else {
                                        c cVar17 = (c) this.f17004L0.get();
                                        c cVar18 = cVar;
                                        try {
                                            p136t.f fVarK4 = cVar7.k(cVar18);
                                            c cVar19 = this.f16993A0;
                                            cVar = cVar18;
                                            cVar19.f(cVar19.k(cVar17), fVarK4, 0, 5);
                                            this.f17004L0 = null;
                                            weakReference4 = this.f17006N0;
                                            if (weakReference4 == null) {
                                            }
                                            cVar7.p();
                                            r21 = 1;
                                        } catch (Exception e13) {
                                            e = e13;
                                            cVar = cVar18;
                                            r22 = 1;
                                            e.printStackTrace();
                                            System.out.println("EXCEPTION : " + e);
                                            r21 = r22;
                                            zArr = k.f17063a;
                                            if (r21 != 0) {
                                                zArr[2] = false;
                                                zX2 = X(64);
                                                R(cVar7, zX2);
                                                size = this.f17009u0.size();
                                                i16 = 0;
                                                z14 = false;
                                                while (i16 < size) {
                                                    eVar = (e) this.f17009u0.get(i16);
                                                    eVar.R(cVar7, zX2);
                                                    boolean z23 = zX2;
                                                    int i46 = size;
                                                    if (eVar.f16962h == -1) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = true;
                                                    }
                                                    i16++;
                                                    zX2 = z23;
                                                    size = i46;
                                                    z14 = z14;
                                                }
                                                z12 = z14;
                                            } else {
                                                R(cVar7, zX);
                                                while (i12 < i8) {
                                                    ((e) this.f17009u0.get(i12)).R(cVar7, zX);
                                                }
                                                z12 = false;
                                            }
                                            if (z8) {
                                                iMax3 = 0;
                                                iMax4 = 0;
                                                while (i15 < i8) {
                                                    e eVar16 = (e) this.f17009u0.get(i15);
                                                    iMax4 = Math.max(iMax4, eVar16.r() + eVar16.f16950a0);
                                                    iMax3 = Math.max(iMax3, eVar16.l() + eVar16.f16952b0);
                                                }
                                                iMax5 = Math.max(this.f16955d0, iMax4);
                                                iMax6 = Math.max(this.f16957e0, iMax3);
                                                z12 = z12;
                                                if (dVar9 == dVar3) {
                                                    z12 = z12;
                                                    P(iMax5);
                                                    this.f16943U[0] = dVar3;
                                                    z12 = true;
                                                    z11 = true;
                                                }
                                                if (dVar2 == dVar3) {
                                                    M(iMax6);
                                                    this.f16943U[1] = dVar3;
                                                    z12 = true;
                                                    z11 = true;
                                                }
                                            }
                                            iMax = Math.max(this.f16955d0, r());
                                            z13 = z12;
                                            if (iMax > r()) {
                                                P(iMax);
                                                this.f16943U[0] = dVar4;
                                                z13 = true;
                                                z11 = true;
                                            }
                                            iMax2 = Math.max(this.f16957e0, l());
                                            if (iMax2 > l()) {
                                                M(iMax2);
                                                r7 = 1;
                                                this.f16943U[1] = dVar4;
                                                r18 = 1;
                                                z11 = true;
                                            } else {
                                                r7 = 1;
                                            }
                                            if (z11) {
                                                r18 = z13;
                                                if (this.f16943U[0] == dVar3) {
                                                    r18 = r18;
                                                    if (r() > i7) {
                                                        this.f17001I0 = r7;
                                                        this.f16943U[0] = dVar4;
                                                        P(i7);
                                                        ?? r113 = r7;
                                                        z11 = r113 == true ? 1 : 0;
                                                        r18 = r113;
                                                    }
                                                }
                                                r18 = r18;
                                                r18 = r18;
                                                if (this.f16943U[r7] == dVar3) {
                                                    r18 = z13;
                                                    i13 = iMax8;
                                                    r19 = r18;
                                                    r19 = r18;
                                                    z9 = z11;
                                                    i14 = 8;
                                                    r110 = r19;
                                                } else {
                                                    r18 = z13;
                                                    i13 = iMax8;
                                                    r19 = r18;
                                                    r19 = r18;
                                                    z9 = z11;
                                                    i14 = 8;
                                                    r110 = r19;
                                                }
                                            } else {
                                                r18 = z13;
                                                i13 = iMax8;
                                                r19 = r18;
                                                r19 = r18;
                                                z9 = z11;
                                                i14 = 8;
                                                r110 = r19;
                                            }
                                            if (i11 > i14) {
                                                r19 = r18;
                                                r16 = 0;
                                            } else {
                                                r19 = r18;
                                                r16 = r110;
                                            }
                                            i10 = i11;
                                            iMax8 = i13;
                                            cVar4 = cVar2;
                                            arrayList = arrayList;
                                            r15 = r16;
                                        }
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    iMax8 = iMax8;
                                    arrayList = arrayList;
                                    cVar2 = cVar4;
                                    z11 = z9;
                                }
                            } else {
                                iMax8 = iMax8;
                                arrayList = arrayList;
                                cVar2 = cVar4;
                                z11 = z9;
                                weakReference2 = this.f17005M0;
                                if (weakReference2 != null) {
                                    c cVar110 = (c) this.f17005M0.get();
                                    p136t.f fVarK5 = cVar7.k(this.f16935M);
                                    c cVar111 = this.f16993A0;
                                    cVar111.f(fVarK5, cVar111.k(cVar110), 0, 5);
                                    this.f17005M0 = null;
                                }
                                weakReference3 = this.f17004L0;
                                if (weakReference3 != null) {
                                    weakReference4 = this.f17006N0;
                                    if (weakReference4 == null) {
                                    }
                                    cVar7.p();
                                    r21 = 1;
                                } else {
                                    weakReference4 = this.f17006N0;
                                    if (weakReference4 == null) {
                                    }
                                    cVar7.p();
                                    r21 = 1;
                                }
                            }
                        } catch (Exception e15) {
                            e = e15;
                            iMax8 = iMax8;
                            arrayList = arrayList;
                            cVar2 = cVar4;
                            z11 = z9;
                        }
                    } catch (Exception e16) {
                        e = e16;
                        cVar2 = cVar4;
                        z11 = z9;
                        r22 = r15;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                        r21 = r22;
                        zArr = k.f17063a;
                        if (r21 != 0) {
                            zArr[2] = false;
                            zX2 = X(64);
                            R(cVar7, zX2);
                            size = this.f17009u0.size();
                            i16 = 0;
                            z14 = false;
                            while (i16 < size) {
                                eVar = (e) this.f17009u0.get(i16);
                                eVar.R(cVar7, zX2);
                                boolean z24 = zX2;
                                int i47 = size;
                                if (eVar.f16962h == -1) {
                                    z14 = true;
                                } else {
                                    z14 = true;
                                }
                                i16++;
                                zX2 = z24;
                                size = i47;
                                z14 = z14;
                            }
                            z12 = z14;
                        } else {
                            R(cVar7, zX);
                            while (i12 < i8) {
                                ((e) this.f17009u0.get(i12)).R(cVar7, zX);
                            }
                            z12 = false;
                        }
                        if (z8) {
                            iMax3 = 0;
                            iMax4 = 0;
                            while (i15 < i8) {
                                e eVar17 = (e) this.f17009u0.get(i15);
                                iMax4 = Math.max(iMax4, eVar17.r() + eVar17.f16950a0);
                                iMax3 = Math.max(iMax3, eVar17.l() + eVar17.f16952b0);
                            }
                            iMax5 = Math.max(this.f16955d0, iMax4);
                            iMax6 = Math.max(this.f16957e0, iMax3);
                            z12 = z12;
                            if (dVar9 == dVar3) {
                                z12 = z12;
                                P(iMax5);
                                this.f16943U[0] = dVar3;
                                z12 = true;
                                z11 = true;
                            }
                            if (dVar2 == dVar3) {
                                M(iMax6);
                                this.f16943U[1] = dVar3;
                                z12 = true;
                                z11 = true;
                            }
                        }
                        iMax = Math.max(this.f16955d0, r());
                        z13 = z12;
                        if (iMax > r()) {
                            P(iMax);
                            this.f16943U[0] = dVar4;
                            z13 = true;
                            z11 = true;
                        }
                        iMax2 = Math.max(this.f16957e0, l());
                        if (iMax2 > l()) {
                            M(iMax2);
                            r7 = 1;
                            this.f16943U[1] = dVar4;
                            r18 = 1;
                            z11 = true;
                        } else {
                            r7 = 1;
                        }
                        if (z11) {
                            r18 = z13;
                            if (this.f16943U[0] == dVar3) {
                                r18 = r18;
                                if (r() > i7) {
                                    this.f17001I0 = r7;
                                    this.f16943U[0] = dVar4;
                                    P(i7);
                                    ?? r114 = r7;
                                    z11 = r114 == true ? 1 : 0;
                                    r18 = r114;
                                }
                            }
                            r18 = r18;
                            r18 = r18;
                            if (this.f16943U[r7] == dVar3) {
                                r18 = z13;
                                i13 = iMax8;
                                r19 = r18;
                                r19 = r18;
                                z9 = z11;
                                i14 = 8;
                                r110 = r19;
                            } else {
                                r18 = z13;
                                i13 = iMax8;
                                r19 = r18;
                                r19 = r18;
                                z9 = z11;
                                i14 = 8;
                                r110 = r19;
                            }
                        } else {
                            r18 = z13;
                            i13 = iMax8;
                            r19 = r18;
                            r19 = r18;
                            z9 = z11;
                            i14 = 8;
                            r110 = r19;
                        }
                        if (i11 > i14) {
                            r19 = r18;
                            r16 = 0;
                        } else {
                            r19 = r18;
                            r16 = r110;
                        }
                        i10 = i11;
                        iMax8 = i13;
                        cVar4 = cVar2;
                        arrayList = arrayList;
                        r15 = r16;
                    }
                } catch (Exception e17) {
                    e = e17;
                }
                zArr = k.f17063a;
                if (r21 != 0) {
                    zArr[2] = false;
                    zX2 = X(64);
                    R(cVar7, zX2);
                    size = this.f17009u0.size();
                    i16 = 0;
                    z14 = false;
                    while (i16 < size) {
                        eVar = (e) this.f17009u0.get(i16);
                        eVar.R(cVar7, zX2);
                        boolean z25 = zX2;
                        int i48 = size;
                        if (eVar.f16962h == -1 || eVar.f16964i != -1) {
                            z14 = true;
                        }
                        i16++;
                        zX2 = z25;
                        size = i48;
                        z14 = z14;
                    }
                    z12 = z14;
                } else {
                    R(cVar7, zX);
                    while (i12 < i8) {
                        ((e) this.f17009u0.get(i12)).R(cVar7, zX);
                    }
                    z12 = false;
                }
                if (z8 && i11 < 8 && zArr[2]) {
                    iMax3 = 0;
                    iMax4 = 0;
                    while (i15 < i8) {
                        e eVar18 = (e) this.f17009u0.get(i15);
                        iMax4 = Math.max(iMax4, eVar18.r() + eVar18.f16950a0);
                        iMax3 = Math.max(iMax3, eVar18.l() + eVar18.f16952b0);
                    }
                    iMax5 = Math.max(this.f16955d0, iMax4);
                    iMax6 = Math.max(this.f16957e0, iMax3);
                    z12 = z12;
                    if (dVar9 == dVar3 && r() < iMax5) {
                        z12 = z12;
                        P(iMax5);
                        this.f16943U[0] = dVar3;
                        z12 = true;
                        z11 = true;
                    }
                    if (dVar2 == dVar3 && l() < iMax6) {
                        M(iMax6);
                        this.f16943U[1] = dVar3;
                        z12 = true;
                        z11 = true;
                    }
                }
                iMax = Math.max(this.f16955d0, r());
                z13 = z12;
                if (iMax > r()) {
                    P(iMax);
                    this.f16943U[0] = dVar4;
                    z13 = true;
                    z11 = true;
                }
                iMax2 = Math.max(this.f16957e0, l());
                if (iMax2 > l()) {
                    M(iMax2);
                    r7 = 1;
                    this.f16943U[1] = dVar4;
                    r18 = 1;
                    z11 = true;
                } else {
                    r7 = 1;
                }
                if (z11) {
                    r18 = z13;
                    if (this.f16943U[0] == dVar3 && i7 > 0) {
                        r18 = r18;
                        if (r() > i7) {
                            this.f17001I0 = r7;
                            this.f16943U[0] = dVar4;
                            P(i7);
                            ?? r115 = r7;
                            z11 = r115 == true ? 1 : 0;
                            r18 = r115;
                        }
                    }
                    r18 = r18;
                    r18 = r18;
                    if (this.f16943U[r7] == dVar3 || iMax8 <= 0) {
                        r18 = z13;
                        i13 = iMax8;
                        r19 = r18;
                    } else {
                        i13 = iMax8;
                        if (l() > i13) {
                            this.f17002J0 = r7;
                            this.f16943U[r7] = dVar4;
                            M(i13);
                            i14 = 8;
                            z9 = true;
                            r110 = 1;
                        }
                    }
                    r19 = r18;
                    z9 = z11;
                    i14 = 8;
                    r110 = r19;
                } else {
                    r18 = z13;
                    i13 = iMax8;
                    r19 = r18;
                    r19 = r18;
                    z9 = z11;
                    i14 = 8;
                    r110 = r19;
                }
                if (i11 > i14) {
                    r19 = r18;
                    r16 = 0;
                } else {
                    r19 = r18;
                    r16 = r110;
                }
                i10 = i11;
                iMax8 = i13;
                cVar4 = cVar2;
                arrayList = arrayList;
                r15 = r16;
            }
            z10 = z9;
            this.f17009u0 = arrayList;
            if (z10) {
                d[] dVarArr9 = this.f16943U;
                dVarArr9[0] = dVar9;
                dVarArr9[1] = dVar2;
            }
            G(cVar7.f16246l);
        }
        dVar2 = dVar;
        dVar3 = dVar15;
        dVar4 = dVar11;
        z4 = false;
        if (X(64)) {
            z7 = true;
        } else {
            z7 = true;
        }
        cVar7.getClass();
        cVar7.f16242g = false;
        if (this.f17000H0 == 0) {
            c3 = 1;
        } else {
            c3 = 1;
        }
        arrayList = this.f17009u0;
        dVarArr = this.f16943U;
        if (dVarArr[0] != dVar3) {
            z8 = true;
        } else {
            z8 = true;
        }
        this.f16996D0 = 0;
        this.f16997E0 = 0;
        i8 = size2;
        while (i9 < i8) {
            eVar2 = (e) this.f17009u0.get(i9);
            if (eVar2 instanceof f) {
                ((f) eVar2).V();
            }
        }
        zX = X(64);
        z9 = z4;
        i10 = 0;
        r15 = 1;
        while (r15 != 0) {
            i11 = i10 + 1;
            cVar7.t();
            this.f16996D0 = 0;
            this.f16997E0 = 0;
            h(cVar7);
            while (i17 < i8) {
                ((e) this.f17009u0.get(i17)).h(cVar7);
            }
            T(cVar7);
            weakReference = this.f17003K0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    c cVar112 = (c) this.f17003K0.get();
                    cVar3 = cVar4;
                    z11 = z9;
                    p136t.f fVarK6 = cVar7.k(cVar3);
                    cVar2 = cVar3;
                    c cVar113 = this.f16993A0;
                    iMax8 = iMax8;
                    arrayList = arrayList;
                    cVar113.f(cVar113.k(cVar112), fVarK6, 0, 5);
                    this.f17003K0 = null;
                } else {
                    iMax8 = iMax8;
                    arrayList = arrayList;
                    cVar2 = cVar4;
                    z11 = z9;
                }
                weakReference2 = this.f17005M0;
                if (weakReference2 != null) {
                    c cVar114 = (c) this.f17005M0.get();
                    p136t.f fVarK7 = cVar7.k(this.f16935M);
                    c cVar115 = this.f16993A0;
                    cVar115.f(fVarK7, cVar115.k(cVar114), 0, 5);
                    this.f17005M0 = null;
                }
                weakReference3 = this.f17004L0;
                if (weakReference3 != null) {
                    weakReference4 = this.f17006N0;
                    if (weakReference4 == null) {
                    }
                    cVar7.p();
                    r21 = 1;
                } else {
                    weakReference4 = this.f17006N0;
                    if (weakReference4 == null) {
                    }
                    cVar7.p();
                    r21 = 1;
                }
            } else {
                iMax8 = iMax8;
                arrayList = arrayList;
                cVar2 = cVar4;
                z11 = z9;
                weakReference2 = this.f17005M0;
                if (weakReference2 != null) {
                    c cVar116 = (c) this.f17005M0.get();
                    p136t.f fVarK8 = cVar7.k(this.f16935M);
                    c cVar117 = this.f16993A0;
                    cVar117.f(fVarK8, cVar117.k(cVar116), 0, 5);
                    this.f17005M0 = null;
                }
                weakReference3 = this.f17004L0;
                if (weakReference3 != null) {
                    weakReference4 = this.f17006N0;
                    if (weakReference4 == null) {
                    }
                    cVar7.p();
                    r21 = 1;
                } else {
                    weakReference4 = this.f17006N0;
                    if (weakReference4 == null) {
                    }
                    cVar7.p();
                    r21 = 1;
                }
            }
            zArr = k.f17063a;
            if (r21 != 0) {
                zArr[2] = false;
                zX2 = X(64);
                R(cVar7, zX2);
                size = this.f17009u0.size();
                i16 = 0;
                z14 = false;
                while (i16 < size) {
                    eVar = (e) this.f17009u0.get(i16);
                    eVar.R(cVar7, zX2);
                    boolean z26 = zX2;
                    int i49 = size;
                    if (eVar.f16962h == -1) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    i16++;
                    zX2 = z26;
                    size = i49;
                    z14 = z14;
                }
                z12 = z14;
            } else {
                R(cVar7, zX);
                while (i12 < i8) {
                    ((e) this.f17009u0.get(i12)).R(cVar7, zX);
                }
                z12 = false;
            }
            if (z8) {
                iMax3 = 0;
                iMax4 = 0;
                while (i15 < i8) {
                    e eVar19 = (e) this.f17009u0.get(i15);
                    iMax4 = Math.max(iMax4, eVar19.r() + eVar19.f16950a0);
                    iMax3 = Math.max(iMax3, eVar19.l() + eVar19.f16952b0);
                }
                iMax5 = Math.max(this.f16955d0, iMax4);
                iMax6 = Math.max(this.f16957e0, iMax3);
                z12 = z12;
                if (dVar9 == dVar3) {
                    z12 = z12;
                    P(iMax5);
                    this.f16943U[0] = dVar3;
                    z12 = true;
                    z11 = true;
                }
                if (dVar2 == dVar3) {
                    M(iMax6);
                    this.f16943U[1] = dVar3;
                    z12 = true;
                    z11 = true;
                }
            }
            iMax = Math.max(this.f16955d0, r());
            z13 = z12;
            if (iMax > r()) {
                P(iMax);
                this.f16943U[0] = dVar4;
                z13 = true;
                z11 = true;
            }
            iMax2 = Math.max(this.f16957e0, l());
            if (iMax2 > l()) {
                M(iMax2);
                r7 = 1;
                this.f16943U[1] = dVar4;
                r18 = 1;
                z11 = true;
            } else {
                r7 = 1;
            }
            if (z11) {
                r18 = z13;
                if (this.f16943U[0] == dVar3) {
                    r18 = r18;
                    if (r() > i7) {
                        this.f17001I0 = r7;
                        this.f16943U[0] = dVar4;
                        P(i7);
                        ?? r116 = r7;
                        z11 = r116 == true ? 1 : 0;
                        r18 = r116;
                    }
                }
                r18 = r18;
                r18 = r18;
                if (this.f16943U[r7] == dVar3) {
                    r18 = z13;
                    i13 = iMax8;
                    r19 = r18;
                    r19 = r18;
                    z9 = z11;
                    i14 = 8;
                    r110 = r19;
                } else {
                    r18 = z13;
                    i13 = iMax8;
                    r19 = r18;
                    r19 = r18;
                    z9 = z11;
                    i14 = 8;
                    r110 = r19;
                }
            } else {
                r18 = z13;
                i13 = iMax8;
                r19 = r18;
                r19 = r18;
                z9 = z11;
                i14 = 8;
                r110 = r19;
            }
            if (i11 > i14) {
                r19 = r18;
                r16 = 0;
            } else {
                r19 = r18;
                r16 = r110;
            }
            i10 = i11;
            iMax8 = i13;
            cVar4 = cVar2;
            arrayList = arrayList;
            r15 = r16;
        }
        z10 = z9;
        this.f17009u0 = arrayList;
        if (z10) {
            d[] dVarArr10 = this.f16943U;
            dVarArr10[0] = dVar9;
            dVarArr10[1] = dVar2;
        }
        G(cVar7.f16246l);
    }

    public final boolean X(int i7) {
        return (this.f17000H0 & i7) == i7;
    }

    @Override // p149v.e
    public final void o(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f16945W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f16946X);
        sb.append("\n");
        Iterator it = this.f17009u0.iterator();
        while (it.hasNext()) {
            ((e) it.next()).o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
