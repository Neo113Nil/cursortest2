package com.ingo.sdk.kotlin.common.core.exception;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/exception/InvalidSessionFailure;", "Lcom/ingo/sdk/kotlin/common/core/exception/SpykeFailure;", "", "errorMessage", "", "errorCode", "<init>", "(Ljava/lang/String;I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InvalidSessionFailure extends com.ingo.sdk.kotlin.common.core.exception.SpykeFailure {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidSessionFailure(java.lang.String str, int i) {
        super(str, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
