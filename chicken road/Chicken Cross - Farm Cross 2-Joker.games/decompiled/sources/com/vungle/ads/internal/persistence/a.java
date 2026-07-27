package com.vungle.ads.internal.persistence;

import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.util.PathProvider;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a {
    public final synchronized FilePreferences a(j ioExecutor, PathProvider pathProvider, String filename) {
        ConcurrentHashMap concurrentHashMap;
        Object obj;
        Object putIfAbsent;
        Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(filename, "filename");
        concurrentHashMap = FilePreferences.e;
        obj = concurrentHashMap.get(filename);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(filename, (obj = new FilePreferences(ioExecutor, pathProvider, filename, 0)))) != null) {
            obj = putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "filePreferenceMap.getOrP…, filename)\n            }");
        return (FilePreferences) obj;
    }
}
