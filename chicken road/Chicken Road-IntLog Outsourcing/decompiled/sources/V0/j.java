package V0;

import C0.v;
import E.C0042q;
import W.L;
import W.t;
import W.u;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import b2.AbstractC0279e;
import c0.C0301c;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.yandex.varioqub.config.model.ConfigValue;
import d3.C0398a;
import e4.InterfaceC0412a;
import io.appmetrica.analytics.impl.C0793l9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j5.r;
import java.io.FileOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.MissingFormatArgumentException;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import l.I;
import l.q0;
import l3.C1258d;
import m1.InterfaceC1276c;
import m2.AbstractC1286i;
import m2.C1278a;
import m2.C1280c;
import m2.C1288k;
import n1.C1297A;
import n1.C1325l;
import n1.C1334u;
import n1.InterfaceC1306J;
import n1.InterfaceC1324k;
import n1.InterfaceC1338y;
import o1.C1373k;
import org.json.JSONArray;
import org.json.JSONException;
import p3.C1383b;
import r.C1400j;
import w2.y;
import w2.z;
import y1.AbstractC1555a;
import y2.C1564i;
import z3.C1579d;
import z3.C1581f;
import z3.C1583h;

/* loaded from: classes.dex */
public final class j implements L, X0.b, I, InterfaceC1338y, InterfaceC1306J, InterfaceC1324k, y, H2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3211a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3212b;

    public /* synthetic */ j(int i2, Object obj) {
        this.f3211a = i2;
        this.f3212b = obj;
    }

    public static void B(C0301c c0301c) {
        c0301c.o("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0301c.o("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        c0301c.o("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        c0301c.o("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        c0301c.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        c0301c.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        c0301c.o("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0301c.o("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        c0301c.o("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0301c.o("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0301c.o("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        c0301c.o("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0301c.o("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        c0301c.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c0301c.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
    }

    public static int I(int i2, int i3) {
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            i6++;
            if (i6 == i3) {
                i7++;
                i6 = 0;
            } else if (i6 > i3) {
                i7++;
                i6 = 1;
            }
        }
        return i6 + 1 > i3 ? i7 + 1 : i7;
    }

    public static boolean K(int i2) {
        return (48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42;
    }

    public static boolean L(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static X.j M(C0301c c0301c) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new Z.a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new Z.a("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new Z.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(OutcomeConstants.OUTCOME_ID)));
        hashSet.add(new Z.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(OutcomeConstants.OUTCOME_ID)));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new Z.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new Z.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        Z.e eVar = new Z.e("Dependency", hashMap, hashSet, hashSet2);
        Z.e a6 = Z.e.a(c0301c, "Dependency");
        if (!eVar.equals(a6)) {
            return new X.j(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a6);
        }
        HashMap hashMap2 = new HashMap(27);
        hashMap2.put(OutcomeConstants.OUTCOME_ID, new Z.a(OutcomeConstants.OUTCOME_ID, "TEXT", true, 1, null, 1));
        hashMap2.put("state", new Z.a("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new Z.a("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new Z.a("input_merger_class_name", "TEXT", false, 0, null, 1));
        hashMap2.put("input", new Z.a("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new Z.a("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new Z.a("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new Z.a("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new Z.a("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new Z.a("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new Z.a("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new Z.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("last_enqueue_time", new Z.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
        hashMap2.put("minimum_retention_duration", new Z.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new Z.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new Z.a("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("out_of_quota_policy", new Z.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_count", new Z.a("period_count", "INTEGER", true, 0, CommonUrlParts.Values.FALSE_INTEGER, 1));
        hashMap2.put("generation", new Z.a("generation", "INTEGER", true, 0, CommonUrlParts.Values.FALSE_INTEGER, 1));
        hashMap2.put("required_network_type", new Z.a("required_network_type", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_charging", new Z.a("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new Z.a("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new Z.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new Z.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new Z.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new Z.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new Z.a("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new Z.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new Z.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        Z.e eVar2 = new Z.e("WorkSpec", hashMap2, hashSet3, hashSet4);
        Z.e a7 = Z.e.a(c0301c, "WorkSpec");
        if (!eVar2.equals(a7)) {
            return new X.j(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a7);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new Z.a("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new Z.a("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new Z.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(OutcomeConstants.OUTCOME_ID)));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new Z.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        Z.e eVar3 = new Z.e("WorkTag", hashMap3, hashSet5, hashSet6);
        Z.e a8 = Z.e.a(c0301c, "WorkTag");
        if (!eVar3.equals(a8)) {
            return new X.j(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a8);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new Z.a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("generation", new Z.a("generation", "INTEGER", true, 2, CommonUrlParts.Values.FALSE_INTEGER, 1));
        hashMap4.put("system_id", new Z.a("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new Z.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(OutcomeConstants.OUTCOME_ID)));
        Z.e eVar4 = new Z.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        Z.e a9 = Z.e.a(c0301c, "SystemIdInfo");
        if (!eVar4.equals(a9)) {
            return new X.j(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a9);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new Z.a("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new Z.a("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new Z.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(OutcomeConstants.OUTCOME_ID)));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new Z.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        Z.e eVar5 = new Z.e("WorkName", hashMap5, hashSet8, hashSet9);
        Z.e a10 = Z.e.a(c0301c, "WorkName");
        if (!eVar5.equals(a10)) {
            return new X.j(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a10);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new Z.a("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new Z.a("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new Z.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(OutcomeConstants.OUTCOME_ID)));
        Z.e eVar6 = new Z.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        Z.e a11 = Z.e.a(c0301c, "WorkProgress");
        if (!eVar6.equals(a11)) {
            return new X.j(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a11);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new Z.a("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new Z.a("long_value", "INTEGER", false, 0, null, 1));
        Z.e eVar7 = new Z.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        Z.e a12 = Z.e.a(c0301c, "Preference");
        if (eVar7.equals(a12)) {
            return new X.j(true, (String) null);
        }
        return new X.j(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a12);
    }

    public static String S(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public C1258d A() {
        Context context = (Context) this.f3212b;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C1258d c1258d = new C1258d();
        c1258d.f11047b = X0.a.a(l.f3215a);
        j jVar = new j(4, context);
        c1258d.f11048c = jVar;
        c1258d.f11049d = X0.a.a(new B0.c(jVar, 8, new W0.e(jVar, 0)));
        j jVar2 = (j) c1258d.f11048c;
        c1258d.f11050e = new j(9, jVar2);
        InterfaceC0412a a6 = X0.a.a(new x1.e((j) c1258d.f11050e, X0.a.a(new W0.e(jVar2, 1))));
        c1258d.f11051f = a6;
        W1.e eVar = new W1.e();
        j jVar3 = (j) c1258d.f11048c;
        B4.i iVar = new B4.i(jVar3, a6, eVar, 15);
        InterfaceC0412a interfaceC0412a = (InterfaceC0412a) c1258d.f11047b;
        InterfaceC0412a interfaceC0412a2 = (InterfaceC0412a) c1258d.f11049d;
        B.d dVar = new B.d(interfaceC0412a, interfaceC0412a2, iVar, a6, a6);
        q0 q0Var = new q0();
        q0Var.f10941a = jVar3;
        q0Var.f10942b = interfaceC0412a2;
        q0Var.f10943c = a6;
        q0Var.f10944d = iVar;
        q0Var.f10945e = interfaceC0412a;
        q0Var.f10946f = a6;
        q0Var.f10947g = a6;
        c1258d.f11052g = X0.a.a(new B4.i(dVar, q0Var, new B0.n(interfaceC0412a, a6, iVar, a6), 11));
        return c1258d;
    }

    public void C(int i2) {
        io.flutter.plugin.platform.l lVar = (io.flutter.plugin.platform.l) this.f3212b;
        lVar.f10233m.remove(Integer.valueOf(i2));
        AbstractC0279e.o(lVar.f10227g.get(i2));
        Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i2);
    }

    public j5.i D(long j2) {
        return ((C1278a) this.f3212b).d((int) j2);
    }

    public boolean E(String str) {
        String J4 = J(str);
        return "1".equals(J4) || Boolean.parseBoolean(J4);
    }

    public Integer F(String str) {
        String J4 = J(str);
        if (TextUtils.isEmpty(J4)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(J4));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + S(str) + "(" + J4 + ") into an int");
            return null;
        }
    }

    public JSONArray G(String str) {
        String J4 = J(str);
        if (TextUtils.isEmpty(J4)) {
            return null;
        }
        try {
            return new JSONArray(J4);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + S(str) + ": " + J4 + ", falling back to default");
            return null;
        }
    }

    public String H(Resources resources, String str, String str2) {
        String[] strArr;
        String J4 = J(str2);
        if (!TextUtils.isEmpty(J4)) {
            return J4;
        }
        String J5 = J(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(J5)) {
            return null;
        }
        int identifier = resources.getIdentifier(J5, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", S(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray G5 = G(str2.concat("_loc_args"));
        if (G5 == null) {
            strArr = null;
        } else {
            int length = G5.length();
            strArr = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                strArr[i2] = G5.optString(i2);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e3) {
            Log.w("NotificationParams", "Missing format argument for " + S(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e3);
            return null;
        }
    }

    public String J(String str) {
        Bundle bundle = (Bundle) this.f3212b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle N() {
        Bundle bundle = (Bundle) this.f3212b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void O(int i2) {
        ((C1278a) this.f3212b).k(i2);
    }

    public void P(int i2, G2.m mVar) {
        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f3212b;
        jVar.c();
        jVar.f10198f = mVar;
        jVar.f10197e = new C0042q(2, i2);
        jVar.f10200h.e(jVar);
        B0.n nVar = mVar.f990j;
        jVar.f10200h = new io.flutter.plugin.editing.g(nVar != null ? (G2.o) nVar.f169c : null, jVar.f10193a);
        jVar.d(mVar);
        jVar.f10201i = true;
        if (jVar.f10197e.f631b == 3) {
            jVar.f10208p = false;
        }
        jVar.f10205m = null;
        jVar.f10200h.a(jVar);
    }

    public void Q(double d6, double d7, double[] dArr) {
        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f3212b;
        jVar.getClass();
        double[] dArr2 = new double[4];
        boolean z = dArr[3] == ConfigValue.DOUBLE_DEFAULT_VALUE && dArr[7] == ConfigValue.DOUBLE_DEFAULT_VALUE && dArr[15] == 1.0d;
        double d8 = dArr[12];
        double d9 = dArr[15];
        double d10 = d8 / d9;
        dArr2[1] = d10;
        dArr2[0] = d10;
        double d11 = dArr[13] / d9;
        dArr2[3] = d11;
        dArr2[2] = d11;
        I1.n nVar = new I1.n(z, dArr, dArr2);
        nVar.a(d6, ConfigValue.DOUBLE_DEFAULT_VALUE);
        nVar.a(d6, d7);
        nVar.a(ConfigValue.DOUBLE_DEFAULT_VALUE, d7);
        double d12 = jVar.f10193a.getContext().getResources().getDisplayMetrics().density;
        jVar.f10205m = new Rect((int) (dArr2[0] * d12), (int) (dArr2[2] * d12), (int) Math.ceil(dArr2[1] * d12), (int) Math.ceil(dArr2[3] * d12));
    }

    public void R(G2.o oVar) {
        G2.o oVar2;
        int i2;
        int i3;
        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f3212b;
        w2.m mVar = jVar.f10193a;
        if (!jVar.f10201i && (oVar2 = jVar.f10207o) != null && (i2 = oVar2.f1000d) >= 0 && (i3 = oVar2.f1001e) > i2) {
            int i6 = i3 - i2;
            int i7 = oVar.f1001e;
            int i8 = oVar.f1000d;
            boolean z = true;
            if (i6 == i7 - i8) {
                int i9 = 0;
                while (true) {
                    if (i9 >= i6) {
                        z = false;
                        break;
                    } else if (oVar2.f997a.charAt(i9 + i2) != oVar.f997a.charAt(i9 + i8)) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            jVar.f10201i = z;
        }
        jVar.f10207o = oVar;
        jVar.f10200h.f(oVar);
        if (jVar.f10201i) {
            jVar.f10194b.restartInput(mVar);
            jVar.f10201i = false;
        }
    }

    public void T(FileOutputStream stream) {
        B3.e eVar = (B3.e) this.f3212b;
        int i2 = eVar.f283c;
        C1280c c1280c = AbstractC1286i.f11164g;
        Integer valueOf = Integer.valueOf(i2);
        c1280c.getClass();
        kotlin.jvm.internal.i.e(stream, "stream");
        j5.o oVar = new j5.o(stream, new j5.y());
        j5.f fVar = new j5.f();
        C1288k writer = new C1288k();
        c1280c.getClass();
        int intValue = valueOf.intValue();
        kotlin.jvm.internal.i.e(writer, "writer");
        if (intValue >= 0) {
            int i3 = (intValue & (-128)) == 0 ? 1 : (intValue & (-16384)) == 0 ? 2 : ((-2097152) & intValue) == 0 ? 3 : ((-268435456) & intValue) == 0 ? 4 : 5;
            writer.b(i3);
            int i6 = writer.f11188e - i3;
            writer.f11188e = i6;
            while ((intValue & (-128)) != 0) {
                writer.f11187d[i6] = (byte) ((intValue & 127) | 128);
                intValue >>>= 7;
                i6++;
            }
            writer.f11187d[i6] = (byte) intValue;
        } else {
            long j2 = intValue;
            int v02 = K1.b.v0(j2);
            writer.b(v02);
            int i7 = writer.f11188e - v02;
            writer.f11188e = i7;
            while (((-128) & j2) != 0) {
                writer.f11187d[i7] = (byte) ((127 & j2) | 128);
                j2 >>>= 7;
                i7++;
            }
            writer.f11187d[i7] = (byte) j2;
        }
        writer.a();
        j5.f fVar2 = writer.f11184a;
        while (fVar2.s(fVar, 8192L) != -1) {
            long j6 = fVar.f10495b;
            if (j6 == 0) {
                j6 = 0;
            } else {
                r rVar = fVar.f10494a;
                kotlin.jvm.internal.i.b(rVar);
                r rVar2 = rVar.f10527g;
                kotlin.jvm.internal.i.b(rVar2);
                if (rVar2.f10523c < 8192 && rVar2.f10525e) {
                    j6 -= r9 - rVar2.f10522b;
                }
            }
            if (j6 > 0) {
                oVar.B(fVar, j6);
            }
        }
        long j7 = fVar.f10495b;
        if (j7 > 0) {
            oVar.B(fVar, j7);
        }
        eVar.b(stream);
    }

    @Override // l.I
    public void a(k.i iVar, k.j jVar) {
        k.f fVar = (k.f) this.f3212b;
        fVar.f10559f.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f10561h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (iVar == ((k.e) arrayList.get(i2)).f10553b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        fVar.f10559f.postAtTime(new v(this, i3 < arrayList.size() ? (k.e) arrayList.get(i3) : null, jVar, iVar, 1), iVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // n1.InterfaceC1324k
    public void accept(Object obj, Object obj2) {
        I1.h hVar = (I1.h) obj2;
        q1.a aVar = (q1.a) ((q1.c) obj).t();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar.f211f);
        int i2 = AbstractC1555a.f12339a;
        C1373k c1373k = (C1373k) this.f3212b;
        if (c1373k == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            c1373k.writeToParcel(obtain, 0);
        }
        try {
            aVar.f210e.transact(1, obtain, null, 1);
            obtain.recycle();
            hVar.b(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // n1.InterfaceC1306J
    public void b(Bundle bundle) {
        C1325l c1325l = (C1325l) this.f3212b;
        ReentrantLock reentrantLock = c1325l.f11400n;
        ReentrantLock reentrantLock2 = c1325l.f11400n;
        reentrantLock.lock();
        try {
            c1325l.f11398l = l1.b.f10998e;
            C1325l.i(c1325l);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // H2.f
    public s0.k d(H2.j jVar) {
        return ((C1564i) this.f3212b).d(jVar);
    }

    @Override // W.L
    public int e() {
        t tVar = (t) this.f3212b;
        return tVar.f3372f - tVar.t();
    }

    @Override // w2.y
    public void f() {
        z zVar = (z) this.f3212b;
        zVar.f12222a.setAlpha(0.0f);
        io.flutter.embedding.engine.renderer.i iVar = zVar.f12223b;
        if (iVar != null) {
            iVar.c(zVar.f12225d);
        }
        zVar.f12223b = null;
    }

    @Override // e4.InterfaceC0412a
    public Object get() {
        switch (this.f3211a) {
            case 4:
                return this.f3212b;
            default:
                return new c1.k((Context) ((j) this.f3212b).f3212b, "com.google.android.datatransport.events", Integer.valueOf(c1.k.f4915d).intValue());
        }
    }

    @Override // W.L
    public int h(View view) {
        u uVar = (u) view.getLayoutParams();
        ((t) this.f3212b).getClass();
        return (view.getLeft() - ((u) view.getLayoutParams()).f3374a.left) - ((ViewGroup.MarginLayoutParams) uVar).leftMargin;
    }

    @Override // H2.f
    public void i(String str, H2.d dVar) {
        ((C1564i) this.f3212b).u(str, dVar, null);
    }

    @Override // n1.InterfaceC1338y
    public void j() {
        C1297A c1297a = (C1297A) this.f3212b;
        Iterator it = ((C1400j) c1297a.f11282i.values()).iterator();
        while (it.hasNext()) {
            ((InterfaceC1276c) it.next()).l();
        }
        c1297a.f11289p.f11454p = Collections.emptySet();
    }

    @Override // n1.InterfaceC1306J
    public void k(l1.b bVar) {
        C1325l c1325l = (C1325l) this.f3212b;
        ReentrantLock reentrantLock = c1325l.f11400n;
        ReentrantLock reentrantLock2 = c1325l.f11400n;
        reentrantLock.lock();
        try {
            c1325l.f11398l = bVar;
            C1325l.i(c1325l);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // l.I
    public void l(k.i iVar, k.j jVar) {
        ((k.f) this.f3212b).f10559f.removeCallbacksAndMessages(iVar);
    }

    @Override // w2.y
    public void m() {
        z zVar = (z) this.f3212b;
        io.flutter.embedding.engine.renderer.i iVar = zVar.f12223b;
        if (iVar != null) {
            iVar.a(zVar.f12225d);
        }
    }

    @Override // n1.InterfaceC1338y
    public void n() {
        C1297A c1297a = (C1297A) this.f3212b;
        c1297a.f11277a.lock();
        try {
            c1297a.f11287n = new C1334u(c1297a, c1297a.f11284k, c1297a.f11285l, c1297a.f11280g, c1297a.f11286m, c1297a.f11277a, c1297a.f11279f);
            c1297a.f11287n.j();
            c1297a.f11278e.signalAll();
        } finally {
            c1297a.f11277a.unlock();
        }
    }

    @Override // H2.f
    public void o(String str, ByteBuffer byteBuffer) {
        ((C1564i) this.f3212b).w(str, byteBuffer, null);
    }

    @Override // W.L
    public View p(int i2) {
        return ((t) this.f3212b).o(i2);
    }

    @Override // W.L
    public int q() {
        return ((t) this.f3212b).s();
    }

    @Override // n1.InterfaceC1338y
    public boolean r() {
        return true;
    }

    @Override // n1.InterfaceC1338y
    public B1.n s(B1.n nVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // W.L
    public int t(View view) {
        u uVar = (u) view.getLayoutParams();
        ((t) this.f3212b).getClass();
        return view.getRight() + ((u) view.getLayoutParams()).f3374a.right + ((ViewGroup.MarginLayoutParams) uVar).rightMargin;
    }

    public String toString() {
        switch (this.f3211a) {
            case 6:
                return "ServiceLoaderComponentLoader{classLoader=" + ((ClassLoader) this.f3212b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // H2.f
    public void u(String str, H2.d dVar, s0.k kVar) {
        ((C1564i) this.f3212b).u(str, dVar, kVar);
    }

    @Override // w2.y
    public void v(io.flutter.embedding.engine.renderer.i iVar) {
        z zVar = (z) this.f3212b;
        io.flutter.embedding.engine.renderer.i iVar2 = zVar.f12223b;
        if (iVar2 != null) {
            iVar2.c(zVar.f12225d);
        }
        zVar.f12223b = iVar;
    }

    @Override // H2.f
    public void w(String str, ByteBuffer byteBuffer, H2.e eVar) {
        ((C1564i) this.f3212b).w(str, byteBuffer, eVar);
    }

    @Override // n1.InterfaceC1306J
    public void y(int i2) {
        C1325l c1325l = (C1325l) this.f3212b;
        ReentrantLock reentrantLock = c1325l.f11400n;
        ReentrantLock reentrantLock2 = c1325l.f11400n;
        reentrantLock.lock();
        try {
            if (c1325l.f11399m) {
                c1325l.f11399m = false;
                C1325l.h(c1325l, i2);
            } else {
                c1325l.f11399m = true;
                c1325l.f11391e.onConnectionSuspended(i2);
            }
            reentrantLock2.unlock();
        } catch (Throwable th) {
            reentrantLock2.unlock();
            throw th;
        }
    }

    public long z() {
        return ((C1278a) this.f3212b).c();
    }

    public /* synthetic */ j(int i2, boolean z) {
        this.f3211a = i2;
    }

    public j(C1383b c1383b) {
        this.f3211a = 11;
        Duration duration = C0398a.f5481b;
        Duration duration2 = C0398a.f5481b;
        this.f3212b = c1383b;
    }

    public j(int i2, D3.h hVar, L3.m mVar, String str) {
        Q2.a aVar;
        this.f3211a = 29;
        L3.l lVar = mVar.f1517e;
        int i3 = lVar.f1513b;
        int b6 = O.j.b(i2);
        Object obj = C1581f.f12477a;
        if (b6 == 0) {
            V2.e eVar = C1579d.f12467i;
            switch (lVar.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    obj = new C1579d(hVar, lVar);
                    break;
            }
            this.f3212b = obj;
            return;
        }
        if (b6 != 1) {
            throw new IllegalStateException("Unhandled case: ".concat(B0.o.o(i2)));
        }
        if (i3 != 4) {
            try {
                URI uri = new URI(str);
                L3.j jVar = new L3.j(1);
                String host = uri.getHost();
                if (host != null) {
                    jVar.e(L3.k.f1507d, host);
                }
                int port = uri.getPort();
                if (port == -1) {
                    String scheme = uri.getScheme();
                    if ("https".equals(scheme)) {
                        port = 443;
                    } else if ("http".equals(scheme)) {
                        port = 80;
                    }
                }
                if (port != -1) {
                    jVar.e(L3.k.f1508e, Long.valueOf(port));
                }
                aVar = jVar.b();
            } catch (URISyntaxException unused) {
                aVar = Q2.a.f2475d;
            }
            obj = new C1583h(hVar, i3, mVar, aVar);
        }
        this.f3212b = obj;
    }

    public j(C1278a delegate) {
        this.f3211a = 18;
        kotlin.jvm.internal.i.e(delegate, "delegate");
        new ArrayList();
        this.f3212b = delegate;
    }

    public j(Bundle bundle) {
        this.f3211a = 10;
        this.f3212b = new Bundle(bundle);
    }

    public j(U4.d dVar) {
        this.f3211a = 3;
        this.f3212b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), dVar);
    }

    public j(int i2) {
        this.f3211a = i2;
        switch (i2) {
            case 5:
                this.f3212b = new LinkedHashSet();
                break;
            case 8:
                this.f3212b = null;
                break;
            case 16:
                this.f3212b = new B3.e();
                break;
            case C0793l9.f8681C /* 19 */:
                this.f3212b = Collections.newSetFromMap(new WeakHashMap());
                break;
            default:
                this.f3212b = new SparseIntArray();
                break;
        }
    }

    @Override // n1.InterfaceC1338y
    public void c(Bundle bundle) {
    }

    @Override // n1.InterfaceC1338y
    public void g(int i2) {
    }

    @Override // n1.InterfaceC1338y
    public void x(l1.b bVar, m1.e eVar, boolean z) {
    }
}
