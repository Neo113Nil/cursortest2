package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Tl implements InterfaceC4678ui {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30066a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30067b;

    @Override // Ve.InterfaceC4678ui
    public final void a(InterfaceC4103ak interfaceC4103ak) {
        InterfaceC4507ok interfaceC4507ok = (InterfaceC4507ok) interfaceC4103ak;
        if (Intrinsics.d(interfaceC4507ok, C4419lj.f31533a)) {
            this.f30066a = true;
        } else if (Intrinsics.d(interfaceC4507ok, Nj.f29561a)) {
            this.f30067b = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (r2.f30067b == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
    
        if (r2.f30067b != false) goto L30;
     */
    @Override // Ve.InterfaceC4678ui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Bk bk) {
        boolean z11;
        Qk qk2 = (Qk) bk;
        int i11 = qk2 == null ? -1 : AbstractC4681ul.f32228a[qk2.ordinal()];
        if (i11 != -1) {
            z11 = true;
            if (i11 == 1) {
                z11 = this.f30066a;
            } else if (i11 == 2) {
                z11 = this.f30067b;
            } else if (i11 != 3) {
                if (i11 != 4) {
                    throw new Sc.o();
                }
                if (!this.f30066a) {
                }
            } else if (this.f30066a) {
            }
            return Boolean.valueOf(z11);
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }
}
