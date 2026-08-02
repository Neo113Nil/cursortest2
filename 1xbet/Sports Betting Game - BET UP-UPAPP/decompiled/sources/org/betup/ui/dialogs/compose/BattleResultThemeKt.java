package org.betup.ui.dialogs.compose;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.views.ComposeUtils;

/* compiled from: BattleResultTheme.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, d2 = {"toVisual", "Lorg/betup/ui/views/ComposeUtils$BattleResultVisualTone;", "Lorg/betup/ui/dialogs/compose/BattleResultTone;", "toBattleTone", "cardBodyBrush", "Landroidx/compose/ui/graphics/Brush;", "Lorg/betup/ui/dialogs/compose/BattleResultPalette;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BattleResultThemeKt {

    /* compiled from: BattleResultTheme.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BattleResultTone.values().length];
            try {
                iArr[BattleResultTone.WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BattleResultTone.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BattleResultTone.DRAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BattleResultTone.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BattleResultTone.ACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BattleResultTone.RETURNED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BattleResultTone.CANCELED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BattleResultTone.FINISHED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BattleResultTone.NEUTRAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ComposeUtils.BattleResultVisualTone.values().length];
            try {
                iArr2[ComposeUtils.BattleResultVisualTone.WON.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ComposeUtils.BattleResultVisualTone.LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ComposeUtils.BattleResultVisualTone.DRAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ComposeUtils.BattleResultVisualTone.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ComposeUtils.BattleResultVisualTone.ACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ComposeUtils.BattleResultVisualTone.RETURNED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ComposeUtils.BattleResultVisualTone.CANCELED.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ComposeUtils.BattleResultVisualTone.FINISHED.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[ComposeUtils.BattleResultVisualTone.NEUTRAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComposeUtils.BattleResultVisualTone toVisual(BattleResultTone battleResultTone) {
        switch (WhenMappings.$EnumSwitchMapping$0[battleResultTone.ordinal()]) {
            case 1:
                return ComposeUtils.BattleResultVisualTone.WON;
            case 2:
                return ComposeUtils.BattleResultVisualTone.LOST;
            case 3:
                return ComposeUtils.BattleResultVisualTone.DRAW;
            case 4:
                return ComposeUtils.BattleResultVisualTone.PENDING;
            case 5:
                return ComposeUtils.BattleResultVisualTone.ACTIVE;
            case 6:
                return ComposeUtils.BattleResultVisualTone.RETURNED;
            case 7:
                return ComposeUtils.BattleResultVisualTone.CANCELED;
            case 8:
                return ComposeUtils.BattleResultVisualTone.FINISHED;
            case 9:
                return ComposeUtils.BattleResultVisualTone.NEUTRAL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BattleResultTone toBattleTone(ComposeUtils.BattleResultVisualTone battleResultVisualTone) {
        switch (WhenMappings.$EnumSwitchMapping$1[battleResultVisualTone.ordinal()]) {
            case 1:
                return BattleResultTone.WON;
            case 2:
                return BattleResultTone.LOST;
            case 3:
                return BattleResultTone.DRAW;
            case 4:
                return BattleResultTone.PENDING;
            case 5:
                return BattleResultTone.ACTIVE;
            case 6:
                return BattleResultTone.RETURNED;
            case 7:
                return BattleResultTone.CANCELED;
            case 8:
                return BattleResultTone.FINISHED;
            case 9:
                return BattleResultTone.NEUTRAL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Brush cardBodyBrush(BattleResultPalette battleResultPalette) {
        Intrinsics.checkNotNullParameter(battleResultPalette, "<this>");
        return Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(battleResultPalette.m13237getAccentSoft0d7_KjU(), 0.22f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(ComposeUtils.AppColorPalette.BattleCardSurfaceTop.INSTANCE.getColor()), Color.m5158boximpl(ComposeUtils.AppColorPalette.BattleCardSurfaceBottom.INSTANCE.getColor())}), 0.0f, 0.0f, 0, 14, (Object) null);
    }
}
