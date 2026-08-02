package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.uv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1671uv extends AbstractC1716vv implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public static final C1671uv f15931l = new C1671uv(0);

    /* renamed from: m, reason: collision with root package name */
    public static final C1671uv f15932m = new C1671uv(1);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15933k;

    public /* synthetic */ C1671uv(int i) {
        this.f15933k = i;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f15933k) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f15933k) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
