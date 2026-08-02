package io.flutter.plugin.platform;

import android.view.MotionEvent;
import q5.C1563g;

/* renamed from: io.flutter.plugin.platform.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1297d extends C1563g {

    /* renamed from: x, reason: collision with root package name */
    public C1294a f14145x;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1294a c1294a = this.f14145x;
        if (c1294a != null) {
            io.flutter.view.k kVar = c1294a.f14137a;
            if (kVar == null ? false : kVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
