package com.zettle.sdk.meta;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/meta/Sessions;", "", "Lcom/zettle/sdk/meta/Prefs;", "prefs", "<init>", "(Lcom/zettle/sdk/meta/Prefs;)V", "", "generateSessionId$core_publicRelease", "()Ljava/lang/String;", "getSessionId", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/meta/Prefs;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Sessions {
    public static final java.lang.String PREFS_NAME = "izettle-presistance";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.Prefs getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.String Camera2StreamConfigurationMap;

    public Sessions(com.zettle.sdk.meta.Prefs prefs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefs, "");
        this.getHighResolutionOutputSizeshNQ4ISI = prefs;
    }

    public final java.lang.String generateSessionId$core_publicRelease() {
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        java.util.UUID randomUUID2 = java.util.UUID.randomUUID();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AD");
        sb.append(randomUUID);
        sb.append(randomUUID2);
        java.lang.String substring = kotlin.text.StringsKt.replace$default(sb.toString(), "-", "", false, 4, (java.lang.Object) null).substring(0, 40);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    public final java.lang.String getSessionId() {
        java.lang.String orPut = this.getHighResolutionOutputSizeshNQ4ISI.getOrPut("openudid", this.Camera2StreamConfigurationMap, new com.zettle.sdk.meta.Sessions$getSessionId$1(this));
        this.Camera2StreamConfigurationMap = orPut;
        return orPut;
    }
}
