package com.onesignal.common;

import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class NetworkUtils {
    public static final NetworkUtils INSTANCE = new NetworkUtils();
    private static int maxNetworkRequestAttemptCount = 3;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResponseStatusType {
        private static final /* synthetic */ InterfaceC1344a $ENTRIES;
        private static final /* synthetic */ ResponseStatusType[] $VALUES;
        public static final ResponseStatusType INVALID = new ResponseStatusType("INVALID", 0);
        public static final ResponseStatusType RETRYABLE = new ResponseStatusType("RETRYABLE", 1);
        public static final ResponseStatusType UNAUTHORIZED = new ResponseStatusType("UNAUTHORIZED", 2);
        public static final ResponseStatusType MISSING = new ResponseStatusType("MISSING", 3);
        public static final ResponseStatusType CONFLICT = new ResponseStatusType("CONFLICT", 4);

        private static final /* synthetic */ ResponseStatusType[] $values() {
            return new ResponseStatusType[]{INVALID, RETRYABLE, UNAUTHORIZED, MISSING, CONFLICT};
        }

        static {
            ResponseStatusType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC1477a.n($values);
        }

        private ResponseStatusType(String str, int i2) {
        }

        public static InterfaceC1344a getEntries() {
            return $ENTRIES;
        }

        public static ResponseStatusType valueOf(String str) {
            return (ResponseStatusType) Enum.valueOf(ResponseStatusType.class, str);
        }

        public static ResponseStatusType[] values() {
            return (ResponseStatusType[]) $VALUES.clone();
        }
    }

    private NetworkUtils() {
    }

    public final int getMaxNetworkRequestAttemptCount() {
        return maxNetworkRequestAttemptCount;
    }

    public final ResponseStatusType getResponseStatusType(int i2) {
        if (i2 == 409) {
            return ResponseStatusType.CONFLICT;
        }
        if (i2 != 410) {
            if (i2 == 429) {
                return ResponseStatusType.RETRYABLE;
            }
            switch (i2) {
                case 400:
                case 402:
                    return ResponseStatusType.INVALID;
                case 401:
                case 403:
                    return ResponseStatusType.UNAUTHORIZED;
                case 404:
                    break;
                default:
                    return ResponseStatusType.RETRYABLE;
            }
        }
        return ResponseStatusType.MISSING;
    }

    public final void setMaxNetworkRequestAttemptCount(int i2) {
        maxNetworkRequestAttemptCount = i2;
    }
}
