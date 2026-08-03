package M1;

/* loaded from: classes.dex */
public final class h extends V1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M1.i f1052m;

    public h(M1.i iVar) {
        this.f1052m = iVar;
    }

    @Override // V1.e
    public final void j() {
        java.net.Socket socket;
        M1.i iVar = this.f1052m;
        if (iVar.f1065m) {
            return;
        }
        iVar.f1065m = true;
        M1.e eVar = iVar.f1066n;
        if (eVar != null) {
            ((N1.e) eVar.f1040d).cancel();
        }
        M1.k kVar = iVar.f1067o;
        if (kVar == null || (socket = kVar.f1070c) == null) {
            return;
        }
        J1.b.e(socket);
    }
}
