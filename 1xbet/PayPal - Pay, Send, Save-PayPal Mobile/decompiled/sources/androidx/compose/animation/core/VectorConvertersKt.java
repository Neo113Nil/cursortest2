package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a(\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0080\b¢\u0006\u0004\b\r\u0010\u000e\"!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u0006*\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0006*\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0016\" \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\" \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\"!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u0006*\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001e\"!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00100\u0006*\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010!\"!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0006*\u00020\"8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010%\"!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020$0\u0006*\u00020&8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010(\"!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$0\u0006*\u00020)8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010+\"!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020$0\u0006*\u00020,8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010.\"!\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020$0\u0006*\u00020/8G¢\u0006\u0006\u001a\u0004\b\u0011\u00101\" \u00103\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00100\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0018\" \u00104\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018\" \u00102\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020$0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0018\" \u00106\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0018\" \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020$0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0018\" \u00105\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020$0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0018\" \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0018"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Landroidx/compose/animation/core/TwoWayConverter;", "TwoWayConverter", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/core/TwoWayConverter;", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "lerp", "(FFF)F", "Lkotlin/Float$Companion;", "Landroidx/compose/animation/core/AnimationVector1D;", "getVectorConverter", "(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;", "VectorConverter", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/IntCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/core/TwoWayConverter;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "Landroidx/compose/ui/geometry/Rect$Companion;", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/Dp$Companion;", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Size$Companion;", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Size$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntSize$Companion;", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/unit/IntSize$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getInputFormats", "getInputSizeshNQ4ISI", "getOutputMinFrameDuration"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorConvertersKt {
    private static final androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> Camera2StreamConfigurationMap = TwoWayConverter(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.animation.core.AnimationVector1D highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.VectorConvertersKt.getHighResolutionOutputSizeshNQ4ISI(((java.lang.Float) obj).floatValue());
            return highResolutionOutputSizeshNQ4ISI;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda17
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            float highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.animation.core.VectorConvertersKt.getHighSpeedVideoFpsRanges((androidx.compose.animation.core.AnimationVector1D) obj);
            return java.lang.Float.valueOf(highSpeedVideoFpsRanges);
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<java.lang.Integer, androidx.compose.animation.core.AnimationVector1D> getOutputFormats = TwoWayConverter(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.animation.core.AnimationVector1D Camera2StreamConfigurationMap2;
            Camera2StreamConfigurationMap2 = androidx.compose.animation.core.VectorConvertersKt.Camera2StreamConfigurationMap(((java.lang.Integer) obj).intValue());
            return Camera2StreamConfigurationMap2;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            int highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.VectorConvertersKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.animation.core.AnimationVector1D) obj);
            return java.lang.Integer.valueOf(highResolutionOutputSizeshNQ4ISI);
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoSizes = TwoWayConverter(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.animation.core.AnimationVector1D highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.VectorConvertersKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.unit.Dp) obj);
            return highResolutionOutputSizeshNQ4ISI;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.ui.unit.Dp Camera2StreamConfigurationMap2;
            Camera2StreamConfigurationMap2 = androidx.compose.animation.core.VectorConvertersKt.Camera2StreamConfigurationMap((androidx.compose.animation.core.AnimationVector1D) obj);
            return Camera2StreamConfigurationMap2;
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.DpOffset, androidx.compose.animation.core.AnimationVector2D> getHighResolutionOutputSizeshNQ4ISI = TwoWayConverter(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.animation.core.AnimationVector2D Camera2StreamConfigurationMap2;
            Camera2StreamConfigurationMap2 = androidx.compose.animation.core.VectorConvertersKt.Camera2StreamConfigurationMap((androidx.compose.ui.unit.DpOffset) obj);
            return Camera2StreamConfigurationMap2;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.ui.unit.DpOffset highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.animation.core.VectorConvertersKt.getHighSpeedVideoSizes((androidx.compose.animation.core.AnimationVector2D) obj);
            return highSpeedVideoSizes;
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Size, androidx.compose.animation.core.AnimationVector2D> getInputFormats = TwoWayConverter(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.animation.core.AnimationVector2D highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.animation.core.VectorConvertersKt.getHighSpeedVideoFpsRangesFor((androidx.compose.ui.geometry.Size) obj);
            return highSpeedVideoFpsRangesFor;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.ui.geometry.Size Camera2StreamConfigurationMap2;
            Camera2StreamConfigurationMap2 = androidx.compose.animation.core.VectorConvertersKt.Camera2StreamConfigurationMap((androidx.compose.animation.core.AnimationVector2D) obj);
            return Camera2StreamConfigurationMap2;
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> getInputSizeshNQ4ISI = TwoWayConverter(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.animation.core.AnimationVector2D highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.VectorConvertersKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.geometry.Offset) obj);
            return highResolutionOutputSizeshNQ4ISI;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.ui.geometry.Offset highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.animation.core.VectorConvertersKt.getHighSpeedVideoFpsRangesFor((androidx.compose.animation.core.AnimationVector2D) obj);
            return highSpeedVideoFpsRangesFor;
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> getHighSpeedVideoFpsRangesFor = TwoWayConverter(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.animation.core.AnimationVector2D highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.animation.core.VectorConvertersKt.getHighSpeedVideoSizes((androidx.compose.ui.unit.IntOffset) obj);
            return highSpeedVideoSizes;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda12
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.ui.unit.IntOffset highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.animation.core.VectorConvertersKt.getHighSpeedVideoFpsRanges((androidx.compose.animation.core.AnimationVector2D) obj);
            return highSpeedVideoFpsRanges;
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> getHighSpeedVideoFpsRanges = TwoWayConverter(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda13
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.animation.core.AnimationVector2D highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.animation.core.VectorConvertersKt.getHighSpeedVideoSizes((androidx.compose.ui.unit.IntSize) obj);
            return highSpeedVideoSizes;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda14
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.ui.unit.IntSize highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.VectorConvertersKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.animation.core.AnimationVector2D) obj);
            return highResolutionOutputSizeshNQ4ISI;
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> getOutputMinFrameDuration = TwoWayConverter(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda15
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.animation.core.AnimationVector4D highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.animation.core.VectorConvertersKt.getHighSpeedVideoFpsRangesFor((androidx.compose.ui.geometry.Rect) obj);
            return highSpeedVideoFpsRangesFor;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.VectorConvertersKt$$ExternalSyntheticLambda16
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.ui.geometry.Rect highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.VectorConvertersKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.animation.core.AnimationVector4D) obj);
            return highResolutionOutputSizeshNQ4ISI;
        }
    });

    public static final float lerp(float f, float f2, float f3) {
        return (f * (1.0f - f3)) + (f2 * f3);
    }

    public static final <T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.TwoWayConverter<T, V> TwoWayConverter(kotlin.jvm.functions.Function1<? super T, ? extends V> function1, kotlin.jvm.functions.Function1<? super V, ? extends T> function12) {
        return new androidx.compose.animation.core.TwoWayConverterImpl(function1, function12);
    }

    public static final androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getVectorConverter(kotlin.jvm.internal.FloatCompanionObject floatCompanionObject) {
        return Camera2StreamConfigurationMap;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<java.lang.Integer, androidx.compose.animation.core.AnimationVector1D> getVectorConverter(kotlin.jvm.internal.IntCompanionObject intCompanionObject) {
        return getOutputFormats;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationVector1D getHighResolutionOutputSizeshNQ4ISI(float f) {
        return new androidx.compose.animation.core.AnimationVector1D(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRanges(androidx.compose.animation.core.AnimationVector1D animationVector1D) {
        return animationVector1D.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationVector1D Camera2StreamConfigurationMap(int i) {
        return new androidx.compose.animation.core.AnimationVector1D(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.AnimationVector1D animationVector1D) {
        return (int) animationVector1D.getValue();
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> getVectorConverter(androidx.compose.ui.geometry.Rect.Companion companion) {
        return getOutputMinFrameDuration;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> getVectorConverter(androidx.compose.ui.unit.Dp.Companion companion) {
        return getHighSpeedVideoSizes;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.DpOffset, androidx.compose.animation.core.AnimationVector2D> getVectorConverter(androidx.compose.ui.unit.DpOffset.Companion companion) {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Size, androidx.compose.animation.core.AnimationVector2D> getVectorConverter(androidx.compose.ui.geometry.Size.Companion companion) {
        return getInputFormats;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> getVectorConverter(androidx.compose.ui.geometry.Offset.Companion companion) {
        return getInputSizeshNQ4ISI;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> getVectorConverter(androidx.compose.ui.unit.IntOffset.Companion companion) {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> getVectorConverter(androidx.compose.ui.unit.IntSize.Companion companion) {
        return getHighSpeedVideoFpsRanges;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationVector1D getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.unit.Dp dp) {
        return new androidx.compose.animation.core.AnimationVector1D(dp.m8615unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.Dp Camera2StreamConfigurationMap(androidx.compose.animation.core.AnimationVector1D animationVector1D) {
        return androidx.compose.ui.unit.Dp.m8599boximpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(animationVector1D.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationVector2D Camera2StreamConfigurationMap(androidx.compose.ui.unit.DpOffset dpOffset) {
        return new androidx.compose.animation.core.AnimationVector2D(androidx.compose.ui.unit.DpOffset.m8662getXD9Ej5fM(dpOffset.m8670unboximpl()), androidx.compose.ui.unit.DpOffset.m8664getYD9Ej5fM(dpOffset.m8670unboximpl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.DpOffset getHighSpeedVideoSizes(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(animationVector2D.getV1());
        float m8601constructorimpl2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(animationVector2D.getV2());
        return androidx.compose.ui.unit.DpOffset.m8656boximpl(androidx.compose.ui.unit.DpOffset.m8657constructorimpl((java.lang.Float.floatToRawIntBits(m8601constructorimpl) << 32) | (java.lang.Float.floatToRawIntBits(m8601constructorimpl2) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationVector2D getHighSpeedVideoFpsRangesFor(androidx.compose.ui.geometry.Size size) {
        return new androidx.compose.animation.core.AnimationVector2D(java.lang.Float.intBitsToFloat((int) (size.m5826unboximpl() >> 32)), java.lang.Float.intBitsToFloat((int) (size.m5826unboximpl() & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Size Camera2StreamConfigurationMap(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
        float v1 = animationVector2D.getV1();
        float v2 = animationVector2D.getV2();
        return androidx.compose.ui.geometry.Size.m5809boximpl(androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(v1) << 32) | (java.lang.Float.floatToRawIntBits(v2) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationVector2D getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.geometry.Offset offset) {
        return new androidx.compose.animation.core.AnimationVector2D(java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() >> 32)), java.lang.Float.intBitsToFloat((int) (offset.m5762unboximpl() & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Offset getHighSpeedVideoFpsRangesFor(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
        float v1 = animationVector2D.getV1();
        float v2 = animationVector2D.getV2();
        return androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(v1) << 32) | (java.lang.Float.floatToRawIntBits(v2) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationVector2D getHighSpeedVideoSizes(androidx.compose.ui.unit.IntOffset intOffset) {
        return new androidx.compose.animation.core.AnimationVector2D(androidx.compose.ui.unit.IntOffset.m8729getXimpl(intOffset.m8738unboximpl()), androidx.compose.ui.unit.IntOffset.m8730getYimpl(intOffset.m8738unboximpl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.IntOffset getHighSpeedVideoFpsRanges(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
        return androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffset.m8723constructorimpl((java.lang.Math.round(animationVector2D.getV1()) << 32) | (java.lang.Math.round(animationVector2D.getV2()) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationVector2D getHighSpeedVideoSizes(androidx.compose.ui.unit.IntSize intSize) {
        return new androidx.compose.animation.core.AnimationVector2D((int) (intSize.m8776unboximpl() >> 32), (int) (intSize.m8776unboximpl() & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.unit.IntSize getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
        int round = java.lang.Math.round(animationVector2D.getV1());
        if (round < 0) {
            round = 0;
        }
        return androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.ui.unit.IntSize.m8767constructorimpl(((java.lang.Math.round(animationVector2D.getV2()) >= 0 ? r6 : 0) & 4294967295L) | (round << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.AnimationVector4D getHighSpeedVideoFpsRangesFor(androidx.compose.ui.geometry.Rect rect) {
        return new androidx.compose.animation.core.AnimationVector4D(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Rect getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.AnimationVector4D animationVector4D) {
        return new androidx.compose.ui.geometry.Rect(animationVector4D.getV1(), animationVector4D.getV2(), animationVector4D.getV3(), animationVector4D.getV4());
    }
}
