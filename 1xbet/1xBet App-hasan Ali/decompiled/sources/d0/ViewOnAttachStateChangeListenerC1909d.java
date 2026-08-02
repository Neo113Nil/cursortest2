package d0;

import A0.C0022e0;
import A0.C0041k1;
import A0.C0058t;
import A0.F;
import A0.J0;
import A0.P;
import A0.RunnableC0049o;
import A0.X;
import H0.n;
import H0.q;
import H0.s;
import H0.v;
import K0.C0203h;
import W3.o;
import X3.m;
import a3.AbstractC0467k;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.InterfaceC0477f;
import androidx.lifecycle.InterfaceC0491u;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import e2.C1930k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k4.AbstractC2036a;
import kotlin.jvm.internal.l;
import r.AbstractC2333k;
import r.AbstractC2334l;
import r.C2321G;
import r.C2343v;
import r4.j;

/* renamed from: d0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1909d implements InterfaceC0477f, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public final F f16832k;

    /* renamed from: l, reason: collision with root package name */
    public final C0058t f16833l;

    /* renamed from: m, reason: collision with root package name */
    public D0.b f16834m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f16835n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final long f16836o = 100;

    /* renamed from: p, reason: collision with root package name */
    public EnumC1906a f16837p = EnumC1906a.f16825k;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16838q = true;

    /* renamed from: r, reason: collision with root package name */
    public final r4.c f16839r = j.a(1, 6, null);

    /* renamed from: s, reason: collision with root package name */
    public final Handler f16840s = new Handler(Looper.getMainLooper());

    /* renamed from: t, reason: collision with root package name */
    public C2343v f16841t;

    /* renamed from: u, reason: collision with root package name */
    public long f16842u;

    /* renamed from: v, reason: collision with root package name */
    public final C2343v f16843v;

    /* renamed from: w, reason: collision with root package name */
    public C0041k1 f16844w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16845x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0049o f16846y;

    public ViewOnAttachStateChangeListenerC1909d(F f, C0058t c0058t) {
        this.f16832k = f;
        this.f16833l = c0058t;
        C2343v c2343v = AbstractC2334l.f19016a;
        l.d("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>", c2343v);
        this.f16841t = c2343v;
        this.f16843v = new C2343v();
        n a5 = f.getSemanticsOwner().a();
        l.d("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>", c2343v);
        this.f16844w = new C0041k1(a5, c2343v);
        this.f16846y = new RunnableC0049o(12, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r8 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (p4.AbstractC2282w.f(r7.f16836o, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:11:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC0542c abstractC0542c) {
        C1908c c1908c;
        int i;
        r4.b bVar;
        if (abstractC0542c instanceof C1908c) {
            c1908c = (C1908c) abstractC0542c;
            int i5 = c1908c.f16831n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c1908c.f16831n = i5 - Integer.MIN_VALUE;
                Object obj = c1908c.f16829l;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = c1908c.f16831n;
                if (i != 0) {
                    G4.l.N(obj);
                    r4.c cVar = this.f16839r;
                    cVar.getClass();
                    bVar = new r4.b(cVar);
                } else if (i == 1) {
                    bVar = c1908c.f16828k;
                    G4.l.N(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return o.f6046a;
                    }
                    bVar.c();
                    if (g()) {
                        j();
                    }
                    if (!this.f16845x) {
                        this.f16845x = true;
                        this.f16840s.post(this.f16846y);
                    }
                    c1908c.f16828k = bVar;
                    c1908c.f16831n = 2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = c1908c.f16828k;
                    G4.l.N(obj);
                }
                c1908c.f16828k = bVar;
                c1908c.f16831n = 1;
                obj = bVar.a(c1908c);
            }
        }
        c1908c = new C1908c(this, abstractC0542c);
        Object obj2 = c1908c.f16829l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c1908c.f16831n;
        if (i != 0) {
        }
        c1908c.f16828k = bVar;
        c1908c.f16831n = 1;
        obj2 = bVar.a(c1908c);
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final void b(InterfaceC0491u interfaceC0491u) {
        l.f("owner", interfaceC0491u);
    }

    public final void c(AbstractC2333k abstractC2333k) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j5;
        char c5;
        long j6;
        int i;
        long[] jArr3;
        long[] jArr4;
        long j7;
        long j8;
        AbstractC2333k abstractC2333k2 = abstractC2333k;
        int[] iArr3 = abstractC2333k2.f19012b;
        long[] jArr5 = abstractC2333k2.f19011a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j9 = jArr5[i5];
            char c6 = 7;
            long j10 = -9187201950435737472L;
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j9 & 255) < 128) {
                        int i9 = iArr3[(i5 << 3) + i8];
                        c5 = c6;
                        C0041k1 c0041k1 = (C0041k1) this.f16843v.b(i9);
                        H0.o oVar = (H0.o) abstractC2333k2.b(i9);
                        n nVar = oVar != null ? oVar.f2117a : null;
                        if (nVar == null) {
                            throw AbstractC0467k.u("no value for specified key");
                        }
                        j6 = j10;
                        int i10 = nVar.f2116g;
                        H0.j jVar = nVar.f2114d;
                        if (c0041k1 == null) {
                            C2321G c2321g = jVar.f2103k;
                            Object[] objArr = c2321g.f18929b;
                            long[] jArr6 = c2321g.f18928a;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i11 = i6;
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr6[i12];
                                    j5 = j9;
                                    if ((((~j11) << c5) & j11 & j6) != j6) {
                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                j8 = j11;
                                                v vVar = (v) objArr[(i12 << 3) + i14];
                                                v vVar2 = s.f2157a;
                                                v vVar3 = s.f2144A;
                                                if (l.a(vVar, vVar3)) {
                                                    List list = (List) q.d(jVar, vVar3);
                                                    n(String.valueOf(list != null ? (C0203h) m.Z(list) : null), i10);
                                                }
                                            } else {
                                                j8 = j11;
                                            }
                                            j11 = j8 >> i11;
                                        }
                                        if (i13 != i11) {
                                            break;
                                        }
                                    }
                                    if (i12 == length2) {
                                        break;
                                    }
                                    i12++;
                                    j9 = j5;
                                    i11 = 8;
                                }
                            } else {
                                j5 = j9;
                            }
                        } else {
                            iArr2 = iArr3;
                            j5 = j9;
                            C2321G c2321g2 = jVar.f2103k;
                            Object[] objArr2 = c2321g2.f18929b;
                            long[] jArr7 = c2321g2.f18928a;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                Object[] objArr3 = objArr2;
                                jArr2 = jArr5;
                                int i15 = 0;
                                while (true) {
                                    long j12 = jArr7[i15];
                                    Object[] objArr4 = objArr3;
                                    i = i8;
                                    if ((((~j12) << c5) & j12 & j6) != j6) {
                                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                        int i17 = 0;
                                        while (i17 < i16) {
                                            if ((j12 & 255) < 128) {
                                                jArr4 = jArr7;
                                                v vVar4 = (v) objArr4[(i15 << 3) + i17];
                                                v vVar5 = s.f2157a;
                                                j7 = j12;
                                                v vVar6 = s.f2144A;
                                                if (l.a(vVar4, vVar6)) {
                                                    List list2 = (List) q.d(c0041k1.f526a, vVar6);
                                                    C0203h c0203h = list2 != null ? (C0203h) m.Z(list2) : null;
                                                    List list3 = (List) q.d(jVar, vVar6);
                                                    C0203h c0203h2 = list3 != null ? (C0203h) m.Z(list3) : null;
                                                    if (!l.a(c0203h, c0203h2)) {
                                                        n(String.valueOf(c0203h2), i10);
                                                    }
                                                }
                                            } else {
                                                jArr4 = jArr7;
                                                j7 = j12;
                                            }
                                            j12 = j7 >> 8;
                                            i17++;
                                            jArr7 = jArr4;
                                        }
                                        jArr3 = jArr7;
                                        if (i16 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr7;
                                    }
                                    if (i15 == length3) {
                                        break;
                                    }
                                    i15++;
                                    i8 = i;
                                    objArr3 = objArr4;
                                    jArr7 = jArr3;
                                }
                                j9 = j5 >> 8;
                                i8 = i + 1;
                                jArr5 = jArr2;
                                c6 = c5;
                                j10 = j6;
                                iArr3 = iArr2;
                                i6 = 8;
                                abstractC2333k2 = abstractC2333k;
                            }
                        }
                        jArr2 = jArr5;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        j5 = j9;
                        c5 = c6;
                        j6 = j10;
                    }
                    i = i8;
                    j9 = j5 >> 8;
                    i8 = i + 1;
                    jArr5 = jArr2;
                    c6 = c5;
                    j10 = j6;
                    iArr3 = iArr2;
                    i6 = 8;
                    abstractC2333k2 = abstractC2333k;
                }
                iArr = iArr3;
                int i18 = i6;
                jArr = jArr5;
                if (i7 != i18) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i5 == length) {
                return;
            }
            i5++;
            abstractC2333k2 = abstractC2333k;
            jArr5 = jArr;
            iArr3 = iArr;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final /* synthetic */ void d(InterfaceC0491u interfaceC0491u) {
    }

    public final AbstractC2333k e() {
        if (this.f16838q) {
            this.f16838q = false;
            this.f16841t = q.b(this.f16832k.getSemanticsOwner());
            this.f16842u = System.currentTimeMillis();
        }
        return this.f16841t;
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final /* synthetic */ void f(InterfaceC0491u interfaceC0491u) {
        AbstractC0467k.c(interfaceC0491u);
    }

    public final boolean g() {
        return this.f16834m != null;
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final /* synthetic */ void i(InterfaceC0491u interfaceC0491u) {
    }

    public final void j() {
        D0.b bVar = this.f16834m;
        if (bVar == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f16835n;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            Object obj = bVar.f921a;
            if (i >= size) {
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentCaptureSession d5 = P.d(obj);
                    J0 x5 = AbstractC2036a.x(bVar.f922b);
                    Objects.requireNonNull(x5);
                    D0.a.g(d5, X.e(x5.f304k), new long[]{Long.MIN_VALUE});
                }
                arrayList.clear();
                return;
            }
            e eVar = (e) arrayList.get(i);
            int ordinal = eVar.f16849c.ordinal();
            if (ordinal == 0) {
                C1930k c1930k = eVar.f16850d;
                if (c1930k != null && Build.VERSION.SDK_INT >= 29) {
                    D0.a.d(P.d(obj), (ViewStructure) c1930k.f16910l);
                }
            } else {
                if (ordinal != 1) {
                    throw new D2.e();
                }
                AutofillId a5 = bVar.a(eVar.f16847a);
                if (a5 != null && Build.VERSION.SDK_INT >= 29) {
                    D0.a.e(P.d(obj), a5);
                }
            }
            i++;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final void k(InterfaceC0491u interfaceC0491u) {
        this.f16834m = (D0.b) this.f16833l.invoke();
        o(-1, this.f16832k.getSemanticsOwner().a());
        j();
    }

    @Override // androidx.lifecycle.InterfaceC0477f
    public final void l(InterfaceC0491u interfaceC0491u) {
        p(this.f16832k.getSemanticsOwner().a());
        j();
        this.f16834m = null;
    }

    public final void m(n nVar, C0041k1 c0041k1) {
        C0022e0 c0022e0 = new C0022e0(13, c0041k1, this);
        nVar.getClass();
        List j5 = n.j(4, nVar);
        int size = j5.size();
        int i = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = j5.get(i5);
            if (e().a(((n) obj).f2116g)) {
                c0022e0.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
        List j6 = n.j(4, nVar);
        int size2 = j6.size();
        for (int i6 = 0; i6 < size2; i6++) {
            n nVar2 = (n) j6.get(i6);
            if (e().a(nVar2.f2116g)) {
                C2343v c2343v = this.f16843v;
                int i7 = nVar2.f2116g;
                if (c2343v.a(i7)) {
                    Object b3 = c2343v.b(i7);
                    if (b3 == null) {
                        throw AbstractC0467k.u("node not present in pruned tree before this change");
                    }
                    m(nVar2, (C0041k1) b3);
                } else {
                    continue;
                }
            }
        }
    }

    public final void n(String str, int i) {
        D0.b bVar;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29 && (bVar = this.f16834m) != null) {
            AutofillId a5 = bVar.a(i);
            if (a5 == null) {
                throw AbstractC0467k.u("Invalid content capture ID");
            }
            if (i5 >= 29) {
                D0.a.f(P.d(bVar.f921a), a5, str);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v12 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r7v12 android.view.autofill.AutofillId) from 0x0094: IF  (r7v12 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:22:0x0073 A[HIDDEN] (LINE:149)
          (r7v12 android.view.autofill.AutofillId) from 0x009d: PHI (r7v4 android.view.autofill.AutofillId) = (r7v3 android.view.autofill.AutofillId), (r7v12 android.view.autofill.AutofillId) binds: [B:103:0x0097, B:42:0x0094] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(int r23, H0.n r24) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.ViewOnAttachStateChangeListenerC1909d.o(int, H0.n):void");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f16840s.removeCallbacks(this.f16846y);
        this.f16834m = null;
    }

    public final void p(n nVar) {
        if (g()) {
            this.f16835n.add(new e(nVar.f2116g, this.f16842u, f.f16852l, null));
            List j5 = n.j(4, nVar);
            int size = j5.size();
            for (int i = 0; i < size; i++) {
                p((n) j5.get(i));
            }
        }
    }

    public final void q() {
        C2343v c2343v = this.f16843v;
        c2343v.c();
        AbstractC2333k e3 = e();
        int[] iArr = e3.f19012b;
        Object[] objArr = e3.f19013c;
        long[] jArr = e3.f19011a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j5) < 128) {
                            int i7 = (i << 3) + i6;
                            c2343v.g(iArr[i7], new C0041k1(((H0.o) objArr[i7]).f2117a, e()));
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f16844w = new C0041k1(this.f16832k.getSemanticsOwner().a(), e());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
