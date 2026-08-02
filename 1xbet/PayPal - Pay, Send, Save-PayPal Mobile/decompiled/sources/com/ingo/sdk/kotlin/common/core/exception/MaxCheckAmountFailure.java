package com.ingo.sdk.kotlin.common.core.exception;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/exception/MaxCheckAmountFailure;", "Lcom/ingo/sdk/kotlin/common/core/exception/LocalFailure;", "", "errorTitle", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MaxCheckAmountFailure extends com.ingo.sdk.kotlin.common.core.exception.LocalFailure {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxCheckAmountFailure(java.lang.String str, java.lang.String str2) {
        super(str, str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }
}
