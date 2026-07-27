package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class r0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5278a;
    public final /* synthetic */ z b;

    public r0(Context context, z zVar) {
        this.f5278a = context;
        this.b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (InneractiveAdManager.isCurrentUserAChild()) {
            return;
        }
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            s0.a(this.f5278a, this.b);
            y yVar = x.f5294a.b;
            if (TextUtils.isEmpty(yVar != null ? yVar.f5295a : null)) {
                q.a(this.f5278a, this.b);
            }
        } catch (Throwable th) {
            IAlog.a("SDK internal error: Make sure that Google Play Services for Mobile Ads is added to the compile dependencies of your project", th, new Object[0]);
        }
    }
}
