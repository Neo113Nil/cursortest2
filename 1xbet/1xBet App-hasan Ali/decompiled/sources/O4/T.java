package O4;

import Q2.C0375o;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class T implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f4190a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0375o f4191b;

    public T(C0375o c0375o) {
        this.f4191b = c0375o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        r0 = O4.AbstractC0272s.b(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        ((java.util.concurrent.ConcurrentHashMap) r9.f5042l).put(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0074, code lost:
    
        r0 = (O4.AbstractC0272s) r0;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AbstractC0272s abstractC0272s;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f4190a;
        }
        Object[] objArr2 = objArr;
        C0256b c0256b = L.f4139b;
        if (c0256b.e(method)) {
            return c0256b.d(obj, method, objArr2);
        }
        C0375o c0375o = this.f4191b;
        while (true) {
            Object obj2 = ((ConcurrentHashMap) c0375o.f5042l).get(method);
            if (!(obj2 instanceof AbstractC0272s)) {
                if (obj2 == null) {
                    Object obj3 = new Object();
                    synchronized (obj3) {
                        try {
                            obj2 = ((ConcurrentHashMap) c0375o.f5042l).putIfAbsent(method, obj3);
                            if (obj2 == null) {
                                try {
                                    break;
                                } catch (Throwable th) {
                                    ((ConcurrentHashMap) c0375o.f5042l).remove(method);
                                    throw th;
                                }
                            }
                        } finally {
                        }
                    }
                }
                synchronized (obj2) {
                    try {
                        Object obj4 = ((ConcurrentHashMap) c0375o.f5042l).get(method);
                        if (obj4 != null) {
                            break;
                        }
                    } finally {
                    }
                }
                break;
            }
            abstractC0272s = (AbstractC0272s) obj2;
            break;
        }
        AbstractC0272s abstractC0272s2 = abstractC0272s;
        return abstractC0272s2.a(new A(abstractC0272s2.f4226a, obj, objArr2, abstractC0272s2.f4227b, abstractC0272s2.f4228c), objArr2);
    }
}
