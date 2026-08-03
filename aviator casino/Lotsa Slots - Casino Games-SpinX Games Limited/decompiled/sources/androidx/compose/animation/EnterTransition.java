package androidx.compose.animation;

/* compiled from: EnterExitTransition.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0011\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0087\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/EnterTransition;", "", "()V", "data", "Landroidx/compose/animation/TransitionData;", "getData$animation_release", "()Landroidx/compose/animation/TransitionData;", "equals", "", "other", "hashCode", "", "plus", "enter", "toString", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Landroidx/compose/animation/EnterTransitionImpl;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EnterTransition {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.animation.EnterTransition.Companion INSTANCE = new androidx.compose.animation.EnterTransition.Companion(null);
    private static final androidx.compose.animation.EnterTransition None = new androidx.compose.animation.EnterTransitionImpl(new androidx.compose.animation.TransitionData(null, null, null, null, false, null, 63, null));

    public /* synthetic */ EnterTransition(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract androidx.compose.animation.TransitionData getData$animation_release();

    private EnterTransition() {
    }

    public final androidx.compose.animation.EnterTransition plus(androidx.compose.animation.EnterTransition enter) {
        androidx.compose.animation.Fade fade = getData$animation_release().getFade();
        if (fade == null) {
            fade = enter.getData$animation_release().getFade();
        }
        androidx.compose.animation.Fade fade2 = fade;
        androidx.compose.animation.Slide slide = getData$animation_release().getSlide();
        if (slide == null) {
            slide = enter.getData$animation_release().getSlide();
        }
        androidx.compose.animation.Slide slide2 = slide;
        androidx.compose.animation.ChangeSize changeSize = getData$animation_release().getChangeSize();
        if (changeSize == null) {
            changeSize = enter.getData$animation_release().getChangeSize();
        }
        androidx.compose.animation.ChangeSize changeSize2 = changeSize;
        androidx.compose.animation.Scale scale = getData$animation_release().getScale();
        if (scale == null) {
            scale = enter.getData$animation_release().getScale();
        }
        return new androidx.compose.animation.EnterTransitionImpl(new androidx.compose.animation.TransitionData(fade2, slide2, changeSize2, scale, false, kotlin.collections.MapsKt.plus(getData$animation_release().getEffectsMap(), enter.getData$animation_release().getEffectsMap()), 16, null));
    }

    public java.lang.String toString() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, None)) {
            return "EnterTransition.None";
        }
        androidx.compose.animation.TransitionData data$animation_release = getData$animation_release();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnterTransition: \nFade - ");
        androidx.compose.animation.Fade fade = data$animation_release.getFade();
        sb.append(fade != null ? fade.toString() : null);
        sb.append(",\nSlide - ");
        androidx.compose.animation.Slide slide = data$animation_release.getSlide();
        sb.append(slide != null ? slide.toString() : null);
        sb.append(",\nShrink - ");
        androidx.compose.animation.ChangeSize changeSize = data$animation_release.getChangeSize();
        sb.append(changeSize != null ? changeSize.toString() : null);
        sb.append(",\nScale - ");
        androidx.compose.animation.Scale scale = data$animation_release.getScale();
        sb.append(scale != null ? scale.toString() : null);
        return sb.toString();
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof androidx.compose.animation.EnterTransition) && kotlin.jvm.internal.Intrinsics.areEqual(((androidx.compose.animation.EnterTransition) other).getData$animation_release(), getData$animation_release());
    }

    public int hashCode() {
        return getData$animation_release().hashCode();
    }

    /* compiled from: EnterExitTransition.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/animation/EnterTransition$Companion;", "", "()V", "None", "Landroidx/compose/animation/EnterTransition;", "getNone", "()Landroidx/compose/animation/EnterTransition;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.animation.EnterTransition getNone() {
            return androidx.compose.animation.EnterTransition.None;
        }
    }
}
