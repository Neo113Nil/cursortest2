package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "path", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "Landroidx/compose/ui/graphics/PathIterator;", "PathIterator", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;F)Landroidx/compose/ui/graphics/PathIterator;", "Landroidx/graphics/path/PathSegment$Type;", "Landroidx/compose/ui/graphics/PathSegment$Type;", "getHighSpeedVideoSizes", "(Landroidx/graphics/path/PathSegment$Type;)Landroidx/compose/ui/graphics/PathSegment$Type;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidPathIterator_androidKt {
    public static final androidx.compose.ui.graphics.PathIterator PathIterator(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.PathIterator.ConicEvaluation conicEvaluation, float f) {
        return new androidx.compose.ui.graphics.AndroidPathIterator(path, conicEvaluation, f);
    }

    public static /* synthetic */ androidx.compose.ui.graphics.PathIterator PathIterator$default(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.PathIterator.ConicEvaluation conicEvaluation, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            conicEvaluation = androidx.compose.ui.graphics.PathIterator.ConicEvaluation.AsQuadratics;
        }
        if ((i & 4) != 0) {
            f = 0.25f;
        }
        return PathIterator(path, conicEvaluation, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.graphics.PathSegment.Type getHighSpeedVideoSizes(androidx.graphics.path.PathSegment.Type type) {
        switch (androidx.compose.ui.graphics.AndroidPathIterator_androidKt.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return androidx.compose.ui.graphics.PathSegment.Type.Move;
            case 2:
                return androidx.compose.ui.graphics.PathSegment.Type.Line;
            case 3:
                return androidx.compose.ui.graphics.PathSegment.Type.Quadratic;
            case 4:
                return androidx.compose.ui.graphics.PathSegment.Type.Conic;
            case 5:
                return androidx.compose.ui.graphics.PathSegment.Type.Cubic;
            case 6:
                return androidx.compose.ui.graphics.PathSegment.Type.Close;
            case 7:
                return androidx.compose.ui.graphics.PathSegment.Type.Done;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.graphics.path.PathSegment.Type.values().length];
            try {
                iArr[androidx.graphics.path.PathSegment.Type.Move.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.graphics.path.PathSegment.Type.Line.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.graphics.path.PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.graphics.path.PathSegment.Type.Conic.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.graphics.path.PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.graphics.path.PathSegment.Type.Close.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.graphics.path.PathSegment.Type.Done.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
