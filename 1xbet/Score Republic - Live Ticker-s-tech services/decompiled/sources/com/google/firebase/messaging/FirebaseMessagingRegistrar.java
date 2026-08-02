package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.C0479mq;
import p000.C0481ms;
import p000.C0517nr;
import p000.C0768uj;
import p000.C0805vj;
import p000.InterfaceC0289hk;
import p000.cz0;
import p000.dd0;
import p000.hb1;
import p000.le1;
import p000.m10;
import p000.o10;
import p000.oe1;
import p000.t22;
import p000.w00;
import p000.ya0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(cz0 cz0Var, InterfaceC0289hk interfaceC0289hk) {
        w00 w00Var = (w00) interfaceC0289hk.mo2281a(w00.class);
        if (interfaceC0289hk.mo2281a(o10.class) == null) {
            return new FirebaseMessaging(w00Var, interfaceC0289hk.mo2285e(C0517nr.class), interfaceC0289hk.mo2285e(ya0.class), (m10) interfaceC0289hk.mo2281a(m10.class), interfaceC0289hk.mo2287g(cz0Var), (hb1) interfaceC0289hk.mo2281a(hb1.class));
        }
        dd0.m1158c();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0805vj> getComponents() {
        cz0 cz0Var = new cz0(le1.class, oe1.class);
        C0768uj c0768ujM5164b = C0805vj.m5164b(FirebaseMessaging.class);
        c0768ujM5164b.f7821a = LIBRARY_NAME;
        c0768ujM5164b.m4926a(C0481ms.m3429a(w00.class));
        c0768ujM5164b.m4926a(new C0481ms(0, 0, o10.class));
        c0768ujM5164b.m4926a(new C0481ms(0, 1, C0517nr.class));
        c0768ujM5164b.m4926a(new C0481ms(0, 1, ya0.class));
        c0768ujM5164b.m4926a(C0481ms.m3429a(m10.class));
        c0768ujM5164b.m4926a(new C0481ms(cz0Var, 0, 1));
        c0768ujM5164b.m4926a(C0481ms.m3429a(hb1.class));
        c0768ujM5164b.f7826f = new C0479mq(cz0Var, 1);
        c0768ujM5164b.m4928c(1);
        return Arrays.asList(c0768ujM5164b.m4927b(), t22.m4648a(LIBRARY_NAME, "25.0.2"));
    }
}
