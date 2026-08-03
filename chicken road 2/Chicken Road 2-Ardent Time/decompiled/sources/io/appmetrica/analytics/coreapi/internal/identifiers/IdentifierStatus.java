package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public enum IdentifierStatus {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    FORBIDDEN_BY_CLIENT_CONFIG("FORBIDDEN_BY_CLIENT_CONFIG"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN("UNKNOWN");

    public static final io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.Companion Companion = new io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3664a;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus from(java.lang.String str) {
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus identifierStatus;
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus[] values = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    identifierStatus = null;
                    break;
                }
                identifierStatus = values[i2];
                if (kotlin.jvm.internal.i.a(identifierStatus.getValue(), str)) {
                    break;
                }
                i2++;
            }
            return identifierStatus == null ? io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN : identifierStatus;
        }

        private Companion() {
        }
    }

    IdentifierStatus(java.lang.String str) {
        this.f3664a = str;
    }

    public static final io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus from(java.lang.String str) {
        return Companion.from(str);
    }

    public final java.lang.String getValue() {
        return this.f3664a;
    }
}
