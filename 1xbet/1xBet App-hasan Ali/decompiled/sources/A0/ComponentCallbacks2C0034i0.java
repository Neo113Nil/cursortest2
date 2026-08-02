package A0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: A0.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0034i0 implements ComponentCallbacks2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ F0.b f512k;

    public ComponentCallbacks2C0034i0(F0.b bVar) {
        this.f512k = bVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        F0.b bVar = this.f512k;
        synchronized (bVar) {
            bVar.f1520a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        F0.b bVar = this.f512k;
        synchronized (bVar) {
            bVar.f1520a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        F0.b bVar = this.f512k;
        synchronized (bVar) {
            bVar.f1520a.c();
        }
    }
}
