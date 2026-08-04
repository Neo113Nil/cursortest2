package E4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f2100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0174g f2101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0169b f2102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2103d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2104e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public O f2105f;

    public D(C c3, C0174g c0174g, C0169b c0169b) {
        this.f2100a = c3;
        this.f2102c = c0169b;
        this.f2101b = c0174g;
    }

    public final boolean a() {
        return !p136t.e.b(this.f2101b.f2184d, 2);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    public final boolean b(O o7) {
        boolean z4;
        boolean z7 = true;
        p113p3.f.O("We got a new snapshot with no changes?", !o7.f2159d.isEmpty() || o7.f2162g, new Object[0]);
        C0174g c0174g = this.f2101b;
        if (!c0174g.f2181a) {
            ArrayList arrayList = new ArrayList();
            for (C0173f c0173f : o7.f2159d) {
                if (c0173f.f2179a != EnumC0172e.f2177d) {
                    arrayList.add(c0173f);
                }
            }
            o7 = new O(o7.f2156a, o7.f2157b, o7.f2158c, arrayList, o7.f2160e, o7.f2161f, o7.f2162g, true, o7.f2164i);
        }
        if (this.f2103d) {
            if (o7.f2159d.isEmpty()) {
                O o8 = this.f2105f;
                z4 = (o7.f2162g || (o8 != null && (o8.f2161f.f14781a.isEmpty() ^ true) != (o7.f2161f.f14781a.isEmpty() ^ true))) ? c0174g.f2182b : false;
            } else {
                z4 = true;
            }
            if (z4) {
                this.f2102c.a(o7, null);
            } else {
                z7 = false;
            }
        } else if (d(o7, this.f2104e)) {
            c(o7);
        } else {
            z7 = false;
        }
        this.f2105f = o7;
        return z7;
    }

    public final void c(O o7) {
        p113p3.f.O("Trying to raise initial event for second time", !this.f2103d, new Object[0]);
        C c3 = o7.f2156a;
        ArrayList arrayList = new ArrayList();
        H4.i iVar = o7.f2157b;
        Iterator it = iVar.f3320b.iterator();
        while (true) {
            E3.F f7 = (E3.F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                O o8 = new O(c3, iVar, new H4.i(H4.g.f3315a, new p075k4.e(Collections.emptyList(), new M(c3.a(), 1))), arrayList, o7.f2160e, o7.f2161f, true, o7.f2163h, o7.f2164i);
                this.f2103d = true;
                this.f2102c.a(o8, null);
                return;
            }
            arrayList.add(new C0173f(EnumC0172e.f2175b, (H4.k) f7.next()));
        }
    }

    public final boolean d(O o7, int i7) {
        p113p3.f.O("Determining whether to raise first event but already had first event.", !this.f2103d, new Object[0]);
        if (!o7.f2160e || !a()) {
            return true;
        }
        boolean zB = p136t.e.b(i7, 3);
        if (!this.f2101b.f2183c || zB) {
            return !o7.f2157b.f3319a.isEmpty() || o7.f2164i || p136t.e.b(i7, 3);
        }
        p113p3.f.O("Waiting for sync, but snapshot is not from cache", o7.f2160e, new Object[0]);
        return false;
    }
}
