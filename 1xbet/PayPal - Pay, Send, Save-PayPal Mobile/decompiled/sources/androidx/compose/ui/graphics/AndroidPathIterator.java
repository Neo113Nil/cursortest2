package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0012\u001a\u00020\u0014H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010#\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathIterator;", "Landroidx/compose/ui/graphics/PathIterator;", "Landroidx/compose/ui/graphics/Path;", "p0", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "p1", "", "p2", "<init>", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;F)V", "", "", "calculateSize", "(Z)I", "hasNext", "()Z", "", "Landroidx/compose/ui/graphics/PathSegment$Type;", io.ktor.http.LinkHeader.Rel.Next, "([FI)Landroidx/compose/ui/graphics/PathSegment$Type;", "Landroidx/compose/ui/graphics/PathSegment;", "()Landroidx/compose/ui/graphics/PathSegment;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/Path;", "getPath", "()Landroidx/compose/ui/graphics/Path;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "getConicEvaluation", "()Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTolerance", "()F", "getHighSpeedVideoFpsRanges", "[F", "Landroidx/graphics/path/PathIterator;", "Landroidx/graphics/path/PathIterator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AndroidPathIterator implements androidx.compose.ui.graphics.PathIterator {
    private final float Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.Path getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float[] getHighResolutionOutputSizeshNQ4ISI = new float[8];

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.graphics.path.PathIterator getHighSpeedVideoFpsRanges;
    private final androidx.compose.ui.graphics.PathIterator.ConicEvaluation getHighSpeedVideoSizes;

    public AndroidPathIterator(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.PathIterator.ConicEvaluation conicEvaluation, float f) {
        androidx.graphics.path.PathIterator.ConicEvaluation conicEvaluation2;
        this.getHighSpeedVideoFpsRangesFor = path;
        this.getHighSpeedVideoSizes = conicEvaluation;
        this.Camera2StreamConfigurationMap = f;
        androidx.compose.ui.graphics.Path getHighSpeedVideoFpsRangesFor = getGetHighSpeedVideoFpsRangesFor();
        if (getHighSpeedVideoFpsRangesFor instanceof androidx.compose.ui.graphics.AndroidPath) {
            android.graphics.Path internalPath = ((androidx.compose.ui.graphics.AndroidPath) getHighSpeedVideoFpsRangesFor).getInternalPath();
            int i = androidx.compose.ui.graphics.AndroidPathIterator.WhenMappings.$EnumSwitchMapping$0[getGetHighSpeedVideoSizes().ordinal()];
            if (i == 1) {
                conicEvaluation2 = androidx.graphics.path.PathIterator.ConicEvaluation.AsConic;
            } else {
                if (i != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                conicEvaluation2 = androidx.graphics.path.PathIterator.ConicEvaluation.AsQuadratics;
            }
            this.getHighSpeedVideoFpsRanges = new androidx.graphics.path.PathIterator(internalPath, conicEvaluation2, getCamera2StreamConfigurationMap());
            return;
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    /* renamed from: getPath, reason: from getter */
    public final androidx.compose.ui.graphics.Path getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    /* renamed from: getConicEvaluation, reason: from getter */
    public final androidx.compose.ui.graphics.PathIterator.ConicEvaluation getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    /* renamed from: getTolerance, reason: from getter */
    public final float getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public final int calculateSize(boolean p0) {
        return this.getHighSpeedVideoFpsRanges.calculateSize(p0);
    }

    @Override // androidx.compose.ui.graphics.PathIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoFpsRanges.hasNext();
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public final androidx.compose.ui.graphics.PathSegment.Type next(float[] p0, int p1) {
        androidx.compose.ui.graphics.PathSegment.Type highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.ui.graphics.AndroidPathIterator_androidKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges.next(p0, p1));
        return highSpeedVideoSizes;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        r2 = androidx.compose.ui.graphics.AndroidPathIterator_androidKt.getHighSpeedVideoSizes(r20.getHighSpeedVideoFpsRanges.next(r1, 0));
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.ui.graphics.PathSegment next() {
        androidx.compose.ui.graphics.PathSegment.Type highSpeedVideoSizes;
        float[] fArr;
        float[] fArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (fArr2.length >= 8 && highSpeedVideoSizes != androidx.compose.ui.graphics.PathSegment.Type.Done) {
            if (highSpeedVideoSizes == androidx.compose.ui.graphics.PathSegment.Type.Close) {
                return androidx.compose.ui.graphics.PathSegmentKt.getCloseSegment();
            }
            int i = androidx.compose.ui.graphics.AndroidPathIterator.WhenMappings.$EnumSwitchMapping$1[highSpeedVideoSizes.ordinal()];
            if (i == 1) {
                fArr = new float[]{fArr2[0], fArr2[1]};
            } else if (i == 2) {
                fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3]};
            } else if (i == 3) {
                fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5]};
            } else if (i == 4) {
                fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5]};
            } else if (i == 5) {
                fArr = new float[]{fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5], fArr2[6], fArr2[7]};
            } else {
                fArr = new float[0];
            }
            return new androidx.compose.ui.graphics.PathSegment(highSpeedVideoSizes, fArr, highSpeedVideoSizes == androidx.compose.ui.graphics.PathSegment.Type.Conic ? fArr2[6] : 0.0f);
        }
        return androidx.compose.ui.graphics.PathSegmentKt.getDoneSegment();
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[androidx.compose.ui.graphics.PathIterator.ConicEvaluation.values().length];
            try {
                iArr[androidx.compose.ui.graphics.PathIterator.ConicEvaluation.AsConic.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.graphics.PathIterator.ConicEvaluation.AsQuadratics.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[androidx.compose.ui.graphics.PathSegment.Type.values().length];
            try {
                iArr2[androidx.compose.ui.graphics.PathSegment.Type.Move.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[androidx.compose.ui.graphics.PathSegment.Type.Line.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[androidx.compose.ui.graphics.PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[androidx.compose.ui.graphics.PathSegment.Type.Conic.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[androidx.compose.ui.graphics.PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
