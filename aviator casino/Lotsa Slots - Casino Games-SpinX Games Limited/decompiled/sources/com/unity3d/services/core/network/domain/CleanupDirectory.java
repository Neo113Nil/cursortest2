package com.unity3d.services.core.network.domain;

/* compiled from: CleanupDirectory.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086\u0002¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "", "()V", "invoke", "", "directory", "Ljava/io/File;", "sizeLimitMb", "", "ageLimitMs", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CleanupDirectory {
    public final void invoke(java.io.File directory, int sizeLimitMb, long ageLimitMs) {
        java.util.List list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directory, "directory");
        if (!directory.exists() || !directory.isDirectory()) {
            throw new java.lang.IllegalArgumentException(("Directory does not exist or is not a directory: " + directory).toString());
        }
        java.lang.Object obj = null;
        kotlin.sequences.Sequence filter = kotlin.sequences.SequencesKt.filter(kotlin.io.FilesKt.walk$default(directory, null, 1, null), com.unity3d.services.core.network.domain.CleanupDirectory$invoke$cachedFiles$1.INSTANCE);
        java.util.Iterator it = filter.iterator();
        long j = 0;
        long j2 = 0;
        while (it.hasNext()) {
            j2 += ((java.io.File) it.next()).length();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : filter) {
            if (((java.io.File) obj2).lastModified() + ageLimitMs < currentTimeMillis) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        kotlin.Pair pair = new kotlin.Pair(arrayList, arrayList2);
        java.util.List list2 = (java.util.List) pair.component1();
        java.util.List list3 = (java.util.List) pair.component2();
        java.util.List list4 = list2;
        java.util.Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            j += ((java.io.File) it2.next()).length();
        }
        long j3 = j2 - j;
        java.util.Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            ((java.io.File) it3.next()).delete();
        }
        long j4 = 1048576 * sizeLimitMb;
        if (j3 > j4) {
            java.util.Iterator it4 = kotlin.sequences.SequencesKt.runningFold(kotlin.sequences.SequencesKt.sortedWith(kotlin.collections.CollectionsKt.asSequence(list3), new java.util.Comparator() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((java.io.File) t).lastModified()), java.lang.Long.valueOf(((java.io.File) t2).lastModified()));
                }
            }), kotlin.TuplesKt.to(java.lang.Long.valueOf(j3), kotlin.collections.CollectionsKt.emptyList()), new kotlin.jvm.functions.Function2<kotlin.Pair<? extends java.lang.Long, ? extends java.util.List<? extends java.io.File>>, java.io.File, kotlin.Pair<? extends java.lang.Long, ? extends java.util.List<? extends java.io.File>>>() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$additionalFiles$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Pair<? extends java.lang.Long, ? extends java.util.List<? extends java.io.File>> invoke(kotlin.Pair<? extends java.lang.Long, ? extends java.util.List<? extends java.io.File>> pair2, java.io.File file) {
                    return invoke2((kotlin.Pair<java.lang.Long, ? extends java.util.List<? extends java.io.File>>) pair2, file);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final kotlin.Pair<java.lang.Long, java.util.List<java.io.File>> invoke2(kotlin.Pair<java.lang.Long, ? extends java.util.List<? extends java.io.File>> pair2, java.io.File file) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair2, "<name for destructuring parameter 0>");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
                    return kotlin.TuplesKt.to(java.lang.Long.valueOf(pair2.component1().longValue() - file.length()), kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.io.File>) pair2.component2(), file));
                }
            }).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                java.lang.Object next = it4.next();
                if (((java.lang.Number) ((kotlin.Pair) next).component1()).longValue() <= j4) {
                    obj = next;
                    break;
                }
            }
            kotlin.Pair pair2 = (kotlin.Pair) obj;
            if (pair2 != null && (list = (java.util.List) pair2.component2()) != null) {
                list3 = list;
            }
            java.util.Iterator it5 = list3.iterator();
            while (it5.hasNext()) {
                ((java.io.File) it5.next()).delete();
            }
        }
    }
}
