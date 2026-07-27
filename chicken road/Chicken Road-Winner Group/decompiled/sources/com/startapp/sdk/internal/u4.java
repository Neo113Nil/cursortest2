package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class u4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4410a;

    public u4(Context context) {
        this.f4410a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        ANRRemoteConfig i3 = MetaData.E().i();
        C0252f c0252f = new C0252f(i3 != null ? i3.c() : 2000L, i3 != null && i3.g());
        if (i3 != null && i3.e()) {
            c0252f.f3662b = new w3(i3);
            c0252f.f3661a = new com.startapp.sdk.adsbase.crashreport.a(this.f4410a, i3.h(), i3.a(), i3.d());
            if (i3.f()) {
                c0252f.f3664d = new x3(this);
            }
            c0252f.start();
        }
        return c0252f;
    }
}
