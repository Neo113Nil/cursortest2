package io.flutter.plugin.platform;

/* loaded from: classes.dex */
public final class b extends P0.C0052j {

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.plugin.platform.a f7741h;

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        io.flutter.plugin.platform.a aVar = this.f7741h;
        if (aVar != null) {
            io.flutter.view.h hVar = aVar.f7740a;
            if (hVar == null ? false : hVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
