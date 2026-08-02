package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p000.C0042ay;
import p000.C0131da;
import p000.C0270h1;
import p000.C0479mq;
import p000.C0481ms;
import p000.C0517nr;
import p000.C0553oq;
import p000.C0768uj;
import p000.C0805vj;
import p000.InterfaceC0833wa;
import p000.ah0;
import p000.cz0;
import p000.t22;
import p000.w00;
import p000.wa0;
import p000.xa0;
import p000.ya0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: renamed from: a */
    public static String m996a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        C0768uj c0768ujM5164b = C0805vj.m5164b(C0517nr.class);
        c0768ujM5164b.m4926a(new C0481ms(2, 0, C0131da.class));
        c0768ujM5164b.f7826f = new C0270h1(18);
        arrayList.add(c0768ujM5164b.m4927b());
        cz0 cz0Var = new cz0(InterfaceC0833wa.class, Executor.class);
        C0768uj c0768uj = new C0768uj(C0553oq.class, new Class[]{xa0.class, ya0.class});
        c0768uj.m4926a(C0481ms.m3429a(Context.class));
        c0768uj.m4926a(C0481ms.m3429a(w00.class));
        c0768uj.m4926a(new C0481ms(2, 0, wa0.class));
        c0768uj.m4926a(new C0481ms(1, 1, C0517nr.class));
        c0768uj.m4926a(new C0481ms(cz0Var, 1, 0));
        c0768uj.f7826f = new C0479mq(cz0Var, 0);
        arrayList.add(c0768uj.m4927b());
        arrayList.add(t22.m4648a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(t22.m4648a("fire-core", "22.0.1"));
        arrayList.add(t22.m4648a("device-name", m996a(Build.PRODUCT)));
        arrayList.add(t22.m4648a("device-model", m996a(Build.DEVICE)));
        arrayList.add(t22.m4648a("device-brand", m996a(Build.BRAND)));
        arrayList.add(t22.m4650c("android-target-sdk", new C0042ay(4)));
        arrayList.add(t22.m4650c("android-min-sdk", new C0042ay(5)));
        arrayList.add(t22.m4650c("android-platform", new C0042ay(6)));
        arrayList.add(t22.m4650c("android-installer", new C0042ay(7)));
        try {
            ah0.f181k.getClass();
            str = "2.3.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(t22.m4648a("kotlin", str));
        }
        return arrayList;
    }
}
