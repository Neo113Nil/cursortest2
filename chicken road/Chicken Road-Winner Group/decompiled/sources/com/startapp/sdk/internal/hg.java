package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hg extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ig f3835a;

    public hg(ig igVar) {
        this.f3835a = igVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if (this.f3835a.f3885o.isInitialStickyBroadcast() && intent.getExtras() != null) {
            int i3 = intent.getExtras().getInt("plugged");
            this.f3835a.f3882l = i3 == 1;
        } else if (Objects.equals(intent.getAction(), "android.intent.action.ACTION_POWER_CONNECTED") || Objects.equals(intent.getAction(), "android.intent.action.ACTION_POWER_DISCONNECTED")) {
            this.f3835a.a(false);
        }
    }
}
