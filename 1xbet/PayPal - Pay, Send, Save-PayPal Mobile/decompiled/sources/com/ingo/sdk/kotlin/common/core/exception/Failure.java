package com.ingo.sdk.kotlin.common.core.exception;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\u0006\u0082\u0001\u0001\t"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "", "<init>", "()V", "", "getErrorString", "()Ljava/lang/String;", "getErrorTitle", "FeatureFailure", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure$FeatureFailure;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Failure {
    public abstract java.lang.String getErrorString();

    public abstract java.lang.String getErrorTitle();

    private Failure() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/exception/Failure$FeatureFailure;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "", "getErrorString", "()Ljava/lang/String;", "getErrorTitle", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static abstract class FeatureFailure extends com.ingo.sdk.kotlin.common.core.exception.Failure {
        private final java.lang.Throwable throwable;

        public FeatureFailure(java.lang.Throwable th) {
            super(null);
            this.throwable = th;
        }

        public /* synthetic */ FeatureFailure(java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : th);
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        @Override // com.ingo.sdk.kotlin.common.core.exception.Failure
        public java.lang.String getErrorString() {
            java.lang.String message;
            java.lang.Throwable th = this.throwable;
            return (th == null || (message = th.getMessage()) == null) ? "" : message;
        }

        @Override // com.ingo.sdk.kotlin.common.core.exception.Failure
        public java.lang.String getErrorTitle() {
            return "Error";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FeatureFailure() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ Failure(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
