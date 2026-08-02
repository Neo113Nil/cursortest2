package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f38214a = new ArrayList();

    private static void b(ArrayList arrayList, int i11, int[] iArr, int i12) {
        if (i12 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = 0;
            while (true) {
                if (i14 >= i12) {
                    iArr[i12] = i13;
                    b(arrayList, i11, iArr, i12 + 1);
                    break;
                } else if (i13 == iArr[i14]) {
                    break;
                } else {
                    i14++;
                }
            }
        }
    }

    public final void a(@NonNull V0 v02) {
        this.f38214a.add(v02);
    }

    public final List<V0> c(@NonNull List<V0> list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.f38214a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        boolean z11 = false;
        b(arrayList2, size2, new int[size2], 0);
        V0[] v0Arr = new V0[list.size()];
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean z12 = true;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (iArr[i11] < list.size()) {
                    V0 v02 = (V0) arrayList.get(i11);
                    V0 v03 = list.get(iArr[i11]);
                    v02.getClass();
                    z12 &= v03.c().mId <= v02.c().mId && v03.d() == v02.d();
                    if (!z12) {
                        break;
                    }
                    v0Arr[iArr[i11]] = (V0) arrayList.get(i11);
                }
            }
            if (z12) {
                z11 = true;
                break;
            }
        }
        if (z11) {
            return Arrays.asList(v0Arr);
        }
        return null;
    }
}
