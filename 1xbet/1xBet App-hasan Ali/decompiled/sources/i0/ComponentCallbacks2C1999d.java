package i0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: i0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1999d implements ComponentCallbacks2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2000e f17270k;

    public ComponentCallbacks2C1999d(C2000e c2000e) {
        this.f17270k = c2000e;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 40) {
            this.f17270k.getClass();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
