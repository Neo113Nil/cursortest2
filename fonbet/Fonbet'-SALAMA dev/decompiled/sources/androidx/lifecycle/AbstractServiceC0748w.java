package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import w1.C1759x1;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0748w extends Service implements InterfaceC0745t {

    /* renamed from: a, reason: collision with root package name */
    public final C1759x1 f9644a = new C1759x1(this);

    @Override // androidx.lifecycle.InterfaceC0745t
    public final AbstractC0741o getLifecycle() {
        return (C0747v) this.f9644a.f17925b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        t6.h.e(intent, "intent");
        this.f9644a.Y(EnumC0739m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f9644a.Y(EnumC0739m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0739m enumC0739m = EnumC0739m.ON_STOP;
        C1759x1 c1759x1 = this.f9644a;
        c1759x1.Y(enumC0739m);
        c1759x1.Y(EnumC0739m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i7) {
        this.f9644a.Y(EnumC0739m.ON_START);
        super.onStart(intent, i7);
    }
}
