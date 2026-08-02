package com.google.firebase.storage;

import R5.F;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d4.InterfaceC0965b;
import f4.InterfaceC1090b;
import g4.C1128a;
import g4.C1136i;
import g4.C1144q;
import g4.InterfaceC1129b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

@Keep
/* loaded from: classes2.dex */
public class StorageRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-gcs";
    C1144q blockingExecutor = new C1144q(Z3.b.class, Executor.class);
    C1144q uiExecutor = new C1144q(Z3.d.class, Executor.class);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g lambda$getComponents$0(InterfaceC1129b interfaceC1129b) {
        return new g((Y3.i) interfaceC1129b.a(Y3.i.class), interfaceC1129b.d(InterfaceC1090b.class), interfaceC1129b.d(InterfaceC0965b.class), (Executor) interfaceC1129b.f(this.blockingExecutor), (Executor) interfaceC1129b.f(this.uiExecutor));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1128a> getComponents() {
        C0.A a2 = new C0.A(g.class, new Class[0]);
        a2.f1213c = LIBRARY_NAME;
        a2.b(C1136i.b(Y3.i.class));
        a2.b(new C1136i(this.blockingExecutor, 1, 0));
        a2.b(new C1136i(this.uiExecutor, 1, 0));
        a2.b(C1136i.a(InterfaceC1090b.class));
        a2.b(C1136i.a(InterfaceC0965b.class));
        a2.f1216f = new F(this, 6);
        return Arrays.asList(a2.e(), Q0.a.h(LIBRARY_NAME, "21.0.1"));
    }
}
