package O4;

import L4.C0226i;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: O4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0256b implements InterfaceC0267m {

    /* renamed from: l, reason: collision with root package name */
    public static final C0256b f4204l = new C0256b(0);

    /* renamed from: m, reason: collision with root package name */
    public static final C0256b f4205m = new C0256b(1);

    /* renamed from: n, reason: collision with root package name */
    public static final C0256b f4206n = new C0256b(2);

    /* renamed from: o, reason: collision with root package name */
    public static final C0256b f4207o = new C0256b(3);

    /* renamed from: p, reason: collision with root package name */
    public static final C0256b f4208p = new C0256b(4);

    /* renamed from: q, reason: collision with root package name */
    public static final C0256b f4209q = new C0256b(5);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4210k;

    public /* synthetic */ C0256b(int i) {
        this.f4210k = i;
    }

    public List a(ExecutorC0255a executorC0255a) {
        return Collections.singletonList(new C0270p(executorC0255a));
    }

    public List b() {
        return Collections.EMPTY_LIST;
    }

    public String c(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    public Object d(Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean e(Method method) {
        return false;
    }

    /* JADX WARN: Finally extract failed */
    @Override // O4.InterfaceC0267m
    public Object g(Object obj) {
        switch (this.f4210k) {
            case 0:
                return obj.toString();
            case 1:
                y4.B b3 = (y4.B) obj;
                try {
                    C0226i c0226i = new C0226i();
                    b3.f().u(c0226i);
                    D4.g gVar = new D4.g(b3.d(), b3.b(), c0226i, 1);
                    b3.close();
                    return gVar;
                } catch (Throwable th) {
                    b3.close();
                    throw th;
                }
            case 2:
                return (y4.x) obj;
            case 3:
                return (y4.B) obj;
            case 4:
                ((y4.B) obj).close();
                return W3.o.f6046a;
            default:
                ((y4.B) obj).close();
                return null;
        }
    }
}
