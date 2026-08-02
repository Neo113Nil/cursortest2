package J4;

import O4.c;
import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class v extends c.a {

    /* renamed from: b, reason: collision with root package name */
    private h f13947b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f13948c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f13949d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f13950e;

    public static abstract class a {
        public final int version;

        public a(int i11) {
            this.version = i11;
        }

        public abstract void createAllTables(@NotNull O4.b bVar);

        public abstract void dropAllTables(@NotNull O4.b bVar);

        public abstract void onCreate(@NotNull O4.b bVar);

        public abstract void onOpen(@NotNull O4.b bVar);

        public abstract void onPostMigrate(@NotNull O4.b bVar);

        public abstract void onPreMigrate(@NotNull O4.b bVar);

        @NotNull
        public abstract b onValidateSchema(@NotNull O4.b bVar);
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13951a;

        /* renamed from: b, reason: collision with root package name */
        public final String f13952b;

        public b(boolean z11, String str) {
            this.f13951a = z11;
            this.f13952b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@NotNull h configuration, @NotNull a delegate, @NotNull String identityHash, @NotNull String legacyHash) {
        super(delegate.version);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.f13947b = configuration;
        this.f13948c = delegate;
        this.f13949d = identityHash;
        this.f13950e = legacyHash;
    }

    private final void h(P4.c cVar) {
        cVar.O0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String hash = this.f13949d;
        Intrinsics.checkNotNullParameter(hash, "hash");
        cVar.O0("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')");
    }

    @Override // O4.c.a
    public final void b(@NotNull P4.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.b(db2);
    }

    @Override // O4.c.a
    public final void d(@NotNull P4.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(db2, "db");
        Cursor N12 = db2.N1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z11 = false;
            if (N12.moveToFirst()) {
                if (N12.getInt(0) == 0) {
                    z11 = true;
                }
            }
            N12.close();
            a aVar = this.f13948c;
            aVar.createAllTables(db2);
            if (!z11) {
                b onValidateSchema = aVar.onValidateSchema(db2);
                if (!onValidateSchema.f13951a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f13952b);
                }
            }
            h(db2);
            aVar.onCreate(db2);
        } finally {
        }
    }

    @Override // O4.c.a
    public final void e(@NotNull P4.c db2, int i11, int i12) {
        Intrinsics.checkNotNullParameter(db2, "db");
        g(db2, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    @Override // O4.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(@NotNull P4.c db2) {
        boolean z11;
        Intrinsics.checkNotNullParameter(db2, "db");
        super.f(db2);
        Intrinsics.checkNotNullParameter(db2, "db");
        Cursor N12 = db2.N1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (N12.moveToFirst()) {
                if (N12.getInt(0) != 0) {
                    z11 = true;
                    N12.close();
                    a aVar = this.f13948c;
                    if (z11) {
                        b onValidateSchema = aVar.onValidateSchema(db2);
                        if (!onValidateSchema.f13951a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f13952b);
                        }
                        aVar.onPostMigrate(db2);
                        h(db2);
                    } else {
                        Cursor G11 = db2.G(new O4.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = G11.moveToFirst() ? G11.getString(0) : null;
                            G11.close();
                            String str = this.f13949d;
                            if (!str.equals(string) && !this.f13950e.equals(string)) {
                                throw new IllegalStateException(Sh.b.c("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", str, ", found: ", string));
                            }
                        } finally {
                        }
                    }
                    aVar.onOpen(db2);
                    this.f13947b = null;
                }
            }
            z11 = false;
            N12.close();
            a aVar2 = this.f13948c;
            if (z11) {
            }
            aVar2.onOpen(db2);
            this.f13947b = null;
        } finally {
        }
    }

    @Override // O4.c.a
    public final void g(@NotNull P4.c db2, int i11, int i12) {
        List<K4.a> c11;
        Intrinsics.checkNotNullParameter(db2, "db");
        h hVar = this.f13947b;
        a aVar = this.f13948c;
        if (hVar == null || (c11 = hVar.f13879d.c(i11, i12)) == null) {
            h hVar2 = this.f13947b;
            if (hVar2 == null || hVar2.a(i11, i12)) {
                throw new IllegalStateException(Cm.e.c("A migration from ", i11, " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.", i12));
            }
            aVar.dropAllTables(db2);
            aVar.createAllTables(db2);
            return;
        }
        aVar.onPreMigrate(db2);
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            ((K4.a) it.next()).migrate(db2);
        }
        b onValidateSchema = aVar.onValidateSchema(db2);
        if (onValidateSchema.f13951a) {
            aVar.onPostMigrate(db2);
            h(db2);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f13952b);
        }
    }
}
