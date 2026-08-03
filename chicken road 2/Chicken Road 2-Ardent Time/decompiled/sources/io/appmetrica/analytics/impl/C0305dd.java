package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305dd implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = ((io.appmetrica.analytics.impl.C0253bd) obj).f5576a;
        java.lang.String str2 = ((io.appmetrica.analytics.impl.C0253bd) obj2).f5576a;
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
