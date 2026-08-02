package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00028\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Animation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "", "playTimeNanos", "getValueFromNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", "", "isFinishedFromNanos", "(J)Z", "getDurationNanos", "()J", "durationNanos", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "getTargetValue", "()Ljava/lang/Object;", "targetValue", "isInfinite", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Animation<T, V extends androidx.compose.animation.core.AnimationVector> {
    long getDurationNanos();

    T getTargetValue();

    androidx.compose.animation.core.TwoWayConverter<T, V> getTypeConverter();

    T getValueFromNanos(long playTimeNanos);

    V getVelocityVectorFromNanos(long playTimeNanos);

    boolean isInfinite();

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T, V extends androidx.compose.animation.core.AnimationVector> boolean isFinishedFromNanos(androidx.compose.animation.core.Animation<T, V> animation, long j) {
            return androidx.compose.animation.core.Animation.super.isFinishedFromNanos(j);
        }
    }

    default boolean isFinishedFromNanos(long playTimeNanos) {
        return playTimeNanos >= getDurationNanos();
    }
}
