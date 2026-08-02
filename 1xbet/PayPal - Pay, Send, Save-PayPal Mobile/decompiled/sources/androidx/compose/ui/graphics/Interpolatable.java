package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J#\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/Interpolatable;", "", "other", "", "t", "lerp", "(Ljava/lang/Object;F)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Interpolatable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.Interpolatable.Companion INSTANCE = androidx.compose.ui.graphics.Interpolatable.Companion.getHighSpeedVideoFpsRanges;

    java.lang.Object lerp(java.lang.Object other, float t);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/graphics/Interpolatable$Companion;", "", "<init>", "()V", "a", util.h.xy.cb.b.f1091, "", "t", "lerp", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.graphics.Interpolatable.Companion getHighSpeedVideoFpsRanges = new androidx.compose.ui.graphics.Interpolatable.Companion();

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x0031 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0030 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object lerp(java.lang.Object a2, java.lang.Object b, float t) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(a2, b)) {
                return t < 0.5f ? a2 : b;
            }
            java.lang.Object lerp = a2 instanceof androidx.compose.ui.graphics.Interpolatable ? ((androidx.compose.ui.graphics.Interpolatable) a2).lerp(b, t) : null;
            if (lerp == null && (b instanceof androidx.compose.ui.graphics.Interpolatable)) {
                lerp = ((androidx.compose.ui.graphics.Interpolatable) b).lerp(a2, 1.0f - t);
            }
            if (lerp != null) {
                return lerp;
            }
            if (t < 0.5f) {
            }
        }
    }
}
