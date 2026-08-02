package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i22 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicBoolean f3401a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f3402b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g71 f3403c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ an0 f3404d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Executor f3405e;

    public i22(AtomicBoolean atomicBoolean, Context context, g71 g71Var, an0 an0Var, Executor executor) {
        this.f3401a = atomicBoolean;
        this.f3402b = context;
        this.f3403c = g71Var;
        this.f3404d = an0Var;
        this.f3405e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f3401a.compareAndSet(false, true)) {
            try {
                this.f3402b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e);
            }
            g71 g71Var = this.f3403c;
            an0 an0Var = this.f3404d;
            Executor executor = this.f3405e;
            ve1 ve1Var = new ve1();
            ve1Var.f8186r = new ue1(ve1Var, an0Var);
            executor.execute(ve1Var);
            g71Var.m2179n(ve1Var);
        }
    }
}
