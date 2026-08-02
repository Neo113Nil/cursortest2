package com.datadog.trace.bootstrap.config.provider;

/* loaded from: classes3.dex */
final class PropertiesConfigSource extends com.datadog.trace.bootstrap.config.provider.ConfigProvider.Source {
    final java.util.Properties getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes = false;

    public PropertiesConfigSource(java.util.Properties properties) {
        this.getHighSpeedVideoFpsRangesFor = properties;
    }

    @Override // com.datadog.trace.bootstrap.config.provider.ConfigProvider.Source
    protected final java.lang.String get(java.lang.String str) {
        java.util.Properties properties = this.getHighSpeedVideoFpsRangesFor;
        if (this.getHighSpeedVideoSizes) {
            str = com.datadog.trace.util.Strings.propertyNameToSystemPropertyName(str);
        }
        return properties.getProperty(str);
    }

    @Override // com.datadog.trace.bootstrap.config.provider.ConfigProvider.Source
    public final com.datadog.trace.api.ConfigOrigin origin() {
        return com.datadog.trace.api.ConfigOrigin.JVM_PROP;
    }
}
