package com.paypal.android.threeds.exceptions;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/android/threeds/exceptions/SDKRuntimeException;", "Ljava/lang/RuntimeException;", "Lkotlin/getHighSpeedVideoFpsRangesFor;", "", "message", "", "cause", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "protocolErrorType", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/paypal/android/threeds/data/model/ProtocolErrorType;)V", "Lcom/paypal/android/threeds/data/model/ProtocolErrorType;", "getProtocolErrorType", "()Lcom/paypal/android/threeds/data/model/ProtocolErrorType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SDKRuntimeException extends java.lang.RuntimeException {
    public static final int $stable = 8;
    private final com.paypal.android.threeds.data.model.ProtocolErrorType protocolErrorType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKRuntimeException(java.lang.String str, java.lang.Throwable th, com.paypal.android.threeds.data.model.ProtocolErrorType protocolErrorType) {
        super(str, th);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.protocolErrorType = protocolErrorType;
    }

    public /* synthetic */ SDKRuntimeException(java.lang.String str, java.lang.Throwable th, com.paypal.android.threeds.data.model.ProtocolErrorType protocolErrorType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : protocolErrorType);
    }

    public final com.paypal.android.threeds.data.model.ProtocolErrorType getProtocolErrorType() {
        return this.protocolErrorType;
    }
}
