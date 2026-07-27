package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.sd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4076sd extends BroadcastReceiver implements Zc {

    /* renamed from: a, reason: collision with root package name */
    public final String f7372a;
    public final /* synthetic */ C4187wd b;

    public C4076sd(C4187wd c4187wd, String jsCallbackNamespace) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        this.b = c4187wd;
        this.f7372a = jsCallbackNamespace;
    }

    @Override // com.inmobi.media.Zc
    public final void a() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return;
        }
        context.unregisterReceiver(this);
    }

    @Override // com.inmobi.media.Zc
    public final void b() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return;
        }
        AbstractC3727g4.a(context, this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual("android.media.RINGER_MODE_CHANGED", intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
            Y9 y9 = this.b.b;
            if (y9 != null) {
                ((Z9) y9).a("MraidMediaProcessor", "Ringer mode action changed: " + intExtra);
            }
            this.b.a(this.f7372a, 2 != intExtra);
        }
    }
}
