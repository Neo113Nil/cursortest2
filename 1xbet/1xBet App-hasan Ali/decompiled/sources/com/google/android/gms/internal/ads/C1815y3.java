package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.y3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1815y3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16386a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16387b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f16388c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16389d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16390e;

    public C1815y3(int i, byte[] bArr, Map map, List list, boolean z3) {
        this.f16386a = i;
        this.f16387b = bArr;
        this.f16388c = map;
        this.f16389d = list == null ? null : Collections.unmodifiableList(list);
        this.f16390e = z3;
    }

    public static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new C1635u3((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1815y3(int i, byte[] bArr, boolean z3, List list) {
        this(i, bArr, r0, list, z3);
        Map treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1635u3 c1635u3 = (C1635u3) it.next();
                treeMap.put(c1635u3.f15790a, c1635u3.f15791b);
            }
        }
    }
}
