package com.moloco.sdk.internal.services.bidtoken;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.moloco.sdk.internal.services.bidtoken.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3431b {
    public static final com.moloco.sdk.internal.services.bidtoken.EnumC3431b b = new com.moloco.sdk.internal.services.bidtoken.EnumC3431b("UNKNOWN", 0, -100);
    public static final com.moloco.sdk.internal.services.bidtoken.EnumC3431b c = new com.moloco.sdk.internal.services.bidtoken.EnumC3431b("HTTP_REQUEST_TIMEOUT", 1, -101);
    public static final com.moloco.sdk.internal.services.bidtoken.EnumC3431b d = new com.moloco.sdk.internal.services.bidtoken.EnumC3431b("UNKNOWN_HOST", 2, androidx.media3.common.PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);
    public static final /* synthetic */ com.moloco.sdk.internal.services.bidtoken.EnumC3431b[] e;
    public static final /* synthetic */ kotlin.enums.EnumEntries f;

    /* renamed from: a, reason: collision with root package name */
    public final int f7216a;

    static {
        com.moloco.sdk.internal.services.bidtoken.EnumC3431b[] a2 = a();
        e = a2;
        f = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public EnumC3431b(java.lang.String str, int i, int i2) {
        this.f7216a = i2;
    }

    public static final /* synthetic */ com.moloco.sdk.internal.services.bidtoken.EnumC3431b[] a() {
        return new com.moloco.sdk.internal.services.bidtoken.EnumC3431b[]{b, c, d};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.services.bidtoken.EnumC3431b> b() {
        return f;
    }

    public static com.moloco.sdk.internal.services.bidtoken.EnumC3431b valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.services.bidtoken.EnumC3431b) java.lang.Enum.valueOf(com.moloco.sdk.internal.services.bidtoken.EnumC3431b.class, str);
    }

    public static com.moloco.sdk.internal.services.bidtoken.EnumC3431b[] values() {
        return (com.moloco.sdk.internal.services.bidtoken.EnumC3431b[]) e.clone();
    }

    public final int c() {
        return this.f7216a;
    }
}
