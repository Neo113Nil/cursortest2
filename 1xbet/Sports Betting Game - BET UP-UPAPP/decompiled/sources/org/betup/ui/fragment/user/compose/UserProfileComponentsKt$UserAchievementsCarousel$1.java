package org.betup.ui.fragment.user.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.profileinstaller.ProfileVerifier;
import coil3.compose.SingletonAsyncImageKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.betup.model.remote.entity.user.NewUserAchievementsModel;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: UserProfileComponents.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UserProfileComponentsKt$UserAchievementsCarousel$1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ List<NewUserAchievementsModel> $achievements;
    final /* synthetic */ float $itemSizeDp;
    final /* synthetic */ float $itemSpacingDp;

    UserProfileComponentsKt$UserAchievementsCarousel$1(List<NewUserAchievementsModel> list, float f, float f2) {
        this.$achievements = list;
        this.$itemSizeDp = f;
        this.$itemSpacingDp = f2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final int invoke$lambda$5(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$8$lambda$7(boolean z, MutableIntState mutableIntState) {
        if (z) {
            mutableIntState.setIntValue(invoke$lambda$5(mutableIntState) - 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$11$lambda$10(List list, int i, MutableIntState mutableIntState, final float f, final float f2, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final List take = CollectionsKt.take(CollectionsKt.drop(list, invoke$lambda$5(mutableIntState)), i);
        final UserProfileComponentsKt$UserAchievementsCarousel$1$invoke$lambda$14$lambda$11$lambda$10$$inlined$items$default$1 userProfileComponentsKt$UserAchievementsCarousel$1$invoke$lambda$14$lambda$11$lambda$10$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$UserAchievementsCarousel$1$invoke$lambda$14$lambda$11$lambda$10$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(NewUserAchievementsModel newUserAchievementsModel) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((NewUserAchievementsModel) obj);
            }
        };
        LazyRow.items(take.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$UserAchievementsCarousel$1$invoke$lambda$14$lambda$11$lambda$10$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i2) {
                return Function1.this.invoke(take.get(i2));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$UserAchievementsCarousel$1$invoke$lambda$14$lambda$11$lambda$10$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                int i4;
                ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                if ((i3 & 6) == 0) {
                    i4 = i3 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i3 & 48) == 0) {
                    i4 |= composer.changed(i2) ? 32 : 16;
                }
                if (!composer.shouldExecute((i4 & Opcodes.I2S) != 146, i4 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                NewUserAchievementsModel newUserAchievementsModel = (NewUserAchievementsModel) take.get(i2);
                composer.startReplaceGroup(-2067214093);
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(newUserAchievementsModel.getPhotoUrl(), newUserAchievementsModel.getName(), AlphaKt.alpha(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f), newUserAchievementsModel.isOpened() ? 1.0f : 0.4f), null, null, null, null, 0.0f, null, 0, false, composer, 0, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, f2), composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13$lambda$12(boolean z, MutableIntState mutableIntState) {
        if (z) {
            mutableIntState.setIntValue(invoke$lambda$5(mutableIntState) + 1);
        }
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(118684998, i2, -1, "org.betup.ui.fragment.user.compose.UserAchievementsCarousel.<anonymous> (UserProfileComponents.kt:707)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float mo1167toPx0680j_4 = ((Density) consume).mo1167toPx0680j_4(this.$itemSizeDp);
        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localDensity2);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float mo1167toPx0680j_42 = mo1167toPx0680j_4 + ((Density) consume2).mo1167toPx0680j_4(this.$itemSpacingDp);
        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume3 = composer.consume(localDensity3);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float mo1167toPx0680j_43 = ((Density) consume3).mo1167toPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM());
        float mo1423getMaxWidthD9Ej5fM = BoxWithConstraints.mo1423getMaxWidthD9Ej5fM();
        composer.startReplaceGroup(5004770);
        boolean changed = composer.changed(mo1423getMaxWidthD9Ej5fM);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = Integer.valueOf(RangesKt.coerceAtLeast((int) (mo1167toPx0680j_43 / mo1167toPx0680j_42), 1));
            composer.updateRememberedValue(rememberedValue);
        }
        final int intValue = ((Number) rememberedValue).intValue();
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
            composer.updateRememberedValue(rememberedValue2);
        }
        final MutableIntState mutableIntState = (MutableIntState) rememberedValue2;
        composer.endReplaceGroup();
        final boolean z = invoke$lambda$5(mutableIntState) > 0;
        boolean z2 = invoke$lambda$5(mutableIntState) + intValue < this.$achievements.size();
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        final List<NewUserAchievementsModel> list = this.$achievements;
        final float f = this.$itemSizeDp;
        final float f2 = this.$itemSpacingDp;
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composer.startReplaceGroup(-1633490746);
        boolean changed2 = composer.changed(z);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$UserAchievementsCarousel$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$14$lambda$8$lambda$7;
                    invoke$lambda$14$lambda$8$lambda$7 = UserProfileComponentsKt$UserAchievementsCarousel$1.invoke$lambda$14$lambda$8$lambda$7(z, mutableIntState);
                    return invoke$lambda$14$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        IconButtonKt.IconButton((Function0) rememberedValue3, null, z, null, null, ComposableLambdaKt.rememberComposableLambda(-1970356281, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$UserAchievementsCarousel$1$1$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1970356281, i3, -1, "org.betup.ui.fragment.user.compose.UserAchievementsCarousel.<anonymous>.<anonymous>.<anonymous> (UserProfileComponents.kt:727)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, composer2, 6), StringResources_androidKt.stringResource(R.string.cd_scroll_left, composer2, 6), AlphaKt.alpha(Modifier.INSTANCE, z ? 1.0f : 0.3f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 0, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
        composer.startReplaceGroup(-1224400529);
        boolean changedInstance = composer.changedInstance(list) | composer.changed(intValue) | composer.changed(f) | composer.changed(f2);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$UserAchievementsCarousel$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$14$lambda$11$lambda$10;
                    invoke$lambda$14$lambda$11$lambda$10 = UserProfileComponentsKt$UserAchievementsCarousel$1.invoke$lambda$14$lambda$11$lambda$10(list, intValue, mutableIntState, f, f2, (LazyListScope) obj);
                    return invoke$lambda$14$lambda$11$lambda$10;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        final boolean z3 = z2;
        LazyDslKt.LazyRow(weight$default, null, null, false, null, null, null, false, null, (Function1) rememberedValue4, composer, 12582912, 382);
        composer.startReplaceGroup(-1633490746);
        boolean changed3 = composer.changed(z3);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$UserAchievementsCarousel$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$14$lambda$13$lambda$12;
                    invoke$lambda$14$lambda$13$lambda$12 = UserProfileComponentsKt$UserAchievementsCarousel$1.invoke$lambda$14$lambda$13$lambda$12(z3, mutableIntState);
                    return invoke$lambda$14$lambda$13$lambda$12;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceGroup();
        IconButtonKt.IconButton((Function0) rememberedValue5, null, z3, null, null, ComposableLambdaKt.rememberComposableLambda(-143250050, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserProfileComponentsKt$UserAchievementsCarousel$1$1$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-143250050, i3, -1, "org.betup.ui.fragment.user.compose.UserAchievementsCarousel.<anonymous>.<anonymous>.<anonymous> (UserProfileComponents.kt:754)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.arrow_light_right, composer2, 6), StringResources_androidKt.stringResource(R.string.cd_scroll_right, composer2, 6), AlphaKt.alpha(Modifier.INSTANCE, z3 ? 1.0f : 0.3f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 0, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
