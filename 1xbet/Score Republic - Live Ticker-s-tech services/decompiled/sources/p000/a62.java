package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a62 extends k62 {

    /* JADX INFO: renamed from: m */
    public final AlarmManager f44m;

    /* JADX INFO: renamed from: n */
    public m52 f45n;

    /* JADX INFO: renamed from: o */
    public Integer f46o;

    public a62(x62 x62Var) {
        super(x62Var);
        this.f44m = (AlarmManager) ((f02) this.f7192j).f2242j.getSystemService("alarm");
    }

    @Override // p000.k62
    /* JADX INFO: renamed from: D */
    public final void mo34D() {
        AlarmManager alarmManager = this.f44m;
        if (alarmManager != null) {
            Context context = ((f02) this.f7192j).f2242j;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zu1.f9964a));
        }
        m37G();
    }

    /* JADX INFO: renamed from: E */
    public final rt1 m35E() {
        if (this.f45n == null) {
            this.f45n = new m52(this, this.f1566k.f8832u, 1);
        }
        return this.f45n;
    }

    /* JADX INFO: renamed from: F */
    public final void m36F() {
        m2988B();
        f02 f02Var = (f02) this.f7192j;
        ky1 ky1Var = f02Var.f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4608w.m5312a("Unscheduling upload");
        AlarmManager alarmManager = this.f44m;
        if (alarmManager != null) {
            Context context = f02Var.f2242j;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zu1.f9964a));
        }
        m35E().m4404c();
        m37G();
    }

    /* JADX INFO: renamed from: G */
    public final void m37G() {
        JobScheduler jobScheduler = (JobScheduler) ((f02) this.f7192j).f2242j.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m38H());
        }
    }

    /* JADX INFO: renamed from: H */
    public final int m38H() {
        if (this.f46o == null) {
            this.f46o = Integer.valueOf("measurement".concat(String.valueOf(((f02) this.f7192j).f2242j.getPackageName())).hashCode());
        }
        return this.f46o.intValue();
    }
}
