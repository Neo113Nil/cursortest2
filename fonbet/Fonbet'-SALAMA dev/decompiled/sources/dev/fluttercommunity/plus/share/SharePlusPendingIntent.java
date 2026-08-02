package dev.fluttercommunity.plus.share;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import t6.h;

/* loaded from: classes2.dex */
public final class SharePlusPendingIntent extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static String f12492a = "";

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        Object parcelableExtra;
        h.e(context, "context");
        h.e(intent, "intent");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class);
            componentName = (ComponentName) parcelableExtra;
        } else {
            componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        }
        if (componentName != null) {
            f12492a = componentName.flattenToString();
        }
    }
}
