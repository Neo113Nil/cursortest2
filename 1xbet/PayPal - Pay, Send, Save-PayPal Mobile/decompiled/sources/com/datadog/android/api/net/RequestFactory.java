package com.datadog.android.api.net;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ9\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/datadog/android/api/net/RequestFactory;", "", "Lcom/datadog/android/api/context/DatadogContext;", "context", "Lcom/datadog/android/api/net/RequestExecutionContext;", "executionContext", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batchData", "", "batchMetadata", "Lcom/datadog/android/api/net/Request;", "create", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/net/RequestExecutionContext;Ljava/util/List;[B)Lcom/datadog/android/api/net/Request;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RequestFactory {
    public static final java.lang.String CONTENT_TYPE_JSON = "application/json";
    public static final java.lang.String CONTENT_TYPE_TEXT_UTF8 = "text/plain;charset=UTF-8";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.api.net.RequestFactory.Companion INSTANCE = com.datadog.android.api.net.RequestFactory.Companion.Camera2StreamConfigurationMap;
    public static final java.lang.String DD_IDEMPOTENCY_KEY = "DD-IDEMPOTENCY-KEY";
    public static final java.lang.String HEADER_API_KEY = "DD-API-KEY";
    public static final java.lang.String HEADER_EVP_ORIGIN = "DD-EVP-ORIGIN";
    public static final java.lang.String HEADER_EVP_ORIGIN_VERSION = "DD-EVP-ORIGIN-VERSION";
    public static final java.lang.String HEADER_REQUEST_ID = "DD-REQUEST-ID";
    public static final java.lang.String QUERY_PARAM_SOURCE = "ddsource";
    public static final java.lang.String QUERY_PARAM_TAGS = "ddtags";

    com.datadog.android.api.net.Request create(com.datadog.android.api.context.DatadogContext context, com.datadog.android.api.net.RequestExecutionContext executionContext, java.util.List<com.datadog.android.api.storage.RawBatchEvent> batchData, byte[] batchMetadata);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006"}, d2 = {"Lcom/datadog/android/api/net/RequestFactory$Companion;", "", "<init>", "()V", "", "CONTENT_TYPE_JSON", "Ljava/lang/String;", "CONTENT_TYPE_TEXT_UTF8", "DD_IDEMPOTENCY_KEY", "HEADER_API_KEY", "HEADER_EVP_ORIGIN", "HEADER_EVP_ORIGIN_VERSION", "HEADER_REQUEST_ID", "QUERY_PARAM_SOURCE", "QUERY_PARAM_TAGS"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String CONTENT_TYPE_JSON = "application/json";
        public static final java.lang.String CONTENT_TYPE_TEXT_UTF8 = "text/plain;charset=UTF-8";
        static final /* synthetic */ com.datadog.android.api.net.RequestFactory.Companion Camera2StreamConfigurationMap = new com.datadog.android.api.net.RequestFactory.Companion();
        public static final java.lang.String DD_IDEMPOTENCY_KEY = "DD-IDEMPOTENCY-KEY";
        public static final java.lang.String HEADER_API_KEY = "DD-API-KEY";
        public static final java.lang.String HEADER_EVP_ORIGIN = "DD-EVP-ORIGIN";
        public static final java.lang.String HEADER_EVP_ORIGIN_VERSION = "DD-EVP-ORIGIN-VERSION";
        public static final java.lang.String HEADER_REQUEST_ID = "DD-REQUEST-ID";
        public static final java.lang.String QUERY_PARAM_SOURCE = "ddsource";
        public static final java.lang.String QUERY_PARAM_TAGS = "ddtags";

        private Companion() {
        }
    }
}
