package com.zettle.sdk.core.log;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u0007\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/log/Logger;", "Lcom/zettle/sdk/core/log/Loggable;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getLogTag", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class Logger implements com.zettle.sdk.core.log.Loggable {
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    public Logger(java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        if (str2 == null) {
            str = str == null ? getClass().getSimpleName() : str;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        } else {
            str = str == null ? getClass().getSimpleName() : str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(str);
            str = sb.toString();
        }
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public /* synthetic */ Logger(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Logger() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
