package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0000H ¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH \u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH \u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\b8!X \u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0004\u0013\u0014\u0015\u0016"}, d2 = {"Landroidx/compose/animation/core/AnimationVector;", "", "<init>", "()V", "", "reset$animation_core", "newVector$animation_core", "()Landroidx/compose/animation/core/AnimationVector;", "", "index", "", "get$animation_core", "(I)F", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "set$animation_core", "(IF)V", "getSize$animation_core", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/AnimationVector3D;", "Landroidx/compose/animation/core/AnimationVector4D;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AnimationVector {
    public static final int $stable = 0;

    public abstract float get$animation_core(int index);

    public abstract int getSize$animation_core();

    public abstract androidx.compose.animation.core.AnimationVector newVector$animation_core();

    public abstract void reset$animation_core();

    public abstract void set$animation_core(int index, float value);

    private AnimationVector() {
    }

    public /* synthetic */ AnimationVector(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
