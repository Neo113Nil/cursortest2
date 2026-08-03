package com.google.android.gms.common.data;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
public final class FreezableUtils {
    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freeze(java.util.ArrayList<E> arrayList) {
        com.ironsource.sdk.controller.FeaturesManager.a aVar = (java.util.ArrayList<T>) new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aVar.add(arrayList.get(i).freeze());
        }
        return aVar;
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freezeIterable(java.lang.Iterable<E> iterable) {
        com.ironsource.sdk.controller.FeaturesManager.a aVar = (java.util.ArrayList<T>) new java.util.ArrayList();
        java.util.Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            aVar.add(it.next().freeze());
        }
        return aVar;
    }

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freeze(E[] eArr) {
        com.ironsource.sdk.controller.FeaturesManager.a aVar = (java.util.ArrayList<T>) new java.util.ArrayList(eArr.length);
        for (E e : eArr) {
            aVar.add(e.freeze());
        }
        return aVar;
    }
}
