package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.d6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2347d6 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.inmobi.media.EnumC2347d6[] f5154a;

    static {
        com.inmobi.media.EnumC2347d6[] enumC2347d6Arr = {new com.inmobi.media.EnumC2347d6(0, -100, "PING_V2_DISABLED", "Ping V2 is disabled from SDK config"), new com.inmobi.media.EnumC2347d6(1, -101, "PING_ID_MISSING", "Ping ID is missing"), new com.inmobi.media.EnumC2347d6(2, androidx.media3.common.PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED, "PING_URL_INVALID", "Ping url is invalid"), new com.inmobi.media.EnumC2347d6(3, androidx.media3.common.PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED, "PING_URL_MISSING", "Ping URL is missing"), new com.inmobi.media.EnumC2347d6(4, androidx.media3.common.PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT, "PING_JSON_INVALID", "Ping JSON is invalid"), new com.inmobi.media.EnumC2347d6(5, androidx.media3.common.PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED, "PING_ARRAY_EMPTY", "Ping array is empty"), new com.inmobi.media.EnumC2347d6(6, androidx.media3.common.PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION, "PING_UNKNOWN_RESPONSE", "Ping response is unknown"), new com.inmobi.media.EnumC2347d6(7, androidx.media3.common.PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED, "PING_EXCEPTION", "Ping exception occurred")};
        f5154a = enumC2347d6Arr;
        kotlin.enums.EnumEntriesKt.enumEntries(enumC2347d6Arr);
    }

    public EnumC2347d6(int i, int i2, java.lang.String str, java.lang.String str2) {
    }

    public static com.inmobi.media.EnumC2347d6 valueOf(java.lang.String str) {
        return (com.inmobi.media.EnumC2347d6) java.lang.Enum.valueOf(com.inmobi.media.EnumC2347d6.class, str);
    }

    public static com.inmobi.media.EnumC2347d6[] values() {
        return (com.inmobi.media.EnumC2347d6[]) f5154a.clone();
    }
}
