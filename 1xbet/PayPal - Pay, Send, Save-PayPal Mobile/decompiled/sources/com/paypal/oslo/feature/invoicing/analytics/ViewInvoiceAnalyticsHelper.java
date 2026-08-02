package com.paypal.oslo.feature.invoicing.analytics;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/analytics/ViewInvoiceAnalyticsHelper;", "", "", "entryPoint", "<init>", "(Ljava/lang/String;)V", "", "trackCloseButtonPressed", "()V", "trackOpenExternalLink", "trackDownloadPdfPressed", "trackOpenExternalScheme", "trackOpenExternalBrowser", "trackScreenLoaded", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/TrafficSourceContext;", "getHighSpeedVideoSizes", "Ljava/util/List;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Screen;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext;", "Companion", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ViewInvoiceAnalyticsHelper {

    @java.lang.Deprecated
    public static final java.lang.String ACTION_DOWNLOAD_PDF_PRESSED = "download_pdf_pressed";

    @java.lang.Deprecated
    public static final java.lang.String ACTION_INVOICE_CLOSE = "close_invoice";

    @java.lang.Deprecated
    public static final java.lang.String ACTION_OPEN_EXTERNAL_BROWSER = "open_external_browser";

    @java.lang.Deprecated
    public static final java.lang.String ACTION_OPEN_EXTERNAL_LINK = "open_external_link";

    @java.lang.Deprecated
    public static final java.lang.String ACTION_OPEN_EXTERNAL_SCHEME = "open_external_scheme";

    @java.lang.Deprecated
    public static final java.lang.String COMPONENT_EXTERNAL_BROWSER = "external_browser";

    @java.lang.Deprecated
    public static final java.lang.String COMPONENT_INVOICE_WEBVIEW = "invoice_webview";

    @java.lang.Deprecated
    public static final java.lang.String ITEM_CLOSE_BUTTON = "close_button";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext> getHighResolutionOutputSizeshNQ4ISI;
    private static final com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper.Companion Companion = new com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper.Companion(null);
    public static final int $stable = 8;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/analytics/ViewInvoiceAnalyticsHelper$Factory;", "", "", "entryPoint", "Lcom/paypal/oslo/feature/invoicing/analytics/ViewInvoiceAnalyticsHelper;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/invoicing/analytics/ViewInvoiceAnalyticsHelper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.invoicing.analytics.ViewInvoiceAnalyticsHelper create(java.lang.String entryPoint);
    }

    @dagger.assisted.AssistedInject
    public ViewInvoiceAnalyticsHelper(@dagger.assisted.Assisted java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext(str, null));
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen screen = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(com.paypal.oslo.feature.invoicing.api.analytics.ViewInvoiceAnalyticsConstants.SCREEN_NAME);
        this.getHighSpeedVideoFpsRanges = screen;
        this.getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(screen, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(COMPONENT_INVOICE_WEBVIEW, 0, null, null, 14, null), null, 10, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/analytics/ViewInvoiceAnalyticsHelper$Companion;", "", "<init>", "()V", "", "ACTION_INVOICE_CLOSE", "Ljava/lang/String;", "ACTION_OPEN_EXTERNAL_LINK", "ACTION_DOWNLOAD_PDF_PRESSED", "ACTION_OPEN_EXTERNAL_SCHEME", "ACTION_OPEN_EXTERNAL_BROWSER", "ITEM_CLOSE_BUTTON", "COMPONENT_INVOICE_WEBVIEW", "COMPONENT_EXTERNAL_BROWSER"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void trackCloseButtonPressed() {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ItemPressed(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(this.getHighSpeedVideoFpsRanges, null, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("close_button", 0, 2, null), 6, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("invoicing", com.paypal.oslo.feature.invoicing.api.analytics.ViewInvoiceAnalyticsConstants.FEATURE_NAME, ACTION_INVOICE_CLOSE), this.getHighResolutionOutputSizeshNQ4ISI).track(com.paypal.oslo.feature.invoicing.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void trackOpenExternalLink() {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("invoicing", com.paypal.oslo.feature.invoicing.api.analytics.ViewInvoiceAnalyticsConstants.FEATURE_NAME, ACTION_OPEN_EXTERNAL_LINK), this.getHighResolutionOutputSizeshNQ4ISI).track(com.paypal.oslo.feature.invoicing.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void trackDownloadPdfPressed() {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("invoicing", com.paypal.oslo.feature.invoicing.api.analytics.ViewInvoiceAnalyticsConstants.FEATURE_NAME, ACTION_DOWNLOAD_PDF_PRESSED), this.getHighResolutionOutputSizeshNQ4ISI).track(com.paypal.oslo.feature.invoicing.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void trackOpenExternalScheme() {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("invoicing", com.paypal.oslo.feature.invoicing.api.analytics.ViewInvoiceAnalyticsConstants.FEATURE_NAME, ACTION_OPEN_EXTERNAL_SCHEME), this.getHighResolutionOutputSizeshNQ4ISI).track(com.paypal.oslo.feature.invoicing.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void trackOpenExternalBrowser() {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentClicked(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(this.getHighSpeedVideoFpsRanges, null, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(COMPONENT_EXTERNAL_BROWSER, 0, null, null, 14, null), null, 10, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("invoicing", com.paypal.oslo.feature.invoicing.api.analytics.ViewInvoiceAnalyticsConstants.FEATURE_NAME, ACTION_OPEN_EXTERNAL_BROWSER), this.getHighResolutionOutputSizeshNQ4ISI).track(com.paypal.oslo.feature.invoicing.AnalyticsTrackerKt.analyticsTracker);
    }

    public final void trackScreenLoaded() {
        new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ScreenAvailable(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(this.getHighSpeedVideoFpsRanges, null, null, null, 14, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("invoicing", com.paypal.oslo.feature.invoicing.api.analytics.ViewInvoiceAnalyticsConstants.FEATURE_NAME, com.paypal.oslo.feature.invoicing.api.analytics.ViewInvoiceAnalyticsConstants.ACTION_VIEW_INVOICE), null, null, this.getHighResolutionOutputSizeshNQ4ISI, 12, null).track(com.paypal.oslo.feature.invoicing.AnalyticsTrackerKt.analyticsTracker);
    }
}
