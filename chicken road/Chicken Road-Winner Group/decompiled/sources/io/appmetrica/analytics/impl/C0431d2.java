package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0431d2 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final D2 f7136a;

    public C0431d2() {
        this(new D2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0508g2 fromModel(C0405c2 c0405c2) {
        C0508g2 c0508g2 = new C0508g2();
        c0508g2.f7322a = new C0482f2[c0405c2.f7081a.size()];
        int i3 = 0;
        int i4 = 0;
        for (PermissionState permissionState : c0405c2.f7081a) {
            C0482f2[] c0482f2Arr = c0508g2.f7322a;
            C0482f2 c0482f2 = new C0482f2();
            c0482f2.f7271a = permissionState.name;
            c0482f2.f7272b = permissionState.granted;
            c0482f2Arr[i4] = c0482f2;
            i4++;
        }
        F2 f22 = c0405c2.f7082b;
        if (f22 != null) {
            c0508g2.f7323b = this.f7136a.fromModel(f22);
        }
        c0508g2.f7324c = new String[c0405c2.f7083c.size()];
        Iterator it = c0405c2.f7083c.iterator();
        while (it.hasNext()) {
            c0508g2.f7324c[i3] = (String) it.next();
            i3++;
        }
        return c0508g2;
    }

    public C0431d2(D2 d22) {
        this.f7136a = d22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0405c2 toModel(C0508g2 c0508g2) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            C0482f2[] c0482f2Arr = c0508g2.f7322a;
            if (i4 >= c0482f2Arr.length) {
                break;
            }
            C0482f2 c0482f2 = c0482f2Arr[i4];
            arrayList.add(new PermissionState(c0482f2.f7271a, c0482f2.f7272b));
            i4++;
        }
        C0456e2 c0456e2 = c0508g2.f7323b;
        F2 model = c0456e2 != null ? this.f7136a.toModel(c0456e2) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c0508g2.f7324c;
            if (i3 < strArr.length) {
                arrayList2.add(strArr[i3]);
                i3++;
            } else {
                return new C0405c2(arrayList, model, arrayList2);
            }
        }
    }
}
