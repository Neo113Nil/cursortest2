package coil3.graphics.internal;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\t\u001a\u00020\b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0016\u001a\u00020\u0013*\u00020\u00128AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcoil3/gif/AnimatedTransformation;", "Landroid/graphics/PostProcessor;", "asPostProcessor", "(Lcoil3/gif/AnimatedTransformation;)Landroid/graphics/PostProcessor;", "Lkotlin/Function0;", "", "onStart", "onEnd", "Landroid/graphics/drawable/Animatable2$AnimationCallback;", "animatable2CallbackOf", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/graphics/drawable/Animatable2$AnimationCallback;", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;", "animatable2CompatCallbackOf", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;", "Lokio/BufferedSource;", "Ljava/nio/ByteBuffer;", "squashToDirectByteBuffer", "(Lokio/BufferedSource;)Ljava/nio/ByteBuffer;", "Lcoil3/gif/PixelOpacity;", "", "getFlag", "(Lcoil3/gif/PixelOpacity;)I", "flag"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UtilsKt {
    public static final android.graphics.PostProcessor asPostProcessor(final coil3.graphics.AnimatedTransformation animatedTransformation) {
        return new android.graphics.PostProcessor() { // from class: coil3.gif.internal.UtilsKt$$ExternalSyntheticLambda0
            @Override // android.graphics.PostProcessor
            public final int onPostProcess(android.graphics.Canvas canvas) {
                int flag;
                flag = coil3.graphics.internal.UtilsKt.getFlag(coil3.graphics.AnimatedTransformation.this.transform(canvas));
                return flag;
            }
        };
    }

    public static final int getFlag(coil3.graphics.PixelOpacity pixelOpacity) {
        int i = coil3.gif.internal.UtilsKt.WhenMappings.$EnumSwitchMapping$0[pixelOpacity.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return -3;
        }
        if (i == 3) {
            return -1;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final android.graphics.drawable.Animatable2.AnimationCallback animatable2CallbackOf(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        return new android.graphics.drawable.Animatable2.AnimationCallback() { // from class: coil3.gif.internal.UtilsKt$animatable2CallbackOf$1
            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public final void onAnimationStart(android.graphics.drawable.Drawable drawable) {
                kotlin.jvm.functions.Function0<kotlin.Unit> function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public final void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
                kotlin.jvm.functions.Function0<kotlin.Unit> function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
            }
        };
    }

    public static final androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animatable2CompatCallbackOf(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        return new androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback() { // from class: coil3.gif.internal.UtilsKt$animatable2CompatCallbackOf$1
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public final void onAnimationStart(android.graphics.drawable.Drawable drawable) {
                kotlin.jvm.functions.Function0<kotlin.Unit> function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
            }

            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public final void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
                kotlin.jvm.functions.Function0<kotlin.Unit> function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
            }
        };
    }

    public static final java.nio.ByteBuffer squashToDirectByteBuffer(okio.BufferedSource bufferedSource) {
        bufferedSource.request(Long.MAX_VALUE);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect((int) bufferedSource.getBuffer().size());
        while (!bufferedSource.getBuffer().exhausted()) {
            bufferedSource.getBuffer().read(allocateDirect);
        }
        allocateDirect.flip();
        return allocateDirect;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[coil3.graphics.PixelOpacity.values().length];
            try {
                iArr[coil3.graphics.PixelOpacity.UNCHANGED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[coil3.graphics.PixelOpacity.TRANSLUCENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[coil3.graphics.PixelOpacity.OPAQUE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
