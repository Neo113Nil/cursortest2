package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1542s0 extends BC {

    /* renamed from: m, reason: collision with root package name */
    public long f15402m;

    /* renamed from: n, reason: collision with root package name */
    public long[] f15403n;

    /* renamed from: o, reason: collision with root package name */
    public long[] f15404o;

    public static Serializable p1(int i, C1617tm c1617tm) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c1617tm.C()));
        }
        if (i == 1) {
            return Boolean.valueOf(c1617tm.v() == 1);
        }
        if (i == 2) {
            return q1(c1617tm);
        }
        if (i != 3) {
            if (i == 8) {
                return r1(c1617tm);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c1617tm.C()));
                c1617tm.k(2);
                return date;
            }
            int y5 = c1617tm.y();
            ArrayList arrayList = new ArrayList(y5);
            for (int i5 = 0; i5 < y5; i5++) {
                Serializable p12 = p1(c1617tm.v(), c1617tm);
                if (p12 != null) {
                    arrayList.add(p12);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String q12 = q1(c1617tm);
            int v4 = c1617tm.v();
            if (v4 == 9) {
                return hashMap;
            }
            Serializable p13 = p1(v4, c1617tm);
            if (p13 != null) {
                hashMap.put(q12, p13);
            }
        }
    }

    public static String q1(C1617tm c1617tm) {
        int z3 = c1617tm.z();
        int i = c1617tm.f15725b;
        c1617tm.k(z3);
        return new String(c1617tm.f15724a, i, z3);
    }

    public static HashMap r1(C1617tm c1617tm) {
        int y5 = c1617tm.y();
        HashMap hashMap = new HashMap(y5);
        for (int i = 0; i < y5; i++) {
            String q12 = q1(c1617tm);
            Serializable p12 = p1(c1617tm.v(), c1617tm);
            if (p12 != null) {
                hashMap.put(q12, p12);
            }
        }
        return hashMap;
    }
}
