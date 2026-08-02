package com.ingo.sdk.kotlin.common.core.exception;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/exception/LocalFailure;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure$FeatureFailure;", "", "errorTitle", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorString", "()Ljava/lang/String;", "getErrorTitle", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class LocalFailure extends com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalFailure(java.lang.String str, java.lang.String str2) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = str2;
    }

    @Override // com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure, com.ingo.sdk.kotlin.common.core.exception.Failure
    /* renamed from: getErrorString, reason: from getter */
    public java.lang.String getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.ingo.sdk.kotlin.common.core.exception.Failure.FeatureFailure, com.ingo.sdk.kotlin.common.core.exception.Failure
    /* renamed from: getErrorTitle, reason: from getter */
    public java.lang.String getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }
}
