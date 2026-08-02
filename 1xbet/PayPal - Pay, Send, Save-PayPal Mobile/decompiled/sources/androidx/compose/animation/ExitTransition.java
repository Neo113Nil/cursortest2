package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b6\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118!X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0016"}, d2 = {"Landroidx/compose/animation/ExitTransition;", "", "<init>", "()V", com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.EXIT, "plus", "(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "Landroidx/compose/animation/TransitionData;", "getData$animation", "()Landroidx/compose/animation/TransitionData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "Landroidx/compose/animation/ExitTransitionImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ExitTransition {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.animation.ExitTransition.Companion INSTANCE = new androidx.compose.animation.ExitTransition.Companion(null);
    private static final androidx.compose.animation.ExitTransition KeepUntilTransitionsFinished;
    private static final androidx.compose.animation.ExitTransition None;

    public abstract androidx.compose.animation.TransitionData getData$animation();

    private ExitTransition() {
    }

    public final androidx.compose.animation.ExitTransition plus(androidx.compose.animation.ExitTransition exit) {
        androidx.compose.animation.Fade fade = exit.getData$animation().getFade();
        if (fade == null) {
            fade = getData$animation().getFade();
        }
        androidx.compose.animation.Fade fade2 = fade;
        androidx.compose.animation.Slide slide = exit.getData$animation().getSlide();
        if (slide == null) {
            slide = getData$animation().getSlide();
        }
        androidx.compose.animation.Slide slide2 = slide;
        androidx.compose.animation.ChangeSize changeSize = exit.getData$animation().getChangeSize();
        if (changeSize == null) {
            changeSize = getData$animation().getChangeSize();
        }
        androidx.compose.animation.ChangeSize changeSize2 = changeSize;
        androidx.compose.animation.Scale scale = exit.getData$animation().getScale();
        if (scale == null) {
            scale = getData$animation().getScale();
        }
        androidx.compose.animation.Scale scale2 = scale;
        androidx.compose.animation.Veil veil = exit.getData$animation().getVeil();
        if (veil == null) {
            veil = getData$animation().getVeil();
        }
        return new androidx.compose.animation.ExitTransitionImpl(new androidx.compose.animation.TransitionData(fade2, slide2, changeSize2, scale2, veil, exit.getData$animation().getHold() || getData$animation().getHold(), kotlin.collections.MapsKt.plus(getData$animation().getEffectsMap(), exit.getData$animation().getEffectsMap())));
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof androidx.compose.animation.ExitTransition) && kotlin.jvm.internal.Intrinsics.areEqual(((androidx.compose.animation.ExitTransition) other).getData$animation(), getData$animation());
    }

    public java.lang.String toString() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, None)) {
            return "ExitTransition.None";
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, KeepUntilTransitionsFinished)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        androidx.compose.animation.TransitionData data$animation = getData$animation();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExitTransition: \nFade - ");
        androidx.compose.animation.Fade fade = data$animation.getFade();
        sb.append(fade != null ? fade.toString() : null);
        sb.append(",\nSlide - ");
        androidx.compose.animation.Slide slide = data$animation.getSlide();
        sb.append(slide != null ? slide.toString() : null);
        sb.append(",\nShrink - ");
        androidx.compose.animation.ChangeSize changeSize = data$animation.getChangeSize();
        sb.append(changeSize != null ? changeSize.toString() : null);
        sb.append(",\nScale - ");
        androidx.compose.animation.Scale scale = data$animation.getScale();
        sb.append(scale != null ? scale.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(data$animation.getHold());
        return sb.toString();
    }

    public int hashCode() {
        return getData$animation().hashCode();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/animation/ExitTransition$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/ExitTransition;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Landroidx/compose/animation/ExitTransition;", "getNone", "()Landroidx/compose/animation/ExitTransition;", "KeepUntilTransitionsFinished", "getKeepUntilTransitionsFinished$animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.animation.ExitTransition getNone() {
            return androidx.compose.animation.ExitTransition.None;
        }

        public final androidx.compose.animation.ExitTransition getKeepUntilTransitionsFinished$animation() {
            return androidx.compose.animation.ExitTransition.KeepUntilTransitionsFinished;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.compose.animation.Fade fade = null;
        androidx.compose.animation.Slide slide = null;
        androidx.compose.animation.ChangeSize changeSize = null;
        androidx.compose.animation.Scale scale = null;
        androidx.compose.animation.Veil veil = null;
        java.util.Map map = null;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        None = new androidx.compose.animation.ExitTransitionImpl(new androidx.compose.animation.TransitionData(fade, slide, changeSize, scale, veil, false, map, 127, defaultConstructorMarker));
        KeepUntilTransitionsFinished = new androidx.compose.animation.ExitTransitionImpl(new androidx.compose.animation.TransitionData(fade, slide, changeSize, scale, veil, true, map, 95, defaultConstructorMarker));
    }

    public /* synthetic */ ExitTransition(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
