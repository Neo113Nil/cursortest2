package com.inmobi.media;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.hk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3772hk {

    /* renamed from: a, reason: collision with root package name */
    public final C3888lm f7148a;
    public final double b;
    public final List c;

    public C3772hk(C3888lm telemetryConfigMetaData, double d, List samplingEvents) {
        Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        Intrinsics.checkNotNullParameter(samplingEvents, "samplingEvents");
        this.f7148a = telemetryConfigMetaData;
        this.b = d;
        this.c = samplingEvents;
        Intrinsics.checkNotNullExpressionValue("hk", "getSimpleName(...)");
    }

    public final boolean a(String eventType, Map keyValueMap) {
        Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        C3888lm c3888lm = this.f7148a;
        if (c3888lm.e && !c3888lm.f.contains(eventType)) {
            String str = "Telemetry general events are disabled " + eventType;
            return false;
        }
        if (keyValueMap.isEmpty() || !Intrinsics.areEqual(eventType, "AssetDownloaded") || !keyValueMap.containsKey("assetType")) {
            return true;
        }
        if (Intrinsics.areEqual("image", keyValueMap.get("assetType")) && !this.f7148a.b) {
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm c3829jm2 = C3829jm.f7187a;
            String str2 = "Telemetry service is not enabled for assetType image for event" + eventType;
            return false;
        }
        if (Intrinsics.areEqual("gif", keyValueMap.get("assetType")) && !this.f7148a.c) {
            C3829jm c3829jm3 = C3829jm.f7187a;
            C3829jm c3829jm4 = C3829jm.f7187a;
            String str3 = "Telemetry service is not enabled for assetType gif for event" + eventType;
            return false;
        }
        if (!Intrinsics.areEqual("video", keyValueMap.get("assetType")) || this.f7148a.d) {
            return true;
        }
        C3829jm c3829jm5 = C3829jm.f7187a;
        C3829jm c3829jm6 = C3829jm.f7187a;
        String str4 = "Telemetry service is not enabled for assetType video for event" + eventType;
        return false;
    }

    public final int a(String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (!this.c.contains(eventType)) {
            return 1;
        }
        if (this.b < this.f7148a.g) {
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm c3829jm2 = C3829jm.f7187a;
            String str = "Event is not sampled " + eventType;
            return 2;
        }
        C3829jm c3829jm3 = C3829jm.f7187a;
        C3829jm c3829jm4 = C3829jm.f7187a;
        String str2 = "Event is sampled " + eventType;
        return 0;
    }
}
