package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class U1 implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0759v2 f5055a;

    public U1() {
        this(new io.appmetrica.analytics.impl.C0759v2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.X1 fromModel(io.appmetrica.analytics.impl.T1 t12) {
        io.appmetrica.analytics.impl.X1 x12 = new io.appmetrica.analytics.impl.X1();
        x12.f5252a = new io.appmetrica.analytics.impl.W1[t12.f4992a.size()];
        int i2 = 0;
        int i3 = 0;
        for (io.appmetrica.analytics.coreapi.internal.permission.PermissionState permissionState : t12.f4992a) {
            io.appmetrica.analytics.impl.W1[] w1Arr = x12.f5252a;
            io.appmetrica.analytics.impl.W1 w12 = new io.appmetrica.analytics.impl.W1();
            w12.f5184a = permissionState.name;
            w12.f5185b = permissionState.granted;
            w1Arr[i3] = w12;
            i3++;
        }
        io.appmetrica.analytics.impl.C0811x2 c0811x2 = t12.f4993b;
        if (c0811x2 != null) {
            x12.f5253b = this.f5055a.fromModel(c0811x2);
        }
        x12.f5254c = new java.lang.String[t12.f4994c.size()];
        java.util.Iterator it = t12.f4994c.iterator();
        while (it.hasNext()) {
            x12.f5254c[i2] = (java.lang.String) it.next();
            i2++;
        }
        return x12;
    }

    public U1(io.appmetrica.analytics.impl.C0759v2 c0759v2) {
        this.f5055a = c0759v2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.T1 toModel(io.appmetrica.analytics.impl.X1 x12) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            io.appmetrica.analytics.impl.W1[] w1Arr = x12.f5252a;
            if (i3 >= w1Arr.length) {
                break;
            }
            io.appmetrica.analytics.impl.W1 w12 = w1Arr[i3];
            arrayList.add(new io.appmetrica.analytics.coreapi.internal.permission.PermissionState(w12.f5184a, w12.f5185b));
            i3++;
        }
        io.appmetrica.analytics.impl.V1 v12 = x12.f5253b;
        io.appmetrica.analytics.impl.C0811x2 model = v12 != null ? this.f5055a.toModel(v12) : null;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (true) {
            java.lang.String[] strArr = x12.f5254c;
            if (i2 < strArr.length) {
                arrayList2.add(strArr[i2]);
                i2++;
            } else {
                return new io.appmetrica.analytics.impl.T1(arrayList, model, arrayList2);
            }
        }
    }
}
