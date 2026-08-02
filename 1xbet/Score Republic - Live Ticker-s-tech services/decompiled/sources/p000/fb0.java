package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fb0 extends bj1 {
    @Override // p000.InterfaceC0518ns
    /* JADX INFO: renamed from: a */
    public final void mo1751a(InterfaceC0518ns interfaceC0518ns) {
        C0205fb c0205fb = (C0205fb) this.f890b;
        int i = c0205fb.f2368r0;
        C0629qs c0629qs = this.f896h;
        ArrayList arrayList = c0629qs.f6583l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((C0629qs) obj).f6578g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            c0629qs.mo759d(i3 + c0205fb.f2370t0);
        } else {
            c0629qs.mo759d(i2 + c0205fb.f2370t0);
        }
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: d */
    public final void mo708d() {
        C0143dm c0143dm = this.f890b;
        if (c0143dm instanceof C0205fb) {
            C0629qs c0629qs = this.f896h;
            c0629qs.f6573b = true;
            ArrayList arrayList = c0629qs.f6583l;
            C0205fb c0205fb = (C0205fb) c0143dm;
            int i = c0205fb.f2368r0;
            boolean z = c0205fb.f2369s0;
            int i2 = 0;
            if (i == 0) {
                c0629qs.f6576e = 4;
                while (i2 < c0205fb.f2367q0) {
                    C0143dm c0143dm2 = c0205fb.f2366p0[i2];
                    if (z || c0143dm2.f1718f0 != 8) {
                        C0629qs c0629qs2 = c0143dm2.f1713d.f896h;
                        c0629qs2.f6582k.add(c0629qs);
                        arrayList.add(c0629qs2);
                    }
                    i2++;
                }
                m1758m(this.f890b.f1713d.f896h);
                m1758m(this.f890b.f1713d.f897i);
                return;
            }
            if (i == 1) {
                c0629qs.f6576e = 5;
                while (i2 < c0205fb.f2367q0) {
                    C0143dm c0143dm3 = c0205fb.f2366p0[i2];
                    if (z || c0143dm3.f1718f0 != 8) {
                        C0629qs c0629qs3 = c0143dm3.f1713d.f897i;
                        c0629qs3.f6582k.add(c0629qs);
                        arrayList.add(c0629qs3);
                    }
                    i2++;
                }
                m1758m(this.f890b.f1713d.f896h);
                m1758m(this.f890b.f1713d.f897i);
                return;
            }
            if (i == 2) {
                c0629qs.f6576e = 6;
                while (i2 < c0205fb.f2367q0) {
                    C0143dm c0143dm4 = c0205fb.f2366p0[i2];
                    if (z || c0143dm4.f1718f0 != 8) {
                        C0629qs c0629qs4 = c0143dm4.f1715e.f896h;
                        c0629qs4.f6582k.add(c0629qs);
                        arrayList.add(c0629qs4);
                    }
                    i2++;
                }
                m1758m(this.f890b.f1715e.f896h);
                m1758m(this.f890b.f1715e.f897i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0629qs.f6576e = 7;
            while (i2 < c0205fb.f2367q0) {
                C0143dm c0143dm5 = c0205fb.f2366p0[i2];
                if (z || c0143dm5.f1718f0 != 8) {
                    C0629qs c0629qs5 = c0143dm5.f1715e.f897i;
                    c0629qs5.f6582k.add(c0629qs);
                    arrayList.add(c0629qs5);
                }
                i2++;
            }
            m1758m(this.f890b.f1715e.f896h);
            m1758m(this.f890b.f1715e.f897i);
        }
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: e */
    public final void mo709e() {
        C0143dm c0143dm = this.f890b;
        if (c0143dm instanceof C0205fb) {
            int i = ((C0205fb) c0143dm).f2368r0;
            C0629qs c0629qs = this.f896h;
            if (i == 0 || i == 1) {
                c0143dm.f1704X = c0629qs.f6578g;
            } else {
                c0143dm.f1705Y = c0629qs.f6578g;
            }
        }
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: f */
    public final void mo710f() {
        this.f891c = null;
        this.f896h.m4137c();
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: k */
    public final boolean mo713k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m1758m(C0629qs c0629qs) {
        C0629qs c0629qs2 = this.f896h;
        c0629qs2.f6582k.add(c0629qs);
        c0629qs.f6583l.add(c0629qs2);
    }
}
