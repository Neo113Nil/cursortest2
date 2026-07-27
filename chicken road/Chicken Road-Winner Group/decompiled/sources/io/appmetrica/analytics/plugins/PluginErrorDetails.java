package io.appmetrica.analytics.plugins;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class PluginErrorDetails {

    /* renamed from: a, reason: collision with root package name */
    private final String f8928a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8929b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f8930c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8931d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8932e;
    private final Map f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f8933a;

        /* renamed from: b, reason: collision with root package name */
        private String f8934b;

        /* renamed from: c, reason: collision with root package name */
        private List f8935c;

        /* renamed from: d, reason: collision with root package name */
        private String f8936d;

        /* renamed from: e, reason: collision with root package name */
        private String f8937e;
        private Map f;

        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f8933a, this.f8934b, (List) WrapUtils.getOrDefault(this.f8935c, new ArrayList()), this.f8936d, this.f8937e, (Map) WrapUtils.getOrDefault(this.f, new HashMap()), 0);
        }

        public Builder withExceptionClass(String str) {
            this.f8933a = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.f8934b = str;
            return this;
        }

        public Builder withPlatform(String str) {
            this.f8936d = str;
            return this;
        }

        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f = map;
            return this;
        }

        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f8935c = list;
            return this;
        }

        public Builder withVirtualMachineVersion(String str) {
            this.f8937e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i3) {
        this(str, str2, list, str3, str4, map);
    }

    public String getExceptionClass() {
        return this.f8928a;
    }

    public String getMessage() {
        return this.f8929b;
    }

    public String getPlatform() {
        return this.f8931d;
    }

    public Map<String, String> getPluginEnvironment() {
        return this.f;
    }

    public List<StackTraceItem> getStacktrace() {
        return this.f8930c;
    }

    public String getVirtualMachineVersion() {
        return this.f8932e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f8928a = str;
        this.f8929b = str2;
        this.f8930c = new ArrayList(list);
        this.f8931d = str3;
        this.f8932e = str4;
        this.f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
