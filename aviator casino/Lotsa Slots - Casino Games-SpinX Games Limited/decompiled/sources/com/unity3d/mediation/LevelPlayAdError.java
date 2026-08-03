package com.unity3d.mediation;

/* loaded from: classes5.dex */
public final class LevelPlayAdError {
    public static final com.unity3d.mediation.LevelPlayAdError.a Companion = new com.unity3d.mediation.LevelPlayAdError.a(null);
    public static final int ERROR_CODE_INVALID_AD_UNIT_ID = 626;
    public static final int ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK = 625;
    public static final int ERROR_CODE_LOAD_FAILED_ALREADY_CALLED = 627;
    public static final int ERROR_CODE_LOAD_WHILE_SHOW = 629;
    public static final int ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED = 624;
    public static final int ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK = 628;
    public static final int ERROR_CODE_SHOW_WHILE_LOAD = 631;
    public static final int ERROR_CODE_SHOW_WHILE_SHOW = 630;

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.logger.IronSourceError f8034a;
    private final java.lang.String b;
    private final java.lang.String c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayAdError(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.lang.String adId, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        this.f8034a = ironSourceError;
        this.b = adId;
        this.c = str;
    }

    public final java.lang.String getAdId() {
        return this.b;
    }

    public final java.lang.String getAdUnitId() {
        return this.c;
    }

    public final int getErrorCode() {
        com.ironsource.mediationsdk.logger.IronSourceError ironSourceError = this.f8034a;
        if (ironSourceError != null) {
            return ironSourceError.getErrorCode();
        }
        return 0;
    }

    public final java.lang.String getErrorMessage() {
        com.ironsource.mediationsdk.logger.IronSourceError ironSourceError = this.f8034a;
        java.lang.String errorMessage = ironSourceError != null ? ironSourceError.getErrorMessage() : null;
        return errorMessage == null ? "" : errorMessage;
    }

    public java.lang.String toString() {
        java.lang.String str = this.c;
        com.ironsource.mediationsdk.logger.IronSourceError ironSourceError = this.f8034a;
        return "adUnitId: " + str + io.ktor.sse.ServerSentEventKt.SPACE + (ironSourceError != null ? ironSourceError.toString() : null);
    }

    public /* synthetic */ LevelPlayAdError(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(ironSourceError, str, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdError(java.lang.String adId, java.lang.String adUnitId, int i, java.lang.String errorMessage) {
        this(new com.ironsource.mediationsdk.logger.IronSourceError(i, errorMessage), adId, adUnitId);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
