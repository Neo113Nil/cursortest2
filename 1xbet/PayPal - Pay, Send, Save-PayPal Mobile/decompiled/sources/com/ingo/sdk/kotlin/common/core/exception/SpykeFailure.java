package com.ingo.sdk.kotlin.common.core.exception;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/exception/SpykeFailure;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure$FeatureFailure;", "", "errorMessage", "", "errorCode", "<init>", "(Ljava/lang/String;I)V", "getErrorString", "()Ljava/lang/String;", "Ljava/lang/String;", "getErrorMessage", com.visa.cbp.getEncExpo.warmup, "getErrorCode", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class SpykeFailure extends com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure {
    private final int errorCode;
    private final java.lang.String errorMessage;

    public /* synthetic */ SpykeFailure(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpykeFailure(java.lang.String str, int i) {
        super(null, 1, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.errorMessage = str;
        this.errorCode = i;
    }

    @Override // com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure, com.ingo.sdk.kotlin.common.core.exception.Failure
    /* renamed from: getErrorString */
    public java.lang.String getCamera2StreamConfigurationMap() {
        return this.errorMessage;
    }
}
