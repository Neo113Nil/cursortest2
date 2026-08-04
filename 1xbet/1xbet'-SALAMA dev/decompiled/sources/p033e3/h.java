package p033e3;

import A3.i;
import A5.o;
import A5.q;
import B3.g;
import C0.L;
import C0.u;
import C0.v;
import E3.F;
import E4.E;
import E4.G;
import E4.H;
import E4.I;
import E4.z;
import F0.d;
import F0.e;
import G4.C0286t;
import G4.InterfaceC0273f;
import H4.m;
import K4.C0321h;
import L6.b;
import P.AbstractC0348d;
import P.C0352h;
import P.InterfaceC0349e;
import U5.b0;
import W3.j;
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
import com.google.android.gms.tasks.TaskCompletionSource;
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
import p018c2.Y;
import p040f2.f;
import p083l4.a;
import p083l4.s;
import p086m.w;
import p098n4.C;
import p098n4.C0934g;
import p098n4.C0940m;
import p098n4.M;
import p120q4.k;
import p134s4.c;
import v4.l;
import v4.p;
import v4.r;

/* JADX INFO: loaded from: classes.dex */
public class h implements i, L, InterfaceC0273f, b, InterfaceC0349e, W3.h, X0, Q, Y, p146u2.L, w, a, C, p159w5.a, p141t4.b, q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static h f12672b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f12673a;

    public /* synthetic */ h(Object obj) {
        this.f12673a = obj;
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

    public static g b0(K0.b bVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new F0.a(1, "work_spec_id", "TEXT", null, true, 1));
        map.put("prerequisite_id", new F0.a(2, "prerequisite_id", "TEXT", null, true, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        boolean z4 = false;
        hashSet2.add(new d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), false));
        hashSet2.add(new d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), false));
        e eVar = new e("Dependency", map, hashSet, hashSet2);
        e eVarA = e.a(bVar, "Dependency");
        if (!eVar.equals(eVarA)) {
            return new g(z4, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + eVarA, 1);
        }
        HashMap map2 = new HashMap(25);
        map2.put("id", new F0.a(1, "id", "TEXT", null, true, 1));
        map2.put(SentryThread.JsonKeys.STATE, new F0.a(0, SentryThread.JsonKeys.STATE, "INTEGER", null, true, 1));
        map2.put("worker_class_name", new F0.a(0, "worker_class_name", "TEXT", null, true, 1));
        map2.put("input_merger_class_name", new F0.a(0, "input_merger_class_name", "TEXT", null, false, 1));
        map2.put("input", new F0.a(0, "input", "BLOB", null, true, 1));
        map2.put("output", new F0.a(0, "output", "BLOB", null, true, 1));
        map2.put("initial_delay", new F0.a(0, "initial_delay", "INTEGER", null, true, 1));
        map2.put("interval_duration", new F0.a(0, "interval_duration", "INTEGER", null, true, 1));
        map2.put("flex_duration", new F0.a(0, "flex_duration", "INTEGER", null, true, 1));
        map2.put("run_attempt_count", new F0.a(0, "run_attempt_count", "INTEGER", null, true, 1));
        map2.put("backoff_policy", new F0.a(0, "backoff_policy", "INTEGER", null, true, 1));
        map2.put("backoff_delay_duration", new F0.a(0, "backoff_delay_duration", "INTEGER", null, true, 1));
        map2.put("period_start_time", new F0.a(0, "period_start_time", "INTEGER", null, true, 1));
        map2.put("minimum_retention_duration", new F0.a(0, "minimum_retention_duration", "INTEGER", null, true, 1));
        map2.put("schedule_requested_at", new F0.a(0, "schedule_requested_at", "INTEGER", null, true, 1));
        map2.put("run_in_foreground", new F0.a(0, "run_in_foreground", "INTEGER", null, true, 1));
        map2.put("out_of_quota_policy", new F0.a(0, "out_of_quota_policy", "INTEGER", null, true, 1));
        map2.put("required_network_type", new F0.a(0, "required_network_type", "INTEGER", null, false, 1));
        map2.put("requires_charging", new F0.a(0, "requires_charging", "INTEGER", null, true, 1));
        map2.put("requires_device_idle", new F0.a(0, "requires_device_idle", "INTEGER", null, true, 1));
        map2.put("requires_battery_not_low", new F0.a(0, "requires_battery_not_low", "INTEGER", null, true, 1));
        map2.put("requires_storage_not_low", new F0.a(0, "requires_storage_not_low", "INTEGER", null, true, 1));
        map2.put("trigger_content_update_delay", new F0.a(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
        map2.put("trigger_max_content_delay", new F0.a(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
        map2.put("content_uri_triggers", new F0.a(0, "content_uri_triggers", "BLOB", null, false, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), false));
        hashSet4.add(new d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), false));
        e eVar2 = new e("WorkSpec", map2, hashSet3, hashSet4);
        e eVarA2 = e.a(bVar, "WorkSpec");
        if (!eVar2.equals(eVarA2)) {
            return new g(z4, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2, 1);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new F0.a(1, "tag", "TEXT", null, true, 1));
        map3.put("work_spec_id", new F0.a(2, "work_spec_id", "TEXT", null, true, 1));
        boolean z7 = true;
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), false));
        e eVar3 = new e("WorkTag", map3, hashSet5, hashSet6);
        e eVarA3 = e.a(bVar, "WorkTag");
        if (!eVar3.equals(eVarA3)) {
            return new g(z4, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + eVarA3, 1);
        }
        HashMap map4 = new HashMap(2);
        map4.put("work_spec_id", new F0.a(1, "work_spec_id", "TEXT", null, true, 1));
        map4.put("system_id", new F0.a(0, "system_id", "INTEGER", null, true, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        e eVar4 = new e("SystemIdInfo", map4, hashSet7, new HashSet(0));
        e eVarA4 = e.a(bVar, "SystemIdInfo");
        if (!eVar4.equals(eVarA4)) {
            return new g(z4, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + eVarA4, 1);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new F0.a(1, "name", "TEXT", null, true, 1));
        map5.put("work_spec_id", new F0.a(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), false));
        e eVar5 = new e("WorkName", map5, hashSet8, hashSet9);
        e eVarA5 = e.a(bVar, "WorkName");
        if (!eVar5.equals(eVarA5)) {
            return new g(z4, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + eVarA5, 1);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new F0.a(1, "work_spec_id", "TEXT", null, true, 1));
        map6.put("progress", new F0.a(0, "progress", "BLOB", null, true, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        e eVar6 = new e("WorkProgress", map6, hashSet10, new HashSet(0));
        e eVarA6 = e.a(bVar, "WorkProgress");
        if (!eVar6.equals(eVarA6)) {
            return new g(z4, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + eVarA6, 1);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new F0.a(1, "key", "TEXT", null, true, 1));
        map7.put("long_value", new F0.a(0, "long_value", "INTEGER", null, false, 1));
        e eVar7 = new e("Preference", map7, new HashSet(0), new HashSet(0));
        e eVarA7 = e.a(bVar, "Preference");
        if (eVar7.equals(eVarA7)) {
            return new g(z7, null, 1);
        }
        return new g(z4, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + eVarA7, 1);
    }

    public static synchronized h e0(Context context) {
        h hVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (h.class) {
            hVar = f12672b;
            if (hVar == null) {
                hVar = new h();
                a aVarA = a.a(applicationContext);
                hVar.f12673a = aVarA;
                aVarA.b();
                aVarA.c();
                f12672b = hVar;
            }
        }
        return hVar;
        return hVar;
    }

    @Override // P.InterfaceC0349e
    public void A(int i7) {
        ((ContentInfo.Builder) this.f12673a).setFlags(i7);
    }

    @Override // G4.InterfaceC0273f
    public List B(String str) {
        HashSet hashSet = (HashSet) ((C0286t) this.f12673a).f3024a.get(str);
        return hashSet != null ? new ArrayList(hashSet) : Collections.emptyList();
    }

    @Override // p141t4.b
    public l C(l lVar, l lVar2, C0286t c0286t) {
        r<p> rVar;
        k.b("Can't use IndexedNode that doesn't have filter's index", lVar2.f17194c == ((v4.k) this.f12673a));
        if (c0286t != null) {
            Iterator it = lVar.f17192a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                rVar = lVar2.f17192a;
                if (!zHasNext) {
                    break;
                }
                p pVar = (p) it.next();
                if (!rVar.i(pVar.f17201a)) {
                    c0286t.d(new c(1, l.m(pVar.f17202b), pVar.f17201a, null, null));
                }
            }
            if (!rVar.r()) {
                for (p pVar2 : rVar) {
                    v4.c cVar = pVar2.f17201a;
                    r rVar2 = lVar.f17192a;
                    boolean zI = rVar2.i(cVar);
                    r rVar3 = pVar2.f17202b;
                    v4.c cVar2 = pVar2.f17201a;
                    if (zI) {
                        r rVarO = rVar2.o(cVar2);
                        if (!rVarO.equals(rVar3)) {
                            c0286t.d(new c(4, l.m(rVar3), cVar2, null, l.m(rVarO)));
                        }
                    } else {
                        c0286t.d(new c(2, l.m(rVar3), cVar2, null, null));
                    }
                }
            }
        }
        return lVar2;
    }

    @Override // p141t4.b
    public l D(l lVar, v4.c cVar, r rVar, C0934g c0934g, p141t4.a aVar, C0286t c0286t) {
        k.b("The index must match the filter", lVar.f17194c == ((v4.k) this.f12673a));
        r rVar2 = lVar.f17192a;
        r rVarO = rVar2.o(cVar);
        if (rVarO.g(c0934g).equals(rVar.g(c0934g)) && rVarO.isEmpty() == rVar.isEmpty()) {
            return lVar;
        }
        if (c0286t != null) {
            if (rVar.isEmpty()) {
                if (rVar2.i(cVar)) {
                    c0286t.d(new c(1, l.m(rVarO), cVar, null, null));
                } else {
                    k.b("A child remove without an old child only makes sense on a leaf node", rVar2.r());
                }
            } else if (rVarO.isEmpty()) {
                c0286t.d(new c(2, l.m(rVar), cVar, null, null));
            } else {
                c0286t.d(new c(4, l.m(rVar), cVar, null, l.m(rVarO)));
            }
        }
        return (rVar2.r() && rVar.isEmpty()) ? lVar : lVar.t(cVar, rVar);
    }

    @Override // p141t4.b
    public l E(l lVar, r rVar) {
        return lVar.f17192a.isEmpty() ? lVar : new l(lVar.f17192a.v(rVar), lVar.f17194c, lVar.f17193b);
    }

    @Override // G4.InterfaceC0273f
    public List F(I i7) {
        return null;
    }

    @Override // C0.L
    public int K() {
        u uVar = (u) this.f12673a;
        return uVar.f1320g - uVar.r();
    }

    @Override // G4.InterfaceC0273f
    public H4.b L(I i7) {
        return H4.b.f3303d;
    }

    @Override // p141t4.b
    public v4.k N() {
        return (v4.k) this.f12673a;
    }

    @Override // G4.InterfaceC0273f
    public H4.b O(String str) {
        return H4.b.f3303d;
    }

    @Override // p083l4.a
    public void Q(String str) {
        ((TaskCompletionSource) this.f12673a).setResult(str);
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
            boolean zHasNext = it.hasNext();
            j jVar = (j) this.f12673a;
            if (!zHasNext) {
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
        return ((u) this.f12673a).o(i7);
    }

    @Override // p018c2.Y
    public long T() {
        long jMin = Long.MAX_VALUE;
        for (Y y4 : (Y[]) this.f12673a) {
            long jT = y4.T();
            if (jT != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jT);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // C0.L
    public int V(View view) {
        v vVar = (v) view.getLayoutParams();
        ((u) this.f12673a).getClass();
        return view.getBottom() + ((v) view.getLayoutParams()).f1321a.bottom + ((ViewGroup.MarginLayoutParams) vVar).bottomMargin;
    }

    @Override // p083l4.a
    public void W(String str) {
        ((TaskCompletionSource) this.f12673a).setException(new Exception(str));
    }

    @Override // p018c2.Y
    public void Y(long j) {
        for (Y y4 : (Y[]) this.f12673a) {
            y4.Y(j);
        }
    }

    @Override // A3.j
    public Object a() {
        return (Context) this.f12673a;
    }

    public p075k4.e a0(int i7) {
        H hE = ((z) this.f12673a).e();
        G g3 = (G) hE.f2117g.get(Integer.valueOf(i7));
        if (g3 != null && g3.f2110b) {
            return H4.h.f3317c.l(g3.f2109a);
        }
        p075k4.e eVar = H4.h.f3317c;
        HashMap map = hE.f2114d;
        if (map.containsKey(Integer.valueOf(i7))) {
            for (E4.C c3 : (List) map.get(Integer.valueOf(i7))) {
                HashMap map2 = hE.f2113c;
                if (map2.containsKey(c3)) {
                    p075k4.e eVarL = ((E) map2.get(c3)).f2108c.f2153e;
                    if (eVar.f14781a.size() >= eVarL.f14781a.size()) {
                        eVarL = eVar;
                        eVar = eVarL;
                    }
                    Iterator it = eVar.iterator();
                    while (true) {
                        F f7 = (F) it;
                        if (!((Iterator) f7.f1994b).hasNext()) {
                            break;
                        }
                        eVarL = eVarL.l(f7.next());
                    }
                    eVar = eVarL;
                }
            }
        }
        return eVar;
    }

    @Override // P.InterfaceC0349e
    public C0352h b() {
        return new C0352h(new p096n1.e(((ContentInfo.Builder) this.f12673a).build()));
    }

    @Override // p146u2.L
    public void c() throws Z4.b {
        f fVar = (f) this.f12673a;
        fVar.f12830A.c();
        Z4.b bVar = fVar.f12832C;
        if (bVar != null) {
            throw bVar;
        }
    }

    public void c0(boolean z4) {
        Q0 q1 = (Q0) this.f12673a;
        q1.c0.o(q1.f6937H, z4);
    }

    @Override // p098n4.C
    public void d(p134s4.h hVar) {
        s sVar = ((C0940m) this.f12673a).f15455c;
        ArrayList arrayListL = hVar.f16178a.l();
        HashMap mapB = hVar.f16179b.b();
        sVar.getClass();
        p083l4.r rVar = new p083l4.r(arrayListL, mapB);
        t tVar = sVar.f15013y;
        if (tVar.r0()) {
            tVar.W(null, "unlistening on " + rVar, new Object[0]);
        }
        p083l4.p pVarG = sVar.g(rVar);
        if (pVarG != null && sVar.b()) {
            HashMap map = new HashMap();
            p083l4.r rVar2 = pVarG.f14973b;
            map.put("p", D.M(rVar2.f14980a));
            Long l7 = pVarG.f14975d;
            if (l7 != null) {
                map.put("q", rVar2.f14981b);
                map.put("t", l7);
            }
            sVar.p("n", false, map, null);
        }
        sVar.c();
    }

    public void d0(b0 b0Var, byte[] bArr) {
        p036e6.b.c();
        try {
            String str = "/" + ((String) ((X5.j) this.f12673a).j.f3291b);
            if (bArr != null) {
                ((X5.j) this.f12673a).f7558q = true;
                str = str + "?" + F3.e.f2737c.c(bArr);
            }
            synchronized (((X5.j) this.f12673a).f7555n.f7547w) {
                X5.i.j(((X5.j) this.f12673a).f7555n, b0Var, str);
            }
            p036e6.b.f12742a.getClass();
        } catch (Throwable th) {
            try {
                p036e6.b.f12742a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p098n4.C
    public void f(p134s4.h hVar, p098n4.E e7, M m7, M m8) {
        s sVar = ((C0940m) this.f12673a).f15455c;
        ArrayList arrayListL = hVar.f16178a.l();
        HashMap mapB = hVar.f16179b.b();
        Long lValueOf = e7 != null ? Long.valueOf(e7.f15374a) : null;
        com.google.android.gms.common.internal.w wVar = new com.google.android.gms.common.internal.w(12, (Object) this, (Object) m8, false);
        sVar.getClass();
        p083l4.r rVar = new p083l4.r(arrayListL, mapB);
        t tVar = sVar.f15013y;
        if (tVar.r0()) {
            tVar.W(null, "Listening on " + rVar, new Object[0]);
        }
        HashMap map = sVar.f15004p;
        D.v("listen() called twice for same QuerySpec.", !map.containsKey(rVar), new Object[0]);
        if (tVar.r0()) {
            tVar.W(null, "Adding listen query: " + rVar, new Object[0]);
        }
        p083l4.p pVar = new p083l4.p(wVar, rVar, lValueOf, m7);
        map.put(rVar, pVar);
        if (sVar.b()) {
            sVar.m(pVar);
        }
        sVar.c();
    }

    public synchronized void f0() {
        a aVar = (a) this.f12673a;
        ReentrantLock reentrantLock = aVar.f12653a;
        reentrantLock.lock();
        try {
            aVar.f12654b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // P.InterfaceC0349e
    public void h(Bundle bundle) {
        ((ContentInfo.Builder) this.f12673a).setExtras(bundle);
    }

    @Override // p018c2.Y
    public boolean isLoading() {
        for (Y y4 : (Y[]) this.f12673a) {
            if (y4.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // C0.L
    public int j(View view) {
        v vVar = (v) view.getLayoutParams();
        ((u) this.f12673a).getClass();
        return (view.getTop() - ((v) view.getLayoutParams()).f1321a.top) - ((ViewGroup.MarginLayoutParams) vVar).topMargin;
    }

    @Override // p018c2.Y
    public long k() {
        long jMin = Long.MAX_VALUE;
        for (Y y4 : (Y[]) this.f12673a) {
            long jK = y4.k();
            if (jK != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jK);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p141t4.b
    public boolean l() {
        return false;
    }

    @Override // G4.InterfaceC0273f
    public int m(I i7) {
        return 1;
    }

    @Override // p086m.w
    public boolean n(p086m.k kVar) {
        Window.Callback callback = ((p058i.v) this.f12673a).f13756C.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // A5.q
    public void onMethodCall(o oVar, A5.r rVar) {
        com.google.android.gms.common.internal.w wVar = (com.google.android.gms.common.internal.w) this.f12673a;
        if (((io.flutter.plugin.platform.p) wVar.f11336c) == null) {
        }
        String str = oVar.f676a;
        str.getClass();
        Object obj = oVar.f677b;
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
                break;
            case "clearFocus":
                try {
                    ((io.flutter.plugin.platform.p) wVar.f11336c).c(((Integer) obj).intValue());
                    ((A5.p) rVar).success(null);
                    break;
                } catch (IllegalStateException e8) {
                    ((A5.p) rVar).error("error", Log.getStackTraceString(e8), null);
                    return;
                }
                break;
            case "touch":
                List list = (List) obj;
                try {
                    ((io.flutter.plugin.platform.p) wVar.f11336c).j(new p174z5.i(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                    ((A5.p) rVar).success(null);
                    break;
                } catch (IllegalStateException e9) {
                    ((A5.p) rVar).error("error", Log.getStackTraceString(e9), null);
                    return;
                }
                break;
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
                break;
            case "isSurfaceControlEnabled":
                FlutterJNI flutterJNI = ((io.flutter.plugin.platform.r) ((io.flutter.plugin.platform.p) wVar.f11336c).f14175b).f14180e;
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
                break;
            default:
                ((A5.p) rVar).notImplemented();
                break;
        }
    }

    @Override // C0.L
    public int r() {
        return ((u) this.f12673a).u();
    }

    @Override // G4.InterfaceC0273f
    public void s(m mVar) {
        ((C0286t) this.f12673a).a(mVar);
    }

    @Override // P.InterfaceC0349e
    public void t(Uri uri) {
        ((ContentInfo.Builder) this.f12673a).setLinkUri(uri);
    }

    @Override // G4.InterfaceC0273f
    public Collection x() {
        return Collections.emptyList();
    }

    @Override // p018c2.Y
    public boolean y(long j) {
        boolean zY;
        boolean z4 = false;
        do {
            long jK = k();
            if (jK == Long.MIN_VALUE) {
                break;
            }
            zY = false;
            for (Y y4 : (Y[]) this.f12673a) {
                long jK2 = y4.k();
                boolean z7 = jK2 != Long.MIN_VALUE && jK2 <= j;
                if (jK2 == jK || z7) {
                    zY |= y4.y(j);
                }
            }
            z4 |= zY;
        } while (zY);
        return z4;
    }

    @Override // G4.InterfaceC0273f
    public String z() {
        return null;
    }

    public h(int i7) {
        switch (i7) {
            case 16:
                this.f12673a = new p054h2.d(5, 1.0f, false);
                break;
            default:
                this.f12673a = new C0286t(0);
                break;
        }
    }

    @Override // p086m.w
    public void a(p086m.k kVar, boolean z4) {
        ((p058i.v) this.f12673a).s(kVar);
    }

    public h(ClipData clipData, int i7) {
        this.f12673a = AbstractC0348d.l(clipData, i7);
    }

    @Override // G4.InterfaceC0273f
    public void G() {
    }

    @Override // p141t4.b
    public h i() {
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
    public void e(p075k4.c cVar) {
    }

    @Override // G4.InterfaceC0273f
    public void g(H4.a aVar) {
    }

    @Override // G4.InterfaceC0273f
    public void u(String str, H4.b bVar) {
    }
}
