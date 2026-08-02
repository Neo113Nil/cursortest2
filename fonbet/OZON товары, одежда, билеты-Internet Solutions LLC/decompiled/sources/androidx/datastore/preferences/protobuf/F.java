package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5378y;

/* loaded from: classes.dex */
final class F implements E {
    @Override // androidx.datastore.preferences.protobuf.E
    public final C5378y.c a(long j11, Object obj) {
        C5378y.c cVar = (C5378y.c) p0.s(obj, j11);
        if (cVar.isModifiable()) {
            return cVar;
        }
        int size = cVar.size();
        C5378y.c mutableCopyWithCapacity = cVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        p0.E(obj, j11, mutableCopyWithCapacity);
        return mutableCopyWithCapacity;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final void makeImmutableListAt(Object obj, long j11) {
        ((C5378y.c) p0.s(obj, j11)).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public final <E> void mergeListsAt(Object obj, Object obj2, long j11) {
        C5378y.c cVar = (C5378y.c) p0.s(obj, j11);
        C5378y.c cVar2 = (C5378y.c) p0.s(obj2, j11);
        int size = cVar.size();
        int size2 = cVar2.size();
        if (size > 0 && size2 > 0) {
            if (!cVar.isModifiable()) {
                cVar = cVar.mutableCopyWithCapacity(size2 + size);
            }
            cVar.addAll(cVar2);
        }
        if (size > 0) {
            cVar2 = cVar;
        }
        p0.E(obj, j11, cVar2);
    }
}
