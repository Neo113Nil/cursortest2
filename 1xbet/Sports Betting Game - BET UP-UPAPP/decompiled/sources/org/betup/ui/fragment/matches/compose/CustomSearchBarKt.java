package org.betup.ui.fragment.matches.compose;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.ui.dialogs.compose.BattleFlowDimens;
import org.betup.ui.views.ComposeUtils;

/* compiled from: CustomSearchBar.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a¡\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"CustomSearchBar", "", "value", "", "onValueChange", "Lkotlin/Function1;", "onBack", "Lkotlin/Function0;", "onSearch", "onClear", "modifier", "Landroidx/compose/ui/Modifier;", "isInEditFav", "", "compact", "onExpandedStateChanged", "onSearchButtonClick", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_release", "isSearchExpanded"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomSearchBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomSearchBar$lambda$13(String str, Function1 function1, Function0 function0, Function1 function12, Function0 function02, Modifier modifier, boolean z, boolean z2, Function1 function13, Function0 function03, int i, int i2, Composer composer, int i3) {
        CustomSearchBar(str, function1, function0, function12, function02, modifier, z, z2, function13, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CustomSearchBar(final String value, final Function1<? super String, Unit> onValueChange, final Function0<Unit> onBack, final Function1<? super String, Unit> onSearch, final Function0<Unit> onClear, Modifier modifier, boolean z, boolean z2, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        float m7774constructorimpl;
        float m7774constructorimpl2;
        CustomSearchBarKt$CustomSearchBar$2$1 customSearchBarKt$CustomSearchBar$2$1;
        final MutableState mutableState;
        Composer composer2;
        int i4;
        int i5;
        float f;
        Composer composer3;
        FocusManager focusManager;
        boolean z3;
        final boolean z4;
        final Function1<? super Boolean, Unit> function12;
        final boolean z5;
        final Function0<Unit> function02;
        int i6;
        int i7;
        float f2;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onSearch, "onSearch");
        Intrinsics.checkNotNullParameter(onClear, "onClear");
        Composer startRestartGroup = composer.startRestartGroup(943380910);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onBack) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onSearch) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(onClear) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
        }
        int i9 = i2 & 64;
        if (i9 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changed(z) ? 1048576 : 524288;
        }
        int i10 = i2 & 128;
        if (i10 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        int i11 = i2 & 256;
        if (i11 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
        }
        int i12 = i2 & 512;
        if (i12 != 0) {
            i3 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
        }
        if ((i3 & 306783379) != 306783378 || !startRestartGroup.getSkipping()) {
            if (i8 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            boolean z6 = i9 != 0 ? false : z;
            boolean z7 = i10 != 0 ? false : z2;
            Function1<? super Boolean, Unit> function13 = i11 != 0 ? null : function1;
            Function0<Unit> function03 = i12 != 0 ? null : function0;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(943380910, i3, -1, "org.betup.ui.fragment.matches.compose.CustomSearchBar (CustomSearchBar.kt:56)");
            }
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final FocusManager focusManager2 = (FocusManager) consume;
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(value.length() > 0), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            if (z7) {
                m7774constructorimpl = BattleFlowDimens.INSTANCE.m13179getSearchBarHeightD9Ej5fM();
            } else {
                m7774constructorimpl = Dp.m7774constructorimpl(36);
            }
            float f3 = m7774constructorimpl;
            long m13178getSearchBarFontXSAIIZE = z7 ? BattleFlowDimens.INSTANCE.m13178getSearchBarFontXSAIIZE() : TextUnitKt.getSp(16);
            if (z7) {
                m7774constructorimpl2 = BattleFlowDimens.INSTANCE.m13180getSearchBarIconD9Ej5fM();
            } else {
                m7774constructorimpl2 = Dp.m7774constructorimpl(24);
            }
            startRestartGroup.startReplaceGroup(-1633490746);
            int i13 = i3 & 14;
            boolean z8 = i13 == 4;
            CustomSearchBarKt$CustomSearchBar$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (z8 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new CustomSearchBarKt$CustomSearchBar$1$1(value, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(value, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i13);
            Boolean valueOf = Boolean.valueOf(CustomSearchBar$lambda$1(mutableState2));
            startRestartGroup.startReplaceGroup(-1633490746);
            boolean z9 = (234881024 & i3) == 67108864;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                customSearchBarKt$CustomSearchBar$2$1 = new CustomSearchBarKt$CustomSearchBar$2$1(function13, mutableState2, null);
                startRestartGroup.updateRememberedValue(customSearchBarKt$CustomSearchBar$2$1);
            } else {
                customSearchBarKt$CustomSearchBar$2$1 = rememberedValue3;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) customSearchBarKt$CustomSearchBar$2$1, startRestartGroup, 0);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            Function1<? super Boolean, Unit> function14 = function13;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier3 = modifier2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (z6) {
                startRestartGroup.startReplaceGroup(-1392160521);
                if (value.length() > 0) {
                    Painter painterResource = PainterResources_androidKt.painterResource(z6 ? R.drawable.new_close_ic : R.drawable.arrow_light_left, startRestartGroup, 0);
                    String stringResource = StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6);
                    long j = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                    Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl2);
                    startRestartGroup.startReplaceGroup(5004770);
                    boolean z10 = (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256;
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (z10 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.CustomSearchBarKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit CustomSearchBar$lambda$12$lambda$6$lambda$5;
                                CustomSearchBar$lambda$12$lambda$6$lambda$5 = CustomSearchBarKt.CustomSearchBar$lambda$12$lambda$6$lambda$5(Function0.this);
                                return CustomSearchBar$lambda$12$lambda$6$lambda$5;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs, false, null, null, (Function0) rememberedValue4, 7, null);
                    i7 = i3;
                    mutableState = mutableState2;
                    i6 = i13;
                    f2 = m7774constructorimpl2;
                    composer2 = startRestartGroup;
                    IconKt.m3077Iconww6aTOc(painterResource, stringResource, m1059clickableXHw0xAI$default, j, startRestartGroup, 0, 0);
                } else {
                    i6 = i13;
                    mutableState = mutableState2;
                    i7 = i3;
                    f2 = m7774constructorimpl2;
                    composer2 = startRestartGroup;
                }
                composer2.endReplaceGroup();
                i4 = i7;
                f = f2;
                i5 = i6;
            } else {
                mutableState = mutableState2;
                int i14 = i3;
                float f4 = m7774constructorimpl2;
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-1391444390);
                Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, composer2, 6);
                String stringResource2 = StringResources_androidKt.stringResource(R.string.cd_back, composer2, 6);
                long j2 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                Modifier m1563size3ABfNKs2 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f4);
                composer2.startReplaceGroup(-1224400529);
                i4 = i14;
                boolean changedInstance = (i13 == 4) | ((57344 & i4) == 16384) | composer2.changedInstance(focusManager2) | ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                Object rememberedValue5 = composer2.rememberedValue();
                if (changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.CustomSearchBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit CustomSearchBar$lambda$12$lambda$8$lambda$7;
                            CustomSearchBar$lambda$12$lambda$8$lambda$7 = CustomSearchBarKt.CustomSearchBar$lambda$12$lambda$8$lambda$7(value, onClear, focusManager2, onBack, mutableState);
                            return CustomSearchBar$lambda$12$lambda$8$lambda$7;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                composer2.endReplaceGroup();
                i5 = i13;
                f = f4;
                IconKt.m3077Iconww6aTOc(painterResource2, stringResource2, ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs2, false, null, null, (Function0) rememberedValue5, 7, null), j2, composer2, 0, 0);
                composer2.endReplaceGroup();
            }
            Modifier weight = rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, false);
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean z11 = false;
            composer3 = composer2;
            int i15 = i5;
            AnimatedVisibilityKt.AnimatedVisibility(rowScopeInstance, CustomSearchBar$lambda$1(mutableState), (Modifier) null, EnterExitTransitionKt.expandHorizontally$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), Alignment.INSTANCE.getStart(), false, null, 12, null), EnterExitTransitionKt.shrinkHorizontally$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), Alignment.INSTANCE.getStart(), false, null, 12, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-433371860, true, new CustomSearchBarKt$CustomSearchBar$3$3$1(z6, value, f3, m13178getSearchBarFontXSAIIZE, z7, focusManager2, onSearch, onValueChange, onClear), composer3, 54), composer3, 1600518, 18);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer3, 6);
            Painter painterResource3 = PainterResources_androidKt.painterResource(R.drawable.ic_search, composer3, 6);
            String stringResource3 = StringResources_androidKt.stringResource(R.string.cd_search, composer3, 6);
            long j3 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
            Modifier m1563size3ABfNKs3 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f);
            composer3.startReplaceGroup(-1224400529);
            if ((1879048192 & i4) == 536870912) {
                focusManager = focusManager2;
                z3 = true;
            } else {
                focusManager = focusManager2;
                z3 = false;
            }
            boolean changedInstance2 = z3 | composer3.changedInstance(focusManager) | ((i4 & 7168) == 2048);
            if (i15 == 4) {
                z11 = true;
            }
            boolean z12 = changedInstance2 | z11;
            Object rememberedValue6 = composer3.rememberedValue();
            if (z12 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                final Function0<Unit> function04 = function03;
                final FocusManager focusManager3 = focusManager;
                final MutableState mutableState3 = mutableState;
                rememberedValue6 = new Function0() { // from class: org.betup.ui.fragment.matches.compose.CustomSearchBarKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit CustomSearchBar$lambda$12$lambda$11$lambda$10;
                        CustomSearchBar$lambda$12$lambda$11$lambda$10 = CustomSearchBarKt.CustomSearchBar$lambda$12$lambda$11$lambda$10(Function0.this, focusManager3, onSearch, value, mutableState3);
                        return CustomSearchBar$lambda$12$lambda$11$lambda$10;
                    }
                };
                composer3.updateRememberedValue(rememberedValue6);
            }
            composer3.endReplaceGroup();
            IconKt.m3077Iconww6aTOc(painterResource3, stringResource3, ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs3, false, null, null, (Function0) rememberedValue6, 7, null), j3, composer3, 0, 0);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z6;
            modifier2 = modifier3;
            function12 = function14;
            z5 = z7;
            function02 = function03;
        } else {
            startRestartGroup.skipToGroupEnd();
            z4 = z;
            function12 = function1;
            function02 = function0;
            composer3 = startRestartGroup;
            z5 = z2;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.compose.CustomSearchBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CustomSearchBar$lambda$13;
                    CustomSearchBar$lambda$13 = CustomSearchBarKt.CustomSearchBar$lambda$13(value, onValueChange, onBack, onSearch, onClear, modifier2, z4, z5, function12, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return CustomSearchBar$lambda$13;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CustomSearchBar$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CustomSearchBar$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomSearchBar$lambda$12$lambda$6$lambda$5(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomSearchBar$lambda$12$lambda$8$lambda$7(String str, Function0 function0, FocusManager focusManager, Function0 function02, MutableState mutableState) {
        if (CustomSearchBar$lambda$1(mutableState) && str.length() > 0) {
            function0.invoke();
            FocusManager.clearFocus$default(focusManager, false, 1, null);
        } else if (CustomSearchBar$lambda$1(mutableState)) {
            CustomSearchBar$lambda$2(mutableState, false);
            FocusManager.clearFocus$default(focusManager, false, 1, null);
        } else {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomSearchBar$lambda$12$lambda$11$lambda$10(Function0 function0, FocusManager focusManager, Function1 function1, String str, MutableState mutableState) {
        if (function0 != null) {
            function0.invoke();
        } else if (CustomSearchBar$lambda$1(mutableState)) {
            FocusManager.clearFocus$default(focusManager, false, 1, null);
            function1.invoke(str);
        } else {
            CustomSearchBar$lambda$2(mutableState, true);
        }
        return Unit.INSTANCE;
    }
}
