package io.appmetrica.analytics.impl;

import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896v2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0812rm fromModel(C0870u2 c0870u2) {
        C0761pm c0761pm;
        C0812rm c0812rm = new C0812rm();
        c0812rm.f8249a = new C0787qm[c0870u2.f8381a.size()];
        for (int i3 = 0; i3 < c0870u2.f8381a.size(); i3++) {
            C0787qm c0787qm = new C0787qm();
            Pair pair = (Pair) c0870u2.f8381a.get(i3);
            c0787qm.f8174a = (String) pair.first;
            if (pair.second != null) {
                c0787qm.f8175b = new C0761pm();
                C0844t2 c0844t2 = (C0844t2) pair.second;
                if (c0844t2 == null) {
                    c0761pm = null;
                } else {
                    C0761pm c0761pm2 = new C0761pm();
                    c0761pm2.f8096a = c0844t2.f8326a;
                    c0761pm = c0761pm2;
                }
                c0787qm.f8175b = c0761pm;
            }
            c0812rm.f8249a[i3] = c0787qm;
        }
        return c0812rm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0870u2 toModel(C0812rm c0812rm) {
        ArrayList arrayList = new ArrayList();
        for (C0787qm c0787qm : c0812rm.f8249a) {
            String str = c0787qm.f8174a;
            C0761pm c0761pm = c0787qm.f8175b;
            arrayList.add(new Pair(str, c0761pm == null ? null : new C0844t2(c0761pm.f8096a)));
        }
        return new C0870u2(arrayList);
    }
}
