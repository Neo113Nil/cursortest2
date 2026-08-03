package com.yandex.varioqub.analyticadapter.data;

/* loaded from: classes.dex */
public final class ConfigData {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f2621a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f2622b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2623c;

    public ConfigData(java.lang.String str, java.lang.String str2, long j2) {
        this.f2621a = str;
        this.f2622b = str2;
        this.f2623c = j2;
    }

    public final long getConfigLoadTimestamp() {
        return this.f2623c;
    }

    public final java.lang.String getNewConfigVersion() {
        return this.f2622b;
    }

    public final java.lang.String getOldConfigVersion() {
        return this.f2621a;
    }
}
