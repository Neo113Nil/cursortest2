package com.google.firebase.inappmessaging.display;

import android.app.Application;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.C0105co;
import p000.C0133dc;
import p000.C0293ho;
import p000.C0468mf;
import p000.C0481ms;
import p000.C0520nu;
import p000.C0682s7;
import p000.C0768uj;
import p000.C0805vj;
import p000.InterfaceC0289hk;
import p000.b90;
import p000.d10;
import p000.h10;
import p000.j22;
import p000.ly0;
import p000.nu1;
import p000.pd0;
import p000.t22;
import p000.vt1;
import p000.w00;
import p000.x00;
import p000.x80;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseInAppMessagingDisplayRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiamd";

    /* JADX INFO: Access modifiers changed from: private */
    public d10 buildFirebaseInAppMessagingUI(InterfaceC0289hk interfaceC0289hk) {
        w00 w00Var = (w00) interfaceC0289hk.mo2281a(w00.class);
        x00 x00Var = (x00) interfaceC0289hk.mo2281a(x00.class);
        w00Var.m5224a();
        Application application = (Application) w00Var.f8318a;
        nu1 nu1Var = new nu1(6, application);
        int i = 3;
        x80 x80Var = new x80(i);
        C0293ho c0293ho = new C0293ho();
        int i2 = 0;
        c0293ho.f3264a = C0520nu.m3589a(new C0682s7(i2, nu1Var));
        c0293ho.f3265b = C0520nu.m3589a(j22.f3797c);
        c0293ho.f3266c = C0520nu.m3589a(new C0133dc(c0293ho.f3264a, i2));
        C0133dc c0133dc = new C0133dc(x80Var, c0293ho.f3264a);
        c0293ho.f3267d = new pd0(x80Var, c0133dc, 7);
        c0293ho.f3268e = new pd0(x80Var, c0133dc, 4);
        c0293ho.f3269f = new pd0(x80Var, c0133dc, 5);
        c0293ho.f3270g = new pd0(x80Var, c0133dc, 6);
        int i3 = 2;
        c0293ho.f3271h = new pd0(x80Var, c0133dc, 2);
        c0293ho.f3272i = new pd0(x80Var, c0133dc, 3);
        int i4 = 1;
        c0293ho.f3273j = new pd0(x80Var, c0133dc, 1);
        c0293ho.f3274k = new pd0(x80Var, c0133dc, 0);
        b90 b90Var = new b90(27, x00Var);
        x80 x80Var2 = new x80(i2);
        ly0 ly0VarM3589a = C0520nu.m3589a(new C0682s7(i3, b90Var));
        C0105co c0105co = new C0105co(c0293ho, i3);
        C0105co c0105co2 = new C0105co(c0293ho, i);
        d10 d10Var = (d10) ((C0520nu) C0520nu.m3589a(new h10(ly0VarM3589a, c0105co, C0520nu.m3589a(new C0133dc(C0520nu.m3589a(new C0682s7(x80Var2, c0105co2)), i4)), new C0105co(c0293ho, i2), c0105co2, new C0105co(c0293ho, i4), C0520nu.m3589a(vt1.f8267c)))).get();
        application.registerActivityLifecycleCallbacks(d10Var);
        return d10Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0805vj> getComponents() {
        C0768uj c0768ujM5164b = C0805vj.m5164b(d10.class);
        c0768ujM5164b.f7821a = LIBRARY_NAME;
        c0768ujM5164b.m4926a(C0481ms.m3429a(w00.class));
        c0768ujM5164b.m4926a(C0481ms.m3429a(x00.class));
        c0768ujM5164b.f7826f = new C0468mf(2, this);
        c0768ujM5164b.m4928c(2);
        return Arrays.asList(c0768ujM5164b.m4927b(), t22.m4648a(LIBRARY_NAME, "22.0.3"));
    }
}
