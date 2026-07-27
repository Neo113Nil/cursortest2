package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class InternalModuleEvent {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f8810a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8811b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8812c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f8813d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f8814e;
    private final List f;

    /* renamed from: g, reason: collision with root package name */
    private final List f8815g;

    /* renamed from: h, reason: collision with root package name */
    private final List f8816h;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f8817a;

        /* renamed from: b, reason: collision with root package name */
        private String f8818b;

        /* renamed from: c, reason: collision with root package name */
        private String f8819c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f8820d;

        /* renamed from: e, reason: collision with root package name */
        private Category f8821e;
        private Map f;

        /* renamed from: g, reason: collision with root package name */
        private Map f8822g;

        /* renamed from: h, reason: collision with root package name */
        private Map f8823h;

        public Builder(int i3) {
            this.f8817a = i3;
        }

        public InternalModuleEvent build() {
            return new InternalModuleEvent(this, null);
        }

        public final Map<String, Object> getAttributes() {
            return this.f8823h;
        }

        public final Category getCategory() {
            return this.f8821e;
        }

        public final Map<String, Object> getEnvironment() {
            return this.f;
        }

        public final Map<String, byte[]> getExtras() {
            return this.f8822g;
        }

        public final String getName() {
            return this.f8818b;
        }

        public final Integer getServiceDataReporterType() {
            return this.f8820d;
        }

        public final int getType$modules_api_release() {
            return this.f8817a;
        }

        public final String getValue() {
            return this.f8819c;
        }

        public final void setAttributes(Map<String, ? extends Object> map) {
            this.f8823h = map;
        }

        public final void setCategory(Category category) {
            this.f8821e = category;
        }

        public final void setEnvironment(Map<String, ? extends Object> map) {
            this.f = map;
        }

        public final void setExtras(Map<String, byte[]> map) {
            this.f8822g = map;
        }

        public final void setName(String str) {
            this.f8818b = str;
        }

        public final void setServiceDataReporterType(Integer num) {
            this.f8820d = num;
        }

        public final void setValue(String str) {
            this.f8819c = str;
        }

        public final Builder withAttributes(Map<String, ? extends Object> map) {
            if (map != null) {
                this.f8823h = new HashMap(map);
            }
            return this;
        }

        public final Builder withCategory(Category category) {
            this.f8821e = category;
            return this;
        }

        public final Builder withEnvironment(Map<String, ? extends Object> map) {
            if (map != null) {
                this.f = new HashMap(map);
            }
            return this;
        }

        public final Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f8822g = new HashMap(map);
            }
            return this;
        }

        public final Builder withName(String str) {
            this.f8818b = str;
            return this;
        }

        public final Builder withServiceDataReporterType(int i3) {
            this.f8820d = Integer.valueOf(i3);
            return this;
        }

        public final Builder withValue(String str) {
            this.f8819c = str;
            return this;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Builder newBuilder(int i3) {
            return new Builder(i3);
        }

        private Companion() {
        }
    }

    public /* synthetic */ InternalModuleEvent(Builder builder, f fVar) {
        this(builder);
    }

    public static final Builder newBuilder(int i3) {
        return Companion.newBuilder(i3);
    }

    public final Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f8816h);
    }

    public final Category getCategory() {
        return this.f8814e;
    }

    public final Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f);
    }

    public final Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f8815g);
    }

    public final String getName() {
        return this.f8811b;
    }

    public final Integer getServiceDataReporterType() {
        return this.f8813d;
    }

    public final int getType() {
        return this.f8810a;
    }

    public final String getValue() {
        return this.f8812c;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.f8810a + ", name='" + this.f8811b + "', value='" + this.f8812c + "', serviceDataReporterType=" + this.f8813d + ", category=" + this.f8814e + ", environment=" + this.f + ", extras=" + this.f8815g + ", attributes=" + this.f8816h + '}';
    }

    private InternalModuleEvent(Builder builder) {
        this.f8810a = builder.getType$modules_api_release();
        this.f8811b = builder.getName();
        this.f8812c = builder.getValue();
        this.f8813d = builder.getServiceDataReporterType();
        this.f8814e = builder.getCategory();
        this.f = CollectionUtils.getListFromMap(builder.getEnvironment());
        this.f8815g = CollectionUtils.getListFromMap(builder.getExtras());
        this.f8816h = CollectionUtils.getListFromMap(builder.getAttributes());
    }
}
