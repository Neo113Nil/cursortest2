package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class PreloadInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f5901a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f5902b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f5903a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f5904b;

        public /* synthetic */ Builder(String str, int i2) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f5904b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f5903a = str;
            this.f5904b = new HashMap();
        }
    }

    public /* synthetic */ PreloadInfo(Builder builder, int i2) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f5902b;
    }

    public String getTrackingId() {
        return this.f5901a;
    }

    private PreloadInfo(Builder builder) {
        this.f5901a = builder.f5903a;
        this.f5902b = CollectionUtils.unmodifiableMapCopy(builder.f5904b);
    }
}
