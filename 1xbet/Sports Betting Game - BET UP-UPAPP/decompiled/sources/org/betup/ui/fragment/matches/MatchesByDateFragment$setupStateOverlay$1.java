package org.betup.ui.fragment.matches;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.betup.ui.common.Paginator;
import org.betup.ui.fragment.matches.compose.EmptyAndErrorStateOverlayKt;

/* compiled from: MatchesByDateFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MatchesByDateFragment$setupStateOverlay$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MatchesByDateFragment this$0;

    MatchesByDateFragment$setupStateOverlay$1(MatchesByDateFragment matchesByDateFragment) {
        this.this$0 = matchesByDateFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        boolean z;
        String str;
        int i2;
        String str2;
        boolean z2;
        String str3;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1035433025, i, -1, "org.betup.ui.fragment.matches.MatchesByDateFragment.setupStateOverlay.<anonymous> (MatchesByDateFragment.kt:308)");
        }
        z = this.this$0.isLoadingMatches;
        str = this.this$0.matchesError;
        boolean z3 = false;
        boolean z4 = str != null;
        i2 = this.this$0.matchesCount;
        if (i2 == 0) {
            z2 = this.this$0.isLoadingMatches;
            if (!z2) {
                str3 = this.this$0.matchesError;
                if (str3 == null) {
                    z3 = true;
                }
            }
        }
        str2 = this.this$0.matchesError;
        composer.startReplaceGroup(5004770);
        boolean changedInstance = composer.changedInstance(this.this$0);
        final MatchesByDateFragment matchesByDateFragment = this.this$0;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.MatchesByDateFragment$setupStateOverlay$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = MatchesByDateFragment$setupStateOverlay$1.invoke$lambda$1$lambda$0(MatchesByDateFragment.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        EmptyAndErrorStateOverlayKt.EmptyAndErrorStateOverlay(z, z4, z3, str2, (Function0) rememberedValue, null, composer, 0, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MatchesByDateFragment matchesByDateFragment) {
        Paginator paginator;
        paginator = matchesByDateFragment.paginator;
        if (paginator != null) {
            paginator.refresh();
        }
        return Unit.INSTANCE;
    }
}
