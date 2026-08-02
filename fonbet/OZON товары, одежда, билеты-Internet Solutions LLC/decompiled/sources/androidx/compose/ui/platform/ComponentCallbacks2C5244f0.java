package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C5244f0 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ G1.f f40873a;

    ComponentCallbacks2C5244f0(G1.f fVar) {
        this.f40873a = fVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        this.f40873a.a();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f40873a.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i11) {
        this.f40873a.a();
    }
}
