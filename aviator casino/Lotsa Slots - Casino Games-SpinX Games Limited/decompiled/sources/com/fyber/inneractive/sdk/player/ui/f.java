package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.player.ui.a {
    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final com.fyber.inneractive.sdk.util.h1 a(com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType, int i, int i2, boolean z, com.fyber.inneractive.sdk.util.h1 h1Var, int i3, int i4, int i5, int i6) {
        if (unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.DEFAULT && z) {
            com.fyber.inneractive.sdk.util.m1.a(unitDisplayType, h1Var, i, i2, i3, i4);
        }
        h1Var.f4294a = 0;
        h1Var.b = 0;
        return h1Var;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final com.fyber.inneractive.sdk.util.h1 a(com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType, int i, int i2, com.fyber.inneractive.sdk.util.h1 h1Var, int i3, android.view.ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.util.h1 h1Var2 = new com.fyber.inneractive.sdk.util.h1(0, 0);
        if (unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.SQUARE) {
            int min = java.lang.Math.min(h1Var.f4294a, i3);
            if (viewGroup != null) {
                viewGroup.getLayoutParams().width = min;
                viewGroup.getLayoutParams().height = min;
            }
            com.fyber.inneractive.sdk.util.m1.a(unitDisplayType, h1Var2, i, i2, min, min);
        } else {
            com.fyber.inneractive.sdk.util.m1.a(unitDisplayType, h1Var2, i, i2, h1Var.f4294a, h1Var.b);
        }
        return h1Var2;
    }
}
