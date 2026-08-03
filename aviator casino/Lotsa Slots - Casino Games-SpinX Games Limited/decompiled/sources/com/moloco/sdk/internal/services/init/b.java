package com.moloco.sdk.internal.services.init;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.services.init.b f7281a = new com.moloco.sdk.internal.services.init.b("RequestTimeout", 0);
    public static final com.moloco.sdk.internal.services.init.b b = new com.moloco.sdk.internal.services.init.b("UnknownHostHttpError", 1);
    public static final com.moloco.sdk.internal.services.init.b c = new com.moloco.sdk.internal.services.init.b("HttpSocketError", 2);
    public static final com.moloco.sdk.internal.services.init.b d = new com.moloco.sdk.internal.services.init.b("HttpSslError", 3);
    public static final com.moloco.sdk.internal.services.init.b e = new com.moloco.sdk.internal.services.init.b("PersistentHttpUnavailableError", 4);
    public static final com.moloco.sdk.internal.services.init.b f = new com.moloco.sdk.internal.services.init.b(com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, 5);
    public static final /* synthetic */ com.moloco.sdk.internal.services.init.b[] g;
    public static final /* synthetic */ kotlin.enums.EnumEntries h;

    static {
        com.moloco.sdk.internal.services.init.b[] a2 = a();
        g = a2;
        h = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public b(java.lang.String str, int i) {
    }

    public static final /* synthetic */ com.moloco.sdk.internal.services.init.b[] a() {
        return new com.moloco.sdk.internal.services.init.b[]{f7281a, b, c, d, e, f};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.services.init.b> b() {
        return h;
    }

    public static com.moloco.sdk.internal.services.init.b valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.services.init.b) java.lang.Enum.valueOf(com.moloco.sdk.internal.services.init.b.class, str);
    }

    public static com.moloco.sdk.internal.services.init.b[] values() {
        return (com.moloco.sdk.internal.services.init.b[]) g.clone();
    }
}
