package org.betup.utils;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.views.ComposeUtils;

/* compiled from: BattleBetOutcomeResolver.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"battleBetHighlightBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "style", "Lorg/betup/utils/BattleBetHighlightStyle;", "(Lorg/betup/utils/BattleBetHighlightStyle;Landroidx/compose/runtime/Composer;I)J", "battleBetHighlightTextColor", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BattleBetOutcomeResolverKt {

    /* compiled from: BattleBetOutcomeResolver.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BattleBetHighlightStyle.values().length];
            try {
                iArr[BattleBetHighlightStyle.WINNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BattleBetHighlightStyle.WINNER_MUTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BattleBetHighlightStyle.LOSER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BattleBetHighlightStyle.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BattleBetHighlightStyle.DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long battleBetHighlightBackgroundColor(BattleBetHighlightStyle style, Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(style, "style");
        composer.startReplaceGroup(119316749);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(119316749, i, -1, "org.betup.utils.battleBetHighlightBackgroundColor (BattleBetOutcomeResolver.kt:254)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i2 == 1) {
            j = ComposeUtils.AppColorPalette.Green.INSTANCE.getColor();
        } else if (i2 == 2) {
            j = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null);
        } else if (i2 == 3) {
            j = ComposeUtils.AppColorPalette.Red.INSTANCE.getColor();
        } else if (i2 == 4) {
            j = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            j = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long battleBetHighlightTextColor(BattleBetHighlightStyle style, Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(style, "style");
        composer.startReplaceGroup(-2075922740);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2075922740, i, -1, "org.betup.utils.battleBetHighlightTextColor (BattleBetOutcomeResolver.kt:263)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                j = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
            } else if (i2 != 3) {
                if (i2 == 4) {
                    j = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return j;
        }
        j = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        return j;
    }
}
