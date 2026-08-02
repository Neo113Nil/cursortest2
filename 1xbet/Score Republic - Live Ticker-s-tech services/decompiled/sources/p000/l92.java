package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class l92 extends AbstractC0269h0 {

    /* JADX INFO: renamed from: q */
    public C0902y5 f4739q;

    /* JADX INFO: renamed from: r */
    public final int f4740r;

    public l92(C0902y5 c0902y5, int i) {
        this.f4739q = c0902y5;
        this.f4740r = i;
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: b */
    public final void mo549b() {
        AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        C0902y5 c0902y5 = this.f4739q;
        this.f4739q = null;
        if (c0902y5 == null) {
            return;
        }
        AtomicReference atomicReference = (AtomicReference) c0902y5.f9156c;
        do {
            atomicLong = (AtomicLong) c0902y5.f9155b;
            j = atomicLong.get();
            i = (int) j;
            long j2 = j >>> 32;
            if (i == Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 13);
                sb.append("Refcount is: ");
                sb.append(j);
                throw new AssertionError(sb.toString());
            }
            i2 = (int) j2;
            z = i == -2147483647;
            if (z) {
                i2++;
            }
        } while (!atomicLong.compareAndSet(j, (((long) i2) << 32) | (4294967295L & ((long) (i - 1)))));
        if (z) {
            while (true) {
                m92 m92Var = (m92) atomicReference.get();
                if (m92Var != null) {
                    if (m92Var.f5014q <= this.f4740r) {
                        m92Var.cancel(true);
                        while (!atomicReference.compareAndSet(m92Var, null)) {
                            if (atomicReference.get() != m92Var) {
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: j */
    public final String mo550j() {
        InterfaceC0350j8 interfaceC0350j8;
        C0902y5 c0902y5 = this.f4739q;
        if (c0902y5 == null || (interfaceC0350j8 = (InterfaceC0350j8) ((j92) c0902y5.f9154a).f3862k) == null) {
            return null;
        }
        String string = interfaceC0350j8.toString();
        String strM286i = AbstractC0024an.m286i(new StringBuilder(string.length() + 11), "callable=[", string, "]");
        m92 m92Var = (m92) ((AtomicReference) this.f4739q.f9156c).get();
        if (m92Var == null) {
            return strM286i;
        }
        int length = strM286i.length();
        String string2 = m92Var.toString();
        StringBuilder sb = new StringBuilder(string2.length() + length + 9 + 1);
        sb.append(strM286i);
        sb.append(", trial=[");
        sb.append(string2);
        sb.append("]");
        return sb.toString();
    }
}
