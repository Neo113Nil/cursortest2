package com.unity3d.ads.beta;

/* compiled from: ShowOptions.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/beta/ShowOptions;", "", "extras", "", "", "(Ljava/util/Map;)V", "getExtras", "()Ljava/util/Map;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShowOptions {
    private final java.util.Map<java.lang.String, java.lang.String> extras;

    /* JADX WARN: Multi-variable type inference failed */
    public ShowOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ShowOptions(java.util.Map<java.lang.String, java.lang.String> extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        this.extras = extras;
    }

    public /* synthetic */ ShowOptions(java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getExtras() {
        return this.extras;
    }
}
