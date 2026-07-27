package f2;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* loaded from: classes.dex */
public final class E extends Binder {

    /* renamed from: a, reason: collision with root package name */
    public final U.e f5569a;

    public E(U.e eVar) {
        this.f5569a = eVar;
    }

    public final void a(F f3) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = f3.f5570a;
        AbstractServiceC0423g abstractServiceC0423g = (AbstractServiceC0423g) this.f5569a.f3053a;
        abstractServiceC0423g.getClass();
        I1.h hVar = new I1.h();
        abstractServiceC0423g.f5601a.execute(new J0.a(abstractServiceC0423g, intent, hVar, 4));
        hVar.f1248a.f(new U.d(0), new D3.g(20, f3));
    }
}
