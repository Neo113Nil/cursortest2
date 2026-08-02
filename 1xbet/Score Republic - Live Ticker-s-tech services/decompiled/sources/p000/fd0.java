package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fd0 implements ou0, lu0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ jm0 f2379j;

    public /* synthetic */ fd0(jm0 jm0Var) {
        this.f2379j = jm0Var;
    }

    @Override // p000.ou0
    /* JADX INFO: renamed from: b */
    public void mo306b(Object obj) {
        InterfaceC0187eu interfaceC0187eu;
        jm0 jm0Var = this.f2379j;
        Object obj2 = jm0Var.get();
        EnumC0262gu enumC0262gu = EnumC0262gu.f2872j;
        if (obj2 != enumC0262gu && (interfaceC0187eu = (InterfaceC0187eu) jm0Var.getAndSet(enumC0262gu)) != enumC0262gu) {
            xm0 xm0Var = (xm0) jm0Var.f4028k;
            try {
                if (obj == null) {
                    xm0Var.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    xm0Var.mo976b(obj);
                }
                if (interfaceC0187eu != null) {
                    interfaceC0187eu.mo480c();
                }
            } catch (Throwable th) {
                if (interfaceC0187eu != null) {
                    interfaceC0187eu.mo480c();
                }
                throw th;
            }
        }
        jm0Var.onComplete();
    }

    @Override // p000.lu0
    /* JADX INFO: renamed from: e */
    public void mo309e(Exception exc) {
        jm0 jm0Var = this.f2379j;
        jm0Var.onError(exc);
        jm0Var.onComplete();
    }
}
