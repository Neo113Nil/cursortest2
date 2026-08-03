package io.appmetrica.analytics.ndkcrashesapi.internal;

/* loaded from: classes.dex */
public final class NativeCrash {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource f7308a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f7309b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f7310c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.String f7311d;

    /* renamed from: e, reason: collision with root package name */
    private final long f7312e;

    /* renamed from: f, reason: collision with root package name */
    private final java.lang.String f7313f;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource f7314a;

        /* renamed from: b, reason: collision with root package name */
        private final java.lang.String f7315b;

        /* renamed from: c, reason: collision with root package name */
        private final java.lang.String f7316c;

        /* renamed from: d, reason: collision with root package name */
        private final java.lang.String f7317d;

        /* renamed from: e, reason: collision with root package name */
        private final long f7318e;

        /* renamed from: f, reason: collision with root package name */
        private final java.lang.String f7319f;

        public Builder(io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource nativeCrashSource, java.lang.String str, java.lang.String str2, java.lang.String str3, long j2, java.lang.String str4) {
            this.f7314a = nativeCrashSource;
            this.f7315b = str;
            this.f7316c = str2;
            this.f7317d = str3;
            this.f7318e = j2;
            this.f7319f = str4;
        }

        public final io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash build() {
            return new io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash(this.f7314a, this.f7315b, this.f7316c, this.f7317d, this.f7318e, this.f7319f, null);
        }
    }

    public /* synthetic */ NativeCrash(io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource nativeCrashSource, java.lang.String str, java.lang.String str2, java.lang.String str3, long j2, java.lang.String str4, kotlin.jvm.internal.e eVar) {
        this(nativeCrashSource, str, str2, str3, j2, str4);
    }

    public final long getCreationTime() {
        return this.f7312e;
    }

    public final java.lang.String getDumpFile() {
        return this.f7311d;
    }

    public final java.lang.String getHandlerVersion() {
        return this.f7309b;
    }

    public final java.lang.String getMetadata() {
        return this.f7313f;
    }

    public final io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource getSource() {
        return this.f7308a;
    }

    public final java.lang.String getUuid() {
        return this.f7310c;
    }

    private NativeCrash(io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource nativeCrashSource, java.lang.String str, java.lang.String str2, java.lang.String str3, long j2, java.lang.String str4) {
        this.f7308a = nativeCrashSource;
        this.f7309b = str;
        this.f7310c = str2;
        this.f7311d = str3;
        this.f7312e = j2;
        this.f7313f = str4;
    }
}
