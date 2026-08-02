package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorSequenceEqual {
    static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();

    private OperatorSequenceEqual() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> rx.Observable<java.lang.Boolean> sequenceEqual(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, final rx.functions.Func2<? super T, ? super T, java.lang.Boolean> func2) {
        java.lang.Object obj = getHighSpeedVideoFpsRanges;
        return rx.Observable.zip(rx.Observable.concat(observable, rx.Observable.just(obj)), rx.Observable.concat(observable2, rx.Observable.just(obj)), new rx.functions.Func2<java.lang.Object, java.lang.Object, java.lang.Boolean>() { // from class: rx.internal.operators.OperatorSequenceEqual.1
            @Override // rx.functions.Func2
            public final /* bridge */ /* synthetic */ java.lang.Boolean call(java.lang.Object obj2, java.lang.Object obj3) {
                boolean z = obj2 == rx.internal.operators.OperatorSequenceEqual.getHighSpeedVideoFpsRanges;
                boolean z2 = obj3 == rx.internal.operators.OperatorSequenceEqual.getHighSpeedVideoFpsRanges;
                if (z && z2) {
                    return java.lang.Boolean.TRUE;
                }
                if (z || z2) {
                    return java.lang.Boolean.FALSE;
                }
                return (java.lang.Boolean) rx.functions.Func2.this.call(obj2, obj3);
            }
        }).all(rx.internal.util.UtilityFunctions.identity());
    }
}
