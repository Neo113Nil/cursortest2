package com.paypal.oslo.feature.activity.api.widget.configs;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\u0018\u0000 .2\u00020\u0001:\u0002/.BI\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;", "", "", "p0", "", "p1", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetUIConfig;", "p2", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetContentConfig;", "p3", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFiltersConfig;", "p4", "Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetClickHandler;", "p5", "Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetDataTransformer;", "p6", "<init>", "(ILjava/lang/String;Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetUIConfig;Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetContentConfig;Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFiltersConfig;Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetClickHandler;Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetDataTransformer;)V", "widgetTxnFetchCount", com.visa.cbp.getEncExpo.warmup, "getWidgetTxnFetchCount", "()I", "source", "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "uiConfig", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetUIConfig;", "getUiConfig", "()Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetUIConfig;", "contentConfig", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetContentConfig;", "getContentConfig", "()Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetContentConfig;", "filtersConfig", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFiltersConfig;", "getFiltersConfig", "()Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFiltersConfig;", "widgetClickHandler", "Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetClickHandler;", "getWidgetClickHandler", "()Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetClickHandler;", "dataTransformer", "Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetDataTransformer;", "getDataTransformer", "()Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetDataTransformer;", "Companion", "Builder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetConfiguration {
    private final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig contentConfig;
    private final com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetDataTransformer dataTransformer;
    private final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig filtersConfig;
    private final java.lang.String source;
    private final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig uiConfig;
    private final com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetClickHandler widgetClickHandler;
    private final int widgetTxnFetchCount;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.Companion INSTANCE = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.Companion(null);
    public static final int $stable = 8;

    private ActivityWidgetConfiguration(int i, java.lang.String str, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig activityWidgetUIConfig, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig activityWidgetContentConfig, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig activityWidgetFiltersConfig, com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetClickHandler iActivityWidgetClickHandler, com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetDataTransformer iActivityWidgetDataTransformer) {
        this.widgetTxnFetchCount = i;
        this.source = str;
        this.uiConfig = activityWidgetUIConfig;
        this.contentConfig = activityWidgetContentConfig;
        this.filtersConfig = activityWidgetFiltersConfig;
        this.widgetClickHandler = iActivityWidgetClickHandler;
        this.dataTransformer = iActivityWidgetDataTransformer;
    }

    public final int getWidgetTxnFetchCount() {
        return this.widgetTxnFetchCount;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig getUiConfig() {
        return this.uiConfig;
    }

    public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig getContentConfig() {
        return this.contentConfig;
    }

    public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig getFiltersConfig() {
        return this.filtersConfig;
    }

    public final com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetClickHandler getWidgetClickHandler() {
        return this.widgetClickHandler;
    }

    public final com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetDataTransformer getDataTransformer() {
        return this.dataTransformer;
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010$R\u0016\u0010(\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010&\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration$Builder;", "", "", "source", "<init>", "(Ljava/lang/String;)V", "", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "setWidgetTxnFetchCount", "(I)Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration$Builder;", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetUIConfig;", "config", "setUiConfig", "(Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetUIConfig;)Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration$Builder;", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetContentConfig;", "setContentConfig", "(Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetContentConfig;)Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration$Builder;", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFiltersConfig;", "setFiltersConfig", "(Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFiltersConfig;)Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration$Builder;", "Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetClickHandler;", "handler", "setWidgetClickHandler", "(Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetClickHandler;)Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration$Builder;", "Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetDataTransformer;", "dataTransformer", "setWidgetDataTransformer", "(Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetDataTransformer;)Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration$Builder;", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;", "build", "()Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getOutputFormats", com.visa.cbp.getEncExpo.warmup, "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetUIConfig;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetContentConfig;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetFiltersConfig;", "Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetClickHandler;", "getHighSpeedVideoSizesFor", "getInputFormats", "Lcom/paypal/oslo/feature/activity/api/widget/interfaces/IActivityWidgetDataTransformer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig getHighSpeedVideoFpsRanges;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetClickHandler getHighSpeedVideoSizesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRangesFor;
        private com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetDataTransformer getInputFormats;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private int getHighSpeedVideoSizes;

        public Builder(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoSizes = 3;
            this.Camera2StreamConfigurationMap = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig(false, null, false, null, false, 31, null);
            this.getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 127, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            this.getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig((java.util.Date) null, (java.util.Date) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, 16777215, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.Builder setWidgetTxnFetchCount(int count) {
            this.getHighSpeedVideoSizes = count;
            return this;
        }

        public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.Builder setUiConfig(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            this.Camera2StreamConfigurationMap = config;
            return this;
        }

        public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.Builder setContentConfig(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            this.getHighResolutionOutputSizeshNQ4ISI = config;
            return this;
        }

        public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.Builder setFiltersConfig(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            this.getHighSpeedVideoFpsRanges = config;
            return this;
        }

        public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.Builder setWidgetClickHandler(com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetClickHandler handler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
            this.getHighSpeedVideoSizesFor = handler;
            return this;
        }

        public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.Builder setWidgetDataTransformer(com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetDataTransformer dataTransformer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataTransformer, "");
            this.getInputFormats = dataTransformer;
            return this;
        }

        public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration build() {
            return new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, this.getInputFormats, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration$Companion;", "", "<init>", "()V", "", "source", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;", "defaultConfig", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration;", "Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration$Builder;", "builder", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/api/widget/configs/ActivityWidgetConfiguration$Builder;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration defaultConfig(java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.Builder(source).build();
        }

        public final com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.Builder builder(java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.Builder(source);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ActivityWidgetConfiguration(int i, java.lang.String str, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig activityWidgetUIConfig, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig activityWidgetContentConfig, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig activityWidgetFiltersConfig, com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetClickHandler iActivityWidgetClickHandler, com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetDataTransformer iActivityWidgetDataTransformer, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, activityWidgetUIConfig, activityWidgetContentConfig, activityWidgetFiltersConfig, iActivityWidgetClickHandler, iActivityWidgetDataTransformer);
    }
}
