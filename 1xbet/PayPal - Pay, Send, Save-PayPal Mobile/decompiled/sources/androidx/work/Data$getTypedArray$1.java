package androidx.work;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Data$getTypedArray$1<T> implements kotlin.jvm.functions.Function1<java.lang.Integer, T> {
    final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    public final T invoke(int i) {
        T t = (T) ((java.lang.Object[]) this.getHighSpeedVideoFpsRangesFor)[i];
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
        return t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    public Data$getTypedArray$1(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
    }
}
