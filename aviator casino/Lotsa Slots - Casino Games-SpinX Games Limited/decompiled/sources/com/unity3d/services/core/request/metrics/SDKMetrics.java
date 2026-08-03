package com.unity3d.services.core.request.metrics;

/* loaded from: classes6.dex */
public final class SDKMetrics {
    private static final java.lang.String NULL_INSTANCE_METRICS_URL = "nullInstanceMetricsUrl";
    private static com.unity3d.services.core.request.metrics.MetricSenderWithBatch _batchedSender;
    private static final java.util.concurrent.atomic.AtomicBoolean _configurationIsSet = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.unity3d.services.core.request.metrics.SDKMetricsSender _instance;

    public static void setConfiguration(com.unity3d.services.core.configuration.Configuration configuration) {
        com.unity3d.ads.core.log.Logger logger = (com.unity3d.ads.core.log.Logger) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.ads.core.log.Logger.class);
        if (configuration == null) {
            logger.debug("Metrics will not be sent from the device for this session due to misconfiguration");
            return;
        }
        if (isAllowedToSetConfiguration(configuration)) {
            com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender = _instance;
            if (sDKMetricsSender instanceof com.unity3d.services.core.request.metrics.MetricSender) {
                ((com.unity3d.services.core.request.metrics.MetricSender) sDKMetricsSender).shutdown();
            }
            if (configuration.areMetricsEnabledForCurrentSession().booleanValue()) {
                _instance = new com.unity3d.services.core.request.metrics.MetricSender(configuration, new com.unity3d.services.core.properties.InitializationStatusReader(), logger);
            } else {
                logger.debug("Metrics will not be sent from the device for this session");
                _instance = new com.unity3d.services.core.request.metrics.SDKMetrics.NullInstance(NULL_INSTANCE_METRICS_URL);
            }
            com.unity3d.services.core.request.metrics.MetricSenderWithBatch metricSenderWithBatch = _batchedSender;
            if (metricSenderWithBatch == null) {
                _batchedSender = new com.unity3d.services.core.request.metrics.MetricSenderWithBatch(_instance, new com.unity3d.services.core.properties.InitializationStatusReader());
            } else {
                metricSenderWithBatch.updateOriginal(_instance);
            }
            _batchedSender.sendQueueIfNeeded();
        }
    }

    public static synchronized com.unity3d.services.core.request.metrics.SDKMetricsSender getInstance() {
        com.unity3d.services.core.request.metrics.MetricSenderWithBatch metricSenderWithBatch;
        synchronized (com.unity3d.services.core.request.metrics.SDKMetrics.class) {
            if (_instance == null) {
                _instance = new com.unity3d.services.core.request.metrics.SDKMetrics.NullInstance(null);
            }
            if (_batchedSender == null) {
                _batchedSender = new com.unity3d.services.core.request.metrics.MetricSenderWithBatch(_instance, new com.unity3d.services.core.properties.InitializationStatusReader());
            }
            metricSenderWithBatch = _batchedSender;
        }
        return metricSenderWithBatch;
    }

    private static boolean isAllowedToSetConfiguration(com.unity3d.services.core.configuration.Configuration configuration) {
        return !android.text.TextUtils.isEmpty(configuration.getMetricsUrl()) && _configurationIsSet.compareAndSet(false, true);
    }

    private static final class NullInstance implements com.unity3d.services.core.request.metrics.SDKMetricsSender {
        private com.unity3d.ads.core.log.Logger _logger;
        private final java.lang.String _metricEndpoint;

        public NullInstance(java.lang.String str) {
            this._metricEndpoint = str;
        }

        private com.unity3d.ads.core.log.Logger getLogger() {
            if (this._logger == null) {
                this._logger = (com.unity3d.ads.core.log.Logger) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.ads.core.log.Logger.class);
            }
            return this._logger;
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendEvent(java.lang.String str) {
            getLogger().debug("Metric " + str + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendEvent(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
            sendEvent(str);
        }

        public void sendEvent(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
            sendEvent(str);
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetric(com.unity3d.services.core.request.metrics.Metric metric) {
            getLogger().debug("Metric " + metric + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetrics(java.util.List<com.unity3d.services.core.request.metrics.Metric> list) {
            getLogger().debug("Metrics: " + list + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public void sendMetricWithInitState(com.unity3d.services.core.request.metrics.Metric metric) {
            sendMetric(metric);
        }

        @Override // com.unity3d.services.core.request.metrics.SDKMetricsSender
        public java.lang.String getMetricEndPoint() {
            return this._metricEndpoint;
        }
    }
}
