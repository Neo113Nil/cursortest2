package com.moloco.sdk.internal.client_metrics_data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {
    public static final com.moloco.sdk.internal.client_metrics_data.d b = new com.moloco.sdk.internal.client_metrics_data.d("Reason", 0, "reason");
    public static final com.moloco.sdk.internal.client_metrics_data.d c = new com.moloco.sdk.internal.client_metrics_data.d("AdType", 1, com.facebook.appevents.AppEventsConstants.EVENT_PARAM_AD_TYPE);
    public static final com.moloco.sdk.internal.client_metrics_data.d d = new com.moloco.sdk.internal.client_metrics_data.d("Result", 2, "result");
    public static final com.moloco.sdk.internal.client_metrics_data.d e = new com.moloco.sdk.internal.client_metrics_data.d("Country", 3, "country");
    public static final com.moloco.sdk.internal.client_metrics_data.d f = new com.moloco.sdk.internal.client_metrics_data.d("RetryAttempt", 4, "attempt");
    public static final com.moloco.sdk.internal.client_metrics_data.d g = new com.moloco.sdk.internal.client_metrics_data.d("Step", 5, "step");
    public static final com.moloco.sdk.internal.client_metrics_data.d h = new com.moloco.sdk.internal.client_metrics_data.d("CreativeType", 6, "creative_type");
    public static final com.moloco.sdk.internal.client_metrics_data.d i = new com.moloco.sdk.internal.client_metrics_data.d("MissingFields", 7, "missing_fields");
    public static final com.moloco.sdk.internal.client_metrics_data.d j = new com.moloco.sdk.internal.client_metrics_data.d("ParentViewType", 8, "parent_view_type");
    public static final /* synthetic */ com.moloco.sdk.internal.client_metrics_data.d[] k;
    public static final /* synthetic */ kotlin.enums.EnumEntries l;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6942a;

    static {
        com.moloco.sdk.internal.client_metrics_data.d[] a2 = a();
        k = a2;
        l = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public d(java.lang.String str, int i2, java.lang.String str2) {
        this.f6942a = str2;
    }

    public static final /* synthetic */ com.moloco.sdk.internal.client_metrics_data.d[] a() {
        return new com.moloco.sdk.internal.client_metrics_data.d[]{b, c, d, e, f, g, h, i, j};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.client_metrics_data.d> b() {
        return l;
    }

    public static com.moloco.sdk.internal.client_metrics_data.d valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.client_metrics_data.d) java.lang.Enum.valueOf(com.moloco.sdk.internal.client_metrics_data.d.class, str);
    }

    public static com.moloco.sdk.internal.client_metrics_data.d[] values() {
        return (com.moloco.sdk.internal.client_metrics_data.d[]) k.clone();
    }

    public final java.lang.String c() {
        return this.f6942a;
    }
}
