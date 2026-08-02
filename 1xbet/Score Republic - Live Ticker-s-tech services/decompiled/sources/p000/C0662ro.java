package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ro */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0662ro extends xb1 implements v60 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f6921n;

    /* JADX INFO: renamed from: o */
    public int f6922o;

    /* JADX INFO: renamed from: p */
    public Object f6923p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f6924q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0662ro(Object obj, Object obj2, InterfaceC0808vm interfaceC0808vm, int i) {
        super(2, interfaceC0808vm);
        this.f6921n = i;
        this.f6923p = obj;
        this.f6924q = obj2;
    }

    @Override // p000.v60
    /* JADX INFO: renamed from: g */
    public final Object mo1490g(Object obj, Object obj2) {
        int i = this.f6921n;
        kf1 kf1Var = kf1.f4365a;
        switch (i) {
            case 0:
                return ((C0662ro) mo1491k((InterfaceC0808vm) obj2, (C0070bp) obj)).mo17m(kf1Var);
            case 1:
                return ((C0662ro) mo1491k((InterfaceC0808vm) obj2, (InterfaceC0476mn) obj)).mo17m(kf1Var);
            case 2:
                return ((C0662ro) mo1491k((InterfaceC0808vm) obj2, (io0) obj)).mo17m(kf1Var);
            case 3:
                return ((C0662ro) mo1491k((InterfaceC0808vm) obj2, (InterfaceC0476mn) obj)).mo17m(kf1Var);
            case 4:
                return ((C0662ro) mo1491k((InterfaceC0808vm) obj2, (InterfaceC0476mn) obj)).mo17m(kf1Var);
            case 5:
                return ((C0662ro) mo1491k((InterfaceC0808vm) obj2, (InterfaceC0476mn) obj)).mo17m(kf1Var);
            case 6:
                return ((C0662ro) mo1491k((InterfaceC0808vm) obj2, (InterfaceC0476mn) obj)).mo17m(kf1Var);
            default:
                return ((C0662ro) mo1491k((InterfaceC0808vm) obj2, obj)).mo17m(kf1Var);
        }
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: k */
    public final InterfaceC0808vm mo1491k(InterfaceC0808vm interfaceC0808vm, Object obj) {
        int i = this.f6921n;
        Object obj2 = this.f6924q;
        switch (i) {
            case 0:
                C0662ro c0662ro = new C0662ro((List) obj2, interfaceC0808vm, 0);
                c0662ro.f6923p = obj;
                return c0662ro;
            case 1:
                return new C0662ro((v60) this.f6923p, (C0329io) obj2, interfaceC0808vm, 1);
            case 2:
                C0662ro c0662ro2 = new C0662ro((C0848wp) obj2, interfaceC0808vm, 2);
                c0662ro2.f6923p = obj;
                return c0662ro2;
            case 3:
                return new C0662ro((wf0) this.f6923p, (h60) obj2, interfaceC0808vm, 3);
            case 4:
                return new C0662ro((wf0) this.f6923p, (rw0) obj2, interfaceC0808vm, 4);
            case 5:
                return new C0662ro((en0) this.f6923p, (Uri) obj2, interfaceC0808vm, 5);
            case 6:
                return new C0662ro((f71) obj2, interfaceC0808vm, 6);
            default:
                C0662ro c0662ro3 = new C0662ro((u10) obj2, interfaceC0808vm, 7);
                c0662ro3.f6923p = obj;
                return c0662ro3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[PHI: r0 r9
      0x0094: PHI (r0v11 ro) = (r0v14 ro), (r0v17 ro) binds: [B:31:0x0091, B:20:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r9v33 java.lang.Object) = (r9v43 java.lang.Object), (r9v0 java.lang.Object) binds: [B:31:0x0091, B:20:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r0.mo1490g(r9, r8) == r4) goto L35;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009c -> B:36:0x00a0). Please report as a decompilation issue!!! */
    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo17m(Object obj) throws Throwable {
        C0662ro c0662ro;
        ag0 ag0Var;
        int i = this.f6921n;
        kf1 kf1Var = kf1.f4365a;
        Object obj2 = this.f6924q;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        int i2 = 1;
        InterfaceC0808vm interfaceC0808vm = null;
        switch (i) {
            case 0:
                int i3 = this.f6922o;
                if (i3 == 0) {
                    wo1.m5395v(obj);
                    C0070bp c0070bp = (C0070bp) this.f6923p;
                    this.f6922o = 1;
                    return o80.m3644e((List) obj2, c0070bp, this) == enumC0513nn ? enumC0513nn : kf1Var;
                }
                if (i3 == 1) {
                    wo1.m5395v(obj);
                    return kf1Var;
                }
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i4 = this.f6922o;
                if (i4 != 0) {
                    if (i4 == 1) {
                        wo1.m5395v(obj);
                        return obj;
                    }
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wo1.m5395v(obj);
                v60 v60Var = (v60) this.f6923p;
                Object obj3 = ((C0329io) obj2).f3624b;
                this.f6922o = 1;
                Object objMo1490g = v60Var.mo1490g(obj3, this);
                return objMo1490g == enumC0513nn ? enumC0513nn : objMo1490g;
            case 2:
                int i5 = this.f6922o;
                if (i5 == 0) {
                    wo1.m5395v(obj);
                    io0 io0Var = (io0) this.f6923p;
                    this.f6922o = 1;
                    return C0848wp.m5401b((C0848wp) obj2, io0Var, this) == enumC0513nn ? enumC0513nn : kf1Var;
                }
                if (i5 == 1) {
                    wo1.m5395v(obj);
                    return kf1Var;
                }
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                wf0 wf0Var = (wf0) this.f6923p;
                ThreadLocal threadLocal = wf0Var.f8534b;
                int i6 = this.f6922o;
                try {
                    if (i6 != 0) {
                        if (i6 != 1) {
                            C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        wo1.m5395v(obj);
                        zq0 zq0Var = (zq0) obj;
                        threadLocal.set(Boolean.FALSE);
                        return zq0Var;
                    }
                    wo1.m5395v(obj);
                    Object obj4 = threadLocal.get();
                    Boolean bool = Boolean.TRUE;
                    if (af0.m187a(obj4, bool)) {
                        C0270h1.m2191g("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                        return null;
                    }
                    threadLocal.set(bool);
                    InterfaceC0921yo interfaceC0921yo = wf0Var.f8535c;
                    C0257gp c0257gp = new C0257gp((h60) obj2, interfaceC0808vm, i2);
                    this.f6922o = 1;
                    obj = interfaceC0921yo.mo2853d(new ow0(c0257gp, interfaceC0808vm, i2), this);
                    if (obj == enumC0513nn) {
                        return enumC0513nn;
                    }
                    zq0 zq0Var2 = (zq0) obj;
                    threadLocal.set(Boolean.FALSE);
                    return zq0Var2;
                } catch (Throwable th) {
                    threadLocal.set(Boolean.FALSE);
                    throw th;
                }
            case 4:
                int i7 = this.f6922o;
                if (i7 == 0) {
                    wo1.m5395v(obj);
                    t10 t10VarMo2854f = ((wf0) this.f6923p).f8535c.mo2854f();
                    this.f6922o = 1;
                    obj = oa2.m3657d(t10VarMo2854f, this);
                    if (obj == enumC0513nn) {
                        return enumC0513nn;
                    }
                } else {
                    if (i7 != 1) {
                        C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wo1.m5395v(obj);
                }
                zq0 zq0Var3 = (zq0) obj;
                if (zq0Var3 != null) {
                    rw0 rw0Var = (rw0) obj2;
                    rw0Var.getClass();
                    Object objCopyOf = zq0Var3.f9907a.get(rw0Var);
                    if (objCopyOf instanceof byte[]) {
                        byte[] bArr = (byte[]) objCopyOf;
                        objCopyOf = Arrays.copyOf(bArr, bArr.length);
                    }
                    Object obj5 = objCopyOf;
                    if (obj5 != null) {
                        return obj5;
                    }
                }
                return -1L;
            case 5:
                int i8 = this.f6922o;
                if (i8 == 0) {
                    wo1.m5395v(obj);
                    this.f6922o = 1;
                    return ((en0) this.f6923p).f2146a.m2132B((Uri) obj2, this) == enumC0513nn ? enumC0513nn : kf1Var;
                }
                if (i8 == 1) {
                    wo1.m5395v(obj);
                    return kf1Var;
                }
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                f71 f71Var = (f71) obj2;
                int i9 = this.f6922o;
                if (i9 == 0) {
                    wo1.m5395v(obj);
                    if (((AtomicInteger) ((nu1) f71Var.f2337n).f5551k).get() <= 0) {
                        C0270h1.m2191g("Check failed.");
                    }
                    ag0Var = (ag0) ((InterfaceC0476mn) f71Var.f2334k).mo434b().mo1466j(wa0.f8474n);
                    if (ag0Var == null) {
                    }
                    c0662ro = (C0662ro) f71Var.f2335l;
                    C0650rc c0650rc = (C0650rc) f71Var.f2336m;
                    this.f6923p = c0662ro;
                    this.f6922o = 1;
                    c0650rc.getClass();
                    obj = C0650rc.m4303B(c0650rc, this);
                    if (obj != enumC0513nn) {
                        this.f6923p = null;
                        this.f6922o = 2;
                        break;
                    }
                    return enumC0513nn;
                }
                if (i9 == 1) {
                    c0662ro = (C0662ro) this.f6923p;
                    wo1.m5395v(obj);
                    this.f6923p = null;
                    this.f6922o = 2;
                    break;
                } else if (i9 == 2) {
                    wo1.m5395v(obj);
                } else {
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                }
                if (((AtomicInteger) ((nu1) f71Var.f2337n).f5551k).decrementAndGet() == 0) {
                    return kf1Var;
                }
                ag0Var = (ag0) ((InterfaceC0476mn) f71Var.f2334k).mo434b().mo1466j(wa0.f8474n);
                if (ag0Var == null && !ag0Var.mo203a()) {
                    throw ((ig0) ag0Var).m2635z();
                }
                c0662ro = (C0662ro) f71Var.f2335l;
                C0650rc c0650rc2 = (C0650rc) f71Var.f2336m;
                this.f6923p = c0662ro;
                this.f6922o = 1;
                c0650rc2.getClass();
                obj = C0650rc.m4303B(c0650rc2, this);
                if (obj != enumC0513nn) {
                    this.f6923p = null;
                    this.f6922o = 2;
                    break;
                }
                return enumC0513nn;
                return null;
            default:
                int i10 = this.f6922o;
                if (i10 == 0) {
                    wo1.m5395v(obj);
                    Object obj6 = this.f6923p;
                    this.f6922o = 1;
                    return ((u10) obj2).mo583j(obj6, this) == enumC0513nn ? enumC0513nn : kf1Var;
                }
                if (i10 == 1) {
                    wo1.m5395v(obj);
                    return kf1Var;
                }
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0662ro(Object obj, InterfaceC0808vm interfaceC0808vm, int i) {
        super(2, interfaceC0808vm);
        this.f6921n = i;
        this.f6924q = obj;
    }
}
