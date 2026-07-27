package com.fyber.inneractive.sdk.config;

import android.content.Context;

/* loaded from: classes4.dex */
public final class e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f5245a;
    public final /* synthetic */ Context b;

    public e0(IAConfigManager iAConfigManager, Context context) {
        this.f5245a = iAConfigManager;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Class.forName("com.iab.omid.library.fyber.Omid");
            com.fyber.inneractive.sdk.util.r.b.post(new d0(this));
        } catch (Throwable unused) {
        }
    }
}
