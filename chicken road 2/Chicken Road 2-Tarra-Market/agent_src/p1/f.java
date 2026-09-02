package p1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6434a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6435b;

    /* renamed from: c, reason: collision with root package name */
    public String f6436c;

    public f(ArrayList arrayList) {
        this.f6434a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = j1.d.f6054b;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f6435b = true;
            return null;
        }
        boolean equals = name.equals("protocols");
        ArrayList arrayList = this.f6434a;
        if (equals && objArr.length == 0) {
            return arrayList;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayList.contains(list.get(i2))) {
                        String str = (String) list.get(i2);
                        this.f6436c = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f6436c = str2;
                return str2;
            }
        }
        if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
            return method.invoke(this, objArr);
        }
        this.f6436c = (String) objArr[0];
        return null;
    }
}
