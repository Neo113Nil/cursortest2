package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.Bundle;
import p000.bv1;
import p000.cw1;
import p000.ew1;
import p000.mw1;
import p000.yv1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementSdk {

    /* JADX INFO: renamed from: a */
    public final mw1 f1350a;

    public AppMeasurementSdk(mw1 mw1Var) {
        this.f1350a = mw1Var;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return mw1.m3432d(context, null).f5170b;
    }

    public void beginAdUnitExposure(String str) {
        mw1 mw1Var = this.f1350a;
        mw1Var.m3434b(new cw1(mw1Var, str, 0));
    }

    public void endAdUnitExposure(String str) {
        mw1 mw1Var = this.f1350a;
        mw1Var.m3434b(new cw1(mw1Var, str, 1));
    }

    public long generateEventId() {
        return this.f1350a.m3437f();
    }

    public String getAppInstanceId() {
        bv1 bv1Var = new bv1();
        mw1 mw1Var = this.f1350a;
        mw1Var.m3434b(new ew1(mw1Var, bv1Var, 1));
        return (String) bv1.m783d(bv1Var.m784c(50L), String.class);
    }

    public String getGmpAppId() {
        bv1 bv1Var = new bv1();
        mw1 mw1Var = this.f1350a;
        mw1Var.m3434b(new ew1(mw1Var, bv1Var, 0));
        return (String) bv1.m783d(bv1Var.m784c(500L), String.class);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        mw1 mw1Var = this.f1350a;
        mw1Var.m3434b(new yv1(mw1Var, str, str2, bundle, true));
    }
}
