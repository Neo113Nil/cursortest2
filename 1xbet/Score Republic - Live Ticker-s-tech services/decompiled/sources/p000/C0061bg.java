package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: bg */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0061bg extends g61 {

    /* JADX INFO: renamed from: g */
    public final C0650rc f855g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AtomicReferenceArray f856h;

    public C0061bg(long j, C0061bg c0061bg, C0650rc c0650rc, int i) {
        super(j, c0061bg, i);
        this.f855g = c0650rc;
        this.f856h = new AtomicReferenceArray(AbstractC0724tc.f7412b * 2);
    }

    @Override // p000.g61
    /* JADX INFO: renamed from: k */
    public final int mo643k() {
        return AbstractC0724tc.f7412b;
    }

    @Override // p000.g61
    /* JADX INFO: renamed from: l */
    public final void mo644l(int i, InterfaceC0180en interfaceC0180en) {
        C0650rc c0650rc;
        int i2 = AbstractC0724tc.f7412b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f856h.get(i * 2);
        while (true) {
            Object objM646p = m646p(i);
            boolean z2 = objM646p instanceof pi1;
            c0650rc = this.f855g;
            if (z2 || (objM646p instanceof qi1)) {
                if (m645o(i, objM646p, z ? AbstractC0724tc.f7420j : AbstractC0724tc.f7421k)) {
                    m648r(i, null);
                    m647q(i, !z);
                    if (z) {
                        c0650rc.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objM646p == AbstractC0724tc.f7420j || objM646p == AbstractC0724tc.f7421k) {
                    break;
                }
                if (objM646p != AbstractC0724tc.f7417g && objM646p != AbstractC0724tc.f7416f) {
                    if (objM646p == AbstractC0724tc.f7419i || objM646p == AbstractC0724tc.f7414d || objM646p == AbstractC0724tc.f7422l) {
                        return;
                    }
                    dd0.m1162g(objM646p, "unexpected state: ");
                    return;
                }
            }
        }
        m648r(i, null);
        if (z) {
            c0650rc.getClass();
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m645o(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f856h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final Object m646p(int i) {
        return this.f856h.get((i * 2) + 1);
    }

    /* JADX INFO: renamed from: q */
    public final void m647q(int i, boolean z) {
        if (z) {
            C0650rc c0650rc = this.f855g;
            c0650rc.getClass();
            c0650rc.m4316K((this.f2635e * ((long) AbstractC0724tc.f7412b)) + ((long) i));
        }
        m1990m();
    }

    /* JADX INFO: renamed from: r */
    public final void m648r(int i, Object obj) {
        this.f856h.set(i * 2, obj);
    }

    /* JADX INFO: renamed from: s */
    public final void m649s(int i, Object obj) {
        this.f856h.set((i * 2) + 1, obj);
    }
}
