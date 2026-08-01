package coil.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.SizeResolver;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* compiled from: SubcomposeAsyncImage.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a»\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u001c\u0010\u0018\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a¯\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2&\b\u0002\u0010\u001e\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2&\b\u0002\u0010!\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2&\b\u0002\u0010#\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a\u0095\u0001\u0010*\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2$\u0010\u001e\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2$\u0010!\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2$\u0010#\u001a \u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0003¢\u0006\u0002\u0010+\u001a[\u0010,\u001a\u00020\u0001*\u00020\u00192\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020.2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"SubcomposeAsyncImage", "", "model", "", "contentDescription", "", "imageLoader", "Lcoil/ImageLoader;", "modifier", "Landroidx/compose/ui/Modifier;", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "content", "Lcoil/compose/SubcomposeAsyncImageScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "SubcomposeAsyncImage-sKDTAoQ", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "loading", "Lkotlin/Function2;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "success", "Lcoil/compose/AsyncImagePainter$State$Success;", "error", "Lcoil/compose/AsyncImagePainter$State$Error;", "onLoading", "onSuccess", "onError", "SubcomposeAsyncImage-Q4Kwu38", "(Ljava/lang/Object;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "contentOf", "(Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;)Lkotlin/jvm/functions/Function3;", "SubcomposeAsyncImageContent", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Lcoil/compose/SubcomposeAsyncImageScope;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V", "coil-compose-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class SubcomposeAsyncImageKt {
    /* renamed from: SubcomposeAsyncImage-Q4Kwu38, reason: not valid java name */
    public static final void m4336SubcomposeAsyncImageQ4Kwu38(final Object obj, final String str, final ImageLoader imageLoader, Modifier modifier, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Loading, ? super Composer, ? super Integer, Unit> function4, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Success, ? super Composer, ? super Integer, Unit> function42, Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Error, ? super Composer, ? super Integer, Unit> function43, Function1<? super AsyncImagePainter.State.Loading, Unit> function1, Function1<? super AsyncImagePainter.State.Success, Unit> function12, Function1<? super AsyncImagePainter.State.Error, Unit> function13, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(934816934);
        ComposerKt.sourceInformation(startRestartGroup, "C(SubcomposeAsyncImage)P(9,3,7,10,8,14,5,12,13,11!1,4!,6:c#ui.graphics.FilterQuality)");
        final Modifier modifier2 = (i4 & 8) != 0 ? Modifier.INSTANCE : modifier;
        final Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Loading, ? super Composer, ? super Integer, Unit> function44 = (i4 & 16) != 0 ? null : function4;
        final Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Success, ? super Composer, ? super Integer, Unit> function45 = (i4 & 32) != 0 ? null : function42;
        final Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Error, ? super Composer, ? super Integer, Unit> function46 = (i4 & 64) != 0 ? null : function43;
        final Function1<? super AsyncImagePainter.State.Loading, Unit> function14 = (i4 & 128) != 0 ? null : function1;
        final Function1<? super AsyncImagePainter.State.Success, Unit> function15 = (i4 & 256) != 0 ? null : function12;
        final Function1<? super AsyncImagePainter.State.Error, Unit> function16 = (i4 & 512) != 0 ? null : function13;
        final Alignment center = (i4 & 1024) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        final ContentScale fit = (i4 & 2048) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        final float f2 = (i4 & 4096) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 8192) != 0 ? null : colorFilter;
        if ((i4 & 16384) != 0) {
            i6 = i3 & (-57345);
            i5 = DrawScope.INSTANCE.m2124getDefaultFilterQualityfv9h1I();
        } else {
            i5 = i;
            i6 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(934816934, i2, i6, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:49)");
        }
        int i7 = i6 << 18;
        m4337SubcomposeAsyncImagesKDTAoQ(obj, str, imageLoader, modifier2, null, UtilsKt.onStateOf(function14, function15, function16), center, fit, f2, colorFilter2, i5, contentOf(function44, function45, function46), startRestartGroup, (i2 & 112) | IronSourceError.ERROR_NO_INTERNET_CONNECTION | (i2 & 7168) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), (i6 >> 12) & 14, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final ColorFilter colorFilter3 = colorFilter2;
        final int i8 = i5;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImage$1
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

            public final void invoke(Composer composer2, int i9) {
                SubcomposeAsyncImageKt.m4336SubcomposeAsyncImageQ4Kwu38(obj, str, imageLoader, modifier2, function44, function45, function46, function14, function15, function16, center, fit, f2, colorFilter3, i8, composer2, i2 | 1, i3, i4);
            }
        });
    }

    /* renamed from: SubcomposeAsyncImage-sKDTAoQ, reason: not valid java name */
    public static final void m4337SubcomposeAsyncImagesKDTAoQ(final Object obj, final String str, final ImageLoader imageLoader, Modifier modifier, Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, Function1<? super AsyncImagePainter.State, Unit> function12, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, final Function3<? super SubcomposeAsyncImageScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(10937794);
        ComposerKt.sourceInformation(startRestartGroup, "C(SubcomposeAsyncImage)P(8,4,7,9,11,10!1,5!2,6:c#ui.graphics.FilterQuality)");
        Modifier modifier2 = (i4 & 8) != 0 ? Modifier.INSTANCE : modifier;
        Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> defaultTransform = (i4 & 16) != 0 ? AsyncImagePainter.INSTANCE.getDefaultTransform() : function1;
        Function1<? super AsyncImagePainter.State, Unit> function13 = (i4 & 32) != 0 ? null : function12;
        Alignment center = (i4 & 64) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i4 & 128) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i4 & 256) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 512) != 0 ? null : colorFilter;
        if ((i4 & 1024) != 0) {
            i5 = DrawScope.INSTANCE.m2124getDefaultFilterQualityfv9h1I();
            i6 = i3 & (-15);
        } else {
            i5 = i;
            i6 = i3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10937794, i2, i6, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:104)");
        }
        ImageRequest updateRequest = AsyncImageKt.updateRequest(UtilsKt.requestOf(obj, startRestartGroup, 8), fit, startRestartGroup, 8 | ((i2 >> 18) & 112));
        int i7 = i2 >> 6;
        int i8 = i2 >> 9;
        final int i9 = i6;
        final ContentScale contentScale2 = fit;
        final Alignment alignment2 = center;
        final AsyncImagePainter m4312rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m4312rememberAsyncImagePainter5jETZwI(updateRequest, imageLoader, defaultTransform, function13, fit, i5, startRestartGroup, (i7 & 7168) | (i7 & 896) | 72 | (i8 & 57344) | ((i6 << 15) & 458752), 0);
        final SizeResolver sizeResolver = updateRequest.getSizeResolver();
        if (!(sizeResolver instanceof ConstraintsSizeResolver)) {
            startRestartGroup.startReplaceableGroup(-247979203);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(alignment2, true, startRestartGroup, (((((i8 & 14) | 384) | ((i2 >> 15) & 112)) >> 3) & 14) | 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
            function3.invoke(new RealSubcomposeAsyncImageScope(BoxScopeInstance.INSTANCE, m4312rememberAsyncImagePainter5jETZwI, str, alignment2, contentScale2, f2, colorFilter2), startRestartGroup, Integer.valueOf(i9 & 112));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(-247978567);
            final float f3 = f2;
            final ColorFilter colorFilter3 = colorFilter2;
            BoxWithConstraintsKt.BoxWithConstraints(modifier2, alignment2, true, ComposableLambdaKt.composableLambda(startRestartGroup, -1964284792, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImage$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                    invoke(boxWithConstraintsScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, int i10) {
                    int i11;
                    if ((i10 & 14) == 0) {
                        i11 = (composer2.changed(boxWithConstraintsScope) ? 4 : 2) | i10;
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 91) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1964284792, i10, -1, "coil.compose.SubcomposeAsyncImage.<anonymous> (SubcomposeAsyncImage.kt:150)");
                        }
                        ((ConstraintsSizeResolver) SizeResolver.this).m4316setConstraintsBRTryo0(boxWithConstraintsScope.getConstraints());
                        function3.invoke(new RealSubcomposeAsyncImageScope(boxWithConstraintsScope, m4312rememberAsyncImagePainter5jETZwI, str, alignment2, contentScale2, f3, colorFilter3), composer2, Integer.valueOf(i9 & 112));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i8 & 14) | 3456 | ((i2 >> 15) & 112), 0);
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final Modifier modifier3 = modifier2;
        final Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function14 = defaultTransform;
        final Function1<? super AsyncImagePainter.State, Unit> function15 = function13;
        final float f4 = f2;
        final ColorFilter colorFilter4 = colorFilter2;
        final int i10 = i5;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImage$4
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
                SubcomposeAsyncImageKt.m4337SubcomposeAsyncImagesKDTAoQ(obj, str, imageLoader, modifier3, function14, function15, alignment2, contentScale2, f4, colorFilter4, i10, function3, composer2, i2 | 1, i3, i4);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubcomposeAsyncImageContent(final SubcomposeAsyncImageScope subcomposeAsyncImageScope, Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        Alignment alignment2;
        ContentScale contentScale2;
        float f2;
        ColorFilter colorFilter2;
        final AsyncImagePainter asyncImagePainter;
        String str3;
        Alignment alignment3;
        ContentScale contentScale3;
        float f3;
        int i5;
        float f4;
        ColorFilter colorFilter3;
        final float f5;
        final String str4;
        final Alignment alignment4;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-263982313);
        ComposerKt.sourceInformation(startRestartGroup, "C(SubcomposeAsyncImageContent)P(5,6,3!1,4)");
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(subcomposeAsyncImageScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 != 0) {
                i3 |= 128;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    str2 = str;
                    if (startRestartGroup.changed(str2)) {
                        i9 = 2048;
                        i3 |= i9;
                    }
                } else {
                    str2 = str;
                }
                i9 = 1024;
                i3 |= i9;
            } else {
                str2 = str;
            }
            if ((i & 57344) != 0) {
                if ((i2 & 16) == 0) {
                    alignment2 = alignment;
                    if (startRestartGroup.changed(alignment2)) {
                        i8 = 16384;
                        i3 |= i8;
                    }
                } else {
                    alignment2 = alignment;
                }
                i8 = 8192;
                i3 |= i8;
            } else {
                alignment2 = alignment;
            }
            if ((i & 458752) != 0) {
                if ((i2 & 32) == 0) {
                    contentScale2 = contentScale;
                    if (startRestartGroup.changed(contentScale2)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    contentScale2 = contentScale;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                contentScale2 = contentScale;
            }
            if ((i & 3670016) != 0) {
                f2 = f;
                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(f2)) ? 1048576 : 524288;
            } else {
                f2 = f;
            }
            if ((i & 29360128) != 0) {
                if ((i2 & 128) == 0) {
                    colorFilter2 = colorFilter;
                    if (startRestartGroup.changed(colorFilter2)) {
                        i6 = 8388608;
                        i3 |= i6;
                    }
                } else {
                    colorFilter2 = colorFilter;
                }
                i6 = 4194304;
                i3 |= i6;
            } else {
                colorFilter2 = colorFilter;
            }
            if (i4 == 2 || (23967451 & i3) != 4793490 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 == 0) {
                        asyncImagePainter = subcomposeAsyncImageScope.getPainter();
                        i3 &= -897;
                    } else {
                        asyncImagePainter = painter;
                    }
                    if ((i2 & 4) == 0) {
                        str3 = subcomposeAsyncImageScope.getContentDescription();
                        i3 &= -7169;
                    } else {
                        str3 = str2;
                    }
                    if ((i2 & 8) == 0) {
                        alignment3 = subcomposeAsyncImageScope.getAlignment();
                        i3 &= -57345;
                    } else {
                        alignment3 = alignment2;
                    }
                    if ((i2 & 16) == 0) {
                        contentScale3 = subcomposeAsyncImageScope.getContentScale();
                        i3 &= -458753;
                    } else {
                        contentScale3 = contentScale2;
                    }
                    if ((i2 & 32) == 0) {
                        f3 = subcomposeAsyncImageScope.getAlpha();
                        i3 &= -3670017;
                    } else {
                        f3 = f2;
                    }
                    if ((i2 & 64) != 0) {
                        colorFilter2 = subcomposeAsyncImageScope.getColorFilter();
                        i3 &= -29360129;
                    }
                    i5 = i3;
                    f4 = f3;
                    colorFilter3 = colorFilter2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if (i4 != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -29360129;
                    }
                    asyncImagePainter = painter;
                    i5 = i3;
                    str3 = str2;
                    alignment3 = alignment2;
                    colorFilter3 = colorFilter2;
                    contentScale3 = contentScale2;
                    f4 = f2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-263982313, i5, -1, "coil.compose.SubcomposeAsyncImageContent (SubcomposeAsyncImage.kt:202)");
                }
                int i11 = i5 >> 3;
                AsyncImageKt.Content(modifier2, asyncImagePainter, str3, alignment3, contentScale3, f4, colorFilter3, startRestartGroup, (i11 & 14) | 64 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (i11 & 3670016));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                colorFilter2 = colorFilter3;
                Alignment alignment5 = alignment3;
                f5 = f4;
                str4 = str3;
                alignment4 = alignment5;
            } else {
                startRestartGroup.skipToGroupEnd();
                asyncImagePainter = painter;
                str4 = str2;
                alignment4 = alignment2;
                contentScale3 = contentScale2;
                f5 = f2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            final Modifier modifier3 = modifier2;
            final ContentScale contentScale4 = contentScale3;
            final ColorFilter colorFilter4 = colorFilter2;
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: coil.compose.SubcomposeAsyncImageKt$SubcomposeAsyncImageContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(SubcomposeAsyncImageScope.this, modifier3, asyncImagePainter, str4, alignment4, contentScale4, f5, colorFilter4, composer2, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i & 57344) != 0) {
        }
        if ((i & 458752) != 0) {
        }
        if ((i & 3670016) != 0) {
        }
        if ((i & 29360128) != 0) {
        }
        if (i4 == 2) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        i5 = i3;
        f4 = f3;
        colorFilter3 = colorFilter2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i112 = i5 >> 3;
        AsyncImageKt.Content(modifier2, asyncImagePainter, str3, alignment3, contentScale3, f4, colorFilter3, startRestartGroup, (i112 & 14) | 64 | (i112 & 896) | (i112 & 7168) | (57344 & i112) | (458752 & i112) | (i112 & 3670016));
        if (ComposerKt.isTraceInProgress()) {
        }
        colorFilter2 = colorFilter3;
        Alignment alignment52 = alignment3;
        f5 = f4;
        str4 = str3;
        alignment4 = alignment52;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> contentOf(final Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Loading, ? super Composer, ? super Integer, Unit> function4, final Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Success, ? super Composer, ? super Integer, Unit> function42, final Function4<? super SubcomposeAsyncImageScope, ? super AsyncImagePainter.State.Error, ? super Composer, ? super Integer, Unit> function43) {
        return (function4 == null && function42 == null && function43 == null) ? ComposableSingletons$SubcomposeAsyncImageKt.INSTANCE.m4315getLambda1$coil_compose_base_release() : ComposableLambdaKt.composableLambdaInstance(-1302781228, true, new Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit>() { // from class: coil.compose.SubcomposeAsyncImageKt$contentOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Composer composer, Integer num) {
                invoke(subcomposeAsyncImageScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
            /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, Composer composer, int i) {
                int i2;
                if ((i & 14) == 0) {
                    i2 = (composer.changed(subcomposeAsyncImageScope) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i2 & 91) != 18 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1302781228, i2, -1, "coil.compose.contentOf.<anonymous> (SubcomposeAsyncImage.kt:227)");
                    }
                    AsyncImagePainter.State state = subcomposeAsyncImageScope.getPainter().getState();
                    boolean z = false;
                    boolean z2 = true;
                    if (state instanceof AsyncImagePainter.State.Loading) {
                        composer.startReplaceableGroup(-418307549);
                        Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Loading, Composer, Integer, Unit> function44 = function4;
                        if (function44 != 0) {
                            function44.invoke(subcomposeAsyncImageScope, state, composer, Integer.valueOf((i2 & 14) | 64));
                            Unit unit = Unit.INSTANCE;
                        } else {
                            z = true;
                        }
                        composer.endReplaceableGroup();
                    } else if (state instanceof AsyncImagePainter.State.Success) {
                        composer.startReplaceableGroup(-418307455);
                        Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Success, Composer, Integer, Unit> function45 = function42;
                        if (function45 != 0) {
                            function45.invoke(subcomposeAsyncImageScope, state, composer, Integer.valueOf((i2 & 14) | 64));
                            Unit unit2 = Unit.INSTANCE;
                        } else {
                            z = true;
                        }
                        composer.endReplaceableGroup();
                    } else {
                        if (!(state instanceof AsyncImagePainter.State.Error)) {
                            if (state instanceof AsyncImagePainter.State.Empty) {
                                composer.startReplaceableGroup(-418307275);
                                composer.endReplaceableGroup();
                            } else {
                                composer.startReplaceableGroup(-418307215);
                                composer.endReplaceableGroup();
                            }
                            if (z2) {
                                SubcomposeAsyncImageKt.SubcomposeAsyncImageContent(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, composer, i2 & 14, 127);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                return;
                            }
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        composer.startReplaceableGroup(-418307363);
                        Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Error, Composer, Integer, Unit> function46 = function43;
                        if (function46 != 0) {
                            function46.invoke(subcomposeAsyncImageScope, state, composer, Integer.valueOf((i2 & 14) | 64));
                            Unit unit3 = Unit.INSTANCE;
                        } else {
                            z = true;
                        }
                        composer.endReplaceableGroup();
                    }
                    z2 = z;
                    if (z2) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                } else {
                    composer.skipToGroupEnd();
                }
            }
        });
    }
}
