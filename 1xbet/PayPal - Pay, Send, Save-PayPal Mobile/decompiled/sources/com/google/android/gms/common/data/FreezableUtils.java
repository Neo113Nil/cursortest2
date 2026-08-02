package com.google.android.gms.common.data;

/* loaded from: classes8.dex */
public final class FreezableUtils {
    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freeze(java.util.ArrayList<E> arrayList) {
        io.reactivex.internal.operators.observable.ObservableReplay.UnboundedReplayBuffer unboundedReplayBuffer = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            unboundedReplayBuffer.add(arrayList.get(i).freeze());
        }
        return unboundedReplayBuffer;
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freezeIterable(java.lang.Iterable<E> iterable) {
        io.reactivex.internal.operators.observable.ObservableReplay.UnboundedReplayBuffer unboundedReplayBuffer = (java.util.ArrayList<T>) new java.util.ArrayList();
        java.util.Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            unboundedReplayBuffer.add(it.next().freeze());
        }
        return unboundedReplayBuffer;
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freeze(E[] eArr) {
        io.reactivex.internal.operators.observable.ObservableReplay.UnboundedReplayBuffer unboundedReplayBuffer = (java.util.ArrayList<T>) new java.util.ArrayList(eArr.length);
        for (E e : eArr) {
            unboundedReplayBuffer.add(e.freeze());
        }
        return unboundedReplayBuffer;
    }
}
