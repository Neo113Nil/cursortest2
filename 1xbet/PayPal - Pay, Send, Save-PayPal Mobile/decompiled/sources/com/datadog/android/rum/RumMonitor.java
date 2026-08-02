package com.datadog.android.rum;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H&¢\u0006\u0004\b\u001c\u0010\u0011J#\u0010\u001e\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\tH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\u000b2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH&¢\u0006\u0004\b'\u0010(JC\u0010,\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\u0006\u0010+\u001a\u00020*2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\b.\u0010/J%\u00102\u001a\u00020\u000b2\u0014\u00101\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000b00H&¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H&¢\u0006\u0004\b4\u0010!J\u001d\u00106\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000705H&¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000bH&¢\u0006\u0004\b8\u0010(J7\u00109\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\b9\u0010\rJ;\u0010:\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\b:\u0010;J?\u0010?\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\b?\u0010@J7\u0010A\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\bA\u0010BJ7\u0010C\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\bC\u0010\rJK\u0010J\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010E\u001a\u0004\u0018\u00010D2\b\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010I\u001a\u00020H2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\bJ\u0010KJ[\u0010N\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010L\u001a\u00020\u00072\b\u0010M\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\bN\u0010OJQ\u0010N\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\bN\u0010PJ\u000f\u0010Q\u001a\u00020\u000bH&¢\u0006\u0004\bQ\u0010(J/\u0010R\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\bR\u0010SJ;\u0010T\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH&¢\u0006\u0004\bT\u0010;R\u001c\u0010X\u001a\u00020#8'@'X¦\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010&"}, d2 = {"Lcom/datadog/android/rum/RumMonitor;", "", "Lcom/datadog/android/rum/_RumInternalProxy;", "_getInternal", "()Lcom/datadog/android/rum/_RumInternalProxy;", "Lcom/datadog/android/rum/RumActionType;", "type", "", "name", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "addAction", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;)V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "addError", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stacktrace", "addErrorWithStacktrace", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/util/Map;)V", "addFeatureFlagEvaluation", "featureFlags", "addFeatureFlagEvaluations", "(Ljava/util/Map;)V", "addTiming", "(Ljava/lang/String;)V", "addViewAttributes", "", "overwrite", "addViewLoadingTime", "(Z)V", "clearAttributes", "()V", "operationKey", "Lcom/datadog/android/rum/featureoperations/FailureReason;", "failureReason", "failFeatureOperation", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/featureoperations/FailureReason;Ljava/util/Map;)V", "getAttributes", "()Ljava/util/Map;", "Lkotlin/Function1;", com.sun.jna.Callback.METHOD_NAME, "getCurrentSessionId", "(Lkotlin/jvm/functions/Function1;)V", "removeAttribute", "", "removeViewAttributes", "(Ljava/util/Collection;)V", "reportAppFullyDisplayed", "startAction", "startFeatureOperation", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/datadog/android/rum/RumResourceMethod;", "method", "url", "startResource", "(Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/String;Ljava/util/Map;)V", "startView", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", "stopAction", "", "statusCode", "", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/datadog/android/rum/RumResourceKind;", "kind", "stopResource", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;)V", "stackTrace", "errorType", "stopResourceWithError", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stopSession", "stopView", "(Ljava/lang/Object;Ljava/util/Map;)V", "succeedFeatureOperation", "getDebug", "()Z", "setDebug", com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RumMonitor {
    /* synthetic */ com.datadog.android.rum._RumInternalProxy _getInternal();

    void addAction(com.datadog.android.rum.RumActionType type, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void addAttribute(java.lang.String key, java.lang.Object value);

    void addError(java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.Throwable throwable, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void addErrorWithStacktrace(java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.String stacktrace, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void addFeatureFlagEvaluation(java.lang.String name2, java.lang.Object value);

    void addFeatureFlagEvaluations(java.util.Map<java.lang.String, ? extends java.lang.Object> featureFlags);

    void addTiming(java.lang.String name2);

    void addViewAttributes(java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void addViewLoadingTime(boolean overwrite);

    void clearAttributes();

    void failFeatureOperation(java.lang.String name2, java.lang.String operationKey, com.datadog.android.rum.featureoperations.FailureReason failureReason, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    java.util.Map<java.lang.String, java.lang.Object> getAttributes();

    void getCurrentSessionId(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback);

    boolean getDebug();

    void removeAttribute(java.lang.String key);

    void removeViewAttributes(java.util.Collection<java.lang.String> attributes);

    void reportAppFullyDisplayed();

    void setDebug(boolean z);

    void startAction(com.datadog.android.rum.RumActionType type, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void startFeatureOperation(java.lang.String name2, java.lang.String operationKey, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void startResource(java.lang.String key, com.datadog.android.rum.RumResourceMethod method, java.lang.String url, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void startView(java.lang.Object key, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void stopAction(com.datadog.android.rum.RumActionType type, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void stopResource(java.lang.String key, java.lang.Integer statusCode, java.lang.Long size, com.datadog.android.rum.RumResourceKind kind, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void stopResourceWithError(java.lang.String key, java.lang.Integer statusCode, java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.String stackTrace, java.lang.String errorType, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void stopResourceWithError(java.lang.String key, java.lang.Integer statusCode, java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.Throwable throwable, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void stopSession();

    void stopView(java.lang.Object key, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void succeedFeatureOperation(java.lang.String name2, java.lang.String operationKey, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startView$default(com.datadog.android.rum.RumMonitor rumMonitor, java.lang.Object obj, java.lang.String str, java.util.Map map, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startView");
            }
            if ((i & 4) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            rumMonitor.startView(obj, str, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void stopView$default(com.datadog.android.rum.RumMonitor rumMonitor, java.lang.Object obj, java.util.Map map, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopView");
            }
            if ((i & 2) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            rumMonitor.stopView(obj, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void addAction$default(com.datadog.android.rum.RumMonitor rumMonitor, com.datadog.android.rum.RumActionType rumActionType, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addAction");
            }
            if ((i & 4) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            rumMonitor.addAction(rumActionType, str, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startAction$default(com.datadog.android.rum.RumMonitor rumMonitor, com.datadog.android.rum.RumActionType rumActionType, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startAction");
            }
            if ((i & 4) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            rumMonitor.startAction(rumActionType, str, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void stopAction$default(com.datadog.android.rum.RumMonitor rumMonitor, com.datadog.android.rum.RumActionType rumActionType, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopAction");
            }
            if ((i & 4) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            rumMonitor.stopAction(rumActionType, str, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startResource$default(com.datadog.android.rum.RumMonitor rumMonitor, java.lang.String str, com.datadog.android.rum.RumResourceMethod rumResourceMethod, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startResource");
            }
            if ((i & 8) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            rumMonitor.startResource(str, rumResourceMethod, str2, map);
        }

        public static /* synthetic */ void stopResource$default(com.datadog.android.rum.RumMonitor rumMonitor, java.lang.String str, java.lang.Integer num, java.lang.Long l, com.datadog.android.rum.RumResourceKind rumResourceKind, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopResource");
            }
            if ((i & 16) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            rumMonitor.stopResource(str, num, l, rumResourceKind, map);
        }

        public static /* synthetic */ void stopResourceWithError$default(com.datadog.android.rum.RumMonitor rumMonitor, java.lang.String str, java.lang.Integer num, java.lang.String str2, com.datadog.android.rum.RumErrorSource rumErrorSource, java.lang.Throwable th, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopResourceWithError");
            }
            if ((i & 32) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            rumMonitor.stopResourceWithError(str, num, str2, rumErrorSource, th, map);
        }

        public static /* synthetic */ void stopResourceWithError$default(com.datadog.android.rum.RumMonitor rumMonitor, java.lang.String str, java.lang.Integer num, java.lang.String str2, com.datadog.android.rum.RumErrorSource rumErrorSource, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopResourceWithError");
            }
            rumMonitor.stopResourceWithError(str, num, str2, rumErrorSource, str3, str4, (i & 64) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void addError$default(com.datadog.android.rum.RumMonitor rumMonitor, java.lang.String str, com.datadog.android.rum.RumErrorSource rumErrorSource, java.lang.Throwable th, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addError");
            }
            if ((i & 8) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            rumMonitor.addError(str, rumErrorSource, th, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void addErrorWithStacktrace$default(com.datadog.android.rum.RumMonitor rumMonitor, java.lang.String str, com.datadog.android.rum.RumErrorSource rumErrorSource, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addErrorWithStacktrace");
            }
            if ((i & 8) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            rumMonitor.addErrorWithStacktrace(str, rumErrorSource, str2, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startFeatureOperation$default(com.datadog.android.rum.RumMonitor rumMonitor, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startFeatureOperation");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            rumMonitor.startFeatureOperation(str, str2, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void succeedFeatureOperation$default(com.datadog.android.rum.RumMonitor rumMonitor, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: succeedFeatureOperation");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            rumMonitor.succeedFeatureOperation(str, str2, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void failFeatureOperation$default(com.datadog.android.rum.RumMonitor rumMonitor, java.lang.String str, java.lang.String str2, com.datadog.android.rum.featureoperations.FailureReason failureReason, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: failFeatureOperation");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            rumMonitor.failFeatureOperation(str, str2, failureReason, map);
        }
    }
}
