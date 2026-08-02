package org.chromium.net.telemetry;

/* loaded from: classes5.dex */
public final class CronetStatsLog {
    public static final byte ANNOTATION_ID_DEFAULT_STATE = 6;
    public static final byte ANNOTATION_ID_EXCLUSIVE_STATE = 4;
    public static final byte ANNOTATION_ID_IS_UID = 1;
    public static final byte ANNOTATION_ID_PRIMARY_FIELD = 3;
    public static final byte ANNOTATION_ID_PRIMARY_FIELD_FIRST_UID = 5;
    public static final byte ANNOTATION_ID_STATE_NESTED = 8;
    public static final byte ANNOTATION_ID_TRIGGER_STATE_RESET = 7;
    public static final byte ANNOTATION_ID_TRUNCATE_TIMESTAMP = 2;
    public static final int CRONET_ENGINE_BUILDER_INITIALIZED = 762;
    public static final int CRONET_ENGINE_BUILDER_INITIALIZED__AUTHOR__AUTHOR_API = 1;
    public static final int CRONET_ENGINE_BUILDER_INITIALIZED__AUTHOR__AUTHOR_IMPL = 2;
    public static final int CRONET_ENGINE_BUILDER_INITIALIZED__AUTHOR__AUTHOR_UNSPECIFIED = 0;
    public static final int CRONET_ENGINE_BUILDER_INITIALIZED__CREATION_SUCCESSFUL__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_ENGINE_BUILDER_INITIALIZED__CREATION_SUCCESSFUL__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_ENGINE_BUILDER_INITIALIZED__CREATION_SUCCESSFUL__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_ENGINE_BUILDER_INITIALIZED__SOURCE__CRONET_SOURCE_EMBEDDED_JAVA = 3;
    public static final int CRONET_ENGINE_BUILDER_INITIALIZED__SOURCE__CRONET_SOURCE_EMBEDDED_NATIVE = 1;
    public static final int CRONET_ENGINE_BUILDER_INITIALIZED__SOURCE__CRONET_SOURCE_GMSCORE_NATIVE = 2;
    public static final int CRONET_ENGINE_BUILDER_INITIALIZED__SOURCE__CRONET_SOURCE_HTTPENGINE_NATIVE = 4;
    public static final int CRONET_ENGINE_BUILDER_INITIALIZED__SOURCE__CRONET_SOURCE_UNSPECIFIED = 0;
    public static final int CRONET_ENGINE_CREATED = 703;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_ASYNCDNS_ENABLE__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_ASYNCDNS_ENABLE__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_ASYNCDNS_ENABLE__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_DISABLE_IPV6_ON_WIFI__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_DISABLE_IPV6_ON_WIFI__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_DISABLE_IPV6_ON_WIFI__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_CLOSE_SESSIONS_ON_IP_CHANGE__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_CLOSE_SESSIONS_ON_IP_CHANGE__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_CLOSE_SESSIONS_ON_IP_CHANGE__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_ENABLE_SOCKET_RECV_OPTIMIZATION__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_ENABLE_SOCKET_RECV_OPTIMIZATION__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_ENABLE_SOCKET_RECV_OPTIMIZATION__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_GOAWAY_SESSIONS_ON_IP_CHANGE__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_GOAWAY_SESSIONS_ON_IP_CHANGE__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_GOAWAY_SESSIONS_ON_IP_CHANGE__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_MIGRATE_SESSIONS_EARLY_V2__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_MIGRATE_SESSIONS_EARLY_V2__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_MIGRATE_SESSIONS_EARLY_V2__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_MIGRATE_SESSIONS_ON_NETWORK_CHANGE_V2__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_MIGRATE_SESSIONS_ON_NETWORK_CHANGE_V2__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_MIGRATE_SESSIONS_ON_NETWORK_CHANGE_V2__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_QUIC_DISABLE_BIDIRECTIONAL_STREAMS__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_QUIC_DISABLE_BIDIRECTIONAL_STREAMS__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_QUIC_DISABLE_BIDIRECTIONAL_STREAMS__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_STORE_SERVER_CONFIGS_IN_PROPERTIES__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_STORE_SERVER_CONFIGS_IN_PROPERTIES__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_QUIC_STORE_SERVER_CONFIGS_IN_PROPERTIES__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_STALEDNS_ALLOW_OTHER_NETWORK__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_STALEDNS_ALLOW_OTHER_NETWORK__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_STALEDNS_ALLOW_OTHER_NETWORK__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_STALEDNS_ENABLE__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_STALEDNS_ENABLE__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_STALEDNS_ENABLE__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_STALEDNS_PERSIST_TO_DISK__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_STALEDNS_PERSIST_TO_DISK__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_STALEDNS_PERSIST_TO_DISK__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_STALEDNS_USE_STALE_ON_NAME_NOT_RESOLVED__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_STALEDNS_USE_STALE_ON_NAME_NOT_RESOLVED__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_ENGINE_CREATED__EXPERIMENTAL_OPTIONS_STALEDNS_USE_STALE_ON_NAME_NOT_RESOLVED__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_ENGINE_CREATED__HTTP_CACHE_MODE__HTTP_CACHE_DISABLED = 1;
    public static final int CRONET_ENGINE_CREATED__HTTP_CACHE_MODE__HTTP_CACHE_DISK = 2;
    public static final int CRONET_ENGINE_CREATED__HTTP_CACHE_MODE__HTTP_CACHE_DISK_NO_HTTP = 3;
    public static final int CRONET_ENGINE_CREATED__HTTP_CACHE_MODE__HTTP_CACHE_IN_MEMORY = 4;
    public static final int CRONET_ENGINE_CREATED__HTTP_CACHE_MODE__HTTP_CACHE_MODE_UNSPECIFIED = 0;
    public static final int CRONET_ENGINE_CREATED__SOURCE__CRONET_SOURCE_FALLBACK = 3;
    public static final int CRONET_ENGINE_CREATED__SOURCE__CRONET_SOURCE_GMSCORE_DYNAMITE = 2;
    public static final int CRONET_ENGINE_CREATED__SOURCE__CRONET_SOURCE_PLATFORM = 4;
    public static final int CRONET_ENGINE_CREATED__SOURCE__CRONET_SOURCE_STATICALLY_LINKED = 1;
    public static final int CRONET_ENGINE_CREATED__SOURCE__CRONET_SOURCE_UNSPECIFIED = 0;
    public static final int CRONET_INITIALIZED = 764;
    public static final int CRONET_INITIALIZED__HTTP_FLAGS_SUCCESSFUL__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_INITIALIZED__HTTP_FLAGS_SUCCESSFUL__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_INITIALIZED__HTTP_FLAGS_SUCCESSFUL__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_INITIALIZED__SOURCE__CRONET_SOURCE_EMBEDDED_JAVA = 3;
    public static final int CRONET_INITIALIZED__SOURCE__CRONET_SOURCE_EMBEDDED_NATIVE = 1;
    public static final int CRONET_INITIALIZED__SOURCE__CRONET_SOURCE_GMSCORE_NATIVE = 2;
    public static final int CRONET_INITIALIZED__SOURCE__CRONET_SOURCE_HTTPENGINE_NATIVE = 4;
    public static final int CRONET_INITIALIZED__SOURCE__CRONET_SOURCE_UNSPECIFIED = 0;
    public static final int CRONET_TRAFFIC_REPORTED = 704;
    public static final int CRONET_TRAFFIC_REPORTED__FAILURE_REASON__FAILURE_REASON_NETWORK = 1;
    public static final int CRONET_TRAFFIC_REPORTED__FAILURE_REASON__FAILURE_REASON_OTHER = 100;
    public static final int CRONET_TRAFFIC_REPORTED__FAILURE_REASON__FAILURE_REASON_UNKNOWN = 0;
    public static final int CRONET_TRAFFIC_REPORTED__FINAL_USER_CALLBACK_THREW__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_TRAFFIC_REPORTED__FINAL_USER_CALLBACK_THREW__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_TRAFFIC_REPORTED__FINAL_USER_CALLBACK_THREW__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_TRAFFIC_REPORTED__IS_BIDI_STREAM__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_TRAFFIC_REPORTED__IS_BIDI_STREAM__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_TRAFFIC_REPORTED__IS_BIDI_STREAM__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_TRAFFIC_REPORTED__IS_SOCKET_REUSED__OPTIONAL_BOOLEAN_FALSE = 2;
    public static final int CRONET_TRAFFIC_REPORTED__IS_SOCKET_REUSED__OPTIONAL_BOOLEAN_TRUE = 1;
    public static final int CRONET_TRAFFIC_REPORTED__IS_SOCKET_REUSED__OPTIONAL_BOOLEAN_UNSET = 0;
    public static final int CRONET_TRAFFIC_REPORTED__QUIC_CONNECTION_CLOSE_SOURCE__CONNECTION_CLOSE_PEER = 2;
    public static final int CRONET_TRAFFIC_REPORTED__QUIC_CONNECTION_CLOSE_SOURCE__CONNECTION_CLOSE_SELF = 1;
    public static final int CRONET_TRAFFIC_REPORTED__QUIC_CONNECTION_CLOSE_SOURCE__CONNECTION_CLOSE_UNKNOWN = 0;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_BODY_SIZE__REQUEST_BODY_SIZE_BUCKET_FIFTY_TO_TWO_HUNDRED_KIB = 4;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_BODY_SIZE__REQUEST_BODY_SIZE_BUCKET_FIVE_HUNDRED_KIB_TO_ONE_MIB = 6;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_BODY_SIZE__REQUEST_BODY_SIZE_BUCKET_ONE_TO_FIVE_MIB = 7;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_BODY_SIZE__REQUEST_BODY_SIZE_BUCKET_OVER_FIVE_MIB = 8;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_BODY_SIZE__REQUEST_BODY_SIZE_BUCKET_TEN_TO_FIFTY_KIB = 3;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_BODY_SIZE__REQUEST_BODY_SIZE_BUCKET_TWO_HUNDRED_TO_FIVE_HUNDRED_KIB = 5;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_BODY_SIZE__REQUEST_BODY_SIZE_BUCKET_UNDER_TEN_KIB = 2;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_BODY_SIZE__REQUEST_BODY_SIZE_BUCKET_UNSPECIFIED = 0;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_BODY_SIZE__REQUEST_BODY_SIZE_BUCKET_ZERO = 1;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_HEADERS_SIZE__REQUEST_HEADERS_SIZE_BUCKET_FIFTY_TO_HUNDRED_KIB = 5;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_HEADERS_SIZE__REQUEST_HEADERS_SIZE_BUCKET_ONE_TO_TEN_KIB = 2;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_HEADERS_SIZE__REQUEST_HEADERS_SIZE_BUCKET_OVER_HUNDRED_KIB = 6;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_HEADERS_SIZE__REQUEST_HEADERS_SIZE_BUCKET_TEN_TO_TWENTY_FIVE_KIB = 3;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_HEADERS_SIZE__REQUEST_HEADERS_SIZE_BUCKET_TWENTY_FIVE_TO_FIFTY_KIB = 4;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_HEADERS_SIZE__REQUEST_HEADERS_SIZE_BUCKET_UNDER_ONE_KIB = 1;
    public static final int CRONET_TRAFFIC_REPORTED__REQUEST_HEADERS_SIZE__REQUEST_HEADERS_SIZE_BUCKET_UNSPECIFIED = 0;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_BODY_SIZE__RESPONSE_BODY_SIZE_BUCKET_FIFTY_TO_TWO_HUNDRED_KIB = 4;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_BODY_SIZE__RESPONSE_BODY_SIZE_BUCKET_FIVE_HUNDRED_KIB_TO_ONE_MIB = 6;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_BODY_SIZE__RESPONSE_BODY_SIZE_BUCKET_ONE_TO_FIVE_MIB = 7;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_BODY_SIZE__RESPONSE_BODY_SIZE_BUCKET_OVER_FIVE_MIB = 8;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_BODY_SIZE__RESPONSE_BODY_SIZE_BUCKET_TEN_TO_FIFTY_KIB = 3;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_BODY_SIZE__RESPONSE_BODY_SIZE_BUCKET_TWO_HUNDRED_TO_FIVE_HUNDRED_KIB = 5;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_BODY_SIZE__RESPONSE_BODY_SIZE_BUCKET_UNDER_TEN_KIB = 2;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_BODY_SIZE__RESPONSE_BODY_SIZE_BUCKET_UNSPECIFIED = 0;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_BODY_SIZE__RESPONSE_BODY_SIZE_BUCKET_ZERO = 1;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_HEADERS_SIZE__RESPONSE_HEADERS_SIZE_BUCKET_FIFTY_TO_HUNDRED_KIB = 5;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_HEADERS_SIZE__RESPONSE_HEADERS_SIZE_BUCKET_ONE_TO_TEN_KIB = 2;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_HEADERS_SIZE__RESPONSE_HEADERS_SIZE_BUCKET_OVER_HUNDRED_KIB = 6;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_HEADERS_SIZE__RESPONSE_HEADERS_SIZE_BUCKET_TEN_TO_TWENTY_FIVE_KIB = 3;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_HEADERS_SIZE__RESPONSE_HEADERS_SIZE_BUCKET_TWENTY_FIVE_TO_FIFTY_KIB = 4;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_HEADERS_SIZE__RESPONSE_HEADERS_SIZE_BUCKET_UNDER_ONE_KIB = 1;
    public static final int CRONET_TRAFFIC_REPORTED__RESPONSE_HEADERS_SIZE__RESPONSE_HEADERS_SIZE_BUCKET_UNSPECIFIED = 0;
    public static final int CRONET_TRAFFIC_REPORTED__SOURCE__CRONET_SOURCE_EMBEDDED_JAVA = 3;
    public static final int CRONET_TRAFFIC_REPORTED__SOURCE__CRONET_SOURCE_EMBEDDED_NATIVE = 1;
    public static final int CRONET_TRAFFIC_REPORTED__SOURCE__CRONET_SOURCE_GMSCORE_NATIVE = 2;
    public static final int CRONET_TRAFFIC_REPORTED__SOURCE__CRONET_SOURCE_HTTPENGINE_NATIVE = 4;
    public static final int CRONET_TRAFFIC_REPORTED__SOURCE__CRONET_SOURCE_UNSPECIFIED = 0;
    public static final int CRONET_TRAFFIC_REPORTED__TERMINAL_STATE__STATE_CANCELLED = 3;
    public static final int CRONET_TRAFFIC_REPORTED__TERMINAL_STATE__STATE_ERROR = 2;
    public static final int CRONET_TRAFFIC_REPORTED__TERMINAL_STATE__STATE_SUCCEEDED = 1;
    public static final int CRONET_TRAFFIC_REPORTED__TERMINAL_STATE__STATE_UNKNOWN = 0;

