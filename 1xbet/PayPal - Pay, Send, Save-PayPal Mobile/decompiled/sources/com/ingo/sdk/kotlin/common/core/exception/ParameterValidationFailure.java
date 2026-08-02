package com.ingo.sdk.kotlin.common.core.exception;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/exception/ParameterValidationFailure;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure$FeatureFailure;", "", "Lcom/ingo/sdk/kotlin/common/core/exception/ParameterError;", "fieldErrors", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getFieldErrors", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class ParameterValidationFailure extends com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure {
    private final java.util.List<com.ingo.sdk.kotlin.common.core.exception.ParameterError> fieldErrors;

    public final java.util.List<com.ingo.sdk.kotlin.common.core.exception.ParameterError> getFieldErrors() {
        return this.fieldErrors;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ParameterValidationFailure(java.util.List<? extends com.ingo.sdk.kotlin.common.core.exception.ParameterError> list) {
        super(null, 1, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.fieldErrors = list;
    }
}
