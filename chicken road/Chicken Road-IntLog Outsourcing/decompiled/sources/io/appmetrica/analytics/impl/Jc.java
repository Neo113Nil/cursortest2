package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Jc {

    /* renamed from: a, reason: collision with root package name */
    public final C0523an f7003a;

    /* renamed from: b, reason: collision with root package name */
    public final C0523an f7004b;

    /* renamed from: c, reason: collision with root package name */
    public final C0995t4 f7005c;

    /* renamed from: d, reason: collision with root package name */
    public final PublicLogger f7006d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7007e;

    public Jc(String str, PublicLogger publicLogger) {
        this(new C0995t4(30), new C0523an(50, str.concat("map key"), publicLogger), new C0523an(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Jc(C0995t4 c0995t4, C0523an c0523an, C0523an c0523an2, String str, PublicLogger publicLogger) {
        this.f7005c = c0995t4;
        this.f7003a = c0523an;
        this.f7004b = c0523an2;
        this.f7007e = str;
        this.f7006d = publicLogger;
    }
}
