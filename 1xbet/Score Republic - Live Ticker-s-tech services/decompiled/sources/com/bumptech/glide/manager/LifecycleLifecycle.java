package com.bumptech.glide.manager;

import androidx.lifecycle.C0030a;
import java.util.ArrayList;
import java.util.HashSet;
import p000.mu0;
import p000.ph0;
import p000.qh0;
import p000.rh0;
import p000.wh0;
import p000.xh0;
import p000.yh0;
import p000.zg1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements rh0, xh0 {

    /* JADX INFO: renamed from: j */
    public final HashSet f1317j = new HashSet();

    /* JADX INFO: renamed from: k */
    public final C0030a f1318k;

    public LifecycleLifecycle(C0030a c0030a) {
        this.f1318k = c0030a;
        c0030a.m437a(this);
    }

    @Override // p000.rh0
    /* JADX INFO: renamed from: B */
    public final void mo986B(wh0 wh0Var) {
        this.f1317j.add(wh0Var);
        qh0 qh0Var = this.f1318k.f551c;
        if (qh0Var == qh0.f6497j) {
            wh0Var.mo247c();
        } else if (qh0Var.compareTo(qh0.f6500m) >= 0) {
            wh0Var.mo246b();
        } else {
            wh0Var.mo245a();
        }
    }

    @Override // p000.rh0
    /* JADX INFO: renamed from: j */
    public final void mo987j(wh0 wh0Var) {
        this.f1317j.remove(wh0Var);
    }

    @mu0(ph0.ON_DESTROY)
    public void onDestroy(yh0 yh0Var) {
        ArrayList arrayListM5898i = zg1.m5898i(this.f1317j);
        int size = arrayListM5898i.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM5898i.get(i);
            i++;
            ((wh0) obj).mo247c();
        }
        yh0Var.mo862d().m442f(this);
    }

    @mu0(ph0.ON_START)
    public void onStart(yh0 yh0Var) {
        ArrayList arrayListM5898i = zg1.m5898i(this.f1317j);
        int size = arrayListM5898i.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM5898i.get(i);
            i++;
            ((wh0) obj).mo246b();
        }
    }

    @mu0(ph0.ON_STOP)
    public void onStop(yh0 yh0Var) {
        ArrayList arrayListM5898i = zg1.m5898i(this.f1317j);
        int size = arrayListM5898i.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM5898i.get(i);
            i++;
            ((wh0) obj).mo245a();
        }
    }
}
