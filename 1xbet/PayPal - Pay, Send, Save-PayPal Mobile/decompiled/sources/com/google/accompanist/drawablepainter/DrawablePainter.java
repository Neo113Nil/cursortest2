package com.google.accompanist.drawablepainter;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0007*\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR+\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010.\u001a\u00020(2\u0006\u0010 \u001a\u00020(8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010+"}, d2 = {"Lcom/google/accompanist/drawablepainter/DrawablePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Landroid/graphics/drawable/Drawable;", "drawable", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "", "onRemembered", "()V", "onAbandoned", "onForgotten", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "applyLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)Z", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "", "<set-?>", "drawInvalidateTick$delegate", "Landroidx/compose/runtime/MutableState;", "getDrawInvalidateTick", "()I", "setDrawInvalidateTick", "(I)V", "drawInvalidateTick", "Landroidx/compose/ui/geometry/Size;", "drawableIntrinsicSize$delegate", "getDrawableIntrinsicSize-NH-jbRc", "()J", "setDrawableIntrinsicSize-uvyYCjk", "(J)V", "drawableIntrinsicSize", "Landroid/graphics/drawable/Drawable$Callback;", "callback$delegate", "Lkotlin/Lazy;", "getCallback", "()Landroid/graphics/drawable/Drawable$Callback;", com.sun.jna.Callback.METHOD_NAME, "getIntrinsicSize-NH-jbRc", "intrinsicSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DrawablePainter extends androidx.compose.ui.graphics.painter.Painter implements androidx.compose.runtime.RememberObserver {
    public static final int $stable = 8;

    /* renamed from: callback$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy callback;

    /* renamed from: drawInvalidateTick$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState drawInvalidateTick;
    private final android.graphics.drawable.Drawable drawable;

    /* renamed from: drawableIntrinsicSize$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState drawableIntrinsicSize;

    public final android.graphics.drawable.Drawable getDrawable() {
        return this.drawable;
    }

    public DrawablePainter(android.graphics.drawable.Drawable drawable) {
        long intrinsicSize;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        this.drawable = drawable;
        this.drawInvalidateTick = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        intrinsicSize = com.google.accompanist.drawablepainter.DrawablePainterKt.getIntrinsicSize(drawable);
        this.drawableIntrinsicSize = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Size.m5809boximpl(intrinsicSize), null, 2, null);
        this.callback = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1 callback_delegate$lambda$0;
                callback_delegate$lambda$0 = com.google.accompanist.drawablepainter.DrawablePainter.callback_delegate$lambda$0(com.google.accompanist.drawablepainter.DrawablePainter.this);
                return callback_delegate$lambda$0;
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
    private final long m10186getDrawableIntrinsicSizeNHjbRc() {
        return ((androidx.compose.ui.geometry.Size) this.drawableIntrinsicSize.getValue()).m5826unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDrawableIntrinsicSize-uvyYCjk, reason: not valid java name */
    public final void m10187setDrawableIntrinsicSizeuvyYCjk(long j) {
        this.drawableIntrinsicSize.setValue(androidx.compose.ui.geometry.Size.m5809boximpl(j));
    }

    private final android.graphics.drawable.Drawable.Callback getCallback() {
        return (android.graphics.drawable.Drawable.Callback) this.callback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1] */
    public static final com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1 callback_delegate$lambda$0(final com.google.accompanist.drawablepainter.DrawablePainter drawablePainter) {
        return new android.graphics.drawable.Drawable.Callback() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2$1
            @Override // android.graphics.drawable.Drawable.Callback
            public final void invalidateDrawable(android.graphics.drawable.Drawable d) {
                int drawInvalidateTick;
                long intrinsicSize;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "");
                drawInvalidateTick = com.google.accompanist.drawablepainter.DrawablePainter.this.getDrawInvalidateTick();
                com.google.accompanist.drawablepainter.DrawablePainter.this.setDrawInvalidateTick(drawInvalidateTick + 1);
                com.google.accompanist.drawablepainter.DrawablePainter drawablePainter2 = com.google.accompanist.drawablepainter.DrawablePainter.this;
                intrinsicSize = com.google.accompanist.drawablepainter.DrawablePainterKt.getIntrinsicSize(drawablePainter2.getDrawable());
                drawablePainter2.m10187setDrawableIntrinsicSizeuvyYCjk(intrinsicSize);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void scheduleDrawable(android.graphics.drawable.Drawable d, java.lang.Runnable what, long time) {
                android.os.Handler main_handler;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(what, "");
                main_handler = com.google.accompanist.drawablepainter.DrawablePainterKt.getMAIN_HANDLER();
                main_handler.postAtTime(what, time);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void unscheduleDrawable(android.graphics.drawable.Drawable d, java.lang.Runnable what) {
                android.os.Handler main_handler;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(what, "");
                main_handler = com.google.accompanist.drawablepainter.DrawablePainterKt.getMAIN_HANDLER();
                main_handler.removeCallbacks(what);
            }
        };
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.drawable.setCallback(getCallback());
        this.drawable.setVisible(true, true);
        java.lang.Object obj = this.drawable;
        if (obj instanceof android.graphics.drawable.Animatable) {
            ((android.graphics.drawable.Animatable) obj).start();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        onForgotten();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        java.lang.Object obj = this.drawable;
        if (obj instanceof android.graphics.drawable.Animatable) {
            ((android.graphics.drawable.Animatable) obj).stop();
        }
        this.drawable.setVisible(false, false);
        this.drawable.setCallback(null);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float alpha) {
        this.drawable.setAlpha(kotlin.ranges.RangesKt.coerceIn(kotlin.math.MathKt.roundToInt(alpha * 255.0f), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(androidx.compose.ui.graphics.ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter != null ? androidx.compose.ui.graphics.AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutDirection, "");
        android.graphics.drawable.Drawable drawable = this.drawable;
        int i = com.google.accompanist.drawablepainter.DrawablePainter.WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return drawable.setLayoutDirection(i2);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        return m10186getDrawableIntrinsicSizeNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        getDrawInvalidateTick();
        try {
            canvas.save();
            if (android.os.Build.VERSION.SDK_INT >= 28 && android.os.Build.VERSION.SDK_INT < 31 && (this.drawable instanceof android.graphics.drawable.AnimatedImageDrawable)) {
                canvas.scale(androidx.compose.ui.geometry.Size.m5821getWidthimpl(drawScope.mo6531getSizeNHjbRc()) / androidx.compose.ui.geometry.Size.m5821getWidthimpl(getIntrinsicSize()), androidx.compose.ui.geometry.Size.m5818getHeightimpl(drawScope.mo6531getSizeNHjbRc()) / androidx.compose.ui.geometry.Size.m5818getHeightimpl(getIntrinsicSize()));
            } else {
                this.drawable.setBounds(0, 0, kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m5821getWidthimpl(drawScope.mo6531getSizeNHjbRc())), kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Size.m5818getHeightimpl(drawScope.mo6531getSizeNHjbRc())));
            }
            this.drawable.draw(androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas));
        } finally {
            canvas.restore();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
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
}
