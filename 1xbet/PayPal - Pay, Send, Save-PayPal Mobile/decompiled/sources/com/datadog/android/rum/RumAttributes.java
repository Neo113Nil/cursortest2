package com.datadog.android.rum;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b3\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0006R\u0014\u00106\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0006R\u0014\u00107\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0006"}, d2 = {"Lcom/datadog/android/rum/RumAttributes;", "", "<init>", "()V", "", "ACTION_GESTURE_DIRECTION", "Ljava/lang/String;", "ACTION_GESTURE_FROM_STATE", "ACTION_GESTURE_TO_STATE", "ACTION_TARGET_CLASS_NAME", "ACTION_TARGET_PARENT_CLASSNAME", "ACTION_TARGET_PARENT_INDEX", "ACTION_TARGET_PARENT_RESOURCE_ID", "ACTION_TARGET_RESOURCE_ID", "ACTION_TARGET_ROLE", "ACTION_TARGET_SELECTED", "ACTION_TARGET_TITLE", "APPLICATION_VERSION", "CUSTOM_INV_VALUE", "ENV", "ERROR_DATABASE_PATH", "ERROR_DATABASE_VERSION", "ERROR_FINGERPRINT", "ERROR_RESOURCE_METHOD", "ERROR_RESOURCE_STATUS_CODE", "ERROR_RESOURCE_URL", "FLUTTER_FIRST_BUILD_COMPLETE", "GRAPHQL_ERRORS", "GRAPHQL_OPERATION_NAME", "GRAPHQL_OPERATION_TYPE", "GRAPHQL_PAYLOAD", "GRAPHQL_VARIABLES", "INTERNAL_ALL_THREADS", "INTERNAL_ERROR_IS_CRASH", "INTERNAL_ERROR_SOURCE_TYPE", "INTERNAL_ERROR_TYPE", "INTERNAL_INSTRUMENTATION_TYPE", "INTERNAL_TIMESTAMP", "LONG_TASK_TARGET", "NETWORK_BYTES_READ", "NETWORK_CARRIER_ID", "NETWORK_CARRIER_NAME", "NETWORK_CONNECTIVITY", "NETWORK_DOWN_KBPS", "NETWORK_SIGNAL_STRENGTH", "NETWORK_UP_KBPS", "REQUEST_HEADERS", "RESOURCE_TIMINGS", "RESPONSE_HEADERS", "RULE_PSR", "SDK_VERSION", "SERVICE_NAME", "SOURCE", "SPAN_ID", "TRACE_ID", "VARIANT"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RumAttributes {
    public static final java.lang.String ACTION_GESTURE_DIRECTION = "action.gesture.direction";
    public static final java.lang.String ACTION_GESTURE_FROM_STATE = "action.gesture.from_state";
    public static final java.lang.String ACTION_GESTURE_TO_STATE = "action.gesture.to_state";
    public static final java.lang.String ACTION_TARGET_CLASS_NAME = "action.target.classname";
    public static final java.lang.String ACTION_TARGET_PARENT_CLASSNAME = "action.target.parent.classname";
    public static final java.lang.String ACTION_TARGET_PARENT_INDEX = "action.target.parent.index";
    public static final java.lang.String ACTION_TARGET_PARENT_RESOURCE_ID = "action.target.parent.resource_id";
    public static final java.lang.String ACTION_TARGET_RESOURCE_ID = "action.target.resource_id";
    public static final java.lang.String ACTION_TARGET_ROLE = "action.target.role";
    public static final java.lang.String ACTION_TARGET_SELECTED = "action.target.selected";
    public static final java.lang.String ACTION_TARGET_TITLE = "action.target.title";
    public static final java.lang.String APPLICATION_VERSION = "version";
    public static final java.lang.String CUSTOM_INV_VALUE = "_dd.view.custom_inv_value";
    public static final java.lang.String ENV = "env";
    public static final java.lang.String ERROR_DATABASE_PATH = "error.database.path";
    public static final java.lang.String ERROR_DATABASE_VERSION = "error.database.version";
    public static final java.lang.String ERROR_FINGERPRINT = "_dd.error.fingerprint";
    public static final java.lang.String ERROR_RESOURCE_METHOD = "error.resource.method";
    public static final java.lang.String ERROR_RESOURCE_STATUS_CODE = "error.resource.status_code";
    public static final java.lang.String ERROR_RESOURCE_URL = "error.resource.url";
    public static final java.lang.String FLUTTER_FIRST_BUILD_COMPLETE = "_dd.performance.first_build_complete";
    public static final java.lang.String GRAPHQL_ERRORS = "_dd.graphql.errors";
    public static final java.lang.String GRAPHQL_OPERATION_NAME = "_dd.graphql.operation_name";
    public static final java.lang.String GRAPHQL_OPERATION_TYPE = "_dd.graphql.operation_type";
    public static final java.lang.String GRAPHQL_PAYLOAD = "_dd.graphql.payload";
    public static final java.lang.String GRAPHQL_VARIABLES = "_dd.graphql.variables";
    public static final com.datadog.android.rum.RumAttributes INSTANCE = new com.datadog.android.rum.RumAttributes();
    public static final java.lang.String INTERNAL_ALL_THREADS = "_dd.error.threads";
    public static final java.lang.String INTERNAL_ERROR_IS_CRASH = "_dd.error.is_crash";
    public static final java.lang.String INTERNAL_ERROR_SOURCE_TYPE = "_dd.error.source_type";
    public static final java.lang.String INTERNAL_ERROR_TYPE = "_dd.error_type";
    public static final java.lang.String INTERNAL_INSTRUMENTATION_TYPE = "_dd.instrumentation_type";
    public static final java.lang.String INTERNAL_TIMESTAMP = "_dd.timestamp";
    public static final java.lang.String LONG_TASK_TARGET = "long_task.target";
    public static final java.lang.String NETWORK_BYTES_READ = "network.bytes_read";
    public static final java.lang.String NETWORK_CARRIER_ID = "network.client.sim_carrier.id";
    public static final java.lang.String NETWORK_CARRIER_NAME = "network.client.sim_carrier.name";
    public static final java.lang.String NETWORK_CONNECTIVITY = "network.client.connectivity";
    public static final java.lang.String NETWORK_DOWN_KBPS = "network.client.downlink_kbps";
    public static final java.lang.String NETWORK_SIGNAL_STRENGTH = "network.client.signal_strength";
    public static final java.lang.String NETWORK_UP_KBPS = "network.client.uplink_kbps";
    public static final java.lang.String REQUEST_HEADERS = "_dd.request_headers";
    public static final java.lang.String RESOURCE_TIMINGS = "_dd.resource_timings";
    public static final java.lang.String RESPONSE_HEADERS = "_dd.response_headers";
    public static final java.lang.String RULE_PSR = "_dd.rule_psr";
    public static final java.lang.String SDK_VERSION = "sdk_version";
    public static final java.lang.String SERVICE_NAME = "service";
    public static final java.lang.String SOURCE = "source";
    public static final java.lang.String SPAN_ID = "_dd.span_id";
    public static final java.lang.String TRACE_ID = "_dd.trace_id";
    public static final java.lang.String VARIANT = "variant";

    private RumAttributes() {
    }
}
