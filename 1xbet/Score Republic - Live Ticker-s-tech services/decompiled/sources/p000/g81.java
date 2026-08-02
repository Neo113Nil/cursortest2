package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g81 {

    /* JADX INFO: renamed from: a */
    public final br0 f2646a = new br0();

    /* JADX INFO: renamed from: b */
    public final nu1 f2647b = new nu1(8);

    /* JADX INFO: renamed from: c */
    public final jg0 f2648c = new jg0(12, new f81(2, null));

    public g81(String str) {
    }

    /* JADX INFO: renamed from: a */
    public final Integer m1996a() {
        return new Integer(((AtomicInteger) this.f2647b.f5551k).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [br0] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1997b(h60 h60Var, AbstractC0882xm abstractC0882xm) {
        d81 d81Var;
        br0 br0Var;
        br0 br0Var2;
        if (abstractC0882xm instanceof d81) {
            d81Var = (d81) abstractC0882xm;
            int i = d81Var.f1586q;
            if ((i & Integer.MIN_VALUE) != 0) {
                d81Var.f1586q = i - Integer.MIN_VALUE;
            } else {
                d81Var = new d81(this, abstractC0882xm);
            }
        } else {
            d81Var = new d81(this, abstractC0882xm);
        }
        Object objMo170i = d81Var.f1584o;
        int i2 = d81Var.f1586q;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        try {
            if (i2 == 0) {
                wo1.m5395v(objMo170i);
                d81Var.f1582m = h60Var;
                br0Var = this.f2646a;
                d81Var.f1583n = br0Var;
                d81Var.f1586q = 1;
                if (br0Var.m745d(d81Var) != enumC0513nn) {
                }
                br0Var2 = br0Var;
                return enumC0513nn;
            }
            if (i2 == 1) {
                br0 br0Var3 = d81Var.f1583n;
                h60Var = (h60) d81Var.f1582m;
                wo1.m5395v(objMo170i);
                br0Var2 = br0Var3;
            } else {
                if (i2 != 2) {
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                br0 br0Var4 = (br0) d81Var.f1582m;
                wo1.m5395v(objMo170i);
                this = br0Var4;
            }
            this.m748g(null);
            return objMo170i;
            br0Var2 = br0Var;
            d81Var.f1582m = br0Var2;
            d81Var.f1583n = null;
            d81Var.f1586q = 2;
            objMo170i = h60Var.mo170i(d81Var);
            this = br0Var2;
        } catch (Throwable th) {
            this.m748g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m1998c(v60 v60Var, AbstractC0882xm abstractC0882xm) throws Throwable {
        e81 e81Var;
        br0 br0Var;
        boolean z;
        Throwable th;
        if (abstractC0882xm instanceof e81) {
            e81Var = (e81) abstractC0882xm;
            int i = e81Var.f2012q;
            if ((i & Integer.MIN_VALUE) != 0) {
                e81Var.f2012q = i - Integer.MIN_VALUE;
            } else {
                e81Var = new e81(this, abstractC0882xm);
            }
        } else {
            e81Var = new e81(this, abstractC0882xm);
        }
        Object obj = e81Var.f2010o;
        int i2 = e81Var.f2012q;
        if (i2 != 0) {
            if (i2 != 1) {
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = e81Var.f2009n;
            br0Var = e81Var.f2008m;
            try {
                wo1.m5395v(obj);
                if (z) {
                    br0Var.m748g(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    br0Var.m748g(null);
                }
                throw th;
            }
        }
        wo1.m5395v(obj);
        br0 br0Var2 = this.f2646a;
        boolean zM746e = br0Var2.m746e();
        try {
            Object objValueOf = Boolean.valueOf(zM746e);
            e81Var.f2008m = br0Var2;
            e81Var.f2009n = zM746e;
            e81Var.f2012q = 1;
            Object objMo1490g = v60Var.mo1490g(objValueOf, e81Var);
            Object obj2 = EnumC0513nn.f5459j;
            if (objMo1490g == obj2) {
                return obj2;
            }
            br0Var = br0Var2;
            z = zM746e;
            obj = objMo1490g;
            if (z) {
                br0Var.m748g(null);
            }
            return obj;
        } catch (Throwable th3) {
            br0Var = br0Var2;
            z = zM746e;
            th = th3;
            if (z) {
                br0Var.m748g(null);
            }
            throw th;
        }
    }
}
