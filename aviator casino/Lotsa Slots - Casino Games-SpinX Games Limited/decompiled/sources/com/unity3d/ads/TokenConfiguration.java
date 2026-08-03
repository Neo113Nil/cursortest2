package com.unity3d.ads;

/* compiled from: TokenConfiguration.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/TokenConfiguration;", "", "adFormat", "Lcom/unity3d/ads/AdFormat;", "extras", "", "", "(Lcom/unity3d/ads/AdFormat;Ljava/util/Map;)V", "getAdFormat", "()Lcom/unity3d/ads/AdFormat;", "getExtras", "()Ljava/util/Map;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TokenConfiguration {
    private final com.unity3d.ads.AdFormat adFormat;
    private final java.util.Map<java.lang.String, java.lang.String> extras;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TokenConfiguration(com.unity3d.ads.AdFormat adFormat) {
        this(adFormat, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
    }

    public TokenConfiguration(com.unity3d.ads.AdFormat adFormat, java.util.Map<java.lang.String, java.lang.String> extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        this.adFormat = adFormat;
        this.extras = extras;
    }

    public final com.unity3d.ads.AdFormat getAdFormat() {
        return this.adFormat;
    }

    public /* synthetic */ TokenConfiguration(com.unity3d.ads.AdFormat adFormat, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormat, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getExtras() {
        return this.extras;
    }
}
