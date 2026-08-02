package com.google.protobuf;

import java.util.List;

/* loaded from: classes2.dex */
public final class T extends U {
    @Override // com.google.protobuf.U
    public final void a(long j, Object obj) {
        AbstractC0893b abstractC0893b = (AbstractC0893b) ((J) K0.f12117c.k(j, obj));
        if (abstractC0893b.f12176a) {
            abstractC0893b.f12176a = false;
        }
    }

    @Override // com.google.protobuf.U
    public final void b(Object obj, long j, Object obj2) {
        J0 j02 = K0.f12117c;
        J j3 = (J) j02.k(j, obj);
        J j7 = (J) j02.k(j, obj2);
        int size = j3.size();
        int size2 = j7.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0893b) j3).f12176a) {
                j3 = j3.a(size2 + size);
            }
            j3.addAll(j7);
        }
        if (size > 0) {
            j7 = j3;
        }
        K0.s(obj, j, j7);
    }

    @Override // com.google.protobuf.U
    public final List c(long j, Object obj) {
        J j3 = (J) K0.f12117c.k(j, obj);
        if (((AbstractC0893b) j3).f12176a) {
            return j3;
        }
        int size = j3.size();
        J a2 = j3.a(size == 0 ? 10 : size * 2);
        K0.s(obj, j, a2);
        return a2;
    }
}
