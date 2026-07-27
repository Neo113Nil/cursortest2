package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ModuleEvent {

    /* renamed from: a, reason: collision with root package name */
    private final int f5883a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5884b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5885c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5886d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f5887e;

    /* renamed from: f, reason: collision with root package name */
    private final List f5888f;

    /* renamed from: g, reason: collision with root package name */
    private final List f5889g;

    /* renamed from: h, reason: collision with root package name */
    private final List f5890h;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f5891a;

        /* renamed from: b, reason: collision with root package name */
        private String f5892b;

        /* renamed from: c, reason: collision with root package name */
        private String f5893c;

        /* renamed from: d, reason: collision with root package name */
        private int f5894d;

        /* renamed from: e, reason: collision with root package name */
        private Category f5895e;

        /* renamed from: f, reason: collision with root package name */
        private HashMap f5896f;

        /* renamed from: g, reason: collision with root package name */
        private HashMap f5897g;

        /* renamed from: h, reason: collision with root package name */
        private HashMap f5898h;

        public /* synthetic */ Builder(int i2, int i3) {
            this(i2);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(Map<String, Object> map) {
            if (map != null) {
                this.f5898h = new HashMap(map);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.f5895e = category;
            return this;
        }

        public Builder withEnvironment(Map<String, Object> map) {
            if (map != null) {
                this.f5896f = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f5897g = new HashMap(map);
            }
            return this;
        }

        public Builder withName(String str) {
            this.f5892b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i2) {
            this.f5894d = i2;
            return this;
        }

        public Builder withValue(String str) {
            this.f5893c = str;
            return this;
        }

        private Builder(int i2) {
            this.f5894d = 1;
            this.f5895e = Category.GENERAL;
            this.f5891a = i2;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    public /* synthetic */ ModuleEvent(Builder builder, int i2) {
        this(builder);
    }

    public static Builder newBuilder(int i2) {
        return new Builder(i2, 0);
    }

    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f5890h);
    }

    public Category getCategory() {
        return this.f5887e;
    }

    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f5888f);
    }

    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f5889g);
    }

    public String getName() {
        return this.f5884b;
    }

    public int getServiceDataReporterType() {
        return this.f5886d;
    }

    public int getType() {
        return this.f5883a;
    }

    public String getValue() {
        return this.f5885c;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.f5883a + ", name='" + this.f5884b + "', value='" + this.f5885c + "', serviceDataReporterType=" + this.f5886d + ", category=" + this.f5887e + ", environment=" + this.f5888f + ", extras=" + this.f5889g + ", attributes=" + this.f5890h + '}';
    }

    private ModuleEvent(Builder builder) {
        this.f5883a = builder.f5891a;
        this.f5884b = builder.f5892b;
        this.f5885c = builder.f5893c;
        this.f5886d = builder.f5894d;
        this.f5887e = builder.f5895e;
        this.f5888f = CollectionUtils.getListFromMap(builder.f5896f);
        this.f5889g = CollectionUtils.getListFromMap(builder.f5897g);
        this.f5890h = CollectionUtils.getListFromMap(builder.f5898h);
    }
}
