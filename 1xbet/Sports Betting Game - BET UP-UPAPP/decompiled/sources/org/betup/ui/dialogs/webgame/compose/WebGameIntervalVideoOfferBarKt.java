package org.betup.ui.dialogs.webgame.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.common.compose.VideoRewardButtonKt;

/* compiled from: WebGameIntervalVideoOfferBar.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"WebGameIntervalVideoOfferBar", "", "isEnabled", "", "amount", "", "onWatchClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZJLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebGameIntervalVideoOfferBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebGameIntervalVideoOfferBar$lambda$0(boolean z, long j, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        WebGameIntervalVideoOfferBar(z, j, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WebGameIntervalVideoOfferBar(final boolean z, final long j, final Function0<Unit> onWatchClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onWatchClick, "onWatchClick");
        Composer startRestartGroup = composer.startRestartGroup(-1425345778);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onWatchClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1425345778, i3, -1, "org.betup.ui.dialogs.webgame.compose.WebGameIntervalVideoOfferBar (WebGameIntervalVideoOfferBar.kt:15)");
                }
                VideoRewardButtonKt.VideoRewardButton(z, j, onWatchClick, PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(8)), startRestartGroup, i3 & 1022, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.webgame.compose.WebGameIntervalVideoOfferBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit WebGameIntervalVideoOfferBar$lambda$0;
                        WebGameIntervalVideoOfferBar$lambda$0 = WebGameIntervalVideoOfferBarKt.WebGameIntervalVideoOfferBar$lambda$0(z, j, onWatchClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return WebGameIntervalVideoOfferBar$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        VideoRewardButtonKt.VideoRewardButton(z, j, onWatchClick, PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(8)), startRestartGroup, i3 & 1022, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
