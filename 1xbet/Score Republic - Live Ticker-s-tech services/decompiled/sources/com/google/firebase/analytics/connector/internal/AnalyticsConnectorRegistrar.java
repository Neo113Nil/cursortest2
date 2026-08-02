package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.C0337ix;
import p000.C0481ms;
import p000.C0768uj;
import p000.C0805vj;
import p000.C0863x3;
import p000.InterfaceC0289hk;
import p000.InterfaceC0826w3;
import p000.hb1;
import p000.iw1;
import p000.mw1;
import p000.p80;
import p000.t22;
import p000.u90;
import p000.w00;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC0826w3 lambda$getComponents$0(InterfaceC0289hk interfaceC0289hk) {
        w00 w00Var = (w00) interfaceC0289hk.mo2281a(w00.class);
        Context context = (Context) interfaceC0289hk.mo2281a(Context.class);
        hb1 hb1Var = (hb1) interfaceC0289hk.mo2281a(hb1.class);
        p80.m3863h(w00Var);
        p80.m3863h(context);
        p80.m3863h(hb1Var);
        p80.m3863h(context.getApplicationContext());
        if (C0863x3.f8772c == null) {
            synchronized (C0863x3.class) {
                try {
                    if (C0863x3.f8772c == null) {
                        Bundle bundle = new Bundle(1);
                        w00Var.m5224a();
                        if ("[DEFAULT]".equals(w00Var.f8319b)) {
                            ((C0337ix) hb1Var).m2714a(iw1.f3686m, u90.f7708k);
                            bundle.putBoolean("dataCollectionDefaultEnabled", w00Var.m5227g());
                        }
                        C0863x3.f8772c = new C0863x3(mw1.m3432d(context, bundle).f5170b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return C0863x3.f8772c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0805vj> getComponents() {
        C0768uj c0768ujM5164b = C0805vj.m5164b(InterfaceC0826w3.class);
        c0768ujM5164b.m4926a(C0481ms.m3429a(w00.class));
        c0768ujM5164b.m4926a(C0481ms.m3429a(Context.class));
        c0768ujM5164b.m4926a(C0481ms.m3429a(hb1.class));
        c0768ujM5164b.f7826f = u90.f7709l;
        c0768ujM5164b.m4928c(2);
        return Arrays.asList(c0768ujM5164b.m4927b(), t22.m4648a("fire-analytics", "23.2.0"));
    }
}
