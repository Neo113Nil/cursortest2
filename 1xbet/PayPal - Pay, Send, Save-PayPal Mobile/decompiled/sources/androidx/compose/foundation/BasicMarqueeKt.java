package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aM\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "iterations", "Landroidx/compose/foundation/MarqueeAnimationMode;", "animationMode", "repeatDelayMillis", "initialDelayMillis", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing", "Landroidx/compose/ui/unit/Dp;", "velocity", "basicMarquee-1Mj1MLw", "(Landroidx/compose/ui/Modifier;IIIILandroidx/compose/foundation/MarqueeSpacing;F)Landroidx/compose/ui/Modifier;", "basicMarquee", "MarqueeSpacing-0680j_4", "(F)Landroidx/compose/foundation/MarqueeSpacing;", "MarqueeSpacing"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BasicMarqueeKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* renamed from: basicMarquee-1Mj1MLw$default, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ androidx.compose.ui.Modifier m1290basicMarquee1Mj1MLw$default(androidx.compose.ui.Modifier modifier, int i, int i2, int i3, int i4, androidx.compose.foundation.MarqueeSpacing marqueeSpacing, float f, int i5, java.lang.Object obj) {
        int i6;
        if ((i5 & 1) != 0) {
            i = androidx.compose.foundation.MarqueeDefaults.INSTANCE.getIterations();
        }
        if ((i5 & 2) != 0) {
            i2 = androidx.compose.foundation.MarqueeAnimationMode.INSTANCE.m1356getImmediatelyZbEOnfQ();
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = androidx.compose.foundation.MarqueeDefaults.INSTANCE.getRepeatDelayMillis();
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            if (androidx.compose.foundation.MarqueeAnimationMode.m1352equalsimpl0(i7, androidx.compose.foundation.MarqueeAnimationMode.INSTANCE.m1356getImmediatelyZbEOnfQ())) {
                i6 = i8;
                if ((i5 & 16) != 0) {
                    marqueeSpacing = androidx.compose.foundation.MarqueeDefaults.INSTANCE.getSpacing();
                }
                androidx.compose.foundation.MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
                if ((i5 & 32) != 0) {
                    f = androidx.compose.foundation.MarqueeDefaults.INSTANCE.m1358getVelocityD9Ej5fM();
                }
                return m1289basicMarquee1Mj1MLw(modifier, i, i7, i8, i6, marqueeSpacing2, f);
            }
            i4 = 0;
        }
        i6 = i4;
        if ((i5 & 16) != 0) {
        }
        androidx.compose.foundation.MarqueeSpacing marqueeSpacing22 = marqueeSpacing;
        if ((i5 & 32) != 0) {
        }
        return m1289basicMarquee1Mj1MLw(modifier, i, i7, i8, i6, marqueeSpacing22, f);
    }

    /* renamed from: basicMarquee-1Mj1MLw, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1289basicMarquee1Mj1MLw(androidx.compose.ui.Modifier modifier, int i, int i2, int i3, int i4, androidx.compose.foundation.MarqueeSpacing marqueeSpacing, float f) {
        return modifier.then(new androidx.compose.foundation.MarqueeModifierElement(i, i2, i3, i4, marqueeSpacing, f, null));
    }

    /* renamed from: MarqueeSpacing-0680j_4, reason: not valid java name */
    public static final androidx.compose.foundation.MarqueeSpacing m1287MarqueeSpacing0680j_4(final float f) {
        return new androidx.compose.foundation.MarqueeSpacing() { // from class: androidx.compose.foundation.BasicMarqueeKt$$ExternalSyntheticLambda0
            @Override // androidx.compose.foundation.MarqueeSpacing
            public final int calculateSpacing(androidx.compose.ui.unit.Density density, int i, int i2) {
                int mo1412roundToPx0680j_4;
                mo1412roundToPx0680j_4 = density.mo1412roundToPx0680j_4(f);
                return mo1412roundToPx0680j_4;
            }
        };
    }

    /* renamed from: access$createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.animation.core.AnimationSpec m1288access$createMarqueeAnimationSpecZ4HSEVQ(int i, float f, int i2, int i3, float f2, androidx.compose.ui.unit.Density density) {
        androidx.compose.animation.core.TweenSpec tween = androidx.compose.animation.core.AnimationSpecKt.tween((int) java.lang.Math.ceil(f / (java.lang.Math.abs(density.mo1418toPx0680j_4(f2)) / 1000.0f)), i3, androidx.compose.animation.core.EasingKt.getLinearEasing());
        long m1219constructorimpl$default = androidx.compose.animation.core.StartOffset.m1219constructorimpl$default((-i3) + i2, 0, 2, null);
        if (i == Integer.MAX_VALUE) {
            return androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(tween, null, m1219constructorimpl$default, 2, null);
        }
        return androidx.compose.animation.core.AnimationSpecKt.m1186repeatable91I0pcU$default(i, tween, null, m1219constructorimpl$default, 4, null);
    }
}
