package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585j2 implements AppSetIdProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7564a;

    /* renamed from: b, reason: collision with root package name */
    public final IAppSetIdRetriever f7565b;

    /* renamed from: c, reason: collision with root package name */
    public volatile AppSetId f7566c;

    /* renamed from: d, reason: collision with root package name */
    public CountDownLatch f7567d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7568e;
    public final C0560i2 f;

    public C0585j2(Context context, IAppSetIdRetriever iAppSetIdRetriever) {
        this.f7564a = context;
        this.f7565b = iAppSetIdRetriever;
        this.f7567d = new CountDownLatch(1);
        this.f7568e = 20L;
        this.f = new C0560i2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f7566c == null) {
            try {
                this.f7567d = new CountDownLatch(1);
                this.f7565b.retrieveAppSetId(this.f7564a, this.f);
                this.f7567d.await(this.f7568e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f7566c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f7566c = appSetId;
        }
        return appSetId;
    }

    public C0585j2(Context context) {
        this(context, AbstractC0611k2.a());
    }
}
