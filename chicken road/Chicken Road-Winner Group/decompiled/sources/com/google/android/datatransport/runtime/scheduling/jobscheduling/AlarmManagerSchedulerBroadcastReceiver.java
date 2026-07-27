package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import A0.j;
import A0.k;
import A0.s;
import G0.f;
import G0.l;
import K0.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2544a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i3 = intent.getExtras().getInt("attemptNumber");
        s.b(context);
        j a3 = k.a();
        a3.O(queryParameter);
        a3.f68d = a.b(intValue);
        if (queryParameter2 != null) {
            a3.f67c = Base64.decode(queryParameter2, 0);
        }
        l lVar = s.a().f89d;
        k t3 = a3.t();
        G0.a aVar = new G0.a(0);
        lVar.getClass();
        lVar.f423e.execute(new f(lVar, t3, i3, aVar));
    }
}
