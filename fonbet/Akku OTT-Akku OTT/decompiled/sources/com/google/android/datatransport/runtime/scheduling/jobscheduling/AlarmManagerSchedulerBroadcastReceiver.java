package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        com.google.android.datatransport.runtime.q.b(context);
        if (queryParameter == null) {
            throw new NullPointerException("Null backendName");
        }
        com.google.android.datatransport.e b = com.google.android.datatransport.runtime.util.a.b(intValue);
        byte[] decode = queryParameter2 != null ? Base64.decode(queryParameter2, 0) : null;
        m mVar = com.google.android.datatransport.runtime.q.a().d;
        mVar.e.execute(new l(mVar, new com.google.android.datatransport.runtime.d(queryParameter, decode, b), i, new a()));
    }
}
