package org.betup.ui.fragment.bets;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BetsTabBarCompose.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"BetsTabBarCompose", "", "modifier", "Landroidx/compose/ui/Modifier;", "selectedIndex", "", "onTabSelected", "Lkotlin/Function1;", "tabs", "", "", "showLiveIndicator", "", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Ljava/util/List;ZLandroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetsTabBarComposeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetsTabBarCompose$lambda$0(Modifier modifier, int i, Function1 function1, List list, boolean z, int i2, int i3, Composer composer, int i4) {
        BetsTabBarCompose(modifier, i, function1, list, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetsTabBarCompose(Modifier modifier, final int i, final Function1<? super Integer, Unit> onTabSelected, final List<String> tabs, boolean z, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        final boolean z2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer startRestartGroup = composer.startRestartGroup(2015894647);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(onTabSelected) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(tabs) ? 2048 : 1024;
        }
        int i6 = i3 & 16;
        if (i6 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            z2 = z;
            i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
            if ((i4 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                boolean z3 = i6 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2015894647, i4, -1, "org.betup.ui.fragment.bets.BetsTabBarCompose (BetsTabBarCompose.kt:29)");
                }
                Modifier modifier5 = modifier4;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1744925005, true, new BetsTabBarComposeKt$BetsTabBarCompose$1(tabs, Dp.m7774constructorimpl(12), TextUnitKt.getSp(12), TextUnitKt.getSp(8), Dp.m7774constructorimpl(8), z3, i, onTabSelected), startRestartGroup, 54), startRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z3;
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.BetsTabBarComposeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit BetsTabBarCompose$lambda$0;
                        BetsTabBarCompose$lambda$0 = BetsTabBarComposeKt.BetsTabBarCompose$lambda$0(Modifier.this, i, onTabSelected, tabs, z2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return BetsTabBarCompose$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if ((i4 & 9363) == 9362) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier52 = modifier4;
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1744925005, true, new BetsTabBarComposeKt$BetsTabBarCompose$1(tabs, Dp.m7774constructorimpl(12), TextUnitKt.getSp(12), TextUnitKt.getSp(8), Dp.m7774constructorimpl(8), z3, i, onTabSelected), startRestartGroup, 54), startRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        z2 = z3;
        modifier3 = modifier52;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