    public static void write(int i, long j, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, int i7, boolean z3, boolean z4, boolean z5, int i8, java.lang.String str, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, long j2, int i30) {
        android.util.StatsEvent.Builder newBuilder = android.util.StatsEvent.newBuilder();
        newBuilder.setAtomId(i);
        newBuilder.writeLong(j);
        newBuilder.writeInt(i2);
        newBuilder.writeInt(i3);
        newBuilder.writeInt(i4);
        newBuilder.writeInt(i5);
        newBuilder.writeInt(i6);
        newBuilder.writeBoolean(z);
        newBuilder.writeBoolean(z2);
        newBuilder.writeInt(i7);
        newBuilder.writeBoolean(z3);
        newBuilder.writeBoolean(z4);
        newBuilder.writeBoolean(z5);
        newBuilder.writeInt(i8);
        newBuilder.writeString(str);
        newBuilder.writeInt(i9);
        newBuilder.writeInt(i10);
        newBuilder.writeInt(i11);
        newBuilder.writeInt(i12);
        newBuilder.writeInt(i13);
        newBuilder.writeInt(i14);
        newBuilder.writeInt(i15);
        newBuilder.writeInt(i16);
        newBuilder.writeInt(i17);
        newBuilder.writeInt(i18);
        newBuilder.writeInt(i19);
        newBuilder.writeInt(i20);
        newBuilder.writeInt(i21);
        newBuilder.writeInt(i22);
        newBuilder.writeInt(i23);
        newBuilder.writeInt(i24);
        newBuilder.writeInt(i25);
        newBuilder.writeInt(i26);
        newBuilder.writeInt(i27);
        newBuilder.writeInt(i28);
        newBuilder.writeInt(i29);
        newBuilder.writeLong(j2);
        newBuilder.writeInt(i30);
        if (703 == i) {
            newBuilder.addBooleanAnnotation((byte) 1, true);
        }
        newBuilder.usePooledBuffer();
        android.util.StatsLog.write(newBuilder.build());
    }

