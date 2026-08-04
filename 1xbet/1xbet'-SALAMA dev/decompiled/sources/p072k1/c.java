package p072k1;

import A1.L0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p023d1.n;
import p111p1.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f14667h = n.g("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final L0 f14668g;

    public c(Context context, a aVar) {
        super(context, aVar);
        this.f14668g = new L0(this, 5);
    }

    @Override // p072k1.d
    public final void d() {
        n.d().b(f14667h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f14671b.registerReceiver(this.f14668g, f());
    }

    @Override // p072k1.d
    public final void e() {
        n.d().b(f14667h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f14671b.unregisterReceiver(this.f14668g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
