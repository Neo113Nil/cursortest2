package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class H3 {

    /* renamed from: a, reason: collision with root package name */
    public long f9315a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9316b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9317c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9318d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9319e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9320g;

    /* renamed from: h, reason: collision with root package name */
    public final List f9321h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public H3(String str, C1456q3 c1456q3) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = c1456q3.f15088b;
        long j5 = c1456q3.f15089c;
        long j6 = c1456q3.f15090d;
        long j7 = c1456q3.f15091e;
        long j8 = c1456q3.f;
        List list = c1456q3.f15093h;
        if (list == 0) {
            Map map = c1456q3.f15092g;
            list = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                list.add(new C1635u3((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    public static H3 a(I3 i32) {
        if (K3.d(i32) != 538247942) {
            throw new IOException();
        }
        String g5 = K3.g(i32);
        String g6 = K3.g(i32);
        long e3 = K3.e(i32);
        long e5 = K3.e(i32);
        long e6 = K3.e(i32);
        long e7 = K3.e(i32);
        int d5 = K3.d(i32);
        if (d5 < 0) {
            throw new IOException(AbstractC2107A.q("readHeaderList size=", d5));
        }
        List arrayList = d5 == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < d5; i++) {
            arrayList.add(new C1635u3(K3.g(i32).intern(), K3.g(i32).intern()));
        }
        return new H3(g5, g6, e3, e5, e6, e7, arrayList);
    }

    public H3(String str, String str2, long j5, long j6, long j7, long j8, List list) {
        this.f9316b = str;
        this.f9317c = true == "".equals(str2) ? null : str2;
        this.f9318d = j5;
        this.f9319e = j6;
        this.f = j7;
        this.f9320g = j8;
        this.f9321h = list;
    }
}
