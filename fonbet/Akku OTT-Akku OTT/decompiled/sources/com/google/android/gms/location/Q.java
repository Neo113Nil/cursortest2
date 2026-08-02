package com.google.android.gms.location;

import com.google.android.gms.common.internal.C0875q;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class Q implements Comparator<C0923b> {
    @Override // java.util.Comparator
    public final int compare(C0923b c0923b, C0923b c0923b2) {
        C0923b c0923b3 = c0923b;
        C0923b c0923b4 = c0923b2;
        C0875q.g(c0923b3);
        C0875q.g(c0923b4);
        int i = c0923b3.a;
        int i2 = c0923b4.a;
        if (i != i2) {
            return i >= i2 ? 1 : -1;
        }
        int i3 = c0923b3.b;
        int i4 = c0923b4.b;
        if (i3 == i4) {
            return 0;
        }
        return i3 < i4 ? -1 : 1;
    }
}
