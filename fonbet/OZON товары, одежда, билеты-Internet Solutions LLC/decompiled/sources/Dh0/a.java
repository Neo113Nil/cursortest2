package Dh0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C0142a f6721a = new C0142a(1, 2);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final b f6722b = new b(2, 3);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final c f6723c = new c(3, 4);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final d f6724d = new d(4, 5);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final e f6725e = new e(5, 6);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final f f6726f = new f(6, 7);

    /* renamed from: Dh0.a$a, reason: collision with other inner class name */
    public static final class C0142a extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.O0("ALTER TABLE push_status ADD COLUMN `createTimestamp` INTEGER DEFAULT NULL");
        }
    }

    public static final class b extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.O0("ALTER TABLE push_status ADD COLUMN `sendingAttemptNumber` INTEGER DEFAULT NULL");
        }
    }

    public static final class c extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.O0("CREATE TABLE IF NOT EXISTS `device_stats` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `net` TEXT NOT NULL, `cellular_operator` TEXT NOT NULL, `net_provider` TEXT NOT NULL, `battery_charge` INTEGER NOT NULL, `energy_saving_mode` INTEGER NOT NULL, `energy_saving_mode_android` TEXT NOT NULL, `vpn_enabled` INTEGER, `proxy_enabled` INTEGER)");
            db2.O0("ALTER TABLE push_status ADD COLUMN `device_stats_id` INTEGER DEFAULT NULL REFERENCES `device_stats`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE");
        }
    }

    public static final class d extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.O0("ALTER TABLE push_status ADD COLUMN `pushServiceStartupTime` INTEGER DEFAULT NULL");
        }
    }

    public static final class e extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.O0("ALTER TABLE push_status ADD COLUMN `delivery_status` TEXT DEFAULT NULL");
            db2.O0("ALTER TABLE push_status ADD COLUMN `is_teens_mode` INTEGER DEFAULT NULL");
        }
    }

    public static final class f extends K4.a {
        @Override // K4.a
        public final void migrate(O4.b db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            db2.O0("ALTER TABLE push_status ADD COLUMN `priority` TEXT DEFAULT NULL");
            db2.O0("ALTER TABLE push_status ADD COLUMN `original_priority` TEXT DEFAULT NULL");
            db2.O0("ALTER TABLE push_status ADD COLUMN `first_message_id` TEXT DEFAULT NULL");
        }
    }

    @NotNull
    public static final C0142a a() {
        return f6721a;
    }

    @NotNull
    public static final b b() {
        return f6722b;
    }

    @NotNull
    public static final c c() {
        return f6723c;
    }

    @NotNull
    public static final d d() {
        return f6724d;
    }

    @NotNull
    public static final e e() {
        return f6725e;
    }

    @NotNull
    public static final f f() {
        return f6726f;
    }
}
