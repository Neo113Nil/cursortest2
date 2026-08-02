package androidx.media3.muxer;

/* loaded from: classes3.dex */
public final /* synthetic */ class AacWriter$$ExternalSyntheticBackport0 {
    public static /* synthetic */ java.util.List m(java.util.Collection collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(java.util.Objects.requireNonNull(it.next()));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ java.util.List m(java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            arrayList.add(java.util.Objects.requireNonNull(obj));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ java.util.Map.Entry m9178m(java.lang.Object obj, java.lang.Object obj2) {
        return new java.util.AbstractMap.SimpleImmutableEntry(java.util.Objects.requireNonNull(obj), java.util.Objects.requireNonNull(obj2));
    }

    public static /* synthetic */ java.util.Map m(java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            hashMap.put(java.util.Objects.requireNonNull(entry.getKey()), java.util.Objects.requireNonNull(entry.getValue()));
        }
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ java.util.Set m9180m(java.util.Collection collection) {
        java.util.HashSet hashSet = new java.util.HashSet(collection.size());
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(java.util.Objects.requireNonNull(it.next()));
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ java.util.Set m9181m(java.lang.Object[] objArr) {
        java.util.HashSet hashSet = new java.util.HashSet(objArr.length);
        for (java.lang.Object obj : objArr) {
            if (!hashSet.add(java.util.Objects.requireNonNull(obj))) {
                throw new java.lang.IllegalArgumentException("duplicate element: ".concat(java.lang.String.valueOf(obj)));
            }
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m9182m(java.lang.Object obj) {
        if (obj instanceof java.lang.AutoCloseable) {
            ((java.lang.AutoCloseable) obj).close();
            return;
        }
        if (obj instanceof java.util.concurrent.ExecutorService) {
            m((java.util.concurrent.ExecutorService) obj);
            return;
        }
        if (obj instanceof android.content.res.TypedArray) {
            ((android.content.res.TypedArray) obj).recycle();
            return;
        }
        if (obj instanceof android.media.MediaMetadataRetriever) {
            ((android.media.MediaMetadataRetriever) obj).release();
        } else if (obj instanceof android.media.MediaDrm) {
            ((android.media.MediaDrm) obj).release();
        } else {
            m$1(obj);
        }
    }

    public static /* synthetic */ void m(java.util.concurrent.ExecutorService executorService) {
        boolean isTerminated;
        if (executorService == java.util.concurrent.ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, java.util.concurrent.TimeUnit.DAYS);
            } catch (java.lang.InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ boolean m(java.lang.String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (!java.lang.Character.isWhitespace(codePointAt)) {
                return false;
            }
            i += java.lang.Character.charCount(codePointAt);
        }
        return true;
    }

    public static /* synthetic */ void m$1(java.lang.Object obj) {
        throw new java.lang.IllegalArgumentException();
    }
}
