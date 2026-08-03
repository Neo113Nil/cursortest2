package io.appmetrica.analytics.plugins;

/* loaded from: classes.dex */
public class PluginErrorDetails {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f7432a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f7433b;

    /* renamed from: c, reason: collision with root package name */
    private final java.util.ArrayList f7434c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.String f7435d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.String f7436e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.Map f7437f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.String f7438a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f7439b;

        /* renamed from: c, reason: collision with root package name */
        private java.util.List f7440c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f7441d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f7442e;

        /* renamed from: f, reason: collision with root package name */
        private java.util.Map f7443f;

        public io.appmetrica.analytics.plugins.PluginErrorDetails build() {
            return new io.appmetrica.analytics.plugins.PluginErrorDetails(this.f7438a, this.f7439b, (java.util.List) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(this.f7440c, new java.util.ArrayList()), this.f7441d, this.f7442e, (java.util.Map) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(this.f7443f, new java.util.HashMap()), 0);
        }

        public io.appmetrica.analytics.plugins.PluginErrorDetails.Builder withExceptionClass(java.lang.String str) {
            this.f7438a = str;
            return this;
        }

        public io.appmetrica.analytics.plugins.PluginErrorDetails.Builder withMessage(java.lang.String str) {
            this.f7439b = str;
            return this;
        }

        public io.appmetrica.analytics.plugins.PluginErrorDetails.Builder withPlatform(java.lang.String str) {
            this.f7441d = str;
            return this;
        }

        public io.appmetrica.analytics.plugins.PluginErrorDetails.Builder withPluginEnvironment(java.util.Map<java.lang.String, java.lang.String> map) {
            this.f7443f = map;
            return this;
        }

        public io.appmetrica.analytics.plugins.PluginErrorDetails.Builder withStacktrace(java.util.List<io.appmetrica.analytics.plugins.StackTraceItem> list) {
            this.f7440c = list;
            return this;
        }

        public io.appmetrica.analytics.plugins.PluginErrorDetails.Builder withVirtualMachineVersion(java.lang.String str) {
            this.f7442e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final java.lang.String CORDOVA = "cordova";
        public static final java.lang.String FLUTTER = "flutter";
        public static final java.lang.String NATIVE = "native";
        public static final java.lang.String REACT_NATIVE = "react_native";
        public static final java.lang.String UNITY = "unity";
        public static final java.lang.String XAMARIN = "xamarin";
    }

    public /* synthetic */ PluginErrorDetails(java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.String str4, java.util.Map map, int i2) {
        this(str, str2, list, str3, str4, map);
    }

    public java.lang.String getExceptionClass() {
        return this.f7432a;
    }

    public java.lang.String getMessage() {
        return this.f7433b;
    }

    public java.lang.String getPlatform() {
        return this.f7435d;
    }

    public java.util.Map<java.lang.String, java.lang.String> getPluginEnvironment() {
        return this.f7437f;
    }

    public java.util.List<io.appmetrica.analytics.plugins.StackTraceItem> getStacktrace() {
        return this.f7434c;
    }

    public java.lang.String getVirtualMachineVersion() {
        return this.f7436e;
    }

    private PluginErrorDetails(java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.String str4, java.util.Map map) {
        this.f7432a = str;
        this.f7433b = str2;
        this.f7434c = new java.util.ArrayList(list);
        this.f7435d = str3;
        this.f7436e = str4;
        this.f7437f = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getMapFromList(io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getListFromMap(map));
    }
}
