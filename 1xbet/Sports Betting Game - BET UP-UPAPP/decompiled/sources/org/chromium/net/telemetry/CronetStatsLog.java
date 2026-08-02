package org.chromium.net.telemetry;

import android.util.StatsEvent;
import android.util.StatsLog;

/* loaded from: classes4.dex */
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

    public static void write(int code, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8, int arg9, boolean arg10, boolean arg11, boolean arg12, int arg13, String arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, long arg36, int arg37) {
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(code);
        newBuilder.writeLong(arg1);
        newBuilder.writeInt(arg2);
        newBuilder.writeInt(arg3);
        newBuilder.writeInt(arg4);
        newBuilder.writeInt(arg5);
        newBuilder.writeInt(arg6);
        newBuilder.writeBoolean(arg7);
        newBuilder.writeBoolean(arg8);
        newBuilder.writeInt(arg9);
        newBuilder.writeBoolean(arg10);
        newBuilder.writeBoolean(arg11);
        newBuilder.writeBoolean(arg12);
        newBuilder.writeInt(arg13);
        newBuilder.writeString(arg14);
        newBuilder.writeInt(arg15);
        newBuilder.writeInt(arg16);
        newBuilder.writeInt(arg17);
        newBuilder.writeInt(arg18);
        newBuilder.writeInt(arg19);
        newBuilder.writeInt(arg20);
        newBuilder.writeInt(arg21);
        newBuilder.writeInt(arg22);
        newBuilder.writeInt(arg23);
        newBuilder.writeInt(arg24);
        newBuilder.writeInt(arg25);
        newBuilder.writeInt(arg26);
        newBuilder.writeInt(arg27);
        newBuilder.writeInt(arg28);
        newBuilder.writeInt(arg29);
        newBuilder.writeInt(arg30);
        newBuilder.writeInt(arg31);
        newBuilder.writeInt(arg32);
        newBuilder.writeInt(arg33);
        newBuilder.writeInt(arg34);
        newBuilder.writeInt(arg35);
        newBuilder.writeLong(arg36);
        newBuilder.writeInt(arg37);
        if (703 == code) {
            newBuilder.addBooleanAnnotation((byte) 1, true);
        }
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    public static void write(int code, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(code);
        newBuilder.writeLong(arg1);
        newBuilder.writeInt(arg2);
        newBuilder.writeInt(arg3);
        newBuilder.writeInt(arg4);
        newBuilder.writeInt(arg5);
        newBuilder.writeInt(arg6);
        newBuilder.writeInt(arg7);
        newBuilder.writeInt(arg8);
        newBuilder.writeInt(arg9);
        newBuilder.writeInt(arg10);
        newBuilder.writeInt(arg11);
        newBuilder.writeInt(arg12);
        newBuilder.writeInt(arg13);
        newBuilder.writeInt(arg14);
        if (762 == code) {
            newBuilder.addBooleanAnnotation((byte) 1, true);
        }
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    public static void write(int code, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7, int arg8, int arg9, boolean arg10, boolean arg11, int arg12, int arg13, int arg14, long arg15, long arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, String arg27, int arg28, long arg29, long arg30, long arg31, long arg32) {
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(code);
        newBuilder.writeLong(arg1);
        newBuilder.writeInt(arg2);
        newBuilder.writeInt(arg3);
        newBuilder.writeInt(arg4);
        newBuilder.writeInt(arg5);
        newBuilder.writeInt(arg6);
        newBuilder.writeLong(arg7);
        newBuilder.writeInt(arg8);
        newBuilder.writeInt(arg9);
        newBuilder.writeBoolean(arg10);
        newBuilder.writeBoolean(arg11);
        newBuilder.writeInt(arg12);
        newBuilder.writeInt(arg13);
        newBuilder.writeInt(arg14);
        newBuilder.writeLong(arg15);
        newBuilder.writeLong(arg16);
        newBuilder.writeInt(arg17);
        newBuilder.writeInt(arg18);
        newBuilder.writeInt(arg19);
        newBuilder.writeInt(arg20);
        newBuilder.writeInt(arg21);
        if (704 == code) {
            newBuilder.addBooleanAnnotation((byte) 1, true);
        }
        newBuilder.writeInt(arg22);
        newBuilder.writeInt(arg23);
        newBuilder.writeInt(arg24);
        newBuilder.writeInt(arg25);
        newBuilder.writeInt(arg26);
        newBuilder.writeString(arg27);
        newBuilder.writeInt(arg28);
        newBuilder.writeLong(arg29);
        newBuilder.writeLong(arg30);
        newBuilder.writeLong(arg31);
        newBuilder.writeLong(arg32);
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }

    public static void write(int code, long arg1, int arg2, int arg3, int arg4, int arg5, long[] arg6, long[] arg7, String arg8, int arg9, int arg10) {
        StatsEvent.Builder newBuilder = StatsEvent.newBuilder();
        newBuilder.setAtomId(code);
        newBuilder.writeLong(arg1);
        newBuilder.writeInt(arg2);
        newBuilder.writeInt(arg3);
        newBuilder.writeInt(arg4);
        newBuilder.writeInt(arg5);
        if (arg6 == null) {
            arg6 = new long[0];
        }
        newBuilder.writeLongArray(arg6);
        if (arg7 == null) {
            arg7 = new long[0];
        }
        newBuilder.writeLongArray(arg7);
        newBuilder.writeString(arg8);
        newBuilder.writeInt(arg9);
        newBuilder.writeInt(arg10);
        if (764 == code) {
            newBuilder.addBooleanAnnotation((byte) 1, true);
        }
        newBuilder.usePooledBuffer();
        StatsLog.write(newBuilder.build());
    }
}
