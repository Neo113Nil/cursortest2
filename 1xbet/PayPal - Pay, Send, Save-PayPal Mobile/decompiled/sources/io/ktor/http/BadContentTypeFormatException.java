package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/http/BadContentTypeFormatException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BadContentTypeFormatException extends java.lang.Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadContentTypeFormatException(java.lang.String str) {
        super("Bad Content-Type format: ".concat(java.lang.String.valueOf(str)));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
