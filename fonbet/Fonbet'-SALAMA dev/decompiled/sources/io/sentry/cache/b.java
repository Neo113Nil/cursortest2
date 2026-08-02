package io.sentry.cache;

import java.io.File;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$sortFilesOldestToNewest$1;
        lambda$sortFilesOldestToNewest$1 = CacheStrategy.lambda$sortFilesOldestToNewest$1((File) obj, (File) obj2);
        return lambda$sortFilesOldestToNewest$1;
    }
}
