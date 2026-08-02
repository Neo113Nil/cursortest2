package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C5235c0 implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Configuration f40822a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ G1.d f40823b;

    ComponentCallbacks2C5235c0(Configuration configuration, G1.d dVar) {
        this.f40822a = configuration;
        this.f40823b = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        Configuration configuration2 = this.f40822a;
        this.f40823b.c(configuration2.updateFrom(configuration));
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f40823b.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i11) {
        this.f40823b.a();
    }
}
