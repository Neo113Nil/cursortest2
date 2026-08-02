package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dJ\u0019\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u000e\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/PathIterator;", "", "Landroidx/compose/ui/graphics/PathSegment;", "", "includeConvertedConics", "", "calculateSize", "(Z)I", "hasNext", "()Z", "", "outPoints", "offset", "Landroidx/compose/ui/graphics/PathSegment$Type;", io.ktor.http.LinkHeader.Rel.Next, "([FI)Landroidx/compose/ui/graphics/PathSegment$Type;", "()Landroidx/compose/ui/graphics/PathSegment;", "Landroidx/compose/ui/graphics/Path;", "getPath", "()Landroidx/compose/ui/graphics/Path;", "path", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "getConicEvaluation", "()Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "conicEvaluation", "", "getTolerance", "()F", "tolerance", "ConicEvaluation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PathIterator extends java.util.Iterator<androidx.compose.ui.graphics.PathSegment>, kotlin.jvm.internal.markers.KMappedMarker {
    int calculateSize(boolean includeConvertedConics);

    androidx.compose.ui.graphics.PathIterator.ConicEvaluation getConicEvaluation();

    androidx.compose.ui.graphics.Path getPath();

    float getTolerance();

    @Override // java.util.Iterator
    boolean hasNext();

    androidx.compose.ui.graphics.PathSegment.Type next(float[] outPoints, int offset);

    @Override // java.util.Iterator
    androidx.compose.ui.graphics.PathSegment next();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "", "<init>", "(Ljava/lang/String;I)V", "AsConic", "AsQuadratics"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConicEvaluation {
        public static final androidx.compose.ui.graphics.PathIterator.ConicEvaluation AsConic = new androidx.compose.ui.graphics.PathIterator.ConicEvaluation("AsConic", 0);
        public static final androidx.compose.ui.graphics.PathIterator.ConicEvaluation AsQuadratics = new androidx.compose.ui.graphics.PathIterator.ConicEvaluation("AsQuadratics", 1);
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ androidx.compose.ui.graphics.PathIterator.ConicEvaluation[] getHighSpeedVideoFpsRangesFor;

        private ConicEvaluation(java.lang.String str, int i) {
        }

        static {
            androidx.compose.ui.graphics.PathIterator.ConicEvaluation[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRanges);
        }

        public static androidx.compose.ui.graphics.PathIterator.ConicEvaluation[] values() {
            return (androidx.compose.ui.graphics.PathIterator.ConicEvaluation[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static androidx.compose.ui.graphics.PathIterator.ConicEvaluation valueOf(java.lang.String str) {
            return (androidx.compose.ui.graphics.PathIterator.ConicEvaluation) java.lang.Enum.valueOf(androidx.compose.ui.graphics.PathIterator.ConicEvaluation.class, str);
        }

        public static kotlin.enums.EnumEntries<androidx.compose.ui.graphics.PathIterator.ConicEvaluation> getEntries() {
            return getHighResolutionOutputSizeshNQ4ISI;
        }

        private static final /* synthetic */ androidx.compose.ui.graphics.PathIterator.ConicEvaluation[] getHighSpeedVideoFpsRanges() {
            return new androidx.compose.ui.graphics.PathIterator.ConicEvaluation[]{AsConic, AsQuadratics};
        }
    }

    static /* synthetic */ int calculateSize$default(androidx.compose.ui.graphics.PathIterator pathIterator, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateSize");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return pathIterator.calculateSize(z);
    }

    static /* synthetic */ androidx.compose.ui.graphics.PathSegment.Type next$default(androidx.compose.ui.graphics.PathIterator pathIterator, float[] fArr, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return pathIterator.next(fArr, i);
    }
}
