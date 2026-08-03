package com.moloco.sdk.internal.client_metrics_data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.client_metrics_data.c f6941a = new com.moloco.sdk.internal.client_metrics_data.c("success", 0);
    public static final com.moloco.sdk.internal.client_metrics_data.c b = new com.moloco.sdk.internal.client_metrics_data.c(com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE, 1);
    public static final /* synthetic */ com.moloco.sdk.internal.client_metrics_data.c[] c;
    public static final /* synthetic */ kotlin.enums.EnumEntries d;

    static {
        com.moloco.sdk.internal.client_metrics_data.c[] a2 = a();
        c = a2;
        d = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public c(java.lang.String str, int i) {
    }

    public static final /* synthetic */ com.moloco.sdk.internal.client_metrics_data.c[] a() {
        return new com.moloco.sdk.internal.client_metrics_data.c[]{f6941a, b};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.client_metrics_data.c> b() {
        return d;
    }

    public static com.moloco.sdk.internal.client_metrics_data.c valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.client_metrics_data.c) java.lang.Enum.valueOf(com.moloco.sdk.internal.client_metrics_data.c.class, str);
    }

    public static com.moloco.sdk.internal.client_metrics_data.c[] values() {
        return (com.moloco.sdk.internal.client_metrics_data.c[]) c.clone();
    }
}
