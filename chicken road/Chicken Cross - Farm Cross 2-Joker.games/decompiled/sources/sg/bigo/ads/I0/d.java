package sg.bigo.ads.I0;

import android.hardware.display.DisplayManager;

/* loaded from: classes3.dex */
public final class d implements DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DisplayManager f12336a;

    public d(DisplayManager displayManager) {
        this.f12336a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            try {
                f.f = this.f12336a.getDisplay(i).getState();
            } catch (Throwable unused) {
            }
        }
        int i2 = f.f12337a;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
