package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p000.C0648ra;
import p000.RunnableC0456m3;
import p000.gx0;
import p000.jg1;
import p000.ng1;
import p000.qd0;
import p000.se1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f1323a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        se1.m4517b(context);
        qd0 qd0VarM4283a = C0648ra.m4283a();
        qd0VarM4283a.m4087y(queryParameter);
        qd0VarM4283a.f6473m = gx0.m2163b(iIntValue);
        if (queryParameter2 != null) {
            qd0VarM4283a.f6472l = Base64.decode(queryParameter2, 0);
        }
        ng1 ng1Var = se1.m4516a().f7108d;
        ng1Var.f5434e.execute(new jg1(ng1Var, qd0VarM4283a.m4073e(), i, new RunnableC0456m3()));
    }
}
