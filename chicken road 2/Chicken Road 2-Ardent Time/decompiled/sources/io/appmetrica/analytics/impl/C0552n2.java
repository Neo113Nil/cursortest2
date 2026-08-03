package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552n2 implements io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0572nm fromModel(io.appmetrica.analytics.impl.C0526m2 c0526m2) {
        io.appmetrica.analytics.impl.C0520lm c0520lm;
        io.appmetrica.analytics.impl.C0572nm c0572nm = new io.appmetrica.analytics.impl.C0572nm();
        c0572nm.f6545a = new io.appmetrica.analytics.impl.C0546mm[c0526m2.f6383a.size()];
        for (int i2 = 0; i2 < c0526m2.f6383a.size(); i2++) {
            io.appmetrica.analytics.impl.C0546mm c0546mm = new io.appmetrica.analytics.impl.C0546mm();
            android.util.Pair pair = (android.util.Pair) c0526m2.f6383a.get(i2);
            c0546mm.f6446a = (java.lang.String) pair.first;
            if (pair.second != null) {
                c0546mm.f6447b = new io.appmetrica.analytics.impl.C0520lm();
                io.appmetrica.analytics.impl.C0500l2 c0500l2 = (io.appmetrica.analytics.impl.C0500l2) pair.second;
                if (c0500l2 == null) {
                    c0520lm = null;
                } else {
                    io.appmetrica.analytics.impl.C0520lm c0520lm2 = new io.appmetrica.analytics.impl.C0520lm();
                    c0520lm2.f6374a = c0500l2.f6321a;
                    c0520lm = c0520lm2;
                }
                c0546mm.f6447b = c0520lm;
            }
            c0572nm.f6545a[i2] = c0546mm;
        }
        return c0572nm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0526m2 toModel(io.appmetrica.analytics.impl.C0572nm c0572nm) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (io.appmetrica.analytics.impl.C0546mm c0546mm : c0572nm.f6545a) {
            java.lang.String str = c0546mm.f6446a;
            io.appmetrica.analytics.impl.C0520lm c0520lm = c0546mm.f6447b;
            arrayList.add(new android.util.Pair(str, c0520lm == null ? null : new io.appmetrica.analytics.impl.C0500l2(c0520lm.f6374a)));
        }
        return new io.appmetrica.analytics.impl.C0526m2(arrayList);
    }
}
