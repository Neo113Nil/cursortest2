package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sm0 implements InterfaceC0435lj, InterfaceC0187eu, xm0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7150j;

    /* JADX INFO: renamed from: k */
    public final Object f7151k;

    /* JADX INFO: renamed from: l */
    public InterfaceC0187eu f7152l;

    public /* synthetic */ sm0(int i, Object obj) {
        this.f7150j = i;
        this.f7151k = obj;
    }

    @Override // p000.InterfaceC0435lj
    /* JADX INFO: renamed from: a */
    public final void mo608a(InterfaceC0187eu interfaceC0187eu) {
        int i = this.f7150j;
        Object obj = this.f7151k;
        switch (i) {
            case 0:
                if (EnumC0262gu.m2150f(this.f7152l, interfaceC0187eu)) {
                    this.f7152l = interfaceC0187eu;
                    ((xm0) obj).mo975a(this);
                }
                break;
            case 1:
                if (EnumC0262gu.m2150f(this.f7152l, interfaceC0187eu)) {
                    this.f7152l = interfaceC0187eu;
                    ((xm0) obj).mo975a(this);
                }
                break;
            default:
                if (EnumC0262gu.m2150f(this.f7152l, interfaceC0187eu)) {
                    this.f7152l = interfaceC0187eu;
                    ((c81) obj).mo77a(this);
                }
                break;
        }
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: b */
    public void mo976b(Object obj) {
        int i = this.f7150j;
        Object obj2 = this.f7151k;
        switch (i) {
            case 1:
                ((xm0) obj2).mo976b(Boolean.FALSE);
                break;
            default:
                this.f7152l = EnumC0262gu.f2872j;
                ((c81) obj2).mo78b(Boolean.FALSE);
                break;
        }
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        int i = this.f7150j;
        EnumC0262gu enumC0262gu = EnumC0262gu.f2872j;
        switch (i) {
            case 0:
                this.f7152l.mo480c();
                this.f7152l = enumC0262gu;
                break;
            case 1:
                this.f7152l.mo480c();
                break;
            default:
                this.f7152l.mo480c();
                this.f7152l = enumC0262gu;
                break;
        }
    }

    @Override // p000.InterfaceC0435lj
    public final void onComplete() {
        int i = this.f7150j;
        EnumC0262gu enumC0262gu = EnumC0262gu.f2872j;
        Object obj = this.f7151k;
        switch (i) {
            case 0:
                this.f7152l = enumC0262gu;
                ((xm0) obj).onComplete();
                break;
            case 1:
                ((xm0) obj).mo976b(Boolean.TRUE);
                break;
            default:
                this.f7152l = enumC0262gu;
                ((c81) obj).mo78b(Boolean.TRUE);
                break;
        }
    }

    @Override // p000.InterfaceC0435lj
    public final void onError(Throwable th) {
        int i = this.f7150j;
        EnumC0262gu enumC0262gu = EnumC0262gu.f2872j;
        Object obj = this.f7151k;
        switch (i) {
            case 0:
                this.f7152l = enumC0262gu;
                ((xm0) obj).onError(th);
                break;
            case 1:
                ((xm0) obj).onError(th);
                break;
            default:
                this.f7152l = enumC0262gu;
                ((c81) obj).onError(th);
                break;
        }
    }
}
