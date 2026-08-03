package androidx.compose.ui.graphics.vector;

/* compiled from: Vector.kt */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00106\u001a\u00020\u000eH\u0002J\b\u00107\u001a\u00020\"H\u0016J\f\u00108\u001a\u00020\u000e*\u00020\rH\u0016J\u001c\u00108\u001a\u00020\u000e*\u00020\r2\u0006\u00109\u001a\u00020-2\b\u0010:\u001a\u0004\u0018\u00010\u0011R\u001a\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00118@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020(X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R1\u00100\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020(8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b5\u0010\u0018\u001a\u0004\b1\u00102\"\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "root", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "(Landroidx/compose/ui/graphics/vector/GroupComponent;)V", "cacheBitmapConfig", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getCacheBitmapConfig-_sVssgQ$ui_release", "()I", "cacheDrawScope", "Landroidx/compose/ui/graphics/vector/DrawCache;", "drawVectorBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "<set-?>", "Landroidx/compose/ui/graphics/ColorFilter;", "intrinsicColorFilter", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter$delegate", "Landroidx/compose/runtime/MutableState;", "invalidateCallback", "Lkotlin/Function0;", "getInvalidateCallback$ui_release", "()Lkotlin/jvm/functions/Function0;", "setInvalidateCallback$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "isDirty", "", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "previousDrawSize", "Landroidx/compose/ui/geometry/Size;", "J", "getRoot", "()Landroidx/compose/ui/graphics/vector/GroupComponent;", "rootScaleX", "", "rootScaleY", "tintFilter", "viewportSize", "getViewportSize-NH-jbRc$ui_release", "()J", "setViewportSize-uvyYCjk$ui_release", "(J)V", "viewportSize$delegate", "doInvalidate", "toString", "draw", "alpha", "colorFilter", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorComponent extends androidx.compose.ui.graphics.vector.VNode {
    public static final int $stable = 8;
    private final androidx.compose.ui.graphics.vector.DrawCache cacheDrawScope;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> drawVectorBlock;

    /* renamed from: intrinsicColorFilter$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState intrinsicColorFilter;
    private kotlin.jvm.functions.Function0<kotlin.Unit> invalidateCallback;
    private boolean isDirty;
    private java.lang.String name;
    private long previousDrawSize;
    private final androidx.compose.ui.graphics.vector.GroupComponent root;
    private float rootScaleX;
    private float rootScaleY;
    private androidx.compose.ui.graphics.ColorFilter tintFilter;

    /* renamed from: viewportSize$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState viewportSize;

    public VectorComponent(androidx.compose.ui.graphics.vector.GroupComponent groupComponent) {
        super(null);
        this.root = groupComponent;
        groupComponent.setInvalidateListener$ui_release(new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.vector.VNode, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.vector.VNode vNode) {
                invoke2(vNode);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.vector.VNode vNode) {
                androidx.compose.ui.graphics.vector.VectorComponent.this.doInvalidate();
            }
        });
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new androidx.compose.ui.graphics.vector.DrawCache();
        this.invalidateCallback = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }
        };
        this.intrinsicColorFilter = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.viewportSize = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Size.m1928boximpl(androidx.compose.ui.geometry.Size.INSTANCE.m1949getZeroNHjbRc()), null, 2, null);
        this.previousDrawSize = androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                invoke2(drawScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                float f;
                float f2;
                androidx.compose.ui.graphics.vector.GroupComponent root = androidx.compose.ui.graphics.vector.VectorComponent.this.getRoot();
                androidx.compose.ui.graphics.vector.VectorComponent vectorComponent = androidx.compose.ui.graphics.vector.VectorComponent.this;
                f = vectorComponent.rootScaleX;
                f2 = vectorComponent.rootScaleY;
                long m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                androidx.compose.ui.graphics.drawscope.DrawContext drawContext = drawScope.getDrawContext();
                long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo2605scale0AR0LA0(f, f2, m1887getZeroF1C5BW0);
                root.draw(drawScope);
                drawContext.getCanvas().restore();
                drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
            }
        };
    }

    public final androidx.compose.ui.graphics.vector.GroupComponent getRoot() {
        return this.root;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final void setName(java.lang.String str) {
        this.name = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    /* renamed from: getCacheBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m2769getCacheBitmapConfig_sVssgQ$ui_release() {
        androidx.compose.ui.graphics.ImageBitmap mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.mo1980getConfig_sVssgQ() : androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2342getArgb8888_sVssgQ();
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getInvalidateCallback$ui_release() {
        return this.invalidateCallback;
    }

    public final void setInvalidateCallback$ui_release(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.invalidateCallback = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.ui.graphics.ColorFilter getIntrinsicColorFilter$ui_release() {
        return (androidx.compose.ui.graphics.ColorFilter) this.intrinsicColorFilter.getValue();
    }

    public final void setIntrinsicColorFilter$ui_release(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.intrinsicColorFilter.setValue(colorFilter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m2770getViewportSizeNHjbRc$ui_release() {
        return ((androidx.compose.ui.geometry.Size) this.viewportSize.getValue()).getPackedValue();
    }

    /* renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m2771setViewportSizeuvyYCjk$ui_release(long j) {
        this.viewportSize.setValue(androidx.compose.ui.geometry.Size.m1928boximpl(j));
    }

    public final void draw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f, androidx.compose.ui.graphics.ColorFilter colorFilter) {
        int m2342getArgb8888_sVssgQ;
        if (this.root.getIsTintable() && this.root.getTintColor() != androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU() && androidx.compose.ui.graphics.vector.VectorKt.tintableWithAlphaMask(getIntrinsicColorFilter$ui_release()) && androidx.compose.ui.graphics.vector.VectorKt.tintableWithAlphaMask(colorFilter)) {
            m2342getArgb8888_sVssgQ = androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2341getAlpha8_sVssgQ();
        } else {
            m2342getArgb8888_sVssgQ = androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2342getArgb8888_sVssgQ();
        }
        int i = m2342getArgb8888_sVssgQ;
        if (this.isDirty || !androidx.compose.ui.geometry.Size.m1936equalsimpl0(this.previousDrawSize, drawScope.mo2592getSizeNHjbRc()) || !androidx.compose.ui.graphics.ImageBitmapConfig.m2337equalsimpl0(i, m2769getCacheBitmapConfig_sVssgQ$ui_release())) {
            this.tintFilter = androidx.compose.ui.graphics.ImageBitmapConfig.m2337equalsimpl0(i, androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2341getAlpha8_sVssgQ()) ? androidx.compose.ui.graphics.ColorFilter.Companion.m2154tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.INSTANCE, this.root.getTintColor(), 0, 2, null) : null;
            this.rootScaleX = androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawScope.mo2592getSizeNHjbRc()) / androidx.compose.ui.geometry.Size.m1940getWidthimpl(m2770getViewportSizeNHjbRc$ui_release());
            this.rootScaleY = androidx.compose.ui.geometry.Size.m1937getHeightimpl(drawScope.mo2592getSizeNHjbRc()) / androidx.compose.ui.geometry.Size.m1937getHeightimpl(m2770getViewportSizeNHjbRc$ui_release());
            this.cacheDrawScope.m2752drawCachedImageFqjB98A(i, androidx.compose.ui.unit.IntSizeKt.IntSize((int) java.lang.Math.ceil(androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawScope.mo2592getSizeNHjbRc())), (int) java.lang.Math.ceil(androidx.compose.ui.geometry.Size.m1937getHeightimpl(drawScope.mo2592getSizeNHjbRc()))), drawScope, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope.mo2592getSizeNHjbRc();
        }
        if (colorFilter == null) {
            if (getIntrinsicColorFilter$ui_release() != null) {
                colorFilter = getIntrinsicColorFilter$ui_release();
            } else {
                colorFilter = this.tintFilter;
            }
        }
        this.cacheDrawScope.drawInto(drawScope, f, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        draw(drawScope, 1.0f, null);
    }

    public java.lang.String toString() {
        java.lang.String str = "Params: \tname: " + this.name + "\n\tviewportWidth: " + androidx.compose.ui.geometry.Size.m1940getWidthimpl(m2770getViewportSizeNHjbRc$ui_release()) + "\n\tviewportHeight: " + androidx.compose.ui.geometry.Size.m1937getHeightimpl(m2770getViewportSizeNHjbRc$ui_release()) + "\n";
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
