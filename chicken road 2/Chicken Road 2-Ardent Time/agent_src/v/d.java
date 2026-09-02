package v;

/* loaded from: classes.dex */
public final class d implements x.InterfaceC1010a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f8368b;

    public /* synthetic */ d(int i2, java.lang.Object obj) {
        this.f8367a = i2;
        this.f8368b = obj;
    }

    @Override // x.InterfaceC1010a
    public final void accept(java.lang.Object obj) {
        switch (this.f8367a) {
            case 0:
                v.e eVar = (v.e) obj;
                if (eVar == null) {
                    eVar = new v.e(-3);
                }
                ((o0.i) this.f8368b).b(eVar);
                return;
            default:
                v.e eVar2 = (v.e) obj;
                synchronized (v.f.f8373c) {
                    try {
                        l.k kVar = v.f.f8374d;
                        java.util.ArrayList arrayList = (java.util.ArrayList) kVar.getOrDefault((java.lang.String) this.f8368b, null);
                        if (arrayList == null) {
                            return;
                        }
                        kVar.remove((java.lang.String) this.f8368b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((x.InterfaceC1010a) arrayList.get(i2)).accept(eVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
