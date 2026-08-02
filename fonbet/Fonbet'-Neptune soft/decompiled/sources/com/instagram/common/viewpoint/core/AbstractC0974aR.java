package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.aR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0974aR {
    public static final int A00 = XP.A00();

    public static void A00(C1153dL c1153dL, ViewGroup viewGroup, String str) {
        new KZ(viewGroup, c1153dL).A07(str);
        View view = new View(c1153dL);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        XP.A0P(view, c1153dL);
        viewGroup.addView(view, 0);
    }
}
