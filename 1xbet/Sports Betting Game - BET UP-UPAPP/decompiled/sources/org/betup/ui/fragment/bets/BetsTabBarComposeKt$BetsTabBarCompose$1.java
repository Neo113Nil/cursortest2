package org.betup.ui.fragment.bets;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.ui.common.compose.BetsTabButtonKt;

/* compiled from: BetsTabBarCompose.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BetsTabBarComposeKt$BetsTabBarCompose$1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ long $maxFontSize;
    final /* synthetic */ long $minFontSize;
    final /* synthetic */ Function1<Integer, Unit> $onTabSelected;
    final /* synthetic */ int $selectedIndex;
    final /* synthetic */ boolean $showLiveIndicator;
    final /* synthetic */ float $spacing;
    final /* synthetic */ List<String> $tabs;

    /* JADX WARN: Multi-variable type inference failed */
    BetsTabBarComposeKt$BetsTabBarCompose$1(List<String> list, float f, long j, long j2, float f2, boolean z, int i, Function1<? super Integer, Unit> function1) {
        this.$tabs = list;
        this.$spacing = f;
        this.$maxFontSize = j;
        this.$minFontSize = j2;
        this.$horizontalPadding = f2;
        this.$showLiveIndicator = z;
        this.$selectedIndex = i;
        this.$onTabSelected = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6$lambda$5$lambda$4(Function1 function1, int i) {
        function1.invoke(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        Object next;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        int i2 = (i & 6) == 0 ? i | (composer.changed(BoxWithConstraints) ? 4 : 2) : i;
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1744925005, i2, -1, "org.betup.ui.fragment.bets.BetsTabBarCompose.<anonymous> (BetsTabBarCompose.kt:36)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        float m7774constructorimpl = Dp.m7774constructorimpl(Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() - Dp.m7774constructorimpl(this.$spacing * (r4 - 1))) / this.$tabs.size());
        Iterator<T> it = this.$tabs.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = ((String) next).length();
                do {
                    Object next2 = it.next();
                    int length2 = ((String) next2).length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        String str = (String) next;
        if (str == null) {
            str = "";
        }
        float mo1423getMaxWidthD9Ej5fM = BoxWithConstraints.mo1423getMaxWidthD9Ej5fM();
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(mo1423getMaxWidthD9Ej5fM) | composer.changed(this.$tabs);
        long j = this.$maxFontSize;
        long j2 = this.$minFontSize;
        float f = this.$horizontalPadding;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            long j3 = j;
            boolean z = false;
            while (true) {
                TextUnitKt.m7982checkArithmeticNB67dxo(j3, j2);
                if (Float.compare(TextUnit.m7968getValueimpl(j3), TextUnit.m7968getValueimpl(j2)) < 0 || z) {
                    break;
                }
                float f2 = m7774constructorimpl;
                z = ((TextUnit.m7968getValueimpl(j3) * 0.6f) * density.mo1166toPxR2X_6o(TextUnitKt.getSp(1))) * ((float) str.length()) <= density.mo1167toPx0680j_4(Dp.m7774constructorimpl(f2 - Dp.m7774constructorimpl(((float) 2) * f)));
                if (!z) {
                    j3 = TextUnitKt.getSp(TextUnit.m7968getValueimpl(j3) - 0.5d);
                }
                m7774constructorimpl = f2;
            }
            TextUnitKt.m7982checkArithmeticNB67dxo(j3, j2);
            if (Float.compare(TextUnit.m7968getValueimpl(j3), TextUnit.m7968getValueimpl(j2)) >= 0) {
                j2 = j3;
            }
            rememberedValue = TextUnit.m7958boximpl(j2);
            composer.updateRememberedValue(rememberedValue);
        }
        long packedValue = ((TextUnit) rememberedValue).getPackedValue();
        composer.endReplaceGroup();
        Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(0), 0.0f, 2, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(this.$spacing);
        List<String> list = this.$tabs;
        boolean z2 = this.$showLiveIndicator;
        int i3 = this.$selectedIndex;
        final Function1<Integer, Unit> function1 = this.$onTabSelected;
        float f3 = this.$horizontalPadding;
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1518paddingVpY3zN4$default);
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
        composer.startReplaceGroup(1214200060);
        final int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            boolean z3 = z2 && i4 == 1 && StringsKt.contains((CharSequence) str2, (CharSequence) "Live", true);
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            boolean z4 = i3 == i4;
            composer.startReplaceGroup(-1633490746);
            boolean changed2 = composer.changed(function1) | composer.changed(i4);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.BetsTabBarComposeKt$BetsTabBarCompose$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$7$lambda$6$lambda$5$lambda$4;
                        invoke$lambda$7$lambda$6$lambda$5$lambda$4 = BetsTabBarComposeKt$BetsTabBarCompose$1.invoke$lambda$7$lambda$6$lambda$5$lambda$4(Function1.this, i4);
                        return invoke$lambda$7$lambda$6$lambda$5$lambda$4;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            BetsTabButtonKt.m12904BetsTabButton0G6YeNA(weight$default, str2, (Function0) rememberedValue2, z4, packedValue, f3, false, z3, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 64);
            function1 = function1;
            z2 = z2;
            f3 = f3;
            i4 = i5;
            i3 = i3;
        }
        composer.endReplaceGroup();
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
