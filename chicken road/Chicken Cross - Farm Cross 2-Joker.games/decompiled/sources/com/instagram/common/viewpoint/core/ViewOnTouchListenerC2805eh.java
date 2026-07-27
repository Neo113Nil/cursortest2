package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC2805eh implements View.OnTouchListener {
    public final /* synthetic */ C1967Ek A00;

    public ViewOnTouchListenerC2805eh(C1967Ek c1967Ek) {
        this.A00 = c1967Ek;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        UM um;
        um = this.A00.A0C;
        um.A02(new C1951Du(view, motionEvent));
        return false;
    }
}
