package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0099\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a[\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\t2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"rememberAsyncImagePainter", "Lcoil3/compose/AsyncImagePainter;", "model", "", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER, "Landroidx/compose/ui/graphics/painter/Painter;", "error", "fallback", "onLoading", "Lkotlin/Function1;", "Lcoil3/compose/AsyncImagePainter$State$Loading;", "", "onSuccess", "Lcoil3/compose/AsyncImagePainter$State$Success;", "onError", "Lcoil3/compose/AsyncImagePainter$State$Error;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "rememberAsyncImagePainter-MqR-F_0", "(Ljava/lang/Object;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil3/compose/AsyncImagePainter;", "transform", "Lcoil3/compose/AsyncImagePainter$State;", "onState", "rememberAsyncImagePainter-19ie5dc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil3/compose/AsyncImagePainter;", "coil-compose"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingletonAsyncImagePainterKt {
    /* renamed from: rememberAsyncImagePainter-MqR-F_0, reason: not valid java name */
    public static final coil3.compose.AsyncImagePainter m9752rememberAsyncImagePainterMqRF_0(java.lang.Object obj, androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.ui.graphics.painter.Painter painter2, androidx.compose.ui.graphics.painter.Painter painter3, kotlin.jvm.functions.Function1<? super coil3.compose.AsyncImagePainter.State.Loading, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super coil3.compose.AsyncImagePainter.State.Success, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super coil3.compose.AsyncImagePainter.State.Error, kotlin.Unit> function13, androidx.compose.ui.layout.ContentScale contentScale, int i, androidx.compose.runtime.Composer composer, int i2, int i3) {
        androidx.compose.ui.graphics.painter.Painter painter4 = (i3 & 2) != 0 ? null : painter;
        androidx.compose.ui.graphics.painter.Painter painter5 = (i3 & 4) != 0 ? null : painter2;
        androidx.compose.ui.graphics.painter.Painter painter6 = (i3 & 8) != 0 ? painter5 : painter3;
        kotlin.jvm.functions.Function1<? super coil3.compose.AsyncImagePainter.State.Loading, kotlin.Unit> function14 = (i3 & 16) != 0 ? null : function1;
        kotlin.jvm.functions.Function1<? super coil3.compose.AsyncImagePainter.State.Success, kotlin.Unit> function15 = (i3 & 32) != 0 ? null : function12;
        kotlin.jvm.functions.Function1<? super coil3.compose.AsyncImagePainter.State.Error, kotlin.Unit> function16 = (i3 & 64) != 0 ? null : function13;
        androidx.compose.ui.layout.ContentScale fit = (i3 & 128) != 0 ? androidx.compose.ui.layout.ContentScale.INSTANCE.getFit() : contentScale;
        int m6534getDefaultFilterQualityfv9h1I = (i3 & 256) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m6534getDefaultFilterQualityfv9h1I() : i;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1650263642, i2, -1, "coil3.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:45)");
        }
        int i4 = i2 << 3;
        coil3.compose.AsyncImagePainter m9740rememberAsyncImagePainter3HmZ8SU = coil3.compose.AsyncImagePainterKt.m9740rememberAsyncImagePainter3HmZ8SU(obj, coil3.SingletonImageLoader.get((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())), painter4, painter5, painter6, function14, function15, function16, fit, m6534getDefaultFilterQualityfv9h1I, composer, (i2 & 14) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m9740rememberAsyncImagePainter3HmZ8SU;
    }

    /* renamed from: rememberAsyncImagePainter-19ie5dc, reason: not valid java name */
    public static final coil3.compose.AsyncImagePainter m9751rememberAsyncImagePainter19ie5dc(java.lang.Object obj, kotlin.jvm.functions.Function1<? super coil3.compose.AsyncImagePainter.State, ? extends coil3.compose.AsyncImagePainter.State> function1, kotlin.jvm.functions.Function1<? super coil3.compose.AsyncImagePainter.State, kotlin.Unit> function12, androidx.compose.ui.layout.ContentScale contentScale, int i, androidx.compose.runtime.Composer composer, int i2, int i3) {
        kotlin.jvm.functions.Function1<? super coil3.compose.AsyncImagePainter.State, ? extends coil3.compose.AsyncImagePainter.State> defaultTransform = (i3 & 2) != 0 ? coil3.compose.AsyncImagePainter.INSTANCE.getDefaultTransform() : function1;
        kotlin.jvm.functions.Function1<? super coil3.compose.AsyncImagePainter.State, kotlin.Unit> function13 = (i3 & 4) != 0 ? null : function12;
        androidx.compose.ui.layout.ContentScale fit = (i3 & 8) != 0 ? androidx.compose.ui.layout.ContentScale.INSTANCE.getFit() : contentScale;
        int m6534getDefaultFilterQualityfv9h1I = (i3 & 16) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m6534getDefaultFilterQualityfv9h1I() : i;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1093003120, i2, -1, "coil3.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:82)");
        }
        int i4 = i2 << 3;
        coil3.compose.AsyncImagePainter m9741rememberAsyncImagePainter5jETZwI = coil3.compose.AsyncImagePainterKt.m9741rememberAsyncImagePainter5jETZwI(obj, coil3.SingletonImageLoader.get((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())), defaultTransform, function13, fit, m6534getDefaultFilterQualityfv9h1I, composer, (i2 & 14) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (i4 & 458752), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m9741rememberAsyncImagePainter5jETZwI;
    }
}
