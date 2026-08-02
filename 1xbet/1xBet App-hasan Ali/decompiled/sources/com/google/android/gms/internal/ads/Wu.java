package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class Wu extends Zu {
    public static final Zu f(int i) {
        return i < 0 ? Zu.f12540b : i > 0 ? Zu.f12541c : Zu.f12539a;
    }

    @Override // com.google.android.gms.internal.ads.Zu
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Zu
    public final Zu b(int i, int i5) {
        return f(Integer.compare(i, i5));
    }

    @Override // com.google.android.gms.internal.ads.Zu
    public final Zu c(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.Zu
    public final Zu d(boolean z3, boolean z5) {
        return f(Boolean.compare(z3, z5));
    }

    @Override // com.google.android.gms.internal.ads.Zu
    public final Zu e(boolean z3, boolean z5) {
        return f(Boolean.compare(z5, z3));
    }
}
