package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p155w1.C1050x1;

/* JADX INFO: renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC0727w extends Service implements InterfaceC0724t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1050x1 f9644a = new C1050x1(this);

    @Override // androidx.lifecycle.InterfaceC0724t
    public final AbstractC0720o getLifecycle() {
        return (C0726v) this.f9644a.f17931b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        t6.h.e(intent, "intent");
        this.f9644a.Y(EnumC0718m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f9644a.Y(EnumC0718m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0718m enumC0718m = EnumC0718m.ON_STOP;
        C1050x1 c1050x1 = this.f9644a;
        c1050x1.Y(enumC0718m);
        c1050x1.Y(EnumC0718m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i7) {
        this.f9644a.Y(EnumC0718m.ON_START);
        super.onStart(intent, i7);
    }
}
