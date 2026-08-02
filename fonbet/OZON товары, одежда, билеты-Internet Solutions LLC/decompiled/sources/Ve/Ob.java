package Ve;

/* loaded from: classes10.dex */
public final class Ob implements InterfaceC4678ui {

    /* renamed from: a, reason: collision with root package name */
    public boolean f29607a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29608b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29609c;

    @Override // Ve.InterfaceC4678ui
    public final void a(InterfaceC4103ak interfaceC4103ak) {
        if ((interfaceC4103ak instanceof AbstractC4411lb ? (AbstractC4411lb) interfaceC4103ak : null) != null) {
            AbstractC4411lb abstractC4411lb = (AbstractC4411lb) interfaceC4103ak;
            if (abstractC4411lb instanceof B9) {
                this.f29608b = ((B9) abstractC4411lb).f28683a;
            } else if (abstractC4411lb instanceof C4237fa) {
                this.f29607a = ((C4237fa) abstractC4411lb).f31016a;
            } else if (abstractC4411lb instanceof Ja) {
                this.f29609c = ((Ja) abstractC4411lb).f29283a;
            }
        }
    }

    @Override // Ve.InterfaceC4678ui
    public final Object b(Bk bk) {
        if ((bk instanceof Z8 ? (Z8) bk : null) == null) {
            throw new F6(String.valueOf(bk));
        }
        int ordinal = ((Z8) bk).ordinal();
        if (ordinal == 0) {
            return Boolean.valueOf(this.f29607a && this.f29608b);
        }
        if (ordinal == 1) {
            return Boolean.valueOf(this.f29609c);
        }
        throw new Sc.o();
    }

    public final String toString() {
        boolean z11 = this.f29607a;
        boolean z12 = this.f29608b;
        return Pk0.a.a(")", Lh.a.d("BnplFeatureHandlerImpl(isBnplEnabledByMerch=", ", isBnplEnabledByConfig=true, isBnplEnabledByBank=", ", isBnplEnabledByUser=", z11, z12), this.f29609c);
    }
}
