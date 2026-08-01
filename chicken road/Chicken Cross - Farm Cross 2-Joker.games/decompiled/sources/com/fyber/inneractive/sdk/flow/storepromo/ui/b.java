package com.fyber.inneractive.sdk.flow.storepromo.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5407a;

    public b(c cVar) {
        this.f5407a = new WeakReference(cVar);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        c cVar = (c) this.f5407a.get();
        if (cVar != null) {
            cVar.a();
        }
    }
}
