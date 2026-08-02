package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import p000.AbstractC0292hn;
import p000.AbstractC0508ni;
import p000.C0481ms;
import p000.C0768uj;
import p000.C0805vj;
import p000.InterfaceC0391kc;
import p000.InterfaceC0833wa;
import p000.ci0;
import p000.cz0;
import p000.df1;
import p000.nc1;
import p000.o31;
import p000.wa0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0805vj> getComponents() {
        C0768uj c0768ujM5163a = C0805vj.m5163a(new cz0(InterfaceC0833wa.class, AbstractC0292hn.class));
        c0768ujM5163a.m4926a(new C0481ms(new cz0(InterfaceC0833wa.class, Executor.class), 1, 0));
        c0768ujM5163a.f7826f = o31.f5605m;
        C0805vj c0805vjM4927b = c0768ujM5163a.m4927b();
        C0768uj c0768ujM5163a2 = C0805vj.m5163a(new cz0(ci0.class, AbstractC0292hn.class));
        c0768ujM5163a2.m4926a(new C0481ms(new cz0(ci0.class, Executor.class), 1, 0));
        c0768ujM5163a2.f7826f = nc1.f5373l;
        C0805vj c0805vjM4927b2 = c0768ujM5163a2.m4927b();
        C0768uj c0768ujM5163a3 = C0805vj.m5163a(new cz0(InterfaceC0391kc.class, AbstractC0292hn.class));
        c0768ujM5163a3.m4926a(new C0481ms(new cz0(InterfaceC0391kc.class, Executor.class), 1, 0));
        c0768ujM5163a3.f7826f = wa0.f8473m;
        C0805vj c0805vjM4927b3 = c0768ujM5163a3.m4927b();
        C0768uj c0768ujM5163a4 = C0805vj.m5163a(new cz0(df1.class, AbstractC0292hn.class));
        c0768ujM5163a4.m4926a(new C0481ms(new cz0(df1.class, Executor.class), 1, 0));
        c0768ujM5163a4.f7826f = o31.f5606n;
        return AbstractC0508ni.m3539q(c0805vjM4927b, c0805vjM4927b2, c0805vjM4927b3, c0768ujM5163a4.m4927b());
    }
}
