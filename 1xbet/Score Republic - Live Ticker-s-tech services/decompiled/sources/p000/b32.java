package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class b32 extends mx1 {

    /* JADX INFO: renamed from: l */
    public JobScheduler f703l;

    @Override // p000.mx1
    /* JADX INFO: renamed from: D */
    public final boolean mo533D() {
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final void m587E(long j) {
        f02 f02Var = (f02) this.f7192j;
        m3446B();
        mo11z();
        JobScheduler jobScheduler = this.f703l;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(f02Var.f2242j.getPackageName())).hashCode()) != null) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5312a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iM588F = m588F();
        if (iM588F != 2) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4608w.m5313b(j11.m2776k(iM588F), "[sgtm] Not eligible for Scion upload");
            return;
        }
        ky1 ky1Var3 = f02Var.f2247o;
        f02.m1560m(ky1Var3);
        ky1Var3.f4608w.m5313b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(f02Var.f2242j.getPackageName())).hashCode(), new ComponentName(f02Var.f2242j, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f703l;
        p80.m3863h(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        ky1 ky1Var4 = f02Var.f2247o;
        f02.m1560m(ky1Var4);
        ky1Var4.f4608w.m5313b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    /* JADX INFO: renamed from: F */
    public final int m588F() {
        f02 f02Var = (f02) this.f7192j;
        m3446B();
        mo11z();
        if (this.f703l == null) {
            return 7;
        }
        Boolean boolM772N = f02Var.f2245m.m772N("google_analytics_sgtm_upload_enabled");
        if (!(boolM772N == null ? false : boolM772N.booleanValue())) {
            return 8;
        }
        if (f02Var.m1575r().f8291s < 119000) {
            return 6;
        }
        if (f72.m1687V(f02Var.f2242j)) {
            return !f02Var.m1573p().m5060H() ? 5 : 2;
        }
        return 3;
    }
}
