package G4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2001a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2002b;

    /* renamed from: c, reason: collision with root package name */
    public String f2003c;

    public i(ArrayList arrayList) {
        this.f2001a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        kotlin.jvm.internal.l.f("proxy", obj);
        kotlin.jvm.internal.l.f("method", method);
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (kotlin.jvm.internal.l.a(name, "supports") && kotlin.jvm.internal.l.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.l.a(name, "unsupported") && kotlin.jvm.internal.l.a(Void.TYPE, returnType)) {
            this.f2002b = true;
            return null;
        }
        boolean a5 = kotlin.jvm.internal.l.a(name, "protocols");
        ArrayList arrayList = this.f2001a;
        if (a5 && objArr.length == 0) {
            return arrayList;
        }
        if ((kotlin.jvm.internal.l.a(name, "selectProtocol") || kotlin.jvm.internal.l.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<*>", obj2);
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.String", obj3);
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f2003c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f2003c = str2;
                return str2;
            }
        }
        if ((!kotlin.jvm.internal.l.a(name, "protocolSelected") && !kotlin.jvm.internal.l.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.String", obj4);
        this.f2003c = (String) obj4;
        return null;
    }
}
