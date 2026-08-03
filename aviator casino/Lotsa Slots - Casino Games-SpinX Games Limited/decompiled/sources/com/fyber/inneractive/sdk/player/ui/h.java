package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes3.dex */
public final class h implements com.fyber.inneractive.sdk.player.ui.a {
    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final com.fyber.inneractive.sdk.util.h1 a(com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType, int i, int i2, boolean z, com.fyber.inneractive.sdk.util.h1 h1Var, int i3, int i4, int i5, int i6) {
        if (h1Var == null) {
            return null;
        }
        if (unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.SQUARE) {
            int min = java.lang.Math.min(i3, i5) - com.fyber.inneractive.sdk.util.o.b(i6 * 2);
            h1Var.f4294a = min;
            h1Var.b = min;
        } else if (unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.LANDSCAPE) {
            int min2 = java.lang.Math.min(i3, i5) - com.fyber.inneractive.sdk.util.o.b(i6 * 2);
            h1Var.f4294a = min2;
            h1Var.b = (min2 * 9) / 16;
        } else if (unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT) {
            h1Var.f4294a = com.fyber.inneractive.sdk.util.o.b(androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis);
            h1Var.b = com.fyber.inneractive.sdk.util.o.b(androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        } else if (unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.DEFAULT && z) {
            com.fyber.inneractive.sdk.util.m1.a(unitDisplayType, h1Var, i, i2, i3, i4);
        } else {
            h1Var.f4294a = 0;
            h1Var.b = 0;
        }
        return h1Var;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final com.fyber.inneractive.sdk.util.h1 a(com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType, int i, int i2, com.fyber.inneractive.sdk.util.h1 h1Var, int i3, android.view.ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.util.h1 h1Var2 = new com.fyber.inneractive.sdk.util.h1(0, 0);
        if (unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.SQUARE) {
            int i4 = h1Var.f4294a;
            com.fyber.inneractive.sdk.util.m1.a(unitDisplayType, h1Var2, i, i2, i4, i4);
        } else {
            com.fyber.inneractive.sdk.util.m1.a(unitDisplayType, h1Var2, i, i2, h1Var.f4294a, h1Var.b);
        }
        return h1Var2;
    }
}
