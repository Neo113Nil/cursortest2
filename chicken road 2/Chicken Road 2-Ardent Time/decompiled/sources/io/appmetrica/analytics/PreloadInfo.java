package io.appmetrica.analytics;

/* loaded from: classes.dex */
public class PreloadInfo {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3393a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.Map f3394b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f3395a;

        /* renamed from: b, reason: collision with root package name */
        private final java.util.HashMap f3396b;

        public /* synthetic */ Builder(java.lang.String str, int i2) {
            this(str);
        }

        public io.appmetrica.analytics.PreloadInfo build() {
            return new io.appmetrica.analytics.PreloadInfo(this, 0);
        }

        public io.appmetrica.analytics.PreloadInfo.Builder setAdditionalParams(java.lang.String str, java.lang.String str2) {
            if (str != null && str2 != null) {
                this.f3396b.put(str, str2);
            }
            return this;
        }

        private Builder(java.lang.String str) {
            this.f3395a = str;
            this.f3396b = new java.util.HashMap();
        }
    }

    public /* synthetic */ PreloadInfo(io.appmetrica.analytics.PreloadInfo.Builder builder, int i2) {
        this(builder);
    }

    public static io.appmetrica.analytics.PreloadInfo.Builder newBuilder(java.lang.String str) {
        return new io.appmetrica.analytics.PreloadInfo.Builder(str, 0);
    }

    public java.util.Map<java.lang.String, java.lang.String> getAdditionalParams() {
        return this.f3394b;
    }

    public java.lang.String getTrackingId() {
        return this.f3393a;
    }

    private PreloadInfo(io.appmetrica.analytics.PreloadInfo.Builder builder) {
        this.f3393a = builder.f3395a;
        this.f3394b = io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableMapCopy(builder.f3396b);
    }
}
