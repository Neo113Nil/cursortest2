package io.flutter.plugin.platform;

import android.view.MotionEvent;

/* JADX INFO: renamed from: io.flutter.plugin.platform.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0916d extends p121q5.g {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0913a f14151x;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0913a c0913a = this.f14151x;
        if (c0913a != null) {
            io.flutter.view.k kVar = c0913a.f14143a;
            if (kVar == null ? false : kVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
