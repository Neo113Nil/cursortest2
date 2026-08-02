package io.reactivex.internal.util;

/* loaded from: classes17.dex */
public class AppendOnlyLinkedArrayList<T> {
    final java.lang.Object[] Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object[] getHighSpeedVideoSizes;

    public interface NonThrowingPredicate<T> extends io.reactivex.functions.Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        boolean test(T t);
    }

    public AppendOnlyLinkedArrayList(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        java.lang.Object[] objArr = new java.lang.Object[i + 1];
        this.Camera2StreamConfigurationMap = objArr;
        this.getHighSpeedVideoSizes = objArr;
    }

    public void add(T t) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i2 == i) {
            java.lang.Object[] objArr = new java.lang.Object[i + 1];
            this.getHighSpeedVideoSizes[i] = objArr;
            this.getHighSpeedVideoSizes = objArr;
            i2 = 0;
        }
        this.getHighSpeedVideoSizes[i2] = t;
        this.getHighSpeedVideoFpsRanges = i2 + 1;
    }

    public void setFirst(T t) {
        this.Camera2StreamConfigurationMap[0] = t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void forEachWhile(io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate<? super T> nonThrowingPredicate) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        for (java.lang.Object[] objArr = this.Camera2StreamConfigurationMap; objArr != null; objArr = (java.lang.Object[]) objArr[i]) {
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.Object obj = objArr[i2];
                if (obj != null) {
                    if (nonThrowingPredicate.test(obj)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <U> boolean accept(org.reactivestreams.Subscriber<? super U> subscriber) {
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.Object[] objArr2 = objArr[i2];
                if (objArr2 != null) {
                    if (io.reactivex.internal.util.NotificationLite.acceptFull(objArr2, subscriber)) {
                        return true;
                    }
                }
            }
            objArr = objArr[i];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <U> boolean accept(io.reactivex.Observer<? super U> observer) {
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.Object[] objArr2 = objArr[i2];
                if (objArr2 != null) {
                    if (io.reactivex.internal.util.NotificationLite.acceptFull(objArr2, observer)) {
                        return true;
                    }
                }
            }
            objArr = objArr[i];
        }
    }

    public <S> void forEachWhile(S s, io.reactivex.functions.BiPredicate<? super S, ? super T> biPredicate) throws java.lang.Exception {
        java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        while (true) {
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.Object obj = objArr[i2];
                if (obj == null || biPredicate.test(s, obj)) {
                    return;
                }
            }
            objArr = (java.lang.Object[]) objArr[i];
        }
    }
}
