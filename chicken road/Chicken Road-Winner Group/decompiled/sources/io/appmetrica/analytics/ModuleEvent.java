package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ModuleEvent {

    /* renamed from: a, reason: collision with root package name */
    private final int f5082a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5083b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5084c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5085d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f5086e;
    private final List f;

    /* renamed from: g, reason: collision with root package name */
    private final List f5087g;

    /* renamed from: h, reason: collision with root package name */
    private final List f5088h;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f5089a;

        /* renamed from: b, reason: collision with root package name */
        private String f5090b;

        /* renamed from: c, reason: collision with root package name */
        private String f5091c;

        /* renamed from: d, reason: collision with root package name */
        private int f5092d;

        /* renamed from: e, reason: collision with root package name */
        private Category f5093e;
        private HashMap f;

        /* renamed from: g, reason: collision with root package name */
        private HashMap f5094g;

        /* renamed from: h, reason: collision with root package name */
        private HashMap f5095h;

        public /* synthetic */ Builder(int i3, int i4) {
            this(i3);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(Map<String, Object> map) {
            if (map != null) {
                this.f5095h = new HashMap(map);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.f5093e = category;
            return this;
        }

        public Builder withEnvironment(Map<String, Object> map) {
            if (map != null) {
                this.f = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f5094g = new HashMap(map);
            }
            return this;
        }

        public Builder withName(String str) {
            this.f5090b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i3) {
            this.f5092d = i3;
            return this;
        }

        public Builder withValue(String str) {
            this.f5091c = str;
            return this;
        }

        private Builder(int i3) {
            this.f5092d = 1;
            this.f5093e = Category.GENERAL;
            this.f5089a = i3;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    public /* synthetic */ ModuleEvent(Builder builder, int i3) {
        this(builder);
    }

    public static Builder newBuilder(int i3) {
        return new Builder(i3, 0);
    }

    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f5088h);
    }

    public Category getCategory() {
        return this.f5086e;
    }

    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f);
    }

    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f5087g);
    }

    public String getName() {
        return this.f5083b;
    }

    public int getServiceDataReporterType() {
        return this.f5085d;
    }

    public int getType() {
        return this.f5082a;
    }

    public String getValue() {
        return this.f5084c;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.f5082a + ", name='" + this.f5083b + "', value='" + this.f5084c + "', serviceDataReporterType=" + this.f5085d + ", category=" + this.f5086e + ", environment=" + this.f + ", extras=" + this.f5087g + ", attributes=" + this.f5088h + '}';
    }

    private ModuleEvent(Builder builder) {
        this.f5082a = builder.f5089a;
        this.f5083b = builder.f5090b;
        this.f5084c = builder.f5091c;
        this.f5085d = builder.f5092d;
        this.f5086e = builder.f5093e;
        this.f = CollectionUtils.getListFromMap(builder.f);
        this.f5087g = CollectionUtils.getListFromMap(builder.f5094g);
        this.f5088h = CollectionUtils.getListFromMap(builder.f5095h);
    }
}
