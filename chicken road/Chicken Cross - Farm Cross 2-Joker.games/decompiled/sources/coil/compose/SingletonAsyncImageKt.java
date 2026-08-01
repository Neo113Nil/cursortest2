package coil.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.AsyncImagePainter;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: SingletonAsyncImage.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0095\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aÓ\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"AsyncImage", "", "model", "", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "AsyncImage-3HmZ8SU", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V", "placeholder", "Landroidx/compose/ui/graphics/painter/Painter;", "error", "fallback", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Loading;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Success;", "onError", "Lcoil/compose/AsyncImagePainter$State$Error;", "AsyncImage-ylYTKUw", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "coil-compose-singleton_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class SingletonAsyncImageKt {
    /* renamed from: AsyncImage-ylYTKUw, reason: not valid java name */
    public static final void m4331AsyncImageylYTKUw(final Object obj, final String str, Modifier modifier, Painter painter, Painter painter2, Painter painter3, Function1<? super AsyncImagePainter.State.Loading, Unit> function1, Function1<? super AsyncImagePainter.State.Success, Unit> function12, Function1<? super AsyncImagePainter.State.Error, Unit> function13, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Composer composer, final int i2, final int i3, final int i4) {
        Painter painter4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(2027616330);
        ComposerKt.sourceInformation(startRestartGroup, "C(AsyncImage)P(8,3,9,13,5,6,11,12,10!1,4!,7:c#ui.graphics.FilterQuality)");
        final Modifier modifier2 = (i4 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Painter painter5 = (i4 & 8) != 0 ? null : painter;
        Painter painter6 = (i4 & 16) != 0 ? null : painter2;
        if ((i4 & 32) != 0) {
            i5 = i2 & (-458753);
            painter4 = painter6;
        } else {
            painter4 = painter3;
            i5 = i2;
        }
        Function1<? super AsyncImagePainter.State.Loading, Unit> function14 = (i4 & 64) != 0 ? null : function1;
        Function1<? super AsyncImagePainter.State.Success, Unit> function15 = (i4 & 128) != 0 ? null : function12;
        Function1<? super AsyncImagePainter.State.Error, Unit> function16 = (i4 & 256) != 0 ? null : function13;
        Alignment center = (i4 & 512) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i4 & 1024) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i4 & 2048) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 4096) != 0 ? null : colorFilter;
        if ((i4 & 8192) != 0) {
            i7 = i3 & (-7169);
            i6 = DrawScope.INSTANCE.m2124getDefaultFilterQualityfv9h1I();
        } else {
            i6 = i;
            i7 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2027616330, i5, i7, "coil.compose.AsyncImage (SingletonAsyncImage.kt:43)");
        }
        int i8 = i5 << 3;
        int i9 = i7 << 3;
        AsyncImageKt.m4304AsyncImageQ4Kwu38(obj, str, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), startRestartGroup, 6), modifier2, painter5, painter6, painter4, function14, function15, function16, center, fit, f2, colorFilter2, i6, startRestartGroup, (i5 & 112) | 2392584 | (i8 & 7168) | (29360128 & i8) | (234881024 & i8) | (1879048192 & i8), ((i5 >> 27) & 14) | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (i9 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Painter painter7 = painter5;
        final Painter painter8 = painter6;
        final Painter painter9 = painter4;
        final Function1<? super AsyncImagePainter.State.Loading, Unit> function17 = function14;
        final Function1<? super AsyncImagePainter.State.Success, Unit> function18 = function15;
        final Function1<? super AsyncImagePainter.State.Error, Unit> function19 = function16;
        final Alignment alignment2 = center;
        final ContentScale contentScale2 = fit;
        final float f3 = f2;
        final ColorFilter colorFilter3 = colorFilter2;
        final int i10 = i6;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: coil.compose.SingletonAsyncImageKt$AsyncImage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i11) {
                SingletonAsyncImageKt.m4331AsyncImageylYTKUw(obj, str, modifier2, painter7, painter8, painter9, function17, function18, function19, alignment2, contentScale2, f3, colorFilter3, i10, composer2, i2 | 1, i3, i4);
            }
        });
    }

    /* renamed from: AsyncImage-3HmZ8SU, reason: not valid java name */
    public static final void m4330AsyncImage3HmZ8SU(final Object obj, final String str, Modifier modifier, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, Function1<? super AsyncImagePainter.State, Unit> function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Composer composer, final int i2, final int i3) {
        Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function13;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-941517612);
        ComposerKt.sourceInformation(startRestartGroup, "C(AsyncImage)P(6,3,7,9,8!1,4!,5:c#ui.graphics.FilterQuality)");
        final Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        if ((i3 & 8) != 0) {
            i4 = i2 & (-7169);
            function13 = AsyncImagePainter.INSTANCE.getDefaultTransform();
        } else {
            function13 = function1;
            i4 = i2;
        }
        Function1<? super AsyncImagePainter.State, Unit> function14 = (i3 & 16) != 0 ? null : function12;
        Alignment center = (i3 & 32) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i3 & 64) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i3 & 128) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i3 & 256) != 0 ? null : colorFilter;
        if ((i3 & 512) != 0) {
            i4 &= -1879048193;
            i5 = DrawScope.INSTANCE.m2124getDefaultFilterQualityfv9h1I();
        } else {
            i5 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-941517612, i4, -1, "coil.compose.AsyncImage (SingletonAsyncImage.kt:99)");
        }
        int i6 = i4 << 3;
        AsyncImageKt.m4303AsyncImageMvsnxeU(obj, str, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), startRestartGroup, 6), modifier2, function13, function14, center, fit, f2, colorFilter2, i5, startRestartGroup, (i4 & 112) | IronSourceError.ERROR_NO_INTERNET_CONNECTION | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192), (i4 >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function15 = function13;
        final Function1<? super AsyncImagePainter.State, Unit> function16 = function14;
        final Alignment alignment2 = center;
        final ContentScale contentScale2 = fit;
        final float f3 = f2;
        final ColorFilter colorFilter3 = colorFilter2;
        final int i7 = i5;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: coil.compose.SingletonAsyncImageKt$AsyncImage$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                SingletonAsyncImageKt.m4330AsyncImage3HmZ8SU(obj, str, modifier2, function15, function16, alignment2, contentScale2, f3, colorFilter3, i7, composer2, i2 | 1, i3);
            }
        });
    }
}
