package org.betup.ui.fragment.home.compose.matches;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeMatchesSectionLoadingRow.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"HomeMatchesSectionLoadingRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "placeholderCount", "", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeMatchesSectionLoadingRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchesSectionLoadingRow$lambda$3(Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        HomeMatchesSectionLoadingRow(modifier, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeMatchesSectionLoadingRow(Modifier modifier, int i, Composer composer, final int i2, final int i3) {
        final Modifier modifier2;
        int i4;
        final int i5;
        final int i6;
        boolean z;
        Object rememberedValue;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(957752774);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 32 : 16;
            if ((i4 & 19) == 18 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                i6 = i8 == 0 ? 3 : i5;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(957752774, i4, -1, "org.betup.ui.fragment.home.compose.matches.HomeMatchesSectionLoadingRow (HomeMatchesSectionLoadingRow.kt:13)");
                }
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(10));
                PaddingValues m1513PaddingValuesa9UjIt4$default = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m7774constructorimpl(4), 0.0f, 11, null);
                Arrangement.HorizontalOrVertical horizontalOrVertical = m1397spacedBy0680j_4;
                startRestartGroup.startReplaceGroup(5004770);
                z = (i4 & 112) != 32;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesSectionLoadingRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit HomeMatchesSectionLoadingRow$lambda$2$lambda$1;
                            HomeMatchesSectionLoadingRow$lambda$2$lambda$1 = HomeMatchesSectionLoadingRowKt.HomeMatchesSectionLoadingRow$lambda$2$lambda$1(i6, (LazyListScope) obj);
                            return HomeMatchesSectionLoadingRow$lambda$2$lambda$1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                int i9 = i6;
                composer2 = startRestartGroup;
                LazyDslKt.LazyRow(modifier3, null, m1513PaddingValuesa9UjIt4$default, false, horizontalOrVertical, null, null, false, null, (Function1) rememberedValue, startRestartGroup, (i4 & 14) | 24960, 490);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                i5 = i9;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesSectionLoadingRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HomeMatchesSectionLoadingRow$lambda$3;
                        HomeMatchesSectionLoadingRow$lambda$3 = HomeMatchesSectionLoadingRowKt.HomeMatchesSectionLoadingRow$lambda$3(Modifier.this, i5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return HomeMatchesSectionLoadingRow$lambda$3;
                    }
                });
                return;
            }
            return;
        }
        i5 = i;
        if ((i4 & 19) == 18) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(10));
        PaddingValues m1513PaddingValuesa9UjIt4$default2 = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m7774constructorimpl(4), 0.0f, 11, null);
        Arrangement.HorizontalOrVertical horizontalOrVertical2 = m1397spacedBy0680j_42;
        startRestartGroup.startReplaceGroup(5004770);
        if ((i4 & 112) != 32) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesSectionLoadingRowKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit HomeMatchesSectionLoadingRow$lambda$2$lambda$1;
                HomeMatchesSectionLoadingRow$lambda$2$lambda$1 = HomeMatchesSectionLoadingRowKt.HomeMatchesSectionLoadingRow$lambda$2$lambda$1(i6, (LazyListScope) obj);
                return HomeMatchesSectionLoadingRow$lambda$2$lambda$1;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        int i92 = i6;
        composer2 = startRestartGroup;
        LazyDslKt.LazyRow(modifier3, null, m1513PaddingValuesa9UjIt4$default2, false, horizontalOrVertical2, null, null, false, null, (Function1) rememberedValue, startRestartGroup, (i4 & 14) | 24960, 490);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3;
        i5 = i92;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchesSectionLoadingRow$lambda$2$lambda$1(int i, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyListScope.items$default(LazyRow, i, new Function1() { // from class: org.betup.ui.fragment.home.compose.matches.HomeMatchesSectionLoadingRowKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object HomeMatchesSectionLoadingRow$lambda$2$lambda$1$lambda$0;
                HomeMatchesSectionLoadingRow$lambda$2$lambda$1$lambda$0 = HomeMatchesSectionLoadingRowKt.HomeMatchesSectionLoadingRow$lambda$2$lambda$1$lambda$0(((Integer) obj).intValue());
                return HomeMatchesSectionLoadingRow$lambda$2$lambda$1$lambda$0;
            }
        }, null, ComposableSingletons$HomeMatchesSectionLoadingRowKt.INSTANCE.getLambda$1346981234$app_release(), 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object HomeMatchesSectionLoadingRow$lambda$2$lambda$1$lambda$0(int i) {
        return "loading_" + i;
    }
}
