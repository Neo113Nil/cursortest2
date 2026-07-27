package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Wl extends BroadcastReceiver {
    public static final void a(Intent intent, Context context) {
        Yl.a(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Wl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Wl.a(intent, context);
            }
        };
        Context context2 = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }
}
