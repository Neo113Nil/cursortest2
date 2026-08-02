package com.plaid.internal;

/* loaded from: classes16.dex */
public final class P6<T> {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f5883a;
    public int b;
    public int c;
    public int d;

    public P6() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < 50; i++) {
            arrayList.add(null);
        }
        this.f5883a = arrayList;
    }

    public final java.util.ArrayList a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = this.c;
        int i2 = this.b;
        if (i <= i2) {
            int size = this.f5883a.size();
            while (i2 < size) {
                java.lang.Object obj = this.f5883a.get(i2);
                if (obj != null) {
                    arrayList.add(obj);
                }
                i2++;
            }
            int i3 = this.c;
            for (int i4 = 0; i4 < i3; i4++) {
                java.lang.Object obj2 = this.f5883a.get(i4);
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        } else if (i2 <= i) {
            while (true) {
                java.lang.Object obj3 = this.f5883a.get(i2);
                if (obj3 != null) {
                    arrayList.add(obj3);
                }
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return arrayList;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(a(), ", ", "{", "}", 0, null, null, 56, null));
        int i = this.d;
        int i2 = this.b;
        int i3 = this.c;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" [capacity=");
        sb2.append(i);
        sb2.append(", H=");
        sb2.append(i2);
        sb2.append(", T=");
        sb2.append(i3);
        sb2.append("]");
        sb.append(sb2.toString());
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
