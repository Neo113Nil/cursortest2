package com.ingo.sdk.kotlin.common.core.exception;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/exception/ThrowableFailure;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure$FeatureFailure;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ThrowableFailure extends com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThrowableFailure(java.lang.Throwable th) {
        super(th);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
    }
}
