package androidx.work.impl.workers;

import D0.k;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c5.C0820a;
import com.google.android.gms.common.internal.w;
import d1.C0950c;
import d1.C0954g;
import d1.m;
import d1.n;
import d6.C0977k;
import e1.l;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import m1.C1429d;
import m1.i;
import n3.AbstractC1464a;
import p3.f;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: x, reason: collision with root package name */
    public static final String f9899x = n.g("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(C0977k c0977k, w wVar, t tVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            C1429d f02 = tVar.f0(iVar.f15216a);
            Integer valueOf = f02 != null ? Integer.valueOf(f02.f15209b) : null;
            String str2 = iVar.f15216a;
            c0977k.getClass();
            k c3 = k.c(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                c3.e(1);
            } else {
                c3.f(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0977k.f12441b;
            workDatabase_Impl.b();
            Cursor g3 = workDatabase_Impl.g(c3);
            try {
                ArrayList arrayList2 = new ArrayList(g3.getCount());
                while (g3.moveToNext()) {
                    arrayList2.add(g3.getString(0));
                }
                g3.close();
                c3.g();
                ArrayList G2 = wVar.G(iVar.f15216a);
                String join = TextUtils.join(",", arrayList2);
                String join2 = TextUtils.join(",", G2);
                String str3 = iVar.f15216a;
                String str4 = iVar.f15218c;
                switch (iVar.f15217b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                StringBuilder l7 = e1.k.l("\n", str3, "\t ", str4, "\t ");
                l7.append(valueOf);
                l7.append("\t ");
                l7.append(str);
                l7.append("\t ");
                l7.append(join);
                l7.append("\t ");
                l7.append(join2);
                l7.append("\t");
                sb.append(l7.toString());
            } catch (Throwable th) {
                g3.close();
                c3.g();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final m doWork() {
        k kVar;
        ArrayList arrayList;
        t tVar;
        C0977k c0977k;
        w wVar;
        int i7;
        WorkDatabase workDatabase = l.m0(getApplicationContext()).f12546f;
        C0820a n2 = workDatabase.n();
        C0977k l7 = workDatabase.l();
        w o7 = workDatabase.o();
        t k7 = workDatabase.k();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        n2.getClass();
        k c3 = k.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        c3.d(1, currentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) n2.f10433a;
        workDatabase_Impl.b();
        Cursor g3 = workDatabase_Impl.g(c3);
        try {
            int J5 = f.J(g3, "required_network_type");
            int J6 = f.J(g3, "requires_charging");
            int J7 = f.J(g3, "requires_device_idle");
            int J8 = f.J(g3, "requires_battery_not_low");
            int J9 = f.J(g3, "requires_storage_not_low");
            int J10 = f.J(g3, "trigger_content_update_delay");
            int J11 = f.J(g3, "trigger_max_content_delay");
            int J12 = f.J(g3, "content_uri_triggers");
            int J13 = f.J(g3, "id");
            int J14 = f.J(g3, SentryThread.JsonKeys.STATE);
            int J15 = f.J(g3, "worker_class_name");
            int J16 = f.J(g3, "input_merger_class_name");
            int J17 = f.J(g3, "input");
            int J18 = f.J(g3, "output");
            kVar = c3;
            try {
                int J19 = f.J(g3, "initial_delay");
                int J20 = f.J(g3, "interval_duration");
                int J21 = f.J(g3, "flex_duration");
                int J22 = f.J(g3, "run_attempt_count");
                int J23 = f.J(g3, "backoff_policy");
                int J24 = f.J(g3, "backoff_delay_duration");
                int J25 = f.J(g3, "period_start_time");
                int J26 = f.J(g3, "minimum_retention_duration");
                int J27 = f.J(g3, "schedule_requested_at");
                int J28 = f.J(g3, "run_in_foreground");
                int J29 = f.J(g3, "out_of_quota_policy");
                int i8 = J18;
                ArrayList arrayList2 = new ArrayList(g3.getCount());
                while (true) {
                    arrayList = arrayList2;
                    if (!g3.moveToNext()) {
                        break;
                    }
                    String string = g3.getString(J13);
                    String string2 = g3.getString(J15);
                    int i9 = J15;
                    C0950c c0950c = new C0950c();
                    int i10 = J5;
                    c0950c.f12343a = AbstractC1464a.A(g3.getInt(J5));
                    c0950c.f12344b = g3.getInt(J6) != 0;
                    c0950c.f12345c = g3.getInt(J7) != 0;
                    c0950c.f12346d = g3.getInt(J8) != 0;
                    c0950c.f12347e = g3.getInt(J9) != 0;
                    int i11 = J6;
                    int i12 = J7;
                    c0950c.f12348f = g3.getLong(J10);
                    c0950c.f12349g = g3.getLong(J11);
                    c0950c.f12350h = AbstractC1464a.e(g3.getBlob(J12));
                    i iVar = new i(string, string2);
                    iVar.f15217b = AbstractC1464a.C(g3.getInt(J14));
                    iVar.f15219d = g3.getString(J16);
                    iVar.f15220e = C0954g.a(g3.getBlob(J17));
                    int i13 = i8;
                    iVar.f15221f = C0954g.a(g3.getBlob(i13));
                    i8 = i13;
                    int i14 = J16;
                    int i15 = J19;
                    iVar.f15222g = g3.getLong(i15);
                    int i16 = J17;
                    int i17 = J20;
                    iVar.f15223h = g3.getLong(i17);
                    int i18 = J21;
                    iVar.f15224i = g3.getLong(i18);
                    int i19 = J22;
                    iVar.f15225k = g3.getInt(i19);
                    int i20 = J23;
                    iVar.f15226l = AbstractC1464a.z(g3.getInt(i20));
                    J21 = i18;
                    int i21 = J24;
                    iVar.f15227m = g3.getLong(i21);
                    int i22 = J25;
                    iVar.f15228n = g3.getLong(i22);
                    J25 = i22;
                    int i23 = J26;
                    iVar.f15229o = g3.getLong(i23);
                    int i24 = J27;
                    iVar.f15230p = g3.getLong(i24);
                    int i25 = J28;
                    iVar.f15231q = g3.getInt(i25) != 0;
                    int i26 = J29;
                    iVar.f15232r = AbstractC1464a.B(g3.getInt(i26));
                    iVar.j = c0950c;
                    arrayList.add(iVar);
                    J29 = i26;
                    J17 = i16;
                    J19 = i15;
                    J20 = i17;
                    J6 = i11;
                    J23 = i20;
                    J22 = i19;
                    J27 = i24;
                    J28 = i25;
                    J26 = i23;
                    J24 = i21;
                    J16 = i14;
                    J7 = i12;
                    J5 = i10;
                    arrayList2 = arrayList;
                    J15 = i9;
                }
                g3.close();
                kVar.g();
                ArrayList f7 = n2.f();
                ArrayList d7 = n2.d();
                boolean isEmpty = arrayList.isEmpty();
                String str = f9899x;
                if (isEmpty) {
                    tVar = k7;
                    c0977k = l7;
                    wVar = o7;
                    i7 = 0;
                } else {
                    i7 = 0;
                    n.d().e(str, "Recently completed work:\n\n", new Throwable[0]);
                    tVar = k7;
                    c0977k = l7;
                    wVar = o7;
                    n.d().e(str, a(c0977k, wVar, tVar, arrayList), new Throwable[0]);
                }
                if (!f7.isEmpty()) {
                    n.d().e(str, "Running work:\n\n", new Throwable[i7]);
                    n.d().e(str, a(c0977k, wVar, tVar, f7), new Throwable[i7]);
                }
                if (!d7.isEmpty()) {
                    n.d().e(str, "Enqueued work:\n\n", new Throwable[i7]);
                    n.d().e(str, a(c0977k, wVar, tVar, d7), new Throwable[i7]);
                }
                return new d1.l(C0954g.f12356c);
            } catch (Throwable th) {
                th = th;
                g3.close();
                kVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = c3;
        }
    }
}
