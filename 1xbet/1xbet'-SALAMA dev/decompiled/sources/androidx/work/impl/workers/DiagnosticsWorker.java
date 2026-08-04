package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.common.internal.w;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p019c5.a;
import p023d1.c;
import p023d1.g;
import p023d1.m;
import p023d1.n;
import p028d6.k;
import p031e1.l;
import p088m1.d;
import p088m1.i;
import p113p3.f;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f9899x = n.g("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(k kVar, w wVar, t tVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d dVarF0 = tVar.f0(iVar.f15222a);
            Integer numValueOf = dVarF0 != null ? Integer.valueOf(dVarF0.f15215b) : null;
            String str2 = iVar.f15222a;
            kVar.getClass();
            D0.k kVarC = D0.k.c(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                kVarC.e(1);
            } else {
                kVarC.f(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) kVar.f12447b;
            workDatabase_Impl.b();
            Cursor cursorG = workDatabase_Impl.g(kVarC);
            try {
                ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList2.add(cursorG.getString(0));
                }
                cursorG.close();
                kVarC.g();
                ArrayList arrayListG = wVar.G(iVar.f15222a);
                String strJoin = TextUtils.join(",", arrayList2);
                String strJoin2 = TextUtils.join(",", arrayListG);
                String str3 = iVar.f15222a;
                String str4 = iVar.f15224c;
                switch (iVar.f15223b) {
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
                StringBuilder sbL = p031e1.k.l("\n", str3, "\t ", str4, "\t ");
                sbL.append(numValueOf);
                sbL.append("\t ");
                sbL.append(str);
                sbL.append("\t ");
                sbL.append(strJoin);
                sbL.append("\t ");
                sbL.append(strJoin2);
                sbL.append("\t");
                sb.append(sbL.toString());
            } catch (Throwable th) {
                cursorG.close();
                kVarC.g();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final m doWork() throws Throwable {
        D0.k kVar;
        ArrayList arrayList;
        t tVar;
        k kVar2;
        w wVar;
        int i7;
        WorkDatabase workDatabase = l.m0(getApplicationContext()).f12552f;
        a aVarN = workDatabase.n();
        k kVarL = workDatabase.l();
        w wVarO = workDatabase.o();
        t tVarK = workDatabase.k();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        aVarN.getClass();
        D0.k kVarC = D0.k.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        kVarC.d(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) aVarN.f10433a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(kVarC);
        try {
            int iJ = f.J(cursorG, "required_network_type");
            int iJ2 = f.J(cursorG, "requires_charging");
            int iJ3 = f.J(cursorG, "requires_device_idle");
            int iJ4 = f.J(cursorG, "requires_battery_not_low");
            int iJ5 = f.J(cursorG, "requires_storage_not_low");
            int iJ6 = f.J(cursorG, "trigger_content_update_delay");
            int iJ7 = f.J(cursorG, "trigger_max_content_delay");
            int iJ8 = f.J(cursorG, "content_uri_triggers");
            int iJ9 = f.J(cursorG, "id");
            int iJ10 = f.J(cursorG, SentryThread.JsonKeys.STATE);
            int iJ11 = f.J(cursorG, "worker_class_name");
            int iJ12 = f.J(cursorG, "input_merger_class_name");
            int iJ13 = f.J(cursorG, "input");
            int iJ14 = f.J(cursorG, "output");
            kVar = kVarC;
            try {
                int iJ15 = f.J(cursorG, "initial_delay");
                int iJ16 = f.J(cursorG, "interval_duration");
                int iJ17 = f.J(cursorG, "flex_duration");
                int iJ18 = f.J(cursorG, "run_attempt_count");
                int iJ19 = f.J(cursorG, "backoff_policy");
                int iJ20 = f.J(cursorG, "backoff_delay_duration");
                int iJ21 = f.J(cursorG, "period_start_time");
                int iJ22 = f.J(cursorG, "minimum_retention_duration");
                int iJ23 = f.J(cursorG, "schedule_requested_at");
                int iJ24 = f.J(cursorG, "run_in_foreground");
                int iJ25 = f.J(cursorG, "out_of_quota_policy");
                int i8 = iJ14;
                ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                while (true) {
                    arrayList = arrayList2;
                    if (!cursorG.moveToNext()) {
                        break;
                    }
                    String string = cursorG.getString(iJ9);
                    String string2 = cursorG.getString(iJ11);
                    int i9 = iJ11;
                    c cVar = new c();
                    int i10 = iJ;
                    cVar.f12349a = p097n3.a.A(cursorG.getInt(iJ));
                    cVar.f12350b = cursorG.getInt(iJ2) != 0;
                    cVar.f12351c = cursorG.getInt(iJ3) != 0;
                    cVar.f12352d = cursorG.getInt(iJ4) != 0;
                    cVar.f12353e = cursorG.getInt(iJ5) != 0;
                    int i11 = iJ2;
                    int i12 = iJ3;
                    cVar.f12354f = cursorG.getLong(iJ6);
                    cVar.f12355g = cursorG.getLong(iJ7);
                    cVar.f12356h = p097n3.a.e(cursorG.getBlob(iJ8));
                    i iVar = new i(string, string2);
                    iVar.f15223b = p097n3.a.C(cursorG.getInt(iJ10));
                    iVar.f15225d = cursorG.getString(iJ12);
                    iVar.f15226e = g.a(cursorG.getBlob(iJ13));
                    int i13 = i8;
                    iVar.f15227f = g.a(cursorG.getBlob(i13));
                    i8 = i13;
                    int i14 = iJ12;
                    int i15 = iJ15;
                    iVar.f15228g = cursorG.getLong(i15);
                    int i16 = iJ13;
                    int i17 = iJ16;
                    iVar.f15229h = cursorG.getLong(i17);
                    int i18 = iJ17;
                    iVar.f15230i = cursorG.getLong(i18);
                    int i19 = iJ18;
                    iVar.f15231k = cursorG.getInt(i19);
                    int i20 = iJ19;
                    iVar.f15232l = p097n3.a.z(cursorG.getInt(i20));
                    iJ17 = i18;
                    int i21 = iJ20;
                    iVar.f15233m = cursorG.getLong(i21);
                    int i22 = iJ21;
                    iVar.f15234n = cursorG.getLong(i22);
                    iJ21 = i22;
                    int i23 = iJ22;
                    iVar.f15235o = cursorG.getLong(i23);
                    int i24 = iJ23;
                    iVar.f15236p = cursorG.getLong(i24);
                    int i25 = iJ24;
                    iVar.f15237q = cursorG.getInt(i25) != 0;
                    int i26 = iJ25;
                    iVar.f15238r = p097n3.a.B(cursorG.getInt(i26));
                    iVar.j = cVar;
                    arrayList.add(iVar);
                    iJ25 = i26;
                    iJ13 = i16;
                    iJ15 = i15;
                    iJ16 = i17;
                    iJ2 = i11;
                    iJ19 = i20;
                    iJ18 = i19;
                    iJ23 = i24;
                    iJ24 = i25;
                    iJ22 = i23;
                    iJ20 = i21;
                    iJ12 = i14;
                    iJ3 = i12;
                    iJ = i10;
                    arrayList2 = arrayList;
                    iJ11 = i9;
                }
                cursorG.close();
                kVar.g();
                ArrayList arrayListF = aVarN.f();
                ArrayList arrayListD = aVarN.d();
                boolean zIsEmpty = arrayList.isEmpty();
                String str = f9899x;
                if (zIsEmpty) {
                    tVar = tVarK;
                    kVar2 = kVarL;
                    wVar = wVarO;
                    i7 = 0;
                } else {
                    i7 = 0;
                    n.d().e(str, "Recently completed work:\n\n", new Throwable[0]);
                    tVar = tVarK;
                    kVar2 = kVarL;
                    wVar = wVarO;
                    n.d().e(str, a(kVar2, wVar, tVar, arrayList), new Throwable[0]);
                }
                if (!arrayListF.isEmpty()) {
                    n.d().e(str, "Running work:\n\n", new Throwable[i7]);
                    n.d().e(str, a(kVar2, wVar, tVar, arrayListF), new Throwable[i7]);
                }
                if (!arrayListD.isEmpty()) {
                    n.d().e(str, "Enqueued work:\n\n", new Throwable[i7]);
                    n.d().e(str, a(kVar2, wVar, tVar, arrayListD), new Throwable[i7]);
                }
                return new p023d1.l(g.f12362c);
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                kVar.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kVar = kVarC;
        }
    }
}
