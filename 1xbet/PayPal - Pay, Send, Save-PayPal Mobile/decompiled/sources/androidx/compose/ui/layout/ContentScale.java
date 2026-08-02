package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ContentScale;", "", "Landroidx/compose/ui/geometry/Size;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/ScaleFactor;", "computeScaleFactor-H7hwNQA", "(JJ)J", "computeScaleFactor", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContentScale {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.layout.ContentScale.Companion INSTANCE = androidx.compose.ui.layout.ContentScale.Companion.getHighSpeedVideoFpsRanges;

    /* renamed from: computeScaleFactor-H7hwNQA, reason: not valid java name */
    long mo7350computeScaleFactorH7hwNQA(long srcSize, long dstSize);

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0010\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00168\u0007¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/ContentScale$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/layout/ContentScale;", "Crop", "Landroidx/compose/ui/layout/ContentScale;", "getCrop", "()Landroidx/compose/ui/layout/ContentScale;", "getCrop$annotations", "Fit", "getFit", "getFit$annotations", "FillHeight", "getFillHeight", "getFillHeight$annotations", "FillWidth", "getFillWidth", "getFillWidth$annotations", "Inside", "getInside", "getInside$annotations", "Landroidx/compose/ui/layout/FixedScale;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Landroidx/compose/ui/layout/FixedScale;", "getNone", "()Landroidx/compose/ui/layout/FixedScale;", "getNone$annotations", "FillBounds", "getFillBounds", "getFillBounds$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.layout.ContentScale.Companion getHighSpeedVideoFpsRanges = new androidx.compose.ui.layout.ContentScale.Companion();
        private static final androidx.compose.ui.layout.ContentScale Crop = new androidx.compose.ui.layout.ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public final long mo7350computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.ui.layout.ContentScaleKt.getHighSpeedVideoSizes(srcSize, dstSize);
                return androidx.compose.ui.layout.ScaleFactor.m7452constructorimpl((java.lang.Float.floatToRawIntBits(highSpeedVideoSizes) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(highSpeedVideoSizes)));
            }
        };
        private static final androidx.compose.ui.layout.ContentScale Fit = new androidx.compose.ui.layout.ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public final long mo7350computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.ui.layout.ContentScaleKt.getHighSpeedVideoFpsRangesFor(srcSize, dstSize);
                return androidx.compose.ui.layout.ScaleFactor.m7452constructorimpl((java.lang.Float.floatToRawIntBits(highSpeedVideoFpsRangesFor) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(highSpeedVideoFpsRangesFor)));
            }
        };
        private static final androidx.compose.ui.layout.ContentScale FillHeight = new androidx.compose.ui.layout.ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public final long mo7350computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (dstSize & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (srcSize & 4294967295L));
                return androidx.compose.ui.layout.ScaleFactor.m7452constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
            }
        };
        private static final androidx.compose.ui.layout.ContentScale FillWidth = new androidx.compose.ui.layout.ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public final long mo7350computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (dstSize >> 32)) / java.lang.Float.intBitsToFloat((int) (srcSize >> 32));
                return androidx.compose.ui.layout.ScaleFactor.m7452constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L));
            }
        };
        private static final androidx.compose.ui.layout.ContentScale Inside = new androidx.compose.ui.layout.ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public final long mo7350computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float highSpeedVideoFpsRangesFor;
                if (java.lang.Float.intBitsToFloat((int) (srcSize >> 32)) > java.lang.Float.intBitsToFloat((int) (dstSize >> 32)) || java.lang.Float.intBitsToFloat((int) (srcSize & 4294967295L)) > java.lang.Float.intBitsToFloat((int) (dstSize & 4294967295L))) {
                    highSpeedVideoFpsRangesFor = androidx.compose.ui.layout.ContentScaleKt.getHighSpeedVideoFpsRangesFor(srcSize, dstSize);
                    return androidx.compose.ui.layout.ScaleFactor.m7452constructorimpl((java.lang.Float.floatToRawIntBits(highSpeedVideoFpsRangesFor) << 32) | (java.lang.Float.floatToRawIntBits(highSpeedVideoFpsRangesFor) & 4294967295L));
                }
                return androidx.compose.ui.layout.ScaleFactor.m7452constructorimpl((java.lang.Float.floatToRawIntBits(1.0f) << 32) | (java.lang.Float.floatToRawIntBits(1.0f) & 4294967295L));
            }
        };
        private static final androidx.compose.ui.layout.FixedScale None = new androidx.compose.ui.layout.FixedScale(1.0f);
        private static final androidx.compose.ui.layout.ContentScale FillBounds = new androidx.compose.ui.layout.ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public final long mo7350computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (dstSize >> 32)) / java.lang.Float.intBitsToFloat((int) (srcSize >> 32));
                float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (dstSize & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (srcSize & 4294967295L));
                return androidx.compose.ui.layout.ScaleFactor.m7452constructorimpl((java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
            }
        };

        public static /* synthetic */ void getCrop$annotations() {
        }

        public static /* synthetic */ void getFillBounds$annotations() {
        }

        public static /* synthetic */ void getFillHeight$annotations() {
        }

        public static /* synthetic */ void getFillWidth$annotations() {
        }

        public static /* synthetic */ void getFit$annotations() {
        }

        public static /* synthetic */ void getInside$annotations() {
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.ui.layout.ContentScale getCrop() {
            return Crop;
        }

        public final androidx.compose.ui.layout.ContentScale getFit() {
            return Fit;
        }

        public final androidx.compose.ui.layout.ContentScale getFillHeight() {
            return FillHeight;
        }

        public final androidx.compose.ui.layout.ContentScale getFillWidth() {
            return FillWidth;
        }

        public final androidx.compose.ui.layout.ContentScale getInside() {
            return Inside;
        }

        public final androidx.compose.ui.layout.FixedScale getNone() {
            return None;
        }

        public final androidx.compose.ui.layout.ContentScale getFillBounds() {
            return FillBounds;
        }
    }
}
