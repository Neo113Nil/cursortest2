package androidx.work.impl;

import B90.C2616s;
import J4.s;
import J4.v;
import L4.e;
import O4.c;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g5.C6631d;
import g5.C6635h;
import g5.C6642o;
import g5.C6646t;
import g5.InterfaceC6629b;
import g5.InterfaceC6633f;
import g5.InterfaceC6636i;
import g5.InterfaceC6638k;
import g5.InterfaceC6648v;
import g5.Q;
import g5.U;
import g5.X;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: a, reason: collision with root package name */
    private volatile Q f45352a;

    /* renamed from: b, reason: collision with root package name */
    private volatile C6631d f45353b;

    /* renamed from: c, reason: collision with root package name */
    private volatile X f45354c;

    /* renamed from: d, reason: collision with root package name */
    private volatile C6642o f45355d;

    /* renamed from: e, reason: collision with root package name */
    private volatile C6646t f45356e;

    /* renamed from: f, reason: collision with root package name */
    private volatile g5.z f45357f;

    /* renamed from: g, reason: collision with root package name */
    private volatile C6635h f45358g;

    final class a extends v.a {
        a() {
            super(16);
        }

        @Override // J4.v.a
        public final void createAllTables(O4.b bVar) {
            Sh.b.d(bVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            Sh.b.d(bVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)", "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            Sh.b.d(bVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.O0("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.O0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.O0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // J4.v.a
        public final void dropAllTables(O4.b db2) {
            Sh.b.d(db2, "DROP TABLE IF EXISTS `Dependency`", "DROP TABLE IF EXISTS `WorkSpec`", "DROP TABLE IF EXISTS `WorkTag`", "DROP TABLE IF EXISTS `SystemIdInfo`");
            db2.O0("DROP TABLE IF EXISTS `WorkName`");
            db2.O0("DROP TABLE IF EXISTS `WorkProgress`");
            db2.O0("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            if (((J4.s) workDatabase_Impl).mCallbacks != null) {
                int size = ((J4.s) workDatabase_Impl).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((s.b) ((J4.s) workDatabase_Impl).mCallbacks.get(i11)).getClass();
                    Intrinsics.checkNotNullParameter(db2, "db");
                }
            }
        }

        @Override // J4.v.a
        public final void onCreate(O4.b bVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            if (((J4.s) workDatabase_Impl).mCallbacks != null) {
                int size = ((J4.s) workDatabase_Impl).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((s.b) ((J4.s) workDatabase_Impl).mCallbacks.get(i11)).a(bVar);
                }
            }
        }

        @Override // J4.v.a
        public final void onOpen(O4.b bVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            ((J4.s) workDatabase_Impl).mDatabase = bVar;
            bVar.O0("PRAGMA foreign_keys = ON");
            workDatabase_Impl.internalInitInvalidationTracker(bVar);
            if (((J4.s) workDatabase_Impl).mCallbacks != null) {
                int size = ((J4.s) workDatabase_Impl).mCallbacks.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((s.b) ((J4.s) workDatabase_Impl).mCallbacks.get(i11)).b(bVar);
                }
            }
        }

        @Override // J4.v.a
        public final void onPostMigrate(O4.b bVar) {
        }

        @Override // J4.v.a
        public final void onPreMigrate(O4.b bVar) {
            L4.b.a(bVar);
        }

        @Override // J4.v.a
        public final v.b onValidateSchema(O4.b bVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new e.a("work_spec_id", "TEXT", 1, 1, true, null));
            HashSet b11 = H3.c.b(hashMap, "prerequisite_id", new e.a("prerequisite_id", "TEXT", 2, 1, true, null), 2);
            b11.add(new e.b("WorkSpec", Arrays.asList("work_spec_id"), "CASCADE", "CASCADE", Arrays.asList("id")));
            b11.add(new e.b("WorkSpec", Arrays.asList("prerequisite_id"), "CASCADE", "CASCADE", Arrays.asList("id")));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new e.d(Arrays.asList("work_spec_id"), false, "index_Dependency_work_spec_id", Arrays.asList("ASC")));
            hashSet.add(new e.d(Arrays.asList("prerequisite_id"), false, "index_Dependency_prerequisite_id", Arrays.asList("ASC")));
            L4.e eVar = new L4.e("Dependency", hashMap, b11, hashSet);
            L4.e a11 = L4.e.a(bVar, "Dependency");
            if (!eVar.equals(a11)) {
                return new v.b(false, C2616s.c("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", eVar, "\n Found:\n", a11));
            }
            HashMap hashMap2 = new HashMap(27);
            hashMap2.put("id", new e.a("id", "TEXT", 1, 1, true, null));
            hashMap2.put("state", new e.a("state", "INTEGER", 0, 1, true, null));
            hashMap2.put("worker_class_name", new e.a("worker_class_name", "TEXT", 0, 1, true, null));
            hashMap2.put("input_merger_class_name", new e.a("input_merger_class_name", "TEXT", 0, 1, false, null));
            hashMap2.put("input", new e.a("input", "BLOB", 0, 1, true, null));
            hashMap2.put("output", new e.a("output", "BLOB", 0, 1, true, null));
            hashMap2.put("initial_delay", new e.a("initial_delay", "INTEGER", 0, 1, true, null));
            hashMap2.put("interval_duration", new e.a("interval_duration", "INTEGER", 0, 1, true, null));
            hashMap2.put("flex_duration", new e.a("flex_duration", "INTEGER", 0, 1, true, null));
            hashMap2.put("run_attempt_count", new e.a("run_attempt_count", "INTEGER", 0, 1, true, null));
            hashMap2.put("backoff_policy", new e.a("backoff_policy", "INTEGER", 0, 1, true, null));
            hashMap2.put("backoff_delay_duration", new e.a("backoff_delay_duration", "INTEGER", 0, 1, true, null));
            hashMap2.put("last_enqueue_time", new e.a("last_enqueue_time", "INTEGER", 0, 1, true, null));
            hashMap2.put("minimum_retention_duration", new e.a("minimum_retention_duration", "INTEGER", 0, 1, true, null));
            hashMap2.put("schedule_requested_at", new e.a("schedule_requested_at", "INTEGER", 0, 1, true, null));
            hashMap2.put("run_in_foreground", new e.a("run_in_foreground", "INTEGER", 0, 1, true, null));
            hashMap2.put("out_of_quota_policy", new e.a("out_of_quota_policy", "INTEGER", 0, 1, true, null));
            hashMap2.put("period_count", new e.a("period_count", "INTEGER", 0, 1, true, "0"));
            hashMap2.put("generation", new e.a("generation", "INTEGER", 0, 1, true, "0"));
            hashMap2.put("required_network_type", new e.a("required_network_type", "INTEGER", 0, 1, true, null));
            hashMap2.put("requires_charging", new e.a("requires_charging", "INTEGER", 0, 1, true, null));
            hashMap2.put("requires_device_idle", new e.a("requires_device_idle", "INTEGER", 0, 1, true, null));
            hashMap2.put("requires_battery_not_low", new e.a("requires_battery_not_low", "INTEGER", 0, 1, true, null));
            hashMap2.put("requires_storage_not_low", new e.a("requires_storage_not_low", "INTEGER", 0, 1, true, null));
            hashMap2.put("trigger_content_update_delay", new e.a("trigger_content_update_delay", "INTEGER", 0, 1, true, null));
            hashMap2.put("trigger_max_content_delay", new e.a("trigger_max_content_delay", "INTEGER", 0, 1, true, null));
            HashSet b12 = H3.c.b(hashMap2, "content_uri_triggers", new e.a("content_uri_triggers", "BLOB", 0, 1, true, null), 0);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new e.d(Arrays.asList("schedule_requested_at"), false, "index_WorkSpec_schedule_requested_at", Arrays.asList("ASC")));
            hashSet2.add(new e.d(Arrays.asList("last_enqueue_time"), false, "index_WorkSpec_last_enqueue_time", Arrays.asList("ASC")));
            L4.e eVar2 = new L4.e("WorkSpec", hashMap2, b12, hashSet2);
            L4.e a12 = L4.e.a(bVar, "WorkSpec");
            if (!eVar2.equals(a12)) {
                return new v.b(false, C2616s.c("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", eVar2, "\n Found:\n", a12));
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new e.a("tag", "TEXT", 1, 1, true, null));
            HashSet b13 = H3.c.b(hashMap3, "work_spec_id", new e.a("work_spec_id", "TEXT", 2, 1, true, null), 1);
            b13.add(new e.b("WorkSpec", Arrays.asList("work_spec_id"), "CASCADE", "CASCADE", Arrays.asList("id")));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new e.d(Arrays.asList("work_spec_id"), false, "index_WorkTag_work_spec_id", Arrays.asList("ASC")));
            L4.e eVar3 = new L4.e("WorkTag", hashMap3, b13, hashSet3);
            L4.e a13 = L4.e.a(bVar, "WorkTag");
            if (!eVar3.equals(a13)) {
                return new v.b(false, C2616s.c("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", eVar3, "\n Found:\n", a13));
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new e.a("work_spec_id", "TEXT", 1, 1, true, null));
            hashMap4.put("generation", new e.a("generation", "INTEGER", 2, 1, true, "0"));
            HashSet b14 = H3.c.b(hashMap4, "system_id", new e.a("system_id", "INTEGER", 0, 1, true, null), 1);
            b14.add(new e.b("WorkSpec", Arrays.asList("work_spec_id"), "CASCADE", "CASCADE", Arrays.asList("id")));
            L4.e eVar4 = new L4.e("SystemIdInfo", hashMap4, b14, new HashSet(0));
            L4.e a14 = L4.e.a(bVar, "SystemIdInfo");
            if (!eVar4.equals(a14)) {
                return new v.b(false, C2616s.c("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", eVar4, "\n Found:\n", a14));
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new e.a(AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", 1, 1, true, null));
            HashSet b15 = H3.c.b(hashMap5, "work_spec_id", new e.a("work_spec_id", "TEXT", 2, 1, true, null), 1);
            b15.add(new e.b("WorkSpec", Arrays.asList("work_spec_id"), "CASCADE", "CASCADE", Arrays.asList("id")));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new e.d(Arrays.asList("work_spec_id"), false, "index_WorkName_work_spec_id", Arrays.asList("ASC")));
            L4.e eVar5 = new L4.e("WorkName", hashMap5, b15, hashSet4);
            L4.e a15 = L4.e.a(bVar, "WorkName");
            if (!eVar5.equals(a15)) {
                return new v.b(false, C2616s.c("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", eVar5, "\n Found:\n", a15));
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new e.a("work_spec_id", "TEXT", 1, 1, true, null));
            HashSet b16 = H3.c.b(hashMap6, "progress", new e.a("progress", "BLOB", 0, 1, true, null), 1);
            b16.add(new e.b("WorkSpec", Arrays.asList("work_spec_id"), "CASCADE", "CASCADE", Arrays.asList("id")));
            L4.e eVar6 = new L4.e("WorkProgress", hashMap6, b16, new HashSet(0));
            L4.e a16 = L4.e.a(bVar, "WorkProgress");
            if (!eVar6.equals(a16)) {
                return new v.b(false, C2616s.c("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", eVar6, "\n Found:\n", a16));
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new e.a("key", "TEXT", 1, 1, true, null));
            L4.e eVar7 = new L4.e("Preference", hashMap7, H3.c.b(hashMap7, "long_value", new e.a("long_value", "INTEGER", 0, 1, false, null), 0), new HashSet(0));
            L4.e a17 = L4.e.a(bVar, "Preference");
            return !eVar7.equals(a17) ? new v.b(false, C2616s.c("Preference(androidx.work.impl.model.Preference).\n Expected:\n", eVar7, "\n Found:\n", a17)) : new v.b(true, null);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC6629b a() {
        C6631d c6631d;
        if (this.f45353b != null) {
            return this.f45353b;
        }
        synchronized (this) {
            try {
                if (this.f45353b == null) {
                    this.f45353b = new C6631d(this);
                }
                c6631d = this.f45353b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6631d;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC6633f b() {
        C6635h c6635h;
        if (this.f45358g != null) {
            return this.f45358g;
        }
        synchronized (this) {
            try {
                if (this.f45358g == null) {
                    this.f45358g = new C6635h(this);
                }
                c6635h = this.f45358g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6635h;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC6638k c() {
        C6642o c6642o;
        if (this.f45355d != null) {
            return this.f45355d;
        }
        synchronized (this) {
            try {
                if (this.f45355d == null) {
                    this.f45355d = new C6642o(this);
                }
                c6642o = this.f45355d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6642o;
    }

    @Override // J4.s
    protected final J4.p createInvalidationTracker() {
        return new J4.p(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // J4.s
    protected final O4.c createOpenHelper(J4.h hVar) {
        J4.v vVar = new J4.v(hVar, new a(), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e");
        Context context = hVar.f13876a;
        Intrinsics.checkNotNullParameter(context, "context");
        c.b.a aVar = new c.b.a(context);
        aVar.d(hVar.f13877b);
        aVar.c(vVar);
        return hVar.f13878c.a(aVar.b());
    }

    @Override // androidx.work.impl.WorkDatabase
    public final g5.r d() {
        C6646t c6646t;
        if (this.f45356e != null) {
            return this.f45356e;
        }
        synchronized (this) {
            try {
                if (this.f45356e == null) {
                    this.f45356e = new C6646t(this);
                }
                c6646t = this.f45356e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6646t;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final InterfaceC6648v e() {
        g5.z zVar;
        if (this.f45357f != null) {
            return this.f45357f;
        }
        synchronized (this) {
            try {
                if (this.f45357f == null) {
                    this.f45357f = new g5.z(this);
                }
                zVar = this.f45357f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final g5.C f() {
        Q q11;
        if (this.f45352a != null) {
            return this.f45352a;
        }
        synchronized (this) {
            try {
                if (this.f45352a == null) {
                    this.f45352a = new Q(this);
                }
                q11 = this.f45352a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return q11;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final U g() {
        X x11;
        if (this.f45354c != null) {
            return this.f45354c;
        }
        synchronized (this) {
            try {
                if (this.f45354c == null) {
                    this.f45354c = new X(this);
                }
                x11 = this.f45354c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return x11;
    }

    @Override // J4.s
    public final List<K4.a> getAutoMigrations(@NonNull Map<Class<Object>, Object> map) {
        return Arrays.asList(new A(13, 14), new B());
    }

    @Override // J4.s
    public final Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // J4.s
    protected final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(g5.C.class, list);
        hashMap.put(InterfaceC6629b.class, list);
        hashMap.put(U.class, list);
        hashMap.put(InterfaceC6638k.class, list);
        hashMap.put(g5.r.class, list);
        hashMap.put(InterfaceC6648v.class, list);
        hashMap.put(InterfaceC6633f.class, list);
        hashMap.put(InterfaceC6636i.class, list);
        return hashMap;
    }
}
