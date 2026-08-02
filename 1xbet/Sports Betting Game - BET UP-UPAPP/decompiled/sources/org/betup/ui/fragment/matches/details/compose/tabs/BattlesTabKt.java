package org.betup.ui.fragment.matches.details.compose.tabs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.matches.details.MatchDetailsController;
import org.betup.ui.fragment.matches.details.compose.tabs.battles.BattlesTabContentKt;

/* compiled from: BattlesTab.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"BattlesTabContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "controller", "Lorg/betup/ui/fragment/matches/details/MatchDetailsController;", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/fragment/matches/details/MatchDetailsController;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BattlesTabKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlesTabContent$lambda$0(Modifier modifier, MatchDetailsController matchDetailsController, int i, int i2, Composer composer, int i3) {
        BattlesTabContent(modifier, matchDetailsController, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void BattlesTabContent(final Modifier modifier, final MatchDetailsController controller, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(1083249008);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(controller) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1083249008, i3, -1, "org.betup.ui.fragment.matches.details.compose.tabs.BattlesTabContent (BattlesTab.kt:11)");
            }
            BattlesTabContentKt.BattlesTabContent(modifier, controller, startRestartGroup, i3 & 126, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.BattlesTabKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BattlesTabContent$lambda$0;
                    BattlesTabContent$lambda$0 = BattlesTabKt.BattlesTabContent$lambda$0(Modifier.this, controller, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BattlesTabContent$lambda$0;
                }
            });
        }
    }
}
