package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0638qa extends io.appmetrica.analytics.impl.C2 {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0715ta f6683b;

    public C0638qa(int i2) {
        this(i2, null);
    }

    public int b(java.lang.Object obj) {
        return 0;
    }

    public C0638qa(int i2, io.appmetrica.analytics.impl.InterfaceC0715ta interfaceC0715ta) {
        super(i2);
        this.f6683b = interfaceC0715ta;
    }

    @Override // io.appmetrica.analytics.impl.C2, io.appmetrica.analytics.impl.InterfaceC0715ta
    public final io.appmetrica.analytics.impl.Mn a(java.util.List<java.lang.Object> list) {
        int i2;
        int i3 = 0;
        if (list == null || (list.size() <= this.f4162a && this.f6683b == null)) {
            i2 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            i2 = 0;
            int i4 = 0;
            for (java.lang.Object obj : list) {
                if (i4 < this.f4162a) {
                    io.appmetrica.analytics.impl.InterfaceC0715ta interfaceC0715ta = this.f6683b;
                    if (interfaceC0715ta != null) {
                        io.appmetrica.analytics.impl.Mn a2 = interfaceC0715ta.a(obj);
                        java.lang.Object obj2 = a2.f4694a;
                        i2 += a2.f4695b.getBytesTruncated();
                        io.appmetrica.analytics.impl.AbstractC0522lo.a(obj, a2.f4694a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i3++;
                    i2 += b(obj);
                }
                i4++;
            }
            list = arrayList;
        }
        return new io.appmetrica.analytics.impl.Mn(list, new io.appmetrica.analytics.impl.C0554n4(i3, i2));
    }

    public final io.appmetrica.analytics.impl.InterfaceC0715ta b() {
        return this.f6683b;
    }
}
