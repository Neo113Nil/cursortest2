package io.ktor.http.parsing.regex;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lio/ktor/http/parsing/regex/GrammarRegex;", "", "", "p0", "", "p1", "", "p2", "<init>", "(Ljava/lang/String;IZ)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class GrammarRegex {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoSizes;

    public GrammarRegex(java.lang.String str, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
            sb.append(str);
            sb.append(')');
            str = sb.toString();
        }
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = z ? i + 1 : i;
    }

    public /* synthetic */ GrammarRegex(java.lang.String str, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z);
    }
}
