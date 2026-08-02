package org.betup.ui.dialogs.compose;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BattleResultVisualModifiers.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"battleEmblemDropShadow", "Landroidx/compose/ui/Modifier;", "shadowColor", "Landroidx/compose/ui/graphics/Color;", "offsetY", "Landroidx/compose/ui/unit/Dp;", "blurSpread", "battleEmblemDropShadow-y6ga9Xk", "(Landroidx/compose/ui/Modifier;JFF)Landroidx/compose/ui/Modifier;", "battleCardInnerGlow", "glowColor", "cornerRadius", "battleCardInnerGlow-Hht5A8o", "(Landroidx/compose/ui/Modifier;JF)Landroidx/compose/ui/Modifier;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BattleResultVisualModifiersKt {
    /* renamed from: battleEmblemDropShadow-y6ga9Xk, reason: not valid java name */
    public static final Modifier m13250battleEmblemDropShadowy6ga9Xk(Modifier battleEmblemDropShadow, long j, float f, float f2) {
        Intrinsics.checkNotNullParameter(battleEmblemDropShadow, "$this$battleEmblemDropShadow");
        return ComposedModifierKt.composed$default(battleEmblemDropShadow, null, new BattleResultVisualModifiersKt$battleEmblemDropShadow$1(j, f2, f), 1, null);
    }

    /* renamed from: battleCardInnerGlow-Hht5A8o, reason: not valid java name */
    public static final Modifier m13248battleCardInnerGlowHht5A8o(Modifier battleCardInnerGlow, long j, float f) {
        Intrinsics.checkNotNullParameter(battleCardInnerGlow, "$this$battleCardInnerGlow");
        return ComposedModifierKt.composed$default(battleCardInnerGlow, null, new BattleResultVisualModifiersKt$battleCardInnerGlow$1(j, f), 1, null);
    }

    /* renamed from: battleEmblemDropShadow-y6ga9Xk$default, reason: not valid java name */
    public static /* synthetic */ Modifier m13251battleEmblemDropShadowy6ga9Xk$default(Modifier modifier, long j, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = Dp.m7774constructorimpl(10);
        }
        if ((i & 4) != 0) {
            f2 = Dp.m7774constructorimpl(18);
        }
        return m13250battleEmblemDropShadowy6ga9Xk(modifier, j, f, f2);
    }

    /* renamed from: battleCardInnerGlow-Hht5A8o$default, reason: not valid java name */
    public static /* synthetic */ Modifier m13249battleCardInnerGlowHht5A8o$default(Modifier modifier, long j, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = Dp.m7774constructorimpl(12);
        }
        return m13248battleCardInnerGlowHht5A8o(modifier, j, f);
    }
}
