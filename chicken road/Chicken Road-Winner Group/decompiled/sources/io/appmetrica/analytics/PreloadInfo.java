package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class PreloadInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f5098a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f5099b;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f5100a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f5101b;

        public /* synthetic */ Builder(String str, int i3) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f5101b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f5100a = str;
            this.f5101b = new HashMap();
        }
    }

    public /* synthetic */ PreloadInfo(Builder builder, int i3) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f5099b;
    }

    public String getTrackingId() {
        return this.f5098a;
    }

    private PreloadInfo(Builder builder) {
        this.f5098a = builder.f5100a;
        this.f5099b = CollectionUtils.unmodifiableMapCopy(builder.f5101b);
    }
}
