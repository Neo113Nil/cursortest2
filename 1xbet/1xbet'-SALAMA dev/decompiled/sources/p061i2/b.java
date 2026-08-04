package p061i2;

import A1.C0045t0;
import B.v;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import K5.a;
import M4.e;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p018c2.C0774u;
import p018c2.I;
import p146u2.D;
import p146u2.F;
import p146u2.H;
import p146u2.InterfaceC0953l;
import p146u2.InterfaceC0954m;
import p146u2.K;
import p146u2.N;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements F {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public IOException f13844A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ c f13845B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f13846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f13847b = new K("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0954m f13848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f13849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f13851f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f13852x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f13853y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13854z;

    public b(c cVar, Uri uri) {
        this.f13845B = cVar;
        this.f13846a = uri;
        this.f13848c = ((InterfaceC0953l) cVar.f13861a.f613b).a();
    }

    public static boolean a(b bVar, long j) {
        bVar.f13853y = SystemClock.elapsedRealtime() + j;
        c cVar = bVar.f13845B;
        if (!bVar.f13846a.equals(cVar.f13857B)) {
            return false;
        }
        List list = cVar.f13856A.f13922e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar2 = (b) cVar.f13864d.get(((l) list.get(i7)).f13914a);
            bVar2.getClass();
            if (jElapsedRealtime > bVar2.f13853y) {
                Uri uri = bVar2.f13846a;
                cVar.f13857B = uri;
                bVar2.c(cVar.b(uri));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        c cVar = this.f13845B;
        N n2 = new N(this.f13848c, uri, 4, cVar.f13862b.i(cVar.f13856A, this.f13849d));
        e eVar = cVar.f13863c;
        int i7 = n2.f16736c;
        this.f13847b.f(n2, this, eVar.u(i7));
        cVar.f13866f.k(new C0774u(n2.f16735b), i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.f13853y = 0L;
        if (this.f13854z) {
            return;
        }
        K k7 = this.f13847b;
        if (k7.d() || k7.b()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f13852x;
        if (jElapsedRealtime >= j) {
            b(uri);
        } else {
            this.f13854z = true;
            this.f13845B.f13868y.postDelayed(new a(17, this, uri), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x021c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0232  */
    /* JADX WARN: Code duplicated, block: B:107:0x0240  */
    /* JADX WARN: Code duplicated, block: B:109:0x0248  */
    /* JADX WARN: Code duplicated, block: B:112:0x024d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0259  */
    /* JADX WARN: Code duplicated, block: B:116:0x0274  */
    /* JADX WARN: Code duplicated, block: B:118:0x0280  */
    /* JADX WARN: Code duplicated, block: B:124:0x029f  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x0118  */
    /* JADX WARN: Code duplicated, block: B:66:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0182  */
    /* JADX WARN: Code duplicated, block: B:72:0x018f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0193  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ac A[LOOP:0: B:77:0x01a6->B:79:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:93:0x0201 A[LOOP:1: B:91:0x01fb->B:93:0x0201, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0213  */
    /* JADX WARN: Code duplicated, block: B:99:0x0218  */
    public final void d(j jVar) {
        long j;
        long j3;
        long j7;
        boolean z4;
        AbstractC0167z abstractC0167z;
        j jVar2;
        int i7;
        int i8;
        AbstractC0167z abstractC0167z2;
        g gVar;
        boolean z7;
        int i9;
        j jVar3;
        CopyOnWriteArrayList copyOnWriteArrayList;
        Uri uriBuild;
        boolean z8;
        long size;
        j jVar4;
        Z4.b bVar;
        v vVar;
        Iterator it;
        j jVar5;
        long j8;
        j jVar6;
        i iVar;
        Uri.Builder builderBuildUpon;
        j jVar7;
        i iVar2;
        String str;
        j jVar8;
        AbstractC0167z abstractC0167z3;
        int size2;
        Iterator it2;
        int size3;
        int size4;
        int size5;
        j jVar9 = this.f13849d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f13850e = jElapsedRealtime;
        c cVar = this.f13845B;
        cVar.getClass();
        if (jVar9 != null) {
            long j9 = jVar.f13899k;
            long j10 = jVar9.f13899k;
            if (j9 <= j10) {
                boolean z9 = jVar9.f13903o;
                AbstractC0167z abstractC0167z4 = jVar9.f13907s;
                AbstractC0167z abstractC0167z5 = jVar9.f13906r;
                boolean z10 = jVar.f13903o;
                if (j9 < j10 || ((size3 = jVar.f13906r.size() - abstractC0167z5.size()) == 0 ? !((size4 = jVar.f13907s.size()) > (size5 = abstractC0167z4.size()) || (size4 == size5 && z10 && !z9)) : size3 <= 0)) {
                    jVar3 = (!z10 || z9) ? jVar9 : new j(jVar9.f13893d, jVar9.f13930a, jVar9.f13931b, jVar9.f13894e, jVar9.f13896g, jVar9.f13897h, jVar9.f13898i, jVar9.j, jVar9.f13899k, jVar9.f13900l, jVar9.f13901m, jVar9.f13902n, jVar9.f13932c, true, jVar9.f13904p, jVar9.f13905q, abstractC0167z5, abstractC0167z4, jVar9.f13910v, jVar9.f13908t);
                    z7 = false;
                }
            }
            this.f13849d = jVar3;
            copyOnWriteArrayList = cVar.f13865e;
            uriBuild = this.f13846a;
            z8 = jVar3.f13903o;
            if (jVar3 != jVar9) {
                this.f13844A = null;
                this.f13851f = jElapsedRealtime;
                if (uriBuild.equals(cVar.f13857B)) {
                    if (cVar.f13858C == null) {
                        cVar.f13859D = !z8;
                        cVar.f13860E = jVar3.f13897h;
                    }
                    cVar.f13858C = jVar3;
                    cVar.f13869z.r(jVar3);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((r) it2.next()).a();
                }
            } else if (!z8) {
                size = jVar.f13899k + ((long) jVar.f13906r.size());
                jVar4 = this.f13849d;
                if (size < jVar4.f13899k) {
                    bVar = new Z4.b();
                    z7 = true;
                } else if (jElapsedRealtime - this.f13851f > t.N(jVar4.f13901m) * 3.5d) {
                    bVar = new Z4.b();
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    this.f13844A = bVar;
                    vVar = new v(bVar, 1, 11);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((r) it.next()).b(uriBuild, vVar, z7);
                    }
                }
            }
            jVar5 = this.f13849d;
            if (jVar5.f13910v.f13892e) {
                j8 = 0;
            } else {
                j8 = jVar5.f13901m;
                if (jVar5 == jVar9) {
                    j8 /= 2;
                }
            }
            this.f13852x = t.N(j8) + jElapsedRealtime;
            if (this.f13849d.f13902n == -9223372036854775807L || uriBuild.equals(cVar.f13857B)) {
                jVar6 = this.f13849d;
                if (jVar6.f13903o) {
                }
                iVar = jVar6.f13910v;
                if (iVar.f13888a == -9223372036854775807L || iVar.f13892e) {
                    builderBuildUpon = uriBuild.buildUpon();
                    jVar7 = this.f13849d;
                    if (jVar7.f13910v.f13892e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar7.f13899k + ((long) jVar7.f13906r.size())));
                        jVar8 = this.f13849d;
                        if (jVar8.f13902n != -9223372036854775807L) {
                            abstractC0167z3 = jVar8.f13907s;
                            size2 = abstractC0167z3.size();
                            if (!abstractC0167z3.isEmpty() && ((e) AbstractC0158p.f(abstractC0167z3)).f13871D) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    iVar2 = this.f13849d.f13910v;
                    if (iVar2.f13888a != -9223372036854775807L) {
                        if (iVar2.f13889b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                }
                c(uriBuild);
            }
            return;
        }
        jVar.getClass();
        boolean z11 = jVar.f13904p;
        long j11 = jVar.f13899k;
        if (!z11) {
            j jVar10 = cVar.f13858C;
            j = jVar10 != null ? jVar10.f13897h : 0L;
            if (jVar9 != null) {
                AbstractC0167z abstractC0167z6 = jVar9.f13906r;
                int size6 = abstractC0167z6.size();
                long j12 = jVar9.f13899k;
                int i10 = (int) (j11 - j12);
                g gVar2 = i10 < abstractC0167z6.size() ? (g) abstractC0167z6.get(i10) : null;
                long j13 = jVar9.f13897h;
                if (gVar2 != null) {
                    j7 = gVar2.f13883e;
                } else {
                    long j14 = j;
                    if (size6 == j11 - j12) {
                        j7 = jVar9.f13909u;
                    } else {
                        j3 = j14;
                    }
                }
                j = j7 + j13;
            }
            z4 = jVar.f13898i;
            abstractC0167z = jVar.f13906r;
            if (z4) {
                jVar2 = cVar.f13858C;
                if (jVar2 != null) {
                    i7 = jVar2.j;
                } else {
                    i7 = 0;
                }
                if (jVar9 == null) {
                    i8 = (int) (j11 - jVar9.f13899k);
                    abstractC0167z2 = jVar9.f13906r;
                    if (i8 < abstractC0167z2.size()) {
                        gVar = (g) abstractC0167z2.get(i8);
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        int i11 = jVar9.j + gVar.f13882d;
                        z7 = false;
                        i7 = i11 - ((g) abstractC0167z.get(0)).f13882d;
                    } else {
                        z7 = false;
                    }
                    i9 = i7;
                }
                jVar3 = new j(jVar.f13893d, jVar.f13930a, jVar.f13931b, jVar.f13894e, jVar.f13896g, j3, true, i9, jVar.f13899k, jVar.f13900l, jVar.f13901m, jVar.f13902n, jVar.f13932c, jVar.f13903o, jVar.f13904p, jVar.f13905q, abstractC0167z, jVar.f13907s, jVar.f13910v, jVar.f13908t);
                this.f13849d = jVar3;
                copyOnWriteArrayList = cVar.f13865e;
                uriBuild = this.f13846a;
                z8 = jVar3.f13903o;
                if (jVar3 != jVar9) {
                    this.f13844A = null;
                    this.f13851f = jElapsedRealtime;
                    if (uriBuild.equals(cVar.f13857B)) {
                        if (cVar.f13858C == null) {
                            cVar.f13859D = !z8;
                            cVar.f13860E = jVar3.f13897h;
                        }
                        cVar.f13858C = jVar3;
                        cVar.f13869z.r(jVar3);
                    }
                    it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        ((r) it2.next()).a();
                    }
                } else if (!z8) {
                    size = jVar.f13899k + ((long) jVar.f13906r.size());
                    jVar4 = this.f13849d;
                    if (size < jVar4.f13899k) {
                        bVar = new Z4.b();
                        z7 = true;
                    } else if (jElapsedRealtime - this.f13851f > t.N(jVar4.f13901m) * 3.5d) {
                        bVar = new Z4.b();
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        this.f13844A = bVar;
                        vVar = new v(bVar, 1, 11);
                        it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            ((r) it.next()).b(uriBuild, vVar, z7);
                        }
                    }
                }
                jVar5 = this.f13849d;
                if (jVar5.f13910v.f13892e) {
                    j8 = jVar5.f13901m;
                    if (jVar5 == jVar9) {
                        j8 /= 2;
                    }
                } else {
                    j8 = 0;
                }
                this.f13852x = t.N(j8) + jElapsedRealtime;
                if (this.f13849d.f13902n == -9223372036854775807L) {
                }
                jVar6 = this.f13849d;
                if (jVar6.f13903o) {
                    iVar = jVar6.f13910v;
                    if (iVar.f13888a == -9223372036854775807L) {
                        builderBuildUpon = uriBuild.buildUpon();
                        jVar7 = this.f13849d;
                        if (jVar7.f13910v.f13892e) {
                            builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar7.f13899k + ((long) jVar7.f13906r.size())));
                            jVar8 = this.f13849d;
                            if (jVar8.f13902n != -9223372036854775807L) {
                                abstractC0167z3 = jVar8.f13907s;
                                size2 = abstractC0167z3.size();
                                if (!abstractC0167z3.isEmpty()) {
                                    size2--;
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                            }
                        }
                        iVar2 = this.f13849d.f13910v;
                        if (iVar2.f13888a != -9223372036854775807L) {
                            if (iVar2.f13889b) {
                                str = "v2";
                            } else {
                                str = "YES";
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                        }
                        uriBuild = builderBuildUpon.build();
                    } else {
                        builderBuildUpon = uriBuild.buildUpon();
                        jVar7 = this.f13849d;
                        if (jVar7.f13910v.f13892e) {
                            builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar7.f13899k + ((long) jVar7.f13906r.size())));
                            jVar8 = this.f13849d;
                            if (jVar8.f13902n != -9223372036854775807L) {
                                abstractC0167z3 = jVar8.f13907s;
                                size2 = abstractC0167z3.size();
                                if (!abstractC0167z3.isEmpty()) {
                                    size2--;
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                            }
                        }
                        iVar2 = this.f13849d.f13910v;
                        if (iVar2.f13888a != -9223372036854775807L) {
                            if (iVar2.f13889b) {
                                str = "v2";
                            } else {
                                str = "YES";
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                        }
                        uriBuild = builderBuildUpon.build();
                    }
                    c(uriBuild);
                }
            }
            i7 = jVar.j;
            i9 = i7;
            z7 = false;
            jVar3 = new j(jVar.f13893d, jVar.f13930a, jVar.f13931b, jVar.f13894e, jVar.f13896g, j3, true, i9, jVar.f13899k, jVar.f13900l, jVar.f13901m, jVar.f13902n, jVar.f13932c, jVar.f13903o, jVar.f13904p, jVar.f13905q, abstractC0167z, jVar.f13907s, jVar.f13910v, jVar.f13908t);
            this.f13849d = jVar3;
            copyOnWriteArrayList = cVar.f13865e;
            uriBuild = this.f13846a;
            z8 = jVar3.f13903o;
            if (jVar3 != jVar9) {
                this.f13844A = null;
                this.f13851f = jElapsedRealtime;
                if (uriBuild.equals(cVar.f13857B)) {
                    if (cVar.f13858C == null) {
                        cVar.f13859D = !z8;
                        cVar.f13860E = jVar3.f13897h;
                    }
                    cVar.f13858C = jVar3;
                    cVar.f13869z.r(jVar3);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((r) it2.next()).a();
                }
            } else if (!z8) {
                size = jVar.f13899k + ((long) jVar.f13906r.size());
                jVar4 = this.f13849d;
                if (size < jVar4.f13899k) {
                    bVar = new Z4.b();
                    z7 = true;
                } else if (jElapsedRealtime - this.f13851f > t.N(jVar4.f13901m) * 3.5d) {
                    bVar = new Z4.b();
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    this.f13844A = bVar;
                    vVar = new v(bVar, 1, 11);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((r) it.next()).b(uriBuild, vVar, z7);
                    }
                }
            }
            jVar5 = this.f13849d;
            if (jVar5.f13910v.f13892e) {
                j8 = jVar5.f13901m;
                if (jVar5 == jVar9) {
                    j8 /= 2;
                }
            } else {
                j8 = 0;
            }
            this.f13852x = t.N(j8) + jElapsedRealtime;
            if (this.f13849d.f13902n == -9223372036854775807L) {
            }
            jVar6 = this.f13849d;
            if (jVar6.f13903o) {
                iVar = jVar6.f13910v;
                if (iVar.f13888a == -9223372036854775807L) {
                    builderBuildUpon = uriBuild.buildUpon();
                    jVar7 = this.f13849d;
                    if (jVar7.f13910v.f13892e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar7.f13899k + ((long) jVar7.f13906r.size())));
                        jVar8 = this.f13849d;
                        if (jVar8.f13902n != -9223372036854775807L) {
                            abstractC0167z3 = jVar8.f13907s;
                            size2 = abstractC0167z3.size();
                            if (!abstractC0167z3.isEmpty()) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    iVar2 = this.f13849d.f13910v;
                    if (iVar2.f13888a != -9223372036854775807L) {
                        if (iVar2.f13889b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                } else {
                    builderBuildUpon = uriBuild.buildUpon();
                    jVar7 = this.f13849d;
                    if (jVar7.f13910v.f13892e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar7.f13899k + ((long) jVar7.f13906r.size())));
                        jVar8 = this.f13849d;
                        if (jVar8.f13902n != -9223372036854775807L) {
                            abstractC0167z3 = jVar8.f13907s;
                            size2 = abstractC0167z3.size();
                            if (!abstractC0167z3.isEmpty()) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    iVar2 = this.f13849d.f13910v;
                    if (iVar2.f13888a != -9223372036854775807L) {
                        if (iVar2.f13889b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                }
                c(uriBuild);
            }
        }
        j = jVar.f13897h;
        j3 = j;
        z4 = jVar.f13898i;
        abstractC0167z = jVar.f13906r;
        if (z4) {
            jVar2 = cVar.f13858C;
            if (jVar2 != null) {
                i7 = jVar2.j;
            } else {
                i7 = 0;
            }
            if (jVar9 == null) {
                i8 = (int) (j11 - jVar9.f13899k);
                abstractC0167z2 = jVar9.f13906r;
                if (i8 < abstractC0167z2.size()) {
                    gVar = (g) abstractC0167z2.get(i8);
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    int i12 = jVar9.j + gVar.f13882d;
                    z7 = false;
                    i7 = i12 - ((g) abstractC0167z.get(0)).f13882d;
                } else {
                    z7 = false;
                }
                i9 = i7;
            }
            jVar3 = new j(jVar.f13893d, jVar.f13930a, jVar.f13931b, jVar.f13894e, jVar.f13896g, j3, true, i9, jVar.f13899k, jVar.f13900l, jVar.f13901m, jVar.f13902n, jVar.f13932c, jVar.f13903o, jVar.f13904p, jVar.f13905q, abstractC0167z, jVar.f13907s, jVar.f13910v, jVar.f13908t);
            this.f13849d = jVar3;
            copyOnWriteArrayList = cVar.f13865e;
            uriBuild = this.f13846a;
            z8 = jVar3.f13903o;
            if (jVar3 != jVar9) {
                this.f13844A = null;
                this.f13851f = jElapsedRealtime;
                if (uriBuild.equals(cVar.f13857B)) {
                    if (cVar.f13858C == null) {
                        cVar.f13859D = !z8;
                        cVar.f13860E = jVar3.f13897h;
                    }
                    cVar.f13858C = jVar3;
                    cVar.f13869z.r(jVar3);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((r) it2.next()).a();
                }
            } else if (!z8) {
                size = jVar.f13899k + ((long) jVar.f13906r.size());
                jVar4 = this.f13849d;
                if (size < jVar4.f13899k) {
                    bVar = new Z4.b();
                    z7 = true;
                } else if (jElapsedRealtime - this.f13851f > t.N(jVar4.f13901m) * 3.5d) {
                    bVar = new Z4.b();
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    this.f13844A = bVar;
                    vVar = new v(bVar, 1, 11);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((r) it.next()).b(uriBuild, vVar, z7);
                    }
                }
            }
            jVar5 = this.f13849d;
            if (jVar5.f13910v.f13892e) {
                j8 = jVar5.f13901m;
                if (jVar5 == jVar9) {
                    j8 /= 2;
                }
            } else {
                j8 = 0;
            }
            this.f13852x = t.N(j8) + jElapsedRealtime;
            if (this.f13849d.f13902n == -9223372036854775807L) {
            }
            jVar6 = this.f13849d;
            if (jVar6.f13903o) {
                iVar = jVar6.f13910v;
                if (iVar.f13888a == -9223372036854775807L) {
                    builderBuildUpon = uriBuild.buildUpon();
                    jVar7 = this.f13849d;
                    if (jVar7.f13910v.f13892e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar7.f13899k + ((long) jVar7.f13906r.size())));
                        jVar8 = this.f13849d;
                        if (jVar8.f13902n != -9223372036854775807L) {
                            abstractC0167z3 = jVar8.f13907s;
                            size2 = abstractC0167z3.size();
                            if (!abstractC0167z3.isEmpty()) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    iVar2 = this.f13849d.f13910v;
                    if (iVar2.f13888a != -9223372036854775807L) {
                        if (iVar2.f13889b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                } else {
                    builderBuildUpon = uriBuild.buildUpon();
                    jVar7 = this.f13849d;
                    if (jVar7.f13910v.f13892e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar7.f13899k + ((long) jVar7.f13906r.size())));
                        jVar8 = this.f13849d;
                        if (jVar8.f13902n != -9223372036854775807L) {
                            abstractC0167z3 = jVar8.f13907s;
                            size2 = abstractC0167z3.size();
                            if (!abstractC0167z3.isEmpty()) {
                                size2--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                        }
                    }
                    iVar2 = this.f13849d.f13910v;
                    if (iVar2.f13888a != -9223372036854775807L) {
                        if (iVar2.f13889b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                }
                c(uriBuild);
            }
        }
        i7 = jVar.j;
        i9 = i7;
        z7 = false;
        jVar3 = new j(jVar.f13893d, jVar.f13930a, jVar.f13931b, jVar.f13894e, jVar.f13896g, j3, true, i9, jVar.f13899k, jVar.f13900l, jVar.f13901m, jVar.f13902n, jVar.f13932c, jVar.f13903o, jVar.f13904p, jVar.f13905q, abstractC0167z, jVar.f13907s, jVar.f13910v, jVar.f13908t);
        this.f13849d = jVar3;
        copyOnWriteArrayList = cVar.f13865e;
        uriBuild = this.f13846a;
        z8 = jVar3.f13903o;
        if (jVar3 != jVar9) {
            this.f13844A = null;
            this.f13851f = jElapsedRealtime;
            if (uriBuild.equals(cVar.f13857B)) {
                if (cVar.f13858C == null) {
                    cVar.f13859D = !z8;
                    cVar.f13860E = jVar3.f13897h;
                }
                cVar.f13858C = jVar3;
                cVar.f13869z.r(jVar3);
            }
            it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((r) it2.next()).a();
            }
        } else if (!z8) {
            size = jVar.f13899k + ((long) jVar.f13906r.size());
            jVar4 = this.f13849d;
            if (size < jVar4.f13899k) {
                bVar = new Z4.b();
                z7 = true;
            } else if (jElapsedRealtime - this.f13851f > t.N(jVar4.f13901m) * 3.5d) {
                bVar = new Z4.b();
            } else {
                bVar = null;
            }
            if (bVar != null) {
                this.f13844A = bVar;
                vVar = new v(bVar, 1, 11);
                it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).b(uriBuild, vVar, z7);
                }
            }
        }
        jVar5 = this.f13849d;
        if (jVar5.f13910v.f13892e) {
            j8 = jVar5.f13901m;
            if (jVar5 == jVar9) {
                j8 /= 2;
            }
        } else {
            j8 = 0;
        }
        this.f13852x = t.N(j8) + jElapsedRealtime;
        if (this.f13849d.f13902n == -9223372036854775807L) {
        }
        jVar6 = this.f13849d;
        if (jVar6.f13903o) {
            iVar = jVar6.f13910v;
            if (iVar.f13888a == -9223372036854775807L) {
                builderBuildUpon = uriBuild.buildUpon();
                jVar7 = this.f13849d;
                if (jVar7.f13910v.f13892e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar7.f13899k + ((long) jVar7.f13906r.size())));
                    jVar8 = this.f13849d;
                    if (jVar8.f13902n != -9223372036854775807L) {
                        abstractC0167z3 = jVar8.f13907s;
                        size2 = abstractC0167z3.size();
                        if (!abstractC0167z3.isEmpty()) {
                            size2--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                    }
                }
                iVar2 = this.f13849d.f13910v;
                if (iVar2.f13888a != -9223372036854775807L) {
                    if (iVar2.f13889b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                }
                uriBuild = builderBuildUpon.build();
            } else {
                builderBuildUpon = uriBuild.buildUpon();
                jVar7 = this.f13849d;
                if (jVar7.f13910v.f13892e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar7.f13899k + ((long) jVar7.f13906r.size())));
                    jVar8 = this.f13849d;
                    if (jVar8.f13902n != -9223372036854775807L) {
                        abstractC0167z3 = jVar8.f13907s;
                        size2 = abstractC0167z3.size();
                        if (!abstractC0167z3.isEmpty()) {
                            size2--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                    }
                }
                iVar2 = this.f13849d.f13910v;
                if (iVar2.f13888a != -9223372036854775807L) {
                    if (iVar2.f13889b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                }
                uriBuild = builderBuildUpon.build();
            }
            c(uriBuild);
        }
    }

    @Override // p146u2.F
    public final void g(H h6, long j, long j3) {
        N n2 = (N) h6;
        n nVar = (n) n2.f16739f;
        Uri uri = n2.f16737d.f16761c;
        C0774u c0774u = new C0774u();
        if (nVar instanceof j) {
            d((j) nVar);
            this.f13845B.f13866f.f(c0774u, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            C0045t0 c0045t0B = C0045t0.b("Loaded playlist has unexpected type.", null);
            this.f13844A = c0045t0B;
            this.f13845B.f13866f.i(c0774u, 4, c0045t0B, true);
        }
        this.f13845B.f13863c.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054 A[LOOP:0: B:20:0x004e->B:22:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    @Override // p146u2.F
    public final Q1.e i(H h6, IOException iOException, int i7) {
        v vVar;
        Iterator it;
        boolean z4;
        e eVar;
        boolean zA;
        long jV;
        N n2 = (N) h6;
        long j = n2.f16734a;
        Uri uri = n2.f16737d.f16761c;
        C0774u c0774u = new C0774u();
        boolean z7 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z8 = iOException instanceof o;
        Q1.e eVar2 = K.f16729e;
        Uri uri2 = this.f13846a;
        c cVar = this.f13845B;
        int i8 = n2.f16736c;
        if (z7 || z8) {
            int i9 = iOException instanceof D ? ((D) iOException).f16715d : f.API_PRIORITY_OTHER;
            if (z8 || i9 == 400 || i9 == 503) {
                this.f13852x = SystemClock.elapsedRealtime();
                c(uri2);
                I i10 = cVar.f13866f;
                int i11 = t.f17159a;
                i10.i(c0774u, i8, iOException, true);
            } else {
                vVar = new v(iOException, i7, 11);
                it = cVar.f13865e.iterator();
                z4 = false;
                while (it.hasNext()) {
                    z4 |= !((r) it.next()).b(uri2, vVar, false);
                }
                eVar = cVar.f13863c;
                if (z4) {
                    eVar.getClass();
                    jV = e.v(vVar);
                    if (jV != -9223372036854775807L) {
                        eVar2 = new Q1.e(jV, 0, false);
                    } else {
                        eVar2 = K.f16730f;
                    }
                }
                zA = eVar2.a();
                cVar.f13866f.i(c0774u, i8, iOException, true ^ zA);
                if (!zA) {
                    eVar.getClass();
                }
            }
        } else {
            vVar = new v(iOException, i7, 11);
            it = cVar.f13865e.iterator();
            z4 = false;
            while (it.hasNext()) {
                z4 |= !((r) it.next()).b(uri2, vVar, false);
            }
            eVar = cVar.f13863c;
            if (z4) {
                eVar.getClass();
                jV = e.v(vVar);
                if (jV != -9223372036854775807L) {
                    eVar2 = new Q1.e(jV, 0, false);
                } else {
                    eVar2 = K.f16730f;
                }
            }
            zA = eVar2.a();
            cVar.f13866f.i(c0774u, i8, iOException, true ^ zA);
            if (!zA) {
                eVar.getClass();
            }
        }
        return eVar2;
    }

    @Override // p146u2.F
    public final void l(H h6, long j, long j3, boolean z4) {
        N n2 = (N) h6;
        long j7 = n2.f16734a;
        Uri uri = n2.f16737d.f16761c;
        C0774u c0774u = new C0774u();
        c cVar = this.f13845B;
        cVar.f13863c.getClass();
        cVar.f13866f.d(c0774u, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
