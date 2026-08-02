package e3;

import A5.o;
import A5.q;
import C0.L;
import C0.u;
import C0.v;
import E3.F;
import E4.E;
import E4.G;
import E4.H;
import E4.I;
import E4.z;
import G4.C0286t;
import G4.InterfaceC0273f;
import H4.m;
import K4.C0321h;
import P.AbstractC0348d;
import P.C0352h;
import P.InterfaceC0349e;
import U5.b0;
import W5.Q0;
import W5.X0;
import Y4.D;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.t;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Q;
import c2.Y;
import com.google.android.gms.tasks.TaskCompletionSource;
import e6.AbstractC1053b;
import f2.C1074f;
import h2.C1182d;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.protocol.Message;
import io.sentry.protocol.SentryThread;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import k4.AbstractC1341c;
import k4.C1343e;
import l4.C1405p;
import l4.C1407r;
import l4.InterfaceC1390a;
import l4.s;
import m.w;
import n1.C1450e;
import n4.C;
import n4.C1473g;
import n4.C1479m;
import n4.M;
import s4.C1595c;
import t4.InterfaceC1609a;
import t4.InterfaceC1610b;
import v4.l;
import v4.p;
import v4.r;
import w5.InterfaceC1781a;
import z5.C1827i;

/* renamed from: e3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1023h implements A3.i, L, InterfaceC0273f, L6.b, InterfaceC0349e, W3.h, X0, Q, Y, u2.L, w, InterfaceC1390a, C, InterfaceC1781a, InterfaceC1610b, q {

    /* renamed from: b, reason: collision with root package name */
    public static C1023h f12666b;

    /* renamed from: a, reason: collision with root package name */
    public Object f12667a;

    public /* synthetic */ C1023h(Object obj) {
        this.f12667a = obj;
    }

    public static void Z(K0.b bVar) {
        bVar.g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        bVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        bVar.g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.g("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static B3.g b0(K0.b bVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new F0.a(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap.put("prerequisite_id", new F0.a(2, "prerequisite_id", "TEXT", null, true, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        boolean z4 = false;
        hashSet2.add(new F0.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), false));
        hashSet2.add(new F0.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), false));
        F0.e eVar = new F0.e("Dependency", hashMap, hashSet, hashSet2);
        F0.e a2 = F0.e.a(bVar, "Dependency");
        if (!eVar.equals(a2)) {
            return new B3.g(z4, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a2, 1);
        }
        HashMap hashMap2 = new HashMap(25);
        hashMap2.put("id", new F0.a(1, "id", "TEXT", null, true, 1));
        hashMap2.put(SentryThread.JsonKeys.STATE, new F0.a(0, SentryThread.JsonKeys.STATE, "INTEGER", null, true, 1));
        hashMap2.put("worker_class_name", new F0.a(0, "worker_class_name", "TEXT", null, true, 1));
        hashMap2.put("input_merger_class_name", new F0.a(0, "input_merger_class_name", "TEXT", null, false, 1));
        hashMap2.put("input", new F0.a(0, "input", "BLOB", null, true, 1));
        hashMap2.put("output", new F0.a(0, "output", "BLOB", null, true, 1));
        hashMap2.put("initial_delay", new F0.a(0, "initial_delay", "INTEGER", null, true, 1));
        hashMap2.put("interval_duration", new F0.a(0, "interval_duration", "INTEGER", null, true, 1));
        hashMap2.put("flex_duration", new F0.a(0, "flex_duration", "INTEGER", null, true, 1));
        hashMap2.put("run_attempt_count", new F0.a(0, "run_attempt_count", "INTEGER", null, true, 1));
        hashMap2.put("backoff_policy", new F0.a(0, "backoff_policy", "INTEGER", null, true, 1));
        hashMap2.put("backoff_delay_duration", new F0.a(0, "backoff_delay_duration", "INTEGER", null, true, 1));
        hashMap2.put("period_start_time", new F0.a(0, "period_start_time", "INTEGER", null, true, 1));
        hashMap2.put("minimum_retention_duration", new F0.a(0, "minimum_retention_duration", "INTEGER", null, true, 1));
        hashMap2.put("schedule_requested_at", new F0.a(0, "schedule_requested_at", "INTEGER", null, true, 1));
        hashMap2.put("run_in_foreground", new F0.a(0, "run_in_foreground", "INTEGER", null, true, 1));
        hashMap2.put("out_of_quota_policy", new F0.a(0, "out_of_quota_policy", "INTEGER", null, true, 1));
        hashMap2.put("required_network_type", new F0.a(0, "required_network_type", "INTEGER", null, false, 1));
        hashMap2.put("requires_charging", new F0.a(0, "requires_charging", "INTEGER", null, true, 1));
        hashMap2.put("requires_device_idle", new F0.a(0, "requires_device_idle", "INTEGER", null, true, 1));
        hashMap2.put("requires_battery_not_low", new F0.a(0, "requires_battery_not_low", "INTEGER", null, true, 1));
        hashMap2.put("requires_storage_not_low", new F0.a(0, "requires_storage_not_low", "INTEGER", null, true, 1));
        hashMap2.put("trigger_content_update_delay", new F0.a(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
        hashMap2.put("trigger_max_content_delay", new F0.a(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
        hashMap2.put("content_uri_triggers", new F0.a(0, "content_uri_triggers", "BLOB", null, false, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new F0.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), false));
        hashSet4.add(new F0.d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), false));
        F0.e eVar2 = new F0.e("WorkSpec", hashMap2, hashSet3, hashSet4);
        F0.e a4 = F0.e.a(bVar, "WorkSpec");
        if (!eVar2.equals(a4)) {
            return new B3.g(z4, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a4, 1);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new F0.a(1, "tag", "TEXT", null, true, 1));
        hashMap3.put("work_spec_id", new F0.a(2, "work_spec_id", "TEXT", null, true, 1));
        boolean z7 = true;
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new F0.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), false));
        F0.e eVar3 = new F0.e("WorkTag", hashMap3, hashSet5, hashSet6);
        F0.e a7 = F0.e.a(bVar, "WorkTag");
        if (!eVar3.equals(a7)) {
            return new B3.g(z4, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a7, 1);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new F0.a(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap4.put("system_id", new F0.a(0, "system_id", "INTEGER", null, true, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        F0.e eVar4 = new F0.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        F0.e a8 = F0.e.a(bVar, "SystemIdInfo");
        if (!eVar4.equals(a8)) {
            return new B3.g(z4, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a8, 1);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new F0.a(1, "name", "TEXT", null, true, 1));
        hashMap5.put("work_spec_id", new F0.a(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new F0.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), false));
        F0.e eVar5 = new F0.e("WorkName", hashMap5, hashSet8, hashSet9);
        F0.e a9 = F0.e.a(bVar, "WorkName");
        if (!eVar5.equals(a9)) {
            return new B3.g(z4, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a9, 1);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new F0.a(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap6.put("progress", new F0.a(0, "progress", "BLOB", null, true, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        F0.e eVar6 = new F0.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        F0.e a10 = F0.e.a(bVar, "WorkProgress");
        if (!eVar6.equals(a10)) {
            return new B3.g(z4, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a10, 1);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new F0.a(1, "key", "TEXT", null, true, 1));
        hashMap7.put("long_value", new F0.a(0, "long_value", "INTEGER", null, false, 1));
        F0.e eVar7 = new F0.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        F0.e a11 = F0.e.a(bVar, "Preference");
        if (eVar7.equals(a11)) {
            return new B3.g(z7, null, 1);
        }
        return new B3.g(z4, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a11, 1);
    }

    public static synchronized C1023h e0(Context context) {
        C1023h c1023h;
        synchronized (C1023h.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (C1023h.class) {
                c1023h = f12666b;
                if (c1023h == null) {
                    c1023h = new C1023h();
                    C1016a a2 = C1016a.a(applicationContext);
                    c1023h.f12667a = a2;
                    a2.b();
                    a2.c();
                    f12666b = c1023h;
                }
            }
            return c1023h;
        }
        return c1023h;
    }

    @Override // P.InterfaceC0349e
    public void A(int i7) {
        ((ContentInfo.Builder) this.f12667a).setFlags(i7);
    }

    @Override // G4.InterfaceC0273f
    public List B(String str) {
        HashSet hashSet = (HashSet) ((C0286t) this.f12667a).f3024a.get(str);
        return hashSet != null ? new ArrayList(hashSet) : Collections.emptyList();
    }

    @Override // t4.InterfaceC1610b
    public l C(l lVar, l lVar2, C0286t c0286t) {
        r<p> rVar;
        q4.k.b("Can't use IndexedNode that doesn't have filter's index", lVar2.f17188c == ((v4.k) this.f12667a));
        if (c0286t != null) {
            Iterator it = lVar.f17186a.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                rVar = lVar2.f17186a;
                if (!hasNext) {
                    break;
                }
                p pVar = (p) it.next();
                if (!rVar.i(pVar.f17195a)) {
                    c0286t.d(new C1595c(1, l.m(pVar.f17196b), pVar.f17195a, null, null));
                }
            }
            if (!rVar.r()) {
                for (p pVar2 : rVar) {
                    v4.c cVar = pVar2.f17195a;
                    r rVar2 = lVar.f17186a;
                    boolean i7 = rVar2.i(cVar);
                    r rVar3 = pVar2.f17196b;
                    v4.c cVar2 = pVar2.f17195a;
                    if (i7) {
                        r o7 = rVar2.o(cVar2);
                        if (!o7.equals(rVar3)) {
                            c0286t.d(new C1595c(4, l.m(rVar3), cVar2, null, l.m(o7)));
                        }
                    } else {
                        c0286t.d(new C1595c(2, l.m(rVar3), cVar2, null, null));
                    }
                }
            }
        }
        return lVar2;
    }

    @Override // t4.InterfaceC1610b
    public l D(l lVar, v4.c cVar, r rVar, C1473g c1473g, InterfaceC1609a interfaceC1609a, C0286t c0286t) {
        q4.k.b("The index must match the filter", lVar.f17188c == ((v4.k) this.f12667a));
        r rVar2 = lVar.f17186a;
        r o7 = rVar2.o(cVar);
        if (o7.g(c1473g).equals(rVar.g(c1473g)) && o7.isEmpty() == rVar.isEmpty()) {
            return lVar;
        }
        if (c0286t != null) {
            if (rVar.isEmpty()) {
                if (rVar2.i(cVar)) {
                    c0286t.d(new C1595c(1, l.m(o7), cVar, null, null));
                } else {
                    q4.k.b("A child remove without an old child only makes sense on a leaf node", rVar2.r());
                }
            } else if (o7.isEmpty()) {
                c0286t.d(new C1595c(2, l.m(rVar), cVar, null, null));
            } else {
                c0286t.d(new C1595c(4, l.m(rVar), cVar, null, l.m(o7)));
            }
        }
        return (rVar2.r() && rVar.isEmpty()) ? lVar : lVar.t(cVar, rVar);
    }

    @Override // t4.InterfaceC1610b
    public l E(l lVar, r rVar) {
        return lVar.f17186a.isEmpty() ? lVar : new l(lVar.f17186a.v(rVar), lVar.f17188c, lVar.f17187b);
    }

    @Override // G4.InterfaceC0273f
    public List F(I i7) {
        return null;
    }

    @Override // C0.L
    public int K() {
        u uVar = (u) this.f12667a;
        return uVar.f1320g - uVar.r();
    }

    @Override // G4.InterfaceC0273f
    public H4.b L(I i7) {
        return H4.b.f3303d;
    }

    @Override // t4.InterfaceC1610b
    public v4.k N() {
        return (v4.k) this.f12667a;
    }

    @Override // G4.InterfaceC0273f
    public H4.b O(String str) {
        return H4.b.f3303d;
    }

    @Override // l4.InterfaceC1390a
    public void Q(String str) {
        ((TaskCompletionSource) this.f12667a).setResult(str);
    }

    @Override // W3.h
    public Object R(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 2; i7++) {
            Provider provider = Security.getProvider(strArr[i7]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (true) {
            boolean hasNext = it.hasNext();
            W3.j jVar = (W3.j) this.f12667a;
            if (!hasNext) {
                return jVar.d(str, null);
            }
            try {
                return jVar.d(str, (Provider) it.next());
            } catch (Exception e7) {
                if (exc == null) {
                    exc = e7;
                }
            }
        }
    }

    @Override // C0.L
    public View S(int i7) {
        return ((u) this.f12667a).o(i7);
    }

    @Override // c2.Y
    public long T() {
        long j = Long.MAX_VALUE;
        for (Y y4 : (Y[]) this.f12667a) {
            long T6 = y4.T();
            if (T6 != Long.MIN_VALUE) {
                j = Math.min(j, T6);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // C0.L
    public int V(View view) {
        v vVar = (v) view.getLayoutParams();
        ((u) this.f12667a).getClass();
        return view.getBottom() + ((v) view.getLayoutParams()).f1321a.bottom + ((ViewGroup.MarginLayoutParams) vVar).bottomMargin;
    }

    @Override // l4.InterfaceC1390a
    public void W(String str) {
        ((TaskCompletionSource) this.f12667a).setException(new Exception(str));
    }

    @Override // c2.Y
    public void Y(long j) {
        for (Y y4 : (Y[]) this.f12667a) {
            y4.Y(j);
        }
    }

    @Override // A3.j
    public Object a() {
        return (Context) this.f12667a;
    }

    public C1343e a0(int i7) {
        H e7 = ((z) this.f12667a).e();
        G g3 = (G) e7.f2117g.get(Integer.valueOf(i7));
        if (g3 != null && g3.f2110b) {
            return H4.h.f3317c.l(g3.f2109a);
        }
        C1343e c1343e = H4.h.f3317c;
        HashMap hashMap = e7.f2114d;
        if (hashMap.containsKey(Integer.valueOf(i7))) {
            for (E4.C c3 : (List) hashMap.get(Integer.valueOf(i7))) {
                HashMap hashMap2 = e7.f2113c;
                if (hashMap2.containsKey(c3)) {
                    C1343e c1343e2 = ((E) hashMap2.get(c3)).f2108c.f2153e;
                    if (c1343e.f14775a.size() >= c1343e2.f14775a.size()) {
                        c1343e2 = c1343e;
                        c1343e = c1343e2;
                    }
                    Iterator it = c1343e.iterator();
                    while (true) {
                        F f7 = (F) it;
                        if (!((Iterator) f7.f1994b).hasNext()) {
                            break;
                        }
                        c1343e2 = c1343e2.l(f7.next());
                    }
                    c1343e = c1343e2;
                }
            }
        }
        return c1343e;
    }

    @Override // P.InterfaceC0349e
    public C0352h b() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f12667a).build();
        return new C0352h(new C1450e(build));
    }

    @Override // u2.L
    public void c() {
        C1074f c1074f = (C1074f) this.f12667a;
        c1074f.f12824A.c();
        Z4.b bVar = c1074f.f12826C;
        if (bVar != null) {
            throw bVar;
        }
    }

    public void c0(boolean z4) {
        Q0 q02 = (Q0) this.f12667a;
        q02.c0.o(q02.f6937H, z4);
    }

    @Override // n4.C
    public void d(s4.h hVar) {
        s sVar = ((C1479m) this.f12667a).f15449c;
        ArrayList l7 = hVar.f16172a.l();
        HashMap b7 = hVar.f16173b.b();
        sVar.getClass();
        C1407r c1407r = new C1407r(l7, b7);
        t tVar = sVar.f15007y;
        if (tVar.r0()) {
            tVar.W(null, "unlistening on " + c1407r, new Object[0]);
        }
        C1405p g3 = sVar.g(c1407r);
        if (g3 != null && sVar.b()) {
            HashMap hashMap = new HashMap();
            C1407r c1407r2 = g3.f14967b;
            hashMap.put("p", D.M(c1407r2.f14974a));
            Long l8 = g3.f14969d;
            if (l8 != null) {
                hashMap.put("q", c1407r2.f14975b);
                hashMap.put("t", l8);
            }
            sVar.p("n", false, hashMap, null);
        }
        sVar.c();
    }

    public void d0(b0 b0Var, byte[] bArr) {
        AbstractC1053b.c();
        try {
            String str = "/" + ((String) ((X5.j) this.f12667a).j.f3291b);
            if (bArr != null) {
                ((X5.j) this.f12667a).f7558q = true;
                str = str + "?" + F3.e.f2737c.c(bArr);
            }
            synchronized (((X5.j) this.f12667a).f7555n.f7547w) {
                X5.i.j(((X5.j) this.f12667a).f7555n, b0Var, str);
            }
            AbstractC1053b.f12736a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1053b.f12736a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // n4.C
    public void f(s4.h hVar, n4.E e7, M m7, M m8) {
        s sVar = ((C1479m) this.f12667a).f15449c;
        ArrayList l7 = hVar.f16172a.l();
        HashMap b7 = hVar.f16173b.b();
        Long valueOf = e7 != null ? Long.valueOf(e7.f15368a) : null;
        com.google.android.gms.common.internal.w wVar = new com.google.android.gms.common.internal.w(12, (Object) this, (Object) m8, false);
        sVar.getClass();
        C1407r c1407r = new C1407r(l7, b7);
        t tVar = sVar.f15007y;
        if (tVar.r0()) {
            tVar.W(null, "Listening on " + c1407r, new Object[0]);
        }
        HashMap hashMap = sVar.f14998p;
        D.v("listen() called twice for same QuerySpec.", !hashMap.containsKey(c1407r), new Object[0]);
        if (tVar.r0()) {
            tVar.W(null, "Adding listen query: " + c1407r, new Object[0]);
        }
        C1405p c1405p = new C1405p(wVar, c1407r, valueOf, m7);
        hashMap.put(c1407r, c1405p);
        if (sVar.b()) {
            sVar.m(c1405p);
        }
        sVar.c();
    }

    public synchronized void f0() {
        C1016a c1016a = (C1016a) this.f12667a;
        ReentrantLock reentrantLock = c1016a.f12647a;
        reentrantLock.lock();
        try {
            c1016a.f12648b.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // P.InterfaceC0349e
    public void h(Bundle bundle) {
        ((ContentInfo.Builder) this.f12667a).setExtras(bundle);
    }

    @Override // c2.Y
    public boolean isLoading() {
        for (Y y4 : (Y[]) this.f12667a) {
            if (y4.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // C0.L
    public int j(View view) {
        v vVar = (v) view.getLayoutParams();
        ((u) this.f12667a).getClass();
        return (view.getTop() - ((v) view.getLayoutParams()).f1321a.top) - ((ViewGroup.MarginLayoutParams) vVar).topMargin;
    }

    @Override // c2.Y
    public long k() {
        long j = Long.MAX_VALUE;
        for (Y y4 : (Y[]) this.f12667a) {
            long k7 = y4.k();
            if (k7 != Long.MIN_VALUE) {
                j = Math.min(j, k7);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // t4.InterfaceC1610b
    public boolean l() {
        return false;
    }

    @Override // G4.InterfaceC0273f
    public int m(I i7) {
        return 1;
    }

    @Override // m.w
    public boolean n(m.k kVar) {
        Window.Callback callback = ((i.v) this.f12667a).f13750C.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // A5.q
    public void onMethodCall(o oVar, A5.r rVar) {
        Object obj;
        com.google.android.gms.common.internal.w wVar = (com.google.android.gms.common.internal.w) this.f12667a;
        if (((io.flutter.plugin.platform.p) wVar.f11336c) == null) {
        }
        String str = oVar.f676a;
        str.getClass();
        obj = oVar.f677b;
        switch (str) {
            case "create":
                Map map = (Map) obj;
                try {
                    ((io.flutter.plugin.platform.p) wVar.f11336c).e(new C0321h((String) map.get("viewType"), map.containsKey(Message.JsonKeys.PARAMS) ? ByteBuffer.wrap((byte[]) map.get(Message.JsonKeys.PARAMS)) : null, ((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue()));
                    ((A5.p) rVar).success(null);
                    break;
                } catch (IllegalStateException e7) {
                    ((A5.p) rVar).error("error", Log.getStackTraceString(e7), null);
                    return;
                }
            case "clearFocus":
                try {
                    ((io.flutter.plugin.platform.p) wVar.f11336c).c(((Integer) obj).intValue());
                    ((A5.p) rVar).success(null);
                    break;
                } catch (IllegalStateException e8) {
                    ((A5.p) rVar).error("error", Log.getStackTraceString(e8), null);
                    return;
                }
            case "touch":
                List list = (List) obj;
                try {
                    ((io.flutter.plugin.platform.p) wVar.f11336c).j(new C1827i(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                    ((A5.p) rVar).success(null);
                    break;
                } catch (IllegalStateException e9) {
                    ((A5.p) rVar).error("error", Log.getStackTraceString(e9), null);
                    return;
                }
            case "setDirection":
                Map map2 = (Map) obj;
                try {
                    ((io.flutter.plugin.platform.p) wVar.f11336c).m(((Integer) map2.get("id")).intValue(), ((Integer) map2.get("direction")).intValue());
                    ((A5.p) rVar).success(null);
                    break;
                } catch (IllegalStateException e10) {
                    ((A5.p) rVar).error("error", Log.getStackTraceString(e10), null);
                    return;
                }
            case "isSurfaceControlEnabled":
                FlutterJNI flutterJNI = ((io.flutter.plugin.platform.r) ((io.flutter.plugin.platform.p) wVar.f11336c).f14169b).f14174e;
                ((A5.p) rVar).success(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                break;
            case "dispose":
                try {
                    ((io.flutter.plugin.platform.p) wVar.f11336c).f(((Integer) ((Map) obj).get("id")).intValue());
                    ((A5.p) rVar).success(null);
                    break;
                } catch (IllegalStateException e11) {
                    ((A5.p) rVar).error("error", Log.getStackTraceString(e11), null);
                    return;
                }
            default:
                ((A5.p) rVar).notImplemented();
                break;
        }
    }

    @Override // C0.L
    public int r() {
        return ((u) this.f12667a).u();
    }

    @Override // G4.InterfaceC0273f
    public void s(m mVar) {
        ((C0286t) this.f12667a).a(mVar);
    }

    @Override // P.InterfaceC0349e
    public void t(Uri uri) {
        ((ContentInfo.Builder) this.f12667a).setLinkUri(uri);
    }

    @Override // G4.InterfaceC0273f
    public Collection x() {
        return Collections.emptyList();
    }

    @Override // c2.Y
    public boolean y(long j) {
        boolean z4;
        boolean z7 = false;
        do {
            long k7 = k();
            if (k7 == Long.MIN_VALUE) {
                break;
            }
            z4 = false;
            for (Y y4 : (Y[]) this.f12667a) {
                long k8 = y4.k();
                boolean z8 = k8 != Long.MIN_VALUE && k8 <= j;
                if (k8 == k7 || z8) {
                    z4 |= y4.y(j);
                }
            }
            z7 |= z4;
        } while (z4);
        return z7;
    }

    @Override // G4.InterfaceC0273f
    public String z() {
        return null;
    }

    public C1023h(int i7) {
        switch (i7) {
            case 16:
                this.f12667a = new C1182d(5, 1.0f, false);
                break;
            default:
                this.f12667a = new C0286t(0);
                break;
        }
    }

    @Override // m.w
    public void a(m.k kVar, boolean z4) {
        ((i.v) this.f12667a).s(kVar);
    }

    public C1023h(ClipData clipData, int i7) {
        this.f12667a = AbstractC0348d.l(clipData, i7);
    }

    @Override // G4.InterfaceC0273f
    public void G() {
    }

    @Override // t4.InterfaceC1610b
    public C1023h i() {
        return this;
    }

    @Override // G4.InterfaceC0273f
    public void start() {
    }

    @Override // G4.InterfaceC0273f
    public void H(H4.a aVar) {
    }

    public void J(int i7) {
    }

    public void U(int i7) {
    }

    @Override // G4.InterfaceC0273f
    public void X(I i7) {
    }

    @Override // G4.InterfaceC0273f
    public void e(AbstractC1341c abstractC1341c) {
    }

    @Override // G4.InterfaceC0273f
    public void g(H4.a aVar) {
    }

    @Override // G4.InterfaceC0273f
    public void u(String str, H4.b bVar) {
    }
}
