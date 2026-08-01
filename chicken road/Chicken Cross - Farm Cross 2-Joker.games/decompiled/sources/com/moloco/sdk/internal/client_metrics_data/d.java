package com.moloco.sdk.internal.client_metrics_data;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class d {
    public static final d b = new d("Reason", 0, "reason");
    public static final d c = new d("AdType", 1, "ad_type");
    public static final d d = new d("Result", 2, "result");
    public static final d e = new d("Country", 3, "country");
    public static final d f = new d("RetryAttempt", 4, "attempt");
    public static final d g = new d("Step", 5, "step");
    public static final d h = new d("CreativeType", 6, "creative_type");
    public static final d i = new d("MissingFields", 7, "missing_fields");
    public static final d j = new d("ParentViewType", 8, "parent_view_type");
    public static final /* synthetic */ d[] k;
    public static final /* synthetic */ EnumEntries l;

    /* renamed from: a, reason: collision with root package name */
    public final String f10446a;

    static {
        d[] a2 = a();
        k = a2;
        l = EnumEntriesKt.enumEntries(a2);
    }

    public d(String str, int i2, String str2) {
        this.f10446a = str2;
    }

    public static final /* synthetic */ d[] a() {
        return new d[]{b, c, d, e, f, g, h, i, j};
    }

    public static EnumEntries<d> b() {
        return l;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) k.clone();
    }

    public final String c() {
        return this.f10446a;
    }
}
