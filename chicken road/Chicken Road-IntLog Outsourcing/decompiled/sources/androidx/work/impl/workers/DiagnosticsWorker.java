package androidx.work.impl.workers;

import B0.f;
import B0.l;
import B0.q;
import B0.r;
import B0.t;
import K1.b;
import X.k;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import s0.C1416d;
import s0.g;
import s0.p;
import s0.s;
import t0.o;

/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        i.e(context, "context");
        i.e(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final p a() {
        k kVar;
        B0.i iVar;
        l lVar;
        t tVar;
        int i2;
        boolean z;
        int i3;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        boolean z8;
        WorkDatabase workDatabase = o.a(getApplicationContext()).f11884c;
        i.d(workDatabase, "workManager.workDatabase");
        r t5 = workDatabase.t();
        l r5 = workDatabase.r();
        t u5 = workDatabase.u();
        B0.i p5 = workDatabase.p();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        t5.getClass();
        k c2 = k.c(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        c2.t(1, currentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = t5.f193a;
        workDatabase_Impl.b();
        Cursor m6 = workDatabase_Impl.m(c2, null);
        try {
            int T2 = b.T(m6, OutcomeConstants.OUTCOME_ID);
            int T5 = b.T(m6, "state");
            int T6 = b.T(m6, "worker_class_name");
            int T7 = b.T(m6, "input_merger_class_name");
            int T8 = b.T(m6, "input");
            int T9 = b.T(m6, "output");
            int T10 = b.T(m6, "initial_delay");
            int T11 = b.T(m6, "interval_duration");
            int T12 = b.T(m6, "flex_duration");
            int T13 = b.T(m6, "run_attempt_count");
            int T14 = b.T(m6, "backoff_policy");
            int T15 = b.T(m6, "backoff_delay_duration");
            int T16 = b.T(m6, "last_enqueue_time");
            int T17 = b.T(m6, "minimum_retention_duration");
            kVar = c2;
            try {
                int T18 = b.T(m6, "schedule_requested_at");
                int T19 = b.T(m6, "run_in_foreground");
                int T20 = b.T(m6, "out_of_quota_policy");
                int T21 = b.T(m6, "period_count");
                int T22 = b.T(m6, "generation");
                int T23 = b.T(m6, "required_network_type");
                int T24 = b.T(m6, "requires_charging");
                int T25 = b.T(m6, "requires_device_idle");
                int T26 = b.T(m6, "requires_battery_not_low");
                int T27 = b.T(m6, "requires_storage_not_low");
                int T28 = b.T(m6, "trigger_content_update_delay");
                int T29 = b.T(m6, "trigger_max_content_delay");
                int T30 = b.T(m6, "content_uri_triggers");
                int i9 = T17;
                ArrayList arrayList = new ArrayList(m6.getCount());
                while (m6.moveToNext()) {
                    String string = m6.isNull(T2) ? null : m6.getString(T2);
                    int E5 = f.E(m6.getInt(T5));
                    String string2 = m6.isNull(T6) ? null : m6.getString(T6);
                    String string3 = m6.isNull(T7) ? null : m6.getString(T7);
                    g a6 = g.a(m6.isNull(T8) ? null : m6.getBlob(T8));
                    g a7 = g.a(m6.isNull(T9) ? null : m6.getBlob(T9));
                    long j2 = m6.getLong(T10);
                    long j6 = m6.getLong(T11);
                    long j7 = m6.getLong(T12);
                    int i10 = m6.getInt(T13);
                    int B5 = f.B(m6.getInt(T14));
                    long j8 = m6.getLong(T15);
                    long j9 = m6.getLong(T16);
                    int i11 = i9;
                    long j10 = m6.getLong(i11);
                    int i12 = T14;
                    int i13 = T18;
                    long j11 = m6.getLong(i13);
                    T18 = i13;
                    int i14 = T19;
                    if (m6.getInt(i14) != 0) {
                        T19 = i14;
                        i2 = T20;
                        z = true;
                    } else {
                        T19 = i14;
                        i2 = T20;
                        z = false;
                    }
                    int D5 = f.D(m6.getInt(i2));
                    T20 = i2;
                    int i15 = T21;
                    int i16 = m6.getInt(i15);
                    T21 = i15;
                    int i17 = T22;
                    int i18 = m6.getInt(i17);
                    T22 = i17;
                    int i19 = T23;
                    int C2 = f.C(m6.getInt(i19));
                    T23 = i19;
                    int i20 = T24;
                    if (m6.getInt(i20) != 0) {
                        T24 = i20;
                        i3 = T25;
                        z5 = true;
                    } else {
                        T24 = i20;
                        i3 = T25;
                        z5 = false;
                    }
                    if (m6.getInt(i3) != 0) {
                        T25 = i3;
                        i6 = T26;
                        z6 = true;
                    } else {
                        T25 = i3;
                        i6 = T26;
                        z6 = false;
                    }
                    if (m6.getInt(i6) != 0) {
                        T26 = i6;
                        i7 = T27;
                        z7 = true;
                    } else {
                        T26 = i6;
                        i7 = T27;
                        z7 = false;
                    }
                    if (m6.getInt(i7) != 0) {
                        T27 = i7;
                        i8 = T28;
                        z8 = true;
                    } else {
                        T27 = i7;
                        i8 = T28;
                        z8 = false;
                    }
                    long j12 = m6.getLong(i8);
                    T28 = i8;
                    int i21 = T29;
                    long j13 = m6.getLong(i21);
                    T29 = i21;
                    int i22 = T30;
                    T30 = i22;
                    arrayList.add(new q(string, E5, string2, string3, a6, a7, j2, j6, j7, new C1416d(C2, z5, z6, z7, z8, j12, j13, f.d(m6.isNull(i22) ? null : m6.getBlob(i22))), i10, B5, j8, j9, j10, j11, z, D5, i16, i18));
                    T14 = i12;
                    i9 = i11;
                }
                m6.close();
                kVar.g();
                ArrayList c6 = t5.c();
                ArrayList a8 = t5.a();
                if (arrayList.isEmpty()) {
                    iVar = p5;
                    lVar = r5;
                    tVar = u5;
                } else {
                    s d6 = s.d();
                    String str = F0.b.f673a;
                    d6.e(str, "Recently completed work:\n\n");
                    iVar = p5;
                    lVar = r5;
                    tVar = u5;
                    s.d().e(str, F0.b.a(lVar, tVar, iVar, arrayList));
                }
                if (!c6.isEmpty()) {
                    s d7 = s.d();
                    String str2 = F0.b.f673a;
                    d7.e(str2, "Running work:\n\n");
                    s.d().e(str2, F0.b.a(lVar, tVar, iVar, c6));
                }
                if (!a8.isEmpty()) {
                    s d8 = s.d();
                    String str3 = F0.b.f673a;
                    d8.e(str3, "Enqueued work:\n\n");
                    s.d().e(str3, F0.b.a(lVar, tVar, iVar, a8));
                }
                return s0.q.a();
            } catch (Throwable th) {
                th = th;
                m6.close();
                kVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = c2;
        }
    }
}
