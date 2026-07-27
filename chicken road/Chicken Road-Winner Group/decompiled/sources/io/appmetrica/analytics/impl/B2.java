package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* loaded from: classes.dex */
public final class B2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final BiConsumer f5748a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f5749b;

    public B2(V2 v22, ICommonExecutor iCommonExecutor) {
        this.f5748a = v22;
        this.f5749b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f5749b.execute(new A2(this, context, intent));
    }
}
