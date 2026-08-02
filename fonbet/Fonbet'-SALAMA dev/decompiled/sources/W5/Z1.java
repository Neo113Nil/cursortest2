package W5;

import U5.C0434a;
import U5.InterfaceC0444k;
import b6.C0789a;
import e6.AbstractC1053b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import w1.C1761y0;

/* loaded from: classes2.dex */
public abstract class Z1 implements e2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0434a f7103a = new C0434a("io.grpc.internal.GrpcAttributes.securityLevel");

    /* renamed from: b, reason: collision with root package name */
    public static final C0434a f7104b = new C0434a("io.grpc.internal.GrpcAttributes.clientEagAttrs");

    public static A0 n() {
        return C0554x1.f7394e == null ? new C0554x1() : new C1761y0(10);
    }

    public static Set o(String str, Map map) {
        U5.k0 valueOf;
        List c3 = AbstractC0547v0.c(str, map);
        if (c3 == null) {
            return null;
        }
        EnumSet noneOf = EnumSet.noneOf(U5.k0.class);
        for (Object obj : c3) {
            if (obj instanceof Double) {
                Double d7 = (Double) obj;
                int intValue = d7.intValue();
                Q0.a.b0(((double) intValue) == d7.doubleValue(), "Status code %s is not integral", obj);
                valueOf = U5.l0.c(intValue).f6547a;
                Q0.a.b0(valueOf.f6531a == d7.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new A1.W("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    valueOf = U5.k0.valueOf((String) obj);
                } catch (IllegalArgumentException e7) {
                    throw new A1.W("Status code " + obj + " is not valid", e7);
                }
            }
            noneOf.add(valueOf);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    public static List p(Map map) {
        String h6;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List c3 = AbstractC0547v0.c("loadBalancingConfig", map);
            if (c3 == null) {
                c3 = null;
            } else {
                AbstractC0547v0.a(c3);
            }
            arrayList.addAll(c3);
        }
        if (arrayList.isEmpty() && (h6 = AbstractC0547v0.h("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(h6.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static U5.e0 t(List list, U5.P p5) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            X1 x1 = (X1) it.next();
            String str = x1.f7093a;
            U5.O b7 = p5.b(str);
            if (b7 != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(Z1.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                U5.e0 e7 = b7.e(x1.f7094b);
                return e7.f6492a != null ? e7 : new U5.e0(new Y1(b7, e7.f6493b));
            }
            arrayList.add(str);
        }
        return new U5.e0(U5.l0.f6538g.g("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List u(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            arrayList.add(new X1(str, AbstractC0547v0.g(str, map)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // W5.e2
    public void a(InterfaceC0444k interfaceC0444k) {
        ((AbstractC0487b) this).f7125d.a(interfaceC0444k);
    }

    @Override // W5.e2
    public void flush() {
        InterfaceC0485a0 interfaceC0485a0 = ((AbstractC0487b) this).f7125d;
        if (interfaceC0485a0.isClosed()) {
            return;
        }
        interfaceC0485a0.flush();
    }

    @Override // W5.e2
    public void g(C0789a c0789a) {
        try {
            if (!((AbstractC0487b) this).f7125d.isClosed()) {
                ((AbstractC0487b) this).f7125d.b(c0789a);
            }
        } finally {
            AbstractC0494d0.b(c0789a);
        }
    }

    @Override // W5.e2
    public void i(int i7) {
        X5.i iVar = ((X5.j) this).f7555n;
        iVar.getClass();
        AbstractC1053b.b();
        RunnableC0493d runnableC0493d = new RunnableC0493d(iVar, i7, 0);
        synchronized (iVar.f7547w) {
            runnableC0493d.run();
        }
    }

    @Override // W5.e2
    public void m() {
        X5.i iVar = ((X5.j) this).f7555n;
        C0489b1 c0489b1 = iVar.f7108d;
        c0489b1.f7139a = iVar;
        iVar.f7105a = c0489b1;
    }

    public abstract int q();

    public abstract boolean r(W1 w12);

    public abstract void s(W1 w12);
}
