package D0;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f1671a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile K0.f f1673c;

    public m(j jVar) {
        this.f1672b = jVar;
    }

    public final K0.f a() {
        this.f1672b.a();
        if (!this.f1671a.compareAndSet(false, true)) {
            String strB = b();
            j jVar = this.f1672b;
            jVar.a();
            jVar.b();
            return new K0.f(((SQLiteDatabase) jVar.f1655c.l().f3868b).compileStatement(strB));
        }
        if (this.f1673c == null) {
            String strB2 = b();
            j jVar2 = this.f1672b;
            jVar2.a();
            jVar2.b();
            this.f1673c = new K0.f(((SQLiteDatabase) jVar2.f1655c.l().f3868b).compileStatement(strB2));
        }
        return this.f1673c;
    }

    public abstract String b();

    public final void c(K0.f fVar) {
        if (fVar == this.f1673c) {
            this.f1671a.set(false);
        }
    }
}
