package io.flutter.view;

/* loaded from: classes.dex */
public final class q implements android.hardware.display.DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.display.DisplayManager f7918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1.l f7919b;

    public q(M1.l lVar, android.hardware.display.DisplayManager displayManager) {
        this.f7919b = lVar;
        this.f7918a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        if (i2 == 0) {
            float refreshRate = this.f7918a.getDisplay(0).getRefreshRate();
            M1.l lVar = this.f7919b;
            lVar.f1087a = (long) (1.0E9d / refreshRate);
            ((io.flutter.embedding.engine.FlutterJNI) lVar.f1088b).setRefreshRateFPS(refreshRate);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
    }
}
