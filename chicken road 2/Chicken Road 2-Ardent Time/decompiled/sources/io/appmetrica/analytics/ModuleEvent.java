package io.appmetrica.analytics;

/* loaded from: classes.dex */
public final class ModuleEvent {

    /* renamed from: a, reason: collision with root package name */
    private final int f3375a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f3376b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f3377c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3378d;

    /* renamed from: e, reason: collision with root package name */
    private final io.appmetrica.analytics.ModuleEvent.Category f3379e;

    /* renamed from: f, reason: collision with root package name */
    private final java.util.List f3380f;

    /* renamed from: g, reason: collision with root package name */
    private final java.util.List f3381g;

    /* renamed from: h, reason: collision with root package name */
    private final java.util.List f3382h;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f3383a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f3384b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.String f3385c;

        /* renamed from: d, reason: collision with root package name */
        private int f3386d;

        /* renamed from: e, reason: collision with root package name */
        private io.appmetrica.analytics.ModuleEvent.Category f3387e;

        /* renamed from: f, reason: collision with root package name */
        private java.util.HashMap f3388f;

        /* renamed from: g, reason: collision with root package name */
        private java.util.HashMap f3389g;

        /* renamed from: h, reason: collision with root package name */
        private java.util.HashMap f3390h;

        public /* synthetic */ Builder(int i2, int i3) {
            this(i2);
        }

        public io.appmetrica.analytics.ModuleEvent build() {
            return new io.appmetrica.analytics.ModuleEvent(this, 0);
        }

        public io.appmetrica.analytics.ModuleEvent.Builder withAttributes(java.util.Map<java.lang.String, java.lang.Object> map) {
            if (map != null) {
                this.f3390h = new java.util.HashMap(map);
            }
            return this;
        }

        public io.appmetrica.analytics.ModuleEvent.Builder withCategory(io.appmetrica.analytics.ModuleEvent.Category category) {
            this.f3387e = category;
            return this;
        }

        public io.appmetrica.analytics.ModuleEvent.Builder withEnvironment(java.util.Map<java.lang.String, java.lang.Object> map) {
            if (map != null) {
                this.f3388f = new java.util.HashMap(map);
            }
            return this;
        }

        public io.appmetrica.analytics.ModuleEvent.Builder withExtras(java.util.Map<java.lang.String, byte[]> map) {
            if (map != null) {
                this.f3389g = new java.util.HashMap(map);
            }
            return this;
        }

        public io.appmetrica.analytics.ModuleEvent.Builder withName(java.lang.String str) {
            this.f3384b = str;
            return this;
        }

        public io.appmetrica.analytics.ModuleEvent.Builder withServiceDataReporterType(int i2) {
            this.f3386d = i2;
            return this;
        }

        public io.appmetrica.analytics.ModuleEvent.Builder withValue(java.lang.String str) {
            this.f3385c = str;
            return this;
        }

        private Builder(int i2) {
            this.f3386d = 1;
            this.f3387e = io.appmetrica.analytics.ModuleEvent.Category.GENERAL;
            this.f3383a = i2;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    public /* synthetic */ ModuleEvent(io.appmetrica.analytics.ModuleEvent.Builder builder, int i2) {
        this(builder);
    }

    public static io.appmetrica.analytics.ModuleEvent.Builder newBuilder(int i2) {
        return new io.appmetrica.analytics.ModuleEvent.Builder(i2, 0);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getAttributes() {
        return io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getMapFromListOrNull(this.f3382h);
    }

    public io.appmetrica.analytics.ModuleEvent.Category getCategory() {
        return this.f3379e;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getEnvironment() {
        return io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getMapFromListOrNull(this.f3380f);
    }

    public java.util.Map<java.lang.String, byte[]> getExtras() {
        return io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getMapFromListOrNull(this.f3381g);
    }

    public java.lang.String getName() {
        return this.f3376b;
    }

    public int getServiceDataReporterType() {
        return this.f3378d;
    }

    public int getType() {
        return this.f3375a;
    }

    public java.lang.String getValue() {
        return this.f3377c;
    }

    public java.lang.String toString() {
        return "ModuleEvent{type=" + this.f3375a + ", name='" + this.f3376b + "', value='" + this.f3377c + "', serviceDataReporterType=" + this.f3378d + ", category=" + this.f3379e + ", environment=" + this.f3380f + ", extras=" + this.f3381g + ", attributes=" + this.f3382h + '}';
    }

    private ModuleEvent(io.appmetrica.analytics.ModuleEvent.Builder builder) {
        this.f3375a = builder.f3383a;
        this.f3376b = builder.f3384b;
        this.f3377c = builder.f3385c;
        this.f3378d = builder.f3386d;
        this.f3379e = builder.f3387e;
        this.f3380f = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getListFromMap(builder.f3388f);
        this.f3381g = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getListFromMap(builder.f3389g);
        this.f3382h = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getListFromMap(builder.f3390h);
    }
}
