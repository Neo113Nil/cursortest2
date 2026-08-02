package coil3.content.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00060\u0003j\u0002`\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcoil3/network/internal/SingleParameterLazy;", "P", "T", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "Lkotlin/Function1;", "initializer", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "parameter", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SingleParameterLazy<P, T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super P, ? extends T> getHighSpeedVideoFpsRanges;
    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI = coil3.content.internal.UNINITIALIZED.INSTANCE;

    public SingleParameterLazy(kotlin.jvm.functions.Function1<? super P, ? extends T> function1) {
        this.getHighSpeedVideoFpsRanges = function1;
    }

    public final T get(P parameter) {
        T t;
        T t2 = (T) this.getHighResolutionOutputSizeshNQ4ISI;
        if (t2 != coil3.content.internal.UNINITIALIZED.INSTANCE) {
            return t2;
        }
        synchronized (this) {
            t = (T) this.getHighResolutionOutputSizeshNQ4ISI;
            if (t == coil3.content.internal.UNINITIALIZED.INSTANCE) {
                kotlin.jvm.functions.Function1<? super P, ? extends T> function1 = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNull(function1);
                t = function1.invoke(parameter);
                this.getHighResolutionOutputSizeshNQ4ISI = t;
                this.getHighSpeedVideoFpsRanges = null;
            }
        }
        return t;
    }
}
