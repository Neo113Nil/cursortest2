package org.betup.ui.fragment.matches.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: DateSelectorElement.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DateSelectorElementKt$DateSelectorElement$1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ List<Pair<String, String>> $dates;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Function1<String, Unit> $onDateSelected;
    final /* synthetic */ String $selectedDate;

    /* JADX WARN: Multi-variable type inference failed */
    DateSelectorElementKt$DateSelectorElement$1(String str, List<Pair<String, String>> list, LazyListState lazyListState, Function1<? super String, Unit> function1) {
        this.$selectedDate = str;
        this.$dates = list;
        this.$listState = lazyListState;
        this.$onDateSelected = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
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
            ComposerKt.traceEventStart(-85441561, i2, -1, "org.betup.ui.fragment.matches.compose.DateSelectorElement.<anonymous> (DateSelectorElement.kt:61)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume;
        float mo1164toDpu2uoSUM = density.mo1164toDpu2uoSUM(RangesKt.coerceAtLeast((density.mo1161roundToPx0680j_4(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM()) - density.mo1161roundToPx0680j_4(Dp.m7774constructorimpl(96))) / 2, 0));
        String str = this.$selectedDate;
        composer.startReplaceGroup(-1224400529);
        boolean changedInstance = composer.changedInstance(this.$dates) | composer.changed(this.$selectedDate) | composer.changed(this.$listState);
        List<Pair<String, String>> list = this.$dates;
        LazyListState lazyListState = this.$listState;
        String str2 = this.$selectedDate;
        DateSelectorElementKt$DateSelectorElement$1$1$1 rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new DateSelectorElementKt$DateSelectorElement$1$1$1(list, lazyListState, 0, str2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, composer, 0);
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        PaddingValues m1513PaddingValuesa9UjIt4$default = PaddingKt.m1513PaddingValuesa9UjIt4$default(mo1164toDpu2uoSUM, 0.0f, mo1164toDpu2uoSUM, 0.0f, 10, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(16));
        LazyListState lazyListState2 = this.$listState;
        Arrangement.HorizontalOrVertical horizontalOrVertical = m1397spacedBy0680j_4;
        composer.startReplaceGroup(-1746271574);
        boolean changedInstance2 = composer.changedInstance(this.$dates) | composer.changed(this.$selectedDate) | composer.changed(this.$onDateSelected);
        final List<Pair<String, String>> list2 = this.$dates;
        final String str3 = this.$selectedDate;
        final Function1<String, Unit> function1 = this.$onDateSelected;
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.matches.compose.DateSelectorElementKt$DateSelectorElement$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = DateSelectorElementKt$DateSelectorElement$1.invoke$lambda$7$lambda$6(list2, str3, function1, (LazyListScope) obj);
                    return invoke$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyRow(fillMaxWidth$default, lazyListState2, m1513PaddingValuesa9UjIt4$default, false, horizontalOrVertical, null, null, false, null, (Function1) rememberedValue2, composer, 24582, 488);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(final List list, final String str, final Function1 function1, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyRow.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.matches.compose.DateSelectorElementKt$DateSelectorElement$1$invoke$lambda$7$lambda$6$$inlined$itemsIndexed$default$2
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
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.matches.compose.DateSelectorElementKt$DateSelectorElement$1$invoke$lambda$7$lambda$6$$inlined$itemsIndexed$default$3
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
                boolean z;
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
                Pair pair = (Pair) list.get(i);
                composer.startReplaceGroup(297628981);
                final String str2 = (String) pair.component1();
                String str3 = (String) pair.component2();
                try {
                    z = LocalDate.parse(str2).compareTo((ChronoLocalDate) LocalDate.now()) < 0;
                } catch (Exception unused) {
                    z = false;
                }
                boolean areEqual = Intrinsics.areEqual(str2, str);
                composer.startReplaceGroup(-1633490746);
                boolean changed = composer.changed(function1) | composer.changed(str2);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.matches.compose.DateSelectorElementKt$DateSelectorElement$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(str2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                DateSelectorElementKt.DateItem(str2, str3, areEqual, z, (Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
