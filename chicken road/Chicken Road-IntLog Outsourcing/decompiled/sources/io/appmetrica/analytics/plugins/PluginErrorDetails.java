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
    private final String f9906a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9907b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f9908c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9909d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9910e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f9911f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f9912a;

        /* renamed from: b, reason: collision with root package name */
        private String f9913b;

        /* renamed from: c, reason: collision with root package name */
        private List f9914c;

        /* renamed from: d, reason: collision with root package name */
        private String f9915d;

        /* renamed from: e, reason: collision with root package name */
        private String f9916e;

        /* renamed from: f, reason: collision with root package name */
        private Map f9917f;

        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f9912a, this.f9913b, (List) WrapUtils.getOrDefault(this.f9914c, new ArrayList()), this.f9915d, this.f9916e, (Map) WrapUtils.getOrDefault(this.f9917f, new HashMap()), 0);
        }

        public Builder withExceptionClass(String str) {
            this.f9912a = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.f9913b = str;
            return this;
        }

        public Builder withPlatform(String str) {
            this.f9915d = str;
            return this;
        }

        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f9917f = map;
            return this;
        }

        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f9914c = list;
            return this;
        }

        public Builder withVirtualMachineVersion(String str) {
            this.f9916e = str;
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

    public /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i2) {
        this(str, str2, list, str3, str4, map);
    }

    public String getExceptionClass() {
        return this.f9906a;
    }

    public String getMessage() {
        return this.f9907b;
    }

    public String getPlatform() {
        return this.f9909d;
    }

    public Map<String, String> getPluginEnvironment() {
        return this.f9911f;
    }

    public List<StackTraceItem> getStacktrace() {
        return this.f9908c;
    }

    public String getVirtualMachineVersion() {
        return this.f9910e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f9906a = str;
        this.f9907b = str2;
        this.f9908c = new ArrayList(list);
        this.f9909d = str3;
        this.f9910e = str4;
        this.f9911f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
