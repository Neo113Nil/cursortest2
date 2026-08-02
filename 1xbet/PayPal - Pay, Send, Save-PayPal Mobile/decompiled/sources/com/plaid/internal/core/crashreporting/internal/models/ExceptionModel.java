package com.plaid.internal.core.crashreporting.internal.models;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionModel;", "Ljava/io/Serializable;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.paypal.oslo.feature.p2p.analytics.P2pReviewAnalytics.FEATURE_MODULE, "Ljava/lang/String;", "Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceInterface;", "stacktrace", "Lcom/plaid/internal/core/crashreporting/internal/models/StackTraceInterface;", "type", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ExceptionModel implements java.io.Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.plaid.internal.core.crashreporting.internal.models.ExceptionModel.Companion INSTANCE = new com.plaid.internal.core.crashreporting.internal.models.ExceptionModel.Companion(null);
    public static final java.lang.String DEFAULT_PACKAGE_NAME = "(default)";
    private final java.lang.String module;
    private final com.plaid.internal.core.crashreporting.internal.models.StackTraceInterface stacktrace;
    private final java.lang.String type;
    private final java.lang.String value;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionModel$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "Ljava/util/Queue;", "Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionModel;", "extractExceptionQueue", "(Ljava/lang/Throwable;)Ljava/util/Queue;", "", "DEFAULT_PACKAGE_NAME", "Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final java.util.Queue<com.plaid.internal.core.crashreporting.internal.models.ExceptionModel> extractExceptionQueue(java.lang.Throwable throwable) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.HashSet hashSet = new java.util.HashSet();
            java.lang.Throwable th = throwable;
            while (th != null && hashSet.add(th)) {
                linkedList.add(new com.plaid.internal.core.crashreporting.internal.models.ExceptionModel(th));
                th = throwable != null ? throwable.getCause() : null;
            }
            return linkedList;
        }

        private Companion() {
        }
    }

    public ExceptionModel(java.lang.Throwable th) {
        java.lang.StackTraceElement[] stackTrace;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        java.lang.Package r0 = th.getClass().getPackage();
        java.lang.String name2 = th.getClass().getName();
        this.value = th.getMessage();
        if (r0 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(name2);
            java.lang.String name3 = r0.getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(name3);
            sb.append(".");
            name2 = kotlin.text.StringsKt.replace$default(name2, sb.toString(), "", false, 4, (java.lang.Object) null);
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(name2);
        }
        this.type = name2;
        java.lang.String canonicalName = th.getClass().getCanonicalName();
        this.module = canonicalName != null ? kotlin.text.StringsKt.removeSuffix(canonicalName, (java.lang.CharSequence) ".".concat(java.lang.String.valueOf(th.getClass().getSimpleName()))) : null;
        try {
            stackTrace = th.getStackTrace();
            kotlin.jvm.internal.Intrinsics.checkNotNull(stackTrace);
            kotlin.collections.ArraysKt.reverse(stackTrace);
        } catch (java.lang.NullPointerException e) {
            stackTrace = e.getStackTrace();
        }
        com.plaid.internal.core.crashreporting.internal.models.StackTraceElement.Companion companion = com.plaid.internal.core.crashreporting.internal.models.StackTraceElement.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(stackTrace);
        this.stacktrace = new com.plaid.internal.core.crashreporting.internal.models.StackTraceInterface(companion.fromStackTraceElements(stackTrace));
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(com.plaid.internal.core.crashreporting.internal.models.ExceptionModel.class, other.getClass())) {
            return false;
        }
        com.plaid.internal.core.crashreporting.internal.models.ExceptionModel exceptionModel = (com.plaid.internal.core.crashreporting.internal.models.ExceptionModel) other;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.type, exceptionModel.type)) {
            return false;
        }
        java.lang.String str = this.value;
        if (str == null ? exceptionModel.value != null : !kotlin.jvm.internal.Intrinsics.areEqual(str, exceptionModel.value)) {
            return false;
        }
        java.lang.String str2 = this.module;
        if (str2 == null ? exceptionModel.module == null : kotlin.jvm.internal.Intrinsics.areEqual(str2, exceptionModel.module)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.stacktrace, exceptionModel.stacktrace);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.value;
        int a2 = com.plaid.internal.C0679x.a(this.type, (str != null ? str.hashCode() : 0) * 31, 31);
        java.lang.String str2 = this.module;
        return a2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.value;
        java.lang.String str2 = this.type;
        java.lang.String str3 = this.module;
        com.plaid.internal.core.crashreporting.internal.models.StackTraceInterface stackTraceInterface = this.stacktrace;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SentryException{value='");
        sb.append(str);
        sb.append("', type='");
        sb.append(str2);
        sb.append("', module='");
        sb.append(str3);
        sb.append("', stackTraceInterface=");
        sb.append(stackTraceInterface);
        sb.append("}");
        return sb.toString();
    }
}
