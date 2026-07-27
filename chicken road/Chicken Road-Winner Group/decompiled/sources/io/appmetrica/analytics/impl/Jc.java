package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Jc {

    /* renamed from: a, reason: collision with root package name */
    public final C0374an f6151a;

    /* renamed from: b, reason: collision with root package name */
    public final C0374an f6152b;

    /* renamed from: c, reason: collision with root package name */
    public final C0846t4 f6153c;

    /* renamed from: d, reason: collision with root package name */
    public final PublicLogger f6154d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6155e;

    public Jc(String str, PublicLogger publicLogger) {
        this(new C0846t4(30), new C0374an(50, str.concat("map key"), publicLogger), new C0374an(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Jc(C0846t4 c0846t4, C0374an c0374an, C0374an c0374an2, String str, PublicLogger publicLogger) {
        this.f6153c = c0846t4;
        this.f6151a = c0374an;
        this.f6152b = c0374an2;
        this.f6155e = str;
        this.f6154d = publicLogger;
    }
}
