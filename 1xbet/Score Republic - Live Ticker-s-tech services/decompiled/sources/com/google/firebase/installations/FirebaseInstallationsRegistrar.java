package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000.C0042ay;
import p000.C0481ms;
import p000.C0731tj;
import p000.C0768uj;
import p000.C0805vj;
import p000.InterfaceC0289hk;
import p000.InterfaceC0391kc;
import p000.InterfaceC0833wa;
import p000.cz0;
import p000.l10;
import p000.m10;
import p000.t22;
import p000.v61;
import p000.w00;
import p000.wa0;
import p000.xa0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static m10 lambda$getComponents$0(InterfaceC0289hk interfaceC0289hk) {
        return new l10((w00) interfaceC0289hk.mo2281a(w00.class), interfaceC0289hk.mo2285e(xa0.class), (ExecutorService) interfaceC0289hk.mo2288h(new cz0(InterfaceC0833wa.class, ExecutorService.class)), new v61((Executor) interfaceC0289hk.mo2288h(new cz0(InterfaceC0391kc.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0805vj> getComponents() {
        C0768uj c0768ujM5164b = C0805vj.m5164b(m10.class);
        c0768ujM5164b.f7821a = LIBRARY_NAME;
        c0768ujM5164b.m4926a(C0481ms.m3429a(w00.class));
        int i = 0;
        c0768ujM5164b.m4926a(new C0481ms(0, 1, xa0.class));
        c0768ujM5164b.m4926a(new C0481ms(new cz0(InterfaceC0833wa.class, ExecutorService.class), 1, 0));
        c0768ujM5164b.m4926a(new C0481ms(new cz0(InterfaceC0391kc.class, Executor.class), 1, 0));
        c0768ujM5164b.f7826f = new C0042ay(9);
        C0805vj c0805vjM4927b = c0768ujM5164b.m4927b();
        wa0 wa0Var = new wa0(i);
        C0768uj c0768ujM5164b2 = C0805vj.m5164b(wa0.class);
        c0768ujM5164b2.f7825e = 1;
        c0768ujM5164b2.f7826f = new C0731tj(i, wa0Var);
        return Arrays.asList(c0805vjM4927b, c0768ujM5164b2.m4927b(), t22.m4648a(LIBRARY_NAME, "19.1.0"));
    }
}
