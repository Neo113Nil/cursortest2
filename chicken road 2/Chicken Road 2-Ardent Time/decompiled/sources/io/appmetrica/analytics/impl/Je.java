package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Je {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.M9 f4501a;

    public Je(io.appmetrica.analytics.impl.M9 m9) {
        this.f4501a = m9;
    }

    public final io.appmetrica.analytics.impl.Qn a(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        java.util.ArrayList arrayList;
        java.lang.String exceptionClass = pluginErrorDetails.getExceptionClass();
        java.lang.String message = pluginErrorDetails.getMessage();
        java.util.List<io.appmetrica.analytics.plugins.StackTraceItem> stacktrace = pluginErrorDetails.getStacktrace();
        java.lang.String platform = pluginErrorDetails.getPlatform();
        java.lang.String virtualMachineVersion = pluginErrorDetails.getVirtualMachineVersion();
        java.util.Map<java.lang.String, java.lang.String> pluginEnvironment = pluginErrorDetails.getPluginEnvironment();
        java.lang.String str = (java.lang.String) this.f4501a.f4654b.a();
        java.lang.Boolean bool = (java.lang.Boolean) this.f4501a.f4655c.a();
        if (stacktrace != null) {
            arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(stacktrace));
            for (io.appmetrica.analytics.plugins.StackTraceItem stackTraceItem : stacktrace) {
                arrayList.add(new io.appmetrica.analytics.impl.Dl(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), null));
            }
        } else {
            arrayList = null;
        }
        return new io.appmetrica.analytics.impl.Qn(new io.appmetrica.analytics.impl.Gn(exceptionClass, message, arrayList, null, null), null, null, platform, virtualMachineVersion, pluginEnvironment, str, bool);
    }
}
