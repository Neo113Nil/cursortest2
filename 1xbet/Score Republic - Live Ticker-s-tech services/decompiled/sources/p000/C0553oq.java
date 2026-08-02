package p000;

import android.content.Context;
import android.os.UserManager;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: oq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0553oq implements xa0, ya0 {

    /* JADX INFO: renamed from: a */
    public final dh0 f5831a;

    /* JADX INFO: renamed from: b */
    public final Context f5832b;

    /* JADX INFO: renamed from: c */
    public final my0 f5833c;

    /* JADX INFO: renamed from: d */
    public final Set f5834d;

    /* JADX INFO: renamed from: e */
    public final Executor f5835e;

    public C0553oq(Context context, String str, Set set, my0 my0Var, Executor executor) {
        this.f5831a = new dh0(new C0510nk(1, context, str));
        this.f5834d = set;
        this.f5835e = executor;
        this.f5833c = my0Var;
        this.f5832b = context;
    }

    /* JADX INFO: renamed from: a */
    public final v92 m3728a() {
        if (!((UserManager) this.f5832b.getSystemService(UserManager.class)).isUserUnlocked()) {
            return hn0.m2316j("");
        }
        return hn0.m2312c(this.f5835e, new CallableC0516nq(this, 0));
    }

    /* JADX INFO: renamed from: b */
    public final void m3729b() {
        if (this.f5834d.size() <= 0) {
            hn0.m2316j(null);
        } else if (!((UserManager) this.f5832b.getSystemService(UserManager.class)).isUserUnlocked()) {
            hn0.m2316j(null);
        } else {
            hn0.m2312c(this.f5835e, new CallableC0516nq(this, 1));
        }
    }
}
