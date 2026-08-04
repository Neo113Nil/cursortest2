package com.google.firebase.storage;

import R5.F;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p042f4.InterfaceC0893b;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";
    p048g4.q blockingExecutor = new p048g4.q(Z3.b.class, Executor.class);
    p048g4.q uiExecutor = new p048g4.q(Z3.d.class, Executor.class);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g lambda$getComponents$0(p048g4.b bVar) {
        return new g((Y3.i) bVar.a(Y3.i.class), bVar.d(InterfaceC0893b.class), bVar.d(p026d4.b.class), (Executor) bVar.f(this.blockingExecutor), (Executor) bVar.f(this.uiExecutor));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<p048g4.a> getComponents() {
        C0.A a2 = new C0.A(g.class, new Class[0]);
        a2.f1213c = LIBRARY_NAME;
        a2.b(p048g4.i.b(Y3.i.class));
        a2.b(new p048g4.i(this.blockingExecutor, 1, 0));
        a2.b(new p048g4.i(this.uiExecutor, 1, 0));
        a2.b(p048g4.i.a(InterfaceC0893b.class));
        a2.b(p048g4.i.a(p026d4.b.class));
        a2.f1216f = new F(this, 6);
        return Arrays.asList(a2.e(), Q0.a.h(LIBRARY_NAME, "21.0.1"));
    }
}
