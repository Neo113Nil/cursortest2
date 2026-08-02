package com.google.firebase.firestore;

import B1.f;
import B4.L;
import C0.A;
import K4.k;
import M4.g;
import Q0.a;
import R4.b;
import Y3.i;
import Y3.l;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d4.InterfaceC0965b;
import f4.InterfaceC1090b;
import g4.C1128a;
import g4.C1136i;
import g4.InterfaceC1129b;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ L lambda$getComponents$0(InterfaceC1129b interfaceC1129b) {
        return new L((Context) interfaceC1129b.a(Context.class), (i) interfaceC1129b.a(i.class), interfaceC1129b.h(InterfaceC1090b.class), interfaceC1129b.h(InterfaceC0965b.class), new k(interfaceC1129b.d(b.class), interfaceC1129b.d(g.class), (l) interfaceC1129b.a(l.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C1128a> getComponents() {
        A a2 = new A(L.class, new Class[0]);
        a2.f1213c = LIBRARY_NAME;
        a2.b(C1136i.b(i.class));
        a2.b(C1136i.b(Context.class));
        a2.b(C1136i.a(g.class));
        a2.b(C1136i.a(b.class));
        a2.b(new C1136i(0, 2, InterfaceC1090b.class));
        a2.b(new C1136i(0, 2, InterfaceC0965b.class));
        a2.b(new C1136i(0, 0, l.class));
        a2.f1216f = new f(8);
        return Arrays.asList(a2.e(), a.h(LIBRARY_NAME, "25.1.1"));
    }
}
