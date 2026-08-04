package com.google.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends U {
    @Override // com.google.protobuf.U
    public final void a(long j, Object obj) {
        AbstractC0849b abstractC0849b = (AbstractC0849b) ((J) K0.f12117c.k(j, obj));
        if (abstractC0849b.f12176a) {
            abstractC0849b.f12176a = false;
        }
    }

    @Override // com.google.protobuf.U
    public final void b(Object obj, long j, Object obj2) {
        J0 j3 = K0.f12117c;
        J jA = (J) j3.k(j, obj);
        J j7 = (J) j3.k(j, obj2);
        int size = jA.size();
        int size2 = j7.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0849b) jA).f12176a) {
                jA = jA.a(size2 + size);
            }
            jA.addAll(j7);
        }
        if (size > 0) {
            j7 = jA;
        }
        K0.s(obj, j, j7);
    }

    @Override // com.google.protobuf.U
    public final List c(long j, Object obj) {
        J j3 = (J) K0.f12117c.k(j, obj);
        if (((AbstractC0849b) j3).f12176a) {
            return j3;
        }
        int size = j3.size();
        J jA = j3.a(size == 0 ? 10 : size * 2);
        K0.s(obj, j, jA);
        return jA;
    }
}
