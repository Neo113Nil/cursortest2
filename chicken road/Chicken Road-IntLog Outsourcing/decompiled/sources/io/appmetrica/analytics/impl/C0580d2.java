package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580d2 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final D2 f8025a;

    public C0580d2() {
        this(new D2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0657g2 fromModel(C0554c2 c0554c2) {
        C0657g2 c0657g2 = new C0657g2();
        c0657g2.f8219a = new C0631f2[c0554c2.f7968a.size()];
        int i2 = 0;
        int i3 = 0;
        for (PermissionState permissionState : c0554c2.f7968a) {
            C0631f2[] c0631f2Arr = c0657g2.f8219a;
            C0631f2 c0631f2 = new C0631f2();
            c0631f2.f8166a = permissionState.name;
            c0631f2.f8167b = permissionState.granted;
            c0631f2Arr[i3] = c0631f2;
            i3++;
        }
        F2 f22 = c0554c2.f7969b;
        if (f22 != null) {
            c0657g2.f8220b = this.f8025a.fromModel(f22);
        }
        c0657g2.f8221c = new String[c0554c2.f7970c.size()];
        Iterator it = c0554c2.f7970c.iterator();
        while (it.hasNext()) {
            c0657g2.f8221c[i2] = (String) it.next();
            i2++;
        }
        return c0657g2;
    }

    public C0580d2(D2 d22) {
        this.f8025a = d22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0554c2 toModel(C0657g2 c0657g2) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C0631f2[] c0631f2Arr = c0657g2.f8219a;
            if (i3 >= c0631f2Arr.length) {
                break;
            }
            C0631f2 c0631f2 = c0631f2Arr[i3];
            arrayList.add(new PermissionState(c0631f2.f8166a, c0631f2.f8167b));
            i3++;
        }
        C0605e2 c0605e2 = c0657g2.f8220b;
        F2 model = c0605e2 != null ? this.f8025a.toModel(c0605e2) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c0657g2.f8221c;
            if (i2 < strArr.length) {
                arrayList2.add(strArr[i2]);
                i2++;
            } else {
                return new C0554c2(arrayList, model, arrayList2);
            }
        }
    }
}
