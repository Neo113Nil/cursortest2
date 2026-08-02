package p000;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vd0 implements InterfaceC0810vo {

    /* JADX INFO: renamed from: a */
    public final nk0 f8181a;

    public vd0(nk0 nk0Var) {
        this.f8181a = nk0Var;
    }

    @Override // p000.InterfaceC0810vo
    /* JADX INFO: renamed from: a */
    public final Class mo2255a() {
        return InputStream.class;
    }

    @Override // p000.InterfaceC0810vo
    /* JADX INFO: renamed from: b */
    public final InterfaceC0847wo mo2256b(Object obj) {
        return new b90((InputStream) obj, this.f8181a);
    }
}
