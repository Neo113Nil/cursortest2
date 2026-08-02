package com.datadog.android.log;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b7\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b5\u0010\u0006R\u0014\u00106\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b6\u0010\u0006R\u0014\u00107\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b7\u0010\u0006R\u0014\u00108\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b8\u0010\u0006R\u0014\u00109\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b9\u0010\u0006R\u0014\u0010:\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b:\u0010\u0006R\u0014\u0010;\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b;\u0010\u0006"}, d2 = {"Lcom/datadog/android/log/LogAttributes;", "", "<init>", "()V", "", "ACCOUNT_ATTRIBUTES_GROUP", "Ljava/lang/String;", "ACCOUNT_ID", "ACCOUNT_NAME", "APPLICATION_PACKAGE", "APPLICATION_VERSION", "DATE", "DB_INSTANCE", "DB_OPERATION", "DB_STATEMENT", "DB_USER", "DD_SPAN_ID", "DD_TRACE_ID", "DURATION", "ENV", "ERROR_FINGERPRINT", "ERROR_KIND", "ERROR_MESSAGE", "ERROR_SOURCE_TYPE", "ERROR_STACK", "HOST", "HTTP_METHOD", "HTTP_REFERRER", "HTTP_REQUEST_ID", "HTTP_STATUS_CODE", "HTTP_URL", "HTTP_USERAGENT", "HTTP_VERSION", "LOGGER_METHOD_NAME", "LOGGER_NAME", "LOGGER_THREAD_NAME", "LOGGER_VERSION", com.google.android.gms.auth.api.phone.IncomingCallRetriever.ACTIVITY_RESULT_INTENT_EXTRA_MESSAGE, "NETWORK_CARRIER_ID", "NETWORK_CARRIER_NAME", "NETWORK_CLIENT_IP", "NETWORK_CLIENT_PORT", "NETWORK_CONNECTIVITY", "NETWORK_DOWN_KBPS", "NETWORK_SIGNAL_STRENGTH", "NETWORK_UP_KBPS", "RUM_ACTION_ID", "RUM_APPLICATION_ID", "RUM_SESSION_ID", "RUM_VIEW_ID", "SERVICE", "SERVICE_NAME", "SOURCE", "SOURCE_TYPE", "STATUS", "USR_ATTRIBUTES_GROUP", "USR_EMAIL", "USR_ID", "USR_NAME", "VARIANT"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogAttributes {
    public static final java.lang.String ACCOUNT_ATTRIBUTES_GROUP = "account";
    public static final java.lang.String ACCOUNT_ID = "account.id";
    public static final java.lang.String ACCOUNT_NAME = "account.name";
    public static final java.lang.String APPLICATION_PACKAGE = "application.package";
    public static final java.lang.String APPLICATION_VERSION = "version";
    public static final java.lang.String DATE = "date";
    public static final java.lang.String DB_INSTANCE = "db.instance";
    public static final java.lang.String DB_OPERATION = "db.operation";
    public static final java.lang.String DB_STATEMENT = "db.statement";
    public static final java.lang.String DB_USER = "db.user";
    public static final java.lang.String DD_SPAN_ID = "dd.span_id";
    public static final java.lang.String DD_TRACE_ID = "dd.trace_id";
    public static final java.lang.String DURATION = "duration";
    public static final java.lang.String ENV = "env";
    public static final java.lang.String ERROR_FINGERPRINT = "_dd.error.fingerprint";
    public static final java.lang.String ERROR_KIND = "error.kind";
    public static final java.lang.String ERROR_MESSAGE = "error.message";
    public static final java.lang.String ERROR_SOURCE_TYPE = "error.source_type";
    public static final java.lang.String ERROR_STACK = "error.stack";
    public static final java.lang.String HOST = "host";
    public static final java.lang.String HTTP_METHOD = "http.method";
    public static final java.lang.String HTTP_REFERRER = "http.referrer";
    public static final java.lang.String HTTP_REQUEST_ID = "http.request_id";
    public static final java.lang.String HTTP_STATUS_CODE = "http.status_code";
    public static final java.lang.String HTTP_URL = "http.url";
    public static final java.lang.String HTTP_USERAGENT = "http.useragent";
    public static final java.lang.String HTTP_VERSION = "http.version";
    public static final com.datadog.android.log.LogAttributes INSTANCE = new com.datadog.android.log.LogAttributes();
    public static final java.lang.String LOGGER_METHOD_NAME = "logger.method_name";
    public static final java.lang.String LOGGER_NAME = "logger.name";
    public static final java.lang.String LOGGER_THREAD_NAME = "logger.thread_name";
    public static final java.lang.String LOGGER_VERSION = "logger.version";
    public static final java.lang.String MESSAGE = "message";
    public static final java.lang.String NETWORK_CARRIER_ID = "network.client.sim_carrier.id";
    public static final java.lang.String NETWORK_CARRIER_NAME = "network.client.sim_carrier.name";
    public static final java.lang.String NETWORK_CLIENT_IP = "network.client.ip";
    public static final java.lang.String NETWORK_CLIENT_PORT = "network.client.port";
    public static final java.lang.String NETWORK_CONNECTIVITY = "network.client.connectivity";
    public static final java.lang.String NETWORK_DOWN_KBPS = "network.client.downlink_kbps";
    public static final java.lang.String NETWORK_SIGNAL_STRENGTH = "network.client.signal_strength";
    public static final java.lang.String NETWORK_UP_KBPS = "network.client.uplink_kbps";
    public static final java.lang.String RUM_ACTION_ID = "user_action.id";
    public static final java.lang.String RUM_APPLICATION_ID = "application_id";
    public static final java.lang.String RUM_SESSION_ID = "session_id";
    public static final java.lang.String RUM_VIEW_ID = "view.id";
    public static final java.lang.String SERVICE = "service";
    public static final java.lang.String SERVICE_NAME = "service";
    public static final java.lang.String SOURCE = "source";
    public static final java.lang.String SOURCE_TYPE = "_dd.error.source_type";
    public static final java.lang.String STATUS = "status";
    public static final java.lang.String USR_ATTRIBUTES_GROUP = "usr";
    public static final java.lang.String USR_EMAIL = "usr.email";
    public static final java.lang.String USR_ID = "usr.id";
    public static final java.lang.String USR_NAME = "usr.name";
    public static final java.lang.String VARIANT = "variant";

    private LogAttributes() {
    }
}
