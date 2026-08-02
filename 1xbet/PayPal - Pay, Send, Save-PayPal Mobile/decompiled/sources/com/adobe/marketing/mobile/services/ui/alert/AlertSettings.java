package com.adobe.marketing.mobile.services.ui.alert;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0013B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/alert/AlertSettings;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "negativeButtonText", "getNegativeButtonText", "positiveButtonText", "getPositiveButtonText", "title", "getTitle", "Builder"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AlertSettings {
    public static final int $stable = 0;
    private final java.lang.String message;
    private final java.lang.String negativeButtonText;
    private final java.lang.String positiveButtonText;
    private final java.lang.String title;

    private AlertSettings(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.title = str;
        this.message = str2;
        this.positiveButtonText = str3;
        this.negativeButtonText = str4;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String getPositiveButtonText() {
        return this.positiveButtonText;
    }

    public final java.lang.String getNegativeButtonText() {
        return this.negativeButtonText;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\tR\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/alert/AlertSettings$Builder;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/services/ui/alert/AlertSettings;", "build", "()Lcom/adobe/marketing/mobile/services/ui/alert/AlertSettings;", "", "message", "(Ljava/lang/String;)Lcom/adobe/marketing/mobile/services/ui/alert/AlertSettings$Builder;", "negativeButtonText", "positiveButtonText", "title", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.String getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private java.lang.String Camera2StreamConfigurationMap = "";

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRanges = "";

        public final com.adobe.marketing.mobile.services.ui.alert.AlertSettings.Builder title(java.lang.String title) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            this.Camera2StreamConfigurationMap = title;
            return this;
        }

        public final com.adobe.marketing.mobile.services.ui.alert.AlertSettings.Builder message(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            this.getHighSpeedVideoFpsRanges = message;
            return this;
        }

        public final com.adobe.marketing.mobile.services.ui.alert.AlertSettings.Builder positiveButtonText(java.lang.String positiveButtonText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(positiveButtonText, "");
            this.getHighSpeedVideoFpsRangesFor = positiveButtonText;
            return this;
        }

        public final com.adobe.marketing.mobile.services.ui.alert.AlertSettings.Builder negativeButtonText(java.lang.String negativeButtonText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(negativeButtonText, "");
            this.getHighResolutionOutputSizeshNQ4ISI = negativeButtonText;
            return this;
        }

        public final com.adobe.marketing.mobile.services.ui.alert.AlertSettings build() {
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            if (str == null && this.getHighResolutionOutputSizeshNQ4ISI == null) {
                throw new java.lang.IllegalArgumentException("At least one button must be defined.");
            }
            return new com.adobe.marketing.mobile.services.ui.alert.AlertSettings(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, str, this.getHighResolutionOutputSizeshNQ4ISI, null);
        }
    }

    public /* synthetic */ AlertSettings(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }
}
