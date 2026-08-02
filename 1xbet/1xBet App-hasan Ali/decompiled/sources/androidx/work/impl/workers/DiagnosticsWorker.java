package androidx.work.impl.workers;

import G.v;
import N4.b;
import R1.j;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.G7;
import f2.C1945c;
import f2.C1948f;
import f2.k;
import f2.l;
import f2.m;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import o2.d;
import o2.i;
import v3.e;
import v3.g;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: q, reason: collision with root package name */
    public static final String f7129q = m.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(g gVar, v vVar, e eVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i iVar = (i) obj;
            d B5 = eVar.B(iVar.f18633a);
            Integer valueOf = B5 != null ? Integer.valueOf(B5.f18626b) : null;
            String str2 = iVar.f18633a;
            gVar.getClass();
            j b3 = j.b("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str2 == null) {
                b3.i(1);
            } else {
                b3.k(str2, 1);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) gVar.f20439l;
            workDatabase_Impl.b();
            Cursor g5 = workDatabase_Impl.g(b3);
            try {
                ArrayList arrayList2 = new ArrayList(g5.getCount());
                while (g5.moveToNext()) {
                    arrayList2.add(g5.getString(0));
                }
                g5.close();
                b3.l();
                ArrayList j5 = vVar.j(iVar.f18633a);
                String join = TextUtils.join(",", arrayList2);
                String join2 = TextUtils.join(",", j5);
                String str3 = iVar.f18633a;
                String str4 = iVar.f18635c;
                switch (iVar.f18634b) {
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
                sb.append("\n" + str3 + "\t " + str4 + "\t " + valueOf + "\t " + str + "\t " + join + "\t " + join2 + "\t");
            } catch (Throwable th) {
                g5.close();
                b3.l();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final l doWork() {
        j jVar;
        e eVar;
        g gVar;
        v vVar;
        int i;
        WorkDatabase workDatabase = g2.l.Q(getApplicationContext()).f17130m;
        G7 n5 = workDatabase.n();
        g l5 = workDatabase.l();
        v o5 = workDatabase.o();
        e k5 = workDatabase.k();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        n5.getClass();
        j b3 = j.b("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        b3.h(1, currentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) n5.f9170a;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(b3);
        try {
            int t5 = G4.d.t(g5, "required_network_type");
            int t6 = G4.d.t(g5, "requires_charging");
            int t7 = G4.d.t(g5, "requires_device_idle");
            int t8 = G4.d.t(g5, "requires_battery_not_low");
            int t9 = G4.d.t(g5, "requires_storage_not_low");
            int t10 = G4.d.t(g5, "trigger_content_update_delay");
            int t11 = G4.d.t(g5, "trigger_max_content_delay");
            int t12 = G4.d.t(g5, "content_uri_triggers");
            int t13 = G4.d.t(g5, "id");
            int t14 = G4.d.t(g5, "state");
            int t15 = G4.d.t(g5, "worker_class_name");
            jVar = b3;
            try {
                int t16 = G4.d.t(g5, "input_merger_class_name");
                int t17 = G4.d.t(g5, "input");
                int t18 = G4.d.t(g5, "output");
                int t19 = G4.d.t(g5, "initial_delay");
                int t20 = G4.d.t(g5, "interval_duration");
                int t21 = G4.d.t(g5, "flex_duration");
                int t22 = G4.d.t(g5, "run_attempt_count");
                int t23 = G4.d.t(g5, "backoff_policy");
                int t24 = G4.d.t(g5, "backoff_delay_duration");
                int t25 = G4.d.t(g5, "period_start_time");
                int t26 = G4.d.t(g5, "minimum_retention_duration");
                int t27 = G4.d.t(g5, "schedule_requested_at");
                int t28 = G4.d.t(g5, "run_in_foreground");
                int t29 = G4.d.t(g5, "out_of_quota_policy");
                int i5 = t18;
                ArrayList arrayList = new ArrayList(g5.getCount());
                while (g5.moveToNext()) {
                    String string = g5.getString(t13);
                    int i6 = t13;
                    String string2 = g5.getString(t15);
                    int i7 = t15;
                    C1945c c1945c = new C1945c();
                    int i8 = t5;
                    c1945c.f16982a = b.E(g5.getInt(t5));
                    c1945c.f16983b = g5.getInt(t6) != 0;
                    c1945c.f16984c = g5.getInt(t7) != 0;
                    c1945c.f16985d = g5.getInt(t8) != 0;
                    c1945c.f16986e = g5.getInt(t9) != 0;
                    int i9 = t6;
                    int i10 = t7;
                    c1945c.f = g5.getLong(t10);
                    c1945c.f16987g = g5.getLong(t11);
                    c1945c.f16988h = b.l(g5.getBlob(t12));
                    i iVar = new i(string, string2);
                    iVar.f18634b = b.G(g5.getInt(t14));
                    iVar.f18636d = g5.getString(t16);
                    iVar.f18637e = C1948f.a(g5.getBlob(t17));
                    int i11 = i5;
                    iVar.f = C1948f.a(g5.getBlob(i11));
                    int i12 = t16;
                    int i13 = t19;
                    iVar.f18638g = g5.getLong(i13);
                    int i14 = t20;
                    int i15 = t14;
                    iVar.f18639h = g5.getLong(i14);
                    int i16 = t8;
                    int i17 = t21;
                    iVar.i = g5.getLong(i17);
                    int i18 = t22;
                    iVar.f18641k = g5.getInt(i18);
                    int i19 = t23;
                    int i20 = t17;
                    iVar.f18642l = b.D(g5.getInt(i19));
                    int i21 = t24;
                    iVar.f18643m = g5.getLong(i21);
                    int i22 = t25;
                    iVar.f18644n = g5.getLong(i22);
                    int i23 = t26;
                    iVar.f18645o = g5.getLong(i23);
                    int i24 = t27;
                    iVar.f18646p = g5.getLong(i24);
                    int i25 = t28;
                    iVar.f18647q = g5.getInt(i25) != 0;
                    int i26 = t29;
                    iVar.f18648r = b.F(g5.getInt(i26));
                    iVar.f18640j = c1945c;
                    arrayList.add(iVar);
                    t22 = i18;
                    t14 = i15;
                    t20 = i14;
                    t25 = i22;
                    t8 = i16;
                    i5 = i11;
                    t28 = i25;
                    t6 = i9;
                    t19 = i13;
                    t17 = i20;
                    t21 = i17;
                    t23 = i19;
                    t26 = i23;
                    t24 = i21;
                    t15 = i7;
                    t5 = i8;
                    t29 = i26;
                    t27 = i24;
                    t16 = i12;
                    t13 = i6;
                    t7 = i10;
                }
                g5.close();
                jVar.l();
                ArrayList c5 = n5.c();
                ArrayList a5 = n5.a();
                boolean isEmpty = arrayList.isEmpty();
                String str = f7129q;
                if (isEmpty) {
                    eVar = k5;
                    gVar = l5;
                    vVar = o5;
                    i = 0;
                } else {
                    i = 0;
                    m.d().e(str, "Recently completed work:\n\n", new Throwable[0]);
                    eVar = k5;
                    gVar = l5;
                    vVar = o5;
                    m.d().e(str, a(gVar, vVar, eVar, arrayList), new Throwable[0]);
                }
                if (!c5.isEmpty()) {
                    m.d().e(str, "Running work:\n\n", new Throwable[i]);
                    m.d().e(str, a(gVar, vVar, eVar, c5), new Throwable[i]);
                }
                if (!a5.isEmpty()) {
                    m.d().e(str, "Enqueued work:\n\n", new Throwable[i]);
                    m.d().e(str, a(gVar, vVar, eVar, a5), new Throwable[i]);
                }
                return new k(C1948f.f16993c);
            } catch (Throwable th) {
                th = th;
                g5.close();
                jVar.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = b3;
        }
    }
}
