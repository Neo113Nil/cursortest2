package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0703ng implements Va {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f7936a;

    /* renamed from: b, reason: collision with root package name */
    public final InstallReferrerClient f7937b;

    public C0703ng(Context context, ICommonExecutor iCommonExecutor) {
        this.f7936a = iCommonExecutor;
        this.f7937b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(InterfaceC0962xg interfaceC0962xg, Throwable th) {
        interfaceC0962xg.a(th);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final void a(InterfaceC0962xg interfaceC0962xg) throws Throwable {
        this.f7937b.startConnection(new C0677mg(this, interfaceC0962xg));
    }

    public final void a(InterfaceC0962xg interfaceC0962xg, Throwable th) {
        this.f7936a.execute(new D1.a(interfaceC0962xg, 17, th));
    }
}
