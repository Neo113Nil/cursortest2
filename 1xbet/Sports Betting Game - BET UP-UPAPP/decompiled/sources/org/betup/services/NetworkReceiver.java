package org.betup.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import org.betup.bus.InetStateMessage;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes2.dex */
public class NetworkReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d("NETWORKTEST", "RECEIVED!");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        EventBus.getDefault().post(new InetStateMessage(activeNetworkInfo != null && activeNetworkInfo.isAvailable()));
    }
}
