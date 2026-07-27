package io.flutter.view;

import android.hardware.display.DisplayManager;

/* loaded from: classes.dex */
public final class r implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f9461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f9462b;

    public r(t tVar, DisplayManager displayManager) {
        this.f9462b = tVar;
        this.f9461a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i3) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i3) {
        if (i3 == 0) {
            float refreshRate = this.f9461a.getDisplay(0).getRefreshRate();
            t tVar = this.f9462b;
            tVar.f9466a = (long) (1.0E9d / refreshRate);
            tVar.f9467b.setRefreshRateFPS(refreshRate);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i3) {
    }
}
