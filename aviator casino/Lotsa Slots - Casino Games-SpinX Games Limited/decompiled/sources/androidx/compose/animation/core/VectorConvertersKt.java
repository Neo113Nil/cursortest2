package androidx.compose.animation.core;

/* compiled from: VectorConverters.kt */
@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H,0\u0001\"\u0004\b\u0000\u0010+\"\b\b\u0001\u0010,*\u00020-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u0002H+\u0012\u0004\u0012\u0002H,0/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H+0/\u001a \u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\b2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\bH\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0001*\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001b\"!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001d\"!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001f\"!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020 8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010!\"!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\"8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010#\"!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u0001*\u00020$8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010%\"!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020&8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010'\"!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0001*\u00020(8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010)¨\u00065"}, d2 = {"DpOffsetToVector", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "DpToVector", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/animation/core/AnimationVector1D;", "FloatToVector", "", "IntOffsetToVector", "Landroidx/compose/ui/unit/IntOffset;", "IntSizeToVector", "Landroidx/compose/ui/unit/IntSize;", "IntToVector", "", "OffsetToVector", "Landroidx/compose/ui/geometry/Offset;", "RectToVector", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "SizeToVector", "Landroidx/compose/ui/geometry/Size;", "VectorConverter", "Landroidx/compose/ui/geometry/Offset$Companion;", "getVectorConverter", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Size$Companion;", "(Landroidx/compose/ui/geometry/Size$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/Dp$Companion;", "(Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntSize$Companion;", "(Landroidx/compose/ui/unit/IntSize$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Lkotlin/Float$Companion;", "(Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/IntCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;", "TwoWayConverter", "T", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "convertToVector", "Lkotlin/Function1;", "convertFromVector", "lerp", "start", "stop", "fraction", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorConvertersKt {
    private static final androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> FloatToVector = TwoWayConverter(new kotlin.jvm.functions.Function1<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$1
        public final androidx.compose.animation.core.AnimationVector1D invoke(float f) {
            return new androidx.compose.animation.core.AnimationVector1D(f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.AnimationVector1D invoke(java.lang.Float f) {
            return invoke(f.floatValue());
        }
    }, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector1D, java.lang.Float>() { // from class: androidx.compose.animation.core.VectorConvertersKt$FloatToVector$2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Float invoke(androidx.compose.animation.core.AnimationVector1D animationVector1D) {
            return java.lang.Float.valueOf(animationVector1D.getValue());
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<java.lang.Integer, androidx.compose.animation.core.AnimationVector1D> IntToVector = TwoWayConverter(new kotlin.jvm.functions.Function1<java.lang.Integer, androidx.compose.animation.core.AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$1
        public final androidx.compose.animation.core.AnimationVector1D invoke(int i) {
            return new androidx.compose.animation.core.AnimationVector1D(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.AnimationVector1D invoke(java.lang.Integer num) {
            return invoke(num.intValue());
        }
    }, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector1D, java.lang.Integer>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntToVector$2
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Integer invoke(androidx.compose.animation.core.AnimationVector1D animationVector1D) {
            return java.lang.Integer.valueOf((int) animationVector1D.getValue());
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> DpToVector = TwoWayConverter(new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.AnimationVector1D invoke(androidx.compose.ui.unit.Dp dp) {
            return m169invoke0680j_4(dp.m4492unboximpl());
        }

        /* renamed from: invoke-0680j_4, reason: not valid java name */
        public final androidx.compose.animation.core.AnimationVector1D m169invoke0680j_4(float f) {
            return new androidx.compose.animation.core.AnimationVector1D(f);
        }
    }, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector1D, androidx.compose.ui.unit.Dp>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.Dp invoke(androidx.compose.animation.core.AnimationVector1D animationVector1D) {
            return androidx.compose.ui.unit.Dp.m4476boximpl(m170invokeu2uoSUM(animationVector1D));
        }

        /* renamed from: invoke-u2uoSUM, reason: not valid java name */
        public final float m170invokeu2uoSUM(androidx.compose.animation.core.AnimationVector1D animationVector1D) {
            return androidx.compose.ui.unit.Dp.m4478constructorimpl(animationVector1D.getValue());
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.DpOffset, androidx.compose.animation.core.AnimationVector2D> DpOffsetToVector = TwoWayConverter(new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.DpOffset, androidx.compose.animation.core.AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.AnimationVector2D invoke(androidx.compose.ui.unit.DpOffset dpOffset) {
            return m167invokejoFl9I(dpOffset.getPackedValue());
        }

        /* renamed from: invoke-jo-Fl9I, reason: not valid java name */
        public final androidx.compose.animation.core.AnimationVector2D m167invokejoFl9I(long j) {
            return new androidx.compose.animation.core.AnimationVector2D(androidx.compose.ui.unit.DpOffset.m4539getXD9Ej5fM(j), androidx.compose.ui.unit.DpOffset.m4541getYD9Ej5fM(j));
        }
    }, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector2D, androidx.compose.ui.unit.DpOffset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$DpOffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.DpOffset invoke(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.unit.DpOffset.m4533boximpl(m168invokegVRvYmI(animationVector2D));
        }

        /* renamed from: invoke-gVRvYmI, reason: not valid java name */
        public final long m168invokegVRvYmI(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.unit.DpKt.m4499DpOffsetYgX7TsA(androidx.compose.ui.unit.Dp.m4478constructorimpl(animationVector2D.getV1()), androidx.compose.ui.unit.Dp.m4478constructorimpl(animationVector2D.getV2()));
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Size, androidx.compose.animation.core.AnimationVector2D> SizeToVector = TwoWayConverter(new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Size, androidx.compose.animation.core.AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.AnimationVector2D invoke(androidx.compose.ui.geometry.Size size) {
            return m177invokeuvyYCjk(size.getPackedValue());
        }

        /* renamed from: invoke-uvyYCjk, reason: not valid java name */
        public final androidx.compose.animation.core.AnimationVector2D m177invokeuvyYCjk(long j) {
            return new androidx.compose.animation.core.AnimationVector2D(androidx.compose.ui.geometry.Size.m1940getWidthimpl(j), androidx.compose.ui.geometry.Size.m1937getHeightimpl(j));
        }
    }, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector2D, androidx.compose.ui.geometry.Size>() { // from class: androidx.compose.animation.core.VectorConvertersKt$SizeToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.geometry.Size invoke(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.geometry.Size.m1928boximpl(m178invoke7Ah8Wj8(animationVector2D));
        }

        /* renamed from: invoke-7Ah8Wj8, reason: not valid java name */
        public final long m178invoke7Ah8Wj8(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.geometry.SizeKt.Size(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> OffsetToVector = TwoWayConverter(new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.AnimationVector2D invoke(androidx.compose.ui.geometry.Offset offset) {
            return m175invokek4lQ0M(offset.getPackedValue());
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final androidx.compose.animation.core.AnimationVector2D m175invokek4lQ0M(long j) {
            return new androidx.compose.animation.core.AnimationVector2D(androidx.compose.ui.geometry.Offset.m1871getXimpl(j), androidx.compose.ui.geometry.Offset.m1872getYimpl(j));
        }
    }, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector2D, androidx.compose.ui.geometry.Offset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$OffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.geometry.Offset invoke(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.geometry.Offset.m1860boximpl(m176invoketuRUvjQ(animationVector2D));
        }

        /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
        public final long m176invoketuRUvjQ(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.geometry.OffsetKt.Offset(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> IntOffsetToVector = TwoWayConverter(new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.AnimationVector2D invoke(androidx.compose.ui.unit.IntOffset intOffset) {
            return m171invokegyyYBs(intOffset.getPackedValue());
        }

        /* renamed from: invoke--gyyYBs, reason: not valid java name */
        public final androidx.compose.animation.core.AnimationVector2D m171invokegyyYBs(long j) {
            return new androidx.compose.animation.core.AnimationVector2D(androidx.compose.ui.unit.IntOffset.m4610getXimpl(j), androidx.compose.ui.unit.IntOffset.m4611getYimpl(j));
        }
    }, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector2D, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntOffsetToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.unit.IntOffset.m4601boximpl(m172invokeBjo55l4(animationVector2D));
        }

        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
        public final long m172invokeBjo55l4(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.unit.IntOffsetKt.IntOffset(kotlin.math.MathKt.roundToInt(animationVector2D.getV1()), kotlin.math.MathKt.roundToInt(animationVector2D.getV2()));
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> IntSizeToVector = TwoWayConverter(new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.AnimationVector2D invoke(androidx.compose.ui.unit.IntSize intSize) {
            return m173invokeozmzZPI(intSize.getPackedValue());
        }

        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final androidx.compose.animation.core.AnimationVector2D m173invokeozmzZPI(long j) {
            return new androidx.compose.animation.core.AnimationVector2D(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j));
        }
    }, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector2D, androidx.compose.ui.unit.IntSize>() { // from class: androidx.compose.animation.core.VectorConvertersKt$IntSizeToVector$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntSize invoke(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.unit.IntSize.m4644boximpl(m174invokeYEO4UFw(animationVector2D));
        }

        /* renamed from: invoke-YEO4UFw, reason: not valid java name */
        public final long m174invokeYEO4UFw(androidx.compose.animation.core.AnimationVector2D animationVector2D) {
            return androidx.compose.ui.unit.IntSizeKt.IntSize(kotlin.math.MathKt.roundToInt(animationVector2D.getV1()), kotlin.math.MathKt.roundToInt(animationVector2D.getV2()));
        }
    });
    private static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> RectToVector = TwoWayConverter(new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$1
        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.core.AnimationVector4D invoke(androidx.compose.ui.geometry.Rect rect) {
            return new androidx.compose.animation.core.AnimationVector4D(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        }
    }, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector4D, androidx.compose.ui.geometry.Rect>() { // from class: androidx.compose.animation.core.VectorConvertersKt$RectToVector$2
        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.ui.geometry.Rect invoke(androidx.compose.animation.core.AnimationVector4D animationVector4D) {
            return new androidx.compose.ui.geometry.Rect(animationVector4D.getV1(), animationVector4D.getV2(), animationVector4D.getV3(), animationVector4D.getV4());
        }
    });

    public static final float lerp(float f, float f2, float f3) {
        return (f * (1 - f3)) + (f2 * f3);
    }

    public static final <T, V extends androidx.compose.animation.core.AnimationVector> androidx.compose.animation.core.TwoWayConverter<T, V> TwoWayConverter(kotlin.jvm.functions.Function1<? super T, ? extends V> function1, kotlin.jvm.functions.Function1<? super V, ? extends T> function12) {
        return new androidx.compose.animation.core.TwoWayConverterImpl(function1, function12);
    }

    public static final androidx.compose.animation.core.TwoWayConverter<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getVectorConverter(kotlin.jvm.internal.FloatCompanionObject floatCompanionObject) {
        return FloatToVector;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<java.lang.Integer, androidx.compose.animation.core.AnimationVector1D> getVectorConverter(kotlin.jvm.internal.IntCompanionObject intCompanionObject) {
        return IntToVector;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Rect, androidx.compose.animation.core.AnimationVector4D> getVectorConverter(androidx.compose.ui.geometry.Rect.Companion companion) {
        return RectToVector;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> getVectorConverter(androidx.compose.ui.unit.Dp.Companion companion) {
        return DpToVector;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.DpOffset, androidx.compose.animation.core.AnimationVector2D> getVectorConverter(androidx.compose.ui.unit.DpOffset.Companion companion) {
        return DpOffsetToVector;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Size, androidx.compose.animation.core.AnimationVector2D> getVectorConverter(androidx.compose.ui.geometry.Size.Companion companion) {
        return SizeToVector;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> getVectorConverter(androidx.compose.ui.geometry.Offset.Companion companion) {
        return OffsetToVector;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> getVectorConverter(androidx.compose.ui.unit.IntOffset.Companion companion) {
        return IntOffsetToVector;
    }

    public static final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.AnimationVector2D> getVectorConverter(androidx.compose.ui.unit.IntSize.Companion companion) {
        return IntSizeToVector;
    }
}
