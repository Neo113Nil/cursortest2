package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b8WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "", "", "offset", io.ktor.http.ContentDisposition.Parameters.Size, "containerSize", "calculateScrollDistance", "(FFF)F", "Landroidx/compose/animation/core/AnimationSpec;", "getScrollAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getScrollAnimationSpec$annotations", "()V", "scrollAnimationSpec", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BringIntoViewSpec {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.gestures.BringIntoViewSpec.Companion INSTANCE = androidx.compose.foundation.gestures.BringIntoViewSpec.Companion.getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Deprecated(message = "Animation spec customization is no longer supported.")
    static /* synthetic */ void getScrollAnimationSpec$annotations() {
    }

    @kotlin.Deprecated(message = "Animation spec customization is no longer supported.")
    default androidx.compose.animation.core.AnimationSpec<java.lang.Float> getScrollAnimationSpec() {
        return INSTANCE.getDefaultScrollAnimationSpec$foundation();
    }

    default float calculateScrollDistance(float offset, float size, float containerSize) {
        return INSTANCE.defaultCalculateScrollDistance$foundation(offset, size, containerSize);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/foundation/gestures/BringIntoViewSpec$Companion;", "", "<init>", "()V", "", "offset", io.ktor.http.ContentDisposition.Parameters.Size, "containerSize", "defaultCalculateScrollDistance$foundation", "(FFF)F", "Landroidx/compose/animation/core/AnimationSpec;", "DefaultScrollAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getDefaultScrollAnimationSpec$foundation", "()Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "DefaultBringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getDefaultBringIntoViewSpec$foundation", "()Landroidx/compose/foundation/gestures/BringIntoViewSpec;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.foundation.gestures.BringIntoViewSpec.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.foundation.gestures.BringIntoViewSpec.Companion();
        private static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> DefaultScrollAnimationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        private static final androidx.compose.foundation.gestures.BringIntoViewSpec DefaultBringIntoViewSpec = new androidx.compose.foundation.gestures.BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec$Companion$DefaultBringIntoViewSpec$1
        };

        private Companion() {
        }

        public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getDefaultScrollAnimationSpec$foundation() {
            return DefaultScrollAnimationSpec;
        }

        public final androidx.compose.foundation.gestures.BringIntoViewSpec getDefaultBringIntoViewSpec$foundation() {
            return DefaultBringIntoViewSpec;
        }

        public final float defaultCalculateScrollDistance$foundation(float offset, float size, float containerSize) {
            float f = size + offset;
            if (offset >= 0.0f && f <= containerSize) {
                return 0.0f;
            }
            if (offset < 0.0f && f > containerSize) {
                return 0.0f;
            }
            float f2 = f - containerSize;
            return java.lang.Math.abs(offset) < java.lang.Math.abs(f2) ? offset : f2;
        }
    }
}
