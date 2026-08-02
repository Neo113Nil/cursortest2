package com.paypal.oslo.feature.shaketoreport.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportDestination;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "route", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "Annotation", com.datatheorem.android.trustkit.reporting.BackgroundReporter.EXTRA_REPORT, "ScreenshotPreview", "Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportDestination$Annotation;", "Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportDestination$Report;", "Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportDestination$ScreenshotPreview;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class BugReportDestination {
    public static final int $stable = 0;
    private final java.lang.String route;

    private BugReportDestination(java.lang.String str) {
        this.route = str;
    }

    public final java.lang.String getRoute() {
        return this.route;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportDestination$Annotation;", "Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportDestination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Annotation extends com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.Annotation INSTANCE = new com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.Annotation();

        public final int hashCode() {
            return 1672899815;
        }

        private Annotation() {
            super("annotation", null);
        }

        public final java.lang.String toString() {
            return "Annotation";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.Annotation)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportDestination$Report;", "Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportDestination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Report extends com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.Report INSTANCE = new com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.Report();

        public final int hashCode() {
            return 334000876;
        }

        private Report() {
            super("report", null);
        }

        public final java.lang.String toString() {
            return com.datatheorem.android.trustkit.reporting.BackgroundReporter.EXTRA_REPORT;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.Report)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportDestination$ScreenshotPreview;", "Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportDestination;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenshotPreview extends com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.ScreenshotPreview INSTANCE = new com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.ScreenshotPreview();

        public final int hashCode() {
            return 248174282;
        }

        private ScreenshotPreview() {
            super("screenshot_preview", null);
        }

        public final java.lang.String toString() {
            return "ScreenshotPreview";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.ScreenshotPreview)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ BugReportDestination(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
