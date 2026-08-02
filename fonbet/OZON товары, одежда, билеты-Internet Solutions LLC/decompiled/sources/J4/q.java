package J4;

import J4.p;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import o.C8620b;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f13915a;

    q(p pVar) {
        this.f13915a = pVar;
    }

    private final Tc.j a() {
        Tc.j builder = new Tc.j();
        p pVar = this.f13915a;
        Cursor query$default = s.query$default(pVar.d(), new O4.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
        while (query$default.moveToNext()) {
            try {
                builder.add(Integer.valueOf(query$default.getInt(0)));
            } finally {
            }
        }
        Unit unit = Unit.f71690a;
        query$default.close();
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.j b11 = builder.b();
        if (b11.isEmpty()) {
            return b11;
        }
        if (pVar.c() == null) {
            throw new IllegalStateException("Required value was null.");
        }
        O4.f c11 = pVar.c();
        if (c11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        c11.C();
        return b11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set<Integer> set;
        Lock closeLock$room_runtime_release = this.f13915a.d().getCloseLock$room_runtime_release();
        closeLock$room_runtime_release.lock();
        try {
            try {
            } catch (SQLiteException e11) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                set = M.f71699a;
            } catch (IllegalStateException e12) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e12);
                set = M.f71699a;
            }
            if (this.f13915a.b()) {
                if (this.f13915a.f().compareAndSet(true, false)) {
                    if (this.f13915a.d().inTransaction()) {
                        return;
                    }
                    O4.b writableDatabase = this.f13915a.d().getOpenHelper().getWritableDatabase();
                    writableDatabase.J();
                    try {
                        set = a();
                        writableDatabase.f1();
                        if (set.isEmpty()) {
                            return;
                        }
                        C8620b<p.c, p.d> e13 = this.f13915a.e();
                        p pVar = this.f13915a;
                        synchronized (e13) {
                            try {
                                Iterator<Map.Entry<p.c, p.d>> it = pVar.e().iterator();
                                while (it.hasNext()) {
                                    it.next().getValue().b(set);
                                }
                                Unit unit = Unit.f71690a;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } finally {
                        writableDatabase.i1();
                    }
                }
            }
        } finally {
            closeLock$room_runtime_release.unlock();
            this.f13915a.getClass();
        }
    }
}
