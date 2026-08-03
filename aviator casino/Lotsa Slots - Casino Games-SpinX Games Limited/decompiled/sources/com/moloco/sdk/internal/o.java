package com.moloco.sdk.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class o implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.o f7004a = new com.moloco.sdk.internal.o("AD_LOAD_LIMIT_REACHED", 0);
    public static final com.moloco.sdk.internal.o b = new com.moloco.sdk.internal.o("BID_LOAD_ERROR_CANNOT_PROCESS_BID_RESPONSE", 1);
    public static final com.moloco.sdk.internal.o c = new com.moloco.sdk.internal.o("BID_LOAD_ERROR_PARSE_INVALID_JSON", 2);
    public static final com.moloco.sdk.internal.o d = new com.moloco.sdk.internal.o("BID_LOAD_ERROR_PARSE_MISSING_REQUIRED_FIELD", 3);
    public static final com.moloco.sdk.internal.o e = new com.moloco.sdk.internal.o("BID_LOAD_ERROR_CANNOT_PARSE_BID_RESPONSE", 4);
    public static final com.moloco.sdk.internal.o f = new com.moloco.sdk.internal.o("AD_SHOW_ERROR_NOT_LOADED", 5);
    public static final com.moloco.sdk.internal.o g = new com.moloco.sdk.internal.o("AD_SHOW_ERROR_ALREADY_DISPLAYING", 6);
    public static final /* synthetic */ com.moloco.sdk.internal.o[] h;
    public static final /* synthetic */ kotlin.enums.EnumEntries i;

    static {
        com.moloco.sdk.internal.o[] b2 = b();
        h = b2;
        i = kotlin.enums.EnumEntriesKt.enumEntries(b2);
    }

    public o(java.lang.String str, int i2) {
    }

    public static final /* synthetic */ com.moloco.sdk.internal.o[] b() {
        return new com.moloco.sdk.internal.o[]{f7004a, b, c, d, e, f, g};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.o> c() {
        return i;
    }

    public static com.moloco.sdk.internal.o valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.o) java.lang.Enum.valueOf(com.moloco.sdk.internal.o.class, str);
    }

    public static com.moloco.sdk.internal.o[] values() {
        return (com.moloco.sdk.internal.o[]) h.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public java.lang.String a() {
        return name();
    }
}
