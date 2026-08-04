package com.google.firebase.database;

import C0.A;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p042f4.InterfaceC0893b;
import p048g4.a;
import p048g4.b;
import p063i4.i;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$0(b bVar) {
        return new i((Y3.i) bVar.a(Y3.i.class), bVar.h(InterfaceC0893b.class), bVar.h(p026d4.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        A a2 = new A(i.class, new Class[0]);
        a2.f1213c = LIBRARY_NAME;
        a2.b(p048g4.i.b(Y3.i.class));
        a2.b(new p048g4.i(0, 2, InterfaceC0893b.class));
        a2.b(new p048g4.i(0, 2, p026d4.b.class));
        a2.f1216f = new p056h4.i(2);
        return Arrays.asList(a2.e(), Q0.a.h(LIBRARY_NAME, "21.0.0"));
    }
}
