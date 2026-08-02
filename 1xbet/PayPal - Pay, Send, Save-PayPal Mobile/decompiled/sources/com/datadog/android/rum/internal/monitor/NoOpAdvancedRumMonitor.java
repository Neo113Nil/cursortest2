package com.datadog.android.rum.internal.monitor;

@kotlin.Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 J?\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010\u0014J#\u0010&\u001a\u00020\u000e2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u0010\u0003J\u0017\u00102\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b2\u00103J%\u00104\u001a\u00020\u000e2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b4\u0010'J\u0017\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u0010\u0003J\u0017\u0010<\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010A\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\t2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\t2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bC\u0010BJ?\u0010G\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u00010\t2\u0006\u0010F\u001a\u00020E2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bG\u0010HJ\u001d\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bI\u0010JJ%\u0010M\u001a\u00020\u000e2\u0014\u0010L\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0KH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u000eH\u0016¢\u0006\u0004\bO\u0010\u0003J\u0017\u0010P\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\bP\u00103J\u001d\u0010R\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0QH\u0016¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u000eH\u0016¢\u0006\u0004\bT\u0010\u0003J\u0017\u0010V\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u000eH\u0016¢\u0006\u0004\bX\u0010\u0003J\u0017\u0010[\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u00020\u000e2\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010c\u001a\u00020\u000e2\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u000eH\u0016¢\u0006\u0004\be\u0010\u0003J\u0019\u0010h\u001a\u00020\u000e2\b\u0010g\u001a\u0004\u0018\u00010fH\u0016¢\u0006\u0004\bh\u0010iJ!\u0010j\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\bj\u0010\u0014J\u001f\u0010m\u001a\u00020\u000e2\u0006\u0010k\u001a\u00020\t2\u0006\u0010l\u001a\u00020\tH\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\u000eH\u0016¢\u0006\u0004\bo\u0010\u0003J5\u0010p\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bp\u0010\u0010J7\u0010q\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u00010\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bq\u0010rJ=\u0010w\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020s2\u0006\u0010u\u001a\u00020t2\u0006\u0010v\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bw\u0010xJ=\u0010w\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010u\u001a\u00020t2\u0006\u0010v\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bw\u0010yJ5\u0010z\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\bz\u0010{J5\u0010|\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0004\b|\u0010\u0010JN\u0010\u0082\u0001\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020s2\b\u0010~\u001a\u0004\u0018\u00010}2\b\u0010\u007f\u001a\u0004\u0018\u00010(2\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001JN\u0010\u0082\u0001\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010~\u001a\u0004\u0018\u00010}2\b\u0010\u007f\u001a\u0004\u0018\u00010(2\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0084\u0001J^\u0010\u0087\u0001\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020s2\b\u0010~\u001a\u0004\u0018\u00010}2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0007\u0010\u0085\u0001\u001a\u00020\t2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001JR\u0010\u0087\u0001\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020s2\b\u0010~\u001a\u0004\u0018\u00010}2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0089\u0001J^\u0010\u0087\u0001\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010~\u001a\u0004\u0018\u00010}2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0007\u0010\u0085\u0001\u001a\u00020\t2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u008a\u0001JR\u0010\u0087\u0001\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010~\u001a\u0004\u0018\u00010}2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u008b\u0001J\u0011\u0010\u008c\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u008c\u0001\u0010\u0003J0\u0010\u008d\u0001\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J9\u0010\u008f\u0001\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u00010\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0005\b\u008f\u0001\u0010rJ\u001c\u0010\u0092\u0001\u001a\u00020\u000e2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J%\u0010\u0096\u0001\u001a\u00020\u000e2\b\u0010\u0095\u0001\u001a\u00030\u0094\u00012\u0007\u0010\u0012\u001a\u00030\u0090\u0001H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001a\u0010\u0098\u0001\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001R(\u0010\u009a\u0001\u001a\u0002058\u0017@\u0017X\u0096\u000e¢\u0006\u0017\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0005\b\u009e\u0001\u00108"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/NoOpAdvancedRumMonitor;", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "<init>", "()V", "Lcom/datadog/android/rum/_RumInternalProxy;", "_getInternal", "()Lcom/datadog/android/rum/_RumInternalProxy;", "Lcom/datadog/android/rum/RumActionType;", "type", "", "name", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "addAction", "(Lcom/datadog/android/rum/RumActionType;Ljava/lang/String;Ljava/util/Map;)V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "threads", "addCrash", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/List;)V", "addError", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stacktrace", "addErrorWithStacktrace", "(Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/util/Map;)V", "addFeatureFlagEvaluation", "featureFlags", "addFeatureFlagEvaluations", "(Ljava/util/Map;)V", "", "durationNs", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "addLongTask", "(JLjava/lang/String;)V", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "timing", "addResourceTiming", "(Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;)V", "addSessionReplaySkippedFrame", "addTiming", "(Ljava/lang/String;)V", "addViewAttributes", "", "overwrite", "addViewLoadingTime", "(Z)V", "clearAttributes", "Landroid/app/Activity;", "activity", "enableJankStatsTracking", "(Landroid/app/Activity;)V", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "Lcom/datadog/android/rum/internal/monitor/StorageEvent;", "event", "eventDropped", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/monitor/StorageEvent;)V", "eventSent", "operationKey", "Lcom/datadog/android/rum/featureoperations/FailureReason;", "failureReason", "failFeatureOperation", "(Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/featureoperations/FailureReason;Ljava/util/Map;)V", "getAttributes", "()Ljava/util/Map;", "Lkotlin/Function1;", com.sun.jna.Callback.METHOD_NAME, "getCurrentSessionId", "(Lkotlin/jvm/functions/Function1;)V", "notifyInterceptorInstantiated", "removeAttribute", "", "removeViewAttributes", "(Ljava/util/Collection;)V", "reportAppFullyDisplayed", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;", "reportNetworkingLibraryType", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;)V", "resetSession", "Lcom/datadog/android/rum/internal/startup/RumStartupScenario;", com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl.KEY_SCENARIO, "sendAppStartEvent", "(Lcom/datadog/android/rum/internal/startup/RumStartupScenario;)V", "Lcom/datadog/android/rum/internal/startup/RumTTIDInfo;", "info", "sendTTIDEvent", "(Lcom/datadog/android/rum/internal/startup/RumTTIDInfo;)V", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;", "telemetryEvent", "sendTelemetryEvent", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent;)V", "sendWebViewEvent", "Lcom/datadog/android/rum/internal/debug/RumDebugListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setDebugListener", "(Lcom/datadog/android/rum/internal/debug/RumDebugListener;)V", "setInternalViewAttribute", "testId", "resultId", "setSyntheticsAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "startAction", "startFeatureOperation", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lcom/datadog/android/rum/resource/ResourceId;", "Lcom/datadog/android/rum/RumResourceMethod;", "method", "url", "startResource", "(Lcom/datadog/android/rum/resource/ResourceId;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/String;Ljava/util/Map;)V", "startView", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", "stopAction", "", "statusCode", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/datadog/android/rum/RumResourceKind;", "kind", "stopResource", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;)V", "stackTrace", "errorType", "stopResourceWithError", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "stopSession", "stopView", "(Ljava/lang/Object;Ljava/util/Map;)V", "succeedFeatureOperation", "", "frameTimeSeconds", "updateExternalRefreshRate", "(D)V", "Lcom/datadog/android/rum/RumPerformanceMetric;", "metric", "updatePerformanceMetric", "(Lcom/datadog/android/rum/RumPerformanceMetric;D)V", "waitForResourceTiming", "(Ljava/lang/Object;)V", com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "Z", "getDebug", "()Z", "setDebug"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoOpAdvancedRumMonitor implements com.datadog.android.rum.internal.monitor.AdvancedRumMonitor {
    private boolean debug;

    @Override // com.datadog.android.rum.RumMonitor
    public final com.datadog.android.rum._RumInternalProxy _getInternal() {
        return null;
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void addSessionReplaySkippedFrame() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addViewLoadingTime(boolean overwrite) {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void clearAttributes() {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void notifyInterceptorInstantiated() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void reportAppFullyDisplayed() {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void resetSession() {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendWebViewEvent() {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void setDebugListener(com.datadog.android.rum.internal.debug.RumDebugListener listener) {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void start() {
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopSession() {
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void updateExternalRefreshRate(double frameTimeSeconds) {
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

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void waitForResourceTiming(java.lang.Object key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void updatePerformanceMetric(com.datadog.android.rum.RumPerformanceMetric metric, double value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metric, "");
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

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void stopResourceWithError(com.datadog.android.rum.resource.ResourceId key, java.lang.Integer statusCode, java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.Throwable throwable, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void stopResourceWithError(com.datadog.android.rum.resource.ResourceId key, java.lang.Integer statusCode, java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.String stackTrace, java.lang.String errorType, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
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

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void stopResource(com.datadog.android.rum.resource.ResourceId key, java.lang.Integer statusCode, java.lang.Long size, com.datadog.android.rum.RumResourceKind kind, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
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

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void startResource(com.datadog.android.rum.resource.ResourceId key, com.datadog.android.rum.RumResourceMethod method, java.lang.String url, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
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

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void setSyntheticsAttribute(java.lang.String testId, java.lang.String resultId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultId, "");
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void setInternalViewAttribute(java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendTelemetryEvent(com.datadog.android.internal.telemetry.InternalTelemetryEvent telemetryEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryEvent, "");
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendTTIDEvent(com.datadog.android.rum.internal.startup.RumTTIDInfo info) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendAppStartEvent(com.datadog.android.rum.internal.startup.RumStartupScenario scenario) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scenario, "");
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void reportNetworkingLibraryType(com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
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

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void eventSent(java.lang.String viewId, com.datadog.android.rum.internal.monitor.StorageEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void eventDropped(java.lang.String viewId, com.datadog.android.rum.internal.monitor.StorageEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void enableJankStatsTracking(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addViewAttributes(java.util.Map<java.lang.String, ? extends java.lang.Object> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addTiming(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor
    public final void addResourceTiming(java.lang.Object key, com.datadog.android.rum.internal.domain.event.ResourceTiming timing) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timing, "");
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void addLongTask(long durationNs, java.lang.String target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
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

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void addCrash(java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.Throwable throwable, java.util.List<com.datadog.android.core.feature.event.ThreadDump> threads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
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
