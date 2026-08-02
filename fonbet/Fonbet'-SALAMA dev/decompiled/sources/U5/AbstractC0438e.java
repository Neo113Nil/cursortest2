package U5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ScheduledExecutorService;
import w1.C1726n0;

/* renamed from: U5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0438e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0434a f6489a = new C0434a("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");

    /* renamed from: b, reason: collision with root package name */
    public static final C0434a f6490b = new C0434a("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");

    /* renamed from: c, reason: collision with root package name */
    public static final C0434a f6491c = new C0434a("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    public static List k(Class cls, List list, ClassLoader classLoader, j0 j0Var) {
        ?? load;
        try {
            Class.forName("android.app.Application", false, classLoader);
            load = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                Object obj = null;
                try {
                    obj = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (obj != null) {
                    load.add(obj);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader load2 = ServiceLoader.load(cls, classLoader);
            load = !load2.iterator().hasNext() ? ServiceLoader.load(cls) : load2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : load) {
            if (j0Var.b(obj2)) {
                arrayList.add(obj2);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new E4.B(j0Var)));
        return Collections.unmodifiableList(arrayList);
    }

    public abstract AbstractC0457y g(C1726n0 c1726n0);

    public abstract AbstractC0438e h();

    public abstract ScheduledExecutorService i();

    public abstract p0 j();

    public abstract void l(int i7, String str);

    public abstract void m(int i7, String str, Object... objArr);

    public abstract AbstractC0439f n(H2.r rVar, C0437d c0437d);

    public abstract void o(l0 l0Var);

    public abstract void p(f0 f0Var);

    public abstract void q();

    public abstract void r(EnumC0446m enumC0446m, L l7);
}
