package R1;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5169a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final h f5170b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Y1.f f5171c;

    public l(h hVar) {
        this.f5170b = hVar;
    }

    public final Y1.f a() {
        this.f5170b.a();
        if (!this.f5169a.compareAndSet(false, true)) {
            String b3 = b();
            h hVar = this.f5170b;
            hVar.a();
            hVar.b();
            return new Y1.f(((SQLiteDatabase) hVar.f5153c.z().f6123l).compileStatement(b3));
        }
        if (this.f5171c == null) {
            String b5 = b();
            h hVar2 = this.f5170b;
            hVar2.a();
            hVar2.b();
            this.f5171c = new Y1.f(((SQLiteDatabase) hVar2.f5153c.z().f6123l).compileStatement(b5));
        }
        return this.f5171c;
    }

    public abstract String b();

    public final void c(Y1.f fVar) {
        if (fVar == this.f5171c) {
            this.f5169a.set(false);
        }
    }
}
