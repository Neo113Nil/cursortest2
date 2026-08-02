package Ve;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class Qc implements InterfaceC4678ui {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f29767a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public String f29768b = "";

    @Override // Ve.InterfaceC4678ui
    public final void a(InterfaceC4103ak interfaceC4103ak) {
        if ((interfaceC4103ak instanceof AbstractC4499oc ? (AbstractC4499oc) interfaceC4103ak : null) != null) {
            AbstractC4499oc abstractC4499oc = (AbstractC4499oc) interfaceC4103ak;
            if (abstractC4499oc instanceof C4267gb) {
                this.f29768b = ((C4267gb) interfaceC4103ak).f31101b;
            } else {
                if (!(abstractC4499oc instanceof Jb)) {
                    throw new Sc.o();
                }
                ArrayList arrayList = this.f29767a;
                arrayList.clear();
                arrayList.addAll(((Jb) interfaceC4103ak).f29284b);
            }
        }
    }

    @Override // Ve.InterfaceC4678ui
    public final Object b(Bk bk) {
        Object valueOf;
        if ((bk instanceof Ea ? (Ea) bk : null) != null) {
            int ordinal = ((Ea) bk).ordinal();
            boolean z11 = true;
            if (ordinal == 0) {
                ArrayList arrayList = this.f29767a;
                if ((arrayList.isEmpty() || arrayList.contains("3.1.3")) && !arrayList.isEmpty()) {
                    z11 = false;
                }
                valueOf = Boolean.valueOf(z11);
            } else {
                if (ordinal != 1) {
                    throw new Sc.o();
                }
                valueOf = this.f29768b;
            }
            if (valueOf != null) {
                return valueOf;
            }
        }
        throw new F6(String.valueOf(bk));
    }
}
