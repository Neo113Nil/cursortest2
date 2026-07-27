package com.unity3d.services.core.network.domain;

import com.unity3d.ads.core.log.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: CleanupDirectory.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lcom/unity3d/ads/core/log/Logger;)V", "invoke", "", "directory", "Ljava/io/File;", "sizeLimitMb", "", "ageLimitMs", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CleanupDirectory {
    private final Logger logger;

    public CleanupDirectory(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
    }

    public final void invoke(File directory, int sizeLimitMb, long ageLimitMs) {
        List list;
        Intrinsics.checkNotNullParameter(directory, "directory");
        if (!directory.exists() || !directory.isDirectory()) {
            this.logger.debug("Directory does not exist or is not a directory: " + directory + ", nothing to clean up.");
            return;
        }
        Object obj = null;
        Sequence filter = SequencesKt.filter(FilesKt.walk$default(directory, null, 1, null), CleanupDirectory$invoke$cachedFiles$1.INSTANCE);
        Iterator it = filter.iterator();
        long j = 0;
        long j2 = 0;
        while (it.hasNext()) {
            j2 += ((File) it.next()).length();
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : filter) {
            if (((File) obj2).lastModified() + ageLimitMs < currentTimeMillis) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.component1();
        List list3 = (List) pair.component2();
        List list4 = list2;
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            j += ((File) it2.next()).length();
        }
        long j3 = j2 - j;
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            ((File) it3.next()).delete();
        }
        long j4 = 1048576 * sizeLimitMb;
        if (j3 > j4) {
            Iterator it4 = SequencesKt.runningFold(SequencesKt.sortedWith(CollectionsKt.asSequence(list3), new Comparator() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((File) t).lastModified()), Long.valueOf(((File) t2).lastModified()));
                }
            }), TuplesKt.to(Long.valueOf(j3), CollectionsKt.emptyList()), new Function2() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Pair invoke$lambda$3;
                    invoke$lambda$3 = CleanupDirectory.invoke$lambda$3((Pair) obj3, (File) obj4);
                    return invoke$lambda$3;
                }
            }).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next = it4.next();
                if (((Number) ((Pair) next).component1()).longValue() <= j4) {
                    obj = next;
                    break;
                }
            }
            Pair pair2 = (Pair) obj;
            if (pair2 != null && (list = (List) pair2.component2()) != null) {
                list3 = list;
            }
            Iterator it5 = list3.iterator();
            while (it5.hasNext()) {
                ((File) it5.next()).delete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair invoke$lambda$3(Pair pair, File file) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        Intrinsics.checkNotNullParameter(file, "file");
        return TuplesKt.to(Long.valueOf(((Number) pair.component1()).longValue() - file.length()), CollectionsKt.plus((Collection<? extends File>) pair.component2(), file));
    }
}
