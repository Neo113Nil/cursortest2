package io.appmetrica.analytics.plugins;

/* loaded from: classes.dex */
public interface IPluginReporter {
    void reportError(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails, java.lang.String str);

    void reportError(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails);

    void reportUnhandledException(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails);
}
