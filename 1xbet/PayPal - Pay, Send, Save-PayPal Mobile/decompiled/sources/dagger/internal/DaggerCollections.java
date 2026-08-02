package dagger.internal;

/* loaded from: classes17.dex */
public final class DaggerCollections {
    private DaggerCollections() {
    }

    public static <T> java.util.List<T> presizedList(int i) {
        if (i == 0) {
            return java.util.Collections.emptyList();
        }
        return new java.util.ArrayList(i);
    }

    public static <T> boolean hasDuplicates(java.util.List<T> list) {
        if (list.size() < 2) {
            return false;
        }
        return list.size() != new java.util.HashSet(list).size();
    }

    static <T> java.util.HashSet<T> getHighSpeedVideoSizes(int i) {
        return new java.util.HashSet<>(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    public static <K, V> java.util.LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i) {
        return new java.util.LinkedHashMap<>(i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }
}
