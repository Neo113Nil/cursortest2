package androidx.graphics.path;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\b"}, d2 = {"Landroid/graphics/Path;", "Landroidx/graphics/path/PathIterator;", "iterator", "(Landroid/graphics/Path;)Landroidx/graphics/path/PathIterator;", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)Landroidx/graphics/path/PathIterator;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PathUtilities {
    public static final androidx.graphics.path.PathIterator iterator(android.graphics.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return new androidx.graphics.path.PathIterator(path, null, 0.0f, 6, null);
    }

    public static /* synthetic */ androidx.graphics.path.PathIterator iterator$default(android.graphics.Path path, androidx.graphics.path.PathIterator.ConicEvaluation conicEvaluation, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 0.25f;
        }
        return iterator(path, conicEvaluation, f);
    }

    public static final androidx.graphics.path.PathIterator iterator(android.graphics.Path path, androidx.graphics.path.PathIterator.ConicEvaluation conicEvaluation, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conicEvaluation, "");
        return new androidx.graphics.path.PathIterator(path, conicEvaluation, f);
    }
}
