package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ¾\u00012\u00020\u0001:\u0002¾\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\n*\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u001b\u0010 J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010\u001aJ!\u0010'\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010\u001aJ\u000f\u0010*\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010\u001aJ\u000f\u0010\u000b\u001a\u00020+H\u0002¢\u0006\u0004\b\u000b\u0010,J\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u0019\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010\u0007\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u0010\u001b\u001a\u00020.H\u0002¢\u0006\u0004\b\u001b\u00101J\u000f\u00102\u001a\u00020\nH\u0000¢\u0006\u0004\b2\u0010\u001aJ\u000f\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u0010\u001aJ\u000f\u00103\u001a\u00020\nH\u0000¢\u0006\u0004\b3\u0010\u001aJ\u000f\u00104\u001a\u00020\nH\u0000¢\u0006\u0004\b4\u0010\u001aJ\u000f\u00105\u001a\u00020\nH\u0002¢\u0006\u0004\b5\u0010\u001aJ\u0015\u00107\u001a\u00020\n2\u0006\u00106\u001a\u00020-¢\u0006\u0004\b7\u00108J+\u0010@\u001a\u00020\n2\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010\u0011\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J!\u0010B\u001a\u00020\n2\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010\u0011\u001a\u00020;¢\u0006\u0004\bA\u0010\fJ\u0010\u0010D\u001a\u00020CH\u0086@¢\u0006\u0004\bD\u0010ER\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010HR\u0016\u0010\u001d\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010IR\u0016\u0010)\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010JR'\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0002\b\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u0010KR%\u0010/\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0002\b\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010KR\u0018\u0010\u000b\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010LR\u0016\u0010\u0019\u001a\u00020M8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010%\u001a\u0002098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010N\u001a\u00020;8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010QR\u0016\u00105\u001a\u00020<8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010*\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010VR\u0018\u0010Y\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010S\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u0010XR\u0016\u0010W\u001a\u00020M8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010OR\u0018\u0010Z\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010P\u001a\u00020c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bY\u0010dR\u0014\u0010`\u001a\u00020e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010fR$\u0010g\u001a\u00020M2\u0006\u0010\u0007\u001a\u00020M8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bg\u0010O\u001a\u0004\bg\u0010hR$\u0010o\u001a\u00020i2\u0006\u0010j\u001a\u00020i8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR*\u0010:\u001a\u00020\u00062\u0006\u0010j\u001a\u00020\u00068\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010Q\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR*\u0010\u0011\u001a\u00020\b2\u0006\u0010j\u001a\u00020\b8\u0007@CX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010Q\u001a\u0004\bt\u0010q\"\u0004\bu\u0010sR$\u0010z\u001a\u00020<2\u0006\u0010j\u001a\u00020<8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR$\u0010~\u001a\u00020{2\u0006\u0010j\u001a\u00020{8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b|\u0010l\"\u0004\b}\u0010nR-\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u007f2\b\u0010j\u001a\u0004\u0018\u00010\u007f8G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R.\u0010\u0085\u0001\u001a\u0002092\u0006\u0010j\u001a\u0002098\u0007@GX\u0087\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010Q\u001a\u0005\b\u0086\u0001\u0010q\"\u0005\b\u0087\u0001\u0010sR'\u0010\u008a\u0001\u001a\u00020<2\u0006\u0010j\u001a\u00020<8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0088\u0001\u0010w\"\u0005\b\u0089\u0001\u0010yR'\u0010\u008d\u0001\u001a\u00020<2\u0006\u0010j\u001a\u00020<8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008b\u0001\u0010w\"\u0005\b\u008c\u0001\u0010yR'\u0010\u0090\u0001\u001a\u00020<2\u0006\u0010j\u001a\u00020<8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008e\u0001\u0010w\"\u0005\b\u008f\u0001\u0010yR'\u0010\u0093\u0001\u001a\u00020<2\u0006\u0010j\u001a\u00020<8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0091\u0001\u0010w\"\u0005\b\u0092\u0001\u0010yR'\u0010\u0096\u0001\u001a\u00020<2\u0006\u0010j\u001a\u00020<8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0094\u0001\u0010w\"\u0005\b\u0095\u0001\u0010yR'\u0010\u0099\u0001\u001a\u00020<2\u0006\u0010j\u001a\u00020<8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0097\u0001\u0010w\"\u0005\b\u0098\u0001\u0010yR'\u0010\u009c\u0001\u001a\u00020<2\u0006\u0010j\u001a\u00020<8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009a\u0001\u0010w\"\u0005\b\u009b\u0001\u0010yR'\u0010\u009f\u0001\u001a\u00020<2\u0006\u0010j\u001a\u00020<8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009d\u0001\u0010w\"\u0005\b\u009e\u0001\u0010yR'\u0010¢\u0001\u001a\u00020<2\u0006\u0010j\u001a\u00020<8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b \u0001\u0010w\"\u0005\b¡\u0001\u0010yR6\u0010£\u0001\u001a\u00020M2\u0006\u0010j\u001a\u00020M8\u0007@GX\u0086\u000e¢\u0006\u001d\n\u0005\b£\u0001\u0010O\u0012\u0005\b§\u0001\u0010\u001a\u001a\u0005\b¤\u0001\u0010h\"\u0006\b¥\u0001\u0010¦\u0001R/\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¨\u00012\t\u0010j\u001a\u0005\u0018\u00010¨\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R\u0019\u0010R\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bb\u0010®\u0001R\u0014\u0010±\u0001\u001a\u00030¯\u00018G¢\u0006\u0007\u001a\u0005\b°\u0001\u0010qR\u0014\u0010³\u0001\u001a\u00030¯\u00018G¢\u0006\u0007\u001a\u0005\b²\u0001\u0010qR\u0014\u0010¶\u0001\u001a\u00020U8G¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R)\u0010º\u0001\u001a\u00030·\u00012\u0007\u0010j\u001a\u00030·\u00018G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¸\u0001\u0010q\"\u0005\b¹\u0001\u0010sR)\u0010½\u0001\u001a\u00030·\u00012\u0007\u0010j\u001a\u00030·\u00018G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b»\u0001\u0010q\"\u0005\b¼\u0001\u0010s"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "impl", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;)V", "Landroidx/compose/ui/unit/IntOffset;", "p0", "Landroidx/compose/ui/unit/IntSize;", "p1", "", "getHighSpeedVideoFpsRanges", "(JJ)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", io.ktor.http.ContentDisposition.Parameters.Size, "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "block", "record-mL-hObY", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;)V", "record", "getHighSpeedVideoSizesFor", "()V", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/graphics/Canvas;", "(Landroid/graphics/Canvas;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "drawForPersistence$ui_graphics", "(Landroidx/compose/ui/graphics/Canvas;)V", "getInputFormats", "parentLayer", "draw$ui_graphics", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "getHighSpeedVideoFpsRangesFor", "getOutputFormats", "Landroid/graphics/RectF;", "()Landroid/graphics/RectF;", "Landroidx/compose/ui/graphics/Path;", "Landroid/graphics/Outline;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/graphics/Path;)Landroid/graphics/Outline;", "()Landroid/graphics/Outline;", "release$ui_graphics", "discardDisplayList$ui_graphics", "emulateTrimMemory$ui_graphics", "getOutputMinFrameDuration", "path", "setPathOutline", "(Landroidx/compose/ui/graphics/Path;)V", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "", "cornerRadius", "setRoundRectOutline-TNW_H78", "(JJF)V", "setRoundRectOutline", "setRectOutline-tz77jQw", "setRectOutline", "Landroidx/compose/ui/graphics/ImageBitmap;", "toImageBitmap", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "getImpl$ui_graphics", "()Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/LayoutDirection;", "Lkotlin/jvm/functions/Function1;", "Landroid/graphics/Outline;", "", "getInputSizeshNQ4ISI", "Z", "unwrapAs", "J", "toString", "getOutputStallDuration", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Landroidx/compose/ui/graphics/Outline;", "Landroidx/compose/ui/graphics/Outline;", "getOutputMinFrameDurationlomOqCM", "Landroidx/compose/ui/graphics/Path;", "getOutputStallDurationlomOqCM", "getOutputSizeshNQ4ISI", "isOutputSupportedFor", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getValidOutputFormatsForInputhNQ4ISI", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/Paint;", "isOutputSupportedForhNQ4ISI", "Landroidx/compose/ui/graphics/Paint;", "getOutputSizes", "", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "isReleased", "()Z", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getCompositingStrategy-ke2Ky5w", "()I", "setCompositingStrategy-Wpw9cng", "(I)V", "compositingStrategy", "getTopLeft-nOcc-ac", "()J", "setTopLeft--gyyYBs", "(J)V", "getSize-YbymL2g", "setSize-ozmzZPI", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "setBlendMode-s9anfk8", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "getScaleX", "setScaleX", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getShadowElevation", "setShadowElevation", "shadowElevation", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getRotationZ", "setRotationZ", "rotationZ", "getCameraDistance", "setCameraDistance", "cameraDistance", "clip", "getClip", "setClip", "(Z)V", "getClip$annotations", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "Landroid/graphics/RectF;", "", "getLayerId", "layerId", "getOwnerViewId", "ownerViewId", "getOutline", "()Landroidx/compose/ui/graphics/Outline;", "outline", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "ambientShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "spotShadowColor", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GraphicsLayer {
    private static final androidx.compose.ui.graphics.layer.LayerSnapshotImpl getHighResolutionOutputSizeshNQ4ISI;
    private static final boolean getHighSpeedVideoSizes;
    private boolean clip;
    private android.graphics.Outline getHighSpeedVideoFpsRanges;
    private androidx.compose.ui.graphics.Outline getOutputFormats;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.Path getOutputStallDurationlomOqCM;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private android.graphics.RectF toString;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.Path getOutputStallDuration;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private float getOutputMinFrameDuration;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private int unwrapAs;

    /* renamed from: getValidOutputFormatsForInputhNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.drawscope.CanvasDrawScope getOutputSizeshNQ4ISI;
    private final androidx.compose.ui.graphics.layer.GraphicsLayerImpl impl;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private boolean getOutputMinFrameDurationlomOqCM;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.Paint getOutputSizes;
    private boolean isReleased;
    private long pivotOffset;
    private long size;
    private long topLeft;
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private androidx.compose.ui.unit.Density Camera2StreamConfigurationMap = androidx.compose.ui.graphics.drawscope.DrawContextKt.getDefaultDensity();

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private androidx.compose.ui.unit.LayoutDirection getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.LayoutDirection.Ltr;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> getHighSpeedVideoSizes = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        public final void Camera2StreamConfigurationMap(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
            Camera2StreamConfigurationMap(drawScope);
            return kotlin.Unit.INSTANCE;
        }
    };

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$clipDrawBlock$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
            getHighResolutionOutputSizeshNQ4ISI(drawScope);
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
            androidx.compose.ui.graphics.Path path;
            boolean z;
            path = androidx.compose.ui.graphics.layer.GraphicsLayer.this.getOutputStallDurationlomOqCM;
            z = androidx.compose.ui.graphics.layer.GraphicsLayer.this.getOutputMinFrameDurationlomOqCM;
            if (!z || !androidx.compose.ui.graphics.layer.GraphicsLayer.this.getClip() || path == null) {
                androidx.compose.ui.graphics.layer.GraphicsLayer.this.getHighSpeedVideoSizes(drawScope);
                return;
            }
            androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = androidx.compose.ui.graphics.layer.GraphicsLayer.this;
            int m5985getIntersectrtfAjoo = androidx.compose.ui.graphics.ClipOp.INSTANCE.m5985getIntersectrtfAjoo();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
            long mo6453getSizeNHjbRc = drawContext.mo6453getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo6455clipPathmtrdDE(path, m5985getIntersectrtfAjoo);
                graphicsLayer.getHighSpeedVideoSizes(drawScope);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            }
        }

        {
            super(1);
        }
    };

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor = true;

    /* renamed from: unwrapAs, reason: from kotlin metadata */
    private long getInputFormats = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();

    /* renamed from: toString, reason: from kotlin metadata */
    private long getInputSizeshNQ4ISI = androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker isOutputSupportedForhNQ4ISI = new androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker();

    public static /* synthetic */ void getClip$annotations() {
    }

    public GraphicsLayer(androidx.compose.ui.graphics.layer.GraphicsLayerImpl graphicsLayerImpl) {
        this.impl = graphicsLayerImpl;
        graphicsLayerImpl.setClip(false);
        this.topLeft = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
        this.size = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
        this.pivotOffset = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
    }

    /* renamed from: getImpl$ui_graphics, reason: from getter */
    public final androidx.compose.ui.graphics.layer.GraphicsLayerImpl getImpl() {
        return this.impl;
    }

    /* renamed from: isReleased, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    public final int m6619getCompositingStrategyke2Ky5w() {
        return this.impl.getCompositingStrategy();
    }

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    public final void m6627setCompositingStrategyWpw9cng(int i) {
        if (androidx.compose.ui.graphics.layer.CompositingStrategy.m6607equalsimpl0(this.impl.getCompositingStrategy(), i)) {
            return;
        }
        this.impl.mo6640setCompositingStrategyWpw9cng(i);
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name and from getter */
    public final long getTopLeft() {
        return this.topLeft;
    }

    /* renamed from: setTopLeft--gyyYBs, reason: not valid java name */
    public final void m6632setTopLeftgyyYBs(long j) {
        if (androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(this.topLeft, j)) {
            return;
        }
        this.topLeft = j;
        getHighSpeedVideoFpsRanges(j, this.size);
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: setSize-ozmzZPI, reason: not valid java name */
    private final void m6616setSizeozmzZPI(long j) {
        if (androidx.compose.ui.unit.IntSize.m8770equalsimpl0(this.size, j)) {
            return;
        }
        this.size = j;
        getHighSpeedVideoFpsRanges(this.topLeft, j);
        if (this.getInputSizeshNQ4ISI == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.getHighSpeedVideoSizesFor = true;
            Camera2StreamConfigurationMap();
        }
    }

    public final float getAlpha() {
        return this.impl.getAlpha();
    }

    public final void setAlpha(float f) {
        if (this.impl.getAlpha() == f) {
            return;
        }
        this.impl.setAlpha(f);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m6618getBlendMode0nO6VwU() {
        return this.impl.getBlendMode();
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m6626setBlendModes9anfk8(int i) {
        if (androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(this.impl.getBlendMode(), i)) {
            return;
        }
        this.impl.mo6639setBlendModes9anfk8(i);
    }

    public final androidx.compose.ui.graphics.ColorFilter getColorFilter() {
        return this.impl.getColorFilter();
    }

    public final void setColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.impl.getColorFilter(), colorFilter)) {
            return;
        }
        this.impl.setColorFilter(colorFilter);
    }

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name and from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    public final void m6628setPivotOffsetk4lQ0M(long j) {
        if (androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.pivotOffset, j)) {
            return;
        }
        this.pivotOffset = j;
        this.impl.mo6642setPivotOffsetk4lQ0M(j);
    }

    public final float getScaleX() {
        return this.impl.getScaleX();
    }

    public final void setScaleX(float f) {
        if (this.impl.getScaleX() == f) {
            return;
        }
        this.impl.setScaleX(f);
    }

    public final float getScaleY() {
        return this.impl.getScaleY();
    }

    public final void setScaleY(float f) {
        if (this.impl.getScaleY() == f) {
            return;
        }
        this.impl.setScaleY(f);
    }

    public final float getTranslationX() {
        return this.impl.getTranslationX();
    }

    public final void setTranslationX(float f) {
        if (this.impl.getTranslationX() == f) {
            return;
        }
        this.impl.setTranslationX(f);
    }

    public final float getTranslationY() {
        return this.impl.getTranslationY();
    }

    public final void setTranslationY(float f) {
        if (this.impl.getTranslationY() == f) {
            return;
        }
        this.impl.setTranslationY(f);
    }

    public final float getShadowElevation() {
        return this.impl.getShadowElevation();
    }

    public final void setShadowElevation(float f) {
        if (this.impl.getShadowElevation() == f) {
            return;
        }
        this.impl.setShadowElevation(f);
        this.getHighSpeedVideoSizesFor = true;
        Camera2StreamConfigurationMap();
    }

    public final float getRotationX() {
        return this.impl.getRotationX();
    }

    public final void setRotationX(float f) {
        if (this.impl.getRotationX() == f) {
            return;
        }
        this.impl.setRotationX(f);
    }

    public final float getRotationY() {
        return this.impl.getRotationY();
    }

    /* renamed from: setRoundRectOutline-TNW_H78$default, reason: not valid java name */
    public static /* synthetic */ void m6615setRoundRectOutlineTNW_H78$default(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, long j, long j2, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc();
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        graphicsLayer.m6630setRoundRectOutlineTNW_H78(j3, j4, f);
    }

    public final void setRotationY(float f) {
        if (this.impl.getRotationY() == f) {
            return;
        }
        this.impl.setRotationY(f);
    }

    public final float getRotationZ() {
        return this.impl.getRotationZ();
    }

    public final void setRotationZ(float f) {
        if (this.impl.getRotationZ() == f) {
            return;
        }
        this.impl.setRotationZ(f);
    }

    /* renamed from: setRectOutline-tz77jQw$default, reason: not valid java name */
    public static /* synthetic */ void m6614setRectOutlinetz77jQw$default(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        if ((i & 2) != 0) {
            j2 = androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc();
        }
        graphicsLayer.m6629setRectOutlinetz77jQw(j, j2);
    }

    public final float getCameraDistance() {
        return this.impl.getCameraDistance();
    }

    public final void setCameraDistance(float f) {
        if (this.impl.getCameraDistance() == f) {
            return;
        }
        this.impl.setCameraDistance(f);
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final void setClip(boolean z) {
        if (this.clip != z) {
            this.clip = z;
            this.getHighSpeedVideoSizesFor = true;
            Camera2StreamConfigurationMap();
        }
    }

    public final androidx.compose.ui.graphics.RenderEffect getRenderEffect() {
        return this.impl.getRenderEffect();
    }

    public final void setRenderEffect(androidx.compose.ui.graphics.RenderEffect renderEffect) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.impl.getRenderEffect(), renderEffect)) {
            return;
        }
        this.impl.setRenderEffect(renderEffect);
    }

    private final void getHighSpeedVideoFpsRanges(long p0, long p1) {
        this.impl.mo6643setPositionH0pRuoY(androidx.compose.ui.unit.IntOffset.m8729getXimpl(p0), androidx.compose.ui.unit.IntOffset.m8730getYimpl(p0), p1);
    }

    /* renamed from: record-mL-hObY, reason: not valid java name */
    public final void m6624recordmLhObY(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, long size, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> block) {
        m6616setSizeozmzZPI(size);
        this.Camera2StreamConfigurationMap = density;
        this.getHighSpeedVideoFpsRangesFor = layoutDirection;
        this.getHighSpeedVideoSizes = block;
        this.impl.setInvalidated(true);
        getHighSpeedVideoSizesFor();
    }

    private final void getHighSpeedVideoSizesFor() {
        this.impl.record(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker childLayerDependenciesTracker = this.isOutputSupportedForhNQ4ISI;
        childLayerDependenciesTracker.Camera2StreamConfigurationMap = childLayerDependenciesTracker.getHighResolutionOutputSizeshNQ4ISI;
        androidx.collection.MutableScatterSet mutableScatterSet = childLayerDependenciesTracker.getHighSpeedVideoFpsRangesFor;
        if (mutableScatterSet != null && mutableScatterSet.isNotEmpty()) {
            androidx.collection.MutableScatterSet mutableScatterSet2 = childLayerDependenciesTracker.getHighSpeedVideoFpsRanges;
            if (mutableScatterSet2 == null) {
                mutableScatterSet2 = androidx.collection.ScatterSetKt.mutableScatterSetOf();
                childLayerDependenciesTracker.getHighSpeedVideoFpsRanges = mutableScatterSet2;
            }
            mutableScatterSet2.addAll(mutableScatterSet);
            mutableScatterSet.clear();
        }
        childLayerDependenciesTracker.getHighSpeedVideoSizes = true;
        this.getHighSpeedVideoSizes.invoke(drawScope);
        childLayerDependenciesTracker.getHighSpeedVideoSizes = false;
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = childLayerDependenciesTracker.Camera2StreamConfigurationMap;
        if (graphicsLayer != null) {
            graphicsLayer.getOutputFormats();
        }
        androidx.collection.MutableScatterSet mutableScatterSet3 = childLayerDependenciesTracker.getHighSpeedVideoFpsRanges;
        if (mutableScatterSet3 == null || !mutableScatterSet3.isNotEmpty()) {
            return;
        }
        androidx.collection.MutableScatterSet mutableScatterSet4 = mutableScatterSet3;
        java.lang.Object[] objArr = mutableScatterSet4.elements;
        long[] jArr = mutableScatterSet4.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ((androidx.compose.ui.graphics.layer.GraphicsLayer) objArr[(i << 3) + i3]).getOutputFormats();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        mutableScatterSet3.clear();
    }

    private final void Camera2StreamConfigurationMap(androidx.compose.ui.graphics.layer.GraphicsLayer p0) {
        if (this.isOutputSupportedForhNQ4ISI.onDependencyAdded(p0)) {
            p0.getHighSpeedVideoFpsRangesFor();
        }
    }

    private final void getHighSpeedVideoSizes(android.graphics.Canvas p0) {
        float m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(this.topLeft);
        float m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(this.topLeft);
        float m8729getXimpl2 = androidx.compose.ui.unit.IntOffset.m8729getXimpl(this.topLeft);
        float f = (int) (this.size >> 32);
        float m8730getYimpl2 = androidx.compose.ui.unit.IntOffset.m8730getYimpl(this.topLeft);
        float f2 = (int) (this.size & 4294967295L);
        float alpha = getAlpha();
        androidx.compose.ui.graphics.ColorFilter colorFilter = getColorFilter();
        int m6618getBlendMode0nO6VwU = m6618getBlendMode0nO6VwU();
        if (alpha < 1.0f || !androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(m6618getBlendMode0nO6VwU, androidx.compose.ui.graphics.BlendMode.INSTANCE.m5937getSrcOver0nO6VwU()) || colorFilter != null || androidx.compose.ui.graphics.layer.CompositingStrategy.m6607equalsimpl0(m6619getCompositingStrategyke2Ky5w(), androidx.compose.ui.graphics.layer.CompositingStrategy.INSTANCE.m6613getOffscreenke2Ky5w())) {
            androidx.compose.ui.graphics.Paint paint = this.getOutputSizes;
            if (paint == null) {
                paint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();
                this.getOutputSizes = paint;
            }
            paint.setAlpha(alpha);
            paint.mo5872setBlendModes9anfk8(m6618getBlendMode0nO6VwU);
            paint.setColorFilter(colorFilter);
            p0.saveLayer(m8729getXimpl, m8730getYimpl, m8729getXimpl2 + f, m8730getYimpl2 + f2, paint.getGetHighSpeedVideoFpsRangesFor());
        } else {
            p0.save();
        }
        p0.translate(m8729getXimpl, m8730getYimpl);
        p0.concat(this.impl.calculateMatrix());
    }

    public final void drawForPersistence$ui_graphics(androidx.compose.ui.graphics.Canvas canvas) {
        if (androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            getInputFormats();
            this.impl.draw(canvas);
        }
    }

    private final void getInputFormats() {
        if (this.impl.getHasDisplayList()) {
            return;
        }
        try {
            getHighSpeedVideoSizesFor();
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void draw$ui_graphics(androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.layer.GraphicsLayer parentLayer) {
        android.graphics.Canvas canvas2;
        boolean z;
        if (this.isReleased) {
            return;
        }
        Camera2StreamConfigurationMap();
        getInputFormats();
        boolean z2 = getShadowElevation() > 0.0f;
        if (z2) {
            canvas.enableZ();
        }
        android.graphics.Canvas nativeCanvas = androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean isHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            getHighSpeedVideoSizes(nativeCanvas);
        }
        boolean z3 = !isHardwareAccelerated && this.clip;
        if (z3) {
            canvas.save();
            androidx.compose.ui.graphics.Outline outline = getOutline();
            if (outline instanceof androidx.compose.ui.graphics.Outline.Rectangle) {
                androidx.compose.ui.graphics.Canvas.m5969clipRectmtrdDE$default(canvas, ((androidx.compose.ui.graphics.Outline.Rectangle) outline).getRect(), 0, 2, null);
            } else if (outline instanceof androidx.compose.ui.graphics.Outline.Rounded) {
                androidx.compose.ui.graphics.Path path = this.getOutputStallDuration;
                if (path != null) {
                    path.rewind();
                } else {
                    path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
                    this.getOutputStallDuration = path;
                }
                androidx.compose.ui.graphics.Path.addRoundRect$default(path, ((androidx.compose.ui.graphics.Outline.Rounded) outline).getRoundRect(), null, 2, null);
                androidx.compose.ui.graphics.Canvas.m5967clipPathmtrdDE$default(canvas, path, 0, 2, null);
            } else {
                if (!(outline instanceof androidx.compose.ui.graphics.Outline.Generic)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                androidx.compose.ui.graphics.Canvas.m5967clipPathmtrdDE$default(canvas, ((androidx.compose.ui.graphics.Outline.Generic) outline).getPath(), 0, 2, null);
            }
        }
        if (parentLayer != null) {
            parentLayer.Camera2StreamConfigurationMap(this);
        }
        if (androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            canvas2 = nativeCanvas;
            z = isHardwareAccelerated;
            this.impl.draw(canvas);
        } else {
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope = this.getOutputSizeshNQ4ISI;
            if (canvasDrawScope == null) {
                canvasDrawScope = new androidx.compose.ui.graphics.drawscope.CanvasDrawScope();
                this.getOutputSizeshNQ4ISI = canvasDrawScope;
            }
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
            androidx.compose.ui.unit.Density density = this.Camera2StreamConfigurationMap;
            androidx.compose.ui.unit.LayoutDirection layoutDirection = this.getHighSpeedVideoFpsRangesFor;
            long m8784toSizeozmzZPI = androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(this.size);
            androidx.compose.ui.unit.Density density2 = canvasDrawScope2.getDrawContext().getDensity();
            androidx.compose.ui.unit.LayoutDirection layoutDirection2 = canvasDrawScope2.getDrawContext().getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvas3 = canvasDrawScope2.getDrawContext().getCanvas();
            long mo6453getSizeNHjbRc = canvasDrawScope2.getDrawContext().mo6453getSizeNHjbRc();
            canvas2 = nativeCanvas;
            androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = canvasDrawScope2.getDrawContext().getGraphicsLayer();
            z = isHardwareAccelerated;
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext = canvasDrawScope2.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setCanvas(canvas);
            drawContext.mo6454setSizeuvyYCjk(m8784toSizeozmzZPI);
            drawContext.setGraphicsLayer(this);
            canvas.save();
            try {
                getHighSpeedVideoSizes(canvasDrawScope2);
            } finally {
                canvas.restore();
                androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = canvasDrawScope2.getDrawContext();
                drawContext2.setDensity(density2);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas3);
                drawContext2.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
            }
        }
        if (z3) {
            canvas.restore();
        }
        if (z2) {
            canvas.disableZ();
        }
        if (z) {
            return;
        }
        canvas2.restore();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        this.unwrapAs++;
    }

    private final void getOutputFormats() {
        this.unwrapAs--;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private final android.graphics.RectF getHighSpeedVideoFpsRanges() {
        android.graphics.RectF rectF = this.toString;
        if (rectF != null) {
            return rectF;
        }
        android.graphics.RectF rectF2 = new android.graphics.RectF();
        this.toString = rectF2;
        return rectF2;
    }

    private final void Camera2StreamConfigurationMap() {
        if (this.getHighSpeedVideoSizesFor) {
            android.graphics.Outline outline = null;
            if (!this.clip && getShadowElevation() <= 0.0f) {
                this.impl.setClip(false);
                this.impl.mo6641setOutlineO0kMr_c(null, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g());
            } else {
                androidx.compose.ui.graphics.Path path = this.getOutputStallDurationlomOqCM;
                if (path != null) {
                    android.graphics.RectF highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
                    if (path instanceof androidx.compose.ui.graphics.AndroidPath) {
                        ((androidx.compose.ui.graphics.AndroidPath) path).getInternalPath().computeBounds(highSpeedVideoFpsRanges, false);
                        android.graphics.Outline highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(path);
                        if (highResolutionOutputSizeshNQ4ISI != null) {
                            highResolutionOutputSizeshNQ4ISI.setAlpha(getAlpha());
                            outline = highResolutionOutputSizeshNQ4ISI;
                        }
                        this.impl.mo6641setOutlineO0kMr_c(outline, androidx.compose.ui.unit.IntSize.m8767constructorimpl((4294967295L & java.lang.Math.round(highSpeedVideoFpsRanges.height())) | (java.lang.Math.round(highSpeedVideoFpsRanges.width()) << 32)));
                        if (this.getOutputMinFrameDurationlomOqCM && this.clip) {
                            this.impl.setClip(false);
                            this.impl.discardDisplayList();
                        } else {
                            this.impl.setClip(this.clip);
                        }
                    } else {
                        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                } else {
                    this.impl.setClip(this.clip);
                    androidx.compose.ui.geometry.Size.INSTANCE.m5830getZeroNHjbRc();
                    android.graphics.Outline highSpeedVideoSizes = getHighSpeedVideoSizes();
                    long m8784toSizeozmzZPI = androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(this.size);
                    long j = this.getInputFormats;
                    long j2 = this.getInputSizeshNQ4ISI;
                    long j3 = j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j2 : m8784toSizeozmzZPI;
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    highSpeedVideoSizes.setRoundRect(java.lang.Math.round(java.lang.Float.intBitsToFloat(i)), java.lang.Math.round(java.lang.Float.intBitsToFloat(i2)), java.lang.Math.round(java.lang.Float.intBitsToFloat(i) + java.lang.Float.intBitsToFloat((int) (j3 >> 32))), java.lang.Math.round(java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (4294967295L & j3))), this.getOutputMinFrameDuration);
                    highSpeedVideoSizes.setAlpha(getAlpha());
                    this.impl.mo6641setOutlineO0kMr_c(highSpeedVideoSizes, androidx.compose.ui.unit.IntSizeKt.m8780roundToIntSizeuvyYCjk(j3));
                }
            }
        }
        this.getHighSpeedVideoSizesFor = false;
    }

    private final android.graphics.Outline getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.Path p0) {
        android.graphics.Outline highSpeedVideoSizes;
        if (android.os.Build.VERSION.SDK_INT > 28 || p0.isConvex()) {
            highSpeedVideoSizes = getHighSpeedVideoSizes();
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                androidx.compose.ui.graphics.layer.OutlineVerificationHelper.INSTANCE.setPath(highSpeedVideoSizes, p0);
            } else if (p0 instanceof androidx.compose.ui.graphics.AndroidPath) {
                highSpeedVideoSizes.setConvexPath(((androidx.compose.ui.graphics.AndroidPath) p0).getInternalPath());
            } else {
                throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            this.getOutputMinFrameDurationlomOqCM = !highSpeedVideoSizes.canClip();
        } else {
            android.graphics.Outline outline = this.getHighSpeedVideoFpsRanges;
            if (outline != null) {
                outline.setEmpty();
            }
            this.getOutputMinFrameDurationlomOqCM = true;
            this.impl.setInvalidated(true);
            highSpeedVideoSizes = null;
        }
        this.getOutputStallDurationlomOqCM = p0;
        return highSpeedVideoSizes;
    }

    private final android.graphics.Outline getHighSpeedVideoSizes() {
        android.graphics.Outline outline = this.getHighSpeedVideoFpsRanges;
        if (outline != null) {
            return outline;
        }
        android.graphics.Outline outline2 = new android.graphics.Outline();
        this.getHighSpeedVideoFpsRanges = outline2;
        return outline2;
    }

    public final void release$ui_graphics() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.isReleased && this.unwrapAs == 0) {
            discardDisplayList$ui_graphics();
        }
    }

    public final void discardDisplayList$ui_graphics() {
        androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker childLayerDependenciesTracker = this.isOutputSupportedForhNQ4ISI;
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = childLayerDependenciesTracker.getHighResolutionOutputSizeshNQ4ISI;
        if (graphicsLayer != null) {
            graphicsLayer.getOutputFormats();
            childLayerDependenciesTracker.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        androidx.collection.MutableScatterSet mutableScatterSet = childLayerDependenciesTracker.getHighSpeedVideoFpsRangesFor;
        if (mutableScatterSet != null) {
            androidx.collection.MutableScatterSet mutableScatterSet2 = mutableScatterSet;
            java.lang.Object[] objArr = mutableScatterSet2.elements;
            long[] jArr = mutableScatterSet2.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((androidx.compose.ui.graphics.layer.GraphicsLayer) objArr[(i << 3) + i3]).getOutputFormats();
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            mutableScatterSet.clear();
        }
        this.impl.discardDisplayList();
    }

    public final void emulateTrimMemory$ui_graphics() {
        this.impl.discardDisplayList();
    }

    public final long getLayerId() {
        return this.impl.getLayerId();
    }

    public final long getOwnerViewId() {
        return this.impl.getOwnerId();
    }

    public final androidx.compose.ui.graphics.Outline getOutline() {
        androidx.compose.ui.graphics.Outline.Rectangle rectangle;
        androidx.compose.ui.graphics.Outline outline = this.getOutputFormats;
        androidx.compose.ui.graphics.Path path = this.getOutputStallDurationlomOqCM;
        if (outline != null) {
            return outline;
        }
        if (path != null) {
            androidx.compose.ui.graphics.Outline.Generic generic = new androidx.compose.ui.graphics.Outline.Generic(path);
            this.getOutputFormats = generic;
            return generic;
        }
        long m8784toSizeozmzZPI = androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(this.size);
        long j = this.getInputFormats;
        long j2 = this.getInputSizeshNQ4ISI;
        if (j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            m8784toSizeozmzZPI = j2;
        }
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (m8784toSizeozmzZPI >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = intBitsToFloat2 + java.lang.Float.intBitsToFloat((int) (m8784toSizeozmzZPI & 4294967295L));
        float f = this.getOutputMinFrameDuration;
        if (f <= 0.0f) {
            rectangle = new androidx.compose.ui.graphics.Outline.Rectangle(new androidx.compose.ui.geometry.Rect(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        } else {
            rectangle = new androidx.compose.ui.graphics.Outline.Rounded(androidx.compose.ui.geometry.RoundRectKt.m5806RoundRectgG7oq9Y(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32))));
        }
        this.getOutputFormats = rectangle;
        return rectangle;
    }

    private final void getOutputMinFrameDuration() {
        this.getOutputFormats = null;
        this.getOutputStallDurationlomOqCM = null;
        this.getInputSizeshNQ4ISI = androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc();
        this.getInputFormats = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        this.getOutputMinFrameDuration = 0.0f;
        this.getHighSpeedVideoSizesFor = true;
        this.getOutputMinFrameDurationlomOqCM = false;
    }

    public final void setPathOutline(androidx.compose.ui.graphics.Path path) {
        getOutputMinFrameDuration();
        this.getOutputStallDurationlomOqCM = path;
        Camera2StreamConfigurationMap();
    }

    /* renamed from: setRoundRectOutline-TNW_H78, reason: not valid java name */
    public final void m6630setRoundRectOutlineTNW_H78(long topLeft, long size, float cornerRadius) {
        if (androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.getInputFormats, topLeft) && androidx.compose.ui.geometry.Size.m5817equalsimpl0(this.getInputSizeshNQ4ISI, size) && this.getOutputMinFrameDuration == cornerRadius && this.getOutputStallDurationlomOqCM == null) {
            return;
        }
        getOutputMinFrameDuration();
        this.getInputFormats = topLeft;
        this.getInputSizeshNQ4ISI = size;
        this.getOutputMinFrameDuration = cornerRadius;
        Camera2StreamConfigurationMap();
    }

    /* renamed from: setRectOutline-tz77jQw, reason: not valid java name */
    public final void m6629setRectOutlinetz77jQw(long topLeft, long size) {
        m6630setRoundRectOutlineTNW_H78(topLeft, size, 0.0f);
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m6617getAmbientShadowColor0d7_KjU() {
        return this.impl.getAmbientShadowColor();
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m6625setAmbientShadowColor8_81llA(long j) {
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, this.impl.getAmbientShadowColor())) {
            return;
        }
        this.impl.mo6638setAmbientShadowColor8_81llA(j);
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m6622getSpotShadowColor0d7_KjU() {
        return this.impl.getSpotShadowColor();
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m6631setSpotShadowColor8_81llA(long j) {
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, this.impl.getSpotShadowColor())) {
            return;
        }
        this.impl.mo6644setSpotShadowColor8_81llA(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object toImageBitmap(kotlin.coroutines.Continuation<? super androidx.compose.ui.graphics.ImageBitmap> continuation) {
        androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 graphicsLayer$toImageBitmap$1;
        int i;
        if (continuation instanceof androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1) {
            graphicsLayer$toImageBitmap$1 = (androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1) continuation;
            if ((graphicsLayer$toImageBitmap$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                graphicsLayer$toImageBitmap$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = graphicsLayer$toImageBitmap$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = graphicsLayer$toImageBitmap$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.graphics.layer.LayerSnapshotImpl layerSnapshotImpl = getHighResolutionOutputSizeshNQ4ISI;
                    graphicsLayer$toImageBitmap$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = layerSnapshotImpl.toBitmap(this, graphicsLayer$toImageBitmap$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap((android.graphics.Bitmap) obj);
            }
        }
        graphicsLayer$toImageBitmap$1 = new androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1(this, continuation);
        java.lang.Object obj2 = graphicsLayer$toImageBitmap$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = graphicsLayer$toImageBitmap$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap((android.graphics.Bitmap) obj2);
    }

    static {
        androidx.compose.ui.graphics.layer.LayerSnapshotV21 layerSnapshotV21;
        java.lang.String lowerCase = android.os.Build.FINGERPRINT.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "robolectric");
        getHighSpeedVideoSizes = areEqual;
        if (!areEqual) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                layerSnapshotV21 = androidx.compose.ui.graphics.layer.LayerSnapshotV28.INSTANCE;
            } else if (androidx.compose.ui.graphics.layer.SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable()) {
                layerSnapshotV21 = androidx.compose.ui.graphics.layer.LayerSnapshotV22.INSTANCE;
            }
            getHighResolutionOutputSizeshNQ4ISI = layerSnapshotV21;
        }
        layerSnapshotV21 = androidx.compose.ui.graphics.layer.LayerSnapshotV21.INSTANCE;
        getHighResolutionOutputSizeshNQ4ISI = layerSnapshotV21;
    }
}
