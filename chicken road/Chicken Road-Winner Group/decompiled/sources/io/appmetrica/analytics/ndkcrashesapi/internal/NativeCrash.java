package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class NativeCrash {

    /* renamed from: a, reason: collision with root package name */
    private final NativeCrashSource f8825a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8826b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8827c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8828d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8829e;
    private final String f;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final NativeCrashSource f8830a;

        /* renamed from: b, reason: collision with root package name */
        private final String f8831b;

        /* renamed from: c, reason: collision with root package name */
        private final String f8832c;

        /* renamed from: d, reason: collision with root package name */
        private final String f8833d;

        /* renamed from: e, reason: collision with root package name */
        private final long f8834e;
        private final String f;

        public Builder(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j3, String str4) {
            this.f8830a = nativeCrashSource;
            this.f8831b = str;
            this.f8832c = str2;
            this.f8833d = str3;
            this.f8834e = j3;
            this.f = str4;
        }

        public final NativeCrash build() {
            return new NativeCrash(this.f8830a, this.f8831b, this.f8832c, this.f8833d, this.f8834e, this.f, null);
        }
    }

    public /* synthetic */ NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j3, String str4, f fVar) {
        this(nativeCrashSource, str, str2, str3, j3, str4);
    }

    public final long getCreationTime() {
        return this.f8829e;
    }

    public final String getDumpFile() {
        return this.f8828d;
    }

    public final String getHandlerVersion() {
        return this.f8826b;
    }

    public final String getMetadata() {
        return this.f;
    }

    public final NativeCrashSource getSource() {
        return this.f8825a;
    }

    public final String getUuid() {
        return this.f8827c;
    }

    private NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j3, String str4) {
        this.f8825a = nativeCrashSource;
        this.f8826b = str;
        this.f8827c = str2;
        this.f8828d = str3;
        this.f8829e = j3;
        this.f = str4;
    }
}
