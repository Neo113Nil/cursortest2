package A5;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f667a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.t f668b;

    public h(android.support.v4.media.session.t tVar) {
        this.f668b = tVar;
    }

    public final void a() {
        if (this.f667a.getAndSet(true)) {
            return;
        }
        android.support.v4.media.session.t tVar = this.f668b;
        if (((AtomicReference) tVar.f8077c).get() != this) {
            return;
        }
        j jVar = (j) tVar.f8078d;
        jVar.f669a.j(jVar.f670b, null);
    }

    public final void b(String str, String str2, Map map) {
        if (this.f667a.get()) {
            return;
        }
        android.support.v4.media.session.t tVar = this.f668b;
        if (((AtomicReference) tVar.f8077c).get() != this) {
            return;
        }
        j jVar = (j) tVar.f8078d;
        jVar.f669a.j(jVar.f670b, jVar.f671c.e(str, str2, map));
    }

    public final void c(Object obj) {
        if (this.f667a.get()) {
            return;
        }
        android.support.v4.media.session.t tVar = this.f668b;
        if (((AtomicReference) tVar.f8077c).get() != this) {
            return;
        }
        j jVar = (j) tVar.f8078d;
        jVar.f669a.j(jVar.f670b, jVar.f671c.c(obj));
    }
}
