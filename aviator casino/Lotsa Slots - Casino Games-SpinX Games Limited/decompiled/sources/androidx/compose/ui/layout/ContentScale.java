package androidx.compose.ui.layout;

/* compiled from: ContentScale.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ContentScale;", "", "computeScaleFactor", "Landroidx/compose/ui/layout/ScaleFactor;", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeScaleFactor-H7hwNQA", "(JJ)J", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContentScale {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.layout.ContentScale.Companion INSTANCE = androidx.compose.ui.layout.ContentScale.Companion.$$INSTANCE;

    /* renamed from: computeScaleFactor-H7hwNQA, reason: not valid java name */
    long mo3393computeScaleFactorH7hwNQA(long srcSize, long dstSize);

    /* compiled from: ContentScale.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/layout/ContentScale$Companion;", "", "()V", "Crop", "Landroidx/compose/ui/layout/ContentScale;", "getCrop$annotations", "getCrop", "()Landroidx/compose/ui/layout/ContentScale;", "FillBounds", "getFillBounds$annotations", "getFillBounds", "FillHeight", "getFillHeight$annotations", "getFillHeight", "FillWidth", "getFillWidth$annotations", "getFillWidth", "Fit", "getFit$annotations", "getFit", "Inside", "getInside$annotations", "getInside", "None", "Landroidx/compose/ui/layout/FixedScale;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/layout/FixedScale;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.layout.ContentScale.Companion $$INSTANCE = new androidx.compose.ui.layout.ContentScale.Companion();
        private static final androidx.compose.ui.layout.ContentScale Crop = new androidx.compose.ui.layout.ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo3393computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float m3399computeFillMaxDimensioniLBOSCw;
                m3399computeFillMaxDimensioniLBOSCw = androidx.compose.ui.layout.ContentScaleKt.m3399computeFillMaxDimensioniLBOSCw(srcSize, dstSize);
                return androidx.compose.ui.layout.ScaleFactorKt.ScaleFactor(m3399computeFillMaxDimensioniLBOSCw, m3399computeFillMaxDimensioniLBOSCw);
            }
        };
        private static final androidx.compose.ui.layout.ContentScale Fit = new androidx.compose.ui.layout.ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo3393computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float m3400computeFillMinDimensioniLBOSCw;
                m3400computeFillMinDimensioniLBOSCw = androidx.compose.ui.layout.ContentScaleKt.m3400computeFillMinDimensioniLBOSCw(srcSize, dstSize);
                return androidx.compose.ui.layout.ScaleFactorKt.ScaleFactor(m3400computeFillMinDimensioniLBOSCw, m3400computeFillMinDimensioniLBOSCw);
            }
        };
        private static final androidx.compose.ui.layout.ContentScale FillHeight = new androidx.compose.ui.layout.ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo3393computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float m3398computeFillHeightiLBOSCw;
                m3398computeFillHeightiLBOSCw = androidx.compose.ui.layout.ContentScaleKt.m3398computeFillHeightiLBOSCw(srcSize, dstSize);
                return androidx.compose.ui.layout.ScaleFactorKt.ScaleFactor(m3398computeFillHeightiLBOSCw, m3398computeFillHeightiLBOSCw);
            }
        };
        private static final androidx.compose.ui.layout.ContentScale FillWidth = new androidx.compose.ui.layout.ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo3393computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float m3401computeFillWidthiLBOSCw;
                m3401computeFillWidthiLBOSCw = androidx.compose.ui.layout.ContentScaleKt.m3401computeFillWidthiLBOSCw(srcSize, dstSize);
                return androidx.compose.ui.layout.ScaleFactorKt.ScaleFactor(m3401computeFillWidthiLBOSCw, m3401computeFillWidthiLBOSCw);
            }
        };
        private static final androidx.compose.ui.layout.ContentScale Inside = new androidx.compose.ui.layout.ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo3393computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float m3400computeFillMinDimensioniLBOSCw;
                if (androidx.compose.ui.geometry.Size.m1940getWidthimpl(srcSize) > androidx.compose.ui.geometry.Size.m1940getWidthimpl(dstSize) || androidx.compose.ui.geometry.Size.m1937getHeightimpl(srcSize) > androidx.compose.ui.geometry.Size.m1937getHeightimpl(dstSize)) {
                    m3400computeFillMinDimensioniLBOSCw = androidx.compose.ui.layout.ContentScaleKt.m3400computeFillMinDimensioniLBOSCw(srcSize, dstSize);
                    return androidx.compose.ui.layout.ScaleFactorKt.ScaleFactor(m3400computeFillMinDimensioniLBOSCw, m3400computeFillMinDimensioniLBOSCw);
                }
                return androidx.compose.ui.layout.ScaleFactorKt.ScaleFactor(1.0f, 1.0f);
            }
        };
        private static final androidx.compose.ui.layout.FixedScale None = new androidx.compose.ui.layout.FixedScale(1.0f);
        private static final androidx.compose.ui.layout.ContentScale FillBounds = new androidx.compose.ui.layout.ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo3393computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float m3401computeFillWidthiLBOSCw;
                float m3398computeFillHeightiLBOSCw;
                m3401computeFillWidthiLBOSCw = androidx.compose.ui.layout.ContentScaleKt.m3401computeFillWidthiLBOSCw(srcSize, dstSize);
                m3398computeFillHeightiLBOSCw = androidx.compose.ui.layout.ContentScaleKt.m3398computeFillHeightiLBOSCw(srcSize, dstSize);
                return androidx.compose.ui.layout.ScaleFactorKt.ScaleFactor(m3401computeFillWidthiLBOSCw, m3398computeFillHeightiLBOSCw);
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
