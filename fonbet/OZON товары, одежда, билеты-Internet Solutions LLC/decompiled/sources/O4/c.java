package O4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface c extends Closeable {

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f19936a;

        public a(int i11) {
            this.f19936a = i11;
        }

        private static void a(String str) {
            if (h.D(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                boolean z12 = Intrinsics.i(str.charAt(!z11 ? i11 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i11++;
                } else {
                    z11 = true;
                }
            }
            if (str.subSequence(i11, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                File file = new File(str);
                Intrinsics.checkNotNullParameter(file, "file");
                SQLiteDatabase.deleteDatabase(file);
            } catch (Exception e11) {
                Log.w("SupportSQLite", "delete failed: ", e11);
            }
        }

        public static void c(@NotNull P4.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String d11 = db2.d();
                if (d11 != null) {
                    a(d11);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = db2.c();
                } catch (SQLiteException unused) {
                }
                try {
                    db2.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            } finally {
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                        a((String) obj);
                    }
                } else {
                    String d12 = db2.d();
                    if (d12 != null) {
                        a(d12);
                    }
                }
            }
        }

        public void b(@NotNull P4.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public abstract void d(@NotNull P4.c cVar);

        public abstract void e(@NotNull P4.c cVar, int i11, int i12);

        public void f(@NotNull P4.c db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public abstract void g(@NotNull P4.c cVar, int i11, int i12);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f19937a;

        /* renamed from: b, reason: collision with root package name */
        public final String f19938b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final a f19939c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f19940d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f19941e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final Context f19942a;

            /* renamed from: b, reason: collision with root package name */
            private String f19943b;

            /* renamed from: c, reason: collision with root package name */
            private a f19944c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f19945d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f19946e;

            public a(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.f19942a = context;
            }

            @NotNull
            public final void a() {
                this.f19946e = true;
            }

            @NotNull
            public final b b() {
                String str;
                a aVar = this.f19944c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f19945d && ((str = this.f19943b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f19942a, this.f19943b, aVar, this.f19945d, this.f19946e);
            }

            @NotNull
            public final void c(@NotNull a callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.f19944c = callback;
            }

            @NotNull
            public final void d(String str) {
                this.f19943b = str;
            }

            @NotNull
            public final void e() {
                this.f19945d = true;
            }
        }

        public b(@NotNull Context context, String str, @NotNull a callback, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f19937a = context;
            this.f19938b = str;
            this.f19939c = callback;
            this.f19940d = z11;
            this.f19941e = z12;
        }
    }

    /* renamed from: O4.c$c, reason: collision with other inner class name */
    public interface InterfaceC0397c {
        @NotNull
        c a(@NotNull b bVar);
    }

    @NotNull
    O4.b getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z11);
}
