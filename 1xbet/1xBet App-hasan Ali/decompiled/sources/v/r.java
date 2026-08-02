package v;

import b4.EnumC0510a;
import c4.AbstractC0540a;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public abstract class r {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:10:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(t0.E e3, AbstractC0540a abstractC0540a) {
        x.N n5;
        int i;
        int size;
        int i5;
        if (abstractC0540a instanceof x.N) {
            n5 = (x.N) abstractC0540a;
            int i6 = n5.f20675m;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                n5.f20675m = i6 - Integer.MIN_VALUE;
                Object obj = n5.f20674l;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = n5.f20675m;
                if (i != 0) {
                    G4.l.N(obj);
                    ?? r8 = e3.f19444p.f19452D.f19485a;
                    int size2 = r8.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        if (((t0.s) r8.get(i7)).f19503d) {
                            t0.k kVar = t0.k.f19491m;
                            n5.f20673k = e3;
                            n5.f20675m = 1;
                            obj = e3.b(kVar, n5);
                            if (obj == enumC0510a) {
                            }
                            ?? r82 = ((t0.j) obj).f19485a;
                            size = r82.size();
                            i5 = 0;
                            while (i5 < size) {
                            }
                            return W3.o.f6046a;
                        }
                    }
                    return W3.o.f6046a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e3 = n5.f20673k;
                G4.l.N(obj);
                ?? r822 = ((t0.j) obj).f19485a;
                size = r822.size();
                i5 = 0;
                while (i5 < size) {
                    if (((t0.s) r822.get(i5)).f19503d) {
                        t0.k kVar2 = t0.k.f19491m;
                        n5.f20673k = e3;
                        n5.f20675m = 1;
                        obj = e3.b(kVar2, n5);
                        if (obj == enumC0510a) {
                            return enumC0510a;
                        }
                        ?? r8222 = ((t0.j) obj).f19485a;
                        size = r8222.size();
                        i5 = 0;
                        while (i5 < size) {
                        }
                    } else {
                        i5++;
                    }
                }
                return W3.o.f6046a;
            }
        }
        n5 = new x.N(abstractC0540a);
        Object obj2 = n5.f20674l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = n5.f20675m;
        if (i != 0) {
        }
    }

    public static final Object b(t0.v vVar, i4.e eVar, a4.c cVar) {
        Object y02 = ((t0.H) vVar).y0(new x.O(cVar.getContext(), eVar, null), cVar);
        return y02 == EnumC0510a.f7289k ? y02 : W3.o.f6046a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y4.l c(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = X3.v.f6090k;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        y4.h c5 = y4.h.f21319b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        y4.D b3 = q0.b(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = z4.b.k(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = z4.b.k(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new y4.l(b3, c5, list2, new x0.J(3, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new y4.l(b3, c5, list2, new x0.J(3, list));
    }

    public static Set d() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final long e(float f, long j5) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j5 >> 32)) - f);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j5 & 4294967295L)) - f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }
}
