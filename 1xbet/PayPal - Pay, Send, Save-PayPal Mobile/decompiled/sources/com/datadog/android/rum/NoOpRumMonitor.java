package com.datadog.android.rum;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0014J#\u0010!\u001a\u00020\u000e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u00020\u000e2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b%\u0010\"J\u0017\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010\u0003J?\u0010.\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\t2\u0006\u0010-\u001a\u00020,2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b0\u00101J%\u00104\u001a\u00020\u000e2\u0014\u00103\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e02H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u0010$J\u001d\u00108\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t07H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010\u0003J5\u0010;\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b;\u0010\u0010J7\u0010<\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b<\u0010=J=\u0010A\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bA\u0010BJ5\u0010C\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bC\u0010DJ5\u0010E\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bE\u0010\u0010JI\u0010L\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010G\u001a\u0004\u0018\u00010F2\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010K\u001a\u00020J2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bL\u0010MJY\u0010P\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010N\u001a\u00020\t2\b\u0010O\u001a\u0004\u0018\u00010\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bP\u0010QJO\u0010P\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bP\u0010RJ\u000f\u0010S\u001a\u00020\u000eH\u0016¢\u0006\u0004\bS\u0010\u0003J-\u0010T\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bT\u0010UJ7\u0010V\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bV\u0010=R\"\u0010W\u001a\u00020&8\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010)"}, d2 = {"Lcom/datadog/android/rum/NoOpRumMonitor;", "Lcom/datadog/android/rum/RumMonitor;", "<init>", "()V", "Lcom/datadog/android/rum/_RumInternalProxy;", "_getInternal", "()Lcom/datadog/android/rum/_RumInternalProxy;", "Lcom/datadog/android/rum/RumActionType;", "type", "", "name", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "addAction", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;)V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "addError", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stacktrace", "addErrorWithStacktrace", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/util/Map;)V", "addFeatureFlagEvaluation", "featureFlags", "addFeatureFlagEvaluations", "(Ljava/util/Map;)V", "addTiming", "(Ljava/lang/String;)V", "addViewAttributes", "", "overwrite", "addViewLoadingTime", "(Z)V", "clearAttributes", "operationKey", "Lcom/datadog/android/rum/featureoperations/FailureReason;", "failureReason", "failFeatureOperation", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/featureoperations/FailureReason;Ljava/util/Map;)V", "getAttributes", "()Ljava/util/Map;", "Lkotlin/Function1;", com.sun.jna.Callback.METHOD_NAME, "getCurrentSessionId", "(Lkotlin/jvm/functions/Function1;)V", "removeAttribute", "", "removeViewAttributes", "(Ljava/util/Collection;)V", "reportAppFullyDisplayed", "startAction", "startFeatureOperation", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/datadog/android/rum/RumResourceMethod;", "method", "url", "startResource", "(Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/String;Ljava/util/Map;)V", "startView", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", "stopAction", "", "statusCode", "", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/datadog/android/rum/RumResourceKind;", "kind", "stopResource", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;)V", "stackTrace", "errorType", "stopResourceWithError", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stopSession", "stopView", "(Ljava/lang/Object;Ljava/util/Map;)V", "succeedFeatureOperation", com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "Z", "getDebug", "()Z", "setDebug"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpRumMonitor implements com.datadog.android.rum.RumMonitor {
    private boolean debug;

    @Override // com.datadog.android.rum.RumMonitor
    public final com.datadog.android.rum._RumInternalProxy _getInternal() {
        return null;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addViewLoadingTime(boolean overwrite) {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void clearAttributes() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void reportAppFullyDisplayed() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopSession() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final boolean getDebug() {
        return this.debug;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void setDebug(boolean z) {
        this.debug = z;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
        return kotlin.collections.MapsKt.emptyMap();
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void succeedFeatureOperation(java.lang.String name2, java.lang.String operationKey, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopView(java.lang.Object key, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopResourceWithError(java.lang.String key, java.lang.Integer statusCode, java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.Throwable throwable, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopResourceWithError(java.lang.String key, java.lang.Integer statusCode, java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.String stackTrace, java.lang.String errorType, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackTrace, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopResource(java.lang.String key, java.lang.Integer statusCode, java.lang.Long size, com.datadog.android.rum.RumResourceKind kind, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopAction(com.datadog.android.rum.RumActionType type, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void startView(java.lang.Object key, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void startResource(java.lang.String key, com.datadog.android.rum.RumResourceMethod method, java.lang.String url, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void startFeatureOperation(java.lang.String name2, java.lang.String operationKey, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void startAction(com.datadog.android.rum.RumActionType type, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void removeViewAttributes(java.util.Collection<java.lang.String> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void removeAttribute(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void getCurrentSessionId(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void failFeatureOperation(java.lang.String name2, java.lang.String operationKey, com.datadog.android.rum.featureoperations.FailureReason failureReason, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addViewAttributes(java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addTiming(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addFeatureFlagEvaluations(java.util.Map<java.lang.String, ? extends java.lang.Object> featureFlags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureFlags, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addFeatureFlagEvaluation(java.lang.String name2, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addErrorWithStacktrace(java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.String stacktrace, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addError(java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.Throwable throwable, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addAttribute(java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addAction(com.datadog.android.rum.RumActionType type, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }
}
