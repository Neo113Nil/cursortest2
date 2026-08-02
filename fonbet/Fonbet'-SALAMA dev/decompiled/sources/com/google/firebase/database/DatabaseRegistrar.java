package com.google.firebase.database;

import C0.A;
import Q0.a;
import Y3.i;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d4.InterfaceC0965b;
import f4.InterfaceC1090b;
import g4.C1128a;
import g4.C1136i;
import g4.InterfaceC1129b;
import h4.C1206i;
import i4.C1272i;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C1272i lambda$getComponents$0(InterfaceC1129b interfaceC1129b) {
        return new C1272i((i) interfaceC1129b.a(i.class), interfaceC1129b.h(InterfaceC1090b.class), interfaceC1129b.h(InterfaceC0965b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1128a> getComponents() {
        A a2 = new A(C1272i.class, new Class[0]);
        a2.f1213c = LIBRARY_NAME;
        a2.b(C1136i.b(i.class));
        a2.b(new C1136i(0, 2, InterfaceC1090b.class));
        a2.b(new C1136i(0, 2, InterfaceC0965b.class));
        a2.f1216f = new C1206i(2);
        return Arrays.asList(a2.e(), a.h(LIBRARY_NAME, "21.0.0"));
    }
}
