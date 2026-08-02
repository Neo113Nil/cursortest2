package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/http/UnsafeHeaderException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/getHighSpeedVideoSizes;", "", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UnsafeHeaderException extends java.lang.IllegalArgumentException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UnsafeHeaderException(java.lang.String str) {
        super(r0.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Header(s) ");
        sb.append(str);
        sb.append(" are controlled by the engine and cannot be set explicitly");
    }
}
