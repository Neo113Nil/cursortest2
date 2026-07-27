package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class NativeCrash {

    /* renamed from: a, reason: collision with root package name */
    private final NativeCrashSource f9794a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9795b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9796c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9797d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9798e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9799f;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final NativeCrashSource f9800a;

        /* renamed from: b, reason: collision with root package name */
        private final String f9801b;

        /* renamed from: c, reason: collision with root package name */
        private final String f9802c;

        /* renamed from: d, reason: collision with root package name */
        private final String f9803d;

        /* renamed from: e, reason: collision with root package name */
        private final long f9804e;

        /* renamed from: f, reason: collision with root package name */
        private final String f9805f;

        public Builder(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j2, String str4) {
            this.f9800a = nativeCrashSource;
            this.f9801b = str;
            this.f9802c = str2;
            this.f9803d = str3;
            this.f9804e = j2;
            this.f9805f = str4;
        }

        public final NativeCrash build() {
            return new NativeCrash(this.f9800a, this.f9801b, this.f9802c, this.f9803d, this.f9804e, this.f9805f, null);
        }
    }

    public /* synthetic */ NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j2, String str4, e eVar) {
        this(nativeCrashSource, str, str2, str3, j2, str4);
    }

    public final long getCreationTime() {
        return this.f9798e;
    }

    public final String getDumpFile() {
        return this.f9797d;
    }

    public final String getHandlerVersion() {
        return this.f9795b;
    }

    public final String getMetadata() {
        return this.f9799f;
    }

    public final NativeCrashSource getSource() {
        return this.f9794a;
    }

    public final String getUuid() {
        return this.f9796c;
    }

    private NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j2, String str4) {
        this.f9794a = nativeCrashSource;
        this.f9795b = str;
        this.f9796c = str2;
        this.f9797d = str3;
        this.f9798e = j2;
        this.f9799f = str4;
    }
}
