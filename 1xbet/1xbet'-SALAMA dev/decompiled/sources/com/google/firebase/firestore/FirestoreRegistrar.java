package com.google.firebase.firestore;

import B1.f;
import B4.L;
import C0.A;
import K4.k;
import M4.g;
import Y3.i;
import Y3.l;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p042f4.InterfaceC0893b;
import p048g4.a;
import p048g4.b;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ L lambda$getComponents$0(b bVar) {
        return new L((Context) bVar.a(Context.class), (i) bVar.a(i.class), bVar.h(InterfaceC0893b.class), bVar.h(p026d4.b.class), new k(bVar.d(R4.b.class), bVar.d(g.class), (l) bVar.a(l.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<a> getComponents() {
        A a2 = new A(L.class, new Class[0]);
        a2.f1213c = LIBRARY_NAME;
        a2.b(p048g4.i.b(i.class));
        a2.b(p048g4.i.b(Context.class));
        a2.b(p048g4.i.a(g.class));
        a2.b(p048g4.i.a(R4.b.class));
        a2.b(new p048g4.i(0, 2, InterfaceC0893b.class));
        a2.b(new p048g4.i(0, 2, p026d4.b.class));
        a2.b(new p048g4.i(0, 0, l.class));
        a2.f1216f = new f(8);
        return Arrays.asList(a2.e(), Q0.a.h(LIBRARY_NAME, "25.1.1"));
    }
}
