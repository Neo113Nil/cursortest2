package i2;

import A1.C0045t0;
import B.v;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import android.net.Uri;
import android.os.SystemClock;
import c2.C0814u;
import c2.I;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.D;
import u2.F;
import u2.H;
import u2.InterfaceC1635l;
import u2.InterfaceC1636m;
import u2.K;
import u2.N;
import v2.t;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1246b implements F {

    /* renamed from: A, reason: collision with root package name */
    public IOException f13838A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C1247c f13839B;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13840a;

    /* renamed from: b, reason: collision with root package name */
    public final K f13841b = new K("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1636m f13842c;

    /* renamed from: d, reason: collision with root package name */
    public C1254j f13843d;

    /* renamed from: e, reason: collision with root package name */
    public long f13844e;

    /* renamed from: f, reason: collision with root package name */
    public long f13845f;

    /* renamed from: x, reason: collision with root package name */
    public long f13846x;

    /* renamed from: y, reason: collision with root package name */
    public long f13847y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13848z;

    public C1246b(C1247c c1247c, Uri uri) {
        this.f13839B = c1247c;
        this.f13840a = uri;
        this.f13842c = ((InterfaceC1635l) c1247c.f13855a.f613b).a();
    }

    public static boolean a(C1246b c1246b, long j) {
        c1246b.f13847y = SystemClock.elapsedRealtime() + j;
        C1247c c1247c = c1246b.f13839B;
        if (!c1246b.f13840a.equals(c1247c.f13851B)) {
            return false;
        }
        List list = c1247c.f13850A.f13916e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i7 = 0; i7 < size; i7++) {
            C1246b c1246b2 = (C1246b) c1247c.f13858d.get(((C1256l) list.get(i7)).f13908a);
            c1246b2.getClass();
            if (elapsedRealtime > c1246b2.f13847y) {
                Uri uri = c1246b2.f13840a;
                c1247c.f13851B = uri;
                c1246b2.c(c1247c.b(uri));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        C1247c c1247c = this.f13839B;
        N n2 = new N(this.f13842c, uri, 4, c1247c.f13856b.i(c1247c.f13850A, this.f13843d));
        M4.e eVar = c1247c.f13857c;
        int i7 = n2.f16730c;
        this.f13841b.f(n2, this, eVar.u(i7));
        c1247c.f13860f.k(new C0814u(n2.f16729b), i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.f13847y = 0L;
        if (this.f13848z) {
            return;
        }
        K k7 = this.f13841b;
        if (k7.d() || k7.b()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f13846x;
        if (elapsedRealtime >= j) {
            b(uri);
        } else {
            this.f13848z = true;
            this.f13839B.f13862y.postDelayed(new K5.a(17, this, uri), j - elapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(C1254j c1254j) {
        long j;
        long j3;
        long j7;
        boolean z4;
        int i7;
        boolean z7;
        int i8;
        C1254j c1254j2;
        Z4.b bVar;
        C1254j c1254j3;
        long j8;
        C1254j c1254j4;
        int size;
        int size2;
        int size3;
        C1254j c1254j5 = this.f13843d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f13844e = elapsedRealtime;
        C1247c c1247c = this.f13839B;
        c1247c.getClass();
        if (c1254j5 != null) {
            long j9 = c1254j.f13893k;
            long j10 = c1254j5.f13893k;
            if (j9 <= j10) {
                boolean z8 = c1254j5.f13897o;
                AbstractC0167z abstractC0167z = c1254j5.f13901s;
                AbstractC0167z abstractC0167z2 = c1254j5.f13900r;
                boolean z9 = c1254j.f13897o;
                if (j9 < j10 || ((size = c1254j.f13900r.size() - abstractC0167z2.size()) == 0 ? !((size2 = c1254j.f13901s.size()) > (size3 = abstractC0167z.size()) || (size2 == size3 && z9 && !z8)) : size <= 0)) {
                    c1254j2 = (!z9 || z8) ? c1254j5 : new C1254j(c1254j5.f13887d, c1254j5.f13924a, c1254j5.f13925b, c1254j5.f13888e, c1254j5.f13890g, c1254j5.f13891h, c1254j5.f13892i, c1254j5.j, c1254j5.f13893k, c1254j5.f13894l, c1254j5.f13895m, c1254j5.f13896n, c1254j5.f13926c, true, c1254j5.f13898p, c1254j5.f13899q, abstractC0167z2, abstractC0167z, c1254j5.f13904v, c1254j5.f13902t);
                    z7 = false;
                    this.f13843d = c1254j2;
                    CopyOnWriteArrayList copyOnWriteArrayList = c1247c.f13859e;
                    Uri uri = this.f13840a;
                    boolean z10 = c1254j2.f13897o;
                    if (c1254j2 == c1254j5) {
                        this.f13838A = null;
                        this.f13845f = elapsedRealtime;
                        if (uri.equals(c1247c.f13851B)) {
                            if (c1247c.f13852C == null) {
                                c1247c.f13853D = !z10;
                                c1247c.f13854E = c1254j2.f13891h;
                            }
                            c1247c.f13852C = c1254j2;
                            c1247c.f13863z.r(c1254j2);
                        }
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1262r) it.next()).a();
                        }
                    } else if (!z10) {
                        long size4 = c1254j.f13893k + c1254j.f13900r.size();
                        C1254j c1254j6 = this.f13843d;
                        if (size4 < c1254j6.f13893k) {
                            bVar = new Z4.b();
                            z7 = true;
                        } else {
                            bVar = ((double) (elapsedRealtime - this.f13845f)) > ((double) t.N(c1254j6.f13895m)) * 3.5d ? new Z4.b() : null;
                        }
                        if (bVar != null) {
                            this.f13838A = bVar;
                            v vVar = new v(bVar, 1, 11);
                            Iterator it2 = copyOnWriteArrayList.iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC1262r) it2.next()).b(uri, vVar, z7);
                            }
                        }
                    }
                    c1254j3 = this.f13843d;
                    if (c1254j3.f13904v.f13886e) {
                        j8 = c1254j3.f13895m;
                        if (c1254j3 == c1254j5) {
                            j8 /= 2;
                        }
                    } else {
                        j8 = 0;
                    }
                    this.f13846x = t.N(j8) + elapsedRealtime;
                    if (this.f13843d.f13896n == -9223372036854775807L || uri.equals(c1247c.f13851B)) {
                        c1254j4 = this.f13843d;
                        if (c1254j4.f13897o) {
                            C1253i c1253i = c1254j4.f13904v;
                            if (c1253i.f13882a != -9223372036854775807L || c1253i.f13886e) {
                                Uri.Builder buildUpon = uri.buildUpon();
                                C1254j c1254j7 = this.f13843d;
                                if (c1254j7.f13904v.f13886e) {
                                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1254j7.f13893k + c1254j7.f13900r.size()));
                                    C1254j c1254j8 = this.f13843d;
                                    if (c1254j8.f13896n != -9223372036854775807L) {
                                        AbstractC0167z abstractC0167z3 = c1254j8.f13901s;
                                        int size5 = abstractC0167z3.size();
                                        if (!abstractC0167z3.isEmpty() && ((C1249e) AbstractC0158p.f(abstractC0167z3)).f13865D) {
                                            size5--;
                                        }
                                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size5));
                                    }
                                }
                                C1253i c1253i2 = this.f13843d.f13904v;
                                if (c1253i2.f13882a != -9223372036854775807L) {
                                    buildUpon.appendQueryParameter("_HLS_skip", c1253i2.f13883b ? "v2" : "YES");
                                }
                                uri = buildUpon.build();
                            }
                            c(uri);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        } else {
            c1254j.getClass();
        }
        boolean z11 = c1254j.f13898p;
        long j11 = c1254j.f13893k;
        if (z11) {
            j = c1254j.f13891h;
        } else {
            C1254j c1254j9 = c1247c.f13852C;
            j = c1254j9 != null ? c1254j9.f13891h : 0L;
            if (c1254j5 != null) {
                AbstractC0167z abstractC0167z4 = c1254j5.f13900r;
                int size6 = abstractC0167z4.size();
                long j12 = c1254j5.f13893k;
                int i9 = (int) (j11 - j12);
                C1251g c1251g = i9 < abstractC0167z4.size() ? (C1251g) abstractC0167z4.get(i9) : null;
                long j13 = c1254j5.f13891h;
                if (c1251g != null) {
                    j7 = c1251g.f13877e;
                } else {
                    long j14 = j;
                    if (size6 == j11 - j12) {
                        j7 = c1254j5.f13903u;
                    } else {
                        j3 = j14;
                        z4 = c1254j.f13892i;
                        AbstractC0167z abstractC0167z5 = c1254j.f13900r;
                        if (z4) {
                            C1254j c1254j10 = c1247c.f13852C;
                            i7 = c1254j10 != null ? c1254j10.j : 0;
                            if (c1254j5 != null) {
                                int i10 = (int) (j11 - c1254j5.f13893k);
                                AbstractC0167z abstractC0167z6 = c1254j5.f13900r;
                                C1251g c1251g2 = i10 < abstractC0167z6.size() ? (C1251g) abstractC0167z6.get(i10) : null;
                                if (c1251g2 != null) {
                                    int i11 = c1254j5.j + c1251g2.f13876d;
                                    z7 = false;
                                    i7 = i11 - ((C1251g) abstractC0167z5.get(0)).f13876d;
                                } else {
                                    z7 = false;
                                }
                                i8 = i7;
                                c1254j2 = new C1254j(c1254j.f13887d, c1254j.f13924a, c1254j.f13925b, c1254j.f13888e, c1254j.f13890g, j3, true, i8, c1254j.f13893k, c1254j.f13894l, c1254j.f13895m, c1254j.f13896n, c1254j.f13926c, c1254j.f13897o, c1254j.f13898p, c1254j.f13899q, abstractC0167z5, c1254j.f13901s, c1254j.f13904v, c1254j.f13902t);
                                this.f13843d = c1254j2;
                                CopyOnWriteArrayList copyOnWriteArrayList2 = c1247c.f13859e;
                                Uri uri2 = this.f13840a;
                                boolean z102 = c1254j2.f13897o;
                                if (c1254j2 == c1254j5) {
                                }
                                c1254j3 = this.f13843d;
                                if (c1254j3.f13904v.f13886e) {
                                }
                                this.f13846x = t.N(j8) + elapsedRealtime;
                                if (this.f13843d.f13896n == -9223372036854775807L) {
                                }
                                c1254j4 = this.f13843d;
                                if (c1254j4.f13897o) {
                                }
                            }
                        } else {
                            i7 = c1254j.j;
                        }
                        i8 = i7;
                        z7 = false;
                        c1254j2 = new C1254j(c1254j.f13887d, c1254j.f13924a, c1254j.f13925b, c1254j.f13888e, c1254j.f13890g, j3, true, i8, c1254j.f13893k, c1254j.f13894l, c1254j.f13895m, c1254j.f13896n, c1254j.f13926c, c1254j.f13897o, c1254j.f13898p, c1254j.f13899q, abstractC0167z5, c1254j.f13901s, c1254j.f13904v, c1254j.f13902t);
                        this.f13843d = c1254j2;
                        CopyOnWriteArrayList copyOnWriteArrayList22 = c1247c.f13859e;
                        Uri uri22 = this.f13840a;
                        boolean z1022 = c1254j2.f13897o;
                        if (c1254j2 == c1254j5) {
                        }
                        c1254j3 = this.f13843d;
                        if (c1254j3.f13904v.f13886e) {
                        }
                        this.f13846x = t.N(j8) + elapsedRealtime;
                        if (this.f13843d.f13896n == -9223372036854775807L) {
                        }
                        c1254j4 = this.f13843d;
                        if (c1254j4.f13897o) {
                        }
                    }
                }
                j = j7 + j13;
            }
        }
        j3 = j;
        z4 = c1254j.f13892i;
        AbstractC0167z abstractC0167z52 = c1254j.f13900r;
        if (z4) {
        }
        i8 = i7;
        z7 = false;
        c1254j2 = new C1254j(c1254j.f13887d, c1254j.f13924a, c1254j.f13925b, c1254j.f13888e, c1254j.f13890g, j3, true, i8, c1254j.f13893k, c1254j.f13894l, c1254j.f13895m, c1254j.f13896n, c1254j.f13926c, c1254j.f13897o, c1254j.f13898p, c1254j.f13899q, abstractC0167z52, c1254j.f13901s, c1254j.f13904v, c1254j.f13902t);
        this.f13843d = c1254j2;
        CopyOnWriteArrayList copyOnWriteArrayList222 = c1247c.f13859e;
        Uri uri222 = this.f13840a;
        boolean z10222 = c1254j2.f13897o;
        if (c1254j2 == c1254j5) {
        }
        c1254j3 = this.f13843d;
        if (c1254j3.f13904v.f13886e) {
        }
        this.f13846x = t.N(j8) + elapsedRealtime;
        if (this.f13843d.f13896n == -9223372036854775807L) {
        }
        c1254j4 = this.f13843d;
        if (c1254j4.f13897o) {
        }
    }

    @Override // u2.F
    public final void g(H h6, long j, long j3) {
        N n2 = (N) h6;
        AbstractC1258n abstractC1258n = (AbstractC1258n) n2.f16733f;
        Uri uri = n2.f16731d.f16755c;
        C0814u c0814u = new C0814u();
        if (abstractC1258n instanceof C1254j) {
            d((C1254j) abstractC1258n);
            this.f13839B.f13860f.f(c0814u, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            C0045t0 b7 = C0045t0.b("Loaded playlist has unexpected type.", null);
            this.f13838A = b7;
            this.f13839B.f13860f.i(c0814u, 4, b7, true);
        }
        this.f13839B.f13857c.getClass();
    }

    @Override // u2.F
    public final Q1.e i(H h6, IOException iOException, int i7) {
        N n2 = (N) h6;
        long j = n2.f16728a;
        Uri uri = n2.f16731d.f16755c;
        C0814u c0814u = new C0814u();
        boolean z4 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z7 = iOException instanceof C1259o;
        Q1.e eVar = K.f16723e;
        Uri uri2 = this.f13840a;
        C1247c c1247c = this.f13839B;
        int i8 = n2.f16730c;
        if (z4 || z7) {
            int i9 = iOException instanceof D ? ((D) iOException).f16709d : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (z7 || i9 == 400 || i9 == 503) {
                this.f13846x = SystemClock.elapsedRealtime();
                c(uri2);
                I i10 = c1247c.f13860f;
                int i11 = t.f17153a;
                i10.i(c0814u, i8, iOException, true);
                return eVar;
            }
        }
        v vVar = new v(iOException, i7, 11);
        Iterator it = c1247c.f13859e.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= !((InterfaceC1262r) it.next()).b(uri2, vVar, false);
        }
        M4.e eVar2 = c1247c.f13857c;
        if (z8) {
            eVar2.getClass();
            long v6 = M4.e.v(vVar);
            eVar = v6 != -9223372036854775807L ? new Q1.e(v6, 0, false) : K.f16724f;
        }
        boolean a2 = eVar.a();
        c1247c.f13860f.i(c0814u, i8, iOException, true ^ a2);
        if (!a2) {
            eVar2.getClass();
        }
        return eVar;
    }

    @Override // u2.F
    public final void l(H h6, long j, long j3, boolean z4) {
        N n2 = (N) h6;
        long j7 = n2.f16728a;
        Uri uri = n2.f16731d.f16755c;
        C0814u c0814u = new C0814u();
        C1247c c1247c = this.f13839B;
        c1247c.f13857c.getClass();
        c1247c.f13860f.d(c0814u, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
