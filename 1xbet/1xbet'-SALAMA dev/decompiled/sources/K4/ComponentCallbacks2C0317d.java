package K4;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: K4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ComponentCallbacks2C0317d implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f4009a;

    public ComponentCallbacks2C0317d(AtomicBoolean atomicBoolean) {
        this.f4009a = atomicBoolean;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 == 20) {
            this.f4009a.set(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
