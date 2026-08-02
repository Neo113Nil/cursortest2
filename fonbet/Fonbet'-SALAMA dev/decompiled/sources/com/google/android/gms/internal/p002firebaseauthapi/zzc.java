package com.google.android.gms.internal.p002firebaseauthapi;

import G.h;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class zzc extends h {
    @Deprecated
    public static Intent zza(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Intent registerReceiver;
        if (!zza.zza()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, zza.zza() ? 2 : 0);
        return registerReceiver;
    }
}
