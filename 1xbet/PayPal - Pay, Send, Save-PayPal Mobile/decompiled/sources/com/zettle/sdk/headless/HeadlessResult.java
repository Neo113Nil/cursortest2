package com.zettle.sdk.headless;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u0007*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0005\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessResult;", "T", "", "<init>", "()V", "handleErrors$core_publicRelease", "()Ljava/lang/Object;", "Companion", "Failed", "PrerequisitesNotFulfilled", "Success", "Unsupported", "Lcom/zettle/sdk/headless/HeadlessResult$Failed;", "Lcom/zettle/sdk/headless/HeadlessResult$PrerequisitesNotFulfilled;", "Lcom/zettle/sdk/headless/HeadlessResult$Success;", "Lcom/zettle/sdk/headless/HeadlessResult$Unsupported;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class HeadlessResult<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.headless.HeadlessResult.Companion INSTANCE = new com.zettle.sdk.headless.HeadlessResult.Companion(null);

    private HeadlessResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00028\u00018\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessResult$Success;", "T", "Lcom/zettle/sdk/headless/HeadlessResult;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/zettle/sdk/headless/HeadlessResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getValue"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Success<T> extends com.zettle.sdk.headless.HeadlessResult<T> {
        private final T value;

        public Success(T t) {
            super(null);
            this.value = t;
        }

        public final T getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            T t = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(value=");
            sb.append(t);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            T t = this.value;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.headless.HeadlessResult.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.zettle.sdk.headless.HeadlessResult.Success) other).value);
        }

        public final com.zettle.sdk.headless.HeadlessResult.Success<T> copy(T value) {
            return new com.zettle.sdk.headless.HeadlessResult.Success<>(value);
        }

        public final T component1() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.zettle.sdk.headless.HeadlessResult.Success copy$default(com.zettle.sdk.headless.HeadlessResult.Success success, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessResult$Failed;", "Lcom/zettle/sdk/headless/HeadlessResult;", "", "", "error", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/zettle/sdk/headless/HeadlessResult$Failed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Throwable;", "getCause", "Ljava/lang/String;", "getError"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Failed extends com.zettle.sdk.headless.HeadlessResult {
        private final java.lang.Throwable cause;
        private final java.lang.String error;

        public /* synthetic */ Failed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getError() {
            return this.error;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.error = str;
            this.cause = th;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.error;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(error=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.error.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.headless.HeadlessResult.Failed)) {
                return false;
            }
            com.zettle.sdk.headless.HeadlessResult.Failed failed = (com.zettle.sdk.headless.HeadlessResult.Failed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.error, failed.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, failed.cause);
        }

        public final com.zettle.sdk.headless.HeadlessResult.Failed copy(java.lang.String error, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.zettle.sdk.headless.HeadlessResult.Failed(error, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getError() {
            return this.error;
        }

        public static /* synthetic */ com.zettle.sdk.headless.HeadlessResult.Failed copy$default(com.zettle.sdk.headless.HeadlessResult.Failed failed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = failed.error;
            }
            if ((i & 2) != 0) {
                th = failed.cause;
            }
            return failed.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessResult$Unsupported;", "Lcom/zettle/sdk/headless/HeadlessResult;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unsupported extends com.zettle.sdk.headless.HeadlessResult {
        public static final com.zettle.sdk.headless.HeadlessResult.Unsupported INSTANCE = new com.zettle.sdk.headless.HeadlessResult.Unsupported();

        private Unsupported() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessResult$PrerequisitesNotFulfilled;", "Lcom/zettle/sdk/headless/HeadlessResult;", "", "", "Lcom/zettle/sdk/core/permission/Prerequisite;", "missing", "<init>", "(Ljava/util/Set;)V", "Ljava/util/Set;", "getMissing", "()Ljava/util/Set;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PrerequisitesNotFulfilled extends com.zettle.sdk.headless.HeadlessResult {
        private final java.util.Set<com.zettle.sdk.core.permission.Prerequisite> missing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PrerequisitesNotFulfilled(java.util.Set<? extends com.zettle.sdk.core.permission.Prerequisite> set) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.missing = set;
        }

        public final java.util.Set<com.zettle.sdk.core.permission.Prerequisite> getMissing() {
            return this.missing;
        }
    }

    public final T handleErrors$core_publicRelease() {
        if (this instanceof com.zettle.sdk.headless.HeadlessResult.Success) {
            return (T) ((com.zettle.sdk.headless.HeadlessResult.Success) this).getValue();
        }
        if (this instanceof com.zettle.sdk.headless.HeadlessResult.Unsupported) {
            throw new com.zettle.sdk.ZettleSDKException.Unsupported();
        }
        if (this instanceof com.zettle.sdk.headless.HeadlessResult.Failed) {
            com.zettle.sdk.headless.HeadlessResult.Failed failed = (com.zettle.sdk.headless.HeadlessResult.Failed) this;
            throw new com.zettle.sdk.ZettleSDKException.PluginError(failed.getError(), failed.getCause());
        }
        if (this instanceof com.zettle.sdk.headless.HeadlessResult.PrerequisitesNotFulfilled) {
            throw new com.zettle.sdk.ZettleSDKException.PrerequisitesNotFulfilled(((com.zettle.sdk.headless.HeadlessResult.PrerequisitesNotFulfilled) this).getMissing());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013\"\u0004\b\u0001\u0010\u00112\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/zettle/sdk/headless/HeadlessResult$Companion;", "", "<init>", "()V", "", "error", "", "cause", "Lcom/zettle/sdk/headless/HeadlessResult$Failed;", "failed", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/zettle/sdk/headless/HeadlessResult$Failed;", "", "Lcom/zettle/sdk/core/permission/Prerequisite;", "missing", "Lcom/zettle/sdk/headless/HeadlessResult$PrerequisitesNotFulfilled;", "prerequisitesNotFulfilled", "(Ljava/util/Set;)Lcom/zettle/sdk/headless/HeadlessResult$PrerequisitesNotFulfilled;", "T", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/zettle/sdk/headless/HeadlessResult$Success;", "success", "(Ljava/lang/Object;)Lcom/zettle/sdk/headless/HeadlessResult$Success;", "Lcom/zettle/sdk/headless/HeadlessResult$Unsupported;", "unsupported", "()Lcom/zettle/sdk/headless/HeadlessResult$Unsupported;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <T> com.zettle.sdk.headless.HeadlessResult.Success<T> success(T data) {
            return new com.zettle.sdk.headless.HeadlessResult.Success<>(data);
        }

        public static /* synthetic */ com.zettle.sdk.headless.HeadlessResult.Failed failed$default(com.zettle.sdk.headless.HeadlessResult.Companion companion, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            return companion.failed(str, th);
        }

        public final com.zettle.sdk.headless.HeadlessResult.Failed failed(java.lang.String error, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.zettle.sdk.headless.HeadlessResult.Failed(error, cause);
        }

        public final com.zettle.sdk.headless.HeadlessResult.Unsupported unsupported() {
            return com.zettle.sdk.headless.HeadlessResult.Unsupported.INSTANCE;
        }

        public final com.zettle.sdk.headless.HeadlessResult.PrerequisitesNotFulfilled prerequisitesNotFulfilled(java.util.Set<? extends com.zettle.sdk.core.permission.Prerequisite> missing) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missing, "");
            return new com.zettle.sdk.headless.HeadlessResult.PrerequisitesNotFulfilled(missing);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ HeadlessResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
