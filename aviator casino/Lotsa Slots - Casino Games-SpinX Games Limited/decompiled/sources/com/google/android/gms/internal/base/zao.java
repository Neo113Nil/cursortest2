package com.google.android.gms.internal.base;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes4.dex */
public final class zao extends androidx.core.content.ContextCompat {
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    public static android.content.Intent zaa(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        if (com.google.android.gms.internal.base.zan.zaa()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != com.google.android.gms.internal.base.zan.zaa() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
