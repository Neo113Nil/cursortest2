package com.instagram.common.viewpoint.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2528aC extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C2535aJ A01;

    public C2528aC(C2535aJ c2535aJ, float f) {
        this.A01 = c2535aJ;
        this.A00 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(XV.A00, XV.A00, view.getWidth(), view.getHeight(), this.A00);
    }
}
