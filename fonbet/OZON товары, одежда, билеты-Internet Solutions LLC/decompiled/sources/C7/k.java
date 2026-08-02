package C7;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
final class k implements b {

    /* renamed from: a, reason: collision with root package name */
    private final u f4438a;

    /* renamed from: b, reason: collision with root package name */
    private final h f4439b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4440c;

    k(u uVar, h hVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.f4438a = uVar;
        this.f4439b = hVar;
        this.f4440c = context;
    }

    @Override // C7.b
    public final synchronized void a(E7.b bVar) {
        this.f4439b.c(bVar);
    }

    @Override // C7.b
    public final synchronized void b(E7.b bVar) {
        this.f4439b.b(bVar);
    }

    @Override // C7.b
    public final Task<C2731a> c() {
        return this.f4438a.d(this.f4440c.getPackageName());
    }

    @Override // C7.b
    public final Task<Void> d() {
        return this.f4438a.c(this.f4440c.getPackageName());
    }

    @Override // C7.b
    public final boolean e(C2731a c2731a, Activity activity) throws IntentSender.SendIntentException {
        d c11 = d.c();
        if (activity == null) {
            return false;
        }
        j jVar = new j(activity);
        if (c2731a == null || !c2731a.b(c11) || c2731a.g()) {
            return false;
        }
        c2731a.f();
        jVar.a(c2731a.d(c11).getIntentSender());
        return true;
    }
}
