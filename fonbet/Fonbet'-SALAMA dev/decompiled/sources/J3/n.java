package J3;

import V3.Y;
import V3.a0;
import V3.b0;
import V3.r0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0865a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C0872h;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import v0.AbstractC1663a;
import w1.V0;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f3855a;

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f3856b;

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f3857c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f3858d;

    static {
        Logger.getLogger(n.class.getName());
        f3855a = new AtomicReference(new e());
        f3856b = new ConcurrentHashMap();
        f3857c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        f3858d = new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        r6 = (java.util.Map.Entry) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (J3.n.f3858d.containsKey(r6.getKey()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + ((java.lang.String) r6.getKey()) + " from an existing key manager of type " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        r4 = r5.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        if (r4.hasNext() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        r5 = (java.util.Map.Entry) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
    
        if (J3.n.f3858d.containsKey(r5.getKey()) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + ((java.lang.String) r5.getKey()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if (((J3.e) J3.n.f3855a.get()).f3837a.containsKey(r4) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        r5 = r5.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (r5.hasNext() == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void a(String str, Map map, boolean z4) {
        synchronized (n.class) {
            if (z4) {
                try {
                    ConcurrentHashMap concurrentHashMap = f3857c;
                    if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                    }
                } finally {
                }
            }
        }
    }

    public static Object b(b bVar, Class cls) {
        S3.a aVar;
        Q3.n nVar = (Q3.n) Q3.h.f5810b.f5811a.get();
        nVar.getClass();
        Q3.m mVar = new Q3.m(bVar.getClass(), cls);
        HashMap hashMap = nVar.f5820a;
        if (!hashMap.containsKey(mVar)) {
            throw new GeneralSecurityException("No PrimitiveConstructor for " + mVar + " available");
        }
        switch (((Q3.l) hashMap.get(mVar)).f5817b.f3382a) {
            case 13:
                aVar = new S3.a();
                if (!AbstractC1663a.a(1)) {
                    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                }
                return aVar;
            default:
                aVar = new S3.a();
                if (!AbstractC1663a.b(2)) {
                    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                }
                return aVar;
        }
    }

    public static Object c(String str, AbstractC0873i abstractC0873i, Class cls) {
        e eVar = (e) f3855a.get();
        eVar.getClass();
        d a2 = eVar.a(str);
        boolean contains = ((Map) a2.f3835a.f5806c).keySet().contains(cls);
        Q3.d dVar = a2.f3835a;
        if (!contains) {
            StringBuilder sb = new StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(dVar.getClass());
            sb.append(", supported primitives: ");
            Set<Class> keySet = ((Map) dVar.f5806c).keySet();
            StringBuilder sb2 = new StringBuilder();
            boolean z4 = true;
            for (Class cls2 : keySet) {
                if (!z4) {
                    sb2.append(", ");
                }
                sb2.append(cls2.getCanonicalName());
                z4 = false;
            }
            sb.append(sb2.toString());
            throw new GeneralSecurityException(sb.toString());
        }
        try {
            if (!((Map) dVar.f5806c).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + dVar.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                AbstractC0865a p5 = dVar.p(abstractC0873i);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                dVar.r(p5);
                return dVar.m(p5, cls);
            } catch (C e7) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) dVar.f5804a).getName()), e7);
            }
        } catch (IllegalArgumentException e8) {
            throw new GeneralSecurityException("Primitive type not supported", e8);
        }
    }

    public static Object d(String str, byte[] bArr) {
        C0872h c0872h = AbstractC0873i.f11779b;
        return c(str, AbstractC0873i.t(bArr, 0, bArr.length), a.class);
    }

    public static synchronized Y e(b0 b0Var) {
        Y e7;
        synchronized (n.class) {
            Q3.d dVar = ((e) f3855a.get()).a(b0Var.D()).f3835a;
            f fVar = new f(dVar, (Class) dVar.f5805b);
            if (!((Boolean) f3857c.get(b0Var.D())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + b0Var.D());
            }
            e7 = fVar.e(b0Var.E());
        }
        return e7;
    }

    public static synchronized void f(Q3.d dVar, boolean z4) {
        synchronized (n.class) {
            try {
                AtomicReference atomicReference = f3855a;
                e eVar = new e((e) atomicReference.get());
                eVar.b(dVar);
                String l7 = dVar.l();
                a(l7, z4 ? dVar.n().l() : Collections.emptyMap(), z4);
                if (!((e) atomicReference.get()).f3837a.containsKey(l7)) {
                    f3856b.put(l7, new o());
                    if (z4) {
                        g(l7, dVar.n().l());
                    }
                }
                f3857c.put(l7, Boolean.valueOf(z4));
                atomicReference.set(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void g(String str, Map map) {
        r0 r0Var;
        for (Map.Entry entry : map.entrySet()) {
            ConcurrentHashMap concurrentHashMap = f3858d;
            String str2 = (String) entry.getKey();
            byte[] e7 = ((Q3.c) entry.getValue()).f5802a.e();
            int i7 = ((Q3.c) entry.getValue()).f5803b;
            a0 F7 = b0.F();
            F7.e();
            b0.y((b0) F7.f11827b, str);
            C0872h t7 = AbstractC0873i.t(e7, 0, e7.length);
            F7.e();
            b0.z((b0) F7.f11827b, t7);
            int e8 = t.e.e(i7);
            if (e8 == 0) {
                r0Var = r0.TINK;
            } else if (e8 == 1) {
                r0Var = r0.LEGACY;
            } else if (e8 == 2) {
                r0Var = r0.RAW;
            } else {
                if (e8 != 3) {
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                r0Var = r0.CRUNCHY;
            }
            F7.e();
            b0.A((b0) F7.f11827b, r0Var);
            concurrentHashMap.put(str2, new g((b0) F7.b()));
        }
    }

    public static synchronized void h(m mVar) {
        synchronized (n.class) {
            Q3.h hVar = Q3.h.f5810b;
            synchronized (hVar) {
                V0 v02 = new V0((Q3.n) hVar.f5811a.get());
                v02.V(mVar);
                hVar.f5811a.set(new Q3.n(v02));
            }
        }
    }
}
