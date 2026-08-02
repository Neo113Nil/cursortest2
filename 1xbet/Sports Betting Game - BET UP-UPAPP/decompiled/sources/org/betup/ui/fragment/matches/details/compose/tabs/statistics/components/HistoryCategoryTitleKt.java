package org.betup.ui.fragment.matches.details.compose.tabs.statistics.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.views.ComposeUtils;

/* compiled from: HistoryCategoryTitle.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"HistoryCategoryTitle", "", "title", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewHistoryCategoryTitle", "(Landroidx/compose/runtime/Composer;I)V", "PreviewHistoryCategoryTitleLong", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HistoryCategoryTitleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HistoryCategoryTitle$lambda$0(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HistoryCategoryTitle(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewHistoryCategoryTitle$lambda$1(int i, Composer composer, int i2) {
        PreviewHistoryCategoryTitle(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewHistoryCategoryTitleLong$lambda$2(int i, Composer composer, int i2) {
        PreviewHistoryCategoryTitleLong(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HistoryCategoryTitle(final String title, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer startRestartGroup = composer.startRestartGroup(-1102437206);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1102437206, i3, -1, "org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.HistoryCategoryTitle (HistoryCategoryTitle.kt:23)");
                }
                composer2 = startRestartGroup;
                TextKt.m3621Text4IGK_g(title, SizeKt.fillMaxWidth$default(PaddingKt.m1520paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(16), 7, null), 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer2, i3 & 14, 0, 65532);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.HistoryCategoryTitleKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HistoryCategoryTitle$lambda$0;
                        HistoryCategoryTitle$lambda$0 = HistoryCategoryTitleKt.HistoryCategoryTitle$lambda$0(title, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return HistoryCategoryTitle$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        TextKt.m3621Text4IGK_g(title, SizeKt.fillMaxWidth$default(PaddingKt.m1520paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(16), 7, null), 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), composer2, i3 & 14, 0, 65532);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void PreviewHistoryCategoryTitle(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-899552288);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-899552288, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.PreviewHistoryCategoryTitle (HistoryCategoryTitle.kt:42)");
            }
            HistoryCategoryTitle("Previous meetings", PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.HistoryCategoryTitleKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewHistoryCategoryTitle$lambda$1;
                    PreviewHistoryCategoryTitle$lambda$1 = HistoryCategoryTitleKt.PreviewHistoryCategoryTitle$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewHistoryCategoryTitle$lambda$1;
                }
            });
        }
    }

    public static final void PreviewHistoryCategoryTitleLong(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1720123004);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1720123004, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.PreviewHistoryCategoryTitleLong (HistoryCategoryTitle.kt:54)");
            }
            HistoryCategoryTitle("Recent games (Stade Brestois 29)", PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.HistoryCategoryTitleKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewHistoryCategoryTitleLong$lambda$2;
                    PreviewHistoryCategoryTitleLong$lambda$2 = HistoryCategoryTitleKt.PreviewHistoryCategoryTitleLong$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewHistoryCategoryTitleLong$lambda$2;
                }
            });
        }
    }
}
