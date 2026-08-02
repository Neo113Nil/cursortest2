package org.betup.ui.fragment.user.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.fragment.matches.details.compose.butons.base.BaseButtonMatchKt;
import org.betup.ui.fragment.matches.details.compose.butons.base.BaseButtonMatchUIItem;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: UserDetailTabsUi.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"UserDetailTabsUi", "", "listBaseButtons", "", "Lorg/betup/ui/fragment/matches/details/compose/butons/base/BaseButtonMatchUIItem;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "PreviewUserDetailTabs", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserDetailTabsUiKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewUserDetailTabs$lambda$13(int i, Composer composer, int i2) {
        PreviewUserDetailTabs(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailTabsUi$lambda$4(List list, int i, Composer composer, int i2) {
        UserDetailTabsUi(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UserDetailTabsUi(final List<BaseButtonMatchUIItem> listBaseButtons, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(listBaseButtons, "listBaseButtons");
        Composer startRestartGroup = composer.startRestartGroup(-841809861);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(listBaseButtons) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-841809861, i2, -1, "org.betup.ui.fragment.user.compose.UserDetailTabsUi (UserDetailTabsUi.kt:18)");
            }
            float f = 6;
            Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(f), 7, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            startRestartGroup.startReplaceGroup(5004770);
            boolean changedInstance = startRestartGroup.changedInstance(listBaseButtons);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserDetailTabsUiKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit UserDetailTabsUi$lambda$3$lambda$2;
                        UserDetailTabsUi$lambda$3$lambda$2 = UserDetailTabsUiKt.UserDetailTabsUi$lambda$3$lambda$2(listBaseButtons, (LazyListScope) obj);
                        return UserDetailTabsUi$lambda$3$lambda$2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            LazyDslKt.LazyRow(m1520paddingqDBjuR0$default, null, null, false, spaceBetween, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 24582, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserDetailTabsUiKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UserDetailTabsUi$lambda$4;
                    UserDetailTabsUi$lambda$4 = UserDetailTabsUiKt.UserDetailTabsUi$lambda$4(listBaseButtons, i, (Composer) obj, ((Integer) obj2).intValue());
                    return UserDetailTabsUi$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailTabsUi$lambda$3$lambda$2(final List list, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final Function2 function2 = new Function2() { // from class: org.betup.ui.fragment.user.compose.UserDetailTabsUiKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object UserDetailTabsUi$lambda$3$lambda$2$lambda$0;
                UserDetailTabsUi$lambda$3$lambda$2$lambda$0 = UserDetailTabsUiKt.UserDetailTabsUi$lambda$3$lambda$2$lambda$0(((Integer) obj).intValue(), (BaseButtonMatchUIItem) obj2);
                return UserDetailTabsUi$lambda$3$lambda$2$lambda$0;
            }
        };
        LazyRow.items(list.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.user.compose.UserDetailTabsUiKt$UserDetailTabsUi$lambda$3$lambda$2$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function2.this.invoke(Integer.valueOf(i), list.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.user.compose.UserDetailTabsUiKt$UserDetailTabsUi$lambda$3$lambda$2$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserDetailTabsUiKt$UserDetailTabsUi$lambda$3$lambda$2$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C214@10657L26:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                BaseButtonMatchUIItem baseButtonMatchUIItem = (BaseButtonMatchUIItem) list.get(i);
                composer.startReplaceGroup(-1650933058);
                BaseButtonMatchKt.BaseButtonMatch(null, baseButtonMatchUIItem, composer, 0, 1);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object UserDetailTabsUi$lambda$3$lambda$2$lambda$0(int i, BaseButtonMatchUIItem baseButtonMatchUIItem) {
        Intrinsics.checkNotNullParameter(baseButtonMatchUIItem, "<unused var>");
        return "base_tab_" + i;
    }

    public static final void PreviewUserDetailTabs(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-328264879);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-328264879, i, -1, "org.betup.ui.fragment.user.compose.PreviewUserDetailTabs (UserDetailTabsUi.kt:35)");
            }
            BaseButtonMatchUIItem[] baseButtonMatchUIItemArr = new BaseButtonMatchUIItem[4];
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserDetailTabsUiKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            baseButtonMatchUIItemArr[0] = new BaseButtonMatchUIItem(R.drawable.profile_ic_selected, R.drawable.profile_ic_gray, false, R.string.profile, (Function0) rememberedValue, false, null, 0.0f, 0.0f, null, 960, null);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserDetailTabsUiKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            baseButtonMatchUIItemArr[1] = new BaseButtonMatchUIItem(R.drawable.followers_ic_selected, R.drawable.followers_ic_unselected, false, R.string.followers, (Function0) rememberedValue2, false, null, 0.0f, 0.0f, null, 960, null);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserDetailTabsUiKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            baseButtonMatchUIItemArr[2] = new BaseButtonMatchUIItem(R.drawable.battles_icon_new_selected, R.drawable.battles_icon_new_unselected, true, R.string.battles, (Function0) rememberedValue3, false, null, 0.0f, 0.0f, null, 960, null);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserDetailTabsUiKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceGroup();
            baseButtonMatchUIItemArr[3] = new BaseButtonMatchUIItem(R.drawable.comments_icon_new_selected, R.drawable.comments_icon_new_unselected, false, R.string.messages, (Function0) rememberedValue4, false, null, 0.0f, 0.0f, null, 960, null);
            UserDetailTabsUi(CollectionsKt.listOf((Object[]) baseButtonMatchUIItemArr), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.UserDetailTabsUiKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewUserDetailTabs$lambda$13;
                    PreviewUserDetailTabs$lambda$13 = UserDetailTabsUiKt.PreviewUserDetailTabs$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewUserDetailTabs$lambda$13;
                }
            });
        }
    }
}
