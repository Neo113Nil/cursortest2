package rx.internal.operators;

/* loaded from: classes18.dex */
public class SingleOperatorCast<T, R> implements rx.functions.Func1<T, R> {
    final java.lang.Class<R> getHighResolutionOutputSizeshNQ4ISI;

    public SingleOperatorCast(java.lang.Class<R> cls) {
        this.getHighResolutionOutputSizeshNQ4ISI = cls;
    }

    @Override // rx.functions.Func1
    public R call(T t) {
        return this.getHighResolutionOutputSizeshNQ4ISI.cast(t);
    }
}
