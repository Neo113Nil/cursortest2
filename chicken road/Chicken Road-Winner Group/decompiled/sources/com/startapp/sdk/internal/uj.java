package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class uj extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f4496a;

    public uj(com.startapp.sdk.ads.video.c cVar) {
        this.f4496a = cVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f4496a.f3076r0.isInitialStickyBroadcast()) {
            return;
        }
        com.startapp.sdk.ads.video.c cVar = this.f4496a;
        cVar.f3053R = !cVar.f3053R;
        cVar.F();
        com.startapp.sdk.ads.video.c cVar2 = this.f4496a;
        cVar2.a(cVar2.f3053R);
    }
}
