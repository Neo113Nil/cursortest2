package io.appmetrica.analytics.modulesapi.internal.common;

/* loaded from: classes.dex */
public final class InternalModuleEvent {
    public static final io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Companion Companion = new io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f7291a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f7292b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f7293c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.Integer f7294d;

    /* renamed from: e, reason: collision with root package name */
    private final io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Category f7295e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.List f7296f;

    /* renamed from: g, reason: collision with root package name */
    private final java.util.List f7297g;

    /* renamed from: h, reason: collision with root package name */
    private final java.util.List f7298h;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f7299a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f7300b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f7301c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.Integer f7302d;

        /* renamed from: e, reason: collision with root package name */
        private io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Category f7303e;

        /* renamed from: f, reason: collision with root package name */
        private java.util.Map f7304f;

        /* renamed from: g, reason: collision with root package name */
        private java.util.Map f7305g;

        /* renamed from: h, reason: collision with root package name */
        private java.util.Map f7306h;

        public Builder(int i2) {
            this.f7299a = i2;
        }

        public io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent build() {
            return new io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent(this, null);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
            return this.f7306h;
        }

        public final io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Category getCategory() {
            return this.f7303e;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getEnvironment() {
            return this.f7304f;
        }

        public final java.util.Map<java.lang.String, byte[]> getExtras() {
            return this.f7305g;
        }

        public final java.lang.String getName() {
            return this.f7300b;
        }

        public final java.lang.Integer getServiceDataReporterType() {
            return this.f7302d;
        }

        public final int getType$modules_api_release() {
            return this.f7299a;
        }

        public final java.lang.String getValue() {
            return this.f7301c;
        }

        public final void setAttributes(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            this.f7306h = map;
        }

        public final void setCategory(io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Category category) {
            this.f7303e = category;
        }

        public final void setEnvironment(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            this.f7304f = map;
        }

        public final void setExtras(java.util.Map<java.lang.String, byte[]> map) {
            this.f7305g = map;
        }

        public final void setName(java.lang.String str) {
            this.f7300b = str;
        }

        public final void setServiceDataReporterType(java.lang.Integer num) {
            this.f7302d = num;
        }

        public final void setValue(java.lang.String str) {
            this.f7301c = str;
        }

        public final io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Builder withAttributes(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            if (map != null) {
                this.f7306h = new java.util.HashMap(map);
            }
            return this;
        }

        public final io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Builder withCategory(io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Category category) {
            this.f7303e = category;
            return this;
        }

        public final io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Builder withEnvironment(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            if (map != null) {
                this.f7304f = new java.util.HashMap(map);
            }
            return this;
        }

        public final io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Builder withExtras(java.util.Map<java.lang.String, byte[]> map) {
            if (map != null) {
                this.f7305g = new java.util.HashMap(map);
            }
            return this;
        }

        public final io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Builder withName(java.lang.String str) {
            this.f7300b = str;
            return this;
        }

        public final io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Builder withServiceDataReporterType(int i2) {
            this.f7302d = java.lang.Integer.valueOf(i2);
            return this;
        }

        public final io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Builder withValue(java.lang.String str) {
            this.f7301c = str;
            return this;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Builder newBuilder(int i2) {
            return new io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Builder(i2);
        }

        private Companion() {
        }
    }

    public /* synthetic */ InternalModuleEvent(io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Builder builder, kotlin.jvm.internal.e eVar) {
        this(builder);
    }

    public static final io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Builder newBuilder(int i2) {
        return Companion.newBuilder(i2);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
        return io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getMapFromListOrNull(this.f7298h);
    }

    public final io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Category getCategory() {
        return this.f7295e;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getEnvironment() {
        return io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getMapFromListOrNull(this.f7296f);
    }

    public final java.util.Map<java.lang.String, byte[]> getExtras() {
        return io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getMapFromListOrNull(this.f7297g);
    }

    public final java.lang.String getName() {
        return this.f7292b;
    }

    public final java.lang.Integer getServiceDataReporterType() {
        return this.f7294d;
    }

    public final int getType() {
        return this.f7291a;
    }

    public final java.lang.String getValue() {
        return this.f7293c;
    }

    public java.lang.String toString() {
        return "ModuleEvent{type=" + this.f7291a + ", name='" + this.f7292b + "', value='" + this.f7293c + "', serviceDataReporterType=" + this.f7294d + ", category=" + this.f7295e + ", environment=" + this.f7296f + ", extras=" + this.f7297g + ", attributes=" + this.f7298h + '}';
    }

    private InternalModuleEvent(io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Builder builder) {
        this.f7291a = builder.getType$modules_api_release();
        this.f7292b = builder.getName();
        this.f7293c = builder.getValue();
        this.f7294d = builder.getServiceDataReporterType();
        this.f7295e = builder.getCategory();
        this.f7296f = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getListFromMap(builder.getEnvironment());
        this.f7297g = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getListFromMap(builder.getExtras());
        this.f7298h = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getListFromMap(builder.getAttributes());
    }
}
