package J3;

import V3.Y;
import V3.a0;
import V3.b0;
import V3.r0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0821a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C0828h;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f3855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f3856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f3857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f3858d;

    static {
        Logger.getLogger(n.class.getName());
        f3855a = new AtomicReference(new e());
        f3856b = new ConcurrentHashMap();
        f3857c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        f3858d = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Map map, boolean z4) {
        if (z4) {
            try {
                ConcurrentHashMap concurrentHashMap = f3857c;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            if (((e) f3855a.get()).f3837a.containsKey(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!f3858d.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (f3858d.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    public static Object b(b bVar, Class cls) throws GeneralSecurityException {
        S3.a aVar;
        Q3.n nVar = (Q3.n) Q3.h.f5810b.f5811a.get();
        nVar.getClass();
        Q3.m mVar = new Q3.m(bVar.getClass(), cls);
        HashMap map = nVar.f5820a;
        if (!map.containsKey(mVar)) {
            throw new GeneralSecurityException("No PrimitiveConstructor for " + mVar + " available");
        }
        switch (((Q3.l) map.get(mVar)).f5817b.f3382a) {
            case 13:
                aVar = new S3.a();
                if (!p150v0.a.a(1)) {
                    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
                }
                return aVar;
            default:
                aVar = new S3.a();
                if (!p150v0.a.b(2)) {
                    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                }
                return aVar;
        }
    }

    public static Object c(String str, AbstractC0829i abstractC0829i, Class cls) throws GeneralSecurityException {
        e eVar = (e) f3855a.get();
        eVar.getClass();
        d dVarA = eVar.a(str);
        boolean zContains = ((Map) dVarA.f3835a.f5806c).keySet().contains(cls);
        Q3.d dVar = dVarA.f3835a;
        if (!zContains) {
            StringBuilder sb = new StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(dVar.getClass());
            sb.append(", supported primitives: ");
            Set<Class> setKeySet = ((Map) dVar.f5806c).keySet();
            StringBuilder sb2 = new StringBuilder();
            boolean z4 = true;
            for (Class cls2 : setKeySet) {
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
                AbstractC0821a abstractC0821aP = dVar.p(abstractC0829i);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                dVar.r(abstractC0821aP);
                return dVar.m(abstractC0821aP, cls);
            } catch (C e7) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) dVar.f5804a).getName()), e7);
            }
        } catch (IllegalArgumentException e8) {
            throw new GeneralSecurityException("Primitive type not supported", e8);
        }
    }

    public static Object d(String str, byte[] bArr) {
        C0828h c0828h = AbstractC0829i.f11779b;
        return c(str, AbstractC0829i.t(bArr, 0, bArr.length), a.class);
    }

    public static synchronized Y e(b0 b0Var) {
        f fVar;
        Q3.d dVar = ((e) f3855a.get()).a(b0Var.D()).f3835a;
        fVar = new f(dVar, (Class) dVar.f5805b);
        if (!((Boolean) f3857c.get(b0Var.D())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + b0Var.D());
        }
        return fVar.e(b0Var.E());
    }

    public static synchronized void f(Q3.d dVar, boolean z4) {
        try {
            AtomicReference atomicReference = f3855a;
            e eVar = new e((e) atomicReference.get());
            eVar.b(dVar);
            String strL = dVar.l();
            a(strL, z4 ? dVar.n().l() : Collections.emptyMap(), z4);
            if (!((e) atomicReference.get()).f3837a.containsKey(strL)) {
                f3856b.put(strL, new o());
                if (z4) {
                    g(strL, dVar.n().l());
                }
            }
            f3857c.put(strL, Boolean.valueOf(z4));
            atomicReference.set(eVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void g(String str, Map map) {
        r0 r0Var;
        for (Map.Entry entry : map.entrySet()) {
            ConcurrentHashMap concurrentHashMap = f3858d;
            String str2 = (String) entry.getKey();
            byte[] bArrE = ((Q3.c) entry.getValue()).f5802a.e();
            int i7 = ((Q3.c) entry.getValue()).f5803b;
            a0 a0VarF = b0.F();
            a0VarF.e();
            b0.y((b0) a0VarF.f11827b, str);
            C0828h c0828hT = AbstractC0829i.t(bArrE, 0, bArrE.length);
            a0VarF.e();
            b0.z((b0) a0VarF.f11827b, c0828hT);
            int iE = p136t.e.e(i7);
            if (iE == 0) {
                r0Var = r0.TINK;
            } else if (iE == 1) {
                r0Var = r0.LEGACY;
            } else if (iE == 2) {
                r0Var = r0.RAW;
            } else {
                if (iE != 3) {
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                r0Var = r0.CRUNCHY;
            }
            a0VarF.e();
            b0.A((b0) a0VarF.f11827b, r0Var);
            concurrentHashMap.put(str2, new g((b0) a0VarF.b()));
        }
    }

    public static synchronized void h(m mVar) {
        Q3.h hVar = Q3.h.f5810b;
        synchronized (hVar) {
            V0 v6 = new V0((Q3.n) hVar.f5811a.get());
            v6.V(mVar);
            hVar.f5811a.set(new Q3.n(v6));
        }
    }
}
