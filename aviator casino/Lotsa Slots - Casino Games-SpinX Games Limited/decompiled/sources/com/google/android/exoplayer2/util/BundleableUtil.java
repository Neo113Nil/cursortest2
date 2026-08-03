package com.google.android.exoplayer2.util;

/* loaded from: classes3.dex */
public final class BundleableUtil {
    public static <T extends com.google.android.exoplayer2.Bundleable> com.google.common.collect.ImmutableList<android.os.Bundle> toBundleList(java.util.List<T> list) {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            builder.add((com.google.common.collect.ImmutableList.Builder) list.get(i).toBundle());
        }
        return builder.build();
    }

    public static <T extends com.google.android.exoplayer2.Bundleable> com.google.common.collect.ImmutableList<T> fromBundleList(com.google.android.exoplayer2.Bundleable.Creator<T> creator, java.util.List<android.os.Bundle> list) {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            builder.add((com.google.common.collect.ImmutableList.Builder) creator.fromBundle((android.os.Bundle) com.google.android.exoplayer2.util.Assertions.checkNotNull(list.get(i))));
        }
        return builder.build();
    }

    public static <T extends com.google.android.exoplayer2.Bundleable> java.util.ArrayList<android.os.Bundle> toBundleArrayList(java.util.Collection<T> collection) {
        java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>(collection.size());
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }

    public static <T extends com.google.android.exoplayer2.Bundleable> android.util.SparseArray<T> fromBundleSparseArray(com.google.android.exoplayer2.Bundleable.Creator<T> creator, android.util.SparseArray<android.os.Bundle> sparseArray) {
        android.util.SparseArray<T> sparseArray2 = new android.util.SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), creator.fromBundle(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    public static <T extends com.google.android.exoplayer2.Bundleable> android.util.SparseArray<android.os.Bundle> toBundleSparseArray(android.util.SparseArray<T> sparseArray) {
        android.util.SparseArray<android.os.Bundle> sparseArray2 = new android.util.SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i).toBundle());
        }
        return sparseArray2;
    }

    public static void ensureClassLoader(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((java.lang.ClassLoader) com.google.android.exoplayer2.util.Util.castNonNull(com.google.android.exoplayer2.util.BundleableUtil.class.getClassLoader()));
        }
    }

    private BundleableUtil() {
    }
}
