package com.ingo.sdk.kotlin.common.model;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/ingo/sdk/kotlin/common/model/ApiErrorThrowable;", "", "Lcom/ingo/sdk/kotlin/common/core/http/response/ErrorResponse;", "errorResponse", "<init>", "(Lcom/ingo/sdk/kotlin/common/core/http/response/ErrorResponse;)V", "Lcom/ingo/sdk/kotlin/common/core/http/response/ErrorResponse;", "getErrorResponse", "()Lcom/ingo/sdk/kotlin/common/core/http/response/ErrorResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ApiErrorThrowable extends java.lang.Throwable {
    private final com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse errorResponse;

    public final com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse getErrorResponse() {
        return this.errorResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiErrorThrowable(com.ingo.sdk.kotlin.common.core.http.response.ErrorResponse errorResponse) {
        super(errorResponse.getDetail());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorResponse, "");
        this.errorResponse = errorResponse;
    }
}
