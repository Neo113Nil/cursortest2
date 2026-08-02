package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class mb0 implements Closeable {

    /* JADX INFO: renamed from: j */
    public final g01 f5018j;

    /* JADX INFO: renamed from: k */
    public final kb0 f5019k;

    /* JADX INFO: renamed from: l */
    public final hb0 f5020l;

    public mb0(g01 g01Var) {
        this.f5018j = g01Var;
        kb0 kb0Var = new kb0(g01Var);
        this.f5019k = kb0Var;
        this.f5020l = new hb0(kb0Var);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3367a(nt0 nt0Var) throws IOException {
        boolean z;
        qb0 qb0Var;
        EnumC0227fx enumC0227fx;
        wu0 wu0Var;
        int i = 0;
        try {
            this.f5018j.m1920j(9L);
            int iM3664a = ob0.m3664a(this.f5018j);
            if (iM3664a < 0 || iM3664a > 16384) {
                ob0.m3666c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM3664a));
                throw null;
            }
            byte bM1917a = (byte) (this.f5018j.m1917a() & 255);
            byte bM1917a2 = (byte) (this.f5018j.m1917a() & 255);
            int iM1919i = this.f5018j.m1919i() & Integer.MAX_VALUE;
            Logger logger = ob0.f5688a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(lb0.m3201a(true, iM1919i, iM3664a, bM1917a, bM1917a2));
            }
            switch (bM1917a) {
                case 0:
                    m3368e(nt0Var, iM3664a, bM1917a2, iM1919i);
                    return true;
                case 1:
                    m3370j(nt0Var, iM3664a, bM1917a2, iM1919i);
                    return true;
                case 2:
                    if (iM3664a != 5) {
                        ob0.m3666c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iM3664a));
                        throw null;
                    }
                    if (iM1919i == 0) {
                        ob0.m3666c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    g01 g01Var = this.f5018j;
                    g01Var.m1919i();
                    g01Var.m1917a();
                    return true;
                case 3:
                    m3372m(nt0Var, iM3664a, iM1919i);
                    return true;
                case 4:
                    m3373o(nt0Var, iM3664a, bM1917a2, iM1919i);
                    return true;
                case 5:
                    m3371l(nt0Var, iM3664a, bM1917a2, iM1919i);
                    return true;
                case 6:
                    z = true;
                    if (iM3664a != 8) {
                        ob0.m3666c("TYPE_PING length != 8: %s", Integer.valueOf(iM3664a));
                        throw null;
                    }
                    if (iM1919i != 0) {
                        ob0.m3666c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int iM1919i2 = this.f5018j.m1919i();
                    int iM1919i3 = this.f5018j.m1919i();
                    i = (bM1917a2 & 1) != 0 ? 1 : 0;
                    long j = (((long) iM1919i2) << 32) | (((long) iM1919i3) & 4294967295L);
                    ((f50) nt0Var.f5541l).m1617T(1, j);
                    Object obj = ((ot0) nt0Var.f5543n).f5895k;
                    if (i != 0) {
                        synchronized (obj) {
                            try {
                                ot0 ot0Var = (ot0) nt0Var.f5543n;
                                qb0Var = ot0Var.f5908x;
                                if (qb0Var != null) {
                                    long j2 = qb0Var.f6451a;
                                    if (j2 == j) {
                                        ot0Var.f5908x = null;
                                    } else {
                                        Logger logger2 = ot0.f5869Q;
                                        Level level = Level.WARNING;
                                        Locale locale = Locale.US;
                                        logger2.log(level, "Received unexpected ping ack. Expecting " + j2 + ", got " + j);
                                    }
                                } else {
                                    ot0.f5869Q.warning("Received unexpected ping ack. No ping outstanding");
                                }
                                qb0Var = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        if (qb0Var != null) {
                            synchronized (qb0Var) {
                                try {
                                    if (!qb0Var.f6454d) {
                                        qb0Var.f6454d = true;
                                        long jM3509a = qb0Var.f6452b.m3509a();
                                        qb0Var.f6456f = jM3509a;
                                        LinkedHashMap linkedHashMap = qb0Var.f6453c;
                                        qb0Var.f6453c = null;
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            try {
                                                ((Executor) entry.getValue()).execute(new pb0((vg0) entry.getKey(), jM3509a));
                                            } catch (Throwable th2) {
                                                qb0.f6450g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                                            }
                                        }
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        break;
                    } else {
                        synchronized (obj) {
                            ((ot0) nt0Var.f5543n).f5893i.m4002i(iM1919i2, iM1919i3, true);
                            break;
                        }
                    }
                    return z;
                case 7:
                    g01 g01Var2 = this.f5018j;
                    if (iM3664a < 8) {
                        ob0.m3666c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iM3664a));
                        throw null;
                    }
                    if (iM1919i != 0) {
                        ob0.m3666c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int iM1919i4 = g01Var2.m1919i();
                    int iM1919i5 = g01Var2.m1919i();
                    int i2 = iM3664a - 8;
                    EnumC0227fx[] enumC0227fxArrValues = EnumC0227fx.values();
                    int length = enumC0227fxArrValues.length;
                    while (true) {
                        if (i < length) {
                            enumC0227fx = enumC0227fxArrValues[i];
                            if (enumC0227fx.f2527j != iM1919i5) {
                                i++;
                            }
                        } else {
                            enumC0227fx = null;
                        }
                    }
                    if (enumC0227fx == null) {
                        ob0.m3666c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iM1919i5));
                        throw null;
                    }
                    C0836wd c0836wdM1918e = C0836wd.f8510m;
                    if (i2 > 0) {
                        c0836wdM1918e = g01Var2.m1918e(i2);
                    }
                    ot0 ot0Var2 = (ot0) nt0Var.f5543n;
                    ((f50) nt0Var.f5541l).m1616S(1, iM1919i4, enumC0227fx, c0836wdM1918e);
                    if (enumC0227fx == EnumC0227fx.f2524u) {
                        String strM5317k = c0836wdM1918e.m5317k();
                        ot0.f5869Q.log(Level.WARNING, nt0Var + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + strM5317k);
                        if ("too_many_pings".equals(strM5317k)) {
                            ot0Var2.f5879J.run();
                        }
                    }
                    long j3 = enumC0227fx.f2527j;
                    ba0[] ba0VarArr = ba0.f801m;
                    ba0 ba0Var = (j3 >= ((long) ba0VarArr.length) || j3 < 0) ? null : ba0VarArr[(int) j3];
                    ja1 ja1VarM2837b = (ba0Var == null ? ja1.m2834d(ba0.f800l.f804k.f3886a.f3521j).m2840h("Unrecognized HTTP/2 error code: " + j3) : ba0Var.f804k).m2837b("Received Goaway");
                    if (c0836wdM1918e.mo2556b() > 0) {
                        ja1VarM2837b = ja1VarM2837b.m2837b(c0836wdM1918e.m5317k());
                    }
                    Map map = ot0.f5868P;
                    ot0Var2.m3783r(iM1919i4, null, ja1VarM2837b);
                    return true;
                case 8:
                    if (iM3664a != 4) {
                        ob0.m3666c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iM3664a));
                        throw null;
                    }
                    long jM1919i = ((long) this.f5018j.m1919i()) & 2147483647L;
                    if (jM1919i == 0) {
                        ob0.m3666c("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    }
                    ((f50) nt0Var.f5541l).m1620W(1, iM1919i, jM1919i);
                    ot0 ot0Var3 = (ot0) nt0Var.f5543n;
                    if (jM1919i == 0) {
                        if (iM1919i == 0) {
                            ot0.m3767e(ot0Var3, "Received 0 flow control window increment.");
                            return true;
                        }
                        ot0Var3.m3774h(iM1919i, ja1.f3882l.m2840h("Received 0 flow control window increment."), EnumC0544oh.f5731j, false, EnumC0227fx.f2515l, null);
                        return true;
                    }
                    z = true;
                    synchronized (ot0Var3.f5895k) {
                        ot0 ot0Var4 = (ot0) nt0Var.f5543n;
                        try {
                            if (iM1919i == 0) {
                                ot0Var4.f5894j.m2006b(null, (int) jM1919i);
                                return true;
                            }
                            lt0 lt0Var = (lt0) ot0Var4.f5898n.get(Integer.valueOf(iM1919i));
                            ot0 ot0Var5 = (ot0) nt0Var.f5543n;
                            if (lt0Var != null) {
                                g92 g92Var = ot0Var5.f5894j;
                                kt0 kt0Var = lt0Var.f4904u;
                                synchronized (kt0Var.f4545v) {
                                    wu0Var = kt0Var.f4521I;
                                    break;
                                }
                                g92Var.m2006b(wu0Var, (int) jM1919i);
                            } else if (!ot0Var5.m3778l(iM1919i)) {
                                i = 1;
                            }
                            if (i != 0) {
                                ot0.m3767e((ot0) nt0Var.f5543n, "Received window_update for unknown stream: " + iM1919i);
                                return true;
                            }
                            return z;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                default:
                    this.f5018j.m1921l(iM3664a);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5018j.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m3368e(nt0 nt0Var, int i, byte b, int i2) throws IOException {
        lt0 lt0Var;
        boolean z = (b & 1) != 0;
        if ((b & 32) != 0) {
            ob0.m3666c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short sM1917a = (b & 8) != 0 ? (short) (this.f5018j.m1917a() & 255) : (short) 0;
        int iM3665b = ob0.m3665b(i, b, sM1917a);
        g01 g01Var = this.f5018j;
        ((f50) nt0Var.f5541l).m1615R(1, i2, g01Var.f2570k, iM3665b, z);
        ot0 ot0Var = (ot0) nt0Var.f5543n;
        synchronized (ot0Var.f5895k) {
            lt0Var = (lt0) ot0Var.f5898n.get(Integer.valueOf(i2));
        }
        if (lt0Var == null) {
            boolean zM3778l = ((ot0) nt0Var.f5543n).m3778l(i2);
            ot0 ot0Var2 = (ot0) nt0Var.f5543n;
            if (zM3778l) {
                synchronized (ot0Var2.f5895k) {
                    ((ot0) nt0Var.f5543n).f5893i.m4003j(i2, EnumC0227fx.f2518o);
                }
                g01Var.m1921l(iM3665b);
            } else {
                ot0.m3767e(ot0Var2, "Received data for unknown stream: " + i2);
            }
            this.f5018j.m1921l(sM1917a);
        }
        long j = iM3665b;
        g01Var.m1920j(j);
        C0539oc c0539oc = new C0539oc();
        c0539oc.mo1553f(g01Var.f2570k, j);
        nc1 nc1Var = lt0Var.f4904u.f4520H;
        nv0.f5555a.getClass();
        synchronized (((ot0) nt0Var.f5543n).f5895k) {
            lt0Var.f4904u.m3084j(i - iM3665b, c0539oc, z);
        }
        ot0 ot0Var3 = (ot0) nt0Var.f5543n;
        int i3 = ot0Var3.f5903s + i;
        ot0Var3.f5903s = i3;
        if (i3 >= ot0Var3.f5890f * 0.5f) {
            synchronized (ot0Var3.f5895k) {
                ot0 ot0Var4 = (ot0) nt0Var.f5543n;
                ot0Var4.f5893i.m4004l(0, ot0Var4.f5903s);
            }
            ((ot0) nt0Var.f5543n).f5903s = 0;
        }
        this.f5018j.m1921l(sM1917a);
    }

    /* JADX INFO: renamed from: i */
    public final ArrayList m3369i(int i, short s, byte b, int i2) throws IOException {
        kb0 kb0Var = this.f5019k;
        kb0Var.f4338n = i;
        kb0Var.f4335k = i;
        kb0Var.f4339o = s;
        kb0Var.f4336l = b;
        kb0Var.f4337m = i2;
        hb0 hb0Var = this.f5020l;
        g01 g01Var = hb0Var.f3152b;
        ArrayList arrayList = hb0Var.f3151a;
        while (true) {
            C0539oc c0539oc = g01Var.f2570k;
            if (g01Var.f2571l) {
                C0270h1.m2191g("closed");
                return null;
            }
            if (c0539oc.f5698k == 0 && g01Var.f2569j.mo628k(c0539oc, 8192L) == -1) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                return arrayList2;
            }
            byte bM1917a = g01Var.m1917a();
            int i3 = bM1917a & 255;
            if (i3 == 128) {
                C0270h1.m2187c("index == 0");
                return null;
            }
            if ((bM1917a & 128) == 128) {
                int iM2253e = hb0Var.m2253e(i3, 127);
                int i4 = iM2253e - 1;
                if (i4 >= 0) {
                    qa0[] qa0VarArr = jb0.f3891b;
                    if (i4 <= qa0VarArr.length - 1) {
                        arrayList.add(qa0VarArr[i4]);
                    }
                }
                int length = hb0Var.f3156f + 1 + (i4 - jb0.f3891b.length);
                if (length >= 0) {
                    qa0[] qa0VarArr2 = hb0Var.f3155e;
                    if (length <= qa0VarArr2.length - 1) {
                        arrayList.add(qa0VarArr2[length]);
                    }
                }
                C0270h1.m2187c(j11.m2773h("Header index too large ", iM2253e));
                return null;
            }
            if (i3 == 64) {
                C0836wd c0836wdM2252d = hb0Var.m2252d();
                jb0.m2842a(c0836wdM2252d);
                hb0Var.m2251c(new qa0(c0836wdM2252d, hb0Var.m2252d()));
            } else if ((bM1917a & 64) == 64) {
                hb0Var.m2251c(new qa0(hb0Var.m2250b(hb0Var.m2253e(i3, 63) - 1), hb0Var.m2252d()));
            } else if ((bM1917a & 32) == 32) {
                int iM2253e2 = hb0Var.m2253e(i3, 31);
                hb0Var.f3154d = iM2253e2;
                if (iM2253e2 < 0 || iM2253e2 > hb0Var.f3153c) {
                    throw new IOException("Invalid dynamic table size update " + hb0Var.f3154d);
                }
                int i5 = hb0Var.f3158h;
                if (iM2253e2 < i5) {
                    if (iM2253e2 == 0) {
                        Arrays.fill(hb0Var.f3155e, (Object) null);
                        hb0Var.f3156f = hb0Var.f3155e.length - 1;
                        hb0Var.f3157g = 0;
                        hb0Var.f3158h = 0;
                    } else {
                        hb0Var.m2249a(i5 - iM2253e2);
                    }
                }
            } else if (i3 == 16 || i3 == 0) {
                C0836wd c0836wdM2252d2 = hb0Var.m2252d();
                jb0.m2842a(c0836wdM2252d2);
                arrayList.add(new qa0(c0836wdM2252d2, hb0Var.m2252d()));
            } else {
                arrayList.add(new qa0(hb0Var.m2250b(hb0Var.m2253e(i3, 15) - 1), hb0Var.m2252d()));
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3370j(nt0 nt0Var, int i, byte b, int i2) throws IOException {
        ja1 ja1VarM2840h = null;
        boolean z = false;
        if (i2 == 0) {
            ob0.m3666c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z2 = (b & 1) != 0;
        short sM1917a = (b & 8) != 0 ? (short) (this.f5018j.m1917a() & 255) : (short) 0;
        if ((b & 32) != 0) {
            g01 g01Var = this.f5018j;
            g01Var.m1919i();
            g01Var.m1917a();
            i -= 5;
        }
        ArrayList arrayListM3369i = m3369i(ob0.m3665b(i, b, sM1917a), sM1917a, b, i2);
        f50 f50Var = (f50) nt0Var.f5541l;
        if (f50Var.m1614Q()) {
            ((Logger) f50Var.f2313k).log((Level) f50Var.f2314l, "INBOUND HEADERS: streamId=" + i2 + " headers=" + arrayListM3369i + " endStream=" + z2);
        }
        if (((ot0) nt0Var.f5543n).f5880K != Integer.MAX_VALUE) {
            long jMo2556b = 0;
            for (int i3 = 0; i3 < arrayListM3369i.size(); i3++) {
                qa0 qa0Var = (qa0) arrayListM3369i.get(i3);
                jMo2556b += (long) (qa0Var.f6441b.mo2556b() + qa0Var.f6440a.mo2556b() + 32);
            }
            int iMin = (int) Math.min(jMo2556b, 2147483647L);
            int i4 = ((ot0) nt0Var.f5543n).f5880K;
            if (iMin > i4) {
                ja1 ja1Var = ja1.f3880j;
                Locale locale = Locale.US;
                ja1VarM2840h = ja1Var.m2840h("Response " + (z2 ? "trailer" : "header") + " metadata larger than " + i4 + ": " + iMin);
            }
        }
        synchronized (((ot0) nt0Var.f5543n).f5895k) {
            try {
                lt0 lt0Var = (lt0) ((ot0) nt0Var.f5543n).f5898n.get(Integer.valueOf(i2));
                if (lt0Var == null) {
                    if (((ot0) nt0Var.f5543n).m3778l(i2)) {
                        ((ot0) nt0Var.f5543n).f5893i.m4003j(i2, EnumC0227fx.f2518o);
                    } else {
                        z = true;
                    }
                } else if (ja1VarM2840h == null) {
                    nc1 nc1Var = lt0Var.f4904u.f4520H;
                    nv0.f5555a.getClass();
                    lt0Var.f4904u.m3085k(arrayListM3369i, z2);
                } else {
                    if (!z2) {
                        ((ot0) nt0Var.f5543n).f5893i.m4003j(i2, EnumC0227fx.f2521r);
                    }
                    lt0Var.f4904u.m3086l(ja1VarM2840h, EnumC0544oh.f5731j, false, new np0());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            ot0.m3767e((ot0) nt0Var.f5543n, "Received header for unknown stream: " + i2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3371l(nt0 nt0Var, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            ob0.m3666c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short sM1917a = (b & 8) != 0 ? (short) (this.f5018j.m1917a() & 255) : (short) 0;
        int iM1919i = this.f5018j.m1919i() & Integer.MAX_VALUE;
        ArrayList arrayListM3369i = m3369i(ob0.m3665b(i - 4, b, sM1917a), sM1917a, b, i2);
        f50 f50Var = (f50) nt0Var.f5541l;
        if (f50Var.m1614Q()) {
            ((Logger) f50Var.f2313k).log((Level) f50Var.f2314l, "INBOUND PUSH_PROMISE: streamId=" + i2 + " promisedStreamId=" + iM1919i + " headers=" + arrayListM3369i);
        }
        synchronized (((ot0) nt0Var.f5543n).f5895k) {
            ((ot0) nt0Var.f5543n).f5893i.m4003j(i2, EnumC0227fx.f2515l);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3372m(nt0 nt0Var, int i, int i2) throws IOException {
        EnumC0227fx enumC0227fx;
        if (i != 4) {
            ob0.m3666c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        }
        if (i2 == 0) {
            ob0.m3666c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int iM1919i = this.f5018j.m1919i();
        EnumC0227fx[] enumC0227fxArrValues = EnumC0227fx.values();
        int length = enumC0227fxArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                enumC0227fx = null;
                break;
            }
            enumC0227fx = enumC0227fxArrValues[i3];
            if (enumC0227fx.f2527j == iM1919i) {
                break;
            } else {
                i3++;
            }
        }
        if (enumC0227fx == null) {
            ob0.m3666c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iM1919i));
            throw null;
        }
        ((f50) nt0Var.f5541l).m1618U(1, i2, enumC0227fx);
        ja1 ja1VarM2837b = ot0.m3770v(enumC0227fx).m2837b("Rst Stream");
        ia1 ia1Var = ja1VarM2837b.f3886a;
        boolean z = ia1Var == ia1.f3507m || ia1Var == ia1.f3510p;
        synchronized (((ot0) nt0Var.f5543n).f5895k) {
            try {
                lt0 lt0Var = (lt0) ((ot0) nt0Var.f5543n).f5898n.get(Integer.valueOf(i2));
                if (lt0Var != null) {
                    nc1 nc1Var = lt0Var.f4904u.f4520H;
                    nv0.f5555a.getClass();
                    ((ot0) nt0Var.f5543n).m3774h(i2, ja1VarM2837b, enumC0227fx == EnumC0227fx.f2520q ? EnumC0544oh.f5732k : EnumC0544oh.f5731j, z, null, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3373o(nt0 nt0Var, int i, byte b, int i2) throws IOException {
        boolean z;
        short sM3670i;
        short s;
        Object obj = null;
        int i3 = 0;
        if (i2 != 0) {
            ob0.m3666c("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b & 1) != 0) {
            if (i == 0) {
                return;
            }
            ob0.m3666c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            throw null;
        }
        if (i % 6 != 0) {
            ob0.m3666c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
        C0678s3 c0678s3 = new C0678s3(5);
        int i4 = 0;
        while (i4 < i) {
            g01 g01Var = this.f5018j;
            g01Var.m1920j(2L);
            C0539oc c0539oc = g01Var.f2570k;
            if (c0539oc.f5698k < 2) {
                throw new EOFException();
            }
            f61 f61Var = c0539oc.f5697j;
            f61Var.getClass();
            int i5 = f61Var.f2320b;
            int i6 = f61Var.f2321c;
            if (i6 - i5 < 2) {
                sM3670i = (short) (((c0539oc.m3670i() & 255) << 8) | (c0539oc.m3670i() & 255));
            } else {
                byte[] bArr = f61Var.f2319a;
                int i7 = i5 + 1;
                int i8 = (bArr[i5] & 255) << 8;
                int i9 = i5 + 2;
                int i10 = i8 | (bArr[i7] & 255);
                c0539oc.f5698k -= 2;
                if (i9 == i6) {
                    c0539oc.f5697j = f61Var.m1642a();
                    h61.m2219a(f61Var);
                } else {
                    f61Var.f2320b = i9;
                }
                sM3670i = (short) i10;
            }
            int iM1919i = this.f5018j.m1919i();
            switch (sM3670i) {
                case 1:
                case 6:
                    s = sM3670i;
                    break;
                case 2:
                    if (iM1919i != 0 && iM1919i != 1) {
                        ob0.m3666c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        throw obj;
                    }
                    s = sM3670i;
                    break;
                    break;
                case 3:
                    s = 4;
                    break;
                case 4:
                    if (iM1919i < 0) {
                        ob0.m3666c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw obj;
                    }
                    s = 7;
                    break;
                    break;
                case 5:
                    if (iM1919i < 16384 || iM1919i > 16777215) {
                        ob0.m3666c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iM1919i));
                        throw obj;
                    }
                    s = sM3670i;
                    break;
                    break;
                default:
                    continue;
                    i4 += 6;
                    obj = obj;
                    break;
            }
            c0678s3.m4474d(s, iM1919i);
            i4 += 6;
            obj = obj;
        }
        Object obj2 = obj;
        ((f50) nt0Var.f5541l).m1619V(1, c0678s3);
        synchronized (((ot0) nt0Var.f5543n).f5895k) {
            try {
                if (c0678s3.m4472b(4)) {
                    ((ot0) nt0Var.f5543n).f5872C = ((int[]) c0678s3.f7022k)[4];
                }
                if (c0678s3.m4472b(7)) {
                    int i11 = ((int[]) c0678s3.f7022k)[7];
                    g92 g92Var = ((ot0) nt0Var.f5543n).f5894j;
                    if (i11 >= 0) {
                        int i12 = i11 - g92Var.f2671j;
                        g92Var.f2671j = i11;
                        for (wu0 wu0Var : ((ot0) g92Var.f2672k).m3775i()) {
                            wu0Var.m5416a(i12);
                        }
                        boolean z2 = i12 > 0;
                        z = z2;
                    } else {
                        g92Var.getClass();
                        C0270h1.m2190f(j11.m2773h("Invalid initial window size: ", i11));
                    }
                    z = z2;
                } else {
                    z = false;
                }
                if (nt0Var.f5540k) {
                    ot0 ot0Var = (ot0) nt0Var.f5543n;
                    m81 m81Var = ot0Var.f5892h;
                    C0831w8 c0831w8 = ot0Var.f5905u;
                    Iterator it = ((xe0) m81Var.f5011m).f8920j.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    ot0Var.f5905u = c0831w8;
                    m81 m81Var2 = ((ot0) nt0Var.f5543n).f5892h;
                    xe0 xe0Var = (xe0) m81Var2.f5011m;
                    xe0Var.f8919i.mo5321i("READY", 2);
                    xe0Var.f8921k.execute(new ve0(i3, m81Var2));
                    nt0Var.f5540k = false;
                }
                C0597px c0597px = ((ot0) nt0Var.f5543n).f5893i;
                f50 f50Var = c0597px.f6282l;
                if (f50Var.m1614Q()) {
                    ((Logger) f50Var.f2313k).log((Level) f50Var.f2314l, "OUTBOUND".concat(" SETTINGS: ack=true"));
                }
                try {
                    c0597px.f6281k.m3332a(c0678s3);
                } catch (IOException e) {
                    c0597px.f6280j.m3780n(e);
                }
                if (z) {
                    ((ot0) nt0Var.f5543n).f5894j.m2007c();
                }
                ((ot0) nt0Var.f5543n).m3784s();
            } catch (Throwable th) {
                throw th;
            }
        }
        int i13 = c0678s3.f7021j;
        if (((i13 & 2) != 0 ? ((int[]) c0678s3.f7022k)[1] : -1) >= 0) {
            hb0 hb0Var = this.f5020l;
            int i14 = (i13 & 2) != 0 ? ((int[]) c0678s3.f7022k)[1] : -1;
            hb0Var.f3153c = i14;
            hb0Var.f3154d = i14;
            int i15 = hb0Var.f3158h;
            if (i14 < i15) {
                if (i14 != 0) {
                    hb0Var.m2249a(i15 - i14);
                    return;
                }
                Arrays.fill(hb0Var.f3155e, obj2);
                hb0Var.f3156f = hb0Var.f3155e.length - 1;
                hb0Var.f3157g = 0;
                hb0Var.f3158h = 0;
            }
        }
    }
}
