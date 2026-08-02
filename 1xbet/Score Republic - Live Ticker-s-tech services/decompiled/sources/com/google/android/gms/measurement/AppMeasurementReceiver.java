package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import p000.f02;
import p000.jg0;
import p000.ky1;
import p000.si1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends si1 {

    /* JADX INFO: renamed from: c */
    public jg0 f1348c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f1348c == null) {
            this.f1348c = new jg0(25, this);
        }
        jg0 jg0Var = this.f1348c;
        jg0Var.getClass();
        ky1 ky1Var = f02.m1561s(context, null, null, null).f2247o;
        f02.m1560m(ky1Var);
        if (intent == null) {
            ky1Var.f4603r.m5312a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        ky1Var.f4608w.m5313b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                ky1Var.f4603r.m5312a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        ky1Var.f4608w.m5312a("Starting wakeful intent.");
        ((AppMeasurementReceiver) jg0Var.f3922k).getClass();
        SparseArray sparseArray = si1.f7125a;
        synchronized (sparseArray) {
            try {
                int i = si1.f7126b;
                int i2 = i + 1;
                si1.f7126b = i2;
                if (i2 <= 0) {
                    si1.f7126b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
