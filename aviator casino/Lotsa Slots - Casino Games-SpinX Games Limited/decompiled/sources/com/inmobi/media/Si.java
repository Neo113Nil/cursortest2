package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Si {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2677pk f4960a;
    public final double b;
    public final java.util.List c;

    public Si(com.inmobi.media.C2677pk telemetryConfigMetaData, double d, java.util.List samplingEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(samplingEvents, "samplingEvents");
        this.f4960a = telemetryConfigMetaData;
        this.b = d;
        this.c = samplingEvents;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Si", "getSimpleName(...)");
    }

    public final boolean a(java.lang.String eventType, java.util.Map keyValueMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        com.inmobi.media.C2677pk c2677pk = this.f4960a;
        if (c2677pk.e && !c2677pk.f.contains(eventType)) {
            return false;
        }
        if (keyValueMap.isEmpty() || !kotlin.jvm.internal.Intrinsics.areEqual(eventType, "AssetDownloaded") || !keyValueMap.containsKey("assetType")) {
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual("image", keyValueMap.get("assetType")) && !this.f4960a.b) {
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk c2624nk2 = com.inmobi.media.C2624nk.f5360a;
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual("gif", keyValueMap.get("assetType")) && !this.f4960a.c) {
            com.inmobi.media.C2624nk c2624nk3 = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk c2624nk4 = com.inmobi.media.C2624nk.f5360a;
            return false;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual("video", keyValueMap.get("assetType")) || this.f4960a.d) {
            return true;
        }
        com.inmobi.media.C2624nk c2624nk5 = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk c2624nk6 = com.inmobi.media.C2624nk.f5360a;
        return false;
    }

    public final int a(java.lang.String eventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (!this.c.contains(eventType)) {
            return 1;
        }
        if (this.b < this.f4960a.g) {
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk c2624nk2 = com.inmobi.media.C2624nk.f5360a;
            return 2;
        }
        com.inmobi.media.C2624nk c2624nk3 = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk c2624nk4 = com.inmobi.media.C2624nk.f5360a;
        return 0;
    }
}
