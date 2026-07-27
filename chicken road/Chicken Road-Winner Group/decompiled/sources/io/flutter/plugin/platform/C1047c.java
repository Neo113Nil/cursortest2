package io.flutter.plugin.platform;

import I1.C0031h;
import android.view.MotionEvent;

/* renamed from: io.flutter.plugin.platform.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1047c extends C0031h {

    /* renamed from: h, reason: collision with root package name */
    public C1045a f9251h;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1045a c1045a = this.f9251h;
        if (c1045a != null) {
            io.flutter.view.i iVar = c1045a.f9249a;
            if (iVar == null ? false : iVar.f(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
