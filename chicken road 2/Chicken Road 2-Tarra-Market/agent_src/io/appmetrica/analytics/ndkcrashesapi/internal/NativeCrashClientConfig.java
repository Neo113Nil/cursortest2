package io.appmetrica.analytics.ndkcrashesapi.internal;

/* loaded from: classes.dex */
public final class NativeCrashClientConfig {

    /* renamed from: a, reason: collision with root package name */
    private final String f5442a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5443b;

    public NativeCrashClientConfig(String str, String str2) {
        this.f5442a = str;
        this.f5443b = str2;
    }

    public final String getNativeCrashFolder() {
        return this.f5442a;
    }

    public final String getNativeCrashMetadata() {
        return this.f5443b;
    }
}
