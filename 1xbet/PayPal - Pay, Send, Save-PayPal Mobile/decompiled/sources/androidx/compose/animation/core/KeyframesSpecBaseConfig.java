package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0000H ¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\u00028\u0001*\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0004¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0010\u001a\u00028\u0001*\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0014\u001a\u00028\u0001*\u00028\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0086\u0004¢\u0006\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n8\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR \u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\u0082\u0001\u0002$%"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpecBaseConfig;", "T", "Landroidx/compose/animation/core/KeyframeBaseEntity;", "E", "", "<init>", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "createEntityFor$animation_core", "(Ljava/lang/Object;)Landroidx/compose/animation/core/KeyframeBaseEntity;", "", "timeStamp", "at", "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframeBaseEntity;", "", "fraction", "atFraction", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/KeyframeBaseEntity;", "Landroidx/compose/animation/core/Easing;", "easing", "using", "(Landroidx/compose/animation/core/KeyframeBaseEntity;Landroidx/compose/animation/core/Easing;)Landroidx/compose/animation/core/KeyframeBaseEntity;", "durationMillis", com.visa.cbp.getEncExpo.warmup, "getDurationMillis", "()I", "setDurationMillis", "(I)V", "delayMillis", "getDelayMillis", "setDelayMillis", "Landroidx/collection/MutableIntObjectMap;", "keyframes", "Landroidx/collection/MutableIntObjectMap;", "getKeyframes$animation_core", "()Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class KeyframesSpecBaseConfig<T, E extends androidx.compose.animation.core.KeyframeBaseEntity<T>> {
    public static final int $stable = 8;
    private int delayMillis;
    private int durationMillis;
    private final androidx.collection.MutableIntObjectMap<E> keyframes;

    public abstract E createEntityFor$animation_core(T value);

    private KeyframesSpecBaseConfig() {
        this.durationMillis = 300;
        this.keyframes = androidx.collection.IntObjectMapKt.mutableIntObjectMapOf();
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final void setDurationMillis(int i) {
        this.durationMillis = i;
    }

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final void setDelayMillis(int i) {
        this.delayMillis = i;
    }

    public final androidx.collection.MutableIntObjectMap<E> getKeyframes$animation_core() {
        return this.keyframes;
    }

    public E at(T t, int i) {
        E createEntityFor$animation_core = createEntityFor$animation_core(t);
        this.keyframes.set(i, createEntityFor$animation_core);
        return createEntityFor$animation_core;
    }

    public E atFraction(T t, float f) {
        return at(t, java.lang.Math.round(this.durationMillis * f));
    }

    public final E using(E e, androidx.compose.animation.core.Easing easing) {
        e.setEasing$animation_core(easing);
        return e;
    }

    public /* synthetic */ KeyframesSpecBaseConfig(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
