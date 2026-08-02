package org.betup.ui.fragment.user.compose;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.common.compose.CommonButtonKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: UserProfileComponents.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UserProfileComponentsKt$FavouritesSection$1$2$1$1$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ MutableIntState $selectedTab$delegate;
    final /* synthetic */ List<String> $tabTitles;

    UserProfileComponentsKt$FavouritesSection$1$2$1$1$1(List<String> list, MutableIntState mutableIntState) {
        this.$tabTitles = list;
        this.$selectedTab$delegate = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope items, final int i, Composer composer, int i2) {
        int i3;
        int FavouritesSection$lambda$23;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if ((i3 & Opcodes.I2B) == 144 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(790918044, i3, -1, "org.betup.ui.fragment.user.compose.FavouritesSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserProfileComponents.kt:495)");
        }
        String str = this.$tabTitles.get(i);
        FavouritesSection$lambda$23 = UserProfileComponentsKt.FavouritesSection$lambda$23(this.$selectedTab$delegate);
        boolean z = FavouritesSection$lambda$23 == i;
        composer.startReplaceGroup(-1633490746);
        boolean z2 = (i3 & 112) == 32;
        final MutableIntState mutableIntState = this.$selectedTab$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$FavouritesSection$1$2$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = UserProfileComponentsKt$FavouritesSection$1$2$1$1$1.invoke$lambda$1$lambda$0(i, mutableIntState);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        CommonButtonKt.m12915CommonButtonUPEs2M4(null, z, str, false, false, false, (Function0) rememberedValue, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 0, 0, 0, 2097081);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(int i, MutableIntState mutableIntState) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }
}
