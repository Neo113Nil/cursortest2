package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819bt {

    /* renamed from: a, reason: collision with root package name */
    public String f12919a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12920b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12921c;

    /* renamed from: d, reason: collision with root package name */
    public long f12922d;

    /* renamed from: e, reason: collision with root package name */
    public long f12923e;
    public byte f;

    public final C0863ct a() {
        String str;
        if (this.f == 63 && (str = this.f12919a) != null) {
            return new C0863ct(str, this.f12920b, this.f12921c, this.f12922d, this.f12923e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f12919a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
