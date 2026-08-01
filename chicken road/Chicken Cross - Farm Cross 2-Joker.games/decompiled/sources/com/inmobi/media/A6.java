package com.inmobi.media;

import androidx.media3.common.PlaybackException;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class A6 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ A6[] f6449a;

    static {
        A6[] a6Arr = {new A6(0, -100, "PING_V2_DISABLED", "Ping V2 is disabled from SDK config"), new A6(1, -101, "PING_ID_MISSING", "Ping ID is missing"), new A6(2, PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED, "PING_URL_INVALID", "Ping url is invalid"), new A6(3, PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED, "PING_URL_MISSING", "Ping URL is missing"), new A6(4, PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT, "PING_JSON_INVALID", "Ping JSON is invalid"), new A6(5, PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED, "PING_ARRAY_EMPTY", "Ping array is empty"), new A6(6, PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION, "PING_UNKNOWN_RESPONSE", "Ping response is unknown"), new A6(7, PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED, "PING_EXCEPTION", "Ping exception occurred"), new A6(8, PlaybackException.ERROR_CODE_SETUP_REQUIRED, "PING_EXPIRED", "Ping has expired")};
        f6449a = a6Arr;
        EnumEntriesKt.enumEntries(a6Arr);
    }

    public A6(int i, int i2, String str, String str2) {
    }

    public static A6 valueOf(String str) {
        return (A6) Enum.valueOf(A6.class, str);
    }

    public static A6[] values() {
        return (A6[]) f6449a.clone();
    }
}
