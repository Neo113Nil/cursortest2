package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\f\"\b\b\u0001\u0010\t*\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00028\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0001\u0001\u0019"}, d2 = {"Landroidx/compose/animation/core/KeyframeBaseEntity;", "T", "", "p0", "Landroidx/compose/animation/core/Easing;", "p1", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlin/Function1;", "convertToVector", "Lkotlin/Pair;", "toPair$animation_core", "(Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/Object;", "getValue$animation_core", "()Ljava/lang/Object;", "easing", "Landroidx/compose/animation/core/Easing;", "getEasing$animation_core", "()Landroidx/compose/animation/core/Easing;", "setEasing$animation_core", "(Landroidx/compose/animation/core/Easing;)V", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class KeyframeBaseEntity<T> {
    public static final int $stable = 8;
    private androidx.compose.animation.core.Easing easing;
    private final T value;

    private KeyframeBaseEntity(T t, androidx.compose.animation.core.Easing easing) {
        this.value = t;
        this.easing = easing;
    }

    /* renamed from: getEasing$animation_core, reason: from getter */
    public final androidx.compose.animation.core.Easing getEasing() {
        return this.easing;
    }

    public final T getValue$animation_core() {
        return this.value;
    }

    public final void setEasing$animation_core(androidx.compose.animation.core.Easing easing) {
        this.easing = easing;
    }

    public final <V extends androidx.compose.animation.core.AnimationVector> kotlin.Pair<V, androidx.compose.animation.core.Easing> toPair$animation_core(kotlin.jvm.functions.Function1<? super T, ? extends V> convertToVector) {
        return kotlin.TuplesKt.to(convertToVector.invoke(this.value), this.easing);
    }

    public /* synthetic */ KeyframeBaseEntity(java.lang.Object obj, androidx.compose.animation.core.Easing easing, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, easing);
    }
}
