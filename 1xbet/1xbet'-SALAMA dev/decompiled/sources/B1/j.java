package B1;

import A1.P0;
import A1.Q0;
import A1.R0;
import java.util.HashMap;
import java.util.Random;
import p018c2.D;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f1002g = new f(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Random f1003h = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f1007d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f1009f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q0 f1004a = new Q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P0 f1005b = new P0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f1006c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public R0 f1008e = R0.f220a;

    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final i a(int i7, D d7) {
        long j;
        HashMap map = this.f1006c;
        i iVar = null;
        long j3 = Long.MAX_VALUE;
        for (i iVar2 : map.values()) {
            if (iVar2.f997c == -1 && i7 == iVar2.f996b && d7 != null) {
                iVar2.f997c = d7.f10164d;
            }
            D d8 = iVar2.f998d;
            if (d7 != null) {
                long j7 = d7.f10164d;
                if (d8 == null) {
                    if (!d7.a() && j7 == iVar2.f997c) {
                        j = iVar2.f997c;
                        if (j != -1) {
                        }
                        iVar = iVar2;
                        j3 = j;
                    }
                } else if (j7 == d8.f10164d && d7.f10162b == d8.f10162b && d7.f10163c == d8.f10163c) {
                    j = iVar2.f997c;
                    if (j != -1) {
                    }
                    iVar = iVar2;
                    j3 = j;
                }
            } else if (i7 == iVar2.f996b) {
                j = iVar2.f997c;
                if (j != -1 || j < j3) {
                    iVar = iVar2;
                    j3 = j;
                } else if (j == j3) {
                    int i8 = t.f17159a;
                    if (iVar.f998d != null && d8 != null) {
                        iVar = iVar2;
                    }
                }
            }
        }
        if (iVar != null) {
            return iVar;
        }
        String str = (String) f1002g.get();
        i iVar3 = new i(this, str, i7, d7);
        map.put(str, iVar3);
        return iVar3;
    }

    public final synchronized String b(R0 r7, D d7) {
        return a(r7.g(d7.f10161a, this.f1005b).f188c, d7).f995a;
    }

    public final void c(a aVar) {
        D d7;
        if (aVar.f969b.p()) {
            this.f1009f = null;
            return;
        }
        i iVar = (i) this.f1006c.get(this.f1009f);
        int i7 = aVar.f970c;
        D d8 = aVar.f971d;
        this.f1009f = a(i7, d8).f995a;
        d(aVar);
        if (d8 == null || !d8.a()) {
            return;
        }
        long j = d8.f10164d;
        if (iVar != null && iVar.f997c == j && (d7 = iVar.f998d) != null && d7.f10162b == d8.f10162b && d7.f10163c == d8.f10163c) {
            return;
        }
        a(i7, new D(d8.f10161a, j));
        this.f1007d.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r1.f10164d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void d(a aVar) {
        try {
            this.f1007d.getClass();
            if (aVar.f969b.p()) {
                return;
            }
            i iVar = (i) this.f1006c.get(this.f1009f);
            D d7 = aVar.f971d;
            if (d7 != null && iVar != null) {
                long j = iVar.f997c;
                if (j == -1) {
                    if (iVar.f996b != aVar.f970c) {
                        return;
                    }
                }
            }
            i iVarA = a(aVar.f970c, d7);
            if (this.f1009f == null) {
                this.f1009f = iVarA.f995a;
            }
            D d8 = aVar.f971d;
            if (d8 != null && d8.a()) {
                D d9 = aVar.f971d;
                i iVarA2 = a(aVar.f970c, new D(d9.f10161a, d9.f10164d, d9.f10162b));
                if (!iVarA2.f999e) {
                    iVarA2.f999e = true;
                    aVar.f969b.g(aVar.f971d.f10161a, this.f1005b);
                    Math.max(0L, t.N(this.f1005b.d(aVar.f971d.f10162b)) + t.N(this.f1005b.f190e));
                    this.f1007d.getClass();
                }
            }
            if (!iVarA.f999e) {
                iVarA.f999e = true;
                this.f1007d.getClass();
            }
            if (iVarA.f995a.equals(this.f1009f) && !iVarA.f1000f) {
                iVarA.f1000f = true;
                n nVar = this.f1007d;
                String str = iVarA.f995a;
                nVar.getClass();
                D d10 = aVar.f971d;
                if (d10 == null || !d10.a()) {
                    nVar.b();
                    nVar.f1026i = str;
                    nVar.j = k.h().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.0");
                    nVar.c(aVar.f969b, aVar.f971d);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
