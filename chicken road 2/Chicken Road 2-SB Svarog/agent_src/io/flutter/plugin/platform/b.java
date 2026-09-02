package io.flutter.plugin.platform;

import F.C0012m;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class b extends C0012m {

    /* renamed from: h, reason: collision with root package name */
    public a f663h;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f663h;
        if (aVar != null) {
            io.flutter.view.i iVar = aVar.f662a;
            if (iVar == null ? false : iVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
