package com.ingo.sdk.kotlin.common.core.exception;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/exception/ApiFailure;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure$FeatureFailure;", "Lcom/ingo/sdk/kotlin/common/model/ApiErrorThrowable;", "apiErrorThrowable", "<init>", "(Lcom/ingo/sdk/kotlin/common/model/ApiErrorThrowable;)V", "", "getErrorString", "()Ljava/lang/String;", "getErrorTitle", "Lcom/ingo/sdk/kotlin/common/model/ApiErrorThrowable;", "getApiErrorThrowable", "()Lcom/ingo/sdk/kotlin/common/model/ApiErrorThrowable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ApiFailure extends com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure {
    private final com.ingo.sdk.kotlin.common.model.ApiErrorThrowable apiErrorThrowable;

    public final com.ingo.sdk.kotlin.common.model.ApiErrorThrowable getApiErrorThrowable() {
        return this.apiErrorThrowable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiFailure(com.ingo.sdk.kotlin.common.model.ApiErrorThrowable apiErrorThrowable) {
        super(apiErrorThrowable);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiErrorThrowable, "");
        this.apiErrorThrowable = apiErrorThrowable;
    }

    @Override // com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure, com.ingo.sdk.kotlin.common.core.exception.Failure
    /* renamed from: getErrorString */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.apiErrorThrowable.getErrorResponse().getDetail();
    }

    @Override // com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure, com.ingo.sdk.kotlin.common.core.exception.Failure
    /* renamed from: getErrorTitle */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.apiErrorThrowable.getErrorResponse().getTitle();
    }
}
