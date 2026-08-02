package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.C0481ms;
import p000.C0768uj;
import p000.C0805vj;
import p000.C0873xd;
import p000.InterfaceC0289hk;
import p000.cz0;
import p000.dd0;
import p000.le1;
import p000.lh0;
import p000.oe1;
import p000.re1;
import p000.se1;
import p000.t22;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ oe1 lambda$getComponents$0(InterfaceC0289hk interfaceC0289hk) {
        se1.m4517b((Context) interfaceC0289hk.mo2281a(Context.class));
        return se1.m4516a().m4518c(C0873xd.f8891f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ oe1 lambda$getComponents$1(InterfaceC0289hk interfaceC0289hk) {
        se1.m4517b((Context) interfaceC0289hk.mo2281a(Context.class));
        return se1.m4516a().m4518c(C0873xd.f8891f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ oe1 lambda$getComponents$2(InterfaceC0289hk interfaceC0289hk) {
        se1.m4517b((Context) interfaceC0289hk.mo2281a(Context.class));
        return se1.m4516a().m4518c(C0873xd.f8890e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0805vj> getComponents() {
        C0768uj c0768ujM5164b = C0805vj.m5164b(oe1.class);
        c0768ujM5164b.f7821a = LIBRARY_NAME;
        c0768ujM5164b.m4926a(C0481ms.m3429a(Context.class));
        c0768ujM5164b.f7826f = new dd0(29);
        C0805vj c0805vjM4927b = c0768ujM5164b.m4927b();
        C0768uj c0768ujM5163a = C0805vj.m5163a(new cz0(lh0.class, oe1.class));
        c0768ujM5163a.m4926a(C0481ms.m3429a(Context.class));
        c0768ujM5163a.f7826f = new re1(0);
        C0805vj c0805vjM4927b2 = c0768ujM5163a.m4927b();
        C0768uj c0768ujM5163a2 = C0805vj.m5163a(new cz0(le1.class, oe1.class));
        c0768ujM5163a2.m4926a(C0481ms.m3429a(Context.class));
        c0768ujM5163a2.f7826f = new re1(1);
        return Arrays.asList(c0805vjM4927b, c0805vjM4927b2, c0768ujM5163a2.m4927b(), t22.m4648a(LIBRARY_NAME, "18.2.0"));
    }
}
