package com.chartboost.sdk.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class lj {
    public static final a c;
    public static final Map d;
    public static final lj e = new lj("TIMESTAMP", 0, "[TIMESTAMP]");
    public static final lj f = new lj("CACHEBUSTING", 1, "[CACHEBUSTING]");
    public static final lj g = new lj("ERRORCODE", 2, "[ERRORCODE]");
    public static final lj h = new lj("REASON", 3, "[REASON]");
    public static final lj i = new lj("LIMITADTRACKING", 4, "[LIMITADTRACKING]");
    public static final lj j = new lj("APPBUNDLE", 5, "[APPBUNDLE]");
    public static final lj k = new lj("OMIDPARTNER", 6, "[OMIDPARTNER]");
    public static final lj l = new lj("INVENTORYSTATE", 7, "[INVENTORYSTATE]");
    public static final lj m = new lj("CLICKPOS", 8, "[CLICKPOS]");
    public static final lj n = new lj("CLICKTYPE", 9, "[CLICKTYPE]");
    public static final lj o = new lj("PLAYERSIZE", 10, "[PLAYERSIZE]");
    public static final lj p = new lj("ASSETURI", 11, "[ASSETURI]");
    public static final lj q = new lj("CONTENTPLAYHEAD", 12, "[CONTENTPLAYHEAD]");
    public static final lj r = new lj("MEDIAPLAYHEAD", 13, "[MEDIAPLAYHEAD]");
    public static final lj s = new lj("ADPLAYHEAD", 14, "[ADPLAYHEAD]");
    public static final /* synthetic */ lj[] t;
    public static final /* synthetic */ EnumEntries u;
    public final String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final lj a(String token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return (lj) lj.d.get(token);
        }

        public a() {
        }
    }

    static {
        lj[] a2 = a();
        t = a2;
        u = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
        EnumEntries c2 = c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(c2, 10)), 16));
        for (Object obj : c2) {
            linkedHashMap.put(((lj) obj).b, obj);
        }
        d = linkedHashMap;
    }

    public lj(String str, int i2, String str2) {
        this.b = str2;
    }

    public static final /* synthetic */ lj[] a() {
        return new lj[]{e, f, g, h, i, j, k, l, m, n, o, p, q, r, s};
    }

    public static EnumEntries c() {
        return u;
    }

    public static lj valueOf(String str) {
        return (lj) Enum.valueOf(lj.class, str);
    }

    public static lj[] values() {
        return (lj[]) t.clone();
    }
}
