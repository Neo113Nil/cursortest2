package org.betup.ui.fragment.home.compose;

import android.content.Context;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouter;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.remote.entity.analytics.HomeMatchAd;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: HomeMatchAdCard.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"HomeMatchAdCard", "", "ad", "Lorg/betup/model/remote/entity/analytics/HomeMatchAd;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/model/remote/entity/analytics/HomeMatchAd;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeMatchAdCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMatchAdCard$lambda$1(HomeMatchAd homeMatchAd, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeMatchAdCard(homeMatchAd, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeMatchAdCard(final HomeMatchAd ad, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        String name;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-859246111);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(ad) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-859246111, i3, -1, "org.betup.ui.fragment.home.compose.HomeMatchAdCard (HomeMatchAdCard.kt:25)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(12));
                ImageRequest build = ImageRequests_androidKt.allowHardware(new ImageRequest.Builder((Context) consume).data(ad.getImageUrl()), false).build();
                name = ad.getName();
                if (StringsKt.isBlank(name)) {
                    name = ad.getLinkName();
                }
                RoundedCornerShape roundedCornerShape = m1810RoundedCornerShape0680j_4;
                Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(build, name, SizeKt.fillMaxHeight$default(ClickAnimationModifierKt.subtleClickAnimation(BorderKt.m1036borderxT4_qwU(ClipKt.clip(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(modifier4, Dp.m7774constructorimpl(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED)), Dp.m7774constructorimpl(Opcodes.LCMP)), roundedCornerShape), Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.ScreenBorder.INSTANCE.getColor(), roundedCornerShape), onClick, null, true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i3 & 112) | 3072, 0, 1018), 0.0f, 1, null), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, composer2, 1572864, 0, 1976);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.home.compose.HomeMatchAdCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HomeMatchAdCard$lambda$1;
                        HomeMatchAdCard$lambda$1 = HomeMatchAdCardKt.HomeMatchAdCard$lambda$1(HomeMatchAd.this, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return HomeMatchAdCard$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(12));
        ImageRequest build2 = ImageRequests_androidKt.allowHardware(new ImageRequest.Builder((Context) consume2).data(ad.getImageUrl()), false).build();
        name = ad.getName();
        if (StringsKt.isBlank(name)) {
        }
        RoundedCornerShape roundedCornerShape2 = m1810RoundedCornerShape0680j_42;
        Modifier modifier52 = modifier4;
        composer2 = startRestartGroup;
        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(build2, name, SizeKt.fillMaxHeight$default(ClickAnimationModifierKt.subtleClickAnimation(BorderKt.m1036borderxT4_qwU(ClipKt.clip(SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(modifier4, Dp.m7774constructorimpl(MediaRouter.GlobalMediaRouter.CallbackHandler.MSG_ROUTE_VOLUME_CHANGED)), Dp.m7774constructorimpl(Opcodes.LCMP)), roundedCornerShape2), Dp.m7774constructorimpl(1), ComposeUtils.AppColorPalette.ScreenBorder.INSTANCE.getColor(), roundedCornerShape2), onClick, null, true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i3 & 112) | 3072, 0, 1018), 0.0f, 1, null), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, composer2, 1572864, 0, 1976);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