    public static void write(int i, long j, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        android.util.StatsEvent.Builder newBuilder = android.util.StatsEvent.newBuilder();
        newBuilder.setAtomId(i);
        newBuilder.writeLong(j);
        newBuilder.writeInt(i2);
        newBuilder.writeInt(i3);
        newBuilder.writeInt(i4);
        newBuilder.writeInt(i5);
        newBuilder.writeInt(i6);
        newBuilder.writeInt(i7);
        newBuilder.writeInt(i8);
        newBuilder.writeInt(i9);
        newBuilder.writeInt(i10);
        newBuilder.writeInt(i11);
        newBuilder.writeInt(i12);
        newBuilder.writeInt(i13);
        newBuilder.writeInt(i14);
        if (762 == i) {
            newBuilder.addBooleanAnnotation((byte) 1, true);
        }
        newBuilder.usePooledBuffer();
        android.util.StatsLog.write(newBuilder.build());
    }

    public static void write(int i, long j, int i2, int i3, int i4, int i5, int i6, long j2, int i7, int i8, boolean z, boolean z2, int i9, int i10, int i11, long j3, long j4, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, java.lang.String str, int i22, long j5, long j6, long j7, long j8) {
        android.util.StatsEvent.Builder newBuilder = android.util.StatsEvent.newBuilder();
        newBuilder.setAtomId(i);
        newBuilder.writeLong(j);
        newBuilder.writeInt(i2);
        newBuilder.writeInt(i3);
        newBuilder.writeInt(i4);
        newBuilder.writeInt(i5);
        newBuilder.writeInt(i6);
        newBuilder.writeLong(j2);
        newBuilder.writeInt(i7);
        newBuilder.writeInt(i8);
        newBuilder.writeBoolean(z);
        newBuilder.writeBoolean(z2);
        newBuilder.writeInt(i9);
        newBuilder.writeInt(i10);
        newBuilder.writeInt(i11);
        newBuilder.writeLong(j3);
        newBuilder.writeLong(j4);
        newBuilder.writeInt(i12);
        newBuilder.writeInt(i13);
        newBuilder.writeInt(i14);
        newBuilder.writeInt(i15);
        newBuilder.writeInt(i16);
        if (704 == i) {
            newBuilder.addBooleanAnnotation((byte) 1, true);
        }
        newBuilder.writeInt(i17);
        newBuilder.writeInt(i18);
        newBuilder.writeInt(i19);
        newBuilder.writeInt(i20);
        newBuilder.writeInt(i21);
        newBuilder.writeString(str);
        newBuilder.writeInt(i22);
        newBuilder.writeLong(j5);
        newBuilder.writeLong(j6);
        newBuilder.writeLong(j7);
        newBuilder.writeLong(j8);
        newBuilder.usePooledBuffer();
        android.util.StatsLog.write(newBuilder.build());
    }

    public static void write(int i, long j, int i2, int i3, int i4, int i5, long[] jArr, long[] jArr2, java.lang.String str, int i6, int i7) {
        android.util.StatsEvent.Builder newBuilder = android.util.StatsEvent.newBuilder();
        newBuilder.setAtomId(i);
        newBuilder.writeLong(j);
        newBuilder.writeInt(i2);
        newBuilder.writeInt(i3);
        newBuilder.writeInt(i4);
        newBuilder.writeInt(i5);
        if (jArr == null) {
            jArr = new long[0];
        }
        newBuilder.writeLongArray(jArr);
        if (jArr2 == null) {
            jArr2 = new long[0];
        }
        newBuilder.writeLongArray(jArr2);
        newBuilder.writeString(str);
        newBuilder.writeInt(i6);
        newBuilder.writeInt(i7);
        if (764 == i) {
            newBuilder.addBooleanAnnotation((byte) 1, true);
        }
        newBuilder.usePooledBuffer();
        android.util.StatsLog.write(newBuilder.build());
    }
}
