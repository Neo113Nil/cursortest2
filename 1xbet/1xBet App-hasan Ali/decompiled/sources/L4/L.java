package L4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class L extends o {

    /* renamed from: e, reason: collision with root package name */
    public static final z f3069e;

    /* renamed from: b, reason: collision with root package name */
    public final z f3070b;

    /* renamed from: c, reason: collision with root package name */
    public final o f3071c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f3072d;

    static {
        String str = z.f3126l;
        f3069e = j3.i.s("/");
    }

    public L(z zVar, o oVar, LinkedHashMap linkedHashMap) {
        this.f3070b = zVar;
        this.f3071c = oVar;
        this.f3072d = linkedHashMap;
    }

    @Override // L4.o
    public final void a(z zVar) {
        kotlin.jvm.internal.l.f("path", zVar);
        throw new IOException("zip file systems are read-only");
    }

    @Override // L4.o
    public final List d(z zVar) {
        kotlin.jvm.internal.l.f("dir", zVar);
        z zVar2 = f3069e;
        zVar2.getClass();
        M4.g gVar = (M4.g) this.f3072d.get(M4.c.b(zVar2, zVar, true));
        if (gVar != null) {
            return X3.m.m0(gVar.f3649q);
        }
        throw new IOException("not a directory: " + zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    @Override // L4.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n f(z zVar) {
        Long valueOf;
        long j5;
        Long l5;
        Long valueOf2;
        Long l6;
        Long l7;
        Long valueOf3;
        Throwable th;
        Throwable th2;
        M4.g gVar;
        kotlin.jvm.internal.l.f("path", zVar);
        z zVar2 = f3069e;
        zVar2.getClass();
        M4.g gVar2 = (M4.g) this.f3072d.get(M4.c.b(zVar2, zVar, true));
        if (gVar2 == null) {
            return null;
        }
        long j6 = gVar2.f3641h;
        if (j6 != -1) {
            u g5 = this.f3071c.g(this.f3070b);
            try {
                C k5 = N4.b.k(g5.d(j6));
                try {
                    gVar = M4.b.f(k5, gVar2);
                    kotlin.jvm.internal.l.c(gVar);
                    try {
                        k5.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        k5.close();
                    } catch (Throwable th5) {
                        AbstractC2425d.j(th4, th5);
                    }
                    th2 = th4;
                    gVar = null;
                }
            } catch (Throwable th6) {
                th = th6;
                if (g5 != null) {
                    try {
                        g5.close();
                    } catch (Throwable th7) {
                        AbstractC2425d.j(th, th7);
                    }
                }
                gVar2 = null;
            }
            if (th2 != null) {
                throw th2;
            }
            try {
                g5.close();
                th = null;
            } catch (Throwable th8) {
                th = th8;
            }
            th = th;
            gVar2 = gVar;
            if (th != null) {
                throw th;
            }
        }
        boolean z3 = gVar2.f3636b;
        boolean z5 = !z3;
        Long valueOf4 = z3 ? null : Long.valueOf(gVar2.f);
        Long l8 = gVar2.f3645m;
        if (l8 != null) {
            valueOf = Long.valueOf((l8.longValue() / 10000) - 11644473600000L);
        } else {
            valueOf = gVar2.f3648p != null ? Long.valueOf(r2.intValue() * 1000) : null;
        }
        Long l9 = gVar2.f3643k;
        if (l9 != null) {
            j5 = 11644473600000L;
            valueOf2 = Long.valueOf((l9.longValue() / 10000) - 11644473600000L);
        } else {
            j5 = 11644473600000L;
            if (gVar2.f3646n != null) {
                valueOf2 = Long.valueOf(r3.intValue() * 1000);
            } else {
                int i = gVar2.f3642j;
                if (i == -1 || i == -1) {
                    l5 = null;
                    l6 = gVar2.f3644l;
                    if (l6 == null) {
                        valueOf3 = Long.valueOf((l6.longValue() / 10000) - j5);
                    } else {
                        if (gVar2.f3647o == null) {
                            l7 = null;
                            return new n(z5, z3, null, valueOf4, valueOf, l5, l7);
                        }
                        valueOf3 = Long.valueOf(r0.intValue() * 1000);
                    }
                    l7 = valueOf3;
                    return new n(z5, z3, null, valueOf4, valueOf, l5, l7);
                }
                int i5 = gVar2.i;
                int i6 = (i5 >> 5) & 15;
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.set(14, 0);
                gregorianCalendar.set(((i5 >> 9) & 127) + 1980, i6 - 1, i5 & 31, (i >> 11) & 31, (i >> 5) & 63, (i & 31) << 1);
                valueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
            }
        }
        l5 = valueOf2;
        l6 = gVar2.f3644l;
        if (l6 == null) {
        }
        l7 = valueOf3;
        return new n(z5, z3, null, valueOf4, valueOf, l5, l7);
    }

    @Override // L4.o
    public final u g(z zVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // L4.o
    public final G h(z zVar) {
        kotlin.jvm.internal.l.f("file", zVar);
        throw new IOException("zip file systems are read-only");
    }

    @Override // L4.o
    public final I i(z zVar) {
        Throwable th;
        C c5;
        kotlin.jvm.internal.l.f("file", zVar);
        z zVar2 = f3069e;
        zVar2.getClass();
        M4.g gVar = (M4.g) this.f3072d.get(M4.c.b(zVar2, zVar, true));
        if (gVar == null) {
            throw new FileNotFoundException("no such file: " + zVar);
        }
        u g5 = this.f3071c.g(this.f3070b);
        try {
            c5 = N4.b.k(g5.d(gVar.f3641h));
            try {
                g5.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (g5 != null) {
                try {
                    g5.close();
                } catch (Throwable th4) {
                    AbstractC2425d.j(th3, th4);
                }
            }
            th = th3;
            c5 = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.l.f("<this>", c5);
        M4.b.f(c5, null);
        int i = gVar.f3640g;
        long j5 = gVar.f;
        if (i == 0) {
            return new M4.e(c5, j5, true);
        }
        return new M4.e(new t(N4.b.k(new M4.e(c5, gVar.f3639e, true)), new Inflater(true)), j5, false);
    }
}
