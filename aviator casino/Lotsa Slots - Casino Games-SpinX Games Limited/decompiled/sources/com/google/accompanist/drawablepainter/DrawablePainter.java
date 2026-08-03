package com.google.accompanist.drawablepainter;

/* compiled from: DrawablePainter.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0014J\u0012\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)H\u0014J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020+H\u0016J\b\u0010-\u001a\u00020+H\u0016J\f\u0010.\u001a\u00020+*\u00020/H\u0014R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R4\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u00178B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\u00020\u00178VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "drawable", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", "callback", "Landroid/graphics/drawable/Drawable$Callback;", "getCallback", "()Landroid/graphics/drawable/Drawable$Callback;", "callback$delegate", "Lkotlin/Lazy;", "<set-?>", "", "drawInvalidateTick", "getDrawInvalidateTick", "()I", "setDrawInvalidateTick", "(I)V", "drawInvalidateTick$delegate", "Landroidx/compose/runtime/MutableState;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "Landroidx/compose/ui/geometry/Size;", "drawableIntrinsicSize", "getDrawableIntrinsicSize-NH-jbRc", "()J", "setDrawableIntrinsicSize-uvyYCjk", "(J)V", "drawableIntrinsicSize$delegate", "intrinsicSize", "getIntrinsicSize-NH-jbRc", "applyAlpha", "", "alpha", "", "applyColorFilter", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "applyLayoutDirection", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "onAbandoned", "", "onForgotten", "onRemembered", "onDraw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawablepainter_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrawablePainter extends androidx.compose.ui.graphics.painter.Painter implements androidx.compose.runtime.RememberObserver {
    public static final int $stable = 8;

    /* renamed from: callback$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy callback;

    /* renamed from: drawInvalidateTick$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState drawInvalidateTick;
    private final android.graphics.drawable.Drawable drawable;

    /* renamed from: drawableIntrinsicSize$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState drawableIntrinsicSize;

    /* compiled from: DrawablePainter.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.LayoutDirection.values().length];
            try {
                iArr[androidx.compose.ui.unit.LayoutDirection.Ltr.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.LayoutDirection.Rtl.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final android.graphics.drawable.Drawable getDrawable() {
        return this.drawable;
    }

    public DrawablePainter(android.graphics.drawable.Drawable drawable) {
        long intrinsicSize;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.drawable = drawable;
        this.drawInvalidateTick = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        intrinsicSize = com.google.accompanist.drawablepainter.DrawablePainterKt.getIntrinsicSize(drawable);
        this.drawableIntrinsicSize = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Size.m1928boximpl(intrinsicSize), null, 2, null);
        this.callback = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.google.accompanist.drawablepainter.DrawablePainter$callback$2.AnonymousClass1>() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v0, types: [com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1] */
            @Override // kotlin.jvm.functions.Function0
            public final com.google.accompanist.drawablepainter.DrawablePainter$callback$2.AnonymousClass1 invoke() {
                final com.google.accompanist.drawablepainter.DrawablePainter drawablePainter = com.google.accompanist.drawablepainter.DrawablePainter.this;
                return new android.graphics.drawable.Drawable.Callback() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2.1
                    @Override // android.graphics.drawable.Drawable.Callback
                    public void invalidateDrawable(android.graphics.drawable.Drawable d) {
                        int drawInvalidateTick;
                        long intrinsicSize2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "d");
                        com.google.accompanist.drawablepainter.DrawablePainter drawablePainter2 = com.google.accompanist.drawablepainter.DrawablePainter.this;
                        drawInvalidateTick = drawablePainter2.getDrawInvalidateTick();
                        drawablePainter2.setDrawInvalidateTick(drawInvalidateTick + 1);
                        com.google.accompanist.drawablepainter.DrawablePainter drawablePainter3 = com.google.accompanist.drawablepainter.DrawablePainter.this;
                        intrinsicSize2 = com.google.accompanist.drawablepainter.DrawablePainterKt.getIntrinsicSize(drawablePainter3.getDrawable());
                        drawablePainter3.m5263setDrawableIntrinsicSizeuvyYCjk(intrinsicSize2);
                    }

                    @Override // android.graphics.drawable.Drawable.Callback
                    public void scheduleDrawable(android.graphics.drawable.Drawable d, java.lang.Runnable what, long time) {
                        android.os.Handler main_handler;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "d");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(what, "what");
                        main_handler = com.google.accompanist.drawablepainter.DrawablePainterKt.getMAIN_HANDLER();
                        main_handler.postAtTime(what, time);
                    }

                    @Override // android.graphics.drawable.Drawable.Callback
                    public void unscheduleDrawable(android.graphics.drawable.Drawable d, java.lang.Runnable what) {
                        android.os.Handler main_handler;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "d");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(what, "what");
                        main_handler = com.google.accompanist.drawablepainter.DrawablePainterKt.getMAIN_HANDLER();
                        main_handler.removeCallbacks(what);
                    }
                };
            }
        });
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getDrawInvalidateTick() {
        return ((java.lang.Number) this.drawInvalidateTick.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDrawInvalidateTick(int i) {
        this.drawInvalidateTick.setValue(java.lang.Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDrawableIntrinsicSize-NH-jbRc, reason: not valid java name */
    private final long m5262getDrawableIntrinsicSizeNHjbRc() {
        return ((androidx.compose.ui.geometry.Size) this.drawableIntrinsicSize.getValue()).getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDrawableIntrinsicSize-uvyYCjk, reason: not valid java name */
    public final void m5263setDrawableIntrinsicSizeuvyYCjk(long j) {
        this.drawableIntrinsicSize.setValue(androidx.compose.ui.geometry.Size.m1928boximpl(j));
    }

    private final android.graphics.drawable.Drawable.Callback getCallback() {
        return (android.graphics.drawable.Drawable.Callback) this.callback.getValue();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.drawable.setCallback(getCallback());
        this.drawable.setVisible(true, true);
        java.lang.Object obj = this.drawable;
        if (obj instanceof android.graphics.drawable.Animatable) {
            ((android.graphics.drawable.Animatable) obj).start();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        onForgotten();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        java.lang.Object obj = this.drawable;
        if (obj instanceof android.graphics.drawable.Animatable) {
            ((android.graphics.drawable.Animatable) obj).stop();
        }
        this.drawable.setVisible(false, false);
        this.drawable.setCallback(null);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float alpha) {
        this.drawable.setAlpha(kotlin.ranges.RangesKt.coerceIn(kotlin.math.MathKt.roundToInt(alpha * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter != null ? androidx.compose.ui.graphics.AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i = 0;
        if (android.os.Build.VERSION.SDK_INT < 23) {
            return false;
        }
        android.graphics.drawable.Drawable drawable = this.drawable;
        int i2 = com.google.accompanist.drawablepainter.DrawablePainter.WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            i = 1;
        }
        return drawable.setLayoutDirection(i);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        return m5262getDrawableIntrinsicSizeNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "<this>");
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        getDrawInvalidateTick();
        this.drawable.setBounds(0, 0, kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1940getWidthimpl(drawScope.mo2592getSizeNHjbRc())), kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m1937getHeightimpl(drawScope.mo2592getSizeNHjbRc())));
        try {
            canvas.save();
            this.drawable.draw(androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas));
        } finally {
            canvas.restore();
        }
    }
}
