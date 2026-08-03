package coil.compose;

/* compiled from: AsyncImagePainter.kt */
@kotlin.Metadata(d1 = {"\u0000\u0081\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003*\u00015\u001a«\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a¡\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001am\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u000b2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001f\u0010 \u001ac\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u000b2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0004\b!\u0010\"\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u000b2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0003¢\u0006\u0004\b%\u0010&\u001a\u0010\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020)H\u0002\u001a\u001a\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020-H\u0002\u001a\u0015\u0010/\u001a\u0004\u0018\u000100*\u000201H\u0002¢\u0006\u0004\b2\u00103\"\u0010\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0004\n\u0002\u00106¨\u00067"}, d2 = {"rememberAsyncImagePainter", "Lcoil/compose/AsyncImagePainter;", "model", "", "imageLoader", "Lcoil/ImageLoader;", "placeholder", "Landroidx/compose/ui/graphics/painter/Painter;", "error", "fallback", "onLoading", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State$Loading;", "", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Success;", "onError", "Lcoil/compose/AsyncImagePainter$State$Error;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "modelEqualityDelegate", "Lcoil/compose/EqualityDelegate;", "rememberAsyncImagePainter-10Xjiaw", "(Ljava/lang/Object;Lcoil/ImageLoader;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;III)Lcoil/compose/AsyncImagePainter;", "rememberAsyncImagePainter-3HmZ8SU", "(Ljava/lang/Object;Lcoil/ImageLoader;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "transform", "Lcoil/compose/AsyncImagePainter$State;", "onState", "rememberAsyncImagePainter-0YpotYA", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILcoil/compose/EqualityDelegate;Landroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "rememberAsyncImagePainter-5jETZwI", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "state", "Lcoil/compose/AsyncImageState;", "rememberAsyncImagePainter-GSdzBsE", "(Lcoil/compose/AsyncImageState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "validateRequest", "request", "Lcoil/request/ImageRequest;", "unsupportedData", "", "name", "", "description", "toSizeOrNull", "Lcoil/size/Size;", "Landroidx/compose/ui/geometry/Size;", "toSizeOrNull-uvyYCjk", "(J)Lcoil/size/Size;", "fakeTransitionTarget", "coil/compose/AsyncImagePainterKt$fakeTransitionTarget$1", "Lcoil/compose/AsyncImagePainterKt$fakeTransitionTarget$1;", "coil-compose-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AsyncImagePainterKt {
    private static final coil.compose.AsyncImagePainterKt$fakeTransitionTarget$1 fakeTransitionTarget = new coil.transition.TransitionTarget() { // from class: coil.compose.AsyncImagePainterKt$fakeTransitionTarget$1
        @Override // coil.transition.TransitionTarget
        public android.graphics.drawable.Drawable getDrawable() {
            return null;
        }

        @Override // coil.target.Target
        public /* synthetic */ void onError(android.graphics.drawable.Drawable drawable) {
            coil.target.Target.CC.$default$onError(this, drawable);
        }

        @Override // coil.target.Target
        public /* synthetic */ void onStart(android.graphics.drawable.Drawable drawable) {
            coil.target.Target.CC.$default$onStart(this, drawable);
        }

        @Override // coil.target.Target
        public /* synthetic */ void onSuccess(android.graphics.drawable.Drawable drawable) {
            coil.target.Target.CC.$default$onSuccess(this, drawable);
        }

        @Override // coil.transition.TransitionTarget
        public /* bridge */ /* synthetic */ android.view.View getView() {
            return (android.view.View) m4956getView();
        }

        /* renamed from: getView, reason: collision with other method in class */
        public java.lang.Void m4956getView() {
            throw new java.lang.UnsupportedOperationException();
        }
    };

    /* renamed from: rememberAsyncImagePainter-10Xjiaw, reason: not valid java name */
    public static final coil.compose.AsyncImagePainter m4951rememberAsyncImagePainter10Xjiaw(java.lang.Object obj, coil.ImageLoader imageLoader, androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.ui.graphics.painter.Painter painter2, androidx.compose.ui.graphics.painter.Painter painter3, kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State.Loading, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State.Success, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State.Error, kotlin.Unit> function13, androidx.compose.ui.layout.ContentScale contentScale, int i, coil.compose.EqualityDelegate equalityDelegate, androidx.compose.runtime.Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(-79978785);
        androidx.compose.ui.graphics.painter.Painter painter4 = (i4 & 4) != 0 ? null : painter;
        androidx.compose.ui.graphics.painter.Painter painter5 = (i4 & 8) != 0 ? null : painter2;
        androidx.compose.ui.graphics.painter.Painter painter6 = (i4 & 16) != 0 ? painter5 : painter3;
        kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State.Loading, kotlin.Unit> function14 = (i4 & 32) != 0 ? null : function1;
        kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State.Success, kotlin.Unit> function15 = (i4 & 64) != 0 ? null : function12;
        kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State.Error, kotlin.Unit> function16 = (i4 & 128) == 0 ? function13 : null;
        androidx.compose.ui.layout.ContentScale fit = (i4 & 256) != 0 ? androidx.compose.ui.layout.ContentScale.INSTANCE.getFit() : contentScale;
        int m2676getDefaultFilterQualityfv9h1I = (i4 & 512) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2676getDefaultFilterQualityfv9h1I() : i;
        coil.compose.AsyncImageState asyncImageState = new coil.compose.AsyncImageState(obj, (i4 & 1024) != 0 ? coil.compose.EqualityDelegateKt.getDefaultModelEqualityDelegate() : equalityDelegate, imageLoader);
        kotlin.jvm.functions.Function1<coil.compose.AsyncImagePainter.State, coil.compose.AsyncImagePainter.State> transformOf = coil.compose.UtilsKt.transformOf(painter4, painter5, painter6);
        kotlin.jvm.functions.Function1<coil.compose.AsyncImagePainter.State, kotlin.Unit> onStateOf = coil.compose.UtilsKt.onStateOf(function14, function15, function16);
        int i5 = i2 >> 15;
        coil.compose.AsyncImagePainter m4954rememberAsyncImagePainterGSdzBsE = m4954rememberAsyncImagePainterGSdzBsE(asyncImageState, transformOf, onStateOf, fit, m2676getDefaultFilterQualityfv9h1I, composer, (i5 & 57344) | (i5 & 7168));
        composer.endReplaceableGroup();
        return m4954rememberAsyncImagePainterGSdzBsE;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    /* renamed from: rememberAsyncImagePainter-3HmZ8SU, reason: not valid java name */
    public static final /* synthetic */ coil.compose.AsyncImagePainter m4952rememberAsyncImagePainter3HmZ8SU(java.lang.Object obj, coil.ImageLoader imageLoader, androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.ui.graphics.painter.Painter painter2, androidx.compose.ui.graphics.painter.Painter painter3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, androidx.compose.ui.layout.ContentScale contentScale, int i, androidx.compose.runtime.Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(2140758544);
        androidx.compose.ui.graphics.painter.Painter painter4 = (i3 & 4) != 0 ? null : painter;
        androidx.compose.ui.graphics.painter.Painter painter5 = (i3 & 8) != 0 ? null : painter2;
        androidx.compose.ui.graphics.painter.Painter painter6 = (i3 & 16) != 0 ? painter5 : painter3;
        kotlin.jvm.functions.Function1 function14 = (i3 & 32) != 0 ? null : function1;
        kotlin.jvm.functions.Function1 function15 = (i3 & 64) != 0 ? null : function12;
        kotlin.jvm.functions.Function1 function16 = (i3 & 128) == 0 ? function13 : null;
        int i4 = i2 >> 15;
        coil.compose.AsyncImagePainter m4954rememberAsyncImagePainterGSdzBsE = m4954rememberAsyncImagePainterGSdzBsE(new coil.compose.AsyncImageState(obj, coil.compose.EqualityDelegateKt.getDefaultModelEqualityDelegate(), imageLoader), coil.compose.UtilsKt.transformOf(painter4, painter5, painter6), coil.compose.UtilsKt.onStateOf(function14, function15, function16), (i3 & 256) != 0 ? androidx.compose.ui.layout.ContentScale.INSTANCE.getFit() : contentScale, (i3 & 512) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2676getDefaultFilterQualityfv9h1I() : i, composer, (i4 & 57344) | (i4 & 7168));
        composer.endReplaceableGroup();
        return m4954rememberAsyncImagePainterGSdzBsE;
    }

    /* renamed from: rememberAsyncImagePainter-0YpotYA, reason: not valid java name */
    public static final coil.compose.AsyncImagePainter m4950rememberAsyncImagePainter0YpotYA(java.lang.Object obj, coil.ImageLoader imageLoader, kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State, ? extends coil.compose.AsyncImagePainter.State> function1, kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State, kotlin.Unit> function12, androidx.compose.ui.layout.ContentScale contentScale, int i, coil.compose.EqualityDelegate equalityDelegate, androidx.compose.runtime.Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1645646697);
        kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State, ? extends coil.compose.AsyncImagePainter.State> defaultTransform = (i3 & 4) != 0 ? coil.compose.AsyncImagePainter.INSTANCE.getDefaultTransform() : function1;
        kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State, kotlin.Unit> function13 = (i3 & 8) != 0 ? null : function12;
        androidx.compose.ui.layout.ContentScale fit = (i3 & 16) != 0 ? androidx.compose.ui.layout.ContentScale.INSTANCE.getFit() : contentScale;
        int m2676getDefaultFilterQualityfv9h1I = (i3 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2676getDefaultFilterQualityfv9h1I() : i;
        int i4 = i2 >> 3;
        coil.compose.AsyncImagePainter m4954rememberAsyncImagePainterGSdzBsE = m4954rememberAsyncImagePainterGSdzBsE(new coil.compose.AsyncImageState(obj, (i3 & 64) != 0 ? coil.compose.EqualityDelegateKt.getDefaultModelEqualityDelegate() : equalityDelegate, imageLoader), defaultTransform, function13, fit, m2676getDefaultFilterQualityfv9h1I, composer, (i4 & 57344) | (i4 & 112) | (i4 & 896) | (i4 & 7168));
        composer.endReplaceableGroup();
        return m4954rememberAsyncImagePainterGSdzBsE;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    /* renamed from: rememberAsyncImagePainter-5jETZwI, reason: not valid java name */
    public static final /* synthetic */ coil.compose.AsyncImagePainter m4953rememberAsyncImagePainter5jETZwI(java.lang.Object obj, coil.ImageLoader imageLoader, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.layout.ContentScale contentScale, int i, androidx.compose.runtime.Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-2020614074);
        if ((i3 & 4) != 0) {
            function1 = coil.compose.AsyncImagePainter.INSTANCE.getDefaultTransform();
        }
        kotlin.jvm.functions.Function1 function13 = function1;
        if ((i3 & 8) != 0) {
            function12 = null;
        }
        kotlin.jvm.functions.Function1 function14 = function12;
        if ((i3 & 16) != 0) {
            contentScale = androidx.compose.ui.layout.ContentScale.INSTANCE.getFit();
        }
        androidx.compose.ui.layout.ContentScale contentScale2 = contentScale;
        if ((i3 & 32) != 0) {
            i = androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2676getDefaultFilterQualityfv9h1I();
        }
        coil.compose.AsyncImageState asyncImageState = new coil.compose.AsyncImageState(obj, coil.compose.EqualityDelegateKt.getDefaultModelEqualityDelegate(), imageLoader);
        int i4 = i2 >> 3;
        coil.compose.AsyncImagePainter m4954rememberAsyncImagePainterGSdzBsE = m4954rememberAsyncImagePainterGSdzBsE(asyncImageState, function13, function14, contentScale2, i, composer, (i4 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
        composer.endReplaceableGroup();
        return m4954rememberAsyncImagePainterGSdzBsE;
    }

    /* renamed from: rememberAsyncImagePainter-GSdzBsE, reason: not valid java name */
    private static final coil.compose.AsyncImagePainter m4954rememberAsyncImagePainterGSdzBsE(coil.compose.AsyncImageState asyncImageState, kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State, ? extends coil.compose.AsyncImagePainter.State> function1, kotlin.jvm.functions.Function1<? super coil.compose.AsyncImagePainter.State, kotlin.Unit> function12, androidx.compose.ui.layout.ContentScale contentScale, int i, androidx.compose.runtime.Composer composer, int i2) {
        composer.startReplaceableGroup(952940650);
        android.os.Trace.beginSection("rememberAsyncImagePainter");
        try {
            coil.request.ImageRequest requestOf = coil.compose.UtilsKt.requestOf(asyncImageState.getModel(), composer, 8);
            validateRequest(requestOf);
            composer.startReplaceableGroup(1094691773);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new coil.compose.AsyncImagePainter(requestOf, asyncImageState.getImageLoader());
                composer.updateRememberedValue(rememberedValue);
            }
            coil.compose.AsyncImagePainter asyncImagePainter = (coil.compose.AsyncImagePainter) rememberedValue;
            composer.endReplaceableGroup();
            asyncImagePainter.setTransform$coil_compose_base_release(function1);
            asyncImagePainter.setOnState$coil_compose_base_release(function12);
            asyncImagePainter.setContentScale$coil_compose_base_release(contentScale);
            asyncImagePainter.m4947setFilterQualityvDHp3xo$coil_compose_base_release(i);
            androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> localInspectionMode = androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = composer.consume(localInspectionMode);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            asyncImagePainter.setPreview$coil_compose_base_release(((java.lang.Boolean) consume).booleanValue());
            asyncImagePainter.setImageLoader$coil_compose_base_release(asyncImageState.getImageLoader());
            asyncImagePainter.setRequest$coil_compose_base_release(requestOf);
            asyncImagePainter.onRemembered();
            composer.endReplaceableGroup();
            return asyncImagePainter;
        } finally {
            android.os.Trace.endSection();
        }
    }

    private static final void validateRequest(coil.request.ImageRequest imageRequest) {
        java.lang.Object data = imageRequest.getData();
        if (data instanceof coil.request.ImageRequest.Builder) {
            unsupportedData("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new kotlin.KotlinNothingValueException();
        }
        if (data instanceof androidx.compose.ui.graphics.ImageBitmap) {
            unsupportedData$default("ImageBitmap", null, 2, null);
            throw new kotlin.KotlinNothingValueException();
        }
        if (data instanceof androidx.compose.ui.graphics.vector.ImageVector) {
            unsupportedData$default("ImageVector", null, 2, null);
            throw new kotlin.KotlinNothingValueException();
        }
        if (data instanceof androidx.compose.ui.graphics.painter.Painter) {
            unsupportedData$default("Painter", null, 2, null);
            throw new kotlin.KotlinNothingValueException();
        }
        if (imageRequest.getTarget() != null) {
            throw new java.lang.IllegalArgumentException("request.target must be null.".toString());
        }
    }

    static /* synthetic */ java.lang.Void unsupportedData$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return unsupportedData(str, str2);
    }

    private static final java.lang.Void unsupportedData(java.lang.String str, java.lang.String str2) {
        throw new java.lang.IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toSizeOrNull-uvyYCjk, reason: not valid java name */
    public static final coil.size.Size m4955toSizeOrNulluvyYCjk(long j) {
        if (j == androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc()) {
            return coil.size.Size.ORIGINAL;
        }
        if (!coil.compose.UtilsKt.m4996isPositiveuvyYCjk(j)) {
            return null;
        }
        float m1940getWidthimpl = androidx.compose.ui.geometry.Size.m1940getWidthimpl(j);
        coil.size.Dimension Dimension = (java.lang.Float.isInfinite(m1940getWidthimpl) || java.lang.Float.isNaN(m1940getWidthimpl)) ? coil.size.Dimension.Undefined.INSTANCE : coil.size.Dimensions.Dimension(kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1940getWidthimpl(j)));
        float m1937getHeightimpl = androidx.compose.ui.geometry.Size.m1937getHeightimpl(j);
        return new coil.size.Size(Dimension, (java.lang.Float.isInfinite(m1937getHeightimpl) || java.lang.Float.isNaN(m1937getHeightimpl)) ? coil.size.Dimension.Undefined.INSTANCE : coil.size.Dimensions.Dimension(kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1937getHeightimpl(j))));
    }
}
