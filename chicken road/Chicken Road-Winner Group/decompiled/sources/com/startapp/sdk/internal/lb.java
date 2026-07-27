package com.startapp.sdk.internal;

import android.content.Intent;
import android.os.RemoteException;
import com.startapp.sdk.ads.list3d.List3DActivity;

/* loaded from: classes.dex */
public final class lb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f3986a;

    public lb(List3DActivity list3DActivity) {
        this.f3986a = list3DActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3986a.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (Throwable th) {
            if (si.a(th, RemoteException.class)) {
                return;
            }
            d9.a(th);
        }
    }
}
