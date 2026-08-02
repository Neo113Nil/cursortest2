package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.C0082c1;
import p000.C0270h1;
import p000.C0481ms;
import p000.C0768uj;
import p000.C0805vj;
import p000.InterfaceC0289hk;
import p000.InterfaceC0826w3;
import p000.t22;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C0082c1 lambda$getComponents$0(InterfaceC0289hk interfaceC0289hk) {
        return new C0082c1((Context) interfaceC0289hk.mo2281a(Context.class), interfaceC0289hk.mo2285e(InterfaceC0826w3.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0805vj> getComponents() {
        C0768uj c0768ujM5164b = C0805vj.m5164b(C0082c1.class);
        c0768ujM5164b.f7821a = LIBRARY_NAME;
        c0768ujM5164b.m4926a(C0481ms.m3429a(Context.class));
        c0768ujM5164b.m4926a(new C0481ms(0, 1, InterfaceC0826w3.class));
        c0768ujM5164b.f7826f = new C0270h1(0);
        return Arrays.asList(c0768ujM5164b.m4927b(), t22.m4648a(LIBRARY_NAME, "21.1.1"));
    }
}
