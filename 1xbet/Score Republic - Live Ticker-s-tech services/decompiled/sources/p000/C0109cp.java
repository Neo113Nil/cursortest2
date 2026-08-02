package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: cp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0109cp extends xb1 implements h60 {

    /* JADX INFO: renamed from: n */
    public Object f1406n;

    /* JADX INFO: renamed from: o */
    public Serializable f1407o;

    /* JADX INFO: renamed from: p */
    public Object f1408p;

    /* JADX INFO: renamed from: q */
    public Object f1409q;

    /* JADX INFO: renamed from: r */
    public Iterator f1410r;

    /* JADX INFO: renamed from: s */
    public int f1411s;

    /* JADX INFO: renamed from: t */
    public int f1412t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0848wp f1413u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ f71 f1414v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0109cp(C0848wp c0848wp, f71 f71Var, InterfaceC0808vm interfaceC0808vm) {
        super(1, interfaceC0808vm);
        this.f1413u = c0848wp;
        this.f1414v = f71Var;
    }

    @Override // p000.h60
    /* JADX INFO: renamed from: i */
    public final Object mo170i(Object obj) {
        return new C0109cp(this.f1413u, this.f1414v, (InterfaceC0808vm) obj).mo17m(kf1.f4365a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x009f->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        br0 br0Var;
        i01 i01Var;
        k01 k01Var;
        k01 k01Var2;
        br0 br0Var2;
        Iterator it;
        br0 br0Var3;
        i01 i01Var2;
        k01 k01Var3;
        C0070bp c0070bp;
        k01 k01Var4;
        i01 i01Var3;
        v60 v60Var;
        Object obj2;
        int iHashCode;
        Integer numM1996a;
        Object obj3;
        int i = this.f1412t;
        f71 f71Var = this.f1414v;
        C0848wp c0848wp = this.f1413u;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        if (i == 0) {
            wo1.m5395v(obj);
            br0Var = new br0();
            i01Var = new i01();
            k01Var = new k01();
            this.f1406n = br0Var;
            this.f1407o = i01Var;
            this.f1408p = k01Var;
            this.f1409q = k01Var;
            this.f1412t = 1;
            obj = C0848wp.m5404g(c0848wp, true, this);
            if (obj != enumC0513nn) {
                k01Var2 = k01Var;
            }
            return enumC0513nn;
        }
        if (i == 1) {
            k01Var = (k01) this.f1409q;
            k01Var2 = (k01) this.f1408p;
            i01Var = (i01) this.f1407o;
            br0Var = (br0) this.f1406n;
            wo1.m5395v(obj);
        } else {
            if (i == 2) {
                it = this.f1410r;
                c0070bp = (C0070bp) this.f1409q;
                k01Var3 = (k01) this.f1408p;
                i01Var2 = (i01) this.f1407o;
                br0Var3 = (br0) this.f1406n;
                wo1.m5395v(obj);
                while (it.hasNext()) {
                    v60Var = (v60) it.next();
                    this.f1406n = br0Var3;
                    this.f1407o = i01Var2;
                    this.f1408p = k01Var3;
                    this.f1409q = c0070bp;
                    this.f1410r = it;
                    this.f1412t = 2;
                    if (v60Var.mo1490g(c0070bp, this) == enumC0513nn) {
                        return enumC0513nn;
                    }
                }
                k01Var2 = k01Var3;
                i01Var = i01Var2;
                br0Var2 = br0Var3;
                f71Var.f2336m = null;
                this.f1406n = i01Var;
                this.f1407o = k01Var2;
                this.f1408p = br0Var2;
                this.f1409q = null;
                this.f1410r = null;
                this.f1412t = 3;
                if (br0Var2.m745d(this) != enumC0513nn) {
                    k01Var4 = k01Var2;
                    i01Var3 = i01Var;
                    i01Var3.f3369j = true;
                    br0Var2.m748g(null);
                    obj2 = k01Var4.f4243j;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    g81 g81VarM5405h = c0848wp.m5405h();
                    this.f1406n = obj2;
                    this.f1407o = null;
                    this.f1408p = null;
                    this.f1411s = iHashCode;
                    this.f1412t = 4;
                    numM1996a = g81VarM5405h.m1996a();
                    if (numM1996a != enumC0513nn) {
                        obj = numM1996a;
                        obj3 = obj2;
                    }
                }
                return enumC0513nn;
            }
            if (i == 3) {
                br0Var2 = (br0) this.f1408p;
                k01Var4 = (k01) this.f1407o;
                i01Var3 = (i01) this.f1406n;
                wo1.m5395v(obj);
                try {
                    i01Var3.f3369j = true;
                    br0Var2.m748g(null);
                    obj2 = k01Var4.f4243j;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    g81 g81VarM5405h2 = c0848wp.m5405h();
                    this.f1406n = obj2;
                    this.f1407o = null;
                    this.f1408p = null;
                    this.f1411s = iHashCode;
                    this.f1412t = 4;
                    numM1996a = g81VarM5405h2.m1996a();
                    if (numM1996a != enumC0513nn) {
                        obj = numM1996a;
                        obj3 = obj2;
                    }
                    return enumC0513nn;
                } catch (Throwable th) {
                    br0Var2.m748g(null);
                    throw th;
                }
            }
            if (i != 4) {
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iHashCode = this.f1411s;
            obj3 = this.f1406n;
            wo1.m5395v(obj);
        }
        return new C0329io(obj3, iHashCode, ((Number) obj).intValue());
        k01Var.f4243j = ((C0329io) obj).f3624b;
        C0070bp c0070bp2 = new C0070bp(br0Var, i01Var, k01Var2, c0848wp);
        List list = (List) f71Var.f2336m;
        if (list != null) {
            it = list.iterator();
            br0Var3 = br0Var;
            i01Var2 = i01Var;
            k01Var3 = k01Var2;
            c0070bp = c0070bp2;
            while (it.hasNext()) {
                v60Var = (v60) it.next();
                this.f1406n = br0Var3;
                this.f1407o = i01Var2;
                this.f1408p = k01Var3;
                this.f1409q = c0070bp;
                this.f1410r = it;
                this.f1412t = 2;
                if (v60Var.mo1490g(c0070bp, this) == enumC0513nn) {
                    return enumC0513nn;
                }
            }
            k01Var2 = k01Var3;
            i01Var = i01Var2;
            br0Var2 = br0Var3;
        } else {
            br0Var2 = br0Var;
        }
        f71Var.f2336m = null;
        this.f1406n = i01Var;
        this.f1407o = k01Var2;
        this.f1408p = br0Var2;
        this.f1409q = null;
        this.f1410r = null;
        this.f1412t = 3;
        if (br0Var2.m745d(this) != enumC0513nn) {
            k01Var4 = k01Var2;
            i01Var3 = i01Var;
            i01Var3.f3369j = true;
            br0Var2.m748g(null);
            obj2 = k01Var4.f4243j;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            g81 g81VarM5405h3 = c0848wp.m5405h();
            this.f1406n = obj2;
            this.f1407o = null;
            this.f1408p = null;
            this.f1411s = iHashCode;
            this.f1412t = 4;
            numM1996a = g81VarM5405h3.m1996a();
            if (numM1996a != enumC0513nn) {
                obj = numM1996a;
                obj3 = obj2;
                return new C0329io(obj3, iHashCode, ((Number) obj).intValue());
            }
        }
        return enumC0513nn;
    }
}
