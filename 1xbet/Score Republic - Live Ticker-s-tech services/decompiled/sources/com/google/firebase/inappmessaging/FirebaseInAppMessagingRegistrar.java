package com.google.firebase.inappmessaging;

import android.app.Application;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p000.C0032ao;
import p000.C0069bo;
import p000.C0082c1;
import p000.C0232g1;
import p000.C0256go;
import p000.C0312i6;
import p000.C0468mf;
import p000.C0481ms;
import p000.C0483mu;
import p000.C0494n4;
import p000.C0531o4;
import p000.C0568p4;
import p000.C0605q4;
import p000.C0768uj;
import p000.C0805vj;
import p000.C0852wt;
import p000.C0937z3;
import p000.InterfaceC0289hk;
import p000.InterfaceC0391kc;
import p000.InterfaceC0826w3;
import p000.InterfaceC0833wa;
import p000.b90;
import p000.ci0;
import p000.cz0;
import p000.hb1;
import p000.i10;
import p000.id0;
import p000.jg0;
import p000.kc1;
import p000.lh0;
import p000.m10;
import p000.nc1;
import p000.ne1;
import p000.oe1;
import p000.oy0;
import p000.px0;
import p000.qd0;
import p000.s00;
import p000.t22;
import p000.tu0;
import p000.u90;
import p000.w00;
import p000.wa0;
import p000.x00;
import p000.x80;
import p000.x90;
import p000.y90;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseInAppMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiam";
    private cz0 backgroundExecutor = new cz0(InterfaceC0833wa.class, Executor.class);
    private cz0 blockingExecutor = new cz0(InterfaceC0391kc.class, Executor.class);
    private cz0 lightWeightExecutor = new cz0(ci0.class, Executor.class);
    private cz0 legacyTransportFactory = new cz0(lh0.class, oe1.class);

    /* JADX INFO: Access modifiers changed from: private */
    public x00 providesFirebaseInAppMessaging(InterfaceC0289hk interfaceC0289hk) {
        s00 s00Var;
        w00 w00Var = (w00) interfaceC0289hk.mo2281a(w00.class);
        m10 m10Var = (m10) interfaceC0289hk.mo2281a(m10.class);
        tu0 tu0VarMo2282b = interfaceC0289hk.mo2282b();
        hb1 hb1Var = (hb1) interfaceC0289hk.mo2281a(hb1.class);
        w00Var.m5224a();
        b90 b90Var = new b90(8, (Application) w00Var.f8318a);
        C0312i6 c0312i6 = new C0312i6(tu0VarMo2282b, hb1Var);
        nc1 nc1Var = new nc1(10);
        px0 px0Var = new px0();
        jg0 jg0Var = new jg0(10);
        jg0Var.f3922k = px0Var;
        int i = 14;
        int i2 = 8;
        int i3 = 11;
        C0256go c0256go = new C0256go(new u90(0), new u90(i), b90Var, new wa0(26), jg0Var, nc1Var, new u90(11), new x80(17), new u90(12), c0312i6, new qd0((Executor) interfaceC0289hk.mo2288h(this.lightWeightExecutor), (Executor) interfaceC0289hk.mo2288h(this.backgroundExecutor), (Executor) interfaceC0289hk.mo2288h(this.blockingExecutor), 19, false));
        C0082c1 c0082c1 = (C0082c1) interfaceC0289hk.mo2281a(C0082c1.class);
        synchronized (c0082c1) {
            try {
                if (!c0082c1.f1063a.containsKey("fiam")) {
                    c0082c1.f1063a.put("fiam", new s00(c0082c1.f1064b));
                }
                s00Var = (s00) c0082c1.f1063a.get("fiam");
            } catch (Throwable th) {
                throw th;
            }
        }
        C0232g1 c0232g1 = new C0232g1(s00Var, (Executor) interfaceC0289hk.mo2288h(this.blockingExecutor));
        int i4 = 3;
        qd0 qd0Var = new qd0(w00Var, m10Var, new kc1(), i4);
        x90 x90Var = new x90(w00Var);
        oe1 oe1Var = (oe1) interfaceC0289hk.mo2288h(this.legacyTransportFactory);
        oe1Var.getClass();
        int i5 = 2;
        C0032ao c0032ao = new C0032ao(c0256go, i5);
        C0032ao c0032ao2 = new C0032ao(c0256go, i3);
        int i6 = 5;
        C0032ao c0032ao3 = new C0032ao(c0256go, i6);
        int i7 = 1;
        C0069bo c0069bo = new C0069bo(c0256go, i7);
        oy0 oy0VarM3430a = C0483mu.m3430a(new C0494n4(qd0Var, C0483mu.m3430a(new C0937z3(C0483mu.m3430a(new y90(x90Var, new C0032ao(c0256go, i2), new C0605q4(i5, x90Var))), i6)), new C0032ao(c0256go, i4), new C0032ao(c0256go, 13)));
        C0032ao c0032ao4 = new C0032ao(c0256go, i7);
        C0032ao c0032ao5 = new C0032ao(c0256go, 15);
        C0032ao c0032ao6 = new C0032ao(c0256go, 9);
        C0032ao c0032ao7 = new C0032ao(c0256go, i);
        C0069bo c0069bo2 = new C0069bo(c0256go, 0);
        C0568p4 c0568p4 = new C0568p4(qd0Var, 2);
        C0605q4 c0605q4 = new C0605q4(qd0Var, c0568p4);
        C0568p4 c0568p5 = new C0568p4(qd0Var, i7);
        C0531o4 c0531o4 = new C0531o4(qd0Var, c0568p4, new C0032ao(c0256go, 7), 0);
        C0605q4 c0605q5 = new C0605q4(3, c0232g1);
        C0032ao c0032ao8 = new C0032ao(c0256go, 4);
        oy0 oy0VarM3430a2 = C0483mu.m3430a(new id0(c0032ao, c0032ao2, c0032ao3, c0069bo, oy0VarM3430a, c0032ao4, c0032ao5, c0032ao6, c0032ao7, c0069bo2, c0605q4, c0568p5, c0531o4, c0605q5, c0032ao8));
        C0032ao c0032ao9 = new C0032ao(c0256go, 12);
        int i8 = 0;
        C0568p4 c0568p6 = new C0568p4(qd0Var, i8);
        C0605q4 c0605q6 = new C0605q4(3, oe1Var);
        C0032ao c0032ao10 = new C0032ao(c0256go, i8);
        C0032ao c0032ao11 = new C0032ao(c0256go, 6);
        return (x00) C0483mu.m3430a(new i10(oy0VarM3430a2, c0032ao9, c0531o4, c0568p5, new C0852wt(c0032ao6, c0069bo, c0032ao5, c0032ao7, c0032ao3, c0069bo2, C0483mu.m3430a(new ne1(c0568p6, c0605q6, c0032ao10, c0568p5, c0069bo, c0032ao11, c0032ao8)), c0531o4), c0032ao11, new C0032ao(c0256go, 10))).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0805vj> getComponents() {
        C0768uj c0768ujM5164b = C0805vj.m5164b(x00.class);
        c0768ujM5164b.f7821a = LIBRARY_NAME;
        c0768ujM5164b.m4926a(C0481ms.m3429a(Context.class));
        c0768ujM5164b.m4926a(C0481ms.m3429a(m10.class));
        c0768ujM5164b.m4926a(C0481ms.m3429a(w00.class));
        c0768ujM5164b.m4926a(C0481ms.m3429a(C0082c1.class));
        c0768ujM5164b.m4926a(new C0481ms(0, 2, InterfaceC0826w3.class));
        c0768ujM5164b.m4926a(new C0481ms(this.legacyTransportFactory, 1, 0));
        c0768ujM5164b.m4926a(C0481ms.m3429a(hb1.class));
        c0768ujM5164b.m4926a(new C0481ms(this.backgroundExecutor, 1, 0));
        c0768ujM5164b.m4926a(new C0481ms(this.blockingExecutor, 1, 0));
        c0768ujM5164b.m4926a(new C0481ms(this.lightWeightExecutor, 1, 0));
        c0768ujM5164b.f7826f = new C0468mf(3, this);
        c0768ujM5164b.m4928c(2);
        return Arrays.asList(c0768ujM5164b.m4927b(), t22.m4648a(LIBRARY_NAME, "22.0.3"));
    }
}
