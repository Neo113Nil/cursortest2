package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0494x extends Service implements InterfaceC0491u {

    /* renamed from: k, reason: collision with root package name */
    public final v3.e f7074k = new v3.e(this);

    @Override // androidx.lifecycle.InterfaceC0491u
    public final L g() {
        return (C0493w) this.f7074k.f20432l;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.l.f("intent", intent);
        v3.e eVar = this.f7074k;
        eVar.getClass();
        eVar.H(EnumC0486o.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        v3.e eVar = this.f7074k;
        eVar.getClass();
        eVar.H(EnumC0486o.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        v3.e eVar = this.f7074k;
        eVar.getClass();
        eVar.H(EnumC0486o.ON_STOP);
        eVar.H(EnumC0486o.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        v3.e eVar = this.f7074k;
        eVar.getClass();
        eVar.H(EnumC0486o.ON_START);
        super.onStart(intent, i);
    }
}
