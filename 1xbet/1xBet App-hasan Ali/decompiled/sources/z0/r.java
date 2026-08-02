package z0;

import x0.C2628n;

/* loaded from: classes.dex */
public final class r extends AbstractC2740P {
    @Override // x0.N
    public final int L(int i) {
        v3.g t5 = this.f21691y.f21812y.t();
        x0.O y5 = t5.y();
        C2731G c2731g = (C2731G) t5.f20439l;
        return y5.b(c2731g.f21612O.f21769d, c2731g.l(), i);
    }

    @Override // x0.N
    public final int T(int i) {
        v3.g t5 = this.f21691y.f21812y.t();
        x0.O y5 = t5.y();
        C2731G c2731g = (C2731G) t5.f20439l;
        return y5.j(c2731g.f21612O.f21769d, c2731g.l(), i);
    }

    @Override // x0.N
    public final int U(int i) {
        v3.g t5 = this.f21691y.f21812y.t();
        x0.O y5 = t5.y();
        C2731G c2731g = (C2731G) t5.f20439l;
        return y5.a(c2731g.f21612O.f21769d, c2731g.l(), i);
    }

    @Override // x0.N
    public final x0.Z e(long j5) {
        e0(j5);
        e0 e0Var = this.f21691y;
        R.e y5 = e0Var.f21812y.y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            U u5 = ((C2731G) objArr[i5]).f21613P.f21664q;
            kotlin.jvm.internal.l.c(u5);
            u5.f21713t = EnumC2729E.f21594m;
        }
        C2731G c2731g = e0Var.f21812y;
        AbstractC2740P.x0(this, c2731g.f21605F.c(this, c2731g.l(), j5));
        return this;
    }

    @Override // x0.N
    public final int f(int i) {
        v3.g t5 = this.f21691y.f21812y.t();
        x0.O y5 = t5.y();
        C2731G c2731g = (C2731G) t5.f20439l;
        return y5.h(c2731g.f21612O.f21769d, c2731g.l(), i);
    }

    @Override // z0.AbstractC2739O
    public final int g0(C2628n c2628n) {
        U u5 = this.f21691y.f21812y.f21613P.f21664q;
        kotlin.jvm.internal.l.c(u5);
        C2735K c2735k = u5.f21709p;
        EnumC2727C enumC2727C = c2735k.f21653d;
        EnumC2727C enumC2727C2 = EnumC2727C.f21586l;
        C2732H c2732h = u5.f21702A;
        if (enumC2727C == enumC2727C2) {
            c2732h.f21643d = true;
            if (c2732h.f21641b) {
                c2735k.f = true;
                c2735k.f21655g = true;
            }
        } else {
            c2732h.f21644e = true;
        }
        r rVar = u5.r().f21857Z;
        if (rVar != null) {
            rVar.f21683u = true;
        }
        u5.v();
        r rVar2 = u5.r().f21857Z;
        if (rVar2 != null) {
            rVar2.f21683u = false;
        }
        Integer num = (Integer) c2732h.f21645g.get(c2628n);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f21690D.h(intValue, c2628n);
        return intValue;
    }

    @Override // z0.AbstractC2740P
    public final void y0() {
        U u5 = this.f21691y.f21812y.f21613P.f21664q;
        kotlin.jvm.internal.l.c(u5);
        u5.l0();
    }
}
